package minecraft;

public record class02342<S>(class02315<S>[] elements) implements class02315<S> {
   public class02342(class02315<S>[] elements) {
      super();
      this.elements = elements;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      class02328 class02328 = var1.L();

      try {
         int i = var1.M();
         var2.L();
         class02315[] aclass02315 = this.elements;
         int j = aclass02315.length;

         for (int k = 0; k < j; k++) {
            if (aclass02315[k].N(var1, var2, class02328)) {
               var2.i();
               return true;
            }

            var2.u();
            var1.N(i);
            if (class02328.y()) {
               break;
            }
         }

         var2.y();
         return false;
      } finally {
         var1.u();
      }
   }

   public class02315<S>[] N() {
      return this.elements;
   }
}
