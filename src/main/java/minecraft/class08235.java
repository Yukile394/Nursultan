package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08235(float diameter) implements class08200 {
   private static final float R = 16.0F;
   public static final MapCodec<class08235> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.t.optionalFieldOf("diameter", 16.0F).forGetter(class08235::y)).apply(var0, class08235::new)
   );
   public static final class02362<class04247, class08235> y = class02362.N(class02389.E, class08235::y, class08235::new);

   public class08235() {
      this(16.0F);
   }

   public class08235(float diameter) {
      super();
      this.diameter = diameter;
   }

   public float y() {
      return this.diameter;
   }

   @Override
   public boolean N(class07299 var1, class06584 var2, class07438 var3) {
      boolean flag = false;

      for (int i = 0; i < 16; i++) {
         double d0 = var3.method_23317() + (var3.method_59922().U() - 0.5) * this.diameter;
         double d1 = class04995.N(
            var3.method_23318() + (var3.method_59922().U() - 0.5) * this.diameter,
            (double)var1.method_31607(),
            (double)(var1.method_31607() + ((class04782)var1).method_32819() - 1)
         );
         double d2 = var3.method_23321() + (var3.method_59922().U() - 0.5) * this.diameter;
         if (var3.method_5765()) {
            var3.method_5848();
         }

         class06889 class06889 = var3.method_73189();
         if (var3.method_6082(d0, d1, d2, true)) {
            var1.method_32888(class01194.F, class06889, class01164.N(var3));
            class04911 class04911;
            class04891 class04891;
            if (var3 instanceof class06165) {
               class04891 = class04909.Eu;
               class04911 = class04911.field_15254;
            } else {
               class04891 = class04909.Rq;
               class04911 = class04911.field_15248;
            }

            var1.method_54762(null, var3.method_23317(), var3.method_23318(), var3.method_23321(), class04891, class04911);
            var3.method_38785();
            flag = true;
            break;
         }
      }

      if (flag && var3 instanceof class08036 class08036) {
         class08036.method_58396();
      }

      return flag;
   }

   @Override
   public class08217<class08235> N() {
      return class08217.u;
   }
}
