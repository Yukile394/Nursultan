package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06039 extends class06052 {
   public static final MapCodec<class06039> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               Codec.FLOAT.fieldOf("min").forGetter(var0x -> var0x.y),
               Codec.FLOAT.fieldOf("max").forGetter(var0x -> var0x.u),
               Codec.FLOAT.fieldOf("plateau").forGetter(var0x -> var0x.i)
            )
            .apply(var0, class06039::new)
      )
      .validate(
         var0 -> {
            if (var0.u < var0.y) {
               return DataResult.error(() -> "Max must be larger than min: [" + var0.y + ", " + var0.u + "]");
            } else {
               return var0.i > var0.u - var0.y
                  ? DataResult.error(() -> "Plateau can at most be the full span: [" + var0.y + ", " + var0.u + "]")
                  : DataResult.success(var0);
            }
         }
      );
   private final float y;
   private final float u;
   private final float i;

   @Override
   public class06061<?> L() {
      return class06061.u;
   }

   private class06039(float var1, float var2, float var3) {
      super();
      this.y = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   public String toString() {
      return "trapezoid(" + this.i + ") in [" + this.y + "-" + this.u + "]";
   }

   @Override
   public float y() {
      return this.u;
   }

   public static class06039 N(float var0, float var1, float var2) {
      return new class06039(var0, var1, var2);
   }

   @Override
   public float N(class06069 var1) {
      float f = this.u - this.y;
      float f1 = (f - this.i) / 2.0F;
      float f2 = f - f1;
      return this.y + var1.z() * f2 + var1.z() * f1;
   }

   @Override
   public float N() {
      return this.y;
   }
}
