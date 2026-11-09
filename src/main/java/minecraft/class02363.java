package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

class class02363 implements class02362<ByteBuf, Optional<class07001>> {
   class02363() {
      super();
   }

   public Optional<class07001> decode(ByteBuf var1) {
      return Optional.ofNullable(class00667.Z(var1));
   }

   public void encode(ByteBuf var1, Optional<class07001> var2) {
      class00667.N(var1, (class07709)var2.orElse(null));
   }
}
