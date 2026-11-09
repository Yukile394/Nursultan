package minecraft;

public class class00516 implements class00381<class07280> {
   public static final class02362<class00667, class00516> N = class00381.N(class00516::N, class00516::new);
   private final int y;
   private final class07209 L;
   private final int u;
   private final boolean i;

   public int L() {
      return this.u;
   }

   public class00516(int var1, class07209 var2, int var3, boolean var4) {
      super();
      this.y = var1;
      this.L = var2.method_10062();
      this.u = var3;
      this.i = var4;
   }

   private class00516(class00667 var1) {
      super();
      this.y = var1.readInt();
      this.L = var1.i();
      this.u = var1.readInt();
      this.i = var1.readBoolean();
   }

   public class07209 u() {
      return this.L;
   }

   public int y() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.writeInt(this.y);
      var1.N(this.L);
      var1.writeInt(this.u);
      var1.writeBoolean(this.i);
   }

   public boolean N() {
      return this.i;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00516> method_65080() {
      return class04248.p;
   }
}
