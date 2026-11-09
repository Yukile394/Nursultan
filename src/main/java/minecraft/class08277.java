package minecraft;

class class08277 {
   private final int y;
   private final int L;
   private final int u;
   private final int i;
   private final String R;
   int N = 1;

   class08277(int var1, int var2, int var3, int var4, String var5) {
      super();
      this.y = var3;
      this.L = var1;
      this.u = var2;
      this.i = var4;
      this.R = var5;
   }

   @Override
   public String toString() {
      return "id="
         + this.y
         + ", source="
         + class08263.N(this.L)
         + ", type="
         + class08263.y(this.u)
         + ", severity="
         + class08263.L(this.i)
         + ", message='"
         + this.R
         + "'";
   }

   boolean N(int var1, int var2, int var3, int var4, String var5) {
      return var2 == this.u && var1 == this.L && var3 == this.y && var4 == this.i && var5.equals(this.R);
   }
}
