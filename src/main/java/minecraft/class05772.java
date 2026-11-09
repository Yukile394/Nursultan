package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior;

public class class05772 {
   private static final float u = 0.4F;
   public static final int N = 5;
   public static final int y = 2;
   public static final float L = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> L(class03556<class05672> var0, float var1) {
      return ImmutableList.of(
         Pair.of(2, class05742.N(class05378.y, var1, 1, 150, 1200)),
         Pair.of(3, class05757.N(var0x -> var0x.N(class03927.m), class05378.y)),
         Pair.of(3, new class05752()),
         Pair.of(
            5,
            new class05747(
               ImmutableMap.of(class05378.y, class05367.field_18457),
               ImmutableList.of(
                  Pair.of(class05704.N(var1), 1), Pair.of(class05727.N(var1), 4), Pair.of(class04625.N(var1, 4), 2), Pair.of(new class05782(20, 40), 2)
               )
            )
         ),
         y(),
         Pair.of(99, class05754.N())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> M(class03556<class05672> var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, class06298.N()),
         Pair.of(0, class04145.N(ImmutableList.of(Pair.of(class05742.N(class05378.i, var1 * 1.5F, 2, 150, 200), 6), Pair.of(class05755.N(var1 * 1.5F), 2)))),
         y(),
         Pair.of(99, class06303.N())
      );
   }

