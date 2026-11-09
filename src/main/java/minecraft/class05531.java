package minecraft;

import java.util.Collection;

public record class05531(int index, Collection<class05513> gameTestInfos, class03556<class00225> environment) {
   public class03556<class00225> L() {
      return this.environment;
   }

   public class05531(int index, Collection<class05513> gameTestInfos, class03556<class00225> environment) {
      super();
      if (gameTestInfos.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.index = index;
         this.gameTestInfos = gameTestInfos;
         this.environment = environment;
      }
   }

   public Collection<class05513> y() {
      return this.gameTestInfos;
   }

   public int N() {
      return this.index;
   }
}
