package minecraft;

import org.jspecify.annotations.Nullable;

public class class05574 extends class07883 {
   private static final class02131<Integer> X = class03289.N(class05574.class, class02154.y);
   private static final int a = 0;

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(X, 0);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag) {
         this.y(100);
      }

      return flag;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("DarkTicksRemaining", this.v());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y(var1.N("DarkTicksRemaining", 0));
   }

   public class05574(class07078<? extends class05574> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      return class04909.Wd;
   }

   public int v() {
      return this.field_6011.N(X);
   }

   private void y(int var1) {
      this.field_6011.N(X, var1);
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.NE.N(var1, class06113.field_16466);
   }

   @Override
   protected class04891 E() {
      return class04909.WY;
   }

   public static boolean N(class07078<? extends class07438> var0, class01001 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var3.method_10264() <= var1.method_8615() - 33 && var1.method_22335(var3, 0) == 0 && var1.method_8320(var3).N(class00869.K);
   }

   @Override
   protected class07126 W() {
      return class07107.Nf;
   }

   @Override
   public class04891 method_6002() {
      return class04909.Ww;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      int i = this.v();
      if (i > 0) {
         this.y(i - 1);
      }

      this.method_73183().method_8406(class07107.NC, this.method_23322(0.6), this.method_23319(), this.method_23325(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Wk;
   }
}
