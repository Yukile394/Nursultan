package minecraft;

public class class02963 {
   private int N;
   private int y;
   private int L;
   private int u;

   public int L() {
      return this.L;
   }

   public void L(int var1) {
      this.L = var1;
   }

   public class02963(int var1, int var2, int var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public void u(int var1) {
      this.u = var1;
   }

   public int u() {
      return this.u;
   }

   public boolean y(int var1, int var2) {
      return var1 >= this.N && var1 <= this.N + this.L && var2 >= this.y && var2 <= this.y + this.u;
   }

   public int y() {
      return this.y;
   }

   public void y(int var1) {
      this.y = var1;
   }

   public void N(int var1) {
      this.N = var1;
   }

   public void N(int var1, int var2) {
      this.N = var1;
      this.y = var2;
   }

   public int N() {
      return this.N;
   }

   public class02963 N(class02963 var1) {
      int i = this.N;
      int j = this.y;
      int k = this.N + this.L;
      int l = this.y + this.u;
      int i1 = var1.N();
      int j1 = var1.y();
      int k1 = i1 + var1.L();
      int l1 = j1 + var1.u();
      this.N = Math.max(i, i1);
      this.y = Math.max(j, j1);
      this.L = Math.max(0, Math.min(k, k1) - this.N);
      this.u = Math.max(0, Math.min(l, l1) - this.y);
      return this;
   }
}
