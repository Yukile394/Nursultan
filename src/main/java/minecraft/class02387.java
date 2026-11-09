package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Supplier;

class class02387 implements class02362<ByteBuf, Optional<class07709>> {
   class02387(Supplier var1) {
      super();
      this.N = var1;
   }

   public Optional<class07709> decode(ByteBuf var1) {
      return Optional.ofNullable(class00667.N(var1, (class07726)this.N.get()));
   }

   public void encode(ByteBuf var1, Optional<class07709> var2) {
      class00667.N(var1, (class07709)var2.orElse(null));
   }
}
