package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record class02716(int rgb) {
   public static final Codec<class02716> N = Codec.INT.xmap(class02716::new, class02716::N);
   public static final class02362<ByteBuf, class02716> y = class02389.M.N_10(class02716::new, class02716::N);
   public static final class02716 L = new class02716(4603950);

   public class02716(int rgb) {
      super();
      this.rgb = rgb;
   }

   public int N() {
      return this.rgb;
   }
}
