package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;

class class01721 implements Codec<class00392> {
   class01721(int var1) {
      super();
      this.N = var1;
   }

   public <T> DataResult<Pair<class00392, T>> decode(DynamicOps<T> var1, T var2) {
      return class03748.N
         .decode(var1, var2)
         .flatMap(
            var3 -> this.N(var1, (class00392)var3.getFirst())
               ? DataResult.error(() -> "Component was too large: greater than max size " + var2x)
               : DataResult.success(var3)
         );
   }

   private static <T> DynamicOps<JsonElement> N(DynamicOps<T> var0) {
      return (DynamicOps<JsonElement>)(var0 instanceof class03519 ? ((class03519)var0).N(JsonOps.INSTANCE) : JsonOps.INSTANCE);
   }

   private <T> boolean N(DynamicOps<T> var1, class00392 var2) {
      DataResult<JsonElement> dataresult = class03748.N.encodeStart(N(var1), var2);
      return dataresult.isSuccess() && class05001.N((JsonElement)dataresult.getOrThrow(), this.N);
   }

   public <T> DataResult<T> encode(class00392 var1, DynamicOps<T> var2, T var3) {
      return class03748.N.encodeStart(var2, var1);
   }
}
