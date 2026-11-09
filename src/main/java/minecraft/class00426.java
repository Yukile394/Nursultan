package minecraft;

import io.netty.buffer.ByteBuf;

public record class00426(class05163 boundingBox, boolean isStart) {
   public static final class02362<ByteBuf, class00426> N = class02362.N(class05163.y, class00426::N, class02389.y, class00426::y, class00426::new);

   public class00426(class05163 boundingBox, boolean isStart) {
      super();
      this.boundingBox = boundingBox;
      this.isStart = isStart;
   }

   public boolean y() {
      return this.isStart;
   }

   public class05163 N() {
      return this.boundingBox;
   }
}
