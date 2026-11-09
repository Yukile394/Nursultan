package minecraft;

import org.jspecify.annotations.Nullable;

public class class07884 extends class07877 {
   public class07884(class07078<? extends class07884> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      return class04909.Zg;
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      class07862 class07862 = (var2 instanceof class07901 ? class07078.Ne : class07078.H).N(var1, class06113.field_16466);
      if (class07862 != null) {
         this.N(var2, class07862);
      }

      return class07862;
   }

   @Override
   public boolean N(class07633 var1) {
      if (var1 == this) {
         return false;
      } else {
         return !(var1 instanceof class07884) && !(var1 instanceof class07901) ? false : this.NS() && ((class07862)var1).NS();
      }
   }

   @Override
   protected class04891 G() {
      return class04909.Zq;
   }

   @Override
   protected void Y() {
      this.method_5783(class04909.ZV, 0.4F, 1.0F);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Zo;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.ZK;
   }

   @Override
   protected class04891 M_() {
      return class04909.ZI;
   }
}
