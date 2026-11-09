package minecraft;

public class class00496 implements class00381<class07280> {
   public static final class02362<class04247, class00496> N = class00381.N(class00496::N, class00496::new);
   private final int y;
   private final int L;
   private final int u;
   private final class06584 i;

   public class06584 L() {
      return this.i;
   }

   public class00496(int var1, int var2, int var3, class06584 var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4.t();
   }

   private class00496(class04247 var1) {
      super();
      this.y = var1.G();
      this.L = var1.E();
      this.u = var1.readShort();
      this.i = class06584.B.decode(var1);
   }

   public int u() {
      return this.L;
   }

   public int y() {
      return this.u;
   }

   private void N(class04247 var1) {
      var1.R(this.y);
      var1.L(this.L);
      var1.writeShort(this.u);
      class06584.B.encode(var1, this.i);
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00496> method_65080() {
      return class04248.t;
   }
}
