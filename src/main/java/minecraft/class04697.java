package minecraft;

class class04697 extends Thread {
   class04697(class04736 var1, String var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();

      try {
         class05434 class05434xxx = class05111.N(1, 10, class04969.field_19437);
         class05434 class05434x = class05111.N(1, 10, class04969.field_19439);
         class05434 class05434xx = class05111.N(1, 10, class04969.field_19440);
         class05434 class05434xxx = class05111.N(1, 10, class04969.field_19441);
         class04736.N(this.N).execute(() -> {
            this.N.L = class05434xxx;
            this.N.u = class05434xx;
            this.N.i = class05434x;
            this.N.R = class05434;
         });
      } catch (class05097 class05097) {
         class04736.N.error("Couldn't fetch templates in reset world", class05097);
      }
   }
}
