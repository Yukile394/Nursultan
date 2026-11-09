package minecraft;

import java.util.List;

record class06699(class07357 file, List<class07321> chunksToUpgrade) {

   class06699(class07357 file, List<class07321> chunksToUpgrade) {
      this.file = file;
      this.chunksToUpgrade = chunksToUpgrade;
   }

   public List<class07321> y() {
      return this.chunksToUpgrade;
   }

   public class07357 N() {
      return this.file;
   }
}
