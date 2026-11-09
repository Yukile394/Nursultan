package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class01814 extends class01838 {
   public static final MapCodec<class01814> y = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter(var0x -> var0x.M),
               Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter(var0x -> var0x.B),
               class00500.N.fieldOf("default_state").forGetter(var0x -> var0x.Z),
               class06338.y(class00500.N.listOf()).fieldOf("low_states").forGetter(var0x -> var0x.z),
               class06338.y(class00500.N.listOf()).fieldOf("high_states").forGetter(var0x -> var0x.U)
            )
         )
         .apply(var0, class01814::new)
   );
   private final float M;
   private final float B;
   private final class00500 Z;
   private final List<class00500> z;
   private final List<class00500> U;

   public class01814(long var1, class05056 var3, float var4, float var5, float var6, class00500 var7, List<class00500> var8, List<class00500> var9) {
      super(var1, var3, var4);
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.U = var9;
   }

   @Override
   protected class01473<?> N() {
      return class01473.L;
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      if (this.N(var2, this.i) < this.M) {
         return class07536.N_77(this.z, var1);
      } else {
         return var1.z() < this.B ? class07536.N_77(this.U, var1) : this.Z;
      }
   }
}
