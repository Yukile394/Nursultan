package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class00464(Optional<Integer> attackTarget, Optional<class07209> jumpTarget) {
   public static final class02362<ByteBuf, class00464> N = class02362.N(
      class02389.B.N_33(class02389::N), class00464::N, class07209.field_48404.N_33(class02389::N), class00464::y, class00464::new
   );

   public class00464(Optional<Integer> attackTarget, Optional<class07209> jumpTarget) {
      this.attackTarget = attackTarget;
      this.jumpTarget = jumpTarget;
   }

   public Optional<class07209> y() {
      return this.jumpTarget;
   }

   public Optional<Integer> N() {
      return this.attackTarget;
   }
}
