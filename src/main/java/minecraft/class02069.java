package minecraft;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class02069 implements JsonDeserializer<class02081> {
   private static final boolean N = true;
   private static final int y = 0;
   private static final String L = "shade";
   private static final String u = "light_emission";
   private static final String i = "rotation";
   private static final String R = "origin";
   private static final String M = "angle";
   private static final String B = "x";
   private static final String Z = "y";
   private static final String z = "z";
   private static final String U = "axis";
   private static final String E = "rescale";
   private static final String W = "faces";
   private static final String m = "to";
   private static final String P = "from";

   public class02069() {
      super();
   }

   private static Vector3f y(JsonObject var0, String var1) {
      JsonArray jsonarray = class05001.t(var0, var1);
      if (jsonarray.size() != 3) {
         throw new JsonParseException("Expected 3 " + var1 + " values, found: " + jsonarray.size());
      } else {
         float[] afloat = new float[3];

         for (int ix = 0; ix < afloat.length; ix++) {
            afloat[ix] = class05001.i(jsonarray.get(ix), var1 + "[" + ix + "]");
         }

         return new Vector3f(afloat[0], afloat[1], afloat[2]);
      }
   }

   private class07185 y(JsonObject var1) {
      String s = class05001.Z(var1, "axis");
      class07185 class07185 = class07185.N(s.toLowerCase(Locale.ROOT));
      if (class07185 == null) {
         throw new JsonParseException("Invalid rotation axis: " + s);
      } else {
         return class07185;
      }
   }

   private Map<class07211, class02067> y(JsonDeserializationContext var1, JsonObject var2) {
      EnumMap enummap = Maps.newEnumMap(class07211.class);

      for (Entry entry : class05001.n(var2, "faces").entrySet()) {
         class07211 class07211 = this.N((String)entry.getKey());
         enummap.put(class07211, (class02067)var1.deserialize((JsonElement)entry.getValue(), class02067.class));
      }

      return enummap;
   }

   private static Vector3f N(JsonObject var0, String var1) {
      Vector3f vector3f = y(var0, var1);
      if (!(vector3f.x() < -16.0F)
         && !(vector3f.y() < -16.0F)
         && !(vector3f.z() < -16.0F)
         && !(vector3f.x() > 32.0F)
         && !(vector3f.y() > 32.0F)
         && !(vector3f.z() > 32.0F)) {
         return vector3f;
      } else {
         throw new JsonParseException("'" + var1 + "' specifier exceeds the allowed boundaries: " + vector3f);
      }
   }

   @Nullable
   private class04120 N(JsonObject var1) {
      if (!var1.has("rotation")) {
         return null;
      } else {
         JsonObject jsonobject = class05001.n(var1, "rotation");
         Vector3f vector3f = y(jsonobject, "origin");
         vector3f.mul(0.0625F);
         Object object;
         if (!jsonobject.has("axis") && !jsonobject.has("angle")) {
            if (!jsonobject.has("x") && !jsonobject.has("y") && !jsonobject.has("z")) {
               throw new JsonParseException("Missing rotation value, expected either 'axis' and 'angle' or 'x', 'y' and 'z'");
            }

            float f2 = class05001.N(jsonobject, "x", 0.0F);
            float f3 = class05001.N(jsonobject, "y", 0.0F);
            float f1 = class05001.N(jsonobject, "z", 0.0F);
            object = new class04108(f2, f3, f1);
         } else {
            class07185 class07185 = this.y(jsonobject);
            float f = class05001.W(jsonobject, "angle");
            object = new class04136(class07185, f);
         }

         boolean flag = class05001.N(jsonobject, "rescale", false);
         return new class04120(vector3f, (class04122)object, flag);
      }
   }

   private class07211 N(String var1) {
      class07211 class07211 = class07211.N(var1);
      if (class07211 == null) {
         throw new JsonParseException("Unknown facing: " + var1);
      } else {
         return class07211;
      }
   }

   public class02081 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = var1.getAsJsonObject();
      Vector3f vector3f = N(jsonobject, "from");
      Vector3f vector3f1 = N(jsonobject, "to");
      class04120 class04120 = this.N(jsonobject);
      Map<class07211, class02067> map = this.N(var3, jsonobject);
      if (jsonobject.has("shade") && !class05001.L(jsonobject, "shade")) {
         throw new JsonParseException("Expected 'shade' to be a Boolean");
      } else {
         boolean flag = class05001.N(jsonobject, "shade", true);
         int ix = 0;
         if (jsonobject.has("light_emission")) {
            boolean flag1 = class05001.y(jsonobject, "light_emission");
            if (flag1) {
               ix = class05001.P(jsonobject, "light_emission");
            }

            if (!flag1 || ix < 0 || ix > 15) {
               throw new JsonParseException("Expected 'light_emission' to be an Integer between (inclusive) 0 and 15");
            }
         }

         return new class02081(vector3f, vector3f1, map, class04120, flag, ix);
      }
   }

   private Map<class07211, class02067> N(JsonDeserializationContext var1, JsonObject var2) {
      Map<class07211, class02067> map = this.y(var1, var2);
      if (map.isEmpty()) {
         throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
      } else {
         return map;
      }
   }
}
