package minecraft;

import Nursultan.class09402;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class00803 {
   private static final Logger i = LogUtils.getLogger();
   private static final int R = 24;
   public static final int N = 8;
   public static final int y = 128;
   public static final int L = class04995.y(8.0F / class04995.M);
   static final int u = (int)Math.pow(17.0, 2.0);
   private static final class07428[] M = Stream.of(class07428.values()).filter(var0 -> var0 != class07428.field_17715).toArray(class07428[]::new);

   private class00803() {
      super();
   }

   private static class07209 N(class05487 var0, class07078<?> var1, int var2, int var3) {
      int ix = var0.method_8624(class07448.y(var1), var2, var3);
      class07218 class07218 = new class07218(var2, ix, var3);
      if (var0.method_8597().R()) {
         do {
            class07218.N(class07211.field_11033);
         } while (!var0.method_8320(class07218).P());

         do {
            class07218.N(class07211.field_11033);
         } while (var0.method_8320(class07218).P() && class07218.method_10264() > var0.method_31607());
      }

      return class07448.N(var1).N(var0, class07218.method_10062());
   }

   public static void N(class01001 var0, class03556<class00780> var1, class07321 var2, class06069 var3) {
      class01002 class01002 = ((class00780)var1.N()).N();
      class04540<class01016> class04540 = class01002.N(class07428.field_6294);
      if (!class04540.L() && var0.method_8410().method_64395().N(class07305.S)) {
         int ix = var2.i();
         int j = var2.R();

         while (var3.z() < class01002.N()) {
            Optional<class01016> optional = class04540.N(var3);
            if (!optional.isEmpty()) {
               class01016 class01016 = optional.get();
               int k = class01016.y() + var3.y(1 + class01016.L() - class01016.y());
               class07446 class07446 = null;
               int l = ix + var3.y(16);
               int i1 = j + var3.y(16);
               int j1 = l;
               int k1 = i1;

               for (int l1 = 0; l1 < k; l1++) {
                  boolean flag = false;

                  for (int i2 = 0; !flag && i2 < 4; i2++) {
                     class07209 class07209 = N(var0, class01016.N(), l, i1);
                     if (class01016.N().y() && class07448.N(class01016.N(), var0, class07209)) {
                        float f = class01016.N().z();
                        double d0 = class04995.N((double)l, (double)ix + f, ix + 16.0 - f);
                        double d1 = class04995.N((double)i1, (double)j + f, j + 16.0 - f);
                        if (!var0.y(class01016.N().N(d0, class07209.method_10264(), d1))
                           || !class07448.N(
                              class01016.N(), var0, class06113.field_16472, class07209.method_49637(d0, class07209.method_10264(), d1), var0.method_8409()
                           )) {
                           continue;
                        }

                        class07049 class07049;
                        try {
                           class07049 = class01016.N().N(var0.method_8410(), class06113.field_16459);
                        } catch (Exception exception) {
                           i.warn("Failed to create mob", exception);
                           continue;
                        }

                        if (class07049 == null) {
                           continue;
                        }

                        class07049.method_5808(d0, class07209.method_10264(), d1, var3.z() * 360.0F, 0.0F);
                        if (class07049 instanceof class07079 class07079 && class07079.N(var0, class06113.field_16472) && class07079.N(var0)) {
                           class07446 = class07079.N(var0, var0.method_8404(class07079.method_24515()), class06113.field_16472, class07446);
                           var0.y(class07079);
                           flag = true;
                        }
                     }

                     l += var3.y(5) - var3.y(5);

                     for (i1 += var3.y(5) - var3.y(5); l < ix || l >= ix + 16 || i1 < j || i1 >= j + 16; i1 = k1 + var3.y(5) - var3.y(5)) {
                        l = j1 + var3.y(5) - var3.y(5);
                     }
                  }
               }
            }
         }
      }
   }

   public static boolean N(class07290 var0, class07209 var1, class00500 var2, class04688 var3, class07078<?> var4) {
      if (var2.W(var0, var1)) {
         return false;
      } else if (var2.j()) {
         return false;
      } else if (!var3.W()) {
         return false;
      } else {
         return var2.N(class01210.yz) ? false : !var4.N(var2);
      }
   }

   private static class07209 N(class07299 var0, class00570 var1) {
      class07321 class07321 = var1.R();
      int ix = class07321.i() + var0.field_9229.y(16);
      int j = class07321.R() + var0.field_9229.y(16);
      int k = var1.N(class07830.field_13202, ix, j) + 1;
      int l = class04995.y(var0.field_9229, var0.method_31607(), k);
      return new class07209(ix, l, j);
   }

   public static boolean N(class07209 var0, class04782 var1, class07428 var2, class05324 var3) {
      if (var2 == class07428.field_6302 && var1.method_8320(var0.method_10074()).N(class00869.ML)) {
         class04748 class04748 = var3.y().L(class04227.yj).L(class04433.P);
         return class04748 == null ? false : var3.N(var0, class04748).y();
      } else {
         return false;
      }
   }

   private static class04540<class01016> N(
      class04782 var0, class05324 var1, class08088 var2, class07428 var3, class07209 var4, @Nullable class03556<class00780> var5
   ) {
      return N(var4, var0, var3, var1) ? (class04540)class06218.N_0 : var2.N(var5 != null ? var5 : var0.i(var4), var1, var3, var4);
   }

   private static boolean N(class04782 var0, class05324 var1, class08088 var2, class07428 var3, class01016 var4, class07209 var5) {
      return N(var0, var1, var2, var3, var5, null).y(var4);
   }

   public static void N(class07428 var0, class04782 var1, class08050 var2, class07209 var3, class00771 var4, class00792 var5) {
      class05324 class05324 = var1.method_27056();
      class08088 class08088 = var1.method_14178().U();
      int ix = var3.method_10264();
      if (!var2.method_8320(var3).u(var2, var3)) {
         class07218 class07218 = new class07218();
         int j = 0;

         for (int k = 0; k < 3; k++) {
            int l = var3.method_10263();
            int i1 = var3.method_10260();
            byte b0 = 6;
            class01016 class01016 = null;
            class07446 class07446 = null;
            int j1 = class04995.u(var1.field_9229.z() * 4.0F);
            int k1 = 0;

            for (int l1 = 0; l1 < j1; l1++) {
               l += var1.field_9229.y(6) - var1.field_9229.y(6);
               i1 += var1.field_9229.y(6) - var1.field_9229.y(6);
               class07218.N(l, ix, i1);
               double d0 = l + 0.5;
               double d1 = i1 + 0.5;
               class08036 class08036 = var1.N(d0, ix, d1, -1.0, false);
               if (class08036 != null) {
                  double d2 = class08036.method_5649(d0, ix, d1);
                  if (N(var1, var2, class07218, d2)) {
                     if (class01016 == null) {
                        Optional<class01016> optional = N(var1, class05324, class08088, var0, var1.field_9229, class07218);
                        if (optional.isEmpty()) {
                           break;
                        }

                        class01016 = optional.get();
                        j1 = class01016.y() + var1.field_9229.y(1 + class01016.L() - class01016.y());
                     }

                     if (N(var1, var0, class05324, class08088, class01016, class07218, d2) && var4.test(class01016.N(), class07218, var2)) {
                        class07079 class07079 = N(var1, class01016.N());
                        if (class07079 == null) {
                           return;
                        }

                        class07079.method_5808(d0, ix, d1, var1.field_9229.z() * 360.0F, 0.0F);
                        if (N(var1, class07079, d2)) {
                           class07446 = class07079.N(var1, var1.method_8404(class07079.method_24515()), class06113.field_16459, class07446);
                           j++;
                           k1++;
                           var1.y(class07079);
                           var5.run(class07079, var2);
                           if (j >= class07079.n_()) {
                              return;
                           }

                           if (class07079.R(k1)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static void N(class07428 var0, class04782 var1, class07209 var2) {
      N(var0, var1, var1.method_8500(var2), var2, (var0x, var1x, var2x) -> true, (var0x, var1x) -> {});
   }

   public static void N(class07428 var0, class04782 var1, class00570 var2, class00771 var3, class00792 var4) {
      class07209 class07209 = N(var1, var2);
      if (class07209.method_10264() >= var1.method_31607() + 1) {
         N(var0, var1, var2, class07209, var3, var4);
      }
   }

   public static void N(class04782 var0, class00570 var1, class00760 var2, List<class07428> var3) {
      class04643 class04643 = class08700.N();
      class04643.N("spawner");

      for (class07428 class07428 : var3) {
         if (var2.N(class07428, var1.R())) {
            N(class07428, var0, var1, var2::N, var2::N);
         }
      }

      class04643.L();
   }

   public static List<class07428> N(class00760 var0, boolean var1, boolean var2, boolean var3) {
      ArrayList arraylist = new ArrayList(M.length);

      for (class07428 class07428 : M) {
         if ((var1 || !class07428.L()) && (var2 || class07428.L()) && (var3 || !class07428.u()) && var0.N(class07428)) {
            arraylist.add(class07428);
         }
      }

      return arraylist;
   }

   static class00780 N(class07209 var0, class08050 var1) {
      return var1.method_16359(class01146.N(var0.method_10263()), class01146.N(var0.method_10264()), class01146.N(var0.method_10260())).N();
   }

   public static class00760 N(int var0, Iterable<class07049> var1, class09402 var2, class03218 var3) {
      class05214 class05214 = new class05214();
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

      for (class07049 class07049 : var1) {
         if (!(class07049 instanceof class07079 class07079 && (class07079.Nm() || class07079.Nu()))) {
            class07428 class07428 = class07049.method_5864().i();
            if (class07428 != class07428.field_17715) {
               class07209 class07209 = class07049.method_24515();
               var2.query(class07321.N(class07209), var6 -> {
                  class01043 class01043 = N(class07209, var6).N().N(class07049.method_5864());
                  if (class01043 != null) {
                     class05214.N(class07049.method_24515(), class01043.y());
                  }

                  if (class07049 instanceof class07079) {
                     var3.N(var6.R(), class07428);
                  }

                  object2intopenhashmap.addTo(class07428, 1);
               });
            }
         }
      }

      return new class00760(var0, object2intopenhashmap, class05214, var3);
   }

   private static Optional<class01016> N(class04782 var0, class05324 var1, class08088 var2, class07428 var3, class06069 var4, class07209 var5) {
      class03556<class00780> class03556 = var0.i(var5);
      return var3 == class07428.field_24460 && class03556.N(class03557.Nz) && var4.z() < 0.98F
         ? Optional.empty()
         : N(var0, var1, var2, var3, var5, class03556).N(var4);
   }

   private static boolean N(class04782 var0, class07079 var1, double var2) {
      return var2 > var1.method_5864().i().i() * var1.method_5864().i().i() && var1.N(var2)
         ? false
         : var1.N(var0, class06113.field_16459) && var1.N((class05487)var0);
   }

   @Nullable
   private static class07079 N(class04782 var0, class07078<?> var1) {
      try {
         if (var1.N(var0, class06113.field_16459) instanceof class07079 class07079) {
            return class07079;
         }

         i.warn("Can't spawn entity of type: {}", class04206.M.y(var1));
      } catch (Exception exception) {
         i.warn("Failed to create mob", exception);
      }

      return null;
   }

   private static boolean N(class04782 var0, class07428 var1, class05324 var2, class08088 var3, class01016 var4, class07218 var5, double var6) {
      class07078<?> class07078 = var4.N();
      if (class07078.i() == class07428.field_17715) {
         return false;
      } else if (!class07078.u() && var6 > class07078.i().i() * class07078.i().i()) {
         return false;
      } else if (!class07078.y() || !N(var0, var2, var3, var1, var4, var5)) {
         return false;
      } else if (!class07448.N(class07078, var0, var5)) {
         return false;
      } else {
         return !class07448.N(class07078, var0, class06113.field_16459, var5, var0.field_9229)
            ? false
            : var0.y(class07078.N(var5.method_10263() + 0.5, var5.method_10264(), var5.method_10260() + 0.5));
      }
   }

   private static boolean N(class04782 var0, class08050 var1, class07218 var2, double var3) {
      if (var3 <= 576.0) {
         return false;
      } else {
         class05042 class05042 = var0.method_74854();
         if (class05042.N() == var0.method_27983()
            && class05042.y().method_19769(new class06889(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5), 24.0)) {
            return false;
         } else {
            class07321 class07321 = new class07321(var2);
            return Objects.equals(class07321, var1.R()) || var0.method_67505(class07321);
         }
      }
   }
}
