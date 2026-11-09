package minecraft;

import org.joml.Quaternionf;

public class class02454 extends class06078<class08792> {
   private static final String i = "outer_glass";
   private static final String R = "inner_glass";
   private static final String M = "base";
   private static final float B = (float)Math.sin(Math.PI / 4);
   public final class01686 N;
   public final class01686 y;
   public final class01686 L;
   public final class01686 u;

   public class02454(class01686 var1) {
      super(var1);
      this.N = var1.y("base");
      this.y = var1.y("outer_glass");
      this.L = this.y.y("inner_glass");
      this.u = this.L.y("cube");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float f = 0.875F;
      class04822 class04822 = class04822.L().N(0, 0).N(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      class04839.N("outer_glass", class04822, class04838.N(0.0F, 24.0F, 0.0F))
         .N("inner_glass", class04822, class04838.N.N(0.875F))
         .N("cube", class04822.L().N(32, 0).N(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), class04838.N.N(0.765625F));
      class04839.N("base", class04822.L().N(0, 16).N(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), class04838.N);
      return class04806.N(class04792, 64, 32);
   }

   public void method_2819(class08792 var1) {
      super.method_2819(var1);
      this.N.U = var1.N;
      float f = var1.P * 3.0F;
      float f1 = class03127.N(var1.P) * 16.0F;
      this.y.L += f1 / 2.0F;
      this.y.N(class02058.u.N(f).rotateAxis((float) (Math.PI / 3), B, 0.0F, B));
      this.L.N(new Quaternionf().setAngleAxis((float) (Math.PI / 3), B, 0.0F, B).rotateY(f * (float) (Math.PI / 180.0)));
      this.u.N(new Quaternionf().setAngleAxis((float) (Math.PI / 3), B, 0.0F, B).rotateY(f * (float) (Math.PI / 180.0)));
   }
}
