package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class08186(class08155 type, int duration) {
   public static final class08186 N = new class08186(class08155.field_63399, 6);
   public static final Codec<class08186> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class08155.field_63401.optionalFieldOf("type", N.type).forGetter(class08186::N),
            class06338.b.optionalFieldOf("duration", N.duration).forGetter(class08186::y)
         )
         .apply(var0, class08186::new)
   );
   public static final class02362<ByteBuf, class08186> L = class02362.N(class08155.field_63402, class08186::N, class02389.B, class08186::y, class08186::new);

   public class08186(class08155 type, int duration) {
      super();
      this.type = type;
      this.duration = duration;
   }

   public int y() {
      return this.duration;
   }

   public class08155 N() {
      return this.type;
   }
}
