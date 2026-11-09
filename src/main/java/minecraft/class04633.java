package minecraft;

@FunctionalInterface
public interface class04633 extends class04621<Void> {
   void accept(class05111 var1) throws class05097;

   default Void apply(class05111 var1) throws class05097 {
      this.accept(var1);
      return null;
   }
}
