package minecraft;

public record class02200<S>(class02315<S>[] elements) implements class02315<S> {
   public class02200(class02315<S>[] elements) {
      this.elements = elements;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      int i = var1.M();
      class02315[] aclass02315 = this.elements;
      int j = aclass02315.length;

      for (int k = 0; k < j; k++) {
         if (!aclass02315[k].N(var1, var2, var3)) {
            var1.N(i);
            return false;
         }
      }

      return true;
   }

   public class02315<S>[] N() {
      return this.elements;
   }
}
