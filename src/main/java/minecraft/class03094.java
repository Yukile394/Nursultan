package minecraft;

public class class03094 extends class06078<class08257> implements class06230, class06275<class08257> {
   public static final class02415 N = class02415.N(0.5F);
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;

   public class03094(class01686 var1) {
      super(var1);
      this.y = var1.y("head");
      this.L = var1.y("right_leg");
      this.u = var1.y("left_leg");
      this.i = var1.y("arms");
   }

   public static class04792 y() {
      class04792 class04792 = N();
      class04792.N().N("head").N();
      return class04792;
   }

   public void N(class08257 var1, class01421 var2) {
      this.field_54014.N(var2);
      this.i.N(var2);
   }

   public void method_2819(class08257 var1) {
      super.method_2819(var1);
      this.y.R = var1.D * (float) (Math.PI / 180.0);
      this.y.i = var1.h * (float) (Math.PI / 180.0);
      if (var1.N) {
         this.y.M = 0.3F * class04995.m(0.45F * var1.P);
         this.y.i = 0.4F;
      } else {
         this.y.M = 0.0F;
      }

      this.L.i = class04995.P(var1.NN * 0.6662F) * 1.4F * var1.Ny * 0.5F;
      this.u.i = class04995.P(var1.NN * 0.6662F + (float) Math.PI) * 1.4F * var1.Ny * 0.5F;
      this.L.R = 0.0F;
      this.u.R = 0.0F;
   }

   public static class04792 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      float f = 0.5F;
      class04839 class04839x = class04839x.N("head", class04822.L().N(0, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), class04838.N);
      class04839x.N("hat", class04822.L().N(32, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new class04834(0.51F)), class04838.N)
         .N("hat_rim", class04822.L().N(30, 47).N(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), class04838.y((float) (-Math.PI / 2), 0.0F, 0.0F));
      class04839x.N("nose", class04822.L().N(24, 0).N(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), class04838.N(0.0F, -2.0F, 0.0F));
      class04839x.N("body", class04822.L().N(16, 20).N(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), class04838.N)
         .N("jacket", class04822.L().N(0, 38).N(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new class04834(0.5F)), class04838.N);
      class04839x.N(
         "arms",
         class04822.L()
            .N(44, 22)
            .N(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .N(44, 22)
            .N(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .N(40, 38)
            .N(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         class04838.N(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      class04839x.N("right_leg", class04822.L().N(0, 22).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(-2.0F, 12.0F, 0.0F));
      class04839x.N("left_leg", class04822.L().N(0, 22).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(2.0F, 12.0F, 0.0F));
      return class04792;
   }

   @Override
   public class01686 R() {
      return this.y;
   }
}
