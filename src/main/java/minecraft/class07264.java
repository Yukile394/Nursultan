package minecraft;

import org.jspecify.annotations.Nullable;

public class class07264 extends class00394 implements class07061 {
   private static final class00392 P = class00392.L("container.enchant");
   public int N;
   public float y;
   public float L;
   public float u;
   public float i;
   public float R;
   public float M;
   public float B;
   public float Z;
   public float m;
   private static final class06069 s = class06069.u();
   @Nullable
   private class00392 T;

   @Nullable
   @Override
   public class00392 method_5797() {
      return this.T;
   }

   @Override
   public class00392 method_5477() {
      return this.T != null ? this.T : P;
   }

   public class07264(class07209 var1, class00500 var2) {
      super(class00404.field_11912, var1, var2);
   }

   @Override
   public void y(class08329 var1) {
      var1.L("CustomName");
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.T = var1.method_58694(class02484.B);
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.B, this.T);
   }

   public void N(@Nullable class00392 var1) {
      this.T = var1;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.y("CustomName", class03748.N, this.T);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.T = N_10(var1, "CustomName");
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07264 var3) {
      var3.M = var3.R;
      var3.Z = var3.B;
      class08036 class08036 = var0.N(var1.method_10263() + 0.5, var1.method_10264() + 0.5, var1.method_10260() + 0.5, 3.0, false);
      if (class08036 != null) {
         double d0 = class08036.method_23317() - (var1.method_10263() + 0.5);
         double d1 = class08036.method_23321() - (var1.method_10260() + 0.5);
         var3.m = (float)class04995.u(d1, d0);
         var3.R += 0.1F;
         if (var3.R < 0.5F || s.y(40) == 0) {
            float f1 = var3.u;

            do {
               var3.u = var3.u + (s.y(4) - s.y(4));
            } while (f1 == var3.u);
         }
      } else {
         var3.m += 0.02F;
         var3.R -= 0.1F;
      }

      while (var3.B >= (float) Math.PI) {
         var3.B -= (float) (Math.PI * 2);
      }

      while (var3.B < (float) -Math.PI) {
         var3.B += (float) (Math.PI * 2);
      }

      while (var3.m >= (float) Math.PI) {
         var3.m -= (float) (Math.PI * 2);
      }

      while (var3.m < (float) -Math.PI) {
         var3.m += (float) (Math.PI * 2);
      }

      float f2 = var3.m - var3.B;

      while (f2 >= (float) Math.PI) {
         f2 -= (float) (Math.PI * 2);
      }

      while (f2 < (float) -Math.PI) {
         f2 += (float) (Math.PI * 2);
      }

      var3.B += f2 * 0.4F;
      var3.R = class04995.N(var3.R, 0.0F, 1.0F);
      var3.N++;
      var3.L = var3.y;
      float f = (var3.u - var3.y) * 0.4F;
      float f3 = 0.2F;
      f = class04995.N(f, -0.2F, 0.2F);
      var3.i = var3.i + (f - var3.i) * 0.9F;
      var3.y = var3.y + var3.i;
   }
}
