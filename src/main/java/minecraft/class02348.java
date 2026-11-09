package minecraft;

record class02348<S, T>(class02356<S, T> ruleToParse, class02353<T> nameToStore) implements class02315<S> {
   class02348(class02356<S, T> ruleToParse, class02353<T> nameToStore) {
      this.ruleToParse = ruleToParse;
      this.nameToStore = nameToStore;
   }

   public class02353<T> y() {
      return this.nameToStore;
   }

   public class02356<S, T> N() {
      return this.ruleToParse;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      Object object = var1.N(this.ruleToParse);
      if (object == null) {
         return false;
      } else {
         var2.N(this.nameToStore, (T)object);
         return true;
      }
   }
}
