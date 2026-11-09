package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import org.jspecify.annotations.Nullable;

public record class07912<Params, Result>(class07931<Params, Result> info, class07924 attributes) implements class07940<Params, Result> {
   public class07912(class07931<Params, Result> info, class07924 attributes) {
      this.info = info;
      this.attributes = attributes;
   }

   @Override
   public class07924 y() {
      return this.attributes;
   }

   @Override
   public Result N(JsonElement var1) {
      if (this.info.u().isEmpty()) {
         throw new IllegalStateException("Method defined as having no result");
      } else {
         return (Result)this.info.u().get().L().z().parse(JsonOps.INSTANCE, var1).getOrThrow();
      }
   }

   @Override
   public class07931<Params, Result> N() {
      return this.info;
   }

   @Nullable
   @Override
   public JsonElement N(Params var1) {
      if (this.info.L().isEmpty()) {
         throw new IllegalStateException("Method defined as having no parameters");
      } else {
         return (JsonElement)this.info.L().get().L().z().encodeStart(JsonOps.INSTANCE, var1).getOrThrow();
      }
   }
}
