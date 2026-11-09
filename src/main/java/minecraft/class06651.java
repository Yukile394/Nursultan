package minecraft;

public class class06651 implements class00381<class07280> {
   public static final class02362<class00667, class06651> N = class00381.N(class06651::N, class06651::new);
   private final class07209 y;
   private final boolean L;

   public class06651(class07209 var1, boolean var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private class06651(class00667 var1) {
      super();
      this.y = var1.i();
      this.L = var1.readBoolean();
   }

   public boolean y() {
      return this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class07209 N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.N(this.y);
      var1.writeBoolean(this.L);
   }

   @Override
   public class02897<class06651> method_65080() {
      return class04248.Nu;
   }
}
