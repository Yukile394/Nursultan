package minecraft;

import Nursultan.class09385;
import Nursultan.class10474;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class08011 extends class00675 {
   private static final String R = "Johnny";
   static final Predicate<class07086> N = var0 -> var0 == class07086.field_5802 || var0 == class07086.field_5807;
   private static final boolean M = false;
   boolean y = false;

   @Override
   public class00703 M() {
      if (this.Nl()) {
         return class00703.field_7211;
      } else {
         return this.Ng() ? class00703.field_19012 : class00703.field_7207;
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      if (this.y) {
         var1.N("Johnny", true);
      }
   }

   @Override
   public void method_5665(@Nullable class00392 var1) {
      super.method_5665(var1);
      if (!this.y && var1 != null && var1.getString().equals("Johnny")) {
         this.y = true;
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y = var1.N("Johnny", false);
   }

   public class08011(class07078<? extends class08011> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.l, 0.35F).N(class05298.P, 12.0).N(class05298.n, 24.0).N(class05298.u, 5.0);
   }

   @Override
   protected class04891 s() {
      return class04909.gg;
   }

   @Override
   public class04891 E() {
      return class04909.gI;
   }

   @Override
   public void N(class04782 var1, int var2, boolean var3) {
      class06584 class06584 = new class06584(class06570.TV);
      class04877 class04877 = this.K();
      if (this.field_5974.z() <= class04877.b()) {
         class05946<class02530> class05946 = var2 > class04877.N(class07086.field_5802) ? class02251.R : class02251.i;
         class07323.N(class06584, var1.method_30349(), class05946, var1.method_8404(this.method_24515()), this.field_5974);
      }

      this.method_5673(class07085.field_6173, class06584);
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      if (this.K() == null) {
         this.method_5673(class07085.field_6173, new class06584(class06570.TV));
      }
   }

   @Override
   protected void N(class04782 var1) {
      if (!this.Nt() && class05459.N(this)) {
         boolean flag = var1.method_19503(this.method_24515());
         this.f().y(flag);
      }

      super.N(var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class07446 class07446 = super.N(var1, var2, var3, var4);
      this.f().y(true);
      class06069 class06069 = var1.method_8409();
      this.N(class06069, var2);
      this.N(var1, class06069, var2);
      return class07446;
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07464<>(this, class00245.class, 8.0F, 1.0, 1.2));
      this.e.N(2, new class08010(this));
      this.e.N(3, new class09385(this, this));
      this.e.N(4, new class10474(this, 10.0F));
      this.e.N(5, new class07999(this, 1.0, false));
      this.H.N(1, new class07989(this, class04882.class).N());
      this.H.N(2, new class07952<>(this, class08036.class, true));
      this.H.N(3, new class07952<>(this, class06171.class, true));
      this.H.N(3, new class07952<>(this, class07625.class, true));
      this.H.N(4, new class08046(this));
      this.e.N(8, new class07978(this, 0.6));
      this.e.N(9, new class07962(this, class08036.class, 3.0F, 1.0F));
      this.e.N(10, new class07962(this, class07079.class, 8.0F));
   }

   @Override
   public class04891 method_6002() {
      return class04909.gJ;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.go;
   }
}
