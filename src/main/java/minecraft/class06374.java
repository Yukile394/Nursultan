package minecraft;

public class class06374<T extends class08785> extends class01188<T> {
   public class06374(class01686 var1) {
      super(var1);
   }

   public void method_2819(T var1) {
      super.method_2819((T)var1);
      this.M.U = true;
      this.z.i *= 0.5F;
      this.U.i *= 0.5F;
      this.E.i *= 0.5F;
      this.W.i *= 0.5F;
      float f = 0.4F;
      this.z.i = class04995.N(this.z.i, -0.4F, 0.4F);
      this.U.i = class04995.N(this.U.i, -0.4F, 0.4F);
      this.E.i = class04995.N(this.E.i, -0.4F, 0.4F);
      this.W.i = class04995.N(this.W.i, -0.4F, 0.4F);
      if (var1.y != null) {
         this.z.i = -0.5F;
         this.U.i = -0.5F;
         this.z.M = 0.05F;
         this.U.M = -0.05F;
      }

      if (var1.N) {
         float f1 = 5.0F;
         this.M.L -= 5.0F;
         this.B.L += 5.0F;
      }
   }

   public static class04806 N() {
      float f = -14.0F;
      class04792 class04792 = class01188.N(class04834.N, -14.0F);
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), class04838.N(0.0F, -13.0F, 0.0F))
         .N("hat", class04822.L().N(0, 16).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new class04834(-0.5F)), class04838.N);
      class04839.N("body", class04822.L().N(32, 16).N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), class04838.N(0.0F, -14.0F, 0.0F));
      class04839.N("right_arm", class04822.L().N(56, 0).N(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), class04838.N(-5.0F, -12.0F, 0.0F));
      class04839.N("left_arm", class04822.L().N(56, 0).N().N(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F), class04838.N(5.0F, -12.0F, 0.0F));
      class04839.N("right_leg", class04822.L().N(56, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), class04838.N(-2.0F, -5.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(56, 0).N().N(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F), class04838.N(2.0F, -5.0F, 0.0F));
      return class04806.N(class04792, 64, 32);
   }
}
