package minecraft;

import Nursultan.class10718;
import Nursultan.class10724;
import org.jspecify.annotations.Nullable;

public class class07141 extends class07150 {
   private static final class02131<Byte> N = class03289.N(class07141.class, class02154.N);
   private static final float y = 0.1F;

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, (byte)0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (!this.method_73183().method_8608()) {
         this.N(this.field_5976);
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.QM, 0.15F, 1.0F);
   }

   @Override
   public class06889 method_55668(class07049 var1) {
      return var1.method_17681() <= this.method_17681() ? new class06889(0.0, 0.3125 * this.method_55693(), 0.0) : super.method_55668(var1);
   }

   @Override
   public void method_5844(class00500 var1, class06889 var2) {
      if (!var1.N(class00869.yw)) {
         super.method_5844(var1, var2);
      }
   }

   public class07141(class07078<? extends class07141> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.n, 16.0).N(class05298.l, 0.3F);
   }

   @Override
   protected class04891 s() {
      return class04909.Qu;
   }

   public boolean E() {
      return (this.field_6011.N(N) & 1) != 0;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      var4 = super.N(var1, var2, var3, var4);
      class06069 class06069 = var1.method_8409();
      if (class06069.y(100) == 0) {
         class07146 class07146 = class07078.ym.N(this.method_73183(), class06113.field_16460);
         if (class07146 != null) {
            class07146.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
            class07146.N(var1, var2, var3, null);
            class07146.method_5873(this, false, false);
         }
      }

      if (var4 == null) {
         var4 = new class10724();
         if (var1.y() == class07086.field_5807 && class06069.z() < 0.1F * var2.u()) {
            ((class10724)var4).N(class06069);
         }
      }

      if (var4 instanceof class10724 class10724) {
         class03556<class07084> class03556 = class10724.N;
         if (class03556 != null) {
            this.method_6092(new class07055(class03556, -1));
         }
      }

      return var4;
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class07651(this, var1);
   }

   public void N(boolean var1) {
      byte b0 = this.field_6011.N(N);
      if (var1) {
         b0 = (byte)(b0 | 1);
      } else {
         b0 = (byte)(b0 & -2);
      }

      this.field_6011.N(N, b0);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07427(this));
      this.e.N(2, new class07464<>(this, class03811.class, 6.0F, 1.0, 1.2, var0 -> !((class03811)var0).W()));
      this.e.N(3, new class07982(this, 0.4F));
      this.e.N(4, new class07154(this));
      this.e.N(5, new class07957(this, 0.8));
      this.e.N(6, new class07962(this, class08036.class, 8.0F));
      this.e.N(6, new class07956(this));
      this.H.N(1, new class07989(this));
      this.H.N(2, new class10718<>(this, class08036.class));
      this.H.N(3, new class10718<>(this, class07625.class));
   }

   @Override
   public boolean method_6049(class07055 var1) {
      return var1.N(class07047.j) ? false : super.method_6049(var1);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Qi;
   }

   @Override
   public boolean method_6101() {
      return this.E();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.QR;
   }
}
