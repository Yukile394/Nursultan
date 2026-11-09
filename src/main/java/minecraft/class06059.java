package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06059 extends class06052 {
   public static final MapCodec<class06059> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(Codec.FLOAT.fieldOf("min_inclusive").forGetter(var0x -> var0x.y), Codec.FLOAT.fieldOf("max_exclusive").forGetter(var0x -> var0x.u))
            .apply(var0, class06059::new)
      )
      .validate(
         var0 -> var0.u <= var0.y
            ? DataResult.error(() -> "Max must be larger than min, min_inclusive: " + var0.y + ", max_exclusive: " + var0.u)
            : DataResult.success(var0)
      );
   private final float y;
   private final float u;

   @Override
   public class06061<?> L() {
      return class06061.y;
   }

   private class06059(float var1, float var2) {
      super();
      this.y = var1;
      this.u = var2;
   }

   @Override
   public String toString() {
      return "[" + this.y + "-" + this.u + "]";
   }

   @Override
   public float y() {
      return this.u;
   }

   public static class06059 y(float var0, float var1) {
      if (var1 <= var0) {
         throw new IllegalArgumentException("Max must exceed min");
      } else {
         return new class06059(var0, var1);
      }
   }

   @Override
   public float N() {
      return this.y;
   }

   @Override
   public float N(class06069 var1) {
      return class04995.y(var1, this.y, this.u);
   }
}
