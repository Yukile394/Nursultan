package minecraft;

class class06186 {
   double N;
   double y;

   class06186() {
      super();
   }

   double y() {
      return Math.sqrt(this.N * this.N + this.y * this.y);
   }

   public void y(class06186 var1) {
      this.N = this.N - var1.N;
      this.y = this.y - var1.y;
   }

   public boolean y(class07290 var1, int var2) {
      class07209 class07209 = class07209.method_49637(this.N, this.N(var1, var2) - 1, this.y);
      class00500 class00500 = var1.method_8320(class07209);
      return class07209.method_10264() < var2 && !class00500.T() && !class00500.N(class01210.Nh);
   }

   public void N(class06069 var1, double var2, double var4, double var6, double var8) {
      this.N = class04995.N(var1, var2, var6);
      this.y = class04995.N(var1, var4, var8);
   }

   double N(class06186 var1) {
      double d0 = this.N - var1.N;
      double d1 = this.y - var1.y;
      return Math.sqrt(d0 * d0 + d1 * d1);
   }

   public int N(class07290 var1, int var2) {
      class07218 class07218 = new class07218(this.N, (double)(var2 + 1), this.y);
      boolean flag = var1.method_8320(class07218).P();
      class07218.N(class07211.field_11033);
      boolean flag1 = var1.method_8320(class07218).P();

      while (class07218.method_10264() > var1.method_31607()) {
         class07218.N(class07211.field_11033);
         boolean flag2 = var1.method_8320(class07218).P();
         if (!flag2 && flag1 && flag) {
            return class07218.method_10264() + 1;
         }

         flag = flag1;
         flag1 = flag2;
      }

      return var2 + 1;
   }

   public boolean N(double var1, double var3, double var5, double var7) {
      boolean flag = false;
      if (this.N < var1) {
         this.N = var1;
         flag = true;
      } else if (this.N > var5) {
         this.N = var5;
         flag = true;
      }

      if (this.y < var3) {
         this.y = var3;
         flag = true;
      } else if (this.y > var7) {
         this.y = var7;
         flag = true;
      }

      return flag;
   }

   void N() {
      double d0 = this.y();
      this.N /= d0;
      this.y /= d0;
   }
}
