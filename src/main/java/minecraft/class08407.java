package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class08407 extends class03736 {
   public static final MapCodec<class08407> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03728.N.fieldOf("falling_dust_color").forGetter(var0x -> var0x.L), t()).apply(var0, class08407::new)
   );

   public class08407(class03728 var1, class01362 var2) {
      super(var1, var2);
   }

   @Override
   public MapCodec<class08407> N() {
      return N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      super.N_20(var1, var2, var3, var4);
      class08402.N(var2, var3, var4);
   }
}
