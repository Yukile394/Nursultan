package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01684 extends class02142 {
   public static final MapCodec<class01684> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class02142.L.fieldOf("source").forGetter(var0x -> var0x.y),
               Codec.INT.fieldOf("min_inclusive").forGetter(var0x -> var0x.R),
               Codec.INT.fieldOf("max_inclusive").forGetter(var0x -> var0x.M)
            )
            .apply(var0, class01684::new)
      )
      .validate(
         var0 -> var0.M < var0.R
            ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + var0.R + ", max_inclusive: " + var0.M)
            : DataResult.success(var0)
      );
   private final class02142 y;
   private final int R;
   private final int M;

   @Override
   public int L() {
      return Math.min(this.M, this.y.L());
   }

   public class01684(class02142 var1, int var2, int var3) {
      super();
      this.y = var1;
      this.R = var2;
      this.M = var3;
   }

   @Override
   public class02139<?> u() {
      return class02139.u;
   }

   @Override
   public int y() {
      return Math.max(this.R, this.y.y());
   }

   public static class01684 N(class02142 var0, int var1, int var2) {
      return new class01684(var0, var1, var2);
   }

   @Override
   public int N(class06069 var1) {
      return class04995.N(this.y.N(var1), this.R, this.M);
   }
}
