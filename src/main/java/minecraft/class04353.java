package minecraft;

import java.util.List;
import java.util.Map;

public record class04353(float lengthInSeconds, boolean looping, Map<String, List<class04373>> boneAnimations) {
   public Map<String, List<class04373>> L() {
      return this.boneAnimations;
   }

   public class04353(float lengthInSeconds, boolean looping, Map<String, List<class04373>> boneAnimations) {
      super();
      this.lengthInSeconds = lengthInSeconds;
      this.looping = looping;
      this.boneAnimations = boneAnimations;
   }

   public boolean y() {
      return this.looping;
   }

   public float N() {
      return this.lengthInSeconds;
   }

   public class00094 N(class01686 var1) {
      return class00094.N(var1, this);
   }
}
