package minecraft;

import Nursultan.class10641;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockPatternExtended;
import net.caffeinemc.mods.lithium.common.world.block_pattern_matching.BlockSearch;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06649 implements BlockPatternExtended {
   private final Predicate<class06646>[][][] N;
   private final int y;
   private final int L;
   private final int u;
   private class00891 i;
   private int R;

   public int L() {
      return this.u;
   }

   public class06649(Predicate<class06646>[][][] var1) {
      super();
      this.N = var1;
      this.y = var1.length;
      if (this.y > 0) {
         this.L = var1[0].length;
         if (this.L > 0) {
            this.u = var1[0][0].length;
         } else {
            this.u = 0;
         }
      } else {
         this.L = 0;
         this.u = 0;
      }
   }

   public Predicate<class06646>[][][] u() {
      return this.N;
   }

   public int y() {
      return this.L;
   }

   @Nullable
   public class06653 N(class05487 var1, class07209 var2) {
      LoadingCache<class07209, class06646> loadingcache = N(var1, false);
      int ix = Math.max(Math.max(this.u, this.L), this.y);
      int j = ix - 1;
      int k = ix - 1;
      int l = ix - 1;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable, ix);
      if (callbackinforeturnable.isCancelled()) {
         return (class06653)callbackinforeturnable.getReturnValue();
      } else {
         for (class07209 class07209 : class07209.method_10097(var2, var2.method_10069(j, k, l))) {
            for (class07211 class07211x : class07211.values()) {
               for (class07211 class07211x : class07211.values()) {
                  if (class07211x != class07211x && class07211x != class07211x.b()) {
                     class06653 class06653 = this.N(class07209, class07211x, class07211x, loadingcache);
                     if (class06653 != null) {
                        return class06653;
                     }
                  }
               }
            }
         }

         return null;
      }
   }

   public static LoadingCache<class07209, class06646> N(class05487 var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new class10641(var0, var1));
   }

   protected static class07209 N(class07209 var0, class07211 var1, class07211 var2, int var3, int var4, int var5) {
      if (var1 != var2 && var1 != var2.b()) {
         class00753 class00753xx = new class00753(var1.P(), var1.s(), var1.T());
         class00753 class00753x = new class00753(var2.P(), var2.s(), var2.T());
         class00753 class00753xx = class00753xx.method_10259(class00753x);
         return var0.method_10069(
            class00753x.method_10263() * -var4 + class00753xx.method_10263() * var3 + class00753xx.method_10263() * var5,
            class00753x.method_10264() * -var4 + class00753xx.method_10264() * var3 + class00753xx.method_10264() * var5,
            class00753x.method_10260() * -var4 + class00753xx.method_10260() * var3 + class00753xx.method_10260() * var5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   private void N(class05487 var1, class07209 var2, CallbackInfoReturnable var3, int var4) {
      if (this.i != null) {
         class07209 class07209 = var2.method_10069(2 * var4 - 1, 2 * var4 - 1, 2 * var4 - 1);
         class02334 class02334 = class02334.N(var2.method_10069(-var4, -var4, -var4), class07209);
         if (!BlockSearch.hasAtLeast(var1, class02334, this.i, this.R)) {
            var3.setReturnValue(null);
         }
      }
   }

   public int N() {
      return this.y;
   }

   @Nullable
   public class06653 N(class05487 var1, class07209 var2, class07211 var3, class07211 var4) {
      LoadingCache<class07209, class06646> loadingcache = N(var1, false);
      return this.N(var2, var3, var4, loadingcache);
   }

   @Nullable
   private class06653 N(class07209 var1, class07211 var2, class07211 var3, LoadingCache<class07209, class06646> var4) {
      for (int ix = 0; ix < this.u; ix++) {
         for (int j = 0; j < this.L; j++) {
            for (int k = 0; k < this.y; k++) {
               if (!this.N[k][j][ix].test((class06646)var4.getUnchecked(N(var1, var2, var3, ix, j, k)))) {
                  return null;
               }
            }
         }
      }

      return new class06653(var1, var2, var3, var4, this.u, this.L, this.y);
   }

   public void lithium$setRequiredBlock(class00891 var1, int var2) {
      this.i = var1;
      this.R = var2;
   }
}
