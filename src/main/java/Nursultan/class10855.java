package Nursultan;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import minecraft.class07924;
import minecraft.class07931;
import minecraft.class07940;

public record class10855<Result>(class07931<Void, Result> info, class07924 attributes) implements class07940<Void, Result> {
   public class10855(class07931<Void, Result> info, class07924 attributes) {
      this.info = info;
      this.attributes = attributes;
   }

   @Override
   public class07924 y() {
      return this.attributes;
   }

   @Override
   public class07931<Void, Result> N() {
      return this.info;
   }

   @Override
   public Result N(JsonElement var1) {
      if (this.info.u().isEmpty()) {
         throw new IllegalStateException("Method defined as having no result");
      } else {
         return (Result)this.info.u().get().L().z().parse(JsonOps.INSTANCE, var1).getOrThrow();
      }
   }
}
