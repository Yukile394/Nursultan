package minecraft;

import org.jspecify.annotations.Nullable;

public class class00205 implements class03358<class08610, class00997> {
   private static final float N = 0.02F;
   private final class03575<class08610> y = new class03575<>();
   private final class03356<class08610> L = new class03356<>();

   public class00205() {
      super();
   }

   public class00997 i() {
      return new class00997();
   }

   public boolean N(class08610 var1, class06889 var2) {
      return this.y.N(var1, var2) || this.L.N(var1, var2);
   }

   public void N(class00997 var1, class01421 var2, class01237 var3, class06959 var4) {
      this.y.N(var1.N, var2, var3, var4);
      this.L.N(var1.y, var2, var3, var4);

      for (class08635 class08635 : var1.L) {
         this.N(class08635);
      }
   }

   private void N(class08635 var1) {
      class07209 class07209 = var1.N();
      class06724.N(new class00734(class07209).M(0.02F), class06747.y(class02566.N(0.375F, 1.0F, 0.0F, 0.0F)));
      String s = var1.y().getString();
      float f = 0.16F;
      class06724.N(s, class06889.N(class07209, 0.5, 1.2, 0.5), class06715.N().N(0.16F)).N();
   }

   public void N(class08610 var1, class00997 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.N = new class00956();
      class00985.N(var1, var2.N, var5);
      class03575.N(var1, var2.N, var3, var4);
      var2.y = new class00974();
      class00985.N(var1, var2.y, var5);
      class03356.N(var1, var2.y);
      var2.L.clear();

      for (class08635 class08635 : var1.t()) {
         var2.L.add(new class08635(class08635.N(), class08635.y()));
      }
   }

   @Override
   public int u_() {
      return Math.max(this.y.u_(), this.L.u_());
   }

   @Override
   public boolean t_() {
      return this.y.t_() || this.L.t_();
   }
}
