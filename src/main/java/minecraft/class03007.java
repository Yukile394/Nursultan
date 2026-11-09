package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03007 extends class02142 {
   public static final MapCodec<class03007> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.FLOAT.fieldOf("mean").forGetter(var0x -> var0x.y),
               Codec.FLOAT.fieldOf("deviation").forGetter(var0x -> var0x.R),
               Codec.INT.fieldOf("min_inclusive").forGetter(var0x -> var0x.M),
               Codec.INT.fieldOf("max_inclusive").forGetter(var0x -> var0x.B)
            )
            .apply(var0, class03007::new)
      )
      .validate(var0 -> var0.B < var0.M ? DataResult.error(() -> "Max must be larger than min: [" + var0.M + ", " + var0.B + "]") : DataResult.success(var0));
   private final float y;
   private final float R;
   private final int M;
   private final int B;

   @Override
   public int L() {
      return this.B;
   }

   private class03007(float var1, float var2, int var3, int var4) {
      super();
      this.y = var1;
      this.R = var2;
      this.M = var3;
      this.B = var4;
   }

   @Override
   public String toString() {
      return "normal(" + this.y + ", " + this.R + ") in [" + this.M + "-" + this.B + "]";
   }

   @Override
   public class02139<?> u() {
      return class02139.R;
   }

   @Override
   public int y() {
      return this.M;
   }

   public static class03007 N(float var0, float var1, int var2, int var3) {
      return new class03007(var0, var1, var2, var3);
   }

   @Override
   public int N(class06069 var1) {
      return N(var1, this.y, this.R, this.M, this.B);
   }

   public static int N(class06069 var0, float var1, float var2, float var3, float var4) {
      return (int)class04995.N(class04995.L(var0, var1, var2), var3, var4);
   }
}
