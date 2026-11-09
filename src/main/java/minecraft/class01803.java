package minecraft;

import java.util.Set;

public class class01803 extends class06078<class08797> {
   private static final float N = 0.6F;
   private static final float y = 0.8F;
   private static final float L = 1.0F;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class00094 U;
   private final class00094 E;
   private final class00094 W;
   private final class00094 m;
   private final class00094 P;
   private final class00094 s;

   public static class04806 L() {
      class04792 class04792 = B();
      class04792.N().N(Set.of("eyes"));
      return class04806.N(class04792, 32, 32);
   }

   public class01686 M() {
      return this.R;
   }

   public class01803(class01686 var1) {
      super(var1, class06851::z);
      this.R = var1.y("wind_body");
      this.Z = this.R.y("wind_bottom");
      this.B = this.Z.y("wind_mid");
      this.M = this.B.y("wind_top");
      this.u = var1.y("body").y("head");
      this.i = this.u.y("eyes");
      this.z = var1.y("body").y("rods");
      this.U = class01769.N.N(var1);
      this.E = class01769.y.N(var1);
      this.W = class01769.i.N(var1);
      this.m = class01769.R.N(var1);
      this.P = class01769.u.N(var1);
      this.s = class01769.L.N(var1);
   }

   private static class04792 B() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N("body", class04822.L(), class04838.N(0.0F, 0.0F, 0.0F));
      class04839 class04839xx = class04839x.N("rods", class04822.L(), class04838.N(0.0F, 8.0F, 0.0F));
      class04839xx.N(
         "rod_1",
         class04822.L().N(0, 17).N(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new class04834(0.0F)),
         class04838.N(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F)
      );
      class04839xx.N(
         "rod_2",
         class04822.L().N(0, 17).N(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new class04834(0.0F)),
         class04838.N(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F)
      );
      class04839xx.N(
         "rod_3", class04822.L().N(0, 17).N(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new class04834(0.0F)), class04838.N(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F)
      );
      class04839x.N(
            "head",
            class04822.L()
               .N(4, 24)
               .N(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new class04834(0.0F))
               .N(0, 0)
               .N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new class04834(0.0F)),
            class04838.N(0.0F, 4.0F, 0.0F)
         )
         .N(
            "eyes",
            class04822.L()
               .N(4, 24)
               .N(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new class04834(0.0F))
               .N(0, 0)
               .N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new class04834(0.0F)),
            class04838.N(0.0F, 0.0F, 0.0F)
         );
      class04839xx.N("wind_body", class04822.L(), class04838.N(0.0F, 0.0F, 0.0F))
         .N("wind_bottom", class04822.L().N(1, 83).N(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new class04834(0.0F)), class04838.N(0.0F, 24.0F, 0.0F))
         .N(
            "wind_mid",
            class04822.L()
               .N(74, 28)
               .N(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new class04834(0.0F))
               .N(78, 32)
               .N(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new class04834(0.0F))
               .N(49, 71)
               .N(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new class04834(0.0F)),
            class04838.N(0.0F, -7.0F, 0.0F)
         )
         .N(
            "wind_top",
            class04822.L()
               .N(0, 0)
               .N(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new class04834(0.0F))
               .N(6, 6)
               .N(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new class04834(0.0F))
               .N(105, 57)
               .N(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new class04834(0.0F)),
            class04838.N(0.0F, -6.0F, 0.0F)
         );
      return class04792;
   }

   public class01686 i() {
      return this.i;
   }

   public class01686 u() {
      return this.u;
   }

   public static class04806 y() {
      class04792 class04792 = B();
      class04792.N().N(Set.of("wind_body"));
      return class04806.N(class04792, 128, 128);
   }

   public static class04806 N() {
      class04792 class04792 = B();
      class04792.N().N(Set.of("head", "rods"));
      return class04806.N(class04792, 32, 32);
   }

   public void method_2819(class08797 var1) {
      super.method_2819(var1);
      this.U.N(var1.N, var1.P);
      this.E.N(var1.y, var1.P);
      this.W.N(var1.L, var1.P);
      this.m.N(var1.u, var1.P);
      this.P.N(var1.i, var1.P);
      this.s.N(var1.R, var1.P);
   }

   public class01686 R() {
      return this.z;
   }
}
