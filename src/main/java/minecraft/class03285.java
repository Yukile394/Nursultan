package minecraft;

import java.util.function.Predicate;

public record class03285(int slotIndex, int x, int y, Predicate<class06584> mayPlace) {
   static final class03285 y_const = new class03285(0, 0, 0, var0 -> true);

   public int L() {
      return this.y;
   }

   public class03285(int slotIndex, int x, int y, Predicate<class06584> mayPlace) {
      this.slotIndex = slotIndex;
      this.x = x;
      this.y = y;
      this.mayPlace = mayPlace;
   }

   public Predicate<class06584> u() {
      return this.mayPlace;
   }

   public int y() {
      return this.x;
   }

   public int N() {
      return this.slotIndex;
   }
}
