package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class02017(class01894 id, Optional<class07709> data) {
   public static final class02362<ByteBuf, class02017> N = class02362.N(
      class01894.y, class02017::N, class02389.T.N_33(class02389::N), class02017::y, class02017::new
   );

   public class02017(class01894 id, Optional<class07709> data) {
      super();
      this.id = id;
      this.data = data;
   }

   public Optional<class07709> y() {
      return this.data;
   }

   public class01894 N() {
      return this.id;
   }
}
