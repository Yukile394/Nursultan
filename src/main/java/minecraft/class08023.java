package minecraft;

import org.jspecify.annotations.Nullable;

public class class08023 extends class07528 {
   @Override
   public boolean L(class06584 var1) {
      return !var1.N(class01226.Lb) && super.L(var1);
   }

   public class08023(class07078<? extends class08023> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_14, 8.0F);
   }

   @Override
   class04891 B() {
      return class04909.JN;
   }

   @Override
   protected class04891 s() {
      return class04909.ID;
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      this.method_5673(class07085.field_6173, new class06584(class06570.Tl));
   }

   @Override
   protected void N(class01001 var1, class06069 var2, class07052 var3) {
   }

   @Override
   protected class08007 N(class06584 var1, float var2, @Nullable class06584 var3) {
      class08007 class08007 = super.N(var1, var2, var3);
      class08007.method_5639(100.0F);
      return class08007;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class07446 class07446 = super.N(var1, var2, var3, var4);
      this.method_5996(class05298.u).N(4.0);
      this.v();
      return class07446;
   }

   @Override
   protected void l_() {
      this.H.N(3, new class07952<>(this, class01238.class, true));
      super.l_();
   }

   @Override
   public class03530<class06581> NL() {
      return null;
   }

   @Override
   public boolean method_6049(class07055 var1) {
      return var1.N(class07047.v) ? false : super.method_6049(var1);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Ih;
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      if (!super.method_6121(var1, var2)) {
         return false;
      } else {
         if (var2 instanceof class07438) {
            ((class07438)var2).method_37222(new class07055(class07047.v, 200), this);
         }

         return true;
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Ir;
   }
}
