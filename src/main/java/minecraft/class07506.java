package minecraft;

import Nursultan.class10753;

public class class07506 extends class07504 {
   private final class07308 y = new class10753(this);
   private final Runnable L;

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.sZ);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      this.L.run();
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.y.N(var1);
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y.N(this.method_73183(), this.method_24515(), var1);
   }

   @Override
   public void method_5711(byte var1) {
      this.y.N(this.method_73183(), var1);
   }

   public class07506(class07078<? extends class07506> var1, class07299 var2) {
      super(var1, var2);
      this.L = this.y(var2);
   }

   public class07308 U() {
      return this.y;
   }

   @Override
   protected class06581 z() {
      return class06570.sZ;
   }

   private Runnable y(class07299 var1) {
      return var1 instanceof class04782 ? () -> this.y.N((class04782)var1, this.method_24515()) : () -> this.y.N(var1, this.method_24515());
   }

   @Override
   public class00500 R() {
      return class00869.La.W();
   }
}