   public class05772() {
      super();
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> B(class03556<class05672> var0, float var1) {
      return ImmutableList.of(
         Pair.of(
            0, class04137.N(class04137.N(class05772::y), class04145.N(ImmutableList.of(Pair.of(class06286.N(var1), 5), Pair.of(class05755.N(var1 * 1.1F), 2))))
         ),
         Pair.of(0, new class06284(600, 600)),
         Pair.of(2, class04137.N(class04137.N(class05772::N), class06317.N(24, var1 * 1.4F, 1))),
         y(),
         Pair.of(99, class06303.N())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> Z(class03556<class05672> var0, float var1) {
      byte b0 = 2;
      return ImmutableList.of(Pair.of(0, class06301.N(15, 3)), Pair.of(1, class06317.N(32, var1 * 1.25F, 2)), y());
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> i(class03556<class05672> var0, float var1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new class05747(
               ImmutableList.of(
                  Pair.of(class05750.N(class07078.ye, 8, class05378.b, var1, 2), 2),
                  Pair.of(class05750.N(class07078.ye, 8, class07077::q, class07077::q, class05378.j, var1, 2), 1),
                  Pair.of(class05750.N(class07078.l, 8, class05378.b, var1, 2), 1),
                  Pair.of(class05755.N(var1), 1),
                  Pair.of(class05771.N(var1, 2), 1),
                  Pair.of(new class06315(var1), 1),
                  Pair.of(new class05782(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new class06285(100)),
         Pair.of(3, class05778.N(class07078.Ly, 4)),
         Pair.of(3, new class05780(400, 1600)),
         Pair.of(
            3,
            new class05736(
               ImmutableMap.of(), ImmutableSet.of(class05378.b), class05753.field_18348, class05769.field_18855, ImmutableList.of(Pair.of(new class05759(), 1))
            )
         ),
         Pair.of(
            3,
            new class05736(
               ImmutableMap.of(), ImmutableSet.of(class05378.j), class05753.field_18348, class05769.field_18855, ImmutableList.of(Pair.of(new class05776(), 1))
            )
         ),
         N(),
         Pair.of(99, class05754.N())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> u(class03556<class05672> var0, float var1) {
      return ImmutableList.of(
         Pair.of(2, class04145.N(ImmutableList.of(Pair.of(class05767.N(class05378.i, 0.4F, 40), 2), Pair.of(class05761.N(), 2)))),
         Pair.of(10, new class05780(400, 1600)),
         Pair.of(10, class05778.N(class07078.Ly, 4)),
         Pair.of(2, class05742.N(class05378.i, var1, 6, 100, 200)),
         Pair.of(3, new class06285(100)),
         Pair.of(3, class05757.N(var0x -> var0x.N(class03927.P), class05378.i)),
         Pair.of(
            3,
            new class05736(
               ImmutableMap.of(), ImmutableSet.of(class05378.b), class05753.field_18348, class05769.field_18855, ImmutableList.of(Pair.of(new class05759(), 1))
            )
         ),
         N(),
         Pair.of(99, class05754.N())
      );
   }

   private static boolean y(class04782 var0, class07438 var1) {
      class04877 class04877 = var0.method_19502(var1.method_24515());
      return class04877 != null && class04877.i();
   }

   private static Pair<Integer, class04142<class07438>> y() {
      return Pair.of(
         5,
         new class05747(
            ImmutableList.of(Pair.of(class05745.N(class07078.ye, 8.0F), 2), Pair.of(class05745.N(class07078.Ly, 8.0F), 2), Pair.of(new class05782(30, 60), 8))
         )
      );
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> y(class03556<class05672> var0, float var1) {
      Object object;
      if (var0.N(class05672.M)) {
         object = new class01348();
      } else {
         object = new class05735();
      }

      return ImmutableList.of(
         y(),
         Pair.of(
            5,
            new class05747(
               ImmutableList.of(
                  Pair.of(object, 7),
                  Pair.of(class05767.N(class05378.L, 0.4F, 4), 2),
                  Pair.of(class06300.N(class05378.L, 0.4F, 1, 10), 5),
                  Pair.of(class06295.N(class05378.R, var1, 1, 6, class05378.L), 5),
                  Pair.of(new class06288(), var0.N(class05672.M) ? 2 : 5),
                  Pair.of(new class01334(), var0.N(class05672.M) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new class05780(400, 1600)),
         Pair.of(10, class05778.N(class07078.Ly, 4)),
         Pair.of(2, class05742.N(class05378.L, var1, 9, 100, 1200)),
         Pair.of(3, new class06285(100)),
         Pair.of(99, class05754.N())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> N(class03556<class05672> var0, float var1) {
      return ImmutableList.of(
         Pair.of(0, new class05739(0.8F)),
         Pair.of(0, class05758.N()),
         Pair.of(0, new class05770(45, 90)),
         Pair.of(0, new class05768()),
         Pair.of(0, class06309.N()),
         Pair.of(0, class06296.N()),
         Pair.of(0, class06316.N()),
         Pair.of(0, class05757.N(((class05672)var0.N()).y(), class05378.L)),
         Pair.of(0, class05757.N(((class05672)var0.N()).L(), class05378.u)),
         Pair.of(1, new class05738()),
         Pair.of(2, class05940.N()),
         Pair.of(3, new class05766(var1)),
         new Pair[]{
            Pair.of(5, class01522.N(var1, false, 4)),
            Pair.of(6, N(((class05672)var0.N()).L(), class05378.L, class05378.u, true, Optional.empty(), (var0x, var1x) -> true)),
            Pair.of(7, new class05939(var1)),
            Pair.of(8, class05968.N(var1)),
            Pair.of(10, class05743.N(var0x -> var0x.N(class03927.m), class05378.y, false, Optional.of((byte)14), class05772::N)),
            Pair.of(10, class05743.N(var0x -> var0x.N(class03927.P), class05378.i, true, Optional.of((byte)14))),
            Pair.of(10, class05760.N()),
            Pair.of(10, class05712.N())
         }
      );
   }

   private static class04142 N(Predicate var0, class05378 var1, class05378 var2, boolean var3, Optional var4, BiPredicate var5) {
      return (class04142)(var0 == class05369.N ? LithiumEmptyBehavior.EMPTY_BEHAVIOR_SENTINEL : class05743.N(var0, var1, var2, var3, var4, var5));
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> N(float var0) {
      return ImmutableList.of(
         Pair.of(0, new class05738(80, 120)),
         N(),
         Pair.of(5, class06278.N()),
         Pair.of(
            5,
            new class05747(
               ImmutableMap.of(class05378.Z, class05367.field_18457),
               ImmutableList.of(
                  Pair.of(class05750.N(class07078.ye, 8, class05378.b, var0, 2), 2),
                  Pair.of(class05750.N(class07078.l, 8, class05378.b, var0, 2), 1),
                  Pair.of(class05755.N(var0), 1),
                  Pair.of(class05771.N(var0, 2), 1),
                  Pair.of(new class06315(var0), 2),
                  Pair.of(new class05782(20, 40), 2)
               )
            )
         ),
         Pair.of(99, class05754.N())
      );
   }

   private static boolean N(class04782 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      return class00500.N(class01210.F) && !class00500.L(class07789.L);
   }

   private static Pair<Integer, class04142<class07438>> N() {
      return Pair.of(
         5,
         new class05747(
            ImmutableList.of(
               Pair.of(class05745.N(class07078.l, 8.0F), 8),
               Pair.of(class05745.N(class07078.ye, 8.0F), 2),
               Pair.of(class05745.N(class07078.Ly, 8.0F), 2),
               Pair.of(class05745.N(class07428.field_6294, 8.0F), 1),
               Pair.of(class05745.N(class07428.field_6300, 8.0F), 1),
               Pair.of(class05745.N(class07428.field_34447, 8.0F), 1),
               Pair.of(class05745.N(class07428.field_30092, 8.0F), 1),
               Pair.of(class05745.N(class07428.field_24460, 8.0F), 1),
               Pair.of(class05745.N(class07428.field_6302, 8.0F), 1),
               Pair.of(new class05782(30, 60), 2)
            )
         )
      );
   }

   private static boolean N(class04782 var0, class07438 var1) {
      class04877 class04877 = var0.method_19502(var1.method_24515());
      return class04877 != null && class04877.T() && !class04877.i() && !class04877.R();
   }

   public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> R(class03556<class05672> var0, float var1) {
      float f = var1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, class05756.N()),
         Pair.of(1, class05773.y(class05378.Y, f, 6, false)),
         Pair.of(1, class05773.y(class05378.w, f, 6, false)),
         Pair.of(3, class05755.N(f, 2, 2)),
         y()
      );
   }
}
