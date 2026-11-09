package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class07877 extends class07862 {
   private static final class02131<Boolean> f = class03289.N(class07877.class, class02154.U);
   private static final boolean C = false;
   private final class01325 S;

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return (class04803)(var1 == 499 ? new class07880(this) : super.method_32318(var1));
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(f, false);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("ChestedHorse", this.v());
      if (this.v()) {
         class08294<class08332> class08294 = var1.N("Items", class08332.N);

         for (int i = 0; i < this.M.method_5439(); i++) {
            class06584 class06584 = this.M.method_5438(i);
            if (!class06584.R()) {
               class08294.N(new class08332(i, class06584));
            }
         }
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("ChestedHorse", false));
      this.No();
      if (this.v()) {
         for (class08332 class08332 : var1.L("Items", class08332.N)) {
            if (class08332.N(this.M.method_5439())) {
               this.M.method_5447(class08332.N(), class08332.y());
            }
         }
      }
   }

   public class07877(class07078<? extends class07877> var1, class07299 var2) {
      super(var1, var2);
      this.F = false;
      this.S = var1.E().N(class03810.N().N(class03831.field_47743, 0.0F, var1.U() - 0.15625F, 0.0F)).N(0.5F);
   }

   @Override
   protected void l() {
      this.method_5783(class04909.ZJ, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
   }

   public boolean v() {
      return this.field_6011.N(f);
   }

   private void u(class08036 var1, class06584 var2) {
      this.N(true);
      this.l();
      var2.N(1, var1);
      this.No();
   }

   public void N(boolean var1) {
      this.field_6011.N(f, var1);
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

            if (!this.v() && class06584.N(class06570.Rv)) {
               this.u(var1, class06584);
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
      this.method_5996(class05298.n).N(N_85(var1::y));
   }

   public static class05300 W() {
      return NK().N(class05298.l, 0.175F).N(class05298.T, 0.5);
   }

   @Override
   public class06889[] ab_() {
      return class02607.N(this, 0.04, 0.41, 0.18, 0.73);
   }

   @Override
   public int N_() {
      return this.v() ? 5 : 0;
   }

   @Override
   public void method_16078(class04782 var1) {
      super.method_16078(var1);
      if (this.v()) {
         this.method_5706(var1, class00869.LA);
         this.N(false);
      }
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? this.S : super.method_55694(var1);
   }
}
