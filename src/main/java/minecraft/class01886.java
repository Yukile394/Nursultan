package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.joml.Vector3d;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01886 {
   private static final Logger N = LogUtils.getLogger();
   private static final class07211[] y = class07211.values();
   private static final int L = 60;
   private static final int u = class01296.N(60);
   private static final double i = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean R = true;
   @Nullable
   private Future<?> M;
   @Nullable
   private class02959 B;
   private final AtomicReference<class01661> Z = new AtomicReference<>();
   private final AtomicReference<class01672> z = new AtomicReference<>();
   private final AtomicBoolean U = new AtomicBoolean(false);

   public class08230 L() {
      return this.Z.get().N().y;
   }

   public class01886() {
      super();
   }

   @Nullable
   public class01639 y(class03345 var1) {
      return this.Z.get().N().N.N(var1);
   }

   public boolean y() {
      return this.U.compareAndSet(true, false);
   }

   public void N() {
      this.R = true;
   }

   private class03345 N(long var1, class03345 var3, class07211 var4) {
      long ix = var3.N(var4);
      if (!this.N(var1, ix)) {
         return null;
      } else {
         return class04995.N(class01296.L(var1) - class01296.L(ix)) > this.B.y() ? null : this.B.N(ix);
      }
   }

   private void N(class01676 var1, class06889 var2, Queue<class01639> var3, boolean var4, Consumer<class03345> var5, LongOpenHashSet var6) {
      class01296 class01296 = class01296.N(var2);
      long ix = class01296.W();
      class07209 class07209 = class01296.U();

      while (!var3.isEmpty()) {
         class01639 class01639 = (class01639)var3.poll();
         class03345 class03345xx = class01639.N;
         if (!var6.contains(class01639.N.M())) {
            if (var1.y.N(class01639.N)) {
               var5.accept(class01639.N);
            }
         } else {
            class01639.N.L.compareAndSet(class08777.N, class08777.y);
         }

         long j = class03345xx.M();
         boolean flag = Math.abs(class01296.y(j) - class01296.N()) > u
            || Math.abs(class01296.L(j) - class01296.y()) > u
            || Math.abs(class01296.u(j) - class01296.L()) > u;
         int k = y.length;

         for (int l = 0; l < k; l++) {
            class07211 class07211 = y[l];
            class03345 class03345x = this.N(ix, class03345xx, class07211);
            if (class03345x != null && (!var4 || !class01639.N(class07211.b()))) {
               if (var4 && class01639.N()) {
                  class08744 class08744 = class03345xx.u();
                  boolean flag1 = false;

                  for (int i1 = 0; i1 < y.length; i1++) {
                     if (class01639.N(i1) && class08744.N(y[i1].b(), class07211)) {
                        flag1 = true;
                        break;
                     }
                  }

                  if (!flag1) {
                     continue;
                  }
               }

               if (var4 && flag) {
                  int j1 = class01296.L(class01296.y(j));
                  int k1 = class01296.L(class01296.L(j));
                  int l1 = class01296.L(class01296.u(j));
                  boolean flag2 = class07211.z() == class07185.field_11048 ? class07209.method_10263() > j1 : class07209.method_10263() < j1;
                  boolean flag3 = class07211.z() == class07185.field_11052 ? class07209.method_10264() > k1 : class07209.method_10264() < k1;
                  boolean flag4 = class07211.z() == class07185.field_11051 ? class07209.method_10260() > l1 : class07209.method_10260() < l1;
                  Vector3d vector3d = new Vector3d(j1 + (flag2 ? 16 : 0), k1 + (flag3 ? 16 : 0), l1 + (flag4 ? 16 : 0));
                  Vector3d vector3d1 = new Vector3d(var2.M, var2.B, var2.Z).sub(vector3d).normalize().mul(i);
                  boolean flag5 = true;

                  while (vector3d.distanceSquared(var2.M, var2.B, var2.Z) > 3600.0) {
                     vector3d.add(vector3d1);
                     class05474 class05474 = this.B.L();
                     if (vector3d.y > class05474.method_31600() || vector3d.y < class05474.method_31607()) {
                        break;
                     }

                     class03345 class03345xx = this.B.N(class07209.method_49637(vector3d.x, vector3d.y, vector3d.z));
                     if (class03345xx == null || var1.N.N(class03345xx) == null) {
                        flag5 = false;
                        break;
                     }
                  }

                  if (!flag5) {
                     continue;
                  }
               }

               class01639 class01639x = var1.N.N(class03345x);
               if (class01639x != null) {
                  class01639x.y(class07211);
               } else {
                  class01639 class01639xx = new class01639(class03345x, class07211, class01639.L + 1);
                  class01639xx.N(class01639.y, class07211);
                  if (class03345x.y()) {
                     var3.add(class01639xx);
                     var1.N.N(class03345x, class01639xx);
                  } else if (this.N(ix, class03345x.M())) {
                     var1.N.N(class03345x, class01639xx);
                     long i2 = class01296.M(class03345x.M());
                     ((List)var1.L.computeIfAbsent(i2, var0 -> new ArrayList())).add(class03345x);
                  }
               }
            }
         }
      }
   }

   public void N(@Nullable class02959 var1) {
      if (this.M != null) {
         try {
            this.M.get();
            this.M = null;
         } catch (Exception exception) {
            N.warn("Full update failed", exception);
         }
      }

      this.B = var1;
      if (var1 != null) {
         this.Z.set(new class01661(var1));
         this.N();
      } else {
         this.Z.set(null);
      }
   }

   private void N(boolean var1, class01383 var2, List<class03345> var3, class06889 var4, LongOpenHashSet var5) {
      class01661 class01661 = this.Z.get();
      this.N(class01661);
      if (!class01661.y().y().isEmpty()) {
         ArrayDeque arraydeque = Queues.newArrayDeque();

         while (!class01661.y().y().isEmpty()) {
            class03345 class03345 = class01661.y().y().poll();
            class01639 class01639 = class01661.N().N.N(class03345);
            if (class01639 != null && class01639.N == class03345) {
               arraydeque.add(class01639);
            }
         }

         class01383 class01383 = class03063.N(var2);
         Consumer consumer = var2x -> {
            if (class01383.method_23093(var2x.L())) {
               this.U.set(true);
            }
         };
         this.N(class01661.N(), var4, arraydeque, var1, consumer, var5);
      }
   }

   private void N(boolean var1, class05363 var2, class06889 var3, LongOpenHashSet var4) {
      this.R = false;
      LongOpenHashSet longopenhashset = var4.clone();
      this.M = CompletableFuture.runAsync(() -> {
         class01661 class01661 = new class01661(this.B);
         this.z.set(class01661.y());
         ArrayDeque arraydeque = Queues.newArrayDeque();
         this.N(var2, arraydeque);
         arraydeque.forEach(var1xx -> class01661.N().N.N(var1xx.N, var1xx));
         this.N(class01661.N(), var3, arraydeque, var1, var0 -> {}, longopenhashset);
         this.Z.set(class01661);
         this.z.set(null);
         this.U.set(true);
      }, class07536.B());
   }

   public void N(boolean var1, class05363 var2, class01383 var3, List<class03345> var4, LongOpenHashSet var5) {
      class06889 class06889 = var2.y();
      if (this.R && (this.M == null || this.M.isDone())) {
         this.N(var1, var2, class06889, var5);
      }

      this.N(var1, var3, var4, class06889, var5);
   }

   public void N(class03345 var1) {
      class01672 class01672x = this.z.get();
      if (class01672x != null) {
         class01672x.y().add(var1);
      }

      class01672 class01672x = this.Z.get().y();
      if (class01672x != class01672x) {
         class01672x.y().add(var1);
      }
   }

   public void N(class07321 var1) {
      class01672 class01672x = this.z.get();
      if (class01672x != null) {
         this.N(class01672x, var1);
      }

      class01672 class01672x = this.Z.get().y();
      if (class01672x != class01672x) {
         this.N(class01672x, var1);
      }
   }

   private boolean N(long var1, long var3) {
      return class04157.N(class01296.y(var1), class01296.u(var1), this.B.y(), class01296.y(var3), class01296.u(var3));
   }

   public void N(class01383 var1, List<class03345> var2, List<class03345> var3) {
      this.Z.get().N().y.N((var2x, var3x, var4, var5) -> {
         class03345 class03345 = var2x.N();
         if (class03345 != null) {
            var2.add(class03345);
            if (var5) {
               var3.add(class03345);
            }
         }
      }, var1, 32);
   }

   private void N(class05363 var1, Queue<class01639> var2) {
      class07209 class07209 = var1.u();
      long ix = class01296.L(class07209);
      int j = class01296.L(ix);
      class03345 class03345x = this.B.N(ix);
      if (class03345x == null) {
         class05474 class05474 = this.B.L();
         boolean flag = j < class05474.method_32891();
         int k = flag ? class05474.method_32891() : class05474.method_31597();
         int l = this.B.y();
         ArrayList arraylist = Lists.newArrayList();
         int i1 = class01296.y(ix);
         int j1 = class01296.u(ix);

         for (int k1 = -l; k1 <= l; k1++) {
            for (int l1 = -l; l1 <= l; l1++) {
               class03345 class03345x = this.B.N(class01296.y(k1 + i1, k, l1 + j1));
               if (class03345x != null && this.N(ix, class03345x.M())) {
                  class07211 class07211 = flag ? class07211.field_11036 : class07211.field_11033;
                  class01639 class01639 = new class01639(class03345x, class07211, 0);
                  class01639.N(class01639.y, class07211);
                  if (k1 > 0) {
                     class01639.N(class01639.y, class07211.field_11034);
                  } else if (k1 < 0) {
                     class01639.N(class01639.y, class07211.field_11039);
                  }

                  if (l1 > 0) {
                     class01639.N(class01639.y, class07211.field_11035);
                  } else if (l1 < 0) {
                     class01639.N(class01639.y, class07211.field_11043);
                  }

                  arraylist.add(class01639);
               }
            }
         }

         arraylist.sort(Comparator.comparingDouble(var1x -> class07209.method_10262(class01296.N(var1x.N.M()).U())));
         var2.addAll(arraylist);
      } else {
         var2.add(new class01639(class03345x, null, 0));
      }
   }

   private void N(class01672 var1, class07321 var2) {
      var1.N().add(class07321.u(var2.B - 1, var2.Z));
      var1.N().add(class07321.u(var2.B, var2.Z - 1));
      var1.N().add(class07321.u(var2.B + 1, var2.Z));
      var1.N().add(class07321.u(var2.B, var2.Z + 1));
      var1.N().add(class07321.u(var2.B - 1, var2.Z - 1));
      var1.N().add(class07321.u(var2.B - 1, var2.Z + 1));
      var1.N().add(class07321.u(var2.B + 1, var2.Z - 1));
      var1.N().add(class07321.u(var2.B + 1, var2.Z + 1));
   }

   private void N(class01661 var1) {
      LongIterator longiterator = var1.y().N().iterator();

      while (longiterator.hasNext()) {
         long ix = longiterator.nextLong();
         List<class03345> list = (List<class03345>)var1.N().L.get(ix);
         if (list != null && list.get(0).y()) {
            var1.y().y().addAll(list);
            var1.N().L.remove(ix);
         }
      }

      var1.y().N().clear();
   }
}
