package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.LongArrays;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended;
import net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.NearbyPointOfInterestStream;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SphereChunkOrderedPoiSetSpliterator;
import org.jspecify.annotations.Nullable;

public class class05368 extends class05374<class05370, class05380> implements PointOfInterestStorageExtended, RegionBasedStorageSectionExtended {
   public static final int N = 6;
   public static final int y = 1;
   private final class05379 i;
   private final LongSet R;
   private final LongSet M = new LongOpenHashSet();
   private int B = 0;

   public Optional<class03556<class05369>> L(class07209 var1) {
      return this.i(class01296.L(var1)).flatMap(var1x -> var1x.u(var1));
   }

   public Stream<Pair<class03556<class05369>, class07209>> L(
      Predicate<class03556<class05369>> var1, Predicate<class07209> var2, class07209 var3, int var4, class05372 var5
   ) {
      return this.y(var1, var2, var3, var4, var5).sorted(Comparator.comparingDouble(var1x -> ((class07209)var1x.getSecond()).method_10262(var3)));
   }

   public Optional L(Predicate var1, class07209 var2, int var3, class05372 var4) {
      return this.i(var1, null, var2, var3, var4);
   }

   @Override
   protected void L(long var1) {
      this.i.y(var1, this.i.y(var1), false);
   }

   public class05368(class02277 var1, Path var2, DataFixer var3, boolean var4, class01042 var5, class02599 var6, class05474 var7) {
      super(new class06172(var1, var2, var3, var4, class05715.field_19221), class05380.N, class05370::N, class05380::N, class05370::new, var5, var6, var7);
      this.R = new LongOpenHashSet();
      this.i = new class05379(this);
   }

   private static int B(long var0) {
      return (int)((var0 & 4294967295L) + -2147483648L);
   }

   public Stream i(Predicate var1, class07209 var2, int var3, class05372 var4) {
      return StreamSupport.stream(new SphereChunkOrderedPoiSetSpliterator(var3, var2, this, var1, var4), false);
   }

   public Optional i(Predicate var1, Predicate var2, class07209 var3, int var4, class05372 var5) {
      int ix = var4 * var4;
      class05377 class05377 = new NearbyPointOfInterestStream(
            var1,
            var5,
            var2 == null ? null : var1x -> var2.test(var1x.M()),
            var3,
            var4,
            this,
            (var1x, var2x) -> Distances.isWithinSphereRadius(var1x, ix, var2x),
            NearbyPointOfInterestStream.POINT_COMPARATOR
         )
         .getFirst();
      return class05377 == null ? Optional.empty() : Optional.of(class05377.M());
   }

   @Nullable
   public class00465 u(class07209 var1) {
      return this.i(class01296.L(var1)).flatMap(var1x -> var1x.i(var1)).orElse(null);
   }

   public long u(Predicate var1, class07209 var2, int var3, class05372 var4) {
      return this.R(var1, var2, var3, var4).size();
   }

   public Optional u(Predicate var1, Predicate var2, class07209 var3, int var4, class05372 var5) {
      long ix = (long)var4 * var4;
      int j = var3.method_10263() - var4 - 1 >> 4;
      int k = var3.method_10263() + var4 + 1 >> 4;
      int l = var3.method_10260() - var4 - 1 >> 4;
      int i1 = var3.method_10260() + var4 + 1 >> 4;
      int j1 = j;
      int k1 = l;

      while (k1 <= i1) {
         long l1 = Distances.getMinChunkToBlockDistanceL2Sq(var3, j1, k1);
         if (l1 <= ix) {
            long i2 = ix - l1;
            class05377 class05377 = (class05377)this.lithium$getFirstInRangeInChunkColumn(
               j1,
               k1,
               i2,
               var3,
               ix,
               (var0, var1x, var2x, var3x, var4x, var5x) -> var0.lithium$getFirstMatchingPoint(var1x, var5x, var2x, var3x, var4x),
               var1,
               var2,
               var5
            );
            if (class05377 != null) {
               return Optional.of(class05377.M());
            }
         }

         if (++j1 > k) {
            k1++;
            j1 = j;
         }
      }

      return Optional.empty();
   }

   public Stream<Pair<class03556<class05369>, class07209>> y(
      Predicate<class03556<class05369>> var1, Predicate<class07209> var2, class07209 var3, int var4, class05372 var5
   ) {
      return this.i(var1, var3, var4, var5).filter(var1x -> var2.test(var1x.M())).map(var0 -> Pair.of(var0.B(), var0.M()));
   }

   public boolean y(class07209 var1) {
      return this.i(class01296.L(var1))
         .map(var1x -> var1x.L(var1))
         .orElseThrow(() -> class07536.y(new IllegalStateException("POI never registered at " + var1)));
   }

