package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class00782 extends class00765 implements class05527 {
   public static final MapCodec<class00782> y = class00780.L.fieldOf("biome").xmap(class00782::new, var0 -> var0.L).stable();
   private final class03556<class00780> L;

   public class00782(class03556<class00780> var1) {
      super();
      this.L = var1;
   }

   @Override
   protected Stream<class03556<class00780>> y() {
      return Stream.of(this.L);
   }

   @Nullable
   @Override
   public Pair<class07209, class03556<class00780>> N(
      class07209 var1, int var2, int var3, int var4, Predicate<class03556<class00780>> var5, class03222 var6, class05487 var7
   ) {
      return var5.test(this.L) ? Pair.of(var1.method_33096(class04995.N(var1.method_10264(), var7.method_31607() + 1, var7.method_31600() + 1)), this.L) : null;
   }

   @Override
   public Set<class03556<class00780>> N(int var1, int var2, int var3, int var4, class03222 var5) {
      return Sets.newHashSet(Set.of(this.L));
   }

   @Nullable
   @Override
   public Pair<class07209, class03556<class00780>> N(
      int var1, int var2, int var3, int var4, int var5, Predicate<class03556<class00780>> var6, class06069 var7, boolean var8, class03222 var9
   ) {
      if (var6.test(this.L)) {
         return var8
            ? Pair.of(new class07209(var1, var2, var3), this.L)
            : Pair.of(new class07209(var1 - var4 + var7.y(var4 * 2 + 1), var2, var3 - var4 + var7.y(var4 * 2 + 1)), this.L);
      } else {
         return null;
      }
   }

   @Override
   protected MapCodec<? extends class00765> N() {
      return y;
   }

   @Override
   public class03556<class00780> method_38109(int var1, int var2, int var3, class03222 var4) {
      return this.L;
   }

   @Override
   public class03556<class00780> method_16359(int var1, int var2, int var3) {
      return this.L;
   }
}
