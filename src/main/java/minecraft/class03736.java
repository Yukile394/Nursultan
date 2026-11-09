package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03736 extends class07204 {
   public static final MapCodec<class03736> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03728.N.fieldOf("falling_dust_color").forGetter(var0x -> var0x.L), t()).apply(var0, class03736::new)
   );
   protected final class03728 L;

   public class03736(class03728 var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   @Override
   public MapCodec<? extends class03736> N() {
      return y;
   }

   @Override
   public int N(class00500 var1, class07290 var2, class07209 var3) {
      return this.L.N();
   }
}
