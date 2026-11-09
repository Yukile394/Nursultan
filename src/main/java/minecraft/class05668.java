package minecraft;

public abstract class class05668 extends class08031 implements class05640 {
   private static final class02131<class06584> N = class03289.N(class05668.class, class02154.B);

   @Override
   public class06584 L() {
      return this.method_5841().N(N);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(N, new class06584(this.N()));
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Item", class06584.y, this.L());
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class06584>N("Item", class06584.y).orElseGet(() -> new class06584(this.N())));
   }

   public class05668(class07078<? extends class05668> var1, class07299 var2) {
      super(var1, var2);
   }

   public class05668(class07078<? extends class05668> var1, double var2, double var4, double var6, class07299 var8, class06584 var9) {
      super(var1, var2, var4, var6, var8);
      this.N(var9);
   }

   public class05668(class07078<? extends class05668> var1, class07438 var2, class07299 var3, class06584 var4) {
      this(var1, var2.method_23317(), var2.method_23320() - 0.1F, var2.method_23321(), var3, var4);
      this.L(var2);
   }

   public void N(class06584 var1) {
      this.method_5841().N(N, var1.L(1));
   }

   protected abstract class06581 N();
}
