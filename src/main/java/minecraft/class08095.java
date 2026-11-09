package minecraft;

public class class08095 implements class00381<class07280> {
   public static final class02362<class00667, class08095> N = class00381.N(class08095::N, class08095::new);
   private final float y;
   private final int L;
   private final float u;

   public float L() {
      return this.u;
   }

   public class08095(float var1, int var2, float var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class08095(class00667 var1) {
      super();
      this.y = var1.readFloat();
      this.L = var1.E();
      this.u = var1.readFloat();
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.writeFloat(this.y);
      var1.L(this.L);
      var1.writeFloat(this.u);
   }

   public float N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08095> method_65080() {
      return class04248.Na;
   }
}
