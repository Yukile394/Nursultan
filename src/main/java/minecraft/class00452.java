package minecraft;

import io.netty.buffer.ByteBuf;

public record class00452(int priority, boolean isRunning, String name) {
   public static final class02362<ByteBuf, class00452> N = class02362.N(
      class02389.B, class00452::N, class02389.y, class00452::y, class02389.y(255), class00452::L, class00452::new
   );

   public String L() {
      return this.name;
   }

   public class00452(int priority, boolean isRunning, String name) {
      super();
      this.priority = priority;
      this.isRunning = isRunning;
      this.name = name;
   }

   public boolean y() {
      return this.isRunning;
   }

   public int N() {
      return this.priority;
   }
}
