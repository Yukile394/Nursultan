package minecraft;

import java.util.List;

public record class01078(class00392 description, class01614 compatibility, class03767 requestedFeatures, List<String> overlays) {

   public class03767 L() {
      return this.requestedFeatures;
   }

   public class01078(class00392 description, class01614 compatibility, class03767 requestedFeatures, List<String> overlays) {
      this.description = description;
      this.compatibility = compatibility;
      this.requestedFeatures = requestedFeatures;
      this.overlays = overlays;
   }

   public List<String> u() {
      return this.overlays;
   }

   public class01614 y() {
      return this.compatibility;
   }

   public class00392 N() {
      return this.description;
   }
}
