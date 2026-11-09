package minecraft;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class05960 {
   private static final class01325 N = class07078.Ly.E();
   private static final int y = 1024;
   private final class04782 L;
   private final class07209 u;
   private final int i;
   private final int R;
   private final int M;
   private final int B;
   private int Z;
   private final CompletableFuture<class06889> z = new CompletableFuture<>();

   private class05960(class04782 var1, class07209 var2, int var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      long ix = var3 * 2L + 1L;
      this.R = (int)Math.min(1024L, ix * ix);
      this.M = N(this.R);
      this.B = class06069.u().y(this.R);
   }

   private static boolean y(class07322 var0, class07209 var1) {
      return var0.N(null, N.N(var1.method_61082()), true);
   }

   @Nullable
   public static class07209 N(class04782 var0, class07321 var1) {
      if (class07529.N(var1)) {
         return null;
      } else {
         for (int ix = var1.i(); ix <= var1.M(); ix++) {
            for (int j = var1.R(); j <= var1.B(); j++) {
               class07209 class07209 = N(var0, ix, j);
               if (class07209 != null) {
                  return class07209;
               }
            }
         }

         return null;
      }
   }

   public static CompletableFuture<class06889> N(class04782 var0, class07209 var1) {
      if (var0.method_8597().i() && var0.method_8503().yn().z() != class07282.field_9216) {
         int ix = Math.max(0, var0.method_64395().N(class07305.p));
         int j = class04995.N(var0.method_8621().y(var1.method_10263(), var1.method_10260()));
         if (j < ix) {
            ix = j;
         }

         if (j <= 1) {
            ix = 1;
         }

         class05960 class05960 = new class05960(var0, var1, ix);
         class05960.N();
         return class05960.z;
      } else {
         return CompletableFuture.completedFuture(N((class07322)var0, var1));
      }
   }

   private static class06889 N(class07322 var0, class07209 var1) {
      class07218 class07218 = var1.method_25503();

      while (!y(var0, class07218) && class07218.method_10264() < var0.method_31600()) {
         class07218.N(class07211.field_11036);
      }

      class07218.N(class07211.field_11033);

      while (y(var0, class07218) && class07218.method_10264() > var0.method_31607()) {
         class07218.N(class07211.field_11033);
      }

      class07218.N(class07211.field_11036);
      return class06889.L(class07218);
   }

   private static int N(int var0) {
      return var0 <= 16 ? var0 - 1 : 17;
   }

   private void N(int var1, int var2, int var3, Supplier<Optional<class06889>> var4) {
      if (!this.z.isDone()) {
         int ix = class01296.N(var1);
         int j = class01296.N(var2);
         this.L.method_14178().N(class01624.B, new class07321(ix, j), 0).whenCompleteAsync((var5x, var6x) -> {
            if (var6x == null) {
               try {
                  Optional optional = (Optional)var4.get();
                  if (optional.isPresent()) {
                     this.z.complete((class06889)optional.get());
                  } else {
                     this.N();
                  }
               } catch (Throwable throwable) {
                  var6x = throwable;
               }
            }

            if (var6x != null) {
               class07080 class07080 = class07080.N(var6x, "Searching for spawn");
               class07074 class07074 = class07080.N("Spawn Lookup");
               class07074.N("Origin", this.u::toString);
               class07074.N("Radius", () -> Integer.toString(this.i));
               class07074.N("Candidate", () -> "[" + var1 + "," + var2 + "]");
               class07074.N("Progress", () -> var3 + " out of " + this.R);
               this.z.completeExceptionally(new class07878(class07080));
            }
         }, this.L.method_8503());
      }
   }

   @Nullable
   protected static class07209 N(class04782 var0, int var1, int var2) {
      boolean flag = var0.method_8597().R();
      class00570 class00570 = var0.method_8497(class01296.N(var1), class01296.N(var2));
      int ix = flag ? var0.method_14178().U().N(var0) : class00570.N(class07830.field_13197, var1 & 15, var2 & 15);
      if (ix < var0.method_31607()) {
         return null;
      } else {
         int j = class00570.N(class07830.field_13202, var1 & 15, var2 & 15);
         if (j <= ix && j > class00570.N(class07830.field_13200, var1 & 15, var2 & 15)) {
            return null;
         } else {
            class07218 class07218 = new class07218();

            for (int k = ix + 1; k >= var0.method_31607(); k--) {
               class07218.N(var1, k, var2);
               class00500 class00500 = var0.method_8320(class07218);
               if (!class00500.Y().W()) {
                  break;
               }

               if (class00891.N(class00500.M(var0, class07218), class07211.field_11036)) {
                  return class07218.method_10084().method_10062();
               }
            }

            return null;
         }
      }
   }

   private void N() {
      int ix = this.Z++;
      if (ix < this.R) {
         int j = (this.B + this.M * ix) % this.R;
         int k = j % (this.i * 2 + 1);
         int l = j / (this.i * 2 + 1);
         int i1 = this.u.method_10263() + k - this.i;
         int j1 = this.u.method_10260() + l - this.i;
         this.N(i1, j1, ix, () -> {
            class07209 class07209 = N(this.L, i1, j1);
            return class07209 != null && y(this.L, class07209) ? Optional.of(class06889.L(class07209)) : Optional.empty();
         });
      } else {
         this.N(this.u.method_10263(), this.u.method_10260(), ix, () -> Optional.of(N((class07322)this.L, this.u)));
      }
   }
}
