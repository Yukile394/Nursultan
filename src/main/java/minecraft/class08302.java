package minecraft;

import org.jspecify.annotations.Nullable;

public record class08302(class00050 preference, class00082 region) {

   public class08302(class00050 preference, @Nullable class00082 region) {
      super();
      this.preference = preference;
      this.region = region;
   }

   @Nullable
   public class00082 y() {
      return this.region;
   }

   public class00050 N() {
      return this.preference;
   }
}
