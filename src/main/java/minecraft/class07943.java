package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public record class07943<Params, Result>(class07931<Params, Result> info, class07946 attributes, class07929<Params, Result> function)
   implements class07945<Params, Result> {
   public class07929<Params, Result> L() {
      return this.function;
   }

   public class07943(class07931<Params, Result> info, class07946 attributes, class07929<Params, Result> function) {
      super();
      this.info = info;
      this.attributes = attributes;
      this.function = function;
   }

   @Override
   public class07946 y() {
      return this.attributes;
   }

   @Override
   public class07931<Params, Result> N() {
      return this.info;
   }

   @Override
   public JsonElement N(class07393 var1, @Nullable JsonElement var2, class07403 var3) {
      if (var2 != null && (var2.isJsonArray() || var2.isJsonObject())) {
         if (this.info.L().isEmpty()) {
            throw new IllegalArgumentException("Method defined as having parameters without describing them");
         } else {
            JsonElement jsonelement;
            if (var2.isJsonObject()) {
               String s = this.info.L().get().y();
               JsonElement jsonelement1 = var2.getAsJsonObject().get(s);
               if (jsonelement1 == null) {
                  throw new class07400(String.format(Locale.ROOT, "Params passed by-name, but expected param [%s] does not exist", s));
               }

               jsonelement = jsonelement1;
            } else {
               JsonArray jsonarray = var2.getAsJsonArray();
               if (jsonarray.isEmpty() || jsonarray.size() > 1) {
                  throw new class07400("Expected exactly one element in the params array");
               }

               jsonelement = jsonarray.get(0);
            }

            Object object = this.info.L().get().L().z().parse(JsonOps.INSTANCE, jsonelement).getOrThrow(class07400::new);
            Object object1 = this.function.apply(var1, (Params)object, var3);
            if (this.info.u().isEmpty()) {
               throw new IllegalStateException("No result codec defined");
            } else {
               return (JsonElement)this.info.u().get().L().z().encodeStart(JsonOps.INSTANCE, object1).getOrThrow(class07412::new);
            }
         }
      } else {
         throw new class07400("Expected params as array or named");
      }
   }
}
