package minecraft;

public class class00479 implements class00381<class07280> {
   public static final class02362<class00667, class00479> N = class00381.N(class00479::N, class00479::new);
   private final int y;
   private final int L;
   private final int u;

   public int L() {
      return this.u;
   }

   public class00479(int var1, int var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class00479(class00667 var1) {
      super();
      this.y = var1.G();
      this.L = var1.readShort();
      this.u = var1.readShort();
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.R(this.y);
      var1.writeShort(this.L);
      var1.writeShort(this.u);
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00479> method_65080() {
      return class04248.n;
   }
}
