package minecraft;

public record class06636(int containerId, class00265 recipeDisplay) implements class00381<class07280> {
   public static final class02362<class04247, class06636> N = class02362.N(class02389.l, class06636::N, class00265.i, class06636::y, class06636::new);

   public class06636(int containerId, class00265 recipeDisplay) {
      super();
      this.containerId = containerId;
      this.recipeDisplay = recipeDisplay;
   }

   public class00265 y() {
      return this.recipeDisplay;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.containerId;
   }

   @Override
   public class02897<class06636> method_65080() {
      return class04248.Ni;
   }
}
