package minecraft;

public class class02153<S extends class08443> extends class01188<S> {
   public class02153(class01686 var1) {
      super(var1);
   }

   public static class04806 y() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "body",
         class04822.L()
            .N(16, 16)
            .N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F)
            .N(28, 0)
            .N(-4.0F, 10.0F, -2.0F, 8.0F, 1.0F, 4.0F)
            .N(16, 48)
            .N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new class04834(0.025F)),
         class04838.N(0.0F, 0.0F, 0.0F)
      );
      class04839.N(
            "head",
            class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F).N(0, 32).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new class04834(0.2F)),
            class04838.N(0.0F, 0.0F, 0.0F)
         )
         .N("hat", class04822.L(), class04838.N);
      class04839.N(
         "right_arm",
         class04822.L().N(40, 16).N(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F).N(42, 33).N(-1.55F, -2.025F, -1.5F, 3.0F, 12.0F, 3.0F),
         class04838.N(-5.5F, 2.0F, 0.0F)
      );
      class04839.N(
         "left_arm",
         class04822.L().N(56, 16).N(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F).N(40, 48).N(-1.45F, -2.025F, -1.5F, 3.0F, 12.0F, 3.0F),
         class04838.N(5.5F, 2.0F, 0.0F)
      );
      class04839.N(
         "right_leg",
         class04822.L().N(0, 16).N(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F).N(0, 49).N(-1.5F, -0.0F, -1.5F, 3.0F, 12.0F, 3.0F),
         class04838.N(-2.0F, 12.0F, 0.0F)
      );
      class04839.N(
         "left_leg",
         class04822.L().N(0, 16).N(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F).N(4, 49).N(-1.5F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F),
         class04838.N(2.0F, 12.0F, 0.0F)
      );
      return class04806.N(class04792, 64, 64);
   }

   public void N(class08443 var1, class07070 var2, class01421 var3) {
      this.method_63512().N(var3);
      float f = var2 == class07070.field_6183 ? 1.0F : -1.0F;
      class01686 class01686 = this.N(var2);
      class01686.y += f;
      class01686.N(var3);
      class01686.y -= f;
   }

   public static class04806 N() {
      class04792 class04792 = class01188.N(class04834.N, 0.0F);
      N(class04792.N());
      return class04806.N(class04792, 64, 32);
   }

   protected static void N(class04839 var0) {
      var0.N("right_arm", class04822.L().N(40, 16).N(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), class04838.N(-5.0F, 2.0F, 0.0F));
      var0.N("left_arm", class04822.L().N(40, 16).N().N(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), class04838.N(5.0F, 2.0F, 0.0F));
      var0.N("right_leg", class04822.L().N(0, 16).N(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), class04838.N(-2.0F, 12.0F, 0.0F));
      var0.N("left_leg", class04822.L().N(0, 16).N().N(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), class04838.N(2.0F, 12.0F, 0.0F));
   }

   public void method_2819(S var1) {
      super.method_2819(var1);
      if (var1.y && !var1.p) {
         float f = var1.NX;
         float f1 = class04995.m(f * (float) Math.PI);
         float f2 = class04995.m((1.0F - (1.0F - f) * (1.0F - f)) * (float) Math.PI);
         this.z.M = 0.0F;
         this.U.M = 0.0F;
         this.z.R = -(0.1F - f1 * 0.6F);
         this.U.R = 0.1F - f1 * 0.6F;
         this.z.i = (float) (-Math.PI / 2);
         this.U.i = (float) (-Math.PI / 2);
         this.z.i -= f1 * 1.2F - f2 * 0.4F;
         this.U.i -= f1 * 1.2F - f2 * 0.4F;
         class05402.N(this.z, this.U, var1.P);
      }
   }
}
