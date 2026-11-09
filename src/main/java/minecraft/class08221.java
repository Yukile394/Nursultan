package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class08221 {
   private static final class08218 N = class08218.N("trial_chamber/breeze");
   private static final class08218 y = class08218.N("trial_chamber/melee/husk");
   private static final class08218 L = class08218.N("trial_chamber/melee/spider");
   private static final class08218 u = class08218.N("trial_chamber/melee/zombie");
   private static final class08218 i = class08218.N("trial_chamber/ranged/poison_skeleton");
   private static final class08218 R = class08218.N("trial_chamber/ranged/skeleton");
   private static final class08218 M = class08218.N("trial_chamber/ranged/stray");
   private static final class08218 B = class08218.N("trial_chamber/slow_ranged/poison_skeleton");
   private static final class08218 Z = class08218.N("trial_chamber/slow_ranged/skeleton");
   private static final class08218 z = class08218.N("trial_chamber/slow_ranged/stray");
   private static final class08218 U = class08218.N("trial_chamber/small_melee/baby_zombie");
   private static final class08218 E = class08218.N("trial_chamber/small_melee/cave_spider");
   private static final class08218 W = class08218.N("trial_chamber/small_melee/silverfish");
   private static final class08218 m = class08218.N("trial_chamber/small_melee/slime");

   private static class04483 L() {
      return class04513.y().y(3.0F).u(0.5F).y(20);
   }

   public class08221() {
      super();
   }

   private static class04483 y() {
      return class04513.y().y(4.0F).u(2.0F).y(160);
   }

   private static <T extends class07049> class00808 N(class07078<T> var0, class05946<class05074> var1) {
      return N(var0, var0x -> {}, var1);
   }

   private static <T extends class07049> class00808 N(class07078<T> var0) {
      return N(var0, var0x -> {}, null);
   }

   public static void N(class04116<class04513> var0) {
      N(
         var0,
         N,
         class04513.y().y(1.0F).u(0.5F).y(20).N(2.0F).L(1.0F).N(class04540.N(N(class07078.v))).N(),
         class04513.y()
            .u(0.5F)
            .y(20)
            .N(4.0F)
            .L(1.0F)
            .N(class04540.N(N(class07078.v)))
            .y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N())
            .N()
      );
      N(
         var0,
         y,
         L().N(class04540.N(N(class07078.Nb))).N(),
         L().N(class04540.N(N(class07078.Nb, class06273.NU))).y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N()
      );
      N(
         var0,
         L,
         L().N(class04540.N(N(class07078.yG))).N(),
         N().N(class04540.N(N(class07078.yG))).y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N()
      );
      N(
         var0,
         u,
         L().N(class04540.N(N(class07078.yx))).N(),
         L().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.yx, class06273.NU))).N()
      );
      N(
         var0,
         i,
         L().N(class04540.N(N(class07078.j))).N(),
         L().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.j, class06273.Nz))).N()
      );
      N(
         var0,
         R,
         L().N(class04540.N(N(class07078.ym))).N(),
         L().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.ym, class06273.Nz))).N()
      );
      N(
         var0,
         M,
         L().N(class04540.N(N(class07078.yk))).N(),
         L().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.yk, class06273.Nz))).N()
      );
      N(
         var0,
         B,
         y().N(class04540.N(N(class07078.j))).N(),
         y().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.j, class06273.Nz))).N()
      );
      N(
         var0,
         Z,
         y().N(class04540.N(N(class07078.ym))).N(),
         y().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.ym, class06273.Nz))).N()
      );
      N(
         var0,
         z,
         y().N(class04540.N(N(class07078.yk))).N(),
         y().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.yk, class06273.Nz))).N()
      );
      N(
         var0,
         U,
         class04513.y().u(0.5F).y(20).N(class04540.N(N(class07078.yx, var0x -> var0x.N("IsBaby", true), null))).N(),
         class04513.y()
            .u(0.5F)
            .y(20)
            .y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N())
            .N(class04540.N(N(class07078.yx, var0x -> var0x.N("IsBaby", true), class06273.NU)))
            .N()
      );
      N(
         var0,
         E,
         L().N(class04540.N(N(class07078.d))).N(),
         N().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.d))).N()
      );
      N(
         var0,
         W,
         L().N(class04540.N(N(class07078.yW))).N(),
         N().y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N()).N(class04540.N(N(class07078.yW))).N()
      );
      N(
         var0,
         m,
         L()
            .N(
               class04540.<class00808>y()
                  .N(N(class07078.ys, var0x -> var0x.N("Size", (byte)1)), 3)
                  .N(N(class07078.ys, var0x -> var0x.N("Size", (byte)2)), 1)
                  .N()
            )
            .N(),
         N()
            .y(class04540.<class05946<class05074>>y().N(class06273.NA, 3).N(class06273.Nf, 7).N())
            .N(
               class04540.<class00808>y()
                  .N(N(class07078.ys, var0x -> var0x.N("Size", (byte)1)), 3)
                  .N(N(class07078.ys, var0x -> var0x.N("Size", (byte)2)), 1)
                  .N()
            )
            .N()
      );
   }

   private static class04483 N() {
      return class04513.y().y(4.0F).u(0.5F).y(20).N(12.0F);
   }

   private static <T extends class07049> class00808 N(class07078<T> var0, Consumer<class07001> var1, @Nullable class05946<class05074> var2) {
      class07001 class07001 = new class07001();
      class07001.N_67("id", class04206.M.y(var0).toString());
      var1.accept(class07001);
      Optional optional = Optional.ofNullable(var2).map(var0x -> new class02947((class05946<class05074>)var0x, 0.0F));
      return new class00808(class07001, Optional.empty(), optional);
   }

   static class05946<class04513> N(String var0) {
      return class05946.N(class04227.yl, class01894.y(var0));
   }

   private static void N(class04116<class04513> var0, class08218 var1, class04513 var2, class04513 var3) {
      var0.N(var1.N(), var2);
      var0.N(var1.y(), var3);
   }

   private static <T extends class07049> class00808 N(class07078<T> var0, Consumer<class07001> var1) {
      return N(var0, var1, null);
   }
}
