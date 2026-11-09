package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01697 extends class02142 {
   public static final MapCodec<class01697> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(Codec.INT.fieldOf("min_inclusive").forGetter(var0x -> var0x.y), Codec.INT.fieldOf("max_inclusive").forGetter(var0x -> var0x.R))
            .apply(var0, class01697::new)
      )
      .validate(
         var0 -> var0.R < var0.y
            ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + var0.y + ", max_inclusive: " + var0.R)
            : DataResult.success(var0)
      );
   private final int y;
   private final int R;

   @Override
   public int L() {
      return this.R;
   }

   private class01697(int var1, int var2) {
      super();
      this.y = var1;
      this.R = var2;
   }

   @Override
   public String toString() {
      return "[" + this.y + "-" + this.R + "]";
   }

   @Override
   public class02139<?> u() {
      return class02139.L;
   }

   public static class01697 y(int var0, int var1) {
      return new class01697(var0, var1);
   }

   @Override
   public int y() {
      return this.y;
   }

   @Override
   public int N(class06069 var1) {
      return this.y + var1.y(var1.y(this.R - this.y + 1) + 1);
   }
}
