package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class07728 extends class00864 implements class00873 {
   public static final MapCodec<class07728> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class05946.N(class04227.Z).fieldOf("fruit").forGetter(var0x -> var0x.i),
            class05946.N(class04227.Z).fieldOf("attached_stem").forGetter(var0x -> var0x.R),
            class05946.N(class04227.F).fieldOf("seed").forGetter(var0x -> var0x.M),
            t()
         )
         .apply(var0, class07728::new)
   );
   public static final int y = 7;
   public static final class08071 L = class06665.Nw;
   private static final class00494[] u = class00891.N(7, var0 -> class00891.y(2.0, 0.0, 2 + var0 * 2));
   private final class05946<class00891> i;
   private final class05946<class00891> R;
   private final class05946<class06581> M;

   public class07728(class05946<class00891> var1, class05946<class00891> var2, class05946<class06581> var3, class01362 var4) {
      super(var4);
      this.i = var1;
      this.R = var2;
      this.M = var3;
      this.P(this.Q.y().y(L, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_22335(var3, 0) >= 9) {
         float f = class06772.N(this, var2, var3);
         if (var4.y((int)(25.0F / f) + 1) == 0) {
            int ix = var1.L(L);
            if (ix < 7) {
               var1 = var1.y(L, ix + 1);
               var2.method_8652(var3, var1, 2);
            } else {
               class07211 class07211 = class07221.field_11062.N(var4);
               class07209 class07209 = var3.method_10093(class07211);
               class00500 class00500 = var2.method_8320(class07209.method_10074());
               if (var2.method_8320(class07209).P() && (class00500.N(class00869.Lr) || class00500.N(class01210.Ni))) {
                  class00751 class00751 = var2.method_30349().L(class04227.Z);
                  Optional optional = class00751.M(this.i);
                  Optional optional1 = class00751.M(this.R);
                  if (optional.isPresent() && optional1.isPresent()) {
                     var2.method_8501(class07209, ((class00891)optional.get()).W());
                     var2.method_8501(var3, ((class00891)optional1.get()).W().y(class07101.R, class07211));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public MapCodec<class07728> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u[var1.L(L)];
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class00869.Lr);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584((class07310)DataFixUtils.orElse(var1.method_30349().L(class04227.F).M(this.M), this));
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var3.L(L) != 7;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      int ix = Math.min(7, var4.L(L) + class04995.N(var1.field_9229, 2, 5));
      class00500 class00500 = var4.y(L, ix);
      var1.method_8652(var3, class00500, 2);
      if (ix == 7) {
         class00500.y(var1, var3, var1.field_9229);
      }
   }
}
