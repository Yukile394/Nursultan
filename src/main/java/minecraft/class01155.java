package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class01155(class07209 pos) implements class01190 {
   public static final MapCodec<class01155> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07209.field_25064.fieldOf("pos").forGetter(class01155::y)).apply(var0, class01155::new)
   );
   public static final class02362<ByteBuf, class01155> y = class02362.N(class07209.field_48404, class01155::y, class01155::new);

   public class01155(class07209 pos) {
      this.pos = pos;
   }

   public class07209 y() {
      return this.pos;
   }

   @Override
   public class01182<class01155> N() {
      return class01182.N;
   }

   @Override
   public Optional<class06889> N(class07299 var1) {
      return Optional.of(class06889.y(this.pos));
   }
}
