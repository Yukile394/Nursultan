package minecraft;

public class class03761 extends class00271 {
   public class03761(class01686 var1) {
      super(var1);
   }

   public static class04806 y() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      N(class04839);
      class04839.N(
         "chest_bottom",
         class04822.L().N(0, 76).N(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F),
         class04838.N(-2.0F, -10.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F)
      );
      class04839.N(
         "chest_lid", class04822.L().N(0, 59).N(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), class04838.N(-2.0F, -14.1F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F)
      );
      class04839.N(
         "chest_lock", class04822.L().N(0, 59).N(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), class04838.N(-1.0F, -11.1F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F)
      );
      return class04806.N(class04792, 128, 128);
   }

   private static void N(class04839 var0) {
      var0.N(
         "bottom",
         class04822.L().N(0, 0).N(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).N(0, 0).N(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         class04838.N(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      byte b0 = 20;
      byte b1 = 7;
      byte b2 = 6;
      float f = -5.0F;
      var0.N(
         "left_paddle",
         class04822.L().N(0, 24).N(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).N(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         class04838.N(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      var0.N(
         "right_paddle",
         class04822.L().N(40, 24).N(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).N(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         class04838.N(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      N(class04792.N());
      return class04806.N(class04792, 128, 64);
   }
}