   public Optional y(Predicate var1, class07209 var2, int var3, class05372 var4) {
      int ix = var3 * var3;
      class05377 class05377 = new NearbyPointOfInterestStream(
            var1,
            var4,
            null,
            var2,
            var3,
            this,
            (var1x, var2x) -> Distances.isWithinSphereRadius(var1x, ix, var2x),
            NearbyPointOfInterestStream.POINT_COMPARATOR
         )
         .getFirst();
      return class05377 == null ? Optional.empty() : Optional.of(Pair.of(class05377.B(), class05377.M()));
   }

   @Override
   protected void y(long var1) {
      super.y(var1);
      this.i.y(var1, this.i.y(var1), false);
   }

   private static long N(long var0, long var2) {
      return var0 << 32 | var2 - -2147483648L;
   }

   public Optional N(Predicate var1, Predicate var2, class05372 var3, class07209 var4, int var5, class06069 var6) {
      ArrayList arraylist = this.R(var1, var4, var5, var3);

      for (int ix = arraylist.size() - 1; ix >= 0; ix--) {
         class05377 class05377 = (class05377)arraylist.set(var6.y(ix + 1), (class05377)arraylist.get(ix));
         arraylist.set(ix, class05377);
         if (var2.test(class05377.M())) {
            return Optional.of(class05377.M());
         }
      }

      return Optional.empty();
   }

   public void N(class05487 var1, class07209 var2, int var3) {
      if (this.B != var3) {
         this.M.clear();
         this.B = var3;
      }

      long ix = class07321.N(var2);
      if (!this.M.contains(ix)) {
         int j = class01296.N(var2.method_10263());
         int k = class01296.N(var2.method_10260());
         int l = Math.floorDiv(var3, 16);
         long[] along = new long[2 * l + 1];
         int i1 = SectionYIndex.getMaxYSectionIndexExclusive(var1);
         int j1 = k - l;

         for (int k1 = k + l; j1 <= k1; j1++) {
            int l1 = 0;
            int i2 = j - l;

            for (int j2 = j + l; i2 <= j2; i2++) {
               int k2 = this.N(var1, i2, j1);
               if (k2 < i1 && this.R.add(class07321.u(i2, j1))) {
                  along[l1++] = N(k2, i2);
               }
            }

            LongArrays.quickSort(along, 0, l1);

            for (int l2 = 0; l2 < l1; l2++) {
               long i3 = along[l2];
               var1.method_22342(B(i3), j1, class00549.L);
            }
         }

         this.M.add(ix);
      }
   }

   private int N(class05487 var1, int var2, int var3) {
      BitSet bitset = this.lithium$getNonEmptyPOISections(var2, var3);
      int ix = bitset.nextClearBit(0);
      int j = -1;

      while ((j = bitset.nextSetBit(j + 1)) != -1 && j < ix) {
         Optional optional = this.lithium$getElementAt(class01296.y(var2, SectionYCoord.fromSectionIndex(var1, j), var3));
         if (optional.isPresent() && !((class05370)optional.get()).y()) {
            return j;
         }
      }

      return ix;
   }

   public void N(class01296 var1, class00554 var2) {
      class07536.N(this.i(var1.W()), var3 -> var3.N(var3x -> {
         if (N(var2)) {
            this.N(var2, var1, var3x);
         }
      }), () -> {
         if (N(var2)) {
            class05370 class05370 = this.M(var1.W());
            this.N(var2, var1, class05370::N);
         }
      });
   }

   @Override
   public void N(BooleanSupplier var1) {
      super.N(var1);
      this.i.N();
   }

   boolean N(long var1) {
      Optional<class05370> optional = this.u(var1);
      return optional == null
         ? false
         : optional.<Boolean>map(var0 -> var0.N(var0x -> var0x.N(class03949.y), class05372.field_18488).findAny().isPresent()).orElse(false);
   }

   public int N(class01296 var1) {
      this.i.N();
      return this.i.L(var1.W());
   }

   private void N(class00554 var1, class01296 var2, BiConsumer<class07209, class03556<class05369>> var3) {
      var2.m()
         .forEach(
            var2x -> class03927.N(var1.N(class01296.y(var2x.method_10263()), class01296.y(var2x.method_10264()), class01296.y(var2x.method_10260())))
               .ifPresent(var2xx -> var3.accept(var2x, var2xx))
         );
   }

   private static boolean N(class00554 var0) {
      return var0.N(class03927::y);
   }

   public Stream<class05377> N(Predicate<class03556<class05369>> var1, class07209 var2, int var3, class05372 var4) {
      int ix = Math.floorDiv(var3, 16) + 1;
      return class07321.N(new class07321(var2), ix).flatMap(var3x -> this.N(var1, var3x, var4)).filter(var2x -> {
         class07209 class07209 = var2x.M();
         return Math.abs(class07209.method_10263() - var2.method_10263()) <= var3 && Math.abs(class07209.method_10260() - var2.method_10260()) <= var3;
      });
   }

   public boolean N(class05946<class05369> var1, class07209 var2) {
      return this.N(var2, (Predicate<class03556<class05369>>)(var1x -> var1x.N(var1)));
   }

