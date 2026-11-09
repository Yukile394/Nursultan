package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.biome.BiomeSourceAccess;

public class class05997 extends class00765 implements BiomeSourceAccess {
   private static final MapCodec<class03556<class00780>> u = class00780.L.fieldOf("biome");
   public static final MapCodec<class03221<class03556<class00780>>> y = class03221.N(u).fieldOf("biomes");
   private static final MapCodec<class03556<class03573>> i = class03573.y.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<class05997> L = Codec.mapEither(y, i).xmap(class05997::new, var0 -> var0.R);
   private final Either<class03221<class03556<class00780>>, class03556<class03573>> R;
   private boolean M = true;

   private class05997(Either<class03221<class03556<class00780>>, class03556<class03573>> var1) {
      super();
      this.R = var1;
   }

   private class03221<class03556<class00780>> u() {
      return (class03221<class03556<class00780>>)this.R.map(var0 -> var0, var0 -> ((class03573)var0.N()).N());
   }

   @Override
   protected Stream<class03556<class00780>> y() {
      return this.u().N().stream().map(Pair::getSecond);
   }

   public class03556<class00780> N(class03231 var1) {
      return this.u().N(var1);
   }

   @Override
   public void N(List<String> var1, class07209 var2, class03222 var3) {
      int ix = class01146.N(var2.method_10263());
      int j = class01146.N(var2.method_10264());
      int k = class01146.N(var2.method_10260());
      class03231 class03231 = var3.N(ix, j, k);
      float f = class03216.N(class03231.u());
      float f1 = class03216.N(class03231.i());
      float f2 = class03216.N(class03231.y());
      float f3 = class03216.N(class03231.L());
      double d0 = class03882.N(class03216.N(class03231.M()));
      class01835 class01835 = new class01835();
      var1.add(
         "Biome builder PV: " + class01835.N(d0) + " C: " + class01835.y(f) + " E: " + class01835.L(f1) + " T: " + class01835.u(f2) + " H: " + class01835.i(f3)
      );
   }

   public static class05997 N(class03221<class03556<class00780>> var0) {
      return new class05997(Either.left(var0));
   }

   @Override
   protected MapCodec<? extends class00765> N() {
      return L;
   }

   public boolean N(class05946<class03573> var1) {
      Optional<class03556<class03573>> optional = this.R.right();
      return optional.isPresent() && optional.get().N(var1);
   }

   public static class05997 N(class03556<class03573> var0) {
      return new class05997(Either.right(var0));
   }

   @Override
   public class03556<class00780> method_38109(int var1, int var2, int var3, class03222 var4) {
      return this.N(var4.N(var1, var2, var3));
   }

   public void fabric_setModifyBiomeEntries(boolean var1) {
      this.M = var1;
   }

   public boolean fabric_shouldModifyBiomeEntries() {
      return this.M;
   }
}
