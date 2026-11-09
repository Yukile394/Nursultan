package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08686 implements class06514<class08690> {
   private static final MapCodec<class08690> l = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.optionalFieldOf("group", "").forGetter(var0x -> var0x.N),
            class03762.field_40252.fieldOf("category").orElse(class03762.field_40251).forGetter(var0x -> var0x.y),
            class06510.field_46095.fieldOf("input").forGetter(var0x -> var0x.L),
            class06510.field_46095.fieldOf("material").forGetter(var0x -> var0x.u),
            class08604.N.fieldOf("result").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class08690::new)
   );
   public static final class02362<class04247, class08690> N = class02362.N(
      class02389.s,
      var0x -> var0x.N,
      class03762.field_48353,
      var0 -> var0.y,
      class06510.field_48355,
      var0 -> var0.L,
      class06510.field_48355,
      var0x -> var0x.u,
      class08604.y,
      var0 -> var0.i,
      class08690::new
   );

   public class08686() {
      super();
   }

   @Override
   public class02362<class04247, class08690> y() {
      return N;
   }

   @Override
   public MapCodec<class08690> N() {
      return l;
   }
}
