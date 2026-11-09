package minecraft;

public class class02450<S extends class08467> extends class01188<S> {
   private static final String n = "left_sleeve";
   private static final String t = "right_sleeve";
   private static final String G = "left_pants";
   private static final String l = "right_pants";
   public final class01686 m = this.U.y("left_sleeve");
   public final class01686 P = this.z.y("right_sleeve");
   public final class01686 s = this.W.y("left_pants");
   public final class01686 T = this.E.y("right_pants");
   public final class01686 b = this.Z.y("jacket");
   public final class01686 j = this.M.y("right_ear");
   public final class01686 v = this.M.y("left_ear");

   public class02450(class01686 var1) {
      super(var1, class06851::z);
   }

   @Override
   public void method_2819(S var1) {
      super.method_2819(var1);
      float f = var1.NN;
      float f1 = var1.Ny;
      float f2 = (float) (Math.PI / 6);
      float f3 = var1.P * 0.1F + f * 0.5F;
      float f4 = 0.08F + f1 * 0.4F;
      this.v.M = (float) (-Math.PI / 6) - class04995.P(f3 * 1.2F) * f4;
      this.j.M = (float) (Math.PI / 6) + class04995.P(f3) * f4;
   }

   @Override
   public void N(boolean var1) {
      super.N(var1);
      this.m.U = var1;
      this.P.U = var1;
      this.s.U = var1;
      this.T.U = var1;
      this.b.U = var1;
   }

   public static class04792 N(class04834 var0) {
      class04792 class04792 = class02721.N(var0, false);
      class04792.N().N("body", class04822.L().N(16, 16).N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var0), class04838.N);
      N(var0, class04792).N("hat");
      return class04792;
   }

   public static class08118<class04792> N(class04834 var0, class04834 var1) {
      return class02721.N(var0, var1).N(var0x -> {
         class04839 class04839 = var0x.N().y("head");
         class04839.N("left_ear", class04822.L(), class04838.N);
         class04839.N("right_ear", class04822.L(), class04838.N);
         return (class04792)var0x;
      });
   }

   public static class04839 N(class04834 var0, class04792 var1) {
      class04839 class04839 = var1.N()
         .N(
            "head",
            class04822.L()
               .N(0, 0)
               .N(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, var0)
               .N(31, 1)
               .N(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, var0)
               .N(2, 4)
               .N(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var0)
               .N(2, 0)
               .N(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var0),
            class04838.N
         );
      class04839.N(
         "left_ear", class04822.L().N(51, 6).N(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var0), class04838.N(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6))
      );
      class04839.N(
         "right_ear",
         class04822.L().N(39, 6).N(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var0),
         class04838.N(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6))
      );
      return class04839;
   }
}
