package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.joml.Vector3f;

public class class03273 implements JsonDeserializer<class03265> {
   private static final Vector3f L = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f u = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f i = new Vector3f(1.0F, 1.0F, 1.0F);
   public static final float N = 5.0F;
   public static final float y = 4.0F;

   public class03273() {
      super();
   }

   public class03265 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = var1.getAsJsonObject();
      Vector3f vector3f = this.N(jsonobject, "rotation", L);
      Vector3f vector3f1 = this.N(jsonobject, "translation", u);
      vector3f1.mul(0.0625F);
      vector3f1.set(class04995.N(vector3f1.x, -5.0F, 5.0F), class04995.N(vector3f1.y, -5.0F, 5.0F), class04995.N(vector3f1.z, -5.0F, 5.0F));
      Vector3f vector3f2 = this.N(jsonobject, "scale", i);
      vector3f2.set(class04995.N(vector3f2.x, -4.0F, 4.0F), class04995.N(vector3f2.y, -4.0F, 4.0F), class04995.N(vector3f2.z, -4.0F, 4.0F));
      return new class03265(vector3f, vector3f1, vector3f2);
   }

   private Vector3f N(JsonObject var1, String var2, Vector3f var3) {
      if (!var1.has(var2)) {
         return var3;
      } else {
         JsonArray jsonarray = class05001.t(var1, var2);
         if (jsonarray.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + jsonarray.size());
         } else {
            float[] afloat = new float[3];

            for (int ix = 0; ix < afloat.length; ix++) {
               afloat[ix] = class05001.i(jsonarray.get(ix), var2 + "[" + ix + "]");
            }

            return new Vector3f(afloat[0], afloat[1], afloat[2]);
         }
      }
   }
}
