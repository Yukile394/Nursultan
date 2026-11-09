package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class class02910 implements class07126 {
   public static final float i = 0.01F;
   public static final float R = 4.0F;
   protected static final Codec<Float> M = Codec.FLOAT
      .validate(var0 -> var0 >= 0.01F && var0 <= 4.0F ? DataResult.success(var0) : DataResult.error(() -> "Value must be within range [0.01;4.0]: " + var0));
   private final float N;

   public float L() {
      return this.N;
   }

   public class02910(float var1) {
      super();
      this.N = class04995.N(var1, 0.01F, 4.0F);
   }
}
