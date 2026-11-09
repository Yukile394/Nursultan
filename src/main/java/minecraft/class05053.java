package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class class05053 extends class04748 {
   private static final String[] y = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] R = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};
   private static final float M = 0.05F;
   private static final int B = 15;
   private final List<class05082> Z;
   public static final MapCodec<class05053> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(N(var0), class06338.y(class05082.N.listOf()).fieldOf("setups").forGetter(var0x -> var0x.Z)).apply(var0, class05053::new)
   );

   public class05053(class04758 var1, List<class05082> var2) {
      super(var1);
      this.Z = var2;
   }

   public class05053(class04758 var1, class05082 var2) {
      this(var1, List.of(var2));
   }

   private static int N(class06069 var0, int var1, int var2) {
      return var1 < var2 ? class04995.y(var0, var1, var2) : var2;
   }

   private static boolean N(class07836 var0, float var1) {
      if (var1 == 0.0F) {
         return false;
      } else {
         return var1 == 1.0F ? true : var0.z() < var1;
      }
   }

   private static boolean N(class07209 var0, class03556<class00780> var1, int var2) {
      return ((class00780)var1.N()).y(var0, var2);
   }

   private static int N(class06069 var0, class08088 var1, class05085 var2, boolean var3, int var4, int var5, class05163 var6, class05474 var7, class04084 var8) {
      int j = var7.method_31607() + 15;
      int i;
      if (var2 == class05085.field_24034) {
         if (var3) {
            i = class04995.y(var0, 32, 100);
         } else if (var0.z() < 0.5F) {
            i = class04995.y(var0, 27, 29);
         } else {
            i = class04995.y(var0, 29, 100);
         }
      } else if (var2 == class05085.field_24032) {
         int k = var4 - var5;
         i = N(var0, 70, k);
      } else if (var2 == class05085.field_24033) {
         int j1 = var4 - var5;
         i = N(var0, j, j1);
      } else if (var2 == class05085.field_24030) {
         i = var4 - var5 + class04995.y(var0, 2, 8);
      } else {
         i = var4;
      }

      ImmutableList immutablelist = ImmutableList.of(
         new class07209(var6.B(), 0, var6.z()),
         new class07209(var6.U(), 0, var6.z()),
         new class07209(var6.B(), 0, var6.W()),
         new class07209(var6.U(), 0, var6.W())
      );
      List list = immutablelist.stream().map(var3x -> var1.N(var3x.method_10263(), var3x.method_10260(), var7, var8)).collect(Collectors.toList());
      class07830 class07830 = var2 == class05085.field_24031 ? class07830.field_13195 : class07830.field_13194;

      int l;
      for (l = i; l > j; l--) {
         int i1 = 0;
         Iterator iterator = list.iterator();

         while (iterator.hasNext()) {
            class00500 class00500 = ((class01376)iterator.next()).N(l);
            if (class07830.u().test(class00500)) {
               if (++i1 == 3) {
                  return l;
               }
            }
         }
      }

      return l;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class05073 class05073 = new class05073();
      class07836 class07836 = var1.R();
      class05082 class05082xxx = null;
      if (this.Z.size() > 1) {
         float f = 0.0F;

         for (class05082 class05082x : this.Z) {
            f += class05082x.B();
         }

         float f1 = class07836.z();

         for (class05082 class05082x : this.Z) {
            f1 -= class05082x.B() / f;
            if (f1 < 0.0F) {
               class05082xxx = class05082x;
               break;
            }
         }
      } else {
         class05082xxx = this.Z.get(0);
      }

      if (class05082xxx == null) {
         throw new IllegalStateException();
      } else {
         class05082 class05082xx = class05082xxx;
         class05073.u = N(class07836, class05082xx.y());
         class05073.L = class05082xx.L();
         class05073.i = class05082xx.u();
         class05073.R = class05082xx.i();
         class05073.M = class05082xx.M();
         class01894 class01894;
         if (class07836.z() < 0.05F) {
            class01894 = class01894.y(R[class07836.y(R.length)]);
         } else {
            class01894 = class01894.y(y[class07836.y(y.length)]);
         }

         class01207 class01207 = var1.i().N(class01894);
         class06993 class06993 = class07536.N((class06993[])class06993.values(), class07836);
         class07111 class07111 = class07836.z() < 0.5F ? class07111.field_11302 : class07111.field_11301;
         class07209 class07209xxx = new class07209(class01207.N().method_10263() / 2, 0, class01207.N().method_10260() / 2);
         class08088 class08088 = var1.y();
         class05474 class05474 = var1.Z();
         class04084 class04084 = var1.u();
         class07209 class07209x = var1.B().W();
         class05163 class05163 = class01207.N(class07209x, class06993, class07209xxx, class07111);
         class07209 class07209xx = class05163.M();
         int i = class08088.N(class07209xx.method_10263(), class07209xx.method_10260(), class05065.N(class05082xx.N()), class05474, class04084) - 1;
         int j = N(class07836, class08088, class05082xx.N(), class05073.u, i, class05163.i(), class05163, class05474, class04084);
         class07209 class07209xxx = new class07209(class07209x.method_10263(), j, class07209x.method_10260());
         return Optional.of(
            new class04780(
               class07209xxx,
               (Consumer<class03291>)(var11x -> {
                  if (class05082.R()) {
                     class05073.y = N(
                        class07209,
                        var1.y()
                           .u()
                           .method_38109(
                              class01146.N(class07209.method_10263()),
                              class01146.N(class07209.method_10264()),
                              class01146.N(class07209.method_10260()),
                              class04084.y()
                           ),
                        class08088.R()
                     );
                  }

                  var11x.N(new class05065(var1.i(), class07209, class05082.N(), class05073, class01894, class01207, class06993, class07111, class07209xxx));
               })
            )
         );
      }
   }

   @Override
   public class04367<?> N() {
      return class04367.E;
   }
}
