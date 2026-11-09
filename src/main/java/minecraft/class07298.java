package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07298<T extends class07313> implements class06514<T> {
   private final MapCodec<T> N;
   private final class02362<class04247, T> l;

   public class07298(class07293<T> var1, int var2) {
      super();
      this.N = RecordCodecBuilder.mapCodec(
         var2x -> var2x.group(
               Codec.STRING.optionalFieldOf("group", "").forGetter(class06184::y),
               class03774.field_40245.fieldOf("category").orElse(class03774.field_40244).forGetter(class07313::B),
               class06510.field_46095.fieldOf("ingredient").forGetter(class06184::z),
               class06584.i.fieldOf("result").forGetter(class06184::U),
               Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(class07313::R),
               Codec.INT.fieldOf("cookingtime").orElse(var2).forGetter(class07313::M)
            )
            .apply(var2x, var1::create)
      );
      this.l = class02362.N(
         class02389.s,
         class06184::y,
         class03774.field_54631,
         class07313::B,
         class06510.field_48355,
         class06184::z,
         class06584.z,
         class06184::U,
         class02389.E,
         class07313::R,
         class02389.M,
         class07313::M,
         var1::create
      );
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
