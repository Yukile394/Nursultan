package minecraft;

import Nursultan.class10533;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.SequencedMap;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class class05918 implements class03190, AutoCloseable {
   public static final Supplier<class07001> N = () -> null;
   private static final Logger y = LogUtils.getLogger();
   private final AtomicBoolean L = new AtomicBoolean();
   private final class08240 u;
   private final class07368 i;
   private final SequencedMap<class07321, class05924> R = new LinkedHashMap<>();
   private final Long2ObjectLinkedOpenHashMap<CompletableFuture<BitSet>> M = new Long2ObjectLinkedOpenHashMap();
   private static final int B = 1024;

   private void L() {
      this.u.N(new class10533(class05900.field_27238.ordinal(), this::y));
   }

   protected class05918(class02277 var1, Path var2, boolean var3) {
      super();
      this.i = new class07368(var1, var2, var3);
      this.u = new class08240(class05900.values().length, class07536.Z(), "IOWorker-" + var1.L());
   }

   @Override
   public void close() throws IOException {
      if (this.L.compareAndSet(false, true)) {
         this.u();
         this.u.close();

         try {
            this.i.close();
         } catch (Exception exception) {
            y.error("Failed to close storage", exception);
         }
      }
   }

   private void u() {
      this.u.N(class05900.field_27239.ordinal(), var0 -> var0.complete(class06244.field_17274)).join();
   }

   private CompletableFuture<BitSet> y(int var1, int var2) {
      return CompletableFuture.supplyAsync(() -> {
         class07321 class07321x = class07321.N(var1, var2);
         class07321 class07321x = class07321.y(var1, var2);
         BitSet bitset = new BitSet();
         class07321.N(class07321x, class07321x).forEach(var2xx -> {
            class03164 class03164 = new class03164(new class03152(class07720.N, "DataVersion"), new class03152(class07001.y, "blending_data"));

            try {
               this.N(var2xx, class03164).join();
            } catch (Exception exception) {
               y.warn("Failed to scan chunk {}", var2xx, exception);
               return;
            }

            if (class03164.u() instanceof class07001 class07001 && this.N(class07001)) {
               int ix = var2xx.E() * 32 + var2xx.U();
               bitset.set(ix);
            }
         });
         return bitset;
      }, class07536.B());
   }

   private void y() {
      Entry entry = this.R.pollFirstEntry();
      if (entry != null) {
         this.N((class07321)entry.getKey(), (class05924)entry.getValue());
         this.L();
      }
   }

   private CompletableFuture<BitSet> N(int var1, int var2) {
      long ix = class07321.u(var1, var2);
      synchronized (this.M) {
         CompletableFuture<BitSet> completablefuture = (CompletableFuture<BitSet>)this.M.getAndMoveToFirst(ix);
         if (completablefuture == null) {
            completablefuture = this.y(var1, var2);
            this.M.putAndMoveToFirst(ix, completablefuture);
            if (this.M.size() > 1024) {
               this.M.removeLast();
            }
         }

         return completablefuture;
      }
   }

   public boolean N(class07321 var1, int var2) {
      class07321 class07321xx = new class07321(var1.B - var2, var1.Z - var2);
      class07321 class07321x = new class07321(var1.B + var2, var1.Z + var2);

      for (int ix = class07321xx.Z(); ix <= class07321x.Z(); ix++) {
         for (int j = class07321xx.z(); j <= class07321x.z(); j++) {
            BitSet bitset = this.N(ix, j).join();
            if (!bitset.isEmpty()) {
               class07321 class07321xx = class07321.N(ix, j);
               int k = Math.max(class07321xx.B - class07321xx.B, 0);
               int l = Math.max(class07321xx.Z - class07321xx.Z, 0);
               int i1 = Math.min(class07321x.B - class07321xx.B, 31);
               int j1 = Math.min(class07321x.Z - class07321xx.Z, 31);

               for (int k1 = k; k1 <= i1; k1++) {
                  for (int l1 = l; l1 <= j1; l1++) {
                     int i2 = l1 * 32 + k1;
                     if (bitset.get(i2)) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   @Override
   public CompletableFuture<Void> N(class07321 var1, class03175 var2) {
      return this.N_54(() -> {
         try {
            class05924 class05924 = this.R.get(var1);
            if (class05924 != null) {
               if (class05924.N != null) {
                  class05924.N.y(var2);
               }
            } else {
               this.i.N(var1, var2);
            }

            return null;
         } catch (Exception exception) {
            y.warn("Failed to bulk scan chunk {}", var1, exception);
            throw exception;
         }
      });
   }

   private <T> CompletableFuture<T> N_54(class05896<T> var1) {
      return this.u.N(class05900.field_27237.ordinal(), var2 -> {
         if (!this.L.get()) {
            try {
               var2.complete((T)var1.get());
            } catch (Exception exception) {
               var2.completeExceptionally(exception);
            }
         }

         this.L();
      });
   }

   private <T> CompletableFuture<T> N(Supplier<T> var1) {
      return this.u.N(class05900.field_27237.ordinal(), var2 -> {
         if (!this.L.get()) {
            var2.complete((T)var1.get());
         }

         this.L();
      });
   }

   private boolean N(class07001 var1) {
      return var1.y("DataVersion", 0) < 4295 ? true : var1.W("blending_data").isPresent();
   }

   public CompletableFuture<Void> N(boolean var1) {
      CompletableFuture completablefuture = this.<CompletableFuture<Void>>N(
            (Supplier<CompletableFuture<Void>>)(() -> CompletableFuture.allOf(this.R.values().stream().map(var0 -> var0.y).toArray(CompletableFuture[]::new)))
         )
         .thenCompose(Function.identity());
      return var1 ? completablefuture.thenCompose(var1x -> this.N_54(() -> {
         try {
            this.i.N();
            return null;
         } catch (Exception exception) {
            y.warn("Failed to synchronize chunks", exception);
            throw exception;
         }
      })) : completablefuture.thenCompose(var1x -> this.N((Supplier<Void>)(() -> null)));
   }

   public CompletableFuture<Optional<class07001>> N(class07321 var1) {
      return this.N_54(() -> {
         class05924 class05924 = this.R.get(var1);
         if (class05924 != null) {
            return Optional.ofNullable(class05924.N());
         } else {
            try {
               class07001 class07001 = this.i.N(var1);
               return Optional.ofNullable(class07001);
            } catch (Exception exception) {
               y.warn("Failed to read chunk {}", var1, exception);
               throw exception;
            }
         }
      });
   }

   public CompletableFuture<Void> N(class07321 var1, Supplier<class07001> var2) {
      return this.<CompletableFuture<Void>>N((Supplier<CompletableFuture<Void>>)(() -> {
         class07001 class07001 = (class07001)var2.get();
         class05924 class05924 = this.R.computeIfAbsent(var1, var1xx -> new class05924(class07001));
         class05924.N = class07001;
         return class05924.y;
      })).thenCompose(Function.identity());
   }

   public CompletableFuture<Void> N(class07321 var1, class07001 var2) {
      return this.N(var1, () -> var2);
   }

   private void N(class07321 var1, class05924 var2) {
      try {
         this.i.N(var1, var2.N);
         var2.y.complete(null);
      } catch (Exception exception) {
         y.error("Failed to store chunk {}", var1, exception);
         var2.y.completeExceptionally(exception);
      }
   }

   public class02277 N() {
      return this.i.y();
   }
}
