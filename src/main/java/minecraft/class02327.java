package minecraft;

public record class02327<S>(class02315<S> term, boolean positive) implements class02315<S> {
   public class02327(class02315<S> term, boolean positive) {
      super();
      this.term = term;
      this.positive = positive;
   }

   public boolean y() {
      return this.positive;
   }

   public class02315<S> N() {
      return this.term;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      int i = var1.M();
      boolean flag = this.term.N(var1.i(), var2, var3);
      var1.N(i);
      return this.positive == flag;
   }
}
