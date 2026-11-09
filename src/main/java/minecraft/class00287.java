package minecraft;

public interface class00287<T> extends class00308<T> {
   T y(class06584 var1);

   default T N(class06581 var1) {
      return this.y(new class06584(var1));
   }

   default T N(class03556<class06581> var1) {
      return this.y(new class06584(var1));
   }
}
