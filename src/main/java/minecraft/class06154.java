package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06154<T extends class06184> implements class06514<T> {
   private final MapCodec<T> N;
   private final class02362<class04247, T> l;

   protected class06154(class06138<T> var1) {
      super();
      this.N = RecordCodecBuilder.mapCodec(
         var1x -> var1x.group(
               Codec.STRING.optionalFieldOf("group", "").forGetter(class06184::y),
               class06510.field_46095.fieldOf("ingredient").forGetter(class06184::z),
               class06584.u.fieldOf("result").forGetter(class06184::U)
            )
            .apply(var1x, var1::create)
      );
      this.l = class02362.N(class02389.s, class06184::y, class06510.field_48355, class06184::z, class06584.z, class06184::U, var1::create);
   }

   @Override
   public class02362<class04247, T> y() {
      return this.l;
   }

   @Override
   public MapCodec<T> N() {
      return this.N;
   }
}
