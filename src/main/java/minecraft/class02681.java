package minecraft;

public class class02681 extends class02153<class08793> {
   private final class01686 m;

   public static class04806 L() {
      class04792 class04792 = class01188.N(class04834.N, 0.0F);
      class04839 class04839x = class04792.N();
      class02153.N(class04839x);
      class04839 class04839x = class04839x.y("head").N("mushrooms", class04822.L(), class04838.N);
      class04839x.N(
         "red_mushroom_1", class04822.L().N(50, 16).N(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F), class04838.N(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
      );
      class04839x.N(
         "red_mushroom_2",
         class04822.L().N(50, 16).N(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         class04838.N(3.0F, -8.0F, 3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      class04839x.N(
         "brown_mushroom_1",
         class04822.L().N(50, 22).N(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         class04838.N(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
      );
      class04839x.N(
         "brown_mushroom_2",
         class04822.L().N(50, 22).N(-3.0F, -3.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         class04838.N(-3.0F, -8.0F, -3.0F, 0.0F, (float) (Math.PI * 3.0 / 4.0), 0.0F)
      );
      class04839x.N(
         "brown_mushroom_3",
         class04822.L().N(50, 28).N(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         class04838.N(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI / 4))
      );
      class04839x.N(
         "brown_mushroom_4",
         class04822.L().N(50, 28).N(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F),
         class04838.N(-2.0F, -1.0F, 4.0F, (float) (-Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 4.0))
      );
      return class04806.N(class04792, 64, 32);
   }

   public class02681(class01686 var1) {
      super(var1);
      this.m = var1.y("head").y("mushrooms");
   }

   public void method_2819(class08793 var1) {
      super.method_2819((class08793)var1);
      this.m.U = !var1.N;
   }
}
