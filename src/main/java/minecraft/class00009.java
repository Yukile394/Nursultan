package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class00009 extends class07101 implements class06084 {
   public static final MapCodec<class00009> N = y(class00009::new);
   public static final int y = 3;
   public static final class08071 L = class06665.yi;
   public static final class06667 u = class06665.q;
   public static final int i = 5000;
   private static final class00494 M = class00891.N(10.0, 10.0, 0.0, 10.0);

   public int L(class00500 var1) {
      return var1.L(L);
   }

   private void L(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!this.U(var1)) {
         var2.method_8396(null, var3, class04909.ZA, class04911.field_15245, 1.0F, 1.0F);
         var2.method_8652(var3, var1.y(L, this.L(var1) + 1), 2);
         var2.N(class01194.L, var3, class01164.N(var1));
      } else {
         this.N(var2, var3, var1);
      }
   }

   public class00009(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, class07211.field_11043).y(L, 0).y(u, false));
   }

   private boolean U(class00500 var1) {
      return this.L(var1) == 3;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if ((var1.L(u) || var1.L(L) > 0) && !var2.method_14196().N(var3, this)) {
         var2.N(var3, this, 5000);
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      super.N(var1, var2, var3, var4, var5);
      var1.method_8396(null, var2, var3.L(u) ? class04909.ZF : class04909.Zp, class04911.field_15245, 1.0F, 1.0F);
   }

   @Override
   public class00500 N(class06942 var1) {
      boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
      return super.N(var1).y(u, flag).y(R, var1.method_8042().b());
   }

   @Override
   public MapCodec<class00009> N() {
      return N;
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      if (!var3.L(class06665.q) && var4.N() == class04684.L) {
         if (!var1.method_8608()) {
            var1.method_8652(var2, var3.y(class06665.q, true), 3);
            var1.N(var2, var4.N(), var4.N().N(var1));
            var1.method_8396(null, var2, class04909.ZF, class04911.field_15245, 1.0F, 1.0F);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, L, u);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return M;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(u)) {
         this.L(var1, var2, var3, var4);
      } else {
         int ix = this.L(var1);
         if (ix > 0) {
            var2.method_8652(var3, var1.y(L, ix - 1), 2);
            var2.N(class01194.L, var3, class01164.N(var1));
         }
      }
   }

   private void N(class04782 var1, class07209 var2, class00500 var3) {
      var1.method_8650(var2, false);
      class00032 class00032 = class07078.NZ.N(var1, class06113.field_16466);
      if (class00032 != null) {
         class06889 class06889 = var2.method_61082();
         class00032.y(true);
         float f = class07211.N(var3.L(R));
         class00032.method_5847(f);
         class00032.method_5808(class06889.N(), class06889.y(), class06889.L(), f, 0.0F);
         var1.method_8649(class00032);
         var1.method_43129(null, class00032, class04909.WB, class04911.field_15245, 1.0F, 1.0F);
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      double d0 = var3.method_10263() + 0.5;
      double d1 = var3.method_10264() + 0.5;
      double d2 = var3.method_10260() + 0.5;
      if (!var1.L(u)) {
         if (var4.y(40) == 0 && var2.method_8320(var3.method_10074()).N(class01210.LC)) {
            var2.method_8486(d0, d1, d2, class04909.ZX, class04911.field_15245, 1.0F, 1.0F, false);
         }

         if (var4.y(6) == 0) {
            var2.method_8406(class07107.Nz, d0, d1, d2, 0.0, 0.02, 0.0);
         }
      } else {
         if (var4.y(40) == 0) {
            var2.method_8486(d0, d1, d2, class04909.Za, class04911.field_15245, 1.0F, 1.0F, false);
         }

         if (var4.y(6) == 0) {
            var2.method_8406(class07107.F, d0 + (var4.z() * 2.0F - 1.0F) / 3.0F, d1 + 0.4, d2 + (var4.z() * 2.0F - 1.0F) / 3.0F, 0.0, var4.z(), 0.0);
         }
      }
   }
}
