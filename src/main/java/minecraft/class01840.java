package minecraft;

import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class class01840 extends class01838 {
   public static final MapCodec<class01840> M = RecordCodecBuilder.mapCodec(var0 -> y(var0).apply(var0, class01840::new));
   protected final List<class00500> B;

   public class01840(long var1, class05056 var3, float var4, List<class00500> var5) {
      super(var1, var3, var4);
      this.B = var5;
   }

   protected static <P extends class01840> P4<Mu<P>, Long, class05056, Float, List<class00500>> y(Instance<P> var0) {
      return N(var0).and(class06338.y(class00500.N.listOf()).fieldOf("states").forGetter(var0x -> var0x.B));
   }

   protected class00500 N(List<class00500> var1, class07209 var2, double var3) {
      double d0 = this.N(var2, var3);
      return this.N(var1, d0);
   }

   @Override
   protected class01473<?> N() {
      return class01473.u;
   }

   protected class00500 N(List<class00500> var1, double var2) {
      double d0 = class04995.N((1.0 + var2) / 2.0, 0.0, 0.9999);
      return (class00500)var1.get((int)(d0 * var1.size()));
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      return this.N(this.B, var2, this.i);
   }
}
