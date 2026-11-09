package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.mixin.world.combined_heightmap_update.HeightmapAccessor;
import org.slf4j.Logger;

public class class07841 implements HeightmapAccessor {
   private static final Logger L = LogUtils.getLogger();
   static final Predicate<class00500> N = var0 -> !var0.P();
   static final Predicate<class00500> y = class01339::M;
   private final class04552 u;
   private final Predicate<class00500> i;
   private final class08050 R;

   private static int L(int var0, int var1) {
      return var0 + var1 * 16;
   }

   public class07841(class08050 var1, class07830 var2) {
      super();
      this.i = var2.u();
      this.R = var1;
      int ix = class04995.R(var1.method_31605() + 1);
      this.u = new class01198(ix, 256);
   }

   public int y(int var1, int var2) {
      return this.N(L(var1, var2)) - 1;
   }

   public long[] N() {
      return this.u.N();
   }

   public void N(class08050 var1, class07830 var2, long[] var3) {
      long[] along = this.u.N();
      if (along.length == var3.length) {
         System.arraycopy(var3, 0, along, 0, var3.length);
      } else {
         L.warn("Ignoring heightmap data for chunk {}, size does not match; expected: {}, got: {}", new Object[]{var1.R(), along.length, var3.length});
         N(var1, EnumSet.of(var2));
      }
   }

   public static void N(class08050 var0, Set<class07830> var1) {
      if (!var1.isEmpty()) {
         int ix = var1.size();
         ObjectArrayList objectarraylist = new ObjectArrayList(ix);
         ObjectListIterator objectlistiterator = objectarraylist.iterator();
         int j = var0.y() + 16;
         class07218 class07218 = new class07218();

         for (int k = 0; k < 16; k++) {
            for (int l = 0; l < 16; l++) {
               for (class07830 class07830 : var1) {
                  objectarraylist.add(var0.N(class07830));
               }

               for (int i1 = j - 1; i1 >= var0.method_31607(); i1--) {
                  class07218.N(k, i1, l);
                  class00500 class00500 = var0.method_8320(class07218);
                  if (!class00500.N(class00869.N)) {
                     while (objectlistiterator.hasNext()) {
                        class07841 class07841 = (class07841)objectlistiterator.next();
                        if (class07841.i.test(class00500)) {
                           class07841.N(k, l, i1 + 1);
                           objectlistiterator.remove();
                        }
                     }

                     if (objectarraylist.isEmpty()) {
                        break;
                     }

                     objectlistiterator.back(ix);
                  }
               }
            }
         }
      }
   }

   public boolean N(int var1, int var2, int var3, class00500 var4) {
      int ix = this.N(var1, var3);
      if (var2 <= ix - 2) {
         return false;
      } else {
         if (this.i.test(var4)) {
            if (var2 >= ix) {
               this.N(var1, var3, var2 + 1);
               return true;
            }
         } else if (ix - 1 == var2) {
            class07218 class07218 = new class07218();

            for (int j = var2 - 1; j >= this.R.method_31607(); j--) {
               class07218.N(var1, j, var3);
               if (this.i.test(this.R.method_8320(class07218))) {
                  this.N(var1, var3, j + 1);
                  return true;
               }
            }

            this.N(var1, var3, this.R.method_31607());
            return true;
         }

         return false;
      }
   }

   public int N(int var1, int var2) {
      return this.N(L(var1, var2));
   }

   private int N(int var1) {
      return this.u.N(var1) + this.R.method_31607();
   }

   private void N(int var1, int var2, int var3) {
      this.u.y(L(var1, var2), var3 - this.R.method_31607());
   }
}
