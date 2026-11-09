package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06212 implements class06386 {
   public static final Codec<class06212> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.y)).apply(var0, class06212::new)
   );
   public final float y;

   public class06212(float var1) {
      super();
      this.y = var1;
   }
}
