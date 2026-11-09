package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class03953(class00392 motd, Optional<byte[]> iconBytes) implements class00381<class07280> {
   public static final class02362<ByteBuf, class03953> N = class02362.N(
      class03748.R, class03953::N, class02389.m.N_33(class02389::N), class03953::y, class03953::new
   );

   public class03953(class00392 motd, Optional<byte[]> iconBytes) {
      super();
      this.motd = motd;
      this.iconBytes = iconBytes;
   }

   public Optional<byte[]> y() {
      return this.iconBytes;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.motd;
   }

   @Override
   public class02897<class03953> method_65080() {
      return class04248.Nd;
   }
}
