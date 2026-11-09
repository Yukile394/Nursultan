package minecraft;

import com.mojang.serialization.MapCodec;

public class class03561 extends class00891 {
   public static final MapCodec<class03561> N = y(class03561::new);
   public static final int y = 2;
   public static final class08071 L = class06665.Nq;
   private static final int u = 24000;
   private static final int i = 12000;
   private static final int R = 300;
   private static final class00494 M = class00891.N(14.0, 12.0, 0.0, 16.0);

   private boolean T(class00500 var1) {
      return this.U(var1) == 2;
   }

   public class03561(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 0));
   }

   public int U(class00500 var1) {
      return var1.L(L);
   }

   @Override
   public void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      boolean flag = N(var2, var3);
      if (!var2.method_8608() && flag) {
         var2.N(3009, var3, 0);
      }

      int ix = (flag ? 12000 : 24000) / 3;
      var2.N(class01194.Z, var3, class01164.N(var1));
      var2.N(var3, this, ix + var2.field_9229.y(300));
   }

   @Override
   public boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   public static boolean N(class07290 var0, class07209 var1) {
      return var0.method_8320(var1.method_10074()).N(class01210.LV);
   }

   @Override
   public MapCodec<class03561> N() {
      return N;
   }

   @Override
   public void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!this.T(var1)) {
         var2.method_8396(null, var3, class04909.Yp, class04911.field_15245, 0.7F, 0.9F + var4.z() * 0.2F);
         var2.method_8652(var3, var1.y(L, this.U(var1) + 1), 2);
      } else {
         var2.method_8396(null, var3, class04909.YF, class04911.field_15245, 0.7F, 0.9F + var4.z() * 0.2F);
         var2.N(var3, false);
         class01964 class01964 = class07078.yb.N(var2, class06113.field_16466);
         if (class01964 != null) {
            class06889 class06889 = var3.method_46558();
            class01964.y(true);
            class01964.method_5808(class06889.N(), class06889.y(), class06889.L(), class04995.R(var2.field_9229.z() * 360.0F), 0.0F);
            var2.method_8649(class01964);
         }
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return M;
   }
}
