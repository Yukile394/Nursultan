package minecraft;

class class01122<T> implements class01113 {
   private final T L;
   private long u;
   private class01101<T> i;

   class01122(T var1, long var2, class01101<T> param4, class01101 var5) {
      super();
      this.y = var1;
      this.L = (T)var2;
      this.u = var3;
      this.i = var5;
   }

   @Override
   public void N() {
      long ix = class01296.L(this.L.method_24515());
      if (ix != this.u) {
         class01102 class01102 = this.i.L();
         if (!this.i.y(this.L)) {
            class01115.N.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.L, class01296.N(this.u), ix});
         }

         this.y.N(this.u, this.i);
         class01101 class01101 = this.y.u.L(ix);
         class01101.N(this.L);
         this.i = class01101;
         this.u = ix;
         this.y.y.N(this.L);
         if (!this.L.method_31747()) {
            boolean flag = class01102.N();
            boolean flag1 = class01101.L().N();
            if (flag && !flag1) {
               this.y.y.u(this.L);
            } else if (!flag && flag1) {
               this.y.y.i(this.L);
            }
         }
      }
   }

   @Override
   public void N(class07062 var1) {
      if (!this.i.y(this.L)) {
         class01115.N.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.L, class01296.N(this.u), var1});
      }

      if (this.i.L().N() || this.L.method_31747()) {
         this.y.y.u(this.L);
      }

      this.y.y.y(this.L);
      this.y.y.R(this.L);
      this.y.L.y(this.L);
      this.L.method_31744(N);
      this.y.N(this.u, this.i);
   }
}
