package minecraft;

public class class07483 extends class06937 {
   private final class07476 N;

   public static boolean L(class06584 var0) {
      return var0.N(class06570.jU);
   }

   public class07483(class07476 var1, class06695 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.N = var1;
   }

   @Override
   public boolean N(class06584 var1) {
      return this.N.L(var1) || L(var1);
   }

   @Override
   public int b_(class06584 var1) {
      return L(var1) ? 1 : super.b_(var1);
   }
}
