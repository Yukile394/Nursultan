package minecraft;

import java.util.function.DoubleSupplier;
import org.jspecify.annotations.Nullable;

public class class00673 extends class07862 {
   private static final float f = 42.16F;
   private static final double C = 0.5;
   private static final double S = 0.06666666666666667;
   private static final double x = 9.0;
   private static final double D = 1.0;
   private static final class01325 h = class07078.yD.E().N(class03810.N().N(class03831.field_47743, 0.0F, class07078.yD.U() - 0.03125F, 0.0F)).N(0.5F);

   private static double L(DoubleSupplier var0) {
      return 0.5 + var0.getAsDouble() * 0.06666666666666667 + var0.getAsDouble() * 0.06666666666666667 + var0.getAsDouble() * 0.06666666666666667;
   }

   @Override
   protected void Q() {
      this.e.N(0, new class07427(this));
      this.e.N(3, new class07960(this, 1.25, var0 -> var0.N(class01226.NV), false));
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      this.NW();
      return super.method_5688(var1, var2);
   }

   public class00673(class07078<? extends class00673> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_5, -1.0F);
      this.N(class04425.field_17, -1.0F);
   }

   @Override
   public boolean B() {
      return this.method_31483() instanceof class07079;
   }

   @Override
   protected class07085 J() {
      return class07085.field_48824;
   }

   @Override
   protected class04891 s() {
      return class04909.JX;
   }

   @Override
   public boolean g() {
      return this.I() || !this.B();
   }

   private static double u(DoubleSupplier var0) {
      return (9.0 + var0.getAsDouble() * 1.0 + var0.getAsDouble() * 1.0 + var0.getAsDouble() * 1.0) / 42.16F;
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return null;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var3 == class06113.field_16459) {
         class08004 class08004 = class07078.yx.N(this.method_73183(), class06113.field_16460);
         if (class08004 != null) {
            class08004.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
            class08004.N(var1, var2, var3, null);
            class08004.method_5673(class07085.field_6173, new class06584(class06570.le));
            class08004.method_5873(this, false, false);
         }
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      boolean flag = !this.method_6109() && this.I() && var1.method_21823();
      if (!this.method_5782() && !flag) {
         class06584 class06584 = var1.method_5998(var2);
         if (!class06584.R()) {
            if (this.N(class06584)) {
               return this.y(var1, class06584);
            }

            if (!this.I()) {
               this.NC();
               return class07082.N;
            }
         }

         return super.N(var1, var2);
      } else {
         return super.N(var1, var2);
      }
   }

   @Override
   protected void N(class06069 var1) {
      this.method_5996(class05298.T).N(L(var1::U));
      this.method_5996(class05298.l).N(u(var1::U));
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NV);
   }

   @Override
   public boolean N(double var1) {
      return true;
   }

   public static class05300 W() {
      return NK().N(class05298.n, 25.0);
   }

   @Override
   protected class04891 G() {
      return class04909.JF;
   }

   @Override
   public class06889[] ab_() {
      return class02607.N(this, 0.04, 0.41, 0.18, 0.73);
   }

   @Override
   public float K_() {
      return 1.4F;
   }

   @Override
   public class04891 method_6002() {
      return class04909.Jp;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? h : super.method_55694(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.JA;
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return true;
   }

   @Override
   public boolean T_() {
      return false;
   }

   @Override
   protected class04891 M_() {
      return class04909.Ja;
   }
}
