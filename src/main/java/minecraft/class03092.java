package minecraft;

import java.util.Set;

public class class03092 extends class04532<class08478> {
   public static final class02415 N = new class02441(true, 19.0F, 1.0F, 2.5F, 2.0F, 24.0F, Set.of("head"));

   public class03092(class01686 var1) {
      super(var1);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839 class04839x = class04839x.N(
         "head",
         class04822.L()
            .N(2, 61)
            .N("right ear", -6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .N(2, 61)
            .N()
            .N("left ear", 2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F)
            .N(23, 52)
            .N("goatee", -0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
         class04838.N(1.0F, 14.0F, 0.0F)
      );
      class04839x.N("left_horn", class04822.L().N(12, 55).N(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), class04838.N(0.0F, 0.0F, 0.0F));
      class04839x.N("right_horn", class04822.L().N(12, 55).N(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F), class04838.N(0.0F, 0.0F, 0.0F));
      class04839x.N("nose", class04822.L().N(34, 46).N(-3.0F, -4.0F, -8.0F, 5.0F, 7.0F, 10.0F), class04838.N(0.0F, -8.0F, -8.0F, 0.9599F, 0.0F, 0.0F));
      class04839x.N(
         "body",
         class04822.L().N(1, 1).N(-4.0F, -17.0F, -7.0F, 9.0F, 11.0F, 16.0F).N(0, 28).N(-5.0F, -18.0F, -8.0F, 11.0F, 14.0F, 11.0F),
         class04838.N(0.0F, 24.0F, 0.0F)
      );
      class04839x.N("left_hind_leg", class04822.L().N(36, 29).N(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), class04838.N(1.0F, 14.0F, 4.0F));
      class04839x.N("right_hind_leg", class04822.L().N(49, 29).N(0.0F, 4.0F, 0.0F, 3.0F, 6.0F, 3.0F), class04838.N(-3.0F, 14.0F, 4.0F));
      class04839x.N("left_front_leg", class04822.L().N(49, 2).N(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), class04838.N(1.0F, 14.0F, -6.0F));
      class04839x.N("right_front_leg", class04822.L().N(35, 2).N(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F), class04838.N(-3.0F, 14.0F, -6.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08478 var1) {
      super.method_2819(var1);
      this.y.y("left_horn").U = var1.N;
      this.y.y("right_horn").U = var1.y;
      if (var1.L != 0.0F) {
         this.y.i = var1.L;
      }
   }
}
