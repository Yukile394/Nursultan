package minecraft;

public class class01912 extends class06078<class08444> {
   private static final float N = 1.5F;
   private static final float y = 1.0F;
   private static final float L = 2.5F;
   private final class01686 u = this.field_54014.y("body");
   private final class01686 i = this.u.y("head");
   private final class01686 R = this.i.y("eyes");
   private final class01686 M = this.u.y("tongue");
   private final class01686 B = this.u.y("left_arm");
   private final class01686 Z = this.u.y("right_arm");
   private final class01686 z = this.field_54014.y("left_leg");
   private final class01686 U = this.field_54014.y("right_leg");
   private final class01686 E = this.u.y("croaking_body");
   private final class00094 W;
   private final class00094 m;
   private final class00094 P;
   private final class00094 s;
   private final class00094 T;
   private final class00094 b;

   public class01912(class01686 var1) {
      super(var1.y("root"));
      this.W = class04375.L.N(var1);
      this.m = class04375.N.N(var1);
      this.P = class04375.u.N(var1);
      this.s = class04375.i.N(var1);
      this.T = class04375.y.N(var1);
      this.b = class04375.R.N(var1);
   }

   public void method_2819(class08444 var1) {
      super.method_2819(var1);
      this.W.N(var1.y, var1.P);
      this.m.N(var1.L, var1.P);
      this.P.N(var1.u, var1.P);
      if (var1.N) {
         this.s.N(var1.NN, var1.Ny, 1.0F, 2.5F);
      } else {
         this.T.N(var1.NN, var1.Ny, 1.5F, 2.5F);
      }

      this.b.N(var1.i, var1.P);
      this.E.U = var1.L.y();
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xxx = class04792.N().N("root", class04822.L(), class04838.N(0.0F, 24.0F, 0.0F));
      class04839 class04839x = class04839xxx.N(
         "body",
         class04822.L().N(3, 1).N(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).N(23, 22).N(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F),
         class04838.N(0.0F, -2.0F, 4.0F)
      );
      class04839 class04839xx = class04839x.N(
            "head",
            class04822.L().N(23, 13).N(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).N(0, 13).N(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F),
            class04838.N(0.0F, -2.0F, -1.0F)
         )
         .N("eyes", class04822.L(), class04838.N(-0.5F, 0.0F, 2.0F));
      class04839xx.N("right_eye", class04822.L().N(0, 0).N(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), class04838.N(-1.5F, -3.0F, -6.5F));
      class04839xx.N("left_eye", class04822.L().N(0, 5).N(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), class04838.N(2.5F, -3.0F, -6.5F));
      class04839x.N("croaking_body", class04822.L().N(26, 5).N(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new class04834(-0.1F)), class04838.N(0.0F, -1.0F, -5.0F));
      class04839 class04839xxx = class04839x.N("tongue", class04822.L().N(17, 13).N(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), class04838.N(0.0F, -1.01F, 1.0F));
      class04839x.N("left_arm", class04822.L().N(0, 32).N(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), class04838.N(4.0F, -1.0F, -6.5F))
         .N("left_hand", class04822.L().N(18, 40).N(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), class04838.N(0.0F, 3.0F, -1.0F));
      class04839x.N("right_arm", class04822.L().N(0, 38).N(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), class04838.N(-4.0F, -1.0F, -6.5F))
         .N("right_hand", class04822.L().N(2, 40).N(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), class04838.N(0.0F, 3.0F, 0.0F));
      class04839xxx.N("left_leg", class04822.L().N(14, 25).N(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), class04838.N(3.5F, -3.0F, 4.0F))
         .N("left_foot", class04822.L().N(2, 32).N(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), class04838.N(2.0F, 3.0F, 0.0F));
      class04839xxx.N("right_leg", class04822.L().N(0, 25).N(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), class04838.N(-3.5F, -3.0F, 4.0F))
         .N("right_foot", class04822.L().N(18, 32).N(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), class04838.N(-2.0F, 3.0F, 0.0F));
      return class04806.N(class04792, 48, 48);
   }
}
