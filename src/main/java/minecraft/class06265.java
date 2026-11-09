package minecraft;

import Nursultan.class10318;
import Nursultan.class10572;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.Unload;
import net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06265 extends class06172 implements class02228, class04789, ChunkMapAccessor {
   private static final class02818<List<class08050>> R = class02818.N("Unloaded chunks found in range");
   private static final CompletableFuture<class02818<List<class08050>>> M = CompletableFuture.completedFuture(R);
   private static final byte B = -1;
   private static final byte Z = 0;
   private static final byte z = 1;
   private static final Logger U = LogUtils.getLogger();
   private static final int E = 200;
   private static final int W = 20;
   private static final int m = 10000;
   private static final int P = 128;
   public static final int N = 2;
   public static final int y = 32;
   public static final int L = class03469.N(class04763.field_13877);
   private final Long2ObjectLinkedOpenHashMap<class04745> s = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<class04745> T = this.s.clone();
   private final Long2ObjectLinkedOpenHashMap<class04745> b = new Long2ObjectLinkedOpenHashMap();
   private final List<class02217> j = new ArrayList<>();
   public final class04782 u;
   private final class04775 v;
   private final class06709<Runnable> n;
   private final class04084 t;
   private final class02045 G;
   private final class08593 l;
   private final class05368 d;
   final LongSet i = new LongOpenHashSet();
   private boolean w;
   private final class08201 k;
   private final class08201 Y;
   private final class01110 Q;
   private final class06234 O;
   private final String g;
   private final class04757 I = new class04757();
   private final Int2ObjectMap<class10572> J = new Int2ObjectOpenHashMap();
   private final Long2ByteMap o = new Long2ByteOpenHashMap();
   private final Long2LongMap q = new Long2LongOpenHashMap();
   private final LongSet K = new LongLinkedOpenHashSet();
   private final Queue<Runnable> V = Queues.newConcurrentLinkedQueue();
   private final AtomicInteger e = new AtomicInteger();
   private int H;
   private final class02688 c;

   public boolean L(class07049 var1) {
      class10572 class10572 = (class10572)this.J.get(var1.method_5628());
      return class10572 != null ? !class10572.u.isEmpty() : false;
   }

   @Nullable
   public class00549 L(long var1) {
      class04745 class04745 = this.y(var1);
      return class04745 != null ? class04745.n() : null;
   }

   private void L(BooleanSupplier var1) {
      long ix = class07536.L();
      int jx = 0;
      LongIterator longiterator = this.K.iterator();

      while (jx < 20 && this.e.get() < 128 && var1.getAsBoolean() && longiterator.hasNext()) {
         long kx = longiterator.nextLong();
         class04745 class04745 = (class04745)this.T.get(kx);
         class08050 class08050 = class04745 != null ? class04745.s() : null;
         if (class08050 == null || !class08050.U()) {
            longiterator.remove();
         } else if (this.N(class04745, ix)) {
            jx++;
            longiterator.remove();
         }
      }
   }

   public CompletableFuture<class02818<class00570>> L(class04745 var1) {
      return this.N(var1, 1, class03469::y).thenApply(var0 -> var0.N_11(var0x -> (class00570)var0x.get(var0x.size() / 2)));
   }

   public List<class04770> L(class07321 var1) {
      long ix = var1.y();
      if (!this.O.i(ix).y(true)) {
         return List.of();
      } else {
         Builder builder = ImmutableList.builder();

         for (class04770 class04770 : this.I.N()) {
            if (this.L(class04770, var1)) {
               builder.add(class04770);
            }
         }

         return builder.build();
      }
   }

   private boolean L(class04770 var1, class07321 var2) {
      return var1.method_7325() ? false : N(var2, var1.method_73189()) < 16384.0;
   }

   protected class04084 L() {
      return this.t;
   }

   private boolean L(class04770 var1) {
      return var1.method_7325() && !this.u.method_64395().N(class07305.Ny);
   }

   @Override
   public void M() {
      this.j.forEach(this::N);
      this.j.clear();
   }

   private CompletableFuture<class08050> M(class07321 var1) {
      CompletableFuture completablefuture = this.U(var1).thenApplyAsync(var2x -> var2x.map(var2xx -> {
         class07344 class07344 = class07344.N(this.u, this.u.method_74142(), var2xx);
         if (class07344 == null) {
            U.error("Chunk file at {} is missing level data, skipping", var1);
         }

         return class07344;
      }), class07536.B().N("parseChunk"));
      CompletableFuture<?> completablefuture1 = this.d.N(var1);
      return completablefuture.<Object, Optional>thenCombine((CompletionStage<? extends Object>)completablefuture1, (var0, var1x) -> (Optional)var0)
         .thenApplyAsync(var2x -> {
            class08700.N().R("chunkLoad");
            if (var2x.isPresent()) {
               class07361 class07361 = ((class07344)var2x.get()).N(this.u, this.d, this.m(), var1);
               this.N(var1, class07361.E().u());
               return class07361;
            } else {
               return this.B(var1);
            }
         }, this.n)
         .exceptionallyAsync(var2x -> this.N(var2x, var1), this.n);
   }

   public class06265(
      class04782 var1,
      class04785 var2,
      DataFixer var3,
      class01224 var4,
      Executor var5,
      class06709<Runnable> var6,
      class00538 var7,
      class08088 var8,
      class01110 var9,
      Supplier<class00408> var10,
      class08593 var11,
      int var12,
      boolean var13
   ) {
      super(
         new class02277(var2.R(), var1.method_27983(), "chunk"),
         var2.N(var1.method_27983()).resolve("region"),
         var3,
         var13,
         class05715.field_19214,
         class05176.N(var1.method_27983(), var10, var3)
      );
      Path path = var2.N(var1.method_27983());
      this.g = path.getFileName().toString();
      this.u = var1;
      class01042 class01042 = var1.method_30349();
      long ix = var1.method_8412();
      if (var8 instanceof class04865 class04865) {
         this.t = class04084.N(class04865.B().N(), class01042.L(class04227.yW), ix);
      } else {
         this.t = class04084.N(class05943.i(), class01042.L(class04227.yW), ix);
      }

      this.G = var8.N(class01042.L(class04227.yb), this.t, ix);
      this.n = var6;
      class08214 class08214 = new class08214(var5, "worldgen");
      this.Q = var9;
      class08214 class08214x = new class08214(var5, "light");
      this.k = new class08201(class08214, var5);
      this.Y = new class08201(class08214x, var5);
      this.v = new class04775(var7, this, this.u.method_8597().i(), class08214x, this.Y);
      this.O = new class06234(this, var11, var5, var6);
      this.l = var11;
      this.d = new class05368(new class02277(var2.R(), var1.method_27983(), "poi"), path.resolve("poi"), var3, var13, class01042, var1.method_8503(), var1);
      this.N(var12);
      this.c = new class02688(var1, var8, var4, this.v, var6, this::R);
   }

   private class08050 B(class07321 var1) {
      this.Z(var1);
      return new class07361(var1, class07371.N, this.u, this.u.method_74142(), null);
   }

   public int B() {
      return this.T.size();
   }

   public class04778 Z() {
      return this.O;
   }

   private void Z(class07321 var1) {
      this.o.put(var1.y(), (byte)-1);
   }

   private void i(class04770 var1) {
      class07321 class07321 = var1.method_31476();
      int ix = this.N(var1);
      if (!(var1.method_52372() instanceof class10318 class10318 && class10318.i().equals(class07321) && class10318.R() == ix)) {
         this.N(var1, class04157.N(class07321, ix));
      }
   }

   @Override
   public class02236 i(long var1) {
      class04745 class04745 = (class04745)this.s.get(var1);
      class04745.m();
      return class04745;
   }

   public boolean i() {
      return this.v.au_()
         || !this.b.isEmpty()
         || !this.s.isEmpty()
         || this.d.y()
         || !this.i.isEmpty()
         || !this.V.isEmpty()
         || this.k.N()
         || this.Y.N()
         || this.O.u();
   }

   private CompletableFuture<Optional<class07001>> U(class07321 var1) {
      return this.u(var1).thenApplyAsync(var1x -> var1x.map(this::N), class07536.B().N("upgradeChunk"));
   }

   protected class05368 U() {
      return this.d;
   }

   @Override
   public void close() throws IOException {
      try {
         this.k.close();
         this.Y.close();
         this.d.close();
      } finally {
         super.close();
      }
   }

   private boolean z(class07321 var1) {
      byte b0 = this.o.get(var1.y());
      if (b0 != 0) {
         return b0 == 1;
      } else {
         class07001 class07001;
         try {
            class07001 = this.U(var1).join().orElse(null);
            if (class07001 == null) {
               this.Z(var1);
               return false;
            }
         } catch (Exception exception) {
            U.error("Failed to read chunk {}", var1, exception);
            this.Z(var1);
            return false;
         }

         class00544 class00544 = class07344.N(class07001).u();
         return this.N(var1, class00544) == 1;
      }
   }

   protected void z() {
      for (class04770 var2 : this.I.N()) {
         this.i(var2);
      }

      ArrayList arraylist = Lists.newArrayList();
      List<class04770> list = this.u.method_18456();
      ObjectIterator<class10572> objectiterator = this.J.values().iterator();

      while (objectiterator.hasNext()) {
         class10572 class10572x = (class10572)objectiterator.next();
         class01296 class01296x = class10572x.L;
         class01296 class01296x = class01296.N(class10572x.y);
         boolean flag = !Objects.equals(class01296x, class01296x);
         if (flag) {
            class10572x.N(list);
            class07049 class07049 = class10572x.y;
            if (class07049 instanceof class04770) {
               arraylist.add((class04770)class07049);
            }

            class10572x.L = class01296x;
         }

         if (flag || class10572x.y.field_64356 || this.O.L(class01296x.E().y())) {
            class10572x.N.N();
         }
      }

      if (!arraylist.isEmpty()) {
         objectiterator = this.J.values().iterator();

         while (objectiterator.hasNext()) {
            class10572 class10572x = (class10572)objectiterator.next();
            class10572x.N(arraylist);
         }
      }
   }

   private void u(class04770 var1) {
      class01296 class01296 = class01296.N(var1);
      var1.method_17668(class01296);
   }

   protected class04775 u() {
      return this.v;
   }

   protected IntSupplier u(long var1) {
      return () -> {
         class04745 class04745 = this.y(var1);
         return class04745 == null ? class06263.N - 1 : Math.min(class04745.U(), class06263.N - 1);
      };
   }

   public void y(Consumer<class00570> var1) {
      ObjectIterator<class04745> objectiterator = this.T.values().iterator();

      while (objectiterator.hasNext()) {
         class00570 class00570 = ((class04745)objectiterator.next()).i();
         if (class00570 != null) {
            var1.accept(class00570);
         }
      }
   }

   public void y(List<class08050> var1) {
      HashMap hashmap = new HashMap();

      for (class08050 class08050 : var1) {
         class07321 class07321 = class08050.R();
         class00570 class00570x;
         if (class08050 instanceof class00570 class00570x) {
            class00570x = class00570x;
         } else {
            class00570x = this.u.method_8497(class07321.B, class07321.Z);
         }

         for (class04770 class04770 : this.N(class07321, false)) {
            hashmap.computeIfAbsent(class04770, var0 -> new ArrayList<>()).add(class00570x);
         }
      }

      hashmap.forEach((var0, var1x) -> var0.field_13987.method_14364(class03598.N((List<class00570>)var1x)));
   }

   public void y(class04770 var1) {
      ObjectIterator<class10572> objectiterator = this.J.values().iterator();

      while (objectiterator.hasNext()) {
         class10572 class10572 = (class10572)objectiterator.next();
         if (class10572.y == var1) {
            class10572.N(this.u.method_18456());
         } else {
            class10572.y(var1);
         }
      }

      class01296 class01296x = var1.method_14232();
      class01296 class01296x = class01296.N(var1);
      boolean flag = this.I.i(var1);
      boolean flag1 = this.L(var1);
      if (class01296x.W() != class01296x.W() || flag != flag1) {
         this.u(var1);
         if (!flag) {
            this.O.y(class01296x, var1);
         }

         if (!flag1) {
            this.O.N(class01296x, var1);
         }

         if (!flag && flag1) {
            this.I.y(var1);
         }

         if (flag && !flag1) {
            this.I.L(var1);
         }

         this.i(var1);
      }
   }

   protected void y(class07049 var1, class00381<? super class07280> var2) {
      class10572 class10572 = (class10572)this.J.get(var1.method_5628());
      if (class10572 != null) {
         class10572.y(var2);
      }
   }

   @Nullable
   protected class04745 y(long var1) {
      return (class04745)this.T.get(var1);
   }

   protected void y(class07049 var1) {
      if (var1 instanceof class04770 class04770) {
         this.N(class04770, false);
         ObjectIterator<class10572> objectiterator = this.J.values().iterator();

         while (objectiterator.hasNext()) {
            ((class10572)objectiterator.next()).N(class04770);
         }
      }

      class10572 class10572 = (class10572)this.J.remove(var1.method_5628());
      if (class10572 != null) {
         class10572.N();
      }
   }

   boolean y(class07321 var1) {
      class02584 class02584 = this.O.i(var1.y());
      return class02584 == class02584.field_52396 ? this.E(var1) : class02584.y(true);
   }

   private boolean y(class04770 var1, int var2, int var3) {
      if (!this.N(var1, var2, var3)) {
         return false;
      } else {
         for (int ix = -1; ix <= 1; ix++) {
            for (int jx = -1; jx <= 1; jx++) {
               if ((ix != 0 || jx != 0) && !this.N(var1, var2 + ix, var3 + jx)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected class02045 y() {
      return this.G;
   }

   public CompletableFuture<class02818<class00570>> y(class04745 var1) {
      return this.N(var1, 1, var0 -> class00549.m).thenApplyAsync(var2 -> var2.N_11(var2x -> {
         class00570 class00570 = (class00570)var2x.get(var2x.size() / 2);
         class00570.N(this.u);
         this.u.method_39223(class00570);
         CompletableFuture<?> completablefuture = var1.R();
         if (completablefuture.isDone()) {
            this.N(var1, class00570);
         } else {
            completablefuture.thenAcceptAsync(var3x -> this.N(var1, class00570), this.n);
         }

         return class00570;
      }), this.n);
   }

   private static void y(class04770 var0, class07321 var1) {
      var0.field_13987.field_45026.N(var0, var1);
   }

   private void y(BooleanSupplier var1) {
      for (LongIterator longiterator = this.i.iterator(); longiterator.hasNext(); longiterator.remove()) {
         long ix = longiterator.nextLong();
         class04745 class04745 = (class04745)this.s.get(ix);
         if (class04745 != null) {
            this.s.remove(ix);
            this.b.put(ix, class04745);
            this.w = true;
            this.N(ix, class04745);
         }
      }

      int jx = Math.max(0, this.V.size() - 2000);

      Runnable runnable;
      while ((jx > 0 || var1.getAsBoolean()) && (runnable = this.V.poll()) != null) {
         jx--;
         runnable.run();
      }

      this.L(var1);
   }

   private boolean E(class07321 var1) {
      for (class04770 class04770 : this.I.N()) {
         if (this.L(class04770, var1)) {
            return true;
         }
      }

      return false;
   }

   public String E() {
      return this.g;
   }

   protected class08088 N() {
      return this.c.y();
   }

   private void N(class04745 var1, CompletableFuture var2, long var3, CallbackInfo var5, class08050 var6) {
      if (var6 instanceof class00570 class00570) {
         ((Unload)ServerChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.u, class00570);
      }
   }

   public boolean N(class04770 var1, int var2, int var3) {
      return var1.method_52372().N(var2, var3) && !var1.field_13987.field_45026.N(class07321.u(var2, var3));
   }

   @Nullable
   public class04745 N(long var1) {
      return (class04745)this.s.get(var1);
   }

   private void N(class04770 var1, class07321 var2) {
      class00570 class00570 = this.R(var2.y());
      if (class00570 != null) {
         N(var1, class00570);
      }
   }

   public int N(class04770 var1) {
      return class04995.N(var1.method_52371(), 2, this.H);
   }

   protected void N(int var1) {
      int ix = class04995.N(var1, 2, 32);
      if (ix != this.H) {
         this.H = ix;
         this.O.N(this.H);

         for (class04770 class04770 : this.I.N()) {
            this.i(class04770);
         }
      }
   }

   private boolean N(class08050 var1) {
      this.d.y(var1.R());
      if (!var1.z()) {
         return false;
      } else {
         class07321 class07321 = var1.R();

         try {
            class00549 class00549 = var1.E();
            if (class00549.u() != class00544.field_12807) {
               if (this.z(class07321)) {
                  return false;
               }

               if (class00549 == class00549.L && var1.M().values().stream().noneMatch(class04932::y)) {
                  return false;
               }
            }

            class08700.N().R("chunkSave");
            this.e.incrementAndGet();
            CompletableFuture completablefuture = CompletableFuture.supplyAsync(class07344.N(this.u, var1)::N, class07536.B());
            this.N(class07321, completablefuture::join).handle((var2x, var3x) -> {
               if (var3x != null) {
                  this.u.method_8503().y(var3x, this.m(), class07321);
               }

               this.e.decrementAndGet();
               return null;
            });
            this.N(class07321, class00549.u());
            return true;
         } catch (Exception exception) {
            this.u.method_8503().y(exception, this.m(), class07321);
            return false;
         }
      }
   }

   private boolean N(class04745 var1, long var2) {
      if (var1.E() && var1.B()) {
         class08050 class08050 = var1.s();
         if (!(class08050 instanceof class00548) && !(class08050 instanceof class00570)) {
            return false;
         } else if (!class08050.U()) {
            return false;
         } else {
            long ix = class08050.R().y();
            long jx = this.q.getOrDefault(ix, -1L);
            if (var2 < jx) {
               return false;
            } else {
               boolean flag = this.N(class08050);
               var1.W();
               if (flag) {
                  this.q.put(ix, var2 + 10000L);
               }

               return flag;
            }
         }
      } else {
         return false;
      }
   }

   Stream<class04745> N(class00549 var1) {
      int ix = class03469.N(var1);
      return this.T.values().stream().filter(var1x -> var1x.z() <= ix);
   }

   private class07001 N(class07001 var1) {
      return this.N(var1, -1, N(this.u.method_27983(), this.N().L()));
   }

   private static String N(CompletableFuture<class02818<class00570>> var0) {
      try {
         class02818 class02818 = (class02818)var0.getNow(null);
         if (class02818 != null) {
            return class02818.N() ? "done" : "unloaded";
         } else {
            return "not completed";
         }
      } catch (CompletionException completionexception) {
         return "failed " + completionexception.getCause().getMessage();
      } catch (CancellationException cancellationexception) {
         return "cancelled";
      }
   }

   void N(Writer var1) throws IOException {
      class04594 class04594 = class04594.N()
         .N("x")
         .N("z")
         .N("level")
         .N("in_memory")
         .N("status")
         .N("full_status")
         .N("accessible_ready")
         .N("ticking_ready")
         .N("entity_ticking_ready")
         .N("ticket")
         .N("spawning")
         .N("block_entity_count")
         .N("ticking_ticket")
         .N("ticking_level")
         .N("block_ticks")
         .N("fluid_ticks")
         .N(var1);
      ObjectBidirectionalIterator<Entry<class04745>> objectbidirectionaliterator = this.T.long2ObjectEntrySet().iterator();

      while (objectbidirectionaliterator.hasNext()) {
         Entry entry = (Entry)objectbidirectionaliterator.next();
         long ix = entry.getLongKey();
         class07321 class07321 = new class07321(ix);
         class04745 class04745 = (class04745)entry.getValue();
         Optional optional = Optional.ofNullable(class04745.s());
         Optional optional1 = optional.flatMap(var0 -> var0 instanceof class00570 ? Optional.of((class08050)var0) : Optional.empty());
         class04594.N(
            class07321.B,
            class07321.Z,
            class04745.z(),
            optional.isPresent(),
            optional.map(class08050::E).orElse(null),
            optional1.map(class00570::g).orElse(null),
            N(class04745.L()),
            N(class04745.N()),
            N(class04745.y()),
            this.l.y(ix, false),
            this.y(class07321),
            optional1.<Integer>map(var0 -> var0.o().size()).orElse(0),
            this.l.y(ix, true),
            this.O.N(ix, true),
            optional1.<Integer>map(var0 -> var0.P().N()).orElse(0),
            optional1.<Integer>map(var0 -> var0.s().N()).orElse(0)
         );
      }
   }

   private void N(long var1, class04745 var3) {
      CompletableFuture<?> completablefuture = var3.M();
      completablefuture.thenRunAsync(() -> {
         if (var3.M() != completablefuture) {
            this.N(var1, var3);
         } else {
            class08050 class08050 = var3.s();
            if (this.b.remove(var1, var3) && class08050 != null) {
               if (class08050 instanceof class00570 class00570x) {
                  class00570x.y(false);
               }

               this.N(var3, completablefuture, var1, null, class08050);
               this.N(class08050);
               if (class08050 instanceof class00570 class00570) {
                  this.u.method_18764(class00570);
               }

               this.v.N(class08050.R());
               this.v.y();
               this.q.remove(class08050.R().y());
            }
         }
      }, this.V::add).whenComplete((var1x, var2) -> {
         if (var2 != null) {
            U.error("Failed to save chunk {}", var3.b(), var2);
         }
      });
   }

   private static void N(class04770 var0, class00570 var1) {
      var0.field_13987.field_45026.N(var1);
   }

   @Override
   public CompletableFuture<class08050> N(class02236 var1, class02237 var2, class02248<class02236> var3) {
      class07321 class07321 = var1.b();
      if (var2.N() == class00549.L) {
         return this.M(class07321);
      } else {
         try {
            class02236 class02236 = (class02236)var3.N(class07321.B, class07321.Z);
            class08050 class08050 = class02236.N(var2.N().L());
            if (class08050 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               return var2.N(this.c, var3, class08050);
            }
         } catch (Exception exception) {
            exception.getStackTrace();
            class07080 class07080 = class07080.N(exception, "Exception generating new chunk");
            class07074 class07074 = class07080.N("Chunk to be generated");
            class07074.N("Status being generated", () -> var2.N().R());
            class07074.N("Location", String.format(Locale.ROOT, "%d,%d", class07321.B, class07321.Z));
            class07074.N("Position hash", class07321.u(class07321.B, class07321.Z));
            class07074.N("Generator", this.N());
            this.n.execute(() -> {
               throw new class07878(class07080);
            });
            throw new class07878(class07080);
         }
      }
   }

   @Override
   public void N(class02236 var1) {
      var1.P();
   }

   private byte N(class07321 var1, class00544 var2) {
      return this.o.put(var1.y(), (byte)(var2 == class00544.field_12808 ? -1 : 1));
   }

   private class08050 N(Throwable var1, class07321 var2) {
      Throwable throwable = var1 instanceof CompletionException completionexception ? completionexception.getCause() : var1;
      Throwable throwable1 = throwable instanceof class07878 class07878 ? class07878.getCause() : throwable;
      boolean flag1 = throwable1 instanceof Error;
      boolean flag = throwable1 instanceof IOException || throwable1 instanceof class03142;
      if (!flag1) {
         if (!flag) {
         }

         this.u.method_8503().N(throwable1, this.m(), var2);
         return this.B(var2);
      } else {
         class07080 class07080 = class07080.N(var1, "Exception loading chunk");
         class07080.N("Chunk being loaded").N("pos", var2);
         this.Z(var2);
         throw new class07878(class07080);
      }
   }

   private void N(class07321 var1, IntSupplier var2, int var3, IntConsumer var4) {
      this.k.method_17209(var1, var2, var3, var4);
      this.Y.method_17209(var1, var2, var3, var4);
   }

   public CompletableFuture<class02818<class00570>> N(class04745 var1) {
      return this.N(var1, 2, var0 -> class00549.m).thenApply(var0 -> var0.N_11(var0x -> (class00570)var0x.get(var0x.size() / 2)));
   }

   private void N(class04745 var1, class00570 var2) {
      class07321 class07321 = var2.R();

      for (class04770 class04770 : this.I.N()) {
         if (class04770.method_52372().N(class07321)) {
            N(class04770, var2);
         }
      }

      this.u.method_14178().N(var1);
      this.u.method_74535().N(var2);
   }

   @Nullable
   class04745 N(long var1, int var3, @Nullable class04745 var4, int var5) {
      if (!class03469.R(var5) && !class03469.R(var3)) {
         return var4;
      } else {
         if (var4 != null) {
            var4.N(var3);
         }

         if (var4 != null) {
            if (!class03469.R(var3)) {
               this.i.add(var1);
            } else {
               this.i.remove(var1);
            }
         }

         if (class03469.R(var3) && var4 == null) {
            var4 = (class04745)this.b.remove(var1);
            if (var4 != null) {
               var4.N(var3);
            } else {
               var4 = new class04745(new class07321(var1), var3, this.u, this.v, this::N, this);
            }

            this.s.put(var1, var4);
            this.w = true;
         }

         return var4;
      }
   }

   private void N(class02217 var1) {
      class02236 class02236 = var1.L();
      this.k.N(() -> {
         CompletableFuture<?> completablefuture = var1.N();
         if (completablefuture != null) {
            completablefuture.thenRun(() -> this.N(var1));
         }
      }, class02236.b().y(), class02236::U);
   }

   @Override
   public class02217 N(class00549 var1, class07321 var2) {
      class02217 class02217 = class02217.N(this, var1, var2);
      this.j.add(class02217);
      return class02217;
   }

   public void N(class07049 var1, class00381<? super class07280> var2, Predicate<class04770> var3) {
      class10572 class10572 = (class10572)this.J.get(var1.method_5628());
      if (class10572 != null) {
         class10572.N(var2, var3);
      }
   }

   public void N(class07049 var1, class00381<? super class07280> var2) {
      class10572 class10572 = (class10572)this.J.get(var1.method_5628());
      if (class10572 != null) {
         class10572.N(var2);
      }
   }

   protected void N(class07049 var1) {
      if (!(var1 instanceof class00695)) {
         class07078<?> class07078 = var1.method_5864();
         int ix = class07078.W() * 16;
         if (ix != 0) {
            int jx = class07078.m();
            if (this.J.containsKey(var1.method_5628())) {
               throw (IllegalStateException)class07536.y(new IllegalStateException("Entity is already tracked!"));
            } else {
               class10572 class10572x = new class10572(this, var1, ix, jx, class07078.P());
               this.J.put(var1.method_5628(), class10572x);
               class10572x.N(this.u.method_18456());
               if (var1 instanceof class04770 class04770) {
                  this.N(class04770, true);
                  ObjectIterator<class10572> objectiterator = this.J.values().iterator();

                  while (objectiterator.hasNext()) {
                     class10572 class10572x = (class10572)objectiterator.next();
                     if (class10572x.y != class04770) {
                        class10572x.y(class04770);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public List<class04770> N(class07321 var1, boolean var2) {
      Set<class04770> set = this.I.N();
      Builder builder = ImmutableList.builder();

      for (class04770 class04770 : set) {
         if (var2 && this.y(class04770, var1.B, var1.Z) || !var2 && this.N(class04770, var1.B, var1.Z)) {
            builder.add(class04770);
         }
      }

      return builder.build();
   }

   private void N(class04770 var1, class04157 var2) {
      if (var1.method_51469() == this.u) {
         class04157 class04157 = var1.method_52372();
         if (var2 instanceof class10318 class10318 && (!(class04157 instanceof class10318) || !((class10318)class04157).i().equals(class10318.i()))) {
            var1.field_13987.method_14364(new class05707(class10318.i().B, class10318.i().Z));
         }

         class04157.N(class04157, var2, var2x -> this.N(var1, var2x), var1x -> y(var1, var1x));
         var1.method_52373(var2);
      }
   }

   public void N(class07321 var1, int var2) {
      int ix = var2 + 1;
      class07321.N(var1, ix).forEach(var1x -> {
         class04745 class04745 = this.y(var1x.y());
         if (class04745 != null) {
            class04745.N(this.v.N(var1x.B, var1x.Z));
         }
      });
   }

   protected void N(boolean var1) {
      if (var1) {
         List<class04745> list = this.T.values().stream().filter(class04745::E).peek(class04745::W).toList();
         MutableBoolean mutableboolean = new MutableBoolean();

         do {
            mutableboolean.setFalse();
            list.stream().map(var1x -> {
               this.n.y(var1x::B);
               return var1x.s();
            }).filter(var0 -> var0 instanceof class00548 || var0 instanceof class00570).filter(this::N).forEach(var1x -> mutableboolean.setTrue());
         } while (mutableboolean.isTrue());

         this.d.N();
         this.y(() -> true);
         this.y(true).join();
      } else {
         this.q.clear();
         long ix = class07536.L();
         ObjectIterator<class04745> objectiterator = this.T.values().iterator();

         while (objectiterator.hasNext()) {
            class04745 class04745 = (class04745)objectiterator.next();
            this.N(class04745, ix);
         }
      }
   }

   void N(class07321 var1, class04763 var2) {
      this.Q.onChunkStatusChange(var1, var2);
   }

   protected void N(BooleanSupplier var1) {
      class04643 class04643 = class08700.N();
      class04643.N("poi");
      this.d.N(var1);
      class04643.y("chunk_unload");
      if (!this.u.method_8458()) {
         this.y(var1);
      }

      class04643.L();
   }

   public void N(class04770 var1, Consumer<class07049> var2) {
      ObjectIterator<class10572> objectiterator = this.J.values().iterator();

      while (objectiterator.hasNext()) {
         class10572 class10572 = (class10572)objectiterator.next();
         if (class10572.u.contains(var1.field_13987)) {
            var2.accept(class10572.y);
         }
      }
   }

   public class07878 N(IllegalStateException var1, String var2) {
      StringBuilder stringbuilder = new StringBuilder();
      Consumer consumer = var1x -> var1x.v()
         .forEach(
            var2x -> {
               class00549 class00549 = (class00549)var2x.getFirst();
               CompletableFuture completablefuture = (CompletableFuture)var2x.getSecond();
               if (completablefuture != null && completablefuture.isDone() && completablefuture.join() == null) {
                  stringbuilder.append(var1x.b())
                     .append(" - status: ")
                     .append(class00549)
                     .append(" future: ")
                     .append(completablefuture)
                     .append(System.lineSeparator());
               }
            }
         );
      stringbuilder.append("Updating:").append(System.lineSeparator());
      this.s.values().forEach(consumer);
      stringbuilder.append("Visible:").append(System.lineSeparator());
      this.T.values().forEach(consumer);
      class07080 class07080 = class07080.N(var1, "Chunk loading");
      class07074 class07074 = class07080.N("Chunk loading");
      class07074.N("Details", var2);
      class07074.N("Futures", stringbuilder);
      return new class07878(class07080);
   }

   boolean N(class07209 var1, int var2) {
      class06889 class06889 = new class06889(var1);

      for (class04770 class04770 : this.I.N()) {
         if (this.N(class04770, class06889, var2)) {
            return true;
         }
      }

      return false;
   }

   void N(Consumer<class00570> var1) {
      this.O.N(var2 -> {
         class04745 class04745 = (class04745)this.T.get(var2);
         if (class04745 != null) {
            class00570 class00570 = class04745.u();
            if (class00570 != null) {
               var1.accept(class00570);
            }
         }
      });
   }

   void N(List<class00570> var1) {
      LongIterator longiterator = this.O.y();

      while (longiterator.hasNext()) {
         class04745 class04745 = (class04745)this.T.get(longiterator.nextLong());
         if (class04745 != null) {
            class00570 class00570 = class04745.u();
            if (class00570 != null && this.E(class04745.b())) {
               var1.add(class00570);
            }
         }
      }
   }

   public static class07001 N(class05946<class07299> var0, Optional<class05946<MapCodec<? extends class08088>>> var1) {
      class07001 class07001 = new class07001();
      class07001.N_67("dimension", var0.N().toString());
      var1.ifPresent(var1x -> class07001.N_67("generator", var1x.N().toString()));
      return class07001;
   }

   void N(class04770 var1, boolean var2) {
      boolean flag = this.L(var1);
      boolean flag1 = this.I.u(var1);
      if (var2) {
         this.I.N(var1, flag);
         this.u(var1);
         if (!flag) {
            this.O.N(class01296.N(var1), var1);
         }

         var1.method_52373(class04157.N);
         this.i(var1);
      } else {
         class01296 class01296 = var1.method_14232();
         this.I.N(var1);
         if (!flag1) {
            this.O.y(class01296, var1);
         }

         this.N(var1, class04157.N);
      }
   }

   public String N(class07321 var1) {
      class04745 class04745 = this.y(var1.y());
      if (class04745 == null) {
         return "null";
      } else {
         String sx = class04745.z() + "\n";
         class00549 class00549 = class04745.n();
         class08050 class08050 = class04745.s();
         if (class00549 != null) {
            sx = sx + "St: §" + class00549.y() + class00549 + "§r\n";
         }

         if (class08050 != null) {
            sx = sx + "Ch: §" + class08050.E().y() + class08050.E() + "§r\n";
         }

         class04763 class04763 = class04745.j();
         sx = sx + '§' + class04763.ordinal() + class04763;
         return sx + "§r";
      }
   }

   private static double N(class07321 var0, class06889 var1) {
      double d0 = class01296.N(var0.B, 8);
      double d1 = class01296.N(var0.Z, 8);
      double d2 = d0 - var1.M;
      double d3 = d1 - var1.Z;
      return d2 * d2 + d3 * d3;
   }

   private boolean N(class04770 var1, class06889 var2, int var3) {
      return var1.method_7325() ? false : var1.method_73189().R(var2) < var3;
   }

   CompletableFuture<class02818<List<class08050>>> N(class04745 var1, int var2, IntFunction<class00549> var3) {
      if (var2 == 0) {
         class00549 class00549 = (class00549)var3.apply(0);
         return var1.N(class00549, this).thenApply(var0 -> var0.N_11(List::of));
      } else {
         int ix = class04995.Z(var2 * 2 + 1);
         ArrayList arraylist = new ArrayList(ix);
         class07321 class07321 = var1.b();

         for (int jx = -var2; jx <= var2; jx++) {
            for (int kx = -var2; kx <= var2; kx++) {
               int lx = Math.max(Math.abs(kx), Math.abs(jx));
               long i1 = class07321.u(class07321.B + kx, class07321.Z + jx);
               class04745 class04745 = this.N(i1);
               if (class04745 == null) {
                  return M;
               }

               class00549 class00549x = (class00549)var3.apply(lx);
               arraylist.add(class04745.N(class00549x, this));
            }
         }

         return class07536.L(arraylist).thenApply(var1x -> {
            ArrayList arraylistx = new ArrayList(var1x.size());

            for (class02818 class02818 : var1x) {
               if (class02818 == null) {
                  throw this.N(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               class08050 class08050 = (class08050)class02818.y(null);
               if (class08050 == null) {
                  return R;
               }

               arraylistx.add(class08050);
            }

            return class02818.N(arraylistx);
         });
      }
   }

   @Nullable
   public class00570 R(long var1) {
      class04745 class04745 = this.y(var1);
      return class04745 == null ? null : class04745.i();
   }

   private void R(class07321 var1) {
      this.K.add(var1.y());
   }

   protected boolean R() {
      if (!this.w) {
         return false;
      } else {
         this.T = this.s.clone();
         this.w = false;
         return true;
      }
   }
}
