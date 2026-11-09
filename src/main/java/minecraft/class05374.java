package minecraft;

import Nursultan.class10508;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongListIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.common.util.collections.ListeningLong2ObjectOpenHashMap;
import net.caffeinemc.mods.lithium.common.util.functions.FunLongAnd5;
import net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05374<R, P> implements AutoCloseable, RegionBasedStorageSectionExtended {
   static final Logger L = LogUtils.getLogger();
   private static final String N = "Sections";
   private final class06172 y;
   private Long2ObjectMap<Optional<R>> i = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet R = new LongLinkedOpenHashSet();
   private final Codec<P> M;
   private final Function<R, P> B;
   private final BiFunction<P, Runnable, R> Z;
   private final Function<Runnable, R> z;
   private final class01042 U;
   private final class02599 E;
   protected final class05474 u;
   private final LongSet W = new LongOpenHashSet();
   private final Long2ObjectMap<CompletableFuture<Optional<class05356<P>>>> m = new Long2ObjectOpenHashMap();
   private final Object P = new Object();
   private Long2ObjectOpenHashMap s;

   private void L(class07321 var1) {
      long ix = var1.y();
      CompletableFuture completablefuture;
      synchronized (this.P) {
         if (!this.W.add(ix)) {
            return;
         }

         completablefuture = (CompletableFuture)this.m.computeIfAbsent(ix, var2x -> this.u(var1));
      }

      this.N(var1, (class05356<P>)((Optional)completablefuture.join()).orElse(null));
      synchronized (this.P) {
         this.m.remove(ix);
      }
   }

   protected void L(long var1) {
   }

   private void L() {
      synchronized (this.P) {
         ObjectIterator objectiterator = Long2ObjectMaps.fastIterator(this.m);

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            Optional optional = (Optional)((CompletableFuture)entry.getValue()).getNow(null);
            if (optional != null) {
               long ix = entry.getLongKey();
               this.N(new class07321(ix), (class05356<P>)optional.orElse(null));
               objectiterator.remove();
               this.W.add(ix);
            }
         }
      }
   }

   protected R M(long var1) {
      if (this.R(var1)) {
         throw (IllegalArgumentException)class07536.y(new IllegalArgumentException("sectionPos out of bounds"));
      } else {
         Optional optional = this.i(var1);
         if (optional.isPresent()) {
            return (R)optional.get();
         } else {
            Object object = this.z.apply(() -> this.y(var1));
            this.i.put(var1, Optional.of(object));
            return (R)object;
         }
      }
   }

   public class05374(
      class06172 var1,
      Codec<P> var2,
      Function<R, P> var3,
      BiFunction<P, Runnable, R> var4,
      Function<Runnable, R> var5,
      class01042 var6,
      class02599 var7,
      class05474 var8
   ) {
      super();
      this.y = var1;
      this.M = var2;
      this.B = var3;
      this.Z = var4;
      this.z = var5;
      this.U = var6;
      this.E = var7;
      this.u = var8;
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public Optional<R> i(long var1) {
      if (this.R(var1)) {
         return Optional.empty();
      } else {
         Optional optional = this.u(var1);
         if (optional != null) {
            return optional;
         } else {
            this.L(class01296.N(var1).E());
            optional = this.u(var1);
            if (optional == null) {
               throw (IllegalStateException)class07536.y(new IllegalStateException());
            } else {
               return optional;
            }
         }
      }
   }

   private void i(class07321 var1) {
      class03519 class03519 = this.U.N(class07713.N);
      class07709 class07709 = (class07709)this.N(var1, class03519).getValue();
      if (class07709 instanceof class07001 class07001) {
         this.y.N(var1, class07001).exceptionally(var2x -> {
            this.E.y(var2x, this.y.m(), var1);
            return null;
         });
      } else {
         L.error("Expected compound tag, got {}", class07709);
      }
   }

   @Override
   public void close() throws IOException {
      this.y.close();
   }

   @Nullable
   protected Optional<R> u(long var1) {
      return (Optional<R>)this.i.get(var1);
   }

   private CompletableFuture<Optional<class05356<P>>> u(class07321 var1) {
      class03519 class03519 = this.U.N(class07713.N);
      return this.y
         .u(var1)
         .thenApplyAsync(var2x -> var2x.map(var2xx -> class05356.N(this.M, class03519, var2xx, this.y, this.u)), class07536.B().N("parseSection"))
         .exceptionally(var2x -> {
            if (var2x instanceof CompletionException) {
               var2x = var2x.getCause();
            }

            if (var2x instanceof IOException ioexception) {
               L.error("Error reading chunk {} data from disk", var1, ioexception);
               this.E.N(ioexception, this.y.m(), var1);
               return Optional.empty();
            } else {
               throw new CompletionException(var2x);
            }
         });
   }

   public void y(class07321 var1) {
      if (this.R.remove(var1.y())) {
         this.i(var1);
      }
   }

   protected void y(long var1) {
      Optional optional = (Optional)this.i.get(var1);
      if (optional != null && !optional.isEmpty()) {
         this.R.add(class07321.u(class01296.y(var1), class01296.u(var1)));
      } else {
         L.warn("No data for position: {}", class01296.N(var1));
      }
   }

   public boolean y() {
      return !this.R.isEmpty();
   }

   private void y(long var1, Optional var3) {
      int ix = SectionYIndex.fromSectionCoord(this.u, class01296.L(var1));
      if (ix >= 0 && ix < SectionYIndex.getNumYSections(this.u)) {
         int j = class01296.y(var1);
         int k = class01296.u(var1);
         long l = class07321.u(j, k);
         BitSet bitset = (BitSet)this.s.get(l);
         if (bitset == null) {
            this.s.put(l, bitset = new BitSet(SectionYIndex.getNumYSections(this.u)));
         }

         bitset.set(ix, var3.isPresent());
      }
   }

   private void N(
      class06172 var1, Codec var2, Function var3, BiFunction var4, Function var5, class01042 var6, class02599 var7, class05474 var8, CallbackInfo var9
   ) {
      this.s = new Long2ObjectOpenHashMap();
      this.i = new ListeningLong2ObjectOpenHashMap(this::y, this::N);
   }

   private void N(long var1, Optional var3) {
      int ix = SectionYIndex.fromSectionCoord(this.u, class01296.L(var1));
      if (ix >= 0 && ix < SectionYIndex.getNumYSections(this.u)) {
         int j = class01296.y(var1);
         int k = class01296.u(var1);
         long l = class07321.u(j, k);
         BitSet bitset = (BitSet)this.s.get(l);
         if (bitset != null) {
            bitset.clear(ix);
            if (bitset.isEmpty()) {
               this.s.remove(l);
            }
         }
      }
   }

   private static long N(class07321 var0, int var1) {
      return class01296.y(var0.B, var1, var0.Z);
   }

   private <T> Dynamic<T> N(class07321 var1, DynamicOps<T> var2) {
      HashMap hashmap = Maps.newHashMap();

      for (int ix = this.u.method_32891(); ix <= this.u.method_31597(); ix++) {
         long j = N(var1, ix);
         Optional optional = (Optional)this.i.get(j);
         if (optional != null && !optional.isEmpty()) {
            DataResult dataresult = this.M.encodeStart(var2, this.B.apply((R)optional.get()));
            String sx = Integer.toString(ix);
            dataresult.resultOrPartial(L::error).ifPresent(var3x -> hashmap.put(var2.createString(sx), var3x));
         }
      }

      return new Dynamic(
         var2,
         var2.createMap(
            ImmutableMap.of(
               var2.createString("Sections"), var2.createMap(hashmap), var2.createString("DataVersion"), var2.createInt(class07529.y().comp_4026().y())
            )
         )
      );
   }

   private void N(class07321 var1, @Nullable class05356<P> var2) {
      if (var2 == null) {
         for (int ix = this.u.method_32891(); ix <= this.u.method_31597(); ix++) {
            this.i.put(N(var1, ix), Optional.empty());
         }
      } else {
         boolean flag = var2.y();

         for (int j = this.u.method_32891(); j <= this.u.method_31597(); j++) {
            long k = N(var1, j);
            Optional optional = Optional.ofNullable(var2.N().get(j)).map(var3x -> this.Z.apply((P)var3x, () -> this.y(k)));
            this.i.put(k, optional);
            optional.ifPresent(var4x -> {
               this.L(k);
               if (flag) {
                  this.y(k);
               }
            });
         }
      }
   }

   public CompletableFuture<?> N(class07321 var1) {
      synchronized (this.P) {
         long ix = var1.y();
         return this.W.contains(ix) ? CompletableFuture.completedFuture(null) : (CompletableFuture)this.m.computeIfAbsent(ix, var2 -> this.u(var1));
      }
   }

   protected void N(BooleanSupplier var1) {
      LongListIterator longlistiterator = this.R.iterator();

      while (longlistiterator.hasNext() && var1.getAsBoolean()) {
         class07321 class07321 = new class07321(longlistiterator.nextLong());
         longlistiterator.remove();
         this.i(class07321);
      }

      this.L();
   }

   public void N() {
      if (!this.R.isEmpty()) {
         this.R.forEach(var1 -> this.i(new class07321(var1)));
         this.R.clear();
      }
   }

   public BitSet lithium$getNonEmptyPOISections(int var1, int var2) {
      long ix = class07321.u(var1, var2);
      BitSet bitset = (BitSet)this.s.get(ix);
      if (bitset != null) {
         return bitset;
      } else {
         this.L(new class07321(ix));
         return Objects.requireNonNull((BitSet)this.s.get(ix), "Failed to load POI section data!");
      }
   }

   public int lithium$getChunkYMaxInclusive() {
      return SectionYCoord.getMaxYSectionInclusive(this.u);
   }

   public Object lithium$getFirstInRangeInChunkColumn(
      int var1, int var2, long var3, class07209 var5, long var6, FunLongAnd5 var8, Predicate var9, Predicate var10, Object var11
   ) {
      BitSet bitset = this.lithium$getNonEmptyPOISections(var1, var2);
      if (bitset.isEmpty()) {
         return null;
      } else {
         int ix = SectionYCoord.getMinYSection(this.u);

         for (int j = bitset.nextSetBit(0); j != -1; j = bitset.nextSetBit(j + 1)) {
            int k = j + ix;
            long l = Distances.getClosestBlockCoordInSection(var5.method_10264(), k) - var5.method_10264();
            if (l * l <= var3) {
               Object object = ((Optional)this.i.get(class01296.y(var1, k, var2))).orElse(null);
               Object object1 = var8.apply(object, var5, var9, var10, var11, var6);
               if (object1 != null) {
                  return object1;
               }
            }
         }

         return null;
      }
   }

   protected boolean R(long var1) {
      int ix = class01296.L(class01296.L(var1));
      return this.u.method_31601(ix);
   }

   public Iterable lithium$getInChunkColumn(int var1, int var2) {
      BitSet bitset = this.lithium$getNonEmptyPOISections(var1, var2);
      if (bitset.isEmpty()) {
         return Collections::emptyIterator;
      } else {
         Long2ObjectMap long2objectmap = this.i;
         class05474 class05474 = this.u;
         return () -> new class10508(this, bitset, long2objectmap, var1, class05474, var2);
      }
   }

   public int lithium$getChunkYMin() {
      return SectionYCoord.getMinYSection(this.u);
   }

   public Optional lithium$getElementAt(long var1) {
      return (Optional)this.i.get(var1);
   }
}
