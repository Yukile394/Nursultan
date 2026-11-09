package minecraft;

import java.util.Optional;

record class04318(class03238<?, ?> feature, Optional<class04336> topFeature) {
   class04318(class03238<?, ?> feature, Optional<class04336> topFeature) {
      super();
      this.feature = feature;
      this.topFeature = topFeature;
   }

   public Optional<class04336> y() {
      return this.topFeature;
   }

   public class03238<?, ?> N() {
      return this.feature;
   }
}
