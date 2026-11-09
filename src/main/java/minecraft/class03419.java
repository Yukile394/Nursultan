package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

class class03419 implements class02362<ByteBuf, Optional<class00500>> {
   class03419() {
      super();
   }

   public void encode(ByteBuf var1, Optional<class00500> var2) {
      if (var2.isPresent()) {
         class01657.N(var1, class00891.W((class00500)var2.get()));
      } else {
         class01657.N(var1, 0);
      }
   }

   public Optional<class00500> decode(ByteBuf var1) {
      int i = class01657.N(var1);
      return i == 0 ? Optional.empty() : Optional.of(class00891.N(i));
   }
}
