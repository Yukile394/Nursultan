package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;

public class class01813 extends class01840 {
   public static final MapCodec<class01813> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class04548.N(Codec.INT, 1, 64).fieldOf("variety").forGetter(var0x -> var0x.Z),
            class05056.L.fieldOf("slow_noise").forGetter(var0x -> var0x.z),
            class06338.t.fieldOf("slow_scale").forGetter(var0x -> var0x.U)
         )
         .and(y(var0))
         .apply(var0, class01813::new)
   );
   private final class04548<Integer> Z;
   private final class05056 z;
   private final float U;
   private final class05041 E;

   public class01813(class04548<Integer> var1, class05056 var2, float var3, long var4, class05056 var6, float var7, List<class00500> var8) {
      super(var4, var6, var7, var8);
      this.Z = var1;
      this.z = var2;
      this.U = var3;
      this.E = class05041.y(new class07836(new class06075(var4)), var2);
   }

   protected double N(class07209 var1) {
      return this.E.N(var1.method_10263() * this.U, var1.method_10264() * this.U, var1.method_10260() * this.U);
   }

   @Override
   protected class01473<?> N() {
      return class01473.i;
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      int i = (int)class04995.N(this.N(var2), -1.0, 1.0, (double)this.Z.N().intValue(), (double)(this.Z.y() + 1));
      ArrayList arraylist = Lists.newArrayListWithCapacity(i);

      for (int j = 0; j < i; j++) {
         arraylist.add(this.N(this.B, this.N(var2.method_10069(j * 54545, 0, j * 34234))));
      }

      return this.N(arraylist, var2, this.i);
   }
}
