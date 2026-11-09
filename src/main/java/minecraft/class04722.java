package minecraft;

public class class04722 extends class05129 {
   private static final class00392 y = class00392.L("mco.connect.connecting");
   private final class05435 L;
   private final class04981 u;
   private final class00093 i;

   @Override
   public void L() {
      this.L.y();
   }

   public class04722(class05096 var1, class04981 var2, class00093 var3) {
      super();
      this.u = var2;
      this.i = var3;
      this.L = new class05435(var1);
   }

   @Override
   public void run() {
      if (this.i.N() != null) {
         this.L.N(this.u, class03420.N(this.i.N()));
      } else {
         this.i();
      }
   }

   @Override
   public void i() {
      super.i();
      this.L.N();
      class06202.Nq().yL().Z();
   }

   @Override
   public class00392 N() {
      return y;
   }
}
