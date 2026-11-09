package minecraft;

public class class06738 extends class06078<class06729> {
   private static final float L = 2.0F;
   private static final float u = 3.0F;
   private static final float i = 0.2F;
   private static final float R = 5.0F;
   protected final class01686 N;
   protected final class01686 y;
   private final class00094 M;

   public static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N().N("root", class04822.L(), class04838.N(0.0F, 29.0F, -6.0F));
      class04839x.N(
         "shell",
         class04822.L()
            .N(0, 0)
            .N(-7.0F, -10.0F, -7.0F, 14.0F, 10.0F, 16.0F, new class04834(0.0F))
            .N(0, 26)
            .N(-7.0F, 0.0F, -7.0F, 14.0F, 8.0F, 20.0F, new class04834(0.0F))
            .N(48, 26)
            .N(-7.0F, 0.0F, 6.0F, 14.0F, 8.0F, 0.0F, new class04834(0.0F)),
         class04838.N(0.0F, -13.0F, 5.0F)
      );
      class04839 class04839x = class04839x.N(
         "body",
         class04822.L()
            .N(0, 54)
            .N(-5.0F, -4.51F, -3.0F, 10.0F, 8.0F, 14.0F, new class04834(0.0F))
            .N(0, 76)
            .N(-5.0F, -4.51F, 7.0F, 10.0F, 8.0F, 0.0F, new class04834(0.0F)),
         class04838.N(0.0F, -8.5F, 12.3F)
      );
      class04839x.N("upper_mouth", class04822.L().N(54, 54).N(-5.0F, -2.0F, 0.0F, 10.0F, 4.0F, 4.0F, new class04834(-0.001F)), class04838.N(0.0F, -2.51F, 7.0F));
      class04839x.N("inner_mouth", class04822.L().N(54, 70).N(-3.0F, -2.0F, -0.5F, 6.0F, 4.0F, 4.0F, new class04834(0.0F)), class04838.N(0.0F, -0.51F, 7.5F));
      class04839x.N("lower_mouth", class04822.L().N(54, 62).N(-5.0F, -1.98F, 0.0F, 10.0F, 4.0F, 4.0F, new class04834(-0.001F)), class04838.N(0.0F, 1.49F, 7.0F));
      return class04792;
   }

   public class06738(class01686 var1) {
      super(var1);
      this.y = var1.y("root");
      this.N = this.y.y("body");
      this.M = class06753.N.N(var1);
   }

   public static class04806 u() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N().N("root", class04822.L(), class04838.N(-0.5F, 28.0F, -0.5F));
      class04839x.N(
         "shell",
         class04822.L()
            .N(0, 0)
            .N(-6.0F, -4.0F, -1.0F, 7.0F, 4.0F, 7.0F, new class04834(0.0F))
            .N(0, 11)
            .N(-6.0F, 0.0F, -1.0F, 7.0F, 4.0F, 9.0F, new class04834(0.0F))
            .N(23, 11)
            .N(-6.0F, 0.0F, 5.0F, 7.0F, 4.0F, 0.0F, new class04834(0.0F)),
         class04838.N(3.0F, -8.0F, -2.0F)
      );
      class04839 class04839x = class04839x.N(
         "body",
         class04822.L()
            .N(0, 24)
            .N(-2.5F, -3.01F, -1.0F, 5.0F, 4.0F, 7.0F, new class04834(0.0F))
            .N(0, 35)
            .N(-2.5F, -3.01F, 4.1F, 5.0F, 4.0F, 0.0F, new class04834(0.0F)),
         class04838.N(0.5F, -5.0F, 3.0F)
      );
      class04839x.N("upper_mouth", class04822.L().N(24, 24).N(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 2.0F, new class04834(-0.001F)), class04838.N(0.0F, -2.01F, 3.9F));
      class04839x.N("inner_mouth", class04822.L().N(24, 32).N(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new class04834(0.0F)), class04838.N(0.0F, -1.01F, 4.9F));
      class04839x.N("lower_mouth", class04822.L().N(24, 28).N(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 2.0F, new class04834(-0.001F)), class04838.N(0.0F, -0.01F, 3.9F));
      return class04806.N(class04792, 64, 64);
   }

   public static class04806 y() {
      return class04806.N(L(), 128, 128);
   }

   private void N(float var1, float var2) {
      var1 = class04995.N(var1, -10.0F, 10.0F);
      var2 = class04995.N(var2, -10.0F, 10.0F);
      this.N.R = var1 * (float) (Math.PI / 180.0);
      this.N.i = var2 * (float) (Math.PI / 180.0);
   }

   public void method_2819(class06729 var1) {
      super.method_2819(var1);
      this.N(var1.D, var1.h);
      this.M.N(var1.NN + var1.P / 5.0F, var1.Ny + 0.2F, 2.0F, 3.0F);
   }
}
