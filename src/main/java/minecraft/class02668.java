package minecraft;

public class class02668 implements class00381<class07280> {
   public static final class02362<class00667, class02668> N = class00381.N(class02668::N, class02668::new);
   private final int y;
   private final int L;
   private final int u;

   public int L() {
      return this.u;
   }

   public class02668(int var1, int var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class02668(class00667 var1) {
      super();
      this.y = var1.readInt();
      this.L = var1.readInt();
      this.u = var1.readInt();
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.writeInt(this.y);
      var1.writeInt(this.L);
      var1.writeInt(this.u);
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02668> method_65080() {
      return class04248.Nr;
   }
}
