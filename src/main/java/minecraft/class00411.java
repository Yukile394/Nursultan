package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class00411 {
   public static final MapCodec<class00405> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class05194.N.optionalFieldOf("color").forGetter(var0x -> Optional.ofNullable(var0x.L)),
            class06338.W.optionalFieldOf("shadow_color").forGetter(var0x -> Optional.ofNullable(var0x.u)),
            Codec.BOOL.optionalFieldOf("bold").forGetter(var0x -> Optional.ofNullable(var0x.i)),
            Codec.BOOL.optionalFieldOf("italic").forGetter(var0x -> Optional.ofNullable(var0x.R)),
            Codec.BOOL.optionalFieldOf("underlined").forGetter(var0x -> Optional.ofNullable(var0x.M)),
            Codec.BOOL.optionalFieldOf("strikethrough").forGetter(var0x -> Optional.ofNullable(var0x.B)),
            Codec.BOOL.optionalFieldOf("obfuscated").forGetter(var0x -> Optional.ofNullable(var0x.Z)),
            class00647.N.optionalFieldOf("click_event").forGetter(var0x -> Optional.ofNullable(var0x.z)),
            class00395.N.optionalFieldOf("hover_event").forGetter(var0x -> Optional.ofNullable(var0x.U)),
            Codec.STRING.optionalFieldOf("insertion").forGetter(var0x -> Optional.ofNullable(var0x.E)),
            class00949.N.optionalFieldOf("font").forGetter(var0x -> Optional.ofNullable(var0x.W))
         )
         .apply(var0, class00405::N)
   );
   public static final Codec<class00405> y = N.codec();
   public static final class02362<class04247, class00405> L = class02389.L(y);

   public class00411() {
      super();
   }
}
