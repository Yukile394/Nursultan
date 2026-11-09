package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class04906 extends class04748 {
   public static final MapCodec<class04906> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            N(var0),
            class04902.field_24990.fieldOf("biome_temp").forGetter(var0x -> var0x.y),
            Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter(var0x -> var0x.R),
            Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter(var0x -> var0x.M)
         )
         .apply(var0, class04906::new)
   );
   public final class04902 y;
   public final float R;
   public final float M;

   public class04906(class04758 var1, class04902 var2, float var3, float var4) {
      super(var1);
      this.y = var2;
      this.R = var3;
      this.M = var4;
   }

   @Override
   public class04367<?> N() {
      return class04367.U;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      return N(var1, class07830.field_13195, var2 -> this.N(var2, var1));
   }

   private void N(class03291 var1, class04764 var2) {
      class07209 class07209 = new class07209(var2.B().i(), 90, var2.B().R());
      class06993 class06993 = class06993.N(var2.R());
      class04939.N(var2.i(), class07209, class06993, var1, var2.R(), this);
   }
}
