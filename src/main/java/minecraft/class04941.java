package minecraft;

import java.util.Set;

public class class04941 extends class06078<class08140> implements class06230, class06240<class08140> {
   private static final float N = 2.0F;
   private static final float y = 2.5F;
   private static final float L = 0.015F;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class00094 B;
   private final class00094 Z;
   private final class00094 z;
   private final class00094 U;
   private final class00094 E;
   private final class00094 W;
   private final class00094 m;

   public static class04806 L() {
      class04792 class04792 = new class04792().N_50(var0x -> var0x.L(0.0F, 0.0F, 0.0F));
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N(
         "body",
         class04822.L()
            .N(3, 19)
            .N(-3.0F, -4.0F, -4.525F, 6.0F, 1.0F, 6.0F, new class04834(0.0F))
            .N(0, 15)
            .N(-4.0F, -3.0F, -3.525F, 8.0F, 6.0F, 6.0F, new class04834(0.0F)),
         class04838.N(0.0F, -3.0F, 2.325F)
      );
      class04839x.N(
         "body_r1",
         class04822.L().N(3, 18).N(-4.0F, -3.0F, -2.2F, 8.0F, 6.0F, 3.0F, new class04834(0.0F)),
         class04838.N(0.0F, -1.0F, -4.325F, 0.0F, 0.0F, -3.1416F)
      );
      class04839 class04839xx = class04839x.N(
         "head",
         class04822.L()
            .N(37, 8)
            .N(-1.0F, -7.0F, -3.3F, 2.0F, 4.0F, 2.0F, new class04834(-0.015F))
            .N(37, 0)
            .N(-2.0F, -11.0F, -4.3F, 4.0F, 4.0F, 4.0F, new class04834(-0.015F))
            .N(0, 0)
            .N(-4.0F, -3.0F, -7.325F, 8.0F, 5.0F, 10.0F, new class04834(0.0F))
            .N(56, 0)
            .N(-1.0F, 0.0F, -8.325F, 2.0F, 3.0F, 2.0F, new class04834(0.0F)),
         class04838.N(0.0F, -6.0F, -0.2F)
      );
      class04839x.N("right_arm", class04822.L(), class04838.N(-4.0F, -5.6F, -1.8F, 0.4363F, 0.0F, 0.0F))
         .N(
            "right_arm_r1",
            class04822.L().N(36, 16).N(-3.075F, -0.9733F, -1.9966F, 3.0F, 10.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.0F, 0.0893F, 0.1198F, -1.0472F, 0.0F, 0.0F)
         );
      class04839x.N("left_arm", class04822.L(), class04838.N(4.0F, -5.6F, -1.7F, 0.4363F, 0.0F, 0.0F))
         .N(
            "left_arm_r1",
            class04822.L().N(50, 16).N(0.075F, -1.0443F, -1.8997F, 3.0F, 10.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.0F, -0.0015F, -0.0808F, -1.0472F, 0.0F, 0.0F)
         );
      class04839xx.N("right_leg", class04822.L(), class04838.N(-2.1F, -2.1F, -2.075F))
         .N(
            "right_leg_r1",
            class04822.L().N(0, 27).N(-2.0F, 0.975F, 0.0F, 4.0F, 5.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.05F, -1.9F, 1.075F, -1.5708F, 0.0F, 0.0F)
         );
      class04839xx.N("left_leg", class04822.L(), class04838.N(2.0F, -2.0F, -2.075F))
         .N(
            "left_leg_r1",
            class04822.L().N(16, 27).N(-2.0F, 0.975F, 0.0F, 4.0F, 5.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.05F, -2.0F, 1.075F, -1.5708F, 0.0F, 0.0F)
         );
      return class04806.N(class04792, 64, 64);
   }

   private void M() {
      this.R.i = Math.min(this.R.i, -0.87266463F);
      this.M.i = Math.min(this.M.i, -0.87266463F);
      this.R.R = Math.min(this.R.R, -0.1134464F);
      this.M.R = Math.max(this.M.R, 0.1134464F);
      this.R.M = Math.min(this.R.M, -0.064577185F);
      this.M.M = Math.max(this.M.M, 0.064577185F);
   }

   public class04941(class01686 var1) {
      super(var1);
      this.i = var1.y("body");
      this.u = this.i.y("head");
      this.R = this.i.y("right_arm");
      this.M = this.i.y("left_arm");
      this.B = class08970.N.N(var1);
      this.Z = class08970.L.N(var1);
      this.z = class08970.y.N(var1);
      this.U = class08970.R.N(var1);
      this.E = class08970.M.N(var1);
      this.W = class08970.u.N(var1);
      this.m = class08970.i.N(var1);
   }

