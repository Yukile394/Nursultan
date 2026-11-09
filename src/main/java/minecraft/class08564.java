package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08564 extends class07131 {
   public static final MapCodec<class08564> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.N(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter(var0x -> var0x.M), t()).apply(var0, class08564::new)
   );

   public class08564(float var1, class01362 var2) {
      super(var1, var2);
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class06069 var3) {
      class02329 class02329 = class02329.N(class07107.V, var1.method_67233(var2));
      class02615.N(var1, var2, var3, class02329);
   }

   @Override
   public MapCodec<? extends class08564> N() {
      return N;
   }
}
