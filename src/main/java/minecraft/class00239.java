package minecraft;

import java.util.Optional;

public record class00239<T extends class06521<?>>(class00299 optionDisplay, Optional<class03729<T>> recipe) {
   public Optional<class03729<T>> L() {
      return this.recipe;
   }

   public class00239(class00299 optionDisplay, Optional<class03729<T>> recipe) {
      super();
      this.optionDisplay = optionDisplay;
      this.recipe = recipe;
   }

   public class00299 y() {
      return this.optionDisplay;
   }

   public static <T extends class06521<?>> class02362<class04247, class00239<T>> N() {
      return class02362.N(class00299.y, class00239::y, var0 -> new class00239<>(var0, Optional.empty()));
   }
}
