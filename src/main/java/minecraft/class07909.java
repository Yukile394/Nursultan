package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import org.jspecify.annotations.Nullable;

public record class07909<Params, Result>(class07931<Params, Result> info, class07946 attributes, class07936<Result> supplier)
   implements class07945<Params, Result> {
   public class07936<Result> L() {
      return this.supplier;
   }

   public class07909(class07931<Params, Result> info, class07946 attributes, class07936<Result> supplier) {
      this.info = info;
      this.attributes = attributes;
      this.supplier = supplier;
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
      if (var2 == null || var2.isJsonArray() && var2.getAsJsonArray().isEmpty()) {
         if (this.info.L().isPresent()) {
            throw new IllegalArgumentException("Parameterless method unexpectedly has parameter description");
         } else {
            Object object = this.supplier.apply(var1, var3);
            if (this.info.u().isEmpty()) {
               throw new IllegalStateException("No result codec defined");
            } else {
               return (JsonElement)this.info.u().get().L().z().encodeStart(JsonOps.INSTANCE, object).getOrThrow(class07400::new);
            }
         }
      } else {
         throw new class07400("Expected no params, or an empty array");
      }
   }
}
