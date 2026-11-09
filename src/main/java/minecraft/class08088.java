package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class class08088 {
   public static final Codec<class08088> N = class04206.NN.T().dispatchStable(class08088::y, Function.identity());
   protected final class00765 y;
   public Supplier<List<class03923>> L;
   private final Function<class03556<class00780>, class01029> u;

   public Optional<class05946<MapCodec<? extends class08088>>> L() {
      return class04206.NN.u(this.y());
   }

   public int L(int var1, int var2, class07830 var3, class05474 var4, class04084 var5) {
      return this.N(var1, var2, var3, var4, var5) - 1;
   }

   public abstract int M();

   public class08088(class00765 var1) {
      this(var1, var0 -> var0.N().L());
   }

   public class08088(class00765 var1, Function<class03556<class00780>, class01029> var2) {
      super();
      this.y = var1;
      this.u = var2;
      this.L = Suppliers.memoize(() -> class03929.N(List.copyOf(var1.L()), var1xx -> ((class01029)var2.apply(var1xx)).L(), true));
   }

   public abstract int i();

   public class00765 u() {
      return this.y;
   }

   public int y(int var1, int var2, class07830 var3, class05474 var4, class04084 var5) {
      return this.N(var1, var2, var3, var4, var5);
   }

   protected abstract MapCodec<? extends class08088> y();

   public class02045 N(class01905<class04412> var1, class04084 var2, long var3) {
      return class02045.N(var2, var3, this.y, var1);
   }

   public abstract void N(List<String> var1, class04084 var2, class07209 var3);

   @Deprecated
   public class01029 N(class03556<class00780> var1) {
      return this.u.apply(var1);
   }

   @Nullable
   private static Pair<class07209, class03556<class04748>> N(
      Set<class03556<class04748>> var0, class05487 var1, class05324 var2, boolean var3, class03532 var4, class07321 var5
   ) {
      for (class03556 class03556 : var0) {
         class03167 class03167 = var2.N(var5, (class04748)class03556.N(), var4, var3);
         if (class03167 != class03167.field_36240) {
            if (!var3 && class03167 == class03167.field_36239) {
               return Pair.of(var4.N(var5), class03556);
            }

            class08050 class08050 = var1.method_22342(var5.B, var5.Z, class00549.u);
            class04932 class04932 = var2.N(class01296.N(class08050), (class04748)class03556.N(), class08050);
            if (class04932 != null && class04932.y() && (!var3 || N(var2, class04932))) {
               return Pair.of(var4.N(class04932.L()), class03556);
            }
         }
      }

      return null;
   }

   private static boolean N(class05324 var0, class04932 var1) {
      if (var1.u()) {
         var0.N(var1);
         return true;
      } else {
         return false;
      }
   }

   public void N(class05974 var1, class08050 var2, class05324 var3) {
      class07321 class07321 = var2.R();
      if (!class07529.N(class07321)) {
         class01296 class01296 = class01296.N(class07321, var1.method_32891());
         class07209 class07209 = class01296.z();
         class00751 class00751x = var1.method_30349().L(class04227.yj);
         Map map = class00751x.j().collect(Collectors.groupingBy(var0 -> var0.u().ordinal()));
         List list = this.L.get();
         class07836 class07836 = new class07836(new class04042(class04043.N()));
         long i = class07836.N(var1.method_8412(), class07209.method_10263(), class07209.method_10260());
         ObjectArraySet objectarrayset = new ObjectArraySet();
         class07321.N(class01296.E(), 1).forEach(var2x -> {
            class00554[] aclass00554 = var1.method_8392(var2x.B, var2x.Z).u();
            int ix = aclass00554.length;

            for (int jx = 0; jx < ix; jx++) {
               aclass00554[jx].Z().N(objectarrayset::add);
            }
         });
         objectarrayset.retainAll(this.y.L());
         int j = list.size();

         try {
            class00751 class00751x = var1.method_30349().L(class04227.ys);
            int i1 = Math.max(class07852.values().length, j);

            for (int k = 0; k < i1; k++) {
               int l = 0;
               if (var3.N()) {
                  for (class04748 class04748 : map.getOrDefault(k, Collections.emptyList())) {
                     class07836.y(i, l, k);
                     Supplier supplier = () -> class00751x.u(class04748).map(Object::toString).orElseGet(class04748::toString);

                     try {
                        var1.N(supplier);
                        var3.N(class01296, class04748).forEach(var6x -> var6x.N(var1, var3, this, class07836, N(var2), class07321));
                     } catch (Exception exception) {
                        class07080 class07080x = class07080.N(exception, "Feature placement");
                        class07080x.N("Feature").N("Description", supplier::get);
                        throw new class07878(class07080x);
                     }

                     l++;
                  }
               }

               if (k < j) {
                  IntArraySet intarrayset = new IntArraySet();

                  for (class03556 class03556 : objectarrayset) {
                     List list1 = this.u.apply(class03556).L();
                     if (k < list1.size()) {
                        class03543 class03543 = (class03543)list1.get(k);
                        class03923 class03923 = (class03923)list.get(k);
                        class03543.N().map(class03556::N).forEach(var2x -> intarrayset.add(class03923.y().applyAsInt(var2x)));
                     }
                  }

                  int j1 = intarrayset.size();
                  int[] aint = intarrayset.toIntArray();
                  Arrays.sort(aint);
                  class03923 class03923x = (class03923)list.get(k);

                  for (int k1 = 0; k1 < j1; k1++) {
                     int l1 = aint[k1];
                     class04336 class04336 = class03923x.N().get(l1);
                     Supplier supplier1 = () -> class00751.u(class04336).map(Object::toString).orElseGet(class04336::toString);
                     class07836.y(i, l1, k);

                     try {
                        var1.N(supplier1);
                        class04336.y(var1, this, class07836, class07209);
                     } catch (Exception exception1) {
                        class07080 class07080 = class07080.N(exception1, "Feature placement");
                        class07080.N("Feature").N("Description", supplier1::get);
                        throw new class07878(class07080);
                     }
                  }
               }
            }

            var1.N(null);
            if (class07529.Na) {
               class04320.N(var1.method_8410());
            }
         } catch (Exception exception2) {
            class07080 class07080xx = class07080.N(exception2, "Biome decoration");
            class07080xx.N("Generation").N("CenterX", class07321.B).N("CenterZ", class07321.Z).N("Decoration Seed", i);
            throw new class07878(class07080xx);
         }
      }
   }

   private static class05163 N(class08050 var0) {
      class07321 class07321 = var0.R();
      int i = class07321.i();
      int j = class07321.R();
      class05474 class05474 = var0.w();
      int k = class05474.method_31607() + 1;
      int l = class05474.method_31600();
      return new class05163(i, k, j, i + 15, l, j + 15);
   }

   public abstract void N(class01607 var1, class05324 var2, class04084 var3, class08050 var4);

   public abstract void N(class01607 var1);

   public CompletableFuture<class08050> N(class04084 var1, class03001 var2, class05324 var3, class08050 var4) {
      return CompletableFuture.supplyAsync(() -> {
         var4.N(this.y, var1.y());
         return var4;
      }, class07536.B().N("init_biomes"));
   }

   public abstract void N(class01607 var1, long var2, class04084 var4, class05517 var5, class05324 var6, class08050 var7);

   @Nullable
   public Pair<class07209, class03556<class04748>> N(class04782 var1, class03543<class04748> var2, class07209 var3, int var4, boolean var5) {
      if (class07529.NO) {
         return null;
      } else {
         class02045 class02045 = var1.method_14178().E();
         Object2ObjectArrayMap object2objectarraymap = new Object2ObjectArrayMap();

         for (class03556 class03556 : var2) {
            for (class03532 class03532x : class02045.N(class03556)) {
               object2objectarraymap.computeIfAbsent(class03532x, var0 -> new ObjectArraySet()).add(class03556);
            }
         }

         if (object2objectarraymap.isEmpty()) {
            return null;
         } else {
            Pair pair2 = null;
            double d2 = Double.MAX_VALUE;
            class05324 class05324 = var1.method_27056();
            ArrayList arraylist = new ArrayList(object2objectarraymap.size());

            for (Entry entry : object2objectarraymap.entrySet()) {
               class03532 class03532 = (class03532)entry.getKey();
               if (class03532 instanceof class03548 class03548) {
                  Pair pair = this.N((Set<class03556<class04748>>)entry.getValue(), var1, class05324, var3, var5, class03548);
                  if (pair != null) {
                     class07209 class07209 = (class07209)pair.getFirst();
                     double d0 = var3.method_10262(class07209);
                     if (d0 < d2) {
                        d2 = d0;
                        pair2 = pair;
                     }
                  }
               } else if (class03532 instanceof class03528) {
                  arraylist.add(entry);
               }
            }

            if (!arraylist.isEmpty()) {
               int i = class01296.N(var3.method_10263());
               int j = class01296.N(var3.method_10260());

               for (int k = 0; k <= var4; k++) {
                  boolean flag = false;

                  for (Entry entry1 : arraylist) {
                     class03528 class03528 = (class03528)entry1.getKey();
                     Pair pair1 = N((Set<class03556<class04748>>)entry1.getValue(), var1, class05324, i, j, k, var5, class02045.u(), class03528);
                     if (pair1 != null) {
                        flag = true;
                        double d1 = var3.method_10262((class00753)pair1.getFirst());
                        if (d1 < d2) {
                           d2 = d1;
                           pair2 = pair1;
                        }
                     }
                  }

                  if (flag) {
                     return pair2;
                  }
               }
            }

            return pair2;
         }
      }
   }

   @Nullable
   private Pair<class07209, class03556<class04748>> N(
      Set<class03556<class04748>> var1, class04782 var2, class05324 var3, class07209 var4, boolean var5, class03548 var6
   ) {
      List list = var2.method_14178().E().N(var6);
      if (list == null) {
         throw new IllegalStateException("Somehow tried to find structures for a placement that doesn't exist");
      } else {
         Pair pair = null;
         double d0 = Double.MAX_VALUE;
         class07218 class07218 = new class07218();

         for (class07321 class07321 : list) {
            class07218.N(class01296.N(class07321.B, 8), 32, class01296.N(class07321.Z, 8));
            double d1 = class07218.method_10262(var4);
            if (pair == null || d1 < d0) {
               Pair pair1 = N(var1, var2, var3, var5, var6, class07321);
               if (pair1 != null) {
                  pair = pair1;
                  d0 = d1;
               }
            }
         }

         return pair;
      }
   }

   @Nullable
   private static Pair<class07209, class03556<class04748>> N(
      Set<class03556<class04748>> var0, class05487 var1, class05324 var2, int var3, int var4, int var5, boolean var6, long var7, class03528 var9
   ) {
      int i = var9.N();

      for (int j = -var5; j <= var5; j++) {
         boolean flag = j == -var5 || j == var5;

         for (int k = -var5; k <= var5; k++) {
            boolean flag1 = k == -var5 || k == var5;
            if (flag || flag1) {
               int l = var3 + i * j;
               int i1 = var4 + i * k;
               class07321 class07321 = var9.N(var7, l, i1);
               Pair pair = N(var0, var1, var2, var6, var9, class07321);
               if (pair != null) {
                  return pair;
               }
            }
         }
      }

      return null;
   }

   public void N(class05974 var1, class05324 var2, class08050 var3) {
      byte b0 = 8;
      class07321 class07321 = var3.R();
      int i = class07321.B;
      int j = class07321.Z;
      int k = class07321.i();
      int l = class07321.R();
      class01296 class01296 = class01296.N(var3);

      for (int i1 = i - 8; i1 <= i + 8; i1++) {
         for (int j1 = j - 8; j1 <= j + 8; j1++) {
            long k1 = class07321.u(i1, j1);

            for (class04932 class04932 : var1.method_8392(i1, j1).M().values()) {
               try {
                  if (class04932.y() && class04932.N().N(k, l, k + 15, l + 15)) {
                     var2.N(class01296, class04932.B(), k1, var3);
                  }
               } catch (Exception exception) {
                  class07080 class07080 = class07080.N(exception, "Generating structure reference");
                  class07074 class07074 = class07080.N("Structure");
                  Optional optional = var1.method_30349().method_46759(class04227.yj);
                  class07074.N("Id", () -> optional.<String>map(var1xx -> var1xx.y(class04932.B()).toString()).orElse("UNKNOWN"));
                  class07074.N("Name", () -> class04206.F.y(class04932.B().N()).toString());
                  class07074.N("Class", () -> class04932.B().getClass().getCanonicalName());
                  throw new class07878(class07080);
               }
            }
         }
      }
   }

   public abstract CompletableFuture<class08050> N(class03001 var1, class04084 var2, class05324 var3, class08050 var4);

   public void N() {
      this.L.get();
   }

   public abstract int N(int var1, int var2, class07830 var3, class05474 var4, class04084 var5);

   public abstract class01376 N(int var1, int var2, class05474 var3, class04084 var4);

   public int N(class05474 var1) {
      return 64;
   }

   public class04540<class01016> N(class03556<class00780> var1, class05324 var2, class07428 var3, class07209 var4) {
      for (Entry entry : var2.y(var4).entrySet()) {
         class04748 class04748 = (class04748)entry.getKey();
         class04426 class04426 = class04748.L().get(var3);
         if (class04426 != null) {
            MutableBoolean mutableboolean = new MutableBoolean(false);
            Predicate predicate = class04426.N() == class04436.field_37199 ? var2x -> var2.N(var4, var2x) : var1x -> var1x.N().y(var4);
            var2.N(class04748, (LongSet)entry.getValue(), var2x -> {
               if (mutableboolean.isFalse() && predicate.test(var2x)) {
                  mutableboolean.setTrue();
               }
            });
            if (mutableboolean.isTrue()) {
               return class04426.y();
            }
         }
      }

      return ((class00780)var1.N()).N().N(var3);
   }

   public void N(class01042 var1, class02045 var2, class05324 var3, class08050 var4, class01224 var5, class05946<class07299> var6) {
      if (!class07529.NQ) {
         class07321 class07321 = var4.R();
         class01296 class01296 = class01296.N(var4);
         class04084 class04084 = var2.L();
         var2.N().forEach(var10 -> {
            class03532 class03532 = var10.N().y();
            List list = var10.N().N();

            for (class04419 class04419xxx : list) {
               class04932 class04932 = var3.N(class01296, class04419xxx.N().N(), var4);
               if (class04932 != null && class04932.y()) {
                  return;
               }
            }

            if (class03532.y(var2, class07321.B, class07321.Z)) {
               if (list.size() == 1) {
                  this.N((class04419)list.get(0), var3, var1, class04084, var5, var2.u(), var4, class07321, class01296, var6);
               } else {
                  ArrayList arraylist = new ArrayList(list.size());
                  arraylist.addAll(list);
                  class07836 class07836 = new class07836(new class06075(0L));
                  class07836.L(var2.u(), class07321.B, class07321.Z);
                  int i = 0;

                  for (class04419 class04419x : arraylist) {
                     i += class04419x.y();
                  }

                  while (!arraylist.isEmpty()) {
                     int j = class07836.y(i);
                     int k = 0;

                     for (class04419 class04419x : arraylist) {
                        j -= class04419x.y();
                        if (j < 0) {
                           break;
                        }

                        k++;
                     }

                     class04419 class04419x = (class04419)arraylist.get(k);
                     if (this.N(class04419x, var3, var1, class04084, var5, var2.u(), var4, class07321, class01296, var6)) {
                        return;
                     }

                     arraylist.remove(k);
                     i -= class04419x.y();
                  }
               }
            }
         });
      }
   }

   private boolean N(
      class04419 var1,
      class05324 var2,
      class01042 var3,
      class04084 var4,
      class01224 var5,
      long var6,
      class08050 var8,
      class07321 var9,
      class01296 var10,
      class05946<class07299> var11
   ) {
      class04748 class04748 = var1.N().N();
      int i = N(var2, var8, var10, class04748);
      Predicate predicate = class04748.y()::N;
      class04932 class04932 = class04748.N(var1.N(), var11, var3, this, this.y, var4, var5, var6, var9, i, var8, predicate);
      if (class04932.y()) {
         var2.N(var10, class04748, class04932, var8);
         return true;
      } else {
         return false;
      }
   }

   private static int N(class05324 var0, class08050 var1, class01296 var2, class04748 var3) {
      class04932 class04932 = var0.N(var2, var3, var1);
      return class04932 != null ? class04932.R() : 0;
   }

   public abstract int R();
}
