package minecraft;

import org.jspecify.annotations.Nullable;

public class class00700 extends class02901 {
   public static final double N = 0.375;

   public void L() {
      this.method_5783(class04909.TL, 1.0F, 1.0F);
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.Gr);
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      return new class07276(this, 0, this.s());
   }

   @Override
   public void method_70982(class02607 var1) {
      if (class02607.Z(this).isEmpty()) {
         this.method_31472();
      }
   }

   @Override
   public class06889 method_30951(float var1) {
      return this.method_30950(var1).y(0.0, 0.2, 0.0);
   }

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   protected void method_5652(class08329 var1) {
   }

   @Override
   public boolean method_5640(double var1) {
      return var1 < 1024.0;
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      if (this.method_73183().method_8608()) {
         return class07082.N;
      } else {
         if (var1.method_5998(var2).N(class06570.vr)) {
            class07082 class07082 = super.method_5688(var1, var2);
            if (class07082 instanceof class07041 var4 && var4.L()) {
               return class07082;
            }
         }

         boolean flag = false;

         for (class02607 var6 : class02607.Z(var1)) {
            if (var6.R(this)) {
               var6.N(this, true);
               flag = true;
            }
         }

         boolean flag1 = false;
         if (!flag && !var1.method_21823()) {
            for (class02607 class02607x : class02607.Z(this)) {
               if (class02607x.R(var1)) {
                  class02607x.N(var1, true);
                  flag1 = true;
               }
            }
         }

         if (!flag && !flag1) {
            return super.method_5688(var1, var2);
         } else {
            this.method_32875(class01194.y, var1);
            this.method_43077(class04909.TL);
            return class07082.N;
         }
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
   }

   public class00700(class07299 var1, class07209 var2) {
      super(class07078.Nk, var1, var2);
      this.method_5814(var2.method_10263(), var2.method_10264(), var2.method_10260());
   }

   public class00700(class07078<? extends class00700> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public boolean y() {
      return this.method_73183().method_8320(this.y).N(class01210.A);
   }

   @Override
   public void N(class04782 var1, @Nullable class07049 var2) {
      this.method_5783(class04909.Ty, 1.0F, 1.0F);
   }

   public static class00700 N(class07299 var0, class07209 var1) {
      int i = var1.method_10263();
      int j = var1.method_10264();
      int k = var1.method_10260();

      for (class00700 class00700x : var0.N(class00700.class, new class00734(i - 1.0, j - 1.0, k - 1.0, i + 1.0, j + 1.0, k + 1.0))) {
         if (class00700x.s().equals(var1)) {
            return class00700x;
         }
      }

      class00700 class00700x = new class00700(var0, var1);
      var0.method_8649(class00700x);
      return class00700x;
   }

   @Override
   protected void N() {
      this.method_23327(this.y.method_10263() + 0.5, this.y.method_10264() + 0.375, this.y.method_10260() + 0.5);
      double d0 = this.method_5864().z() / 2.0;
      double d1 = this.method_5864().U();
      this.method_5857(
         new class00734(
            this.method_23317() - d0,
            this.method_23318(),
            this.method_23321() - d0,
            this.method_23317() + d0,
            this.method_23318() + d1,
            this.method_23321() + d0
         )
      );
   }
}
