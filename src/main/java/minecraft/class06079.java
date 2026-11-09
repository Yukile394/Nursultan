package minecraft;

public class class06079 extends class06078<class08450> {
   private static final String N = "feather";
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;

   public class06079(class01686 var1) {
      super(var1);
      this.y = var1.y("body");
      this.L = var1.y("tail");
      this.u = var1.y("left_wing");
      this.i = var1.y("right_wing");
      this.R = var1.y("head");
      this.M = var1.y("left_leg");
      this.B = var1.y("right_leg");
   }

   public static class06067 N(class07654 var0) {
      if (var0.W()) {
         return class06067.field_3463;
      } else if (var0.Ng()) {
         return class06067.field_3466;
      } else {
         return var0.y() ? class06067.field_3462 : class06067.field_3465;
      }
   }

   private void N(class06067 var1) {
      switch (var1) {
         case field_3462:
            this.M.i += (float) (Math.PI * 2.0 / 9.0);
            this.B.i += (float) (Math.PI * 2.0 / 9.0);
         case field_3465:
         case field_3464:
         default:
            break;
         case field_3466:
            float f = 1.9F;
            this.R.L++;
            this.L.i += (float) (Math.PI / 6);
            this.L.L++;
            this.y.L++;
            this.u.M = -0.0873F;
            this.u.L++;
            this.i.M = 0.0873F;
            this.i.L++;
            this.M.L++;
            this.B.L++;
            this.M.i++;
            this.B.i++;
            break;
         case field_3463:
            this.M.M = (float) (-Math.PI / 9);
            this.B.M = (float) (Math.PI / 9);
      }
   }

   public void method_2819(class08450 var1) {
      super.method_2819(var1);
      this.N(var1.L);
      this.R.i = var1.h * (float) (Math.PI / 180.0);
      this.R.R = var1.D * (float) (Math.PI / 180.0);
      switch (var1.L) {
         case field_3465:
            this.M.i = this.M.i + class04995.P(var1.NN * 0.6662F) * 1.4F * var1.Ny;
            this.B.i = this.B.i + class04995.P(var1.NN * 0.6662F + (float) Math.PI) * 1.4F * var1.Ny;
         case field_3462:
         case field_3464:
         default:
            float f2 = var1.y * 0.3F;
            this.R.L += f2;
            this.L.i = this.L.i + class04995.P(var1.NN * 0.6662F) * 0.3F * var1.Ny;
            this.L.L += f2;
            this.y.L += f2;
            this.u.M = -0.0873F - var1.y;
            this.u.L += f2;
            this.i.M = 0.0873F + var1.y;
            this.i.L += f2;
            this.M.L += f2;
            this.B.L += f2;
         case field_3466:
            break;
         case field_3463:
            float f = class04995.P(var1.P);
            float f1 = class04995.m(var1.P);
            this.R.y += f;
            this.R.L += f1;
            this.R.i = 0.0F;
            this.R.R = 0.0F;
            this.R.M = class04995.m(var1.P) * 0.4F;
            this.y.y += f;
            this.y.L += f1;
            this.u.M = -0.0873F - var1.y;
            this.u.y += f;
            this.u.L += f1;
            this.i.M = 0.0873F + var1.y;
            this.i.y += f;
            this.i.L += f1;
            this.L.y += f;
            this.L.L += f1;
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839x.N("body", class04822.L().N(2, 8).N(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F), class04838.N(0.0F, 16.5F, -3.0F, 0.4937F, 0.0F, 0.0F));
      class04839x.N("tail", class04822.L().N(22, 1).N(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F), class04838.N(0.0F, 21.07F, 1.16F, 1.015F, 0.0F, 0.0F));
      class04839x.N(
         "left_wing", class04822.L().N(19, 8).N(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), class04838.N(1.5F, 16.94F, -2.76F, -0.6981F, (float) -Math.PI, 0.0F)
      );
      class04839x.N(
         "right_wing", class04822.L().N(19, 8).N(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F), class04838.N(-1.5F, 16.94F, -2.76F, -0.6981F, (float) -Math.PI, 0.0F)
      );
      class04839 class04839x = class04839x.N("head", class04822.L().N(2, 2).N(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F), class04838.N(0.0F, 15.69F, -2.76F));
      class04839x.N("head2", class04822.L().N(10, 0).N(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F), class04838.N(0.0F, -2.0F, -1.0F));
      class04839x.N("beak1", class04822.L().N(11, 7).N(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F), class04838.N(0.0F, -0.5F, -1.5F));
      class04839x.N("beak2", class04822.L().N(16, 7).N(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), class04838.N(0.0F, -1.75F, -2.45F));
      class04839x.N("feather", class04822.L().N(2, 18).N(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F), class04838.N(0.0F, -2.15F, 0.15F, -0.2214F, 0.0F, 0.0F));
      class04822 class04822 = class04822.L().N(14, 18).N(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      class04839x.N("left_leg", class04822, class04838.N(1.0F, 22.0F, -1.05F, -0.0299F, 0.0F, 0.0F));
      class04839x.N("right_leg", class04822, class04838.N(-1.0F, 22.0F, -1.05F, -0.0299F, 0.0F, 0.0F));
      return class04806.N(class04792, 32, 32);
   }
}
