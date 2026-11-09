package minecraft;

public class class07843 implements class00381<class08051> {
   public static final class02362<class00667, class07843> N = class00381.N(class07843::N, class07843::new);
   private final class07050 y;
   private final int L;
   private final float u;
   private final float i;

   public float L() {
      return this.u;
   }

   public class07843(class07050 var1, int var2, float var3, float var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   private class07843(class00667 var1) {
      super();
      this.y = var1.y(class07050.class);
      this.L = var1.E();
      this.u = var1.readFloat();
      this.i = var1.readFloat();
   }

   public float u() {
      return this.i;
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.N((Enum<?>)this.y);
      var1.L(this.L);
      var1.writeFloat(this.u);
      var1.writeFloat(this.i);
   }

   public class07050 N() {
      return this.y;
   }

   public void method_65081(class08051 var1) {
      var1.method_12065(this);
   }

   @Override
   public class02897<class07843> method_65080() {
      return class04248.Lt;
   }
}
