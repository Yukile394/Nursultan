package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06073 extends class06052 {
   public static final MapCodec<class06073> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.FLOAT.fieldOf("mean").forGetter(var0x -> var0x.y),
               Codec.FLOAT.fieldOf("deviation").forGetter(var0x -> var0x.u),
               Codec.FLOAT.fieldOf("min").forGetter(var0x -> var0x.i),
               Codec.FLOAT.fieldOf("max").forGetter(var0x -> var0x.R)
            )
            .apply(var0, class06073::new)
      )
      .validate(var0 -> var0.R < var0.i ? DataResult.error(() -> "Max must be larger than min: [" + var0.i + ", " + var0.R + "]") : DataResult.success(var0));
   private final float y;
   private final float u;
   private final float i;
   private final float R;

   @Override
   public class06061<?> L() {
      return class06061.L;
   }

   private class06073(float var1, float var2, float var3, float var4) {
      super();
      this.y = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   @Override
   public String toString() {
      return "normal(" + this.y + ", " + this.u + ") in [" + this.i + "-" + this.R + "]";
   }

   @Override
   public float y() {
      return this.R;
   }

   public static class06073 N(float var0, float var1, float var2, float var3) {
      return new class06073(var0, var1, var2, var3);
   }

   @Override
   public float N(class06069 var1) {
      return N(var1, this.y, this.u, this.i, this.R);
   }

   public static float N(class06069 var0, float var1, float var2, float var3, float var4) {
      return class04995.N(class04995.L(var0, var1, var2), var3, var4);
   }

   @Override
   public float N() {
      return this.i;
   }
}
