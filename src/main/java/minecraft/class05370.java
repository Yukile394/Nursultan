package minecraft;

import Nursultan.class10510;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05370 implements PointOfInterestSetExtended {
   private static final Logger N = LogUtils.getLogger();
   private final Short2ObjectMap<class05377> y = new Short2ObjectOpenHashMap();
   private Map<class03556<class05369>, Set<class05377>> L = Maps.newHashMap();
   private final Runnable u;
   private boolean i;

   public boolean L(class07209 var1) {
      class05377 class05377 = (class05377)this.y.get(class01296.y(var1));
      if (class05377 == null) {
         throw (IllegalStateException)class07536.y(new IllegalStateException("POI never registered at " + var1));
      } else {
         boolean flag = class05377.u();
         this.u.run();
         return flag;
      }
   }

   private void L() {
      this.y.clear();
      this.L.clear();
   }

   public class05370(Runnable var1) {
      this(var1, true, ImmutableList.of());
   }

   class05370(Runnable var1, boolean var2, List<class05377> var3) {
      super();
      this.u = var1;
      this.i = var2;
      var3.forEach(this::N);
   }

   public Optional<class00465> i(class07209 var1) {
      return this.R(var1).map(class00465::new);
   }

   public Optional<class03556<class05369>> u(class07209 var1) {
      return this.R(var1).map(class05377::B);
   }

   public boolean y() {
      return this.i;
   }

   private Iterator y(class03556 var1) {
      Set<class05377> set = this.L.get(var1);
      return set != null && !set.isEmpty() ? set.iterator() : Collections.emptyIterator();
   }

   @Deprecated
   public int y(class07209 var1) {
      return this.R(var1).map(class05377::y).orElse(0);
   }

   private class05377 N(class07209 var1, class03556 var2, Predicate var3) {
      Set<class05377> set = this.L.get(var2);
      if (set != null && !set.isEmpty()) {
         class05377 class05377x = null;
         long ix = Long.MAX_VALUE;

         for (class05377 class05377x : set) {
            long j = Distances.distanceSq(var1, class05377x.M());
            if (j < ix && var3.test(class05377x)) {
               ix = j;
               class05377x = class05377x;
            }
         }

         return class05377x;
      } else {
         return null;
      }
   }

   private class05377 N(class07209 var1, Predicate var2, Predicate var3) {
      class05377 class05377x = null;
      long ix = Long.MAX_VALUE;

      for (Entry entry : this.L.entrySet()) {
         if (var2.test((class03556)entry.getKey()) && !((Set)entry.getValue()).isEmpty()) {
            for (class05377 class05377x : (Set)entry.getValue()) {
               long j = Distances.distanceSq(var1, class05377x.M());
               if (j < ix && var3.test(class05377x)) {
                  ix = j;
                  class05377x = class05377x;
               }
            }
         }
      }

      return class05377x;
   }

   private Iterator N(Predicate var1) {
      Iterator<Entry<class03556<class05369>, Set<class05377>>> iterator = this.L.entrySet().iterator();
      return new class10510(this, iterator, var1);
   }

   private class05377 N(class07209 var1, long var2, Predicate var4, Predicate var5, class05372 var6) {
      Predicate<? super class05377> predicate = var6.N();

      for (Entry entry : this.L.entrySet()) {
         if (var4.test((class03556)entry.getKey()) && !((Set)entry.getValue()).isEmpty()) {
            for (class05377 class05377 : (Set)entry.getValue()) {
               if (Distances.distanceSq(var1, class05377.M()) <= var2 && var5.test(class05377.M()) && predicate.test(class05377)) {
                  return class05377;
               }
            }
         }
      }

      return null;
   }

   private class05377 N(class07209 var1, long var2, class03556 var4, Predicate var5, class05372 var6) {
      Set<class05377> set = this.L.get(var4);
      if (set != null && !set.isEmpty()) {
         Predicate<? super class05377> predicate = var6.N();

         for (class05377 class05377 : set) {
            if (Distances.distanceSq(var1, class05377.M()) <= var2 && var5.test(class05377.M()) && predicate.test(class05377)) {
               return class05377;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void N(Predicate var1, class05372 var2, Consumer var3) {
      for (Entry entry : this.L.entrySet()) {
         if (var1.test((class03556)entry.getKey()) && !((Set)entry.getValue()).isEmpty()) {
            for (class05377 class05377 : (Set)entry.getValue()) {
               if (var2.N().test(class05377)) {
                  var3.accept(class05377);
               }
            }
         }
      }
   }

   private void N(class07209 var1, long var2, Predicate var4, Predicate var5, Consumer var6, int var7) {
      for (Entry entry : this.L.entrySet()) {
         if (var4.test((class03556)entry.getKey()) && !((Set)entry.getValue()).isEmpty()) {
            for (class05377 class05377 : (Set)entry.getValue()) {
               if (Distances.distanceSq(var1, class05377.M()) <= var2 && var5.test(class05377)) {
                  var6.accept(class05377);
                  if (--var7 == 0) {
                     return;
                  }
               }
            }
         }
      }
   }

   private void N(class03556 var1, class05372 var2, Consumer var3) {
      Set<class05377> set = this.L.get(var1);
      if (set != null && !set.isEmpty()) {
         for (class05377 class05377 : set) {
            if (var2.N().test(class05377)) {
               var3.accept(class05377);
            }
         }
      }
   }

   private void N(class07209 var1, long var2, class03556 var4, Predicate var5, Consumer var6, int var7) {
      Set<class05377> set = this.L.get(var4);
      if (set != null && !set.isEmpty()) {
         for (class05377 class05377 : set) {
            if (Distances.distanceSq(var1, class05377.M()) <= var2 && var5.test(class05377)) {
               var6.accept(class05377);
               if (--var7 == 0) {
                  return;
               }
            }
         }
      }
   }

   public void N(class07209 var1) {
      class05377 class05377 = (class05377)this.y.remove(class01296.y(var1));
      if (class05377 == null) {
         N.error("POI data mismatch: never registered at {}", var1);
      } else {
         this.L.get(class05377.B()).remove(class05377);
         N.debug("Removed POI of type {} @ {}", LogUtils.defer(class05377::B), LogUtils.defer(class05377::M));
         this.u.run();
      }
   }

   public boolean N(class07209 var1, Predicate<class03556<class05369>> var2) {
      return this.u(var1).filter(var2).isPresent();
   }

   public class05380 N() {
      return new class05380(this.i, this.y.values().stream().map(class05377::N).toList());
   }

   public void N(Consumer<BiConsumer<class07209, class03556<class05369>>> var1) {
      if (!this.i) {
         Short2ObjectOpenHashMap short2objectopenhashmap = new Short2ObjectOpenHashMap(this.y);
         this.L();
         var1.accept((var2x, var3) -> {
            short short1 = class01296.y(var2x);
            class05377 class05377 = (class05377)short2objectopenhashmap.computeIfAbsent(short1, var3x -> new class05377(var2x, var3, this.u));
            this.N(class05377);
         });
         this.i = true;
         this.u.run();
      }
   }

   private boolean N(class05377 var1) {
      class07209 class07209 = var1.M();
      class03556<class05369> class03556 = var1.B();
      short short1 = class01296.y(class07209);
      class05377 class05377 = (class05377)this.y.get(short1);
      if (class05377 != null) {
         if (class03556.equals(class05377.B())) {
            return false;
         }

         class07536.y("POI data mismatch: already registered at " + class07209);
      }

      this.y.put(short1, var1);
      this.L.computeIfAbsent(class03556, var0 -> Sets.newHashSet()).add(var1);
      return true;
   }

   @Nullable
   public class05377 N(class07209 var1, class03556<class05369> var2) {
      class05377 class05377 = new class05377(var1, var2, this.u);
      if (this.N(class05377)) {
         N.debug("Added POI of type {} @ {}", var2.M(), var1);
         this.u.run();
         return class05377;
      } else {
         return null;
      }
   }

   public Stream<class05377> N(Predicate<class03556<class05369>> var1, class05372 var2) {
      return this.L.entrySet().stream().filter(var1x -> var1.test(var1x.getKey())).flatMap(var0 -> var0.getValue().stream()).filter(var2.N());
   }

   public Iterator lithium$iterate(Predicate var1) {
      return var1 instanceof SinglePointOfInterestTypeFilter singlepointofinteresttypefilter ? this.y(singlepointofinteresttypefilter.getType()) : this.N(var1);
   }

   public class05377 lithium$getFirstMatchingPoint(class07209 var1, long var2, Predicate var4, Predicate var5, class05372 var6) {
      return var4 instanceof SinglePointOfInterestTypeFilter singlepointofinteresttypefilter
         ? this.N(var1, var2, singlepointofinteresttypefilter.getType(), var5, var6)
         : this.N(var1, var2, var4, var5, var6);
   }

   public void lithium$collectMatchingPoints(Predicate var1, class05372 var2, Consumer var3) {
      if (var1 instanceof SinglePointOfInterestTypeFilter) {
         this.N(((SinglePointOfInterestTypeFilter)var1).getType(), var2, var3);
      } else {
         this.N(var1, var2, var3);
      }
   }

   private Optional<class05377> R(class07209 var1) {
      return Optional.ofNullable((class05377)this.y.get(class01296.y(var1)));
   }

   public class05377 lithium$getL2ClosestMatchingPoint(class07209 var1, Predicate var2, Predicate var3) {
      return var2 instanceof SinglePointOfInterestTypeFilter singlepointofinteresttypefilter
         ? this.N(var1, singlepointofinteresttypefilter.getType(), var3)
         : this.N(var1, var2, var3);
   }

   public class05377 lithium$getAt(class07209 var1) {
      return this.R(var1).orElse(null);
   }

   public void lithium$collectMatchingPointsL2Limited(class07209 var1, long var2, Predicate var4, Predicate var5, Consumer var6, int var7) {
      if (var4 instanceof SinglePointOfInterestTypeFilter singlepointofinteresttypefilter) {
         this.N(var1, var2, singlepointofinteresttypefilter.getType(), var5, var6, var7);
      } else {
         this.N(var1, var2, var4, var5, var6, var7);
      }
   }
}
