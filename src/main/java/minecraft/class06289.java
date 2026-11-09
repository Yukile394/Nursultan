package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class06289(class05946<class07299> dimension, class07209 pos) {
   public static final MapCodec<class06289> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07299.field_25178.fieldOf("dimension").forGetter(class06289::N), class07209.field_25064.fieldOf("pos").forGetter(class06289::y))
         .apply(var0, class06289::N)
   );
   public static final Codec<class06289> y = N.codec();
   public static final class02362<ByteBuf, class06289> L = class02362.N(
      class05946.y(class04227.yg), class06289::N, class07209.field_48404, class06289::y, class06289::N
   );

   public class06289(class05946<class07299> dimension, class07209 pos) {
      this.dimension = dimension;
      this.pos = pos;
   }

   @Override
   public String toString() {
      return this.dimension + " " + this.pos;
   }

   public class07209 y() {
      return this.pos;
   }

   public class05946<class07299> N() {
      return this.dimension;
   }

   public static class06289 N(class05946<class07299> var0, class07209 var1) {
      return new class06289(var0, var1);
   }

   public boolean N(class05946<class07299> var1, class07209 var2, int var3) {
      return this.dimension.equals(var1) && this.pos.method_65076(var2) <= var3;
   }
}
