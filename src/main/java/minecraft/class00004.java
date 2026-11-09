package minecraft;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.Validate;

public class class00004 implements JsonDeserializer<class00012> {
   private static final class06052 N = class06042.N(1.0F);

   public class00004() {
      super();
   }

   private class00002 y(JsonObject var1) {
      class01894 class01894 = class01894.N(class05001.Z(var1, "name"));
      class00022 class00022 = this.N(var1, class00022.field_5474);
      float f = class05001.N(var1, "volume", 1.0F);
      Validate.isTrue(f > 0.0F, "Invalid volume", new Object[0]);
      float f1 = class05001.N(var1, "pitch", 1.0F);
      Validate.isTrue(f1 > 0.0F, "Invalid pitch", new Object[0]);
      int i = class05001.N(var1, "weight", 1);
      Validate.isTrue(i > 0, "Invalid weight", new Object[0]);
      boolean flag = class05001.N(var1, "preload", false);
      boolean flag1 = class05001.N(var1, "stream", false);
      int j = class05001.N(var1, "attenuation_distance", 16);
      return new class00002(class01894, class06042.N(f), class06042.N(f1), i, class00022, flag1, flag, j);
   }

   private List<class00002> N(JsonObject var1) {
      ArrayList arraylist = Lists.newArrayList();
      if (var1.has("sounds")) {
         JsonArray jsonarray = class05001.t(var1, "sounds");

         for (int i = 0; i < jsonarray.size(); i++) {
            JsonElement jsonelement = jsonarray.get(i);
            if (class05001.N(jsonelement)) {
               class01894 class01894 = class01894.N(class05001.N(jsonelement, "sound"));
               arraylist.add(new class00002(class01894, N, N, 1, class00022.field_5474, false, false, 16));
            } else {
               arraylist.add(this.y(class05001.W(jsonelement, "sound")));
            }
         }
      }

      return arraylist;
   }

   public class00012 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = class05001.W(var1, "entry");
      boolean flag = class05001.N(jsonobject, "replace", false);
      String s = class05001.N(jsonobject, "subtitle", null);
      List<class00002> list = this.N(jsonobject);
      return new class00012(list, flag, s);
   }

   private class00022 N(JsonObject var1, class00022 var2) {
      class00022 class00022 = var2;
      if (var1.has("type")) {
         class00022 = class00022.N(class05001.Z(var1, "type"));
         Objects.requireNonNull(class00022, "Invalid type");
      }

      return class00022;
   }
}
