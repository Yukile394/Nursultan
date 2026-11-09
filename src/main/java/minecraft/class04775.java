package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04775 extends class05795 implements AutoCloseable {
   public static final int N = 1000;
   private static final Logger i = LogUtils.getLogger();
   private final class08214 R;
   private final ObjectList<Pair<class04783, Runnable>> M = new ObjectArrayList();
   private final class06265 B;
   private final class08201 Z;
   private final int z = 1000;
   private final AtomicBoolean U = new AtomicBoolean();

   public class04775(class00538 var1, class06265 var2, boolean var3, class08214 var4, class08201 var5) {
      super(var1, true, var3);
      this.B = var2;
      this.Z = var5;
      this.R = var4;
   }

   @Override
   public void close() {
   }

   @Override
   public void y(class07321 var1) {
      this.N(var1.B, var1.Z, class04783.field_17261, class07536.N((Runnable)(() -> super.y(var1)), (Supplier<String>)(() -> "propagateLight " + var1)));
   }

   public CompletableFuture<class08050> y(class08050 var1, boolean var2) {
      class07321 class07321 = var1.R();
      var1.N(false);
      this.N(class07321.B, class07321.Z, class04783.field_17261, class07536.N((Runnable)(() -> {
         if (!var2) {
            super.y(class07321);
         }

         if (class07529.H) {
            i.debug("LIT {}", class07321);
         }
      }), (Supplier<String>)(() -> "lightChunk " + class07321 + " " + var2)));
      return CompletableFuture.supplyAsync(() -> {
         var1.N(true);
         return var1;
      }, var2x -> this.N(class07321.B, class07321.Z, class04783.field_17262, var2x));
   }

   public void y() {
      if ((!this.M.isEmpty() || super.au_()) && this.U.compareAndSet(false, true)) {
         this.R.N(() -> {
            this.R();
            this.U.set(false);
         });
      }
   }

   @Override
   public void y(class07321 var1, boolean var2) {
      this.N(
         var1.B, var1.Z, () -> 0, class04783.field_17261, class07536.N((Runnable)(() -> super.y(var1, var2)), (Supplier<String>)(() -> "retainData " + var1))
      );
   }

   @Override
   public void N(class07209 var1) {
      class07209 class07209 = var1.method_10062();
      this.N(
         class01296.N(var1.method_10263()),
         class01296.N(var1.method_10260()),
         class04783.field_17261,
         class07536.N((Runnable)(() -> super.N(class07209)), (Supplier<String>)(() -> "checkBlock " + class07209))
      );
   }

   public CompletableFuture<?> N(int var1, int var2) {
      return CompletableFuture.runAsync(() -> {}, var3 -> this.N(var1, var2, class04783.field_17262, var3));
   }

   @Override
   public void N(class00772 var1, class01296 var2, @Nullable class00536 var3) {
      this.N(
         var2.N(),
         var2.L(),
         () -> 0,
         class04783.field_17261,
         class07536.N((Runnable)(() -> super.N(var1, var2, var3)), (Supplier<String>)(() -> "queueData " + var2))
      );
   }

   private void N(int var1, int var2, class04783 var3, Runnable var4) {
      this.N(var1, var2, this.B.u(class07321.u(var1, var2)), var3, var4);
   }

   private void N(int var1, int var2, IntSupplier var3, class04783 var4, Runnable var5) {
      this.Z.N(() -> {
         this.M.add(Pair.of(var4, var5));
         if (this.M.size() >= 1000) {
            this.R();
         }
      }, class07321.u(var1, var2), var3);
   }

   @Override
   public int N() {
      throw (UnsupportedOperationException)class07536.y(new UnsupportedOperationException("Ran automatically on a different thread!"));
   }

   public CompletableFuture<class08050> N(class08050 var1, boolean var2) {
      class07321 class07321 = var1.R();
      this.N(class07321.B, class07321.Z, class04783.field_17261, class07536.N((Runnable)(() -> {
         class00554[] aclass00554 = var1.u();

         for (int ix = 0; ix < var1.method_32890(); ix++) {
            if (!aclass00554[ix].L()) {
               int j = this.u.method_31604(ix);
               super.N(class01296.N(class07321, j), false);
            }
         }
      }), (Supplier<String>)(() -> "initializeLight: " + class07321)));
      return CompletableFuture.supplyAsync(() -> {
         super.N(class07321, var2);
         super.y(class07321, false);
         return var1;
      }, var2x -> this.N(class07321.B, class07321.Z, class04783.field_17262, var2x));
   }

   protected void N(class07321 var1) {
      this.N(var1.B, var1.Z, () -> 0, class04783.field_17261, class07536.N((Runnable)(() -> {
         super.y(var1, false);
         super.N(var1, false);

         for (int ix = this.u(); ix < this.i(); ix++) {
            super.N(class00772.field_9282, class01296.N(var1, ix), null);
            super.N(class00772.field_9284, class01296.N(var1, ix), null);
         }

         for (int j = this.u.method_32891(); j <= this.u.method_31597(); j++) {
            super.N(class01296.N(var1, j), true);
         }
      }), (Supplier<String>)(() -> "updateChunkStatus " + var1 + " true")));
   }

   @Override
   public void N(class01296 var1, boolean var2) {
      this.N(
         var1.N(),
         var1.L(),
         () -> 0,
         class04783.field_17261,
         class07536.N((Runnable)(() -> super.N(var1, var2)), (Supplier<String>)(() -> "updateSectionStatus " + var1 + " " + var2))
      );
   }

   @Override
   public void N(class07321 var1, boolean var2) {
      this.N(
         var1.B,
         var1.Z,
         class04783.field_17261,
         class07536.N((Runnable)(() -> super.N(var1, var2)), (Supplier<String>)(() -> "enableLight " + var1 + " " + var2))
      );
   }

   private void R() {
      int ix = Math.min(this.M.size(), 1000);
      ObjectListIterator<Pair<class04783, Runnable>> objectlistiterator = this.M.iterator();

      int j;
      for (j = 0; objectlistiterator.hasNext() && j < ix; j++) {
         Pair<class04783, Runnable> pair = (Pair<class04783, Runnable>)objectlistiterator.next();
         if (pair.getFirst() == class04783.field_17261) {
            ((Runnable)pair.getSecond()).run();
         }
      }

      objectlistiterator.back(j);
      super.N();

      for (int k = 0; objectlistiterator.hasNext() && k < ix; k++) {
         Pair pair1 = (Pair)objectlistiterator.next();
         if (pair1.getFirst() == class04783.field_17262) {
            ((Runnable)pair1.getSecond()).run();
         }

         objectlistiterator.remove();
      }
   }
}
