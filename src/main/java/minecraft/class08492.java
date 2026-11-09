package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class08492 extends class01474 {
   public static final MapCodec<class08492> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.L),
            class01471.N.fieldOf("block_provider").forGetter(var0x -> var0x.u),
            class06338.y(class07211.field_29502.listOf()).fieldOf("directions").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class08492::new)
   );
   private final float L;
   private final class01471 u;
   private final List<class07211> i;

   public class08492(float var1, class01471 var2, List<class07211> var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   public void N(class05894 var1) {
      class06069 class06069 = var1.y();

      for (class07209 class07209x : class07536.N(var1.L(), class06069)) {
         class07211 class07211 = class07536.N_77(this.i, class06069);
         class07209 class07209x = class07209x.method_10093(class07211);
         if (class06069.z() <= this.L && var1.N(class07209x)) {
            var1.N(class07209x, this.u.N(class06069, class07209x));
         }
      }
   }

   @Override
   protected class05930<?> N() {
      return class05930.z;
   }
}
