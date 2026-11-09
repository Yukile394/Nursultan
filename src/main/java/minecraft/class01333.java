package minecraft;

public class class01333 extends class01342 {
   private final class06143 y;
   protected boolean N;

   class01333(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14.method_74304());
      this.y = var14;
      this.method_3087(1.5F);
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public int method_3068(float var1) {
      return this.N ? 240 : super.method_3068(var1);
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.y);
   }
}
