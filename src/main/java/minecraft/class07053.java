package minecraft;

class class07053 {
   private float N;
   private float y;

   private static boolean L(class07055 var0) {
      return !var0.N(var0.L().N().u());
   }

   class07053() {
      super();
   }

   public void y(class07055 var1) {
      this.y = this.N;
      boolean flag = L(var1);
      float f = flag ? 1.0F : 0.0F;
      if (this.N != f) {
         class07084 class07084 = var1.L().N();
         int i = flag ? class07084.y() : class07084.L();
         if (i == 0) {
            this.N = f;
         } else {
            float f1 = 1.0F / i;
            this.N = this.N + class04995.N(f - this.N, -f1, f1);
         }
      }
   }

   public void N(class07053 var1) {
      this.N = var1.N;
      this.y = var1.y;
   }

   public void N(class07055 var1) {
      this.N = L(var1) ? 1.0F : 0.0F;
      this.y = this.N;
   }

   public float N(class07438 var1, float var2) {
      if (var1.method_31481()) {
         this.y = this.N;
      }

      return class04995.B(var2, this.y, this.N);
   }
}
