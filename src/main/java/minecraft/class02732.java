package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayDeque;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public class class02732 extends class02761 {
   private final Deque<class07209> y = new ArrayDeque<>();
   private final Deque<class07209> L = new ArrayDeque<>();
   private final Object2IntMap<class07209> u = new Object2IntLinkedOpenHashMap();

   public class02732(class06884 var1) {
      super(var1);
   }

   private void y(class07299 var1, class07209 var2, int var3, class02733 var4, boolean var5) {
      class00500 class00500 = var1.method_8320(var2);
      if (class00500.N(this.N)) {
         int i = this.N(var2, class00500);
         if (i < var3 - 1 && !this.L.contains(var2)) {
            this.L.add(var2);
            this.N(var2, i, var4);
         }

         if (var5 && i > var3 && !this.y.contains(var2)) {
            this.y.add(var2);
            this.N(var2, i, var4);
         }
      }
   }

   private static int y(int var0) {
      return var0 & 15;
   }

   @Override
   public int N(class07209 var1, class00500 var2) {
      int i = this.u.getOrDefault(var1, -1);
      return i != -1 ? y(i) : super.N(var1, var2);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class02733 var4, boolean var5) {
      class02733 class02733 = N(var1, var4);
      this.N(var1, var2, class02733);
      ObjectIterator<Entry<class07209>> objectiterator = this.u.object2IntEntrySet().iterator();

      for (boolean flag = true; objectiterator.hasNext(); flag = false) {
         Entry entry = (Entry)objectiterator.next();
         class07209 class07209 = (class07209)entry.getKey();
         int i = y(entry.getIntValue());
         class00500 class00500 = var1.method_8320(class07209);
         if (class00500.N(this.N) && !class00500.L(class06884.R).equals(i)) {
            short short1 = 2;
            if (!var5 || !flag) {
               short1 |= 128;
            }

            var1.method_8652(class07209, class00500.y(class06884.R, i), short1);
         } else {
            objectiterator.remove();
         }
      }

      this.N(var1);
   }

   private void N(class07299 var1, class07209 var2, int var3, class02733 var4, boolean var5) {
      for (class07211 class07211xx : var4.M()) {
         class07209 class07209xxxx = var2.method_10093(class07211xx);
         this.y(var1, class07209xxxx, var3, var4.y(class07211xx), var5);
      }

      for (class07211 class07211 : var4.B()) {
         class07209 class07209x = var2.method_10093(class07211);
         boolean flag = var1.method_8320(class07209x).u(var1, class07209x);

         for (class07211 class07211x : var4.M()) {
            class07209 class07209x = var2.method_10093(class07211x);
            if (class07211 == class07211.field_11036 && !flag) {
               class07209 class07209xx = class07209x.method_10093(class07211x);
               this.y(var1, class07209xx, var3, var4.y(class07211x), var5);
            } else if (class07211 == class07211.field_11033 && !var1.method_8320(class07209x).u(var1, class07209x)) {
               class07209 class07209xx = class07209x.method_10093(class07211x);
               this.y(var1, class07209xx, var3, var4.y(class07211x), var5);
            }
         }
      }
   }

   private void N(class07209 var1, int var2, class02733 var3) {
      this.u.compute(var1, (var2x, var3x) -> var3x == null ? N(var3, var2) : N(N(var3x), var2));
   }

   private static boolean N(class00500 var0, class07211 var1) {
      class08064<class08075> class08064 = class06884.M.get(var1);
      return class08064 == null ? var1 == class07211.field_11033 : var0.L(class08064).N();
   }

   private static class02733 N(class07299 var0, @Nullable class02733 var1) {
      class02733 class02733;
      if (var1 != null) {
         class02733 = var1;
      } else {
         class02733 = class02733.N(var0.field_9229);
      }

      return class02733.N(class07211.field_11036).N(class02759.field_52681);
   }

   private void N(class07299 var1, class07209 var2, class02733 var3) {
      class00500 class00500 = var1.method_8320(var2);
      if (class00500.N(this.N)) {
         this.N(var2, class00500.L(class06884.R), var3);
         this.y.add(var2);
      } else {
         this.N(var1, var2, 0, var3, true);
      }

      while (!this.y.isEmpty()) {
         class07209 class07209x = this.y.removeFirst();
         int i = this.u.getInt(class07209x);
         class02733 class02733x = N(i);
         int j = y(i);
         int k = this.N(var1, class07209x);
         int l = this.y(var1, class07209x);
         int i1 = Math.max(k, l);
         int j1;
         if (i1 < j) {
            if (k > 0 && !this.L.contains(class07209x)) {
               this.L.add(class07209x);
            }

            j1 = 0;
         } else {
            j1 = i1;
         }

         if (j1 != j) {
            this.N(class07209x, j1, class02733x);
         }

         this.N(var1, class07209x, j1, class02733x, j > i1);
      }

      while (!this.L.isEmpty()) {
         class07209 class07209x = this.L.removeFirst();
         int k1 = this.u.getInt(class07209x);
         int l1 = y(k1);
         int i2 = this.N(var1, class07209x);
         int j2 = this.y(var1, class07209x);
         int k2 = Math.max(i2, j2);
         class02733 class02733x = N(k1);
         if (k2 > l1) {
            this.N(class07209x, k2, class02733x);
         } else if (k2 < l1) {
            throw new IllegalStateException("Turning off wire while trying to turn it on. Should not happen.");
         }

         this.N(var1, class07209x, k2, class02733x, false);
      }
   }

   private static int N(class02733 var0, int var1) {
      return var0.Z() << 4 | var1;
   }

   private static class02733 N(int var0) {
      return class02733.N(var0 >> 4);
   }

   private void N(class07299 var1) {
      this.u.forEach((var2x, var3) -> {
         class02733 class02733x = N(var3);
         class00500 class00500x = var1.method_8320(var2x);

         for (class07211 class07211x : class02733x.R()) {
            if (N(class00500x, class07211x)) {
               class07209 class07209 = var2x.method_10093(class07211x);
               class00500 class00500x = var1.method_8320(class07209);
               class02733 class02733x = class02733x.L(class07211x);
               var1.method_41410(class00500x, class07209, this.N, class02733x, false);
               if (class00500x.u(var1, class07209)) {
                  for (class07211 class07211x : class02733x.R()) {
                     if (class07211x != class07211x.b()) {
                        var1.method_8492(class07209.method_10093(class07211x), this.N, class02733x.L(class07211x));
                     }
                  }
               }
            }
         }
      });
      if (var1 instanceof class04782 class04782 && class04782.method_74535().y(class00429.z)) {
         this.u.forEach((var1x, var2x) -> class04782.method_74535().N(var1x, class00429.z, N(var2x)));
      }
   }
}
