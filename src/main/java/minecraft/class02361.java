package minecraft;

public class class02361 implements class00381<class07280> {
   public static final class02362<class00667, class02361> N = class00381.N(class02361::N, class02361::new);
   private final boolean y;

   public class02361(boolean var1) {
      super();
      this.y = var1;
   }

   private class02361(class00667 var1) {
      super();
      this.y = var1.readBoolean();
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.writeBoolean(this.y);
   }

   public boolean N() {
      return this.y;
   }

   @Override
   public class02897<class02361> method_65080() {
      return class04248.s;
   }
}
