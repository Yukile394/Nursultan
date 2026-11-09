package minecraft;

import java.util.List;
import java.util.function.ToIntFunction;

public record class03923(List<class04336> features, ToIntFunction<class04336> indexMapping) {
   class03923(List<class04336> var1) {
      this(var1, class07536.M(var1));
   }

   public class03923(List<class04336> features, ToIntFunction<class04336> indexMapping) {
      this.features = features;
      this.indexMapping = indexMapping;
   }

   public ToIntFunction<class04336> y() {
      return this.indexMapping;
   }

   public List<class04336> N() {
      return this.features;
   }
}
