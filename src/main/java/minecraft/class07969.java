package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import java.util.EnumSet;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.CheckAndCacheBlockChecker;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.LithiumMoveToBlockGoal;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.NonPOISearchDistances.MoveToBlockGoalDistances;
import net.caffeinemc.mods.lithium.common.util.Pos.BlockCoord;

public abstract class class07969 extends class07473 implements LithiumMoveToBlockGoal {
   private static final int M = 1200;
   private static final int B = 1200;
   private static final int Z = 200;
   protected final class07475 N;
   public final double y;
   protected int L;
   protected int u;
   private int z;
   protected class07209 i = class07209.field_10980;
   private boolean U;
   private final int E;
   private final int W;
   protected int R;

   @Override
   public void L() {
      this.M();
      this.u = 0;
      this.z = this.N.method_59922().y(this.N.method_59922().y(1200) + 1200) + 1200;
   }

   protected void M() {
      this.N.f().N(this.i.method_10263() + 0.5, (double)(this.i.method_10264() + 1), this.i.method_10260() + 0.5, this.y);
   }

   public class07969(class07475 var1, double var2, int var4) {
      this(var1, var2, var4, 1);
   }

   public class07969(class07475 var1, double var2, int var4, int var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.E = var4;
      this.R = 0;
      this.W = var5;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18407));
   }

   @Override
   public boolean B() {
      return true;
   }

   public double Z() {
      return 1.0;
   }

   @Override
   public void i() {
      class07209 class07209 = this.U();
      if (!class07209.method_19769(this.N.method_73189(), this.Z())) {
         this.U = false;
         this.u++;
         if (this.E()) {
            this.N.f().N(class07209.method_10263() + 0.5, (double)class07209.method_10264(), class07209.method_10260() + 0.5, this.y);
         }
      } else {
         this.U = true;
         this.u--;
      }
   }

   protected boolean m() {
      int ix = this.E;
      int j = this.W;
      class07209 class07209 = this.N.method_24515();
      class07218 class07218 = new class07218();

      for (int k = this.R; k <= j; k = k > 0 ? -k : 1 - k) {
         for (int l = 0; l < ix; l++) {
            for (int i1 = 0; i1 <= l; i1 = i1 > 0 ? -i1 : 1 - i1) {
               for (int j1 = i1 < l && i1 > -l ? l : 0; j1 <= l; j1 = j1 > 0 ? -j1 : 1 - j1) {
                  class07218.N(class07209, i1, k - 1, j1);
                  if (this.N.L(class07218) && this.N(this.N.method_73183(), class07218)) {
                     this.i = class07218;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   protected class07209 U() {
      return this.i.method_10084();
   }

   @Override
   public boolean y() {
      return this.u >= -this.z && this.u <= 1200 && this.N(this.N.method_73183(), this.i);
   }

   public boolean E() {
      return this.u % 40 == 0;
   }

   private boolean N(class07209 var1, BiPredicate var2, CheckAndCacheBlockChecker var3, int var4, int var5) {
      class07218 class07218 = new class07218();
      int ix = var1.method_10264();

      for (int j = this.R; j <= this.W; j = j > 0 ? -j : 1 - j) {
         int k = ix + j;
         if (k >= var4 && k <= var5) {
            for (int l = 0; l < this.E; l++) {
               for (int i1 = 0; i1 <= l; i1 = i1 > 0 ? -i1 : 1 - i1) {
                  for (int j1 = i1 < l && i1 > -l ? l : 0; j1 <= l; j1 = j1 > 0 ? -j1 : 1 - j1) {
                     class07218.N(var1, i1, j, j1);
                     if (this.N.L(class07218) && var3.checkPosition(class07218)) {
                        class08050 class08050 = var3.getCachedChunkAccess(class07218);
                        if (var2.test(class08050, class07218)) {
                           this.i = class07218;
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   protected abstract boolean N(class05487 var1, class07209 var2);

   private boolean N(class07209 var1, BiPredicate var2, CheckAndCacheBlockChecker var3, LongArrayList var4, int var5, int var6) {
      var4.sort(
         (var1x, var3x) -> MoveToBlockGoalDistances.getMinimumSortOrderOfChunk(var1, var1x) - MoveToBlockGoalDistances.getMinimumSortOrderOfChunk(var1, var3x)
      );
      Predicate<class00500> predicate = var3.blockStatePredicate;
      int ix = var3.minSectionY;
      class07218 class07218 = new class07218();
      class07218 class07218x = new class07218();

      for (int j = this.R; j <= this.W; j = j > 0 ? -j : 1 - j) {
         int k = var1.method_10264() + j;
         if (k >= var5 && k <= var6) {
            int l = class01296.N(k);
            int i1 = l - ix;
            int j1 = Integer.MAX_VALUE;
            int k1 = this.E - 1;
            LongListIterator longlistiterator = var4.iterator();

            while (longlistiterator.hasNext()) {
               long l1 = (Long)longlistiterator.next();
               int i2 = class07321.N(l1);
               int j2 = class07321.y(l1);
               if (j1 < MoveToBlockGoalDistances.getMinimumSortOrderOfChunk(var1, i2, j2)) {
                  break;
               }

               if (var3.checkCachedSection(i2, l, j2)) {
                  class08050 class08050 = var3.getCachedChunkAccess(l1);
                  int k2 = class01296.L(i2);
                  int l2 = Math.max(var1.method_10263() - k1, k2);
                  int i3 = Math.min(var1.method_10263() + k1, k2 + 15);
                  int j3 = class01296.L(j2);
                  int k3 = Math.max(var1.method_10260() - k1, j3);
                  int l3 = Math.min(var1.method_10260() + k1, j3 + 15);
                  class00554 class00554 = class08050.u()[i1];

                  for (int i4 = k3; i4 <= l3; i4++) {
                     for (int j4 = l2; j4 <= i3; j4++) {
                        int k4 = j4 - var1.method_10263();
                        int l4 = i4 - var1.method_10260();
                        int i5 = MoveToBlockGoalDistances.getRing(k4, l4);
                        int j5 = MoveToBlockGoalDistances.getVanillaSortOrderInt(i5, k4, l4);
                        if (j5 < j1
                           && this.N.L(class07218x.N(j4, k, i4))
                           && predicate.test(class00554.N(j4 & 15, k & 15, i4 & 15))
                           && var2.test(class08050, class07218x)) {
                           k1 = i5;
                           l2 = Math.max(var1.method_10263() - i5, k2);
                           i3 = Math.min(var1.method_10263() + i5, k2 + 15);
                           l3 = Math.min(var1.method_10260() + i5, j3 + 15);
                           class07218.N(j4, k, i4);
                           j1 = j5;
                        }
                     }
                  }
               }
            }

            if (j1 < Integer.MAX_VALUE) {
               this.i = class07218;
               return true;
            }
         }
      }

      return false;
   }

   protected int N(class07475 var1) {
      return y(200 + var1.method_59922().y(200));
   }

   @Override
   public boolean N() {
      if (this.L > 0) {
         this.L--;
         return false;
      } else {
         this.L = this.N(this.N);
         return this.m();
      }
   }

   public boolean lithium$findNearestBlock(Predicate var1, BiPredicate var2, boolean var3) {
      class07209 class07209 = this.N.method_24515().method_10069(0, -1, 0);
      class07299 class07299 = this.N.method_73183();
      CheckAndCacheBlockChecker checkandcacheblockchecker = new CheckAndCacheBlockChecker(class07209, this.E - 1, this.W, class07299, var1, var3);
      LongArrayList longarraylist = new LongArrayList(checkandcacheblockchecker.getChunkSize());
      checkandcacheblockchecker.initializeChunks(longarraylist::addLast);
      if (checkandcacheblockchecker.shouldStop()) {
         return false;
      } else {
         int ix = BlockCoord.getMinY(class07299);
         int j = BlockCoord.getMaxYInclusive(class07299);
         return !checkandcacheblockchecker.hasUnloadedPossibleChunks()
            ? this.N(class07209, var2, checkandcacheblockchecker, longarraylist, ix, j)
            : this.N(class07209, var2, checkandcacheblockchecker, ix, j);
      }
   }

   protected boolean W() {
      return this.U;
   }
}
