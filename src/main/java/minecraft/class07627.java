package minecraft;

import org.jspecify.annotations.Nullable;

public class class07627 extends class07633 implements class01361 {
   private static final class02131<Integer> N = class03289.N(class07627.class, class02154.y);
   private static final class02131<class03556<class08642>> y = class03289.N(class07627.class, class02154.Q);
   private final class01332 L = new class01332(this.field_6011, N);

   @Override
   public void method_5674(class02131<?> var1) {
      if (N.equals(var1) && this.method_73183().method_8608()) {
         this.L.N();
      }

      super.method_5674(var1);
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NX);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, 0);
      var1.N(y, class08577.N(this.method_56673(), class08638.u));
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      return (class07438)(this.Nz() && this.method_31483() instanceof class08036 class08036 && class08036.method_24518(class06570.sm)
         ? class08036
         : super.method_5642());
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.GT, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class08577.N(var1, this.m());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NX ? method_66651(var1, this.m()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08577.N(var1, class04227.yP).ifPresent(this::N);
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
      if (var1.y() != class07086.field_5801) {
         if (this.N(class07078.LN, class08234.N(this, false, true), var2x -> {
            var2x.N(this.method_59922(), var1.method_8404(this.method_24515()));
            var2x.NW();
         }) == null) {
            super.method_5800(var1, var2);
         }
      } else {
         super.method_5800(var1, var2);
      }
   }

   public class07627(class07078<? extends class07627> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, 0.25);
   }

   @Override
   protected class04891 s() {
      return class04909.GW;
   }

   public class03556<class08642> m() {
      return this.field_6011.N(y);
   }

   @Nullable
   public class07627 y(class04782 var1, class07077 var2) {
      class07627 class07627x = class07078.Nh.N(var1, class06113.field_16466);
      if (class07627x != null && var2 instanceof class07627 class07627x) {
         class07627x.N(this.field_5974.Z() ? this.m() : class07627x.m());
      }

      return class07627x;
   }

   private void N(class03556<class08642> var1) {
      this.field_6011.N(y, (class03556<class08642>)var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.yN);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      if (!this.N(var1.method_5998(var2)) && this.Nz() && !this.method_5782() && !var1.method_21823()) {
         if (!this.method_73183().method_8608()) {
            var1.method_5804(this);
         }

         return class07082.N;
      } else {
         class07082 class07082 = super.N(var1, var2);
         if (!class07082.N()) {
            class06584 class06584 = var1.method_5998(var2);
            return (class07082)(this.method_63623(class06584, class07085.field_55946) ? class06584.N(var1, this, var2) : class07082.i);
         } else {
            return class07082;
         }
      }
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class08577.N(class08579.N(var1, this.method_24515()), class04227.yP).ifPresent(this::N);
      return super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean W() {
      return this.L.N(this.method_59922());
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.6F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NX) {
         this.N(method_66651(class02484.NX, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07993(this, 1.25));
      this.e.N(3, new class07434(this, 1.0));
      this.e.N(4, new class07960(this, 1.2, var0 -> var0.N(class06570.sm), false));
      this.e.N(4, new class07960(this, 1.2, var0 -> var0.N(class01226.yN), false));
      this.e.N(5, new class07459(this, 1.1));
      this.e.N(6, new class07957(this, 1.0));
      this.e.N(7, new class07962(this, class08036.class, 6.0F));
      this.e.N(8, new class07956(this));
   }

   @Override
   public float method_49485(class08036 var1) {
      return (float)(this.method_45325(class05298.l) * 0.225 * this.L.L());
   }

   @Override
   public class04891 method_6002() {
      return class04909.Gm;
   }

   @Override
   public void method_49481(class08036 var1, class06889 var2) {
      super.method_49481(var1, var2);
      this.method_5710(var1.method_36454(), var1.method_36455() * 0.5F);
      float f = this.method_36454();
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = f;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = f;
      this.field_5982 = f;
      this.L.y();
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_55946 || super.method_63626(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.GP;
   }

   @Override
   public class03556<class04891> method_66667(class07085 var1, class06584 var2, class08725 var3) {
      return (class03556<class04891>)(var1 == class07085.field_55946 ? class04909.Gs : super.method_66667(var1, var2, var3));
   }

   @Override
   public class06889 method_49482(class08036 var1, class06889 var2) {
      return new class06889(0.0, 0.0, 1.0);
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return var1 != class07085.field_55946 ? super.method_56991(var1) : this.method_5805() && !this.method_6109();
   }
}
