package minecraft;

public class class08060 implements class00381<class07280> {
   public static final class02362<class00667, class08060> N = class00381.N(class08060::N, class08060::new);
   private final float y;
   private final int L;
   private final int u;

   public int L() {
      return this.u;
   }

   public class08060(float var1, int var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class08060(class00667 var1) {
      super();
      this.y = var1.readFloat();
      this.u = var1.E();
      this.L = var1.E();
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.writeFloat(this.y);
      var1.L(this.u);
      var1.L(this.L);
   }

   public float N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08060> method_65080() {
      return class04248.NX;
   }
}
