package minecraft;

public class class01176<S extends class08475> extends class06078<S> implements class06230, class06240<S> {
   private final class01686 N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;

   public class01176(class01686 var1) {
      super(var1);
      this.N = var1.y("head");
      this.y = this.N.y("hat");
      this.y.U = false;
      this.L = var1.y("arms");
      this.u = var1.y("left_leg");
      this.i = var1.y("right_leg");
      this.M = var1.y("left_arm");
      this.R = var1.y("right_arm");
   }

   public class01686 y() {
      return this.y;
   }

   public void N(class08475 var1, class07070 var2, class01421 var3) {
      this.field_54014.N(var3);
      this.N(var2).N(var3);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839 class04839x = class04839x.N("head", class04822.L().N(0, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), class04838.N(0.0F, 0.0F, 0.0F));
      class04839x.N("hat", class04822.L().N(32, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new class04834(0.45F)), class04838.N);
      class04839x.N("nose", class04822.L().N(24, 0).N(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), class04838.N(0.0F, -2.0F, 0.0F));
      class04839x.N(
         "body",
         class04822.L().N(16, 20).N(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).N(0, 38).N(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new class04834(0.5F)),
         class04838.N(0.0F, 0.0F, 0.0F)
      );
      class04839x.N(
            "arms",
            class04822.L().N(44, 22).N(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).N(40, 38).N(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
            class04838.N(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
         )
         .N("left_shoulder", class04822.L().N(44, 22).N().N(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), class04838.N);
      class04839x.N("right_leg", class04822.L().N(0, 22).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(-2.0F, 12.0F, 0.0F));
      class04839x.N("left_leg", class04822.L().N(0, 22).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(2.0F, 12.0F, 0.0F));
      class04839x.N("right_arm", class04822.L().N(40, 46).N(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(-5.0F, 2.0F, 0.0F));
      class04839x.N("left_arm", class04822.L().N(40, 46).N().N(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(5.0F, 2.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }

   private class01686 N(class07070 var1) {
      return var1 == class07070.field_6182 ? this.M : this.R;
   }

   public void method_2819(S var1) {
      super.method_2819(var1);
      this.N.R = var1.D * (float) (Math.PI / 180.0);
      this.N.i = var1.h * (float) (Math.PI / 180.0);
      if (var1.y) {
         this.R.i = (float) (-Math.PI / 5);
         this.R.R = 0.0F;
         this.R.M = 0.0F;
         this.M.i = (float) (-Math.PI / 5);
         this.M.R = 0.0F;
         this.M.M = 0.0F;
         this.i.i = -1.4137167F;
         this.i.R = (float) (Math.PI / 10);
         this.i.M = 0.07853982F;
         this.u.i = -1.4137167F;
         this.u.R = (float) (-Math.PI / 10);
         this.u.M = -0.07853982F;
      } else {
         float f = var1.Ny;
         float f1 = var1.NN;
         this.R.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 2.0F * f * 0.5F;
         this.R.R = 0.0F;
         this.R.M = 0.0F;
         this.M.i = class04995.P(f1 * 0.6662F) * 2.0F * f * 0.5F;
         this.M.R = 0.0F;
         this.M.M = 0.0F;
         this.i.i = class04995.P(f1 * 0.6662F) * 1.4F * f * 0.5F;
         this.i.R = 0.0F;
         this.i.M = 0.0F;
         this.u.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f * 0.5F;
         this.u.R = 0.0F;
         this.u.M = 0.0F;
      }

      class00703 class00703 = var1.F;
      if (class00703 == class00703.field_7211) {
         if (var1.u().i()) {
            class05402.N(this.M, this.R, true, var1);
         } else {
            class05402.N(this.R, this.M, var1.p, var1.C, var1.P);
         }
      } else if (class00703 == class00703.field_7212) {
         this.R.u = 0.0F;
         this.R.y = -5.0F;
         this.M.u = 0.0F;
         this.M.y = 5.0F;
         this.R.i = class04995.P(var1.P * 0.6662F) * 0.25F;
         this.M.i = class04995.P(var1.P * 0.6662F) * 0.25F;
         this.R.M = (float) (Math.PI * 3.0 / 4.0);
         this.M.M = (float) (-Math.PI * 3.0 / 4.0);
         this.R.R = 0.0F;
         this.M.R = 0.0F;
      } else if (class00703 == class00703.field_7208) {
         this.R.R = -0.1F + this.N.R;
         this.R.i = (float) (-Math.PI / 2) + this.N.i;
         this.M.i = -0.9424779F + this.N.i;
         this.M.R = this.N.R - 0.4F;
         this.M.M = (float) (Math.PI / 2);
      } else if (class00703 == class00703.field_7213) {
         class05402.N(this.R, this.M, this.N, true);
      } else if (class00703 == class00703.field_7210) {
         class05402.N(this.R, this.M, var1.A, var1.f, true);
      } else if (class00703 == class00703.field_19012) {
         this.R.u = 0.0F;
         this.R.y = -5.0F;
         this.R.i = class04995.P(var1.P * 0.6662F) * 0.05F;
         this.R.M = 2.670354F;
         this.R.R = 0.0F;
         this.M.u = 0.0F;
         this.M.y = 5.0F;
         this.M.i = class04995.P(var1.P * 0.6662F) * 0.05F;
         this.M.M = (float) (-Math.PI * 3.0 / 4.0);
         this.M.R = 0.0F;
      }

      boolean flag = class00703 == class00703.field_7207;
      this.L.U = flag;
      this.M.U = !flag;
      this.R.U = !flag;
   }

   @Override
   public class01686 R() {
      return this.N;
   }
}
