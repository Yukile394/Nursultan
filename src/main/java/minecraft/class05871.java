package minecraft;

public class class05871 implements class00381<class07280> {
   public static final class02362<class04247, class05871> N = class00381.N(class05871::N, class05871::new);
   private final int y;
   private final class07316 L;
   private final int u;
   private final int i;
   private final boolean R;
   private final boolean M;

   public int L() {
      return this.u;
   }

   public boolean M() {
      return this.R;
   }

   public class05871(int var1, class07316 var2, int var3, int var4, boolean var5, boolean var6) {
      super();
      this.y = var1;
      this.L = var2.N();
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
   }

   private class05871(class04247 var1) {
      super();
      this.y = var1.G();
      this.L = class07316.y.decode(var1);
      this.u = var1.E();
      this.i = var1.E();
      this.R = var1.readBoolean();
      this.M = var1.readBoolean();
   }

   public boolean B() {
      return this.M;
   }

   public int u() {
      return this.i;
   }

   public class07316 y() {
      return this.L;
   }

   public int N() {
      return this.y;
   }

   private void N(class04247 var1) {
      var1.R(this.y);
      class07316.y.encode(var1, this.L);
      var1.L(this.u);
      var1.L(this.i);
      var1.writeBoolean(this.R);
      var1.writeBoolean(this.M);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class05871> method_65080() {
      return class04248.S;
   }
}
