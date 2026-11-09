package minecraft;

import org.jspecify.annotations.Nullable;

public record class02413(float ticks, class07211 shakeDirection) {

   public class02413(float ticks, @Nullable class07211 shakeDirection) {
      this.ticks = ticks;
      this.shakeDirection = shakeDirection;
   }

   @Nullable
   public class07211 y() {
      return this.shakeDirection;
   }

   public float N() {
      return this.ticks;
   }
}
