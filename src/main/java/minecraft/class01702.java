package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class class01702 extends class05765<class02148> {
   public static final int N = 200;
   public static final float y = 1.65F;
   private final Function<class02148, class02135> L;
   private final class01328 u;
   private final float i;
   private final ToDoubleFunction<class02148> R;
   private class06889 Z;
   private final Function<class02148, class04891> z;
   private final Function<class02148, class04891> U;

   protected void L(class04782 var1, class02148 var2, long var3) {
      List<class07438> list = var1.N(class07438.class, this.u, var2, var2.method_5829());
      class01289<class02148> class01289 = var2.method_18868();
      if (!list.isEmpty()) {
         class07438 var7 = list.get(0);
         class07072 var8 = var1.method_48963().L((class07438)var2);
         float f = (float)var2.method_45325(class05298.u);
         if (var7.method_64397(var1, var8, f)) {
            class07323.N(var1, (class07049)var7, var8);
         }

         int ix = var2.method_6059(class07047.N) ? var2.method_6112(class07047.N).i() + 1 : 0;
         int j = var2.method_6059(class07047.y) ? var2.method_6112(class07047.y).i() + 1 : 0;
         float f1 = 0.25F * (ix - j);
         float f2 = class04995.N(var2.method_6029() * 1.65F, 0.2F, 3.0F) + f1;
         class07072 class07072x = var1.method_48963().y((class07438)var2);
         float f3 = var7.method_67346(var1, class07072x, f) > 0.0F ? 0.5F : 1.0F;
         var7.method_6005(f3 * f2 * this.R.applyAsDouble(var2), this.Z.N(), this.Z.L());
         this.y(var1, var2);
         var1.method_43129(null, var2, this.z.apply(var2), class04911.field_15254, 1.0F, 1.0F);
      } else if (this.L(var1, var2)) {
         var1.method_43129(null, var2, this.z.apply(var2), class04911.field_15254, 1.0F, 1.0F);
         boolean flag = var2.t();
         if (flag) {
            var1.method_43129(null, var2, this.U.apply(var2), class04911.field_15254, 1.0F, 1.0F);
         }

         this.y(var1, var2);
      } else {
         Optional<class05352> optional = class01289.L(class05378.m);
         Optional<class06889> optional1 = class01289.L(class05378.D);
         boolean flag1 = optional.isEmpty() || optional1.isEmpty() || optional.get().N().N().N(optional1.get(), 0.25);
         if (flag1) {
            this.y(var1, var2);
         }
      }
   }

   private boolean L(class04782 var1, class02148 var2) {
      class06889 class06889 = var2.method_18798().u(1.0, 0.0, 1.0).u();
      class07209 class07209 = class07209.method_49638(var2.method_73189().i(class06889));
      return var1.method_8320(class07209).N(class01210.LO) || var1.method_8320(class07209.method_10084()).N(class01210.LO);
   }

   public class01702(
      Function<class02148, class02135> var1,
      class01328 var2,
      float var3,
      ToDoubleFunction<class02148> var4,
      Function<class02148, class04891> var5,
      Function<class02148, class04891> var6
   ) {
      super(ImmutableMap.of(class05378.x, class05367.field_18457, class05378.D, class05367.field_18456), 200);
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.z = var5;
      this.U = var6;
      this.Z = class06889.L;
   }

   protected void u(class04782 var1, class02148 var2, long var3) {
      class07209 class07209 = var2.method_24515();
      class01289<class02148> class01289 = var2.method_18868();
      class06889 class06889 = class01289.L(class05378.D).get();
      this.Z = new class06889(class07209.method_10263() - class06889.N(), 0.0, class07209.method_10260() - class06889.L()).u();
      class01289.N(class05378.m, new class05352(class06889, this.i, 0));
   }

   protected void y(class04782 var1, class02148 var2) {
      var1.method_8421(var2, (byte)59);
      var2.method_18868().N(class05378.x, this.L.apply(var2).N(var1.field_9229));
      var2.method_18868().y(class05378.D);
   }

   protected boolean N(class04782 var1, class02148 var2) {
      return var2.method_18868().N(class05378.D);
   }

   protected boolean N(class04782 var1, class02148 var2, long var3) {
      return var2.method_18868().N(class05378.D);
   }
}
