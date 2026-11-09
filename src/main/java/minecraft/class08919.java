package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class08919 extends class00343 {
   public static final MapCodec<class08919> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(class00343::y), class08934.field_55393.fieldOf("target").forGetter(class08919::N))
         .apply(var0, class08919::new)
   );
   private final class00373 y;
   private final class00373 L;
   private final class08934 u;
   private final class06069 i = class06069.u();

   public class08919(boolean var1, class08934 var2) {
      super(var1);
      this.y = this.N(0.8F);
      this.L = this.N(0.8F);
      this.u = var2;
   }

   private static float N(class08961 var0) {
      return class04995.L(var0.method_73188() / 360.0F, 1.0F);
   }

   private static int N(int var0) {
      return var0 * 1327217883;
   }

   protected class08934 N() {
      return this.u;
   }

   private static double N(class08961 var0, class07209 var1) {
      class06889 class06889x = class06889.y(var1);
      class06889 class06889x = var0.method_73189();
      return Math.atan2(class06889x.L() - class06889x.L(), class06889x.N() - class06889x.N()) / (float) (Math.PI * 2);
   }

   private float N(int var1, long var2) {
      if (this.L.N(var2)) {
         this.L.N(var2, this.i.z());
      }

      return class04995.L(this.L.N() + N(var1) / 2.1474836E9F, 1.0F);
   }

   private float N(class08961 var1, long var2, class07209 var4) {
      float f = (float)N(var1, var4);
      float f1 = N(var1);
      float f2;
      if (var1.method_72393() instanceof class08036 class08036 && class08036.method_7340() && class08036.method_73183().method_54719().Z()) {
         if (this.y.N(var2)) {
            this.y.N(var2, 0.5F - (f1 - 0.25F));
         }

         f2 = f + this.y.N();
      } else {
         f2 = 0.5F - (f1 - 0.25F - f);
      }

      return class04995.L(f2, 1.0F);
   }

   private static boolean N(class08961 var0, @Nullable class06289 var1) {
      return var1 != null && var1.N() == var0.method_73183().method_27983() && !(var1.y().method_19770(var0.method_73189()) < 1.0E-5F);
   }

   @Override
   protected float N(class06584 var1, class03448 var2, int var3, class08961 var4) {
      class06289 class06289 = this.u.N(var2, var1, var4);
      long ix = var2.N();
      return !N(var4, class06289) ? this.N(var3, ix) : this.N(var4, ix, class06289.y());
   }
}
