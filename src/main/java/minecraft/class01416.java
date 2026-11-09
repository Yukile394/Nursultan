package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

record class01416(String value) implements class01426 {
   public static final Codec<class01416> N = Codec.STRING.xmap(class01416::new, class01416::N);
   public static final class02362<ByteBuf, class01416> y = class02389.s.N_10(class01416::new, class01416::N);

   class01416(String value) {
      this.value = value;
   }

   public String N() {
      return this.value;
   }

   @Override
   public <T extends Comparable<T>> boolean N(class00522<?, ?> var1, class08092<T> var2) {
      Comparable comparable = var1.L(var2);
      Optional optional = var2.y(this.value);
      return optional.isPresent() && comparable.compareTo((Comparable)optional.get()) == 0;
   }
}
