package minecraft;

import java.util.HashMap;
import java.util.Map;

public record class08069(Map<class05946<class00263>, class00263> itemSets, class00279<class06156> stonecutterRecipes) implements class00381<class07280> {
   public static final class02362<class04247, class08069> N = class02362.N(
      class02389.N(HashMap::new, class05946.y(class00263.N), class00263.Z), class08069::N, class00279.y(), class08069::y, class08069::new
   );

   public class08069(Map<class05946<class00263>, class00263> itemSets, class00279<class06156> stonecutterRecipes) {
      super();
      this.itemSets = itemSets;
      this.stonecutterRecipes = stonecutterRecipes;
   }

   public class00279<class06156> y() {
      return this.stonecutterRecipes;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public Map<class05946<class00263>, class00263> N() {
      return this.itemSets;
   }

   @Override
   public class02897<class08069> method_65080() {
      return class04248.ym;
   }
}
