package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class00644 extends class07768 {
   public static final MapCodec<class00644> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.intRange(1, 1024).fieldOf("max_weight").forGetter(var0x -> var0x.i), class01960.N.fieldOf("block_set_type").forGetter(var0x -> var0x.y), t()
         )
         .apply(var0, class00644::new)
   );
   public static final class08071 u = class06665.ND;
   private final int i;

   public class00644(int var1, class01960 var2, class01362 var3) {
      super(var3, var2);
      this.P(this.Q.y().y(u, 0));
      this.i = var1;
   }

   @Override
   protected int U(class00500 var1) {
      return var1.L(u);
   }

   @Override
   protected int y() {
      return 10;
   }

   @Override
   protected int y(class07299 var1, class07209 var2) {
      int ix = Math.min(N(var1, N.N(var2), class07049.class), this.i);
      return ix > 0 ? class04995.u((float)Math.min(this.i, ix) / this.i * 15.0F) : 0;
   }

   @Override
   public MapCodec<class00644> N() {
      return L;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u);
   }

   @Override
   protected class00500 N(class00500 var1, int var2) {
      return var1.y(u, var2);
   }
}
