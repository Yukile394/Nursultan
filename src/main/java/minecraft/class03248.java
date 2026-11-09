package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03248 implements class06514<class03280> {
   private static final MapCodec<class03280> l = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06510.field_46095.optionalFieldOf("template").forGetter(var0x -> var0x.N),
            class06510.field_46095.fieldOf("base").forGetter(var0x -> var0x.y),
            class06510.field_46095.optionalFieldOf("addition").forGetter(var0x -> var0x.L),
            class08604.N.fieldOf("result").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class03280::new)
   );
   public static final class02362<class04247, class03280> N = class02362.N(
      class06510.field_52595,
      var0 -> var0.N,
      class06510.field_48355,
      var0 -> var0.y,
      class06510.field_52595,
      var0 -> var0.L,
      class08604.y,
      var0 -> var0.u,
      class03280::new
   );

   public class03248() {
      super();
   }

   @Override
   public class02362<class04247, class03280> y() {
      return N;
   }

   @Override
   public MapCodec<class03280> N() {
      return l;
   }
}
