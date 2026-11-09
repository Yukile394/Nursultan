package minecraft;

public class class07377 implements class00381<class08051> {
   public static final class02362<class00667, class07377> N = class00381.N(class07377::N, class07377::new);
   private final boolean y;
   private final boolean L;

   public class07377(boolean var1, boolean var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private class07377(class00667 var1) {
      super();
      this.y = var1.readBoolean();
      this.L = var1.readBoolean();
   }

   public boolean y() {
      return this.L;
   }

   public void method_65081(class08051 var1) {
      var1.method_12064(this);
   }

   public boolean N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.writeBoolean(this.y);
      var1.writeBoolean(this.L);
   }

   @Override
   public class02897<class07377> method_65080() {
      return class04248.yC;
   }
}
