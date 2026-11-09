package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import org.apache.commons.lang3.mutable.MutableInt;

record class04313(Object2IntMap<class04318> featureData, MutableInt chunksWithFeatures) {
   class04313(Object2IntMap<class04318> featureData, MutableInt chunksWithFeatures) {
      this.featureData = featureData;
      this.chunksWithFeatures = chunksWithFeatures;
   }

   public MutableInt y() {
      return this.chunksWithFeatures;
   }

   public Object2IntMap<class04318> N() {
      return this.featureData;
   }
}
