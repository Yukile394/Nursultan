package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07294 implements class06514<class06523> {
   private static final MapCodec<class06523> l = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.optionalFieldOf("group", "").forGetter(var0x -> var0x.N),
            class03762.field_40252.fieldOf("category").orElse(class03762.field_40251).forGetter(var0x -> var0x.y),
            class06584.u.fieldOf("result").forGetter(var0x -> var0x.L),
            class06510.field_46095.listOf(1, 9).fieldOf("ingredients").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class06523::new)
   );
   public static final class02362<class04247, class06523> N = class02362.N(
      class02389.s,
      var0 -> var0.N,
      class03762.field_48353,
      var0 -> var0.y,
      class06584.z,
      var0 -> var0.L,
      class06510.field_48355.N_33(class02389.N()),
      var0 -> var0.u,
      class06523::new
   );

   public class07294() {
      super();
   }

   @Override
   public class02362<class04247, class06523> y() {
      return N;
   }

   @Override
   public MapCodec<class06523> N() {
      return l;
   }
}
