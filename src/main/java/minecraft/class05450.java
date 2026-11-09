package minecraft;

public class class05450 extends class01000 {
   private static final String m = "right_body_stick";
   private static final String P = "left_body_stick";
   private static final String s = "shoulder_stick";
   private static final String T = "base_plate";
   private final class01686 b;
   private final class01686 j;
   private final class01686 v;
   private final class01686 n;

   public class05450(class01686 var1) {
      super(var1);
      this.b = var1.y("right_body_stick");
      this.j = var1.y("left_body_stick");
      this.v = var1.y("shoulder_stick");
      this.n = var1.y("base_plate");
      this.B.U = false;
   }

   public void N(class02777 var1, class07070 var2, class01421 var3) {
      class01686 class01686 = this.N(var2);
      boolean flag = class01686.U;
      class01686.U = true;
      super.N(var1, var2, var3);
      class01686.U = flag;
   }

   @Override
   public void method_2819(class02777 var1) {
      super.method_2819(var1);
      this.n.R = (float) (Math.PI / 180.0) * -var1.N;
      this.U.U = var1.F;
      this.z.U = var1.F;
      this.n.U = var1.A;
      this.b.i = (float) (Math.PI / 180.0) * var1.C.N();
      this.b.R = (float) (Math.PI / 180.0) * var1.C.y();
      this.b.M = (float) (Math.PI / 180.0) * var1.C.L();
      this.j.i = (float) (Math.PI / 180.0) * var1.C.N();
      this.j.R = (float) (Math.PI / 180.0) * var1.C.y();
      this.j.M = (float) (Math.PI / 180.0) * var1.C.L();
      this.v.i = (float) (Math.PI / 180.0) * var1.C.N();
      this.v.R = (float) (Math.PI / 180.0) * var1.C.y();
      this.v.M = (float) (Math.PI / 180.0) * var1.C.L();
   }

   public static class04806 N() {
      class04792 class04792 = class01188.N(class04834.N, 0.0F);
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), class04838.N(0.0F, 1.0F, 0.0F));
      class04839.N("body", class04822.L().N(0, 26).N(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), class04838.N);
      class04839.N("right_arm", class04822.L().N(24, 0).N(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), class04838.N(-5.0F, 2.0F, 0.0F));
      class04839.N("left_arm", class04822.L().N(32, 16).N().N(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), class04838.N(5.0F, 2.0F, 0.0F));
      class04839.N("right_leg", class04822.L().N(8, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), class04838.N(-1.9F, 12.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(40, 16).N().N(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), class04838.N(1.9F, 12.0F, 0.0F));
      class04839.N("right_body_stick", class04822.L().N(16, 0).N(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), class04838.N);
      class04839.N("left_body_stick", class04822.L().N(48, 16).N(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), class04838.N);
      class04839.N("shoulder_stick", class04822.L().N(0, 48).N(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), class04838.N);
      class04839.N("base_plate", class04822.L().N(0, 32).N(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), class04838.N(0.0F, 12.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }
}
