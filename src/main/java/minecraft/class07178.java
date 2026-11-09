package minecraft;

import Nursultan.class10474;
import org.jspecify.annotations.Nullable;

public class class07178 extends class00675 implements class04391, class04854 {
   private static final class02131<Boolean> N = class03289.N(class07178.class, class02154.U);
   private static final int y = 5;
   private static final int R = 300;
   private final class07075 B = new class07075(5);

   @Override
   public class00703 M() {
      if (this.W()) {
         return class00703.field_7210;
      } else if (this.method_24518(class06570.dw)) {
         return class00703.field_7213;
      } else {
         return this.Nl() ? class00703.field_7211 : class00703.field_21512;
      }
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      int i = var1 - 300;
      return i >= 0 && i < this.B.method_5439() ? this.B.method_32318(i) : super.method_32318(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.b_(var1);
      this.L(true);
   }

   public class07178(class07078<? extends class07178> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.l, 0.35F).N(class05298.n, 24.0).N(class05298.u, 5.0).N(class05298.P, 32.0);
   }

   @Override
   protected class04891 s() {
      return class04909.Go;
   }

   @Override
   public class07075 n() {
      return this.B;
   }

   @Override
   public void m() {
      super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
   }

   @Override
   protected void y(class01001 var1, class06069 var2, class07052 var3) {
      super.y(var1, var2, var3);
      if (var2.y(300) == 0) {
         class06584 class06584 = this.method_6047();
         if (class06584.N(class06570.dw)) {
            class07323.N(class06584, var1.method_30349(), class02251.y, var3, var2);
         }
      }
   }

   @Override
   public boolean y(class06584 var1) {
      return var1.B() == class06570.dw;
   }

   @Override
   public class04891 E() {
      return class04909.Gq;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      this.N(class06069, var2);
      this.N(var1, class06069, var2);
      return super.N(var1, var2, var3, var4);
   }

   @Override
   public void N(class07438 var1, float var2) {
      this.y(this, 1.6F);
   }

   @Override
   public void N(class04782 var1, class00717 var2) {
      class06584 class06584x = var2.N();
      if (class06584x.B() instanceof class06920) {
         super.N(var1, var2);
      } else if (this.N(class06584x)) {
         this.method_29499(var2);
         class06584 class06584x = this.B.N(class06584x);
         if (class06584x.R()) {
            var2.method_31472();
         } else {
            class06584x.i(class06584x.c());
         }
      }
   }

   private boolean N(class06584 var1) {
      return this.NQ() && var1.N(class06570.li);
   }

   @Override
   public void N(class04782 var1, int var2, boolean var3) {
      class04877 class04877 = this.K();
      if (this.field_5974.z() <= class04877.b()) {
         class06584 class06584 = new class06584(class06570.dw);
         class05946<class02530> class05946;
         if (var2 > class04877.N(class07086.field_5802)) {
            class05946 = class02251.u;
         } else if (var2 > class04877.N(class07086.field_5805)) {
            class05946 = class02251.L;
         } else {
            class05946 = null;
         }

         if (class05946 != null) {
            class07323.N(class06584, var1.method_30349(), class05946, var1.method_8404(this.method_24515()), this.method_59922());
            this.method_5673(class07085.field_6173, class06584);
         }
      }
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   @Override
   public void N(boolean var1) {
      this.field_6011.N(N, var1);
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      this.method_5673(class07085.field_6173, new class06584(class06570.dw));
   }

   public boolean W() {
      return this.field_6011.N(N);
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07464<>(this, class00245.class, 8.0F, 1.0, 1.2));
      this.e.N(2, new class10474(this, 10.0F));
      this.e.N(3, new class07966<>(this, 1.0, 8.0F));
      this.e.N(8, new class07978(this, 0.6));
      this.e.N(9, new class07962(this, class08036.class, 15.0F, 1.0F));
      this.e.N(10, new class07962(this, class07079.class, 15.0F));
      this.H.N(1, new class07989(this, class04882.class).N());
      this.H.N(2, new class07952<>(this, class08036.class, true));
      this.H.N(3, new class07952<>(this, class06171.class, false));
      this.H.N(3, new class07952<>(this, class07625.class, true));
   }

   @Override
   public int n_() {
      return 1;
   }

   @Override
   public class03530<class06581> NL() {
      return class01226.LT;
   }

   @Override
   public class04891 method_6002() {
      return class04909.GK;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.GV;
   }
}
