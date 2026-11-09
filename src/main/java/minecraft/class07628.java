package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class07628 extends class07633 {
   private static final class01325 B = class07078.Q.E().N(0.5F).y(0.2975F);
   private static final class02131<class03556<class08423>> Z = class03289.N(class07628.class, class02154.l);
   private static final boolean X = false;
   public float N;
   public float y;
   public float L;
   public float u;
   public float i = 1.0F;
   private float p = 1.0F;
   public int R;
   public boolean M = false;

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Np);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(Z, class08577.N(this.method_56673(), class08427.N));
   }

   @Override
   protected void method_5801() {
      this.p = this.field_28627 + this.y / 2.0F;
   }

   @Override
   protected boolean method_5776() {
      return this.field_28627 > this.p;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.RG, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsChickenJockey", this.M);
      var1.N("EggLayTime", this.R);
      class08577.N(var1, this.W());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Np ? method_66651(var1, new class02204<>(this.W())) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.M = var1.N("IsChickenJockey", false);
      var1.i("EggLayTime").ifPresent(var1x -> this.R = var1x);
      class08577.N(var1, class04227.NS).ifPresent(this::N);
   }

   @Override
   protected void method_5865(class07049 var1, class07067 var2) {
      super.method_5865(var1, var2);
      if (var1 instanceof class07438) {
         ((class07438)var1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = super.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      }
   }

   public class07628(class07078<? extends class07628> var1, class07299 var2) {
      super(var1, var2);
      this.R = this.field_5974.y(6000) + 6000;
      this.N(class04425.field_18, 0.0F);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 4.0).N(class05298.l, 0.25);
   }

   @Override
   protected class04891 s() {
      return class04909.Rj;
   }

   public boolean m() {
      return this.M;
   }

   public void N(boolean var1) {
      this.M = var1;
   }

   @Nullable
   public class07628 y(class04782 var1, class07077 var2) {
      class07628 class07628x = class07078.Q.N(var1, class06113.field_16466);
      if (class07628x != null && var2 instanceof class07628 class07628x) {
         class07628x.N(this.field_5974.Z() ? this.W() : class07628x.W());
      }

      return class07628x;
   }

   @Override
   public boolean N(double var1) {
      return this.m();
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class08577.N(class08579.N(var1, this.method_24515()), class04227.NS).ifPresent(this::N);
      return super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NA);
   }

   public void N(class03556<class08423> var1) {
      this.field_6011.N(Z, var1);
   }

   public class03556<class08423> W() {
      return this.field_6011.N(Z);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Np) {
         Optional<class03556<class08423>> optional = method_66651(class02484.Np, var2).N(this.method_56673());
         if (optional.isPresent()) {
            this.N(optional.get());
            return true;
         } else {
            return false;
         }
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07993(this, 1.4));
      this.e.N(2, new class07434(this, 1.0));
      this.e.N(3, new class07960(this, 1.0, var0 -> var0.N(class01226.NA), false));
      this.e.N(4, new class07459(this, 1.1));
      this.e.N(5, new class07957(this, 1.0));
      this.e.N(6, new class07962(this, class08036.class, 6.0F));
      this.e.N(7, new class07956(this));
   }

   @Override
   public int method_6110(class04782 var1) {
      return this.m() ? 10 : super.method_6110(var1);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Rv;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? B : super.method_55694(var1);
   }

   @Override
   public void method_6007() {
      super.method_6007();
      this.u = this.N;
      this.L = this.y;
      this.y = this.y + (this.method_24828() ? -1.0F : 4.0F) * 0.3F;
      this.y = class04995.N(this.y, 0.0F, 1.0F);
      if (!this.method_24828() && this.i < 1.0F) {
         this.i = 1.0F;
      }

      this.i *= 0.9F;
      class06889 class06889 = this.method_18798();
      if (!this.method_24828() && class06889.B < 0.0) {
         this.method_18799(class06889.u(1.0, 0.6, 1.0));
      }

      this.N = this.N + this.i * 2.0F;
      if (this.method_73183() instanceof class04782 class04782 && this.method_5805() && !this.method_6109() && !this.m() && --this.R <= 0) {
         if (this.method_64169(class04782, class06273.Nq, this::method_5775)) {
            this.method_5783(class04909.Rn, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
            this.method_32876(class01194.v);
         }

         this.R = this.field_5974.y(6000) + 6000;
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Rt;
   }
}
