package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public final class class07571 implements class07586 {
   public static final Codec<class07571> q = RecordCodecBuilder.create(
      var0 -> var0.group(class07602.i.fieldOf("cubic_bezier").forGetter(var0x -> var0x.V)).apply(var0, class07571::new)
   );
   private static final int K = 4;
   private final class07602 V;
   private final class07588 e;
   private final class07588 H;

   public class07571(class07602 var1) {
      super();
      this.V = var1;
      this.e = y(var1.N(), var1.L());
      this.H = y(var1.y(), var1.u());
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class07571 class07571 && this.V.equals(class07571.V);
   }

   @Override
   public String toString() {
      return "CubicBezier(" + this.V.N() + ", " + this.V.y() + ", " + this.V.L() + ", " + this.V.u() + ")";
   }

   @Override
   public int hashCode() {
      return this.V.hashCode();
   }

   @Override
   public float apply(float var1) {
      float f = var1;

      for (int i = 0; i < 4; i++) {
         float f1 = this.e.y(f);
         if (f1 < 1.0E-5F) {
            break;
         }

         float f2 = this.e.N(f) - var1;
         f -= f2 / f1;
      }

      return this.H.N(f);
   }

   private static class07588 y(float var0, float var1) {
      return new class07588(3.0F * var0 - 3.0F * var1 + 1.0F, -6.0F * var0 + 3.0F * var1, 3.0F * var0);
   }
}
