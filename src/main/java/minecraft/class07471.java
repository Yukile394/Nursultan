package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class07471(class01894 id, double amount, class07463 operation) {
   public static final MapCodec<class07471> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("id").forGetter(class07471::N),
            Codec.DOUBLE.fieldOf("amount").forGetter(class07471::y),
            class07463.field_45742.fieldOf("operation").forGetter(class07471::L)
         )
         .apply(var0, class07471::new)
   );
   public static final Codec<class07471> y = N.codec();
   public static final class02362<ByteBuf, class07471> L = class02362.N(
      class01894.y, class07471::N, class02389.W, class07471::y, class07463.field_48326, class07471::L, class07471::new
   );

   public class07463 L() {
      return this.operation;
   }

   public class07471(class01894 id, double amount, class07463 operation) {
      this.id = id;
      this.amount = amount;
      this.operation = operation;
   }

   public double y() {
      return this.amount;
   }

   public boolean N(class01894 var1) {
      return var1.equals(this.id);
   }

   public class01894 N() {
      return this.id;
   }
}
