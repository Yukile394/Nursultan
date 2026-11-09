package minecraft;

class class08258 implements AutoCloseable {
   private class07769 y;
   private final class08829 L;
   private boolean u = true;
   final class01894 N;

   class08258(class08265 var1, int var2, class07769 var3) {
      super();
      this.y = var3;
      this.L = new class08829(() -> "Map " + var2, 128, 128, true);
      this.N = class01894.y("map/" + var2);
      var1.N.N(this.N, this.L);
   }

   @Override
   public void close() {
      this.L.close();
   }

   void y() {
      if (this.u) {
         class08280 class08280 = this.L.method_4525();
         if (class08280 != null) {
            for (int i = 0; i < 128; i++) {
               for (int j = 0; j < 128; j++) {
                  int k = j + i * 128;
                  class08280.y(j, i, class04689.y(this.y.B[k]));
               }
            }
         }

         this.L.method_4524();
         this.u = false;
      }
   }

   public void N() {
      this.u = true;
   }

   void N(class07769 var1) {
      boolean flag = this.y != var1;
      this.y = var1;
      this.u |= flag;
   }
}
