package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03268 implements class06514<class03259> {
   private static final MapCodec<class03259> l = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06510.field_46095.fieldOf("template").forGetter(var0x -> var0x.N),
            class06510.field_46095.fieldOf("base").forGetter(var0x -> var0x.y),
            class06510.field_46095.fieldOf("addition").forGetter(var0x -> var0x.L),
            class03246.L.fieldOf("pattern").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class03259::new)
   );
   public static final class02362<class04247, class03259> N = class02362.N(
      class06510.field_48355,
      var0 -> var0.N,
      class06510.field_48355,
      var0 -> var0.y,
      class06510.field_48355,
      var0 -> var0.L,
      class03246.u,
      var0 -> var0.u,
      class03259::new
   );

   public class03268() {
      super();
   }

   @Override
   public class02362<class04247, class03259> y() {
      return N;
   }

   @Override
   public MapCodec<class03259> N() {
      return l;
   }
}
