package minecraft;

public final class class07257 extends class07739 {
   private final class07739 N;
   private final int y;
   private final int L;
   private final int u;
   private final int i;
   private final int R;
   private final int M;

   public class07257(class07739 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5 - var2, var6 - var3, var7 - var4);
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
   }

   private int N(class07185 var1, int var2) {
      int ix = var1.N(this.y, this.L, this.u);
      int j = var1.N(this.i, this.R, this.M);
      return class04995.N(var2, ix, j) - ix;
   }

   @Override
   public int method_1045(class07185 var1) {
      return this.N(var1, this.N.method_1045(var1));
   }

   @Override
   public int method_1055(class07185 var1) {
      return this.N(var1, this.N.method_1055(var1));
   }

   @Override
   public boolean method_1063(int var1, int var2, int var3) {
      return this.N.method_1063(this.y + var1, this.L + var2, this.u + var3);
   }

   @Override
   public void method_1049(int var1, int var2, int var3) {
      this.N.method_1049(this.y + var1, this.L + var2, this.u + var3);
   }
}
