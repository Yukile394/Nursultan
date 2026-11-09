package minecraft;

public class class05673 implements class05663 {
   private final class02680 N;
   private final int y;
   private final int L;
   private final int u;
   private final float i;

   public class05673(class02680 var1, int var2, int var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = 0.05F;
   }

   public class05673(class07310 var1, int var2, int var3, int var4, int var5) {
      this(new class02680(var1.B(), var2), var3, var4, var5);
   }

   public class05673(class07310 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 1);
   }

   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      return new class07324(this.N, new class06584(class06570.Ty, this.u), this.y, this.L, this.i);
   }
}