   public static class04806 i() {
      return N().N(var0 -> {
         var0.N().N(Set.of("eyes"));
         return var0;
      });
   }

   public static class04806 u() {
      class04792 class04792 = new class04792().N_50(var0x -> var0x.L(0.0F, 0.0F, 0.0F));
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N(
         "body", class04822.L().N(0, 15).N(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 6.0F, new class04834(0.0F)), class04838.N(0.0F, -5.0F, 0.0F)
      );
      class04839x.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-4.0F, -5.0F, -5.0F, 8.0F, 5.0F, 10.0F, new class04834(0.0F))
            .N(56, 0)
            .N(-1.0F, -2.0F, -6.0F, 2.0F, 3.0F, 2.0F, new class04834(0.0F))
            .N(37, 8)
            .N(-1.0F, -9.0F, -1.0F, 2.0F, 4.0F, 2.0F, new class04834(-0.015F))
            .N(37, 0)
            .N(-2.0F, -13.0F, -2.0F, 4.0F, 4.0F, 4.0F, new class04834(-0.015F)),
         class04838.N(0.0F, -6.0F, 0.0F)
      );
      class04839 class04839xx = class04839x.N("right_arm", class04822.L(), class04838.N(-4.0F, -6.0F, 0.0F));
      class04839xx.N(
         "right_arm_r1",
         class04822.L().N(36, 16).N(-1.5F, -5.0F, -2.0F, 3.0F, 10.0F, 4.0F, new class04834(0.0F)),
         class04838.N(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.9199F)
      );
      class04839xx.N("rightItem", class04822.L(), class04838.N(-1.0F, 7.4F, -1.0F));
      class04839x.N("left_arm", class04822.L(), class04838.N(4.0F, -6.0F, 0.0F))
         .N(
            "left_arm_r1",
            class04822.L().N(50, 16).N(-1.5F, -5.0F, -2.0F, 3.0F, 10.0F, 4.0F, new class04834(0.0F)),
            class04838.N(-1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.9199F)
         );
      class04839xx.N("right_leg", class04822.L(), class04838.N(-3.0F, -5.0F, 0.0F))
         .N(
            "right_leg_r1",
            class04822.L().N(0, 27).N(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.35F, 2.0F, 0.01F, 0.0F, 0.0F, 0.2618F)
         );
      class04839xx.N("left_leg", class04822.L(), class04838.N(1.0F, -5.0F, 0.0F))
         .N(
            "left_leg_r1",
            class04822.L().N(16, 27).N(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new class04834(0.0F)),
            class04838.N(1.65F, 2.0F, 0.0F, 0.0F, 0.0F, -0.2618F)
         );
      return class04806.N(class04792, 64, 64);
   }

   public static class04806 y() {
      class04792 class04792 = new class04792().N_50(var0x -> var0x.L(0.0F, 0.0F, 0.0F));
      class04839 class04839x = class04792.N();
      class04839 class04839x = class04839x.N("body", class04822.L(), class04838.N(-1.064F, -5.0F, 0.0F));
      class04839x.N(
         "body_r1",
         class04822.L().N(0, 15).N(-4.02F, -6.116F, -3.5F, 8.0F, 6.0F, 6.0F, new class04834(0.0F)),
         class04838.N(1.1F, 0.1F, 0.7F, 0.1204F, -0.0064F, -0.0779F)
      );
      class04839x.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-4.0F, -5.1F, -5.0F, 8.0F, 5.0F, 10.0F, new class04834(0.0F))
            .N(56, 0)
            .N(-1.02F, -2.1F, -6.0F, 2.0F, 3.0F, 2.0F, new class04834(0.0F))
            .N(37, 8)
            .N(-1.02F, -9.1F, -1.0F, 2.0F, 4.0F, 2.0F, new class04834(-0.015F))
            .N(37, 0)
            .N(-2.0F, -13.1F, -2.0F, 4.0F, 4.0F, 4.0F, new class04834(-0.015F)),
         class04838.N(0.7F, -5.6F, -1.8F)
      );
      class04839x.N("right_arm", class04822.L(), class04838.N(-4.0F, -6.0F, 0.0F))
         .N(
            "right_arm_r1",
            class04822.L().N(36, 16).N(-3.052F, -1.11F, -2.036F, 3.0F, 10.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.7F, -0.248F, -1.62F, 1.0036F, 0.0F, 0.0F)
         );
      class04839x.N("left_arm", class04822.L(), class04838.N(4.0F, -6.0F, 0.0F))
         .N(
            "left_arm_r1",
            class04822.L().N(50, 16).N(0.032F, -1.1F, -2.0F, 3.0F, 10.0F, 4.0F, new class04834(0.0F)),
            class04838.N(0.732F, 0.0F, 0.0F, -0.8715F, -0.0535F, -0.0449F)
         );
      class04839x.N("right_leg", class04822.L(), class04838.N(-3.064F, -5.0F, 0.0F))
         .N(
            "right_leg_r1",
            class04822.L().N(0, 27).N(-1.856F, -0.1F, -1.09F, 4.0F, 5.0F, 4.0F, new class04834(0.0F)),
            class04838.N(1.048F, 0.0F, -0.9F, -0.8727F, 0.0F, 0.0F)
         );
      class04839x.N("left_leg", class04822.L(), class04838.N(0.936F, -5.0F, 0.0F))
         .N(
            "left_leg_r1",
            class04822.L().N(16, 27).N(-2.088F, -0.1F, -2.0F, 4.0F, 5.0F, 4.0F, new class04834(0.0F)),
            class04838.N(1.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F)
         );
      return class04806.N(class04792, 64, 64);
   }

   public void y(class01421 var1) {
      this.field_54014.N(var1);
      this.i.N(var1);
      this.u.N(var1);
      var1.N(0.0, -2.25, 0.0);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792().N_50(var0x -> var0x.L(0.0F, 24.0F, 0.0F));
      class04839 class04839x = class04792.N();
      class04839 class04839x = class04839x.N(
         "body", class04822.L().N(0, 15).N(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 6.0F, class04834.N), class04838.N(0.0F, -5.0F, 0.0F)
      );
      class04839x.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-4.0F, -5.0F, -5.0F, 8.0F, 5.0F, 10.0F, new class04834(0.015F))
            .N(56, 0)
            .N(-1.0F, -2.0F, -6.0F, 2.0F, 3.0F, 2.0F, class04834.N)
            .N(37, 8)
            .N(-1.0F, -9.0F, -1.0F, 2.0F, 4.0F, 2.0F, new class04834(-0.015F))
            .N(37, 0)
            .N(-2.0F, -13.0F, -2.0F, 4.0F, 4.0F, 4.0F, new class04834(-0.015F)),
         class04838.N(0.0F, -6.0F, 0.0F)
      );
      class04839x.N("right_arm", class04822.L().N(36, 16).N(-3.0F, -1.0F, -2.0F, 3.0F, 10.0F, 4.0F, class04834.N), class04838.N(-4.0F, -6.0F, 0.0F));
      class04839x.N("left_arm", class04822.L().N(50, 16).N(0.0F, -1.0F, -2.0F, 3.0F, 10.0F, 4.0F, class04834.N), class04838.N(4.0F, -6.0F, 0.0F));
      class04839x.N("right_leg", class04822.L().N(0, 27).N(-4.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, class04834.N), class04838.N(0.0F, -5.0F, 0.0F));
      class04839x.N("left_leg", class04822.L().N(16, 27).N(0.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, class04834.N), class04838.N(0.0F, -5.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08140 var1) {
      super.method_2819(var1);
      this.u.i = var1.h * (float) (Math.PI / 180.0);
      this.u.R = var1.D * (float) (Math.PI / 180.0);
      if (var1.Nq.i() && var1.Ne.i()) {
         this.B.N(var1.NN, var1.Ny, 2.0F, 2.5F);
      } else {
         this.Z.N(var1.NN, var1.Ny, 2.0F, 2.5F);
         this.M();
      }

      this.z.N(var1.L, var1.P);
      this.U.N(var1.u, var1.P);
      this.E.N(var1.i, var1.P);
      this.W.N(var1.R, var1.P);
      this.m.N(var1.M, var1.P);
   }

   public void N(class08140 var1, class07070 var2, class01421 var3) {
      this.field_54014.N(var3);
      this.i.N(var3);
      (var2 == class07070.field_6183 ? this.R : this.M).N(var3);
      if (var1.y.equals(class08979.field_61292)) {
         var3.N(class02058.u.N(var2 == class07070.field_6183 ? -90.0F : 90.0F));
         var3.N(0.0F, 0.0F, 0.125F);
      } else {
         var3.y(0.55F, 0.55F, 0.55F);
         var3.N(-0.125F, 0.3125F, -0.1875F);
      }
   }

   @Override
   public void N(class01421 var1) {
      this.i.N(var1);
      this.u.N(var1);
      var1.N(0.0F, 0.125F, 0.0F);
      var1.y(1.0625F, 1.0625F, 1.0625F);
   }

   @Override
   public class01686 R() {
      return this.u;
   }
}
