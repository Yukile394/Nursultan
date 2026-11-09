package minecraft;

public class class03090<S extends class08283> extends class01188<S> implements class06275<S> {
   public class03090(class01686 var1) {
      super(var1);
   }

   public static class04806 y() {
      return N().N(var0 -> {
         var0.N().N("head").N();
         return var0;
      });
   }

   public void N(class08283 var1, class01421 var2) {
      this.N(var1, class07070.field_6183, var2);
   }

   public static class08118<class04806> N(class04834 var0, class04834 var1) {
      return N(class03090::N, var0, var1).N(var0x -> class04806.N(var0x, 64, 32));
   }

   private static class04792 N(class04834 var0) {
      class04792 class04792 = class01188.N(var0, 0.0F);
      class04839 class04839x = class04792.N();
      class04839 class04839x = class04839x.N("head", class04822.L().N(0, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0), class04838.N);
      class04839x.N("body", class04822.L().N(16, 16).N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var0.N(0.1F)), class04838.N);
      class04839x.N("right_leg", class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(0.1F)), class04838.N(-2.0F, 12.0F, 0.0F));
      class04839x.N("left_leg", class04822.L().N(0, 16).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(0.1F)), class04838.N(2.0F, 12.0F, 0.0F));
      class04839x.y("hat").N("hat_rim", class04822.L(), class04838.N);
      return class04792;
   }

   public void method_2819(S var1) {
      super.method_2819(var1);
      class05402.N(this.U, this.z, var1.N, var1);
   }

   public static class04806 N() {
      class04792 class04792 = class01188.N(class04834.N, 0.0F);
      class04839 class04839 = class04792.N();
      class04839.N("head", new class04822().N(0, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).N(24, 0).N(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), class04838.N)
         .N("hat", class04822.L().N(32, 0).N(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new class04834(0.5F)), class04838.N)
         .N("hat_rim", class04822.L().N(30, 47).N(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), class04838.y((float) (-Math.PI / 2), 0.0F, 0.0F));
      class04839.N(
         "body",
         class04822.L().N(16, 20).N(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).N(0, 38).N(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new class04834(0.05F)),
         class04838.N
      );
      class04839.N("right_arm", class04822.L().N(44, 22).N(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(-5.0F, 2.0F, 0.0F));
      class04839.N("left_arm", class04822.L().N(44, 22).N().N(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(5.0F, 2.0F, 0.0F));
      class04839.N("right_leg", class04822.L().N(0, 22).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(-2.0F, 12.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(0, 22).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), class04838.N(2.0F, 12.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }
}
