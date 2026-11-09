package minecraft;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.util.Pair;

record class00228(OpticFinder<?> itemFinder, OpticFinder<Pair<String, String>> itemIdFinder) {
   class00228(OpticFinder<?> itemFinder, OpticFinder<Pair<String, String>> itemIdFinder) {
      this.itemFinder = itemFinder;
      this.itemIdFinder = itemIdFinder;
   }

   public OpticFinder<Pair<String, String>> y() {
      return this.itemIdFinder;
   }

   public String N(Typed<?> var1) {
      return var1.getOptionalTyped(this.itemFinder)
         .flatMap(var1x -> var1x.getOptional(this.itemIdFinder))
         .<String>map(Pair::getSecond)
         .map(class00622::N)
         .orElse("");
   }

   public OpticFinder<?> N() {
      return this.itemFinder;
   }
}
