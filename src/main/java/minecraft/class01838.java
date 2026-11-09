package minecraft;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class class01838 extends class01471 {
   protected final long L;
   protected final class05056 u;
   protected final float i;
   protected final class05041 R;

   public class01838(long var1, class05056 var3, float var4) {
      super();
      this.L = var1;
      this.u = var3;
      this.i = var4;
      this.R = class05041.y(new class07836(new class06075(var1)), var3);
   }

   protected static <P extends class01838> P3<Mu<P>, Long, class05056, Float> N(Instance<P> var0) {
      return var0.group(
         Codec.LONG.fieldOf("seed").forGetter(var0x -> var0x.L),
         class05056.L.fieldOf("noise").forGetter(var0x -> var0x.u),
         class06338.t.fieldOf("scale").forGetter(var0x -> var0x.i)
      );
   }

   protected double N(class07209 var1, double var2) {
      return this.R.N(var1.method_10263() * var2, var1.method_10264() * var2, var1.method_10260() * var2);
   }
}
