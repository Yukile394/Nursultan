package minecraft;

import com.mojang.datafixers.util.Either;

class class04727 extends Thread {
   class04727(class04739 var1, String var2, class05434 var3) {
      super(var2);
      this.y = var1;
      this.N = var3;
   }

   @Override
   public void run() {
      class05434 class05434 = this.N;
      class05111 class05111 = class05111.N();

      while (class05434 != null) {
         Either<class05434, Exception> either = this.y.N(class05434, class05111);
         class05434 = class04739.N(this.y).N(() -> {
            if (either.right().isPresent()) {
               class04739.N.error("Couldn't fetch templates", (Throwable)either.right().get());
               if (this.y.i.y()) {
                  this.y.B = class04591.N(class08392.N("mco.template.select.failure"));
               }

               return null;
            } else {
               class05434 class05434x = (class05434)either.left().get();

               for (class04982 class04982 : class05434x.y()) {
                  this.y.i.N(class04982);
               }

               if (class05434x.y().isEmpty()) {
                  if (this.y.i.y()) {
                     String s = class08392.N("mco.template.select.none", "%link");
                     class04638 class04638 = class04638.N(class08392.N("mco.template.select.none.linkTitle"), class03597.v.toString());
                     this.y.B = class04591.N(s, class04638);
                  }

                  return null;
               } else {
                  return class05434x;
               }
            }
         }).join();
      }
   }
}
