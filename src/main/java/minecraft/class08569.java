package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record class08569(String suffix) {
   public static final Codec<class08569> N = class06338.X.xmap(class08569::new, class08569::N);
   public static final class02362<ByteBuf, class08569> y = class02389.s.N_10(class08569::new, class08569::N);

   public class08569(String suffix) {
      super();
      if (!class01894.Z(suffix)) {
         throw new IllegalArgumentException("Invalid string to use as a resource path element: " + suffix);
      } else {
         this.suffix = suffix;
      }
   }

   public String N() {
      return this.suffix;
   }
}
