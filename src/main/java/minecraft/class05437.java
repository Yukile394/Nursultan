package minecraft;

public class class05437 extends class00271 {
   private static final int N = 28;
   private static final int y = 32;
   private static final int L = 6;
   private static final int u = 20;
   private static final int i = 4;
   private static final String R = "water_patch";
   private static final String M = "back";
   private static final String B = "front";
   private static final String Z = "right";
   private static final String z = "left";

   public static class04806 L() {
      class04792 class04792 = new class04792();
      class04792.N()
         .N(
            "water_patch",
            class04822.L().N(0, 0).N(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F),
            class04838.N(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
         );
      return class04806.N(class04792, 0, 0);
   }

   public class05437(class01686 var1) {
      super(var1);
   }

   public static class04806 y() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      N(class04839);
      class04839.N(
         "chest_bottom", class04822.L().N(0, 76).N(0.0F, 0.0F, 0.0F, 12.0F, 8.0F, 12.0F), class04838.N(-2.0F, -5.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F)
      );
      class04839.N(
         "chest_lid", class04822.L().N(0, 59).N(0.0F, 0.0F, 0.0F, 12.0F, 4.0F, 12.0F), class04838.N(-2.0F, -9.0F, -6.0F, 0.0F, (float) (-Math.PI / 2), 0.0F)
      );
      class04839.N(
         "chest_lock", class04822.L().N(0, 59).N(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F), class04838.N(-1.0F, -6.0F, -1.0F, 0.0F, (float) (-Math.PI / 2), 0.0F)
      );
      return class04806.N(class04792, 128, 128);
   }

   private static void N(class04839 var0) {
      byte b0 = 16;
      byte b1 = 14;
      byte b2 = 10;
      var0.N("bottom", class04822.L().N(0, 0).N(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), class04838.N(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      var0.N(
         "back",
         class04822.L().N(0, 19).N(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F),
         class04838.N(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F)
      );
      var0.N("front", class04822.L().N(0, 27).N(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), class04838.N(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      var0.N("right", class04822.L().N(0, 35).N(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), class04838.N(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      var0.N("left", class04822.L().N(0, 43).N(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), class04838.N(0.0F, 4.0F, 9.0F));
      byte b3 = 20;
      byte b4 = 7;
      byte b5 = 6;
      float f = -5.0F;
      var0.N(
         "left_paddle",
         class04822.L().N(62, 0).N(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).N(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         class04838.N(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      var0.N(
         "right_paddle",
         class04822.L().N(62, 20).N(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).N(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         class04838.N(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      N(class04792.N());
      return class04806.N(class04792, 128, 64);
   }
}
