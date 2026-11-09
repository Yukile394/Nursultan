package minecraft;

public record class00252<T extends class06521<?>>(class06510 input, class00239<T> recipe) {

   public class00239<T> L() {
      return this.recipe;
   }

   public class00252(class06510 input, class00239<T> recipe) {
      super();
      this.input = input;
      this.recipe = recipe;
   }

   public class06510 y() {
      return this.input;
   }

   public static <T extends class06521<?>> class02362<class04247, class00252<T>> N() {
      return class02362.N(class06510.field_48355, class00252::y, class00239.N(), class00252::L, class00252::new);
   }
}
