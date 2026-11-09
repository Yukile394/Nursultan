package minecraft;

public class class06652 implements class00381<class07280> {
   public static final class02362<class00667, class06652> N = class00381.N(class06652::N, class06652::new);
   private final int y;
   private final class06889 L;

   private class06652(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.U();
   }

   public class06652(int var1, class06889 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public class06652(class07049 var1) {
      this(var1.method_5628(), var1.method_18798());
   }

   public class06889 y() {
      return this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.y(this.L);
   }

   @Override
   public class02897<class06652> method_65080() {
      return class04248.NH;
   }
}