   public void N(class07209 var1) {
      this.i(class01296.L(var1)).ifPresent(var1x -> var1x.N(var1));
   }

   @Nullable
   public class05377 N(class07209 var1, class03556<class05369> var2) {
      return this.M(class01296.L(var1)).N(var1, var2);
   }

   public boolean N(class07209 var1, Predicate<class03556<class05369>> var2) {
      return this.i(class01296.L(var1)).map(var2x -> var2x.N(var1, var2)).orElse(false);
   }

   public Optional<class07209> N(Predicate<class03556<class05369>> var1, BiPredicate<class03556<class05369>, class07209> var2, class07209 var3, int var4) {
      return this.i(var1, var3, var4, class05372.field_18487).filter(var1x -> var2.test(var1x.B(), var1x.M())).findFirst().map(var0 -> {
         var0.L();
         return var0.M();
      });
   }

   public Stream<class07209> N(Predicate<class03556<class05369>> var1, Predicate<class07209> var2, class07209 var3, int var4, class05372 var5) {
      return this.i(var1, var3, var4, var5).map(class05377::M).filter(var2);
   }

   public Stream<class05377> N(Predicate<class03556<class05369>> var1, class07321 var2, class05372 var3) {
      return IntStream.rangeClosed(this.u.method_32891(), this.u.method_31597())
         .boxed()
         .map(var2x -> this.i(class01296.N(var2, var2x).W()))
         .filter(Optional::isPresent)
         .flatMap(var2x -> var2x.get().N(var1, var3));
   }

   public Collection lithium$getNClosestFirstWithType(Predicate var1, Predicate var2, class07209 var3, int var4, class05372 var5, long var6) {
      int ix = var4 * var4;
      NearbyPointOfInterestStream nearbypointofintereststream = new NearbyPointOfInterestStream(
         var1,
         var5,
         var1x -> var2.test(var1x.M()),
         var3,
         var4,
         this,
         (var1x, var2x) -> Distances.isWithinSphereRadius(var1x, ix, var2x),
         NearbyPointOfInterestStream.POINT_COMPARATOR
      );
      ArrayList arraylist = new ArrayList();
      int j = 0;

      while (j < var6 && nearbypointofintereststream.tryAdvance(var1x -> arraylist.add(Pair.of(var1x.B(), var1x.M())))) {
         j++;
      }

      return arraylist;
   }

   public Optional lithium$findNearestForPortalLogic(class07209 var1, int var2, class03556 var3, class05372 var4, Predicate var5, class08057 var6) {
      Predicate predicate;
      if (var6 == null || var6.y(var1.method_10263(), var1.method_10260()) > var2 + 3) {
         predicate = var5;
      } else {
         predicate = var2x -> var6.N(var2x.M()) && var5.test(var2x);
      }

      SinglePointOfInterestTypeFilter singlepointofinteresttypefilter = new SinglePointOfInterestTypeFilter(var3);
      class05377 class05377 = new NearbyPointOfInterestStream(
            singlepointofinteresttypefilter,
            var4,
            predicate,
            var1,
            var2,
            this,
            (var1x, var2x) -> Distances.isWithinCubeRadius(var1x, var2, var2x),
            NearbyPointOfInterestStream.NEGATIVE_Y_POINT_COMPARATOR
         )
         .getFirst();
      return class05377 == null ? Optional.empty() : Optional.of(class05377);
   }

   private ArrayList R(Predicate var1, class07209 var2, int var3, class05372 var4) {
      int ix = Math.multiplyExact(var3, var3);
      int j = var2.method_10263() - var3 - 1 >> 4;
      int k = var2.method_10260() - var3 - 1 >> 4;
      int l = var2.method_10263() + var3 + 1 >> 4;
      int i1 = var2.method_10260() + var3 + 1 >> 4;
      ArrayList arraylist = new ArrayList();
      Consumer consumer = var3x -> {
         if (Distances.isWithinSphereRadius(var2, ix, var3x.M())) {
            arraylist.add(var3x);
         }
      };

      for (int j1 = j; j1 <= l; j1++) {
         for (int k1 = k; k1 <= i1; k1++) {
            Iterator iterator = this.lithium$getInChunkColumn(j1, k1).iterator();

            while (iterator.hasNext()) {
               ((class05370)iterator.next()).lithium$collectMatchingPoints(var1, var4, consumer);
            }
         }
      }

      return arraylist;
   }

   public Optional lithium$takeAt(Predicate var1, BiPredicate var2, class07209 var3) {
      Optional<class05370> optional = this.i(class01296.L(var3));
      if (optional.isPresent()) {
         class05377 class05377 = optional.get().lithium$getAt(var3);
         if (class05377 != null && var1.test(class05377.B())) {
            class05377.L();
            return Optional.of(class05377.M());
         }
      }

      return Optional.empty();
   }
}
