package minecraft;

import Nursultan.class09440;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongBidirectionalIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Objects;
import java.util.Spliterators;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.caffeinemc.mods.lithium.common.entity.PositionedEntityTrackingSection;
import net.caffeinemc.mods.lithium.common.world.ChunkAwareEntityIterable;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01129<T extends class01135> implements ChunkAwareEntityIterable {
   public static final int N = 2;
   public static final int y = 4;
   private final Class<T> L;
   private final Long2ObjectFunction<class01102> u;
   private final Long2ObjectMap<class01101<T>> i = new Long2ObjectOpenHashMap();
   private final LongSortedSet R = new LongAVLTreeSet();

   public class01101<T> L(long var1) {
      return (class01101<T>)this.i.computeIfAbsent(var1, this::M);
   }

   private class01101<T> M(long var1) {
      long ix = R(var1);
      class01102 class01102 = (class01102)this.u.get(ix);
      this.R.add(var1);
      class01101 class01101;
      class01101 class01101x = class01101 = new class01101<>(this.L, class01102);
      this.N(var1, new CallbackInfoReturnable("", false, class01101));
      return class01101x;
   }

   public class01129(Class<T> var1, Long2ObjectFunction<class01102> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public void i(long var1) {
      this.i.remove(var1);
      this.R.remove(var1);
   }

   @Nullable
   public class01101<T> u(long var1) {
      return (class01101<T>)this.i.get(var1);
   }

   public int y() {
      return this.R.size();
   }

   public Stream<class01101<T>> y(long var1) {
      return this.N(var1).<class01101<T>>mapToObj(this.i::get).filter(Objects::nonNull);
   }

   public void y(class00734 var1, class04197<T> var2) {
      this.N(var1, var2x -> var2x.N(var1, var2));
   }

   private void N(long var1, CallbackInfoReturnable var3) {
      ((PositionedEntityTrackingSection)var3.getReturnValue()).lithium$setPos(var1);
   }

   private class04218 N(long var1, class04197 var3) {
      class01101 class01101 = this.u(var1);
      return class01101 != null && 0 != class01101.u() && class01101.L().y() ? var3.accept(class01101) : class04218.field_41283;
   }

   public void N(class00734 var1, class04197 var2, CallbackInfo var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var7 < var4 + 4 && var9 < var6 + 4) {
         var3.cancel();

         for (int ix = var4; ix <= var7; ix++) {
            for (int j = Math.max(var6, 0); j <= var9; j++) {
               if (this.N(ix, var5, var8, j, var2).N()) {
                  return;
               }
            }

            int l = Math.min(-1, var9);

            for (int k = var6; k <= l; k++) {
               if (this.N(ix, var5, var8, k, var2).N()) {
                  return;
               }
            }
         }
      }
   }

   private class04218 N(int var1, int var2, int var3, int var4, class04197 var5) {
      class04218 class04218 = class04218.field_41283;

      for (int ix = Math.max(var2, 0); ix <= var3; ix++) {
         if ((class04218 = this.N(class01296.y(var1, ix, var4), var5)).N()) {
            return class04218;
         }
      }

      int k = Math.min(-1, var3);

      for (int j = var2; j <= k; j++) {
         if ((class04218 = this.N(class01296.y(var1, j, var4), var5)).N()) {
            return class04218;
         }
      }

      return class04218;
   }

   public void N(class00734 var1, class04197<class01101<T>> var2) {
      int ix = class01296.N(var1.N - 2.0);
      int j = class01296.N(var1.y - 4.0);
      int k = class01296.N(var1.L - 2.0);
      int l = class01296.N(var1.u + 2.0);
      int i1 = class01296.N(var1.i + 0.0);
      int j1 = class01296.N(var1.R + 2.0);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo, ix, j, k, l, i1, j1);
      if (!callbackinfo.isCancelled()) {
         for (int k1 = ix; k1 <= l; k1++) {
            long l1 = class01296.y(k1, 0, 0);
            long i2 = class01296.y(k1, -1, -1);
            LongBidirectionalIterator longbidirectionaliterator = this.R.subSet(l1, i2 + 1L).iterator();

            while (longbidirectionaliterator.hasNext()) {
               long j2 = longbidirectionaliterator.nextLong();
               int k2 = class01296.L(j2);
               int l2 = class01296.u(j2);
               if (k2 >= j && k2 <= i1 && l2 >= k && l2 <= j1) {
                  class01101 class01101 = (class01101)this.i.get(j2);
                  if (class01101 != null && !class01101.N() && class01101.L().y() && var2.accept(class01101).N()) {
                     return;
                  }
               }
            }
         }
      }
   }

   public LongStream N(long var1) {
      int ix = class07321.N(var1);
      int j = class07321.y(var1);
      LongSortedSet longsortedset = this.N(ix, j);
      return longsortedset.isEmpty()
         ? LongStream.empty()
         : StreamSupport.longStream(Spliterators.spliteratorUnknownSize(longsortedset.iterator(), 1301), false);
   }

   private LongSortedSet N(int var1, int var2) {
      long ix = class01296.y(var1, 0, var2);
      long j = class01296.y(var1, -1, var2);
      return this.R.subSet(ix, j + 1L);
   }

   public LongSet N() {
      LongOpenHashSet longopenhashset = new LongOpenHashSet();
      this.i.keySet().forEach(var1x -> longopenhashset.add(R(var1x)));
      return longopenhashset;
   }

   public <U extends T> void N(class01128<T, U> var1, class00734 var2, class04197<U> var3) {
      this.N(var2, var3x -> var3x.N(var1, var2, var3));
   }

   private static long R(long var0) {
      return class07321.u(class01296.y(var0), class01296.u(var0));
   }

   public Iterable lithium$IterateEntitiesInTrackedSections() {
      ObjectCollection objectcollection = this.i.values();
      return () -> {
         ObjectIterator objectiterator = objectcollection.iterator();
         return new class09440(this, objectiterator);
      };
   }
}
