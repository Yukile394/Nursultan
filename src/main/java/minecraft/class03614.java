package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.HashSet;
import java.util.List;

public class class03614 extends class01474 {
   public static final MapCodec<class03614> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.L),
            Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter(var0x -> var0x.u),
            Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter(var0x -> var0x.i),
            class01471.N.fieldOf("block_provider").forGetter(var0x -> var0x.R),
            Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter(var0x -> var0x.M),
            class06338.y(class07211.field_29502.listOf()).fieldOf("directions").forGetter(var0x -> var0x.B)
         )
         .apply(var0, class03614::new)
   );
   protected final float L;
   protected final int u;
   protected final int i;
   protected final class01471 R;
   protected final int M;
   protected final List<class07211> B;

   public class03614(float var1, int var2, int var3, class01471 var4, int var5, List<class07211> var6) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.B = var6;
   }

   @Override
   protected class05930<?> N() {
      return class05930.B;
   }

   @Override
   public void N(class05894 var1) {
      HashSet hashset = new HashSet();
      class06069 class06069 = var1.y();

      for (class07209 class07209xxxx : class07536.N(var1.u(), class06069)) {
         class07211 class07211 = class07536.N_77(this.B, class06069);
         class07209 class07209x = class07209xxxx.method_10093(class07211);
         if (!hashset.contains(class07209x) && class06069.z() < this.L && this.N(var1, class07209xxxx, class07211)) {
            class07209 class07209xx = class07209x.method_10069(-this.u, -this.i, -this.u);
            class07209 class07209xxx = class07209x.method_10069(this.u, this.i, this.u);

            for (class07209 class07209xxxx : class07209.method_10097(class07209xx, class07209xxx)) {
               hashset.add(class07209xxxx.method_10062());
            }

            var1.N(class07209x, this.R.N(class06069, class07209x));
         }
      }
   }

   private boolean N(class05894 var1, class07209 var2, class07211 var3) {
      for (int ix = 1; ix <= this.M; ix++) {
         class07209 class07209 = var2.method_10079(var3, ix);
         if (!var1.N(class07209)) {
            return false;
         }
      }

      return true;
   }
}
