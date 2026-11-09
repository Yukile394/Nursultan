package minecraft;

import java.util.List;

public class class02721 extends class01188<class08468> {
   protected static final String m = "left_sleeve";
   protected static final String P = "right_sleeve";
   protected static final String s = "left_pants";
   protected static final String T = "right_pants";
   private final List<class01686> G;
   public final class01686 b;
   public final class01686 j;
   public final class01686 v;
   public final class01686 n;
   public final class01686 t;
   private final boolean l;

   public class02721(class01686 var1, boolean var2) {
      super(var1, class06851::z);
      this.l = var2;
      this.b = this.U.y("left_sleeve");
      this.j = this.z.y("right_sleeve");
      this.v = this.W.y("left_pants");
      this.n = this.E.y("right_pants");
      this.t = this.Z.y("jacket");
      this.G = List.of(this.M, this.Z, this.U, this.z, this.W, this.E);
   }

   public class01686 N(class06069 var1) {
      return class07536.N_77(this.G, var1);
   }

   public void N(class08468 var1, class07070 var2, class01421 var3) {
      this.method_63512().N(var3);
      class01686 class01686 = this.N(var2);
      if (this.l) {
         float f = 0.5F * (var2 == class07070.field_6183 ? 1 : -1);
         class01686.y += f;
         class01686.N(var3);
         class01686.y -= f;
      } else {
         class01686.N(var3);
      }
   }

   public static class04792 N(class04834 var0, boolean var1) {
      class04792 class04792 = class01188.N(var0, 0.0F);
      class04839 class04839xxxxxx = class04792.N();
      float f = 0.25F;
      if (var1) {
         class04839 class04839x = class04839xxxxxx.N(
            "left_arm", class04822.L().N(32, 48).N(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var0), class04838.N(5.0F, 2.0F, 0.0F)
         );
         class04839 class04839xx = class04839xxxxxx.N(
            "right_arm", class04822.L().N(40, 16).N(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var0), class04838.N(-5.0F, 2.0F, 0.0F)
         );
         class04839x.N("left_sleeve", class04822.L().N(48, 48).N(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
         class04839xx.N("right_sleeve", class04822.L().N(40, 32).N(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
      } else {
         class04839 class04839x = class04839xxxxxx.N(
            "left_arm", class04822.L().N(32, 48).N(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(5.0F, 2.0F, 0.0F)
         );
         class04839 class04839xx = class04839xxxxxx.y("right_arm");
         class04839x.N("left_sleeve", class04822.L().N(48, 48).N(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
         class04839xx.N("right_sleeve", class04822.L().N(40, 32).N(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
      }

      class04839 class04839x = class04839xxxxxx.N(
         "left_leg", class04822.L().N(16, 48).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(1.9F, 12.0F, 0.0F)
      );
      class04839 class04839xx = class04839xxxxxx.y("right_leg");
      class04839x.N("left_pants", class04822.L().N(0, 48).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
      class04839xx.N("right_pants", class04822.L().N(0, 32).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
      class04839xxxxxx.y("body").N("jacket", class04822.L().N(16, 32).N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var0.N(0.25F)), class04838.N);
      return class04792;
   }

   public static class08118<class04792> N(class04834 var0, class04834 var1) {
      return class01188.y(var0, var1).N(var0x -> {
         class04839 class04839xxxx = var0x.N();
         class04839 class04839x = class04839xxxx.y("left_arm");
         class04839 class04839xx = class04839xxxx.y("right_arm");
         class04839x.N("left_sleeve", class04822.L(), class04838.N);
         class04839xx.N("right_sleeve", class04822.L(), class04838.N);
         class04839 class04839xxx = class04839xxxx.y("left_leg");
         class04839 class04839xxxx = class04839xxxx.y("right_leg");
         class04839xxx.N("left_pants", class04822.L(), class04838.N);
         class04839xxxx.N("right_pants", class04822.L(), class04838.N);
         class04839xxxx.y("body").N("jacket", class04822.L(), class04838.N);
         return (class04792)var0x;
      });
   }

   public void method_2819(class08468 var1) {
      boolean flag = !var1.f;
      this.Z.U = flag;
      this.z.U = flag;
      this.U.U = flag;
      this.E.U = flag;
      this.W.U = flag;
      this.B.U = var1.C;
      this.t.U = var1.S;
      this.v.U = var1.Nj;
      this.n.U = var1.Nv;
      this.b.U = var1.Nn;
      this.j.U = var1.Nt;
      super.method_2819(var1);
   }

   @Override
   public void N(boolean var1) {
      super.N(var1);
      this.b.U = var1;
      this.j.U = var1;
      this.v.U = var1;
      this.n.U = var1;
      this.t.U = var1;
   }
}
