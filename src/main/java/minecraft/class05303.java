package minecraft;

import java.util.List;

public record class05303(int x, int y, List<class06584> ingredients) {

   public List<class06584> L() {
      return this.ingredients;
   }

   public class05303(int x, int y, List<class06584> ingredients) {
      if (ingredients.isEmpty()) {
         throw new IllegalArgumentException("Ingredient list must be non-empty");
      } else {
         this.x = x;
         this.y = y;
         this.ingredients = ingredients;
      }
   }

   public int N() {
      return this.x;
   }

   public class06584 N(int var1) {
      return this.ingredients.get(var1 % this.ingredients.size());
   }
}
