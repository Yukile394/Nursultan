package minecraft;

@FunctionalInterface
public interface class02318<S, T> extends class02341<S, T> {
   T run(class02332 var1);

   @Override
   default T run(class02325<S> var1) {
      return this.run(var1.N());
   }
}
