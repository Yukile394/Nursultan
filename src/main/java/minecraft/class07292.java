package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07292 implements class06514<class07329> {
   public static final MapCodec<class07329> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.optionalFieldOf("group", "").forGetter(var0x -> var0x.L),
            class03762.field_40252.fieldOf("category").orElse(class03762.field_40251).forGetter(var0x -> var0x.u),
            class04493.y.forGetter(var0x -> var0x.N),
            class06584.u.fieldOf("result").forGetter(var0x -> var0x.y),
            Codec.BOOL.optionalFieldOf("show_notification", true).forGetter(var0x -> var0x.i)
         )
         .apply(var0, class07329::new)
   );
   public static final class02362<class04247, class07329> l = class02362.N(class07292::N, class07292::N);

   public class07292() {
      super();
   }

   @Override
   public class02362<class04247, class07329> y() {
      return l;
   }

   @Override
   public MapCodec<class07329> N() {
      return N;
   }

   private static class07329 N(class04247 var0) {
      String s = var0.s();
      class03762 class03762 = var0.y(class03762.class);
      class04493 class04493 = class04493.L.decode(var0);
      class06584 class06584 = class06584.z.decode(var0);
      boolean flag = var0.readBoolean();
      return new class07329(s, class03762, class04493, class06584, flag);
   }

   private static void N(class04247 var0, class07329 var1) {
      var0.N(var1.L);
      var0.N(var1.u);
      class04493.L.encode(var0, var1.N);
      class06584.z.encode(var0, var1.y);
      var0.writeBoolean(var1.i);
   }
}
