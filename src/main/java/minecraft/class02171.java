package minecraft;

public record class02171<S>(class02315<S> term) implements class02315<S> {
   public class02171(class02315<S> term) {
      super();
      this.term = term;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      int i = var1.M();
      if (!this.term.N(var1, var2, var3)) {
         var1.N(i);
      }

      return true;
   }

   public class02315<S> N() {
      return this.term;
   }
}
