package minecraft;

public record class00450(class00143 path, float maxNodeDistance) {
   public static final class02362<class00667, class00450> N = class02362.N(class00143.N, class00450::N, class02389.E, class00450::y, class00450::new);

   public class00450(class00143 path, float maxNodeDistance) {
      this.path = path;
      this.maxNodeDistance = maxNodeDistance;
   }

   public float y() {
      return this.maxNodeDistance;
   }

   public class00143 N() {
      return this.path;
   }
}
