package minecraft;

import Nursultan.class10763;
import org.jspecify.annotations.Nullable;

public class class07538 extends class07148 {
   @Nullable
   private class07881 N;

   @Override
   protected boolean method_61416(class07049 var1) {
      if (var1 == this) {
         return true;
      } else if (super.method_61416(var1)) {
         return true;
      } else {
         return var1 instanceof class08042 class08042 && class08042.z() != null ? this.method_61416(class08042.z()) : false;
      }
   }

   public class07538(class07078<? extends class07538> var1, class07299 var2) {
      super(var1, var2);
      this.J = 10;
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.l, 0.5).N(class05298.P, 12.0).N(class05298.n, 24.0);
   }

   @Override
   protected class04891 s() {
      return class04909.UR;
   }

   @Override
   protected class04891 m() {
      return class04909.UM;
   }

   @Override
   public class04891 E() {
      return class04909.UB;
   }

   void N(@Nullable class07881 var1) {
      this.N = var1;
   }

   @Override
   public void N(class04782 var1, int var2, boolean var3) {
   }

   @Nullable
   public class07881 W() {
      return this.N;
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(1, new class10763(this));
      this.e.N(2, new class07464<>(this, class08036.class, 8.0F, 0.6, 1.0));
      this.e.N(3, new class07464<>(this, class00245.class, 8.0F, 0.6, 1.0));
      this.e.N(4, new class07544(this));
      this.e.N(5, new class07546(this));
      this.e.N(6, new class07539(this));
      this.e.N(8, new class07978(this, 0.6));
      this.e.N(9, new class07962(this, class08036.class, 3.0F, 1.0F));
      this.e.N(10, new class07962(this, class07079.class, 8.0F));
      this.H.N(1, new class07989(this, class04882.class).N());
      this.H.N(2, new class07952<>(this, class08036.class, true).L(300));
      this.H.N(3, new class07952<>(this, class06171.class, false).L(300));
      this.H.N(3, new class07952<>(this, class07625.class, false));
   }

   @Override
   public class04891 method_6002() {
      return class04909.UZ;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.UU;
   }
}
