package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class05042(class06289 globalPos, float yaw, float pitch) {
   public static final class05042 N = new class05042(class06289.N(class07299.field_25179, class07209.field_10980), 0.0F, 0.0F);
   public static final MapCodec<class05042> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06289.N.forGetter(class05042::L),
            Codec.floatRange(-180.0F, 180.0F).fieldOf("yaw").forGetter(class05042::u),
            Codec.floatRange(-90.0F, 90.0F).fieldOf("pitch").forGetter(class05042::i)
         )
         .apply(var0, class05042::new)
   );
   public static final Codec<class05042> L = y.codec();
   public static final class02362<ByteBuf, class05042> u = class02362.N(
      class06289.L, class05042::L, class02389.E, class05042::u, class02389.E, class05042::i, class05042::new
   );

   public class06289 L() {
      return this.globalPos;
   }

   public class05042(class06289 globalPos, float yaw, float pitch) {
      this.globalPos = globalPos;
      this.yaw = yaw;
      this.pitch = pitch;
   }

   public float i() {
      return this.pitch;
   }

   public float u() {
      return this.yaw;
   }

   public class07209 y() {
      return this.globalPos.y();
   }

   public static class05042 N(class05946<class07299> var0, class07209 var1, float var2, float var3) {
      return new class05042(class06289.N(var0, var1.method_10062()), class04995.R(var2), class04995.N(var3, -90.0F, 90.0F));
   }

   public class05946<class07299> N() {
      return this.globalPos.N();
   }
}
