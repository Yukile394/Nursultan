package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06034 extends class06212 {
   public static final MapCodec<class06034> M = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.y),
            class03855.L.fieldOf("y").forGetter(var0x -> var0x.B),
            class06052.L.fieldOf("yScale").forGetter(var0x -> var0x.Z),
            class06055.N.fieldOf("lava_level").forGetter(var0x -> var0x.z),
            class06050.y.optionalFieldOf("debug_settings", class06050.N).forGetter(var0x -> var0x.U),
            class03541.N(class04227.Z).fieldOf("replaceable").forGetter(var0x -> var0x.E)
         )
         .apply(var0, class06034::new)
   );
   public final class03855 B;
   public final class06052 Z;
   public final class06055 z;
   public final class06050 U;
   public final class03543<class00891> E;

   public class06034(float var1, class03855 var2, class06052 var3, class06055 var4, class06050 var5, class03543<class00891> var6) {
      super(var1);
      this.B = var2;
      this.Z = var3;
      this.z = var4;
      this.U = var5;
      this.E = var6;
   }
}
