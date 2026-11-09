package minecraft;

import java.util.Objects;

public abstract class class02855<T extends class07504, S extends class08454> extends class04507<T, S> {
   private static final class01894 y = class01894.y("textures/entity/minecart.png");
   private static final float L = 0.75F;
   protected final class05539 N;

   public class02855(class04832 var1, class01134 var2) {
      super(var1);
      this.field_4673 = 0.7F;
      this.N = new class05539(var1.N(var2));
   }

   private static <S extends class08454> void y(S var0, class01421 var1) {
      double d0 = var0.E;
      double d1 = var0.W;
      double d2 = var0.m;
      float f = var0.N;
      float f1 = var0.y;
      if (var0.I != null && var0.J != null && var0.o != null) {
         class06889 class06889xx = var0.J;
         class06889 class06889x = var0.o;
         var1.N(var0.I.M - d0, (class06889xx.B + class06889x.B) / 2.0 - d1, var0.I.Z - d2);
         class06889 class06889xx = class06889x.y(-class06889xx.M, -class06889xx.B, -class06889xx.Z);
         if (class06889xx.M() != 0.0) {
            class06889xx = class06889xx.u();
            f1 = (float)(Math.atan2(class06889xx.Z, class06889xx.M) * 180.0 / Math.PI);
            f = (float)(Math.atan(class06889xx.B) * 73.0);
         }
      }

      var1.N(0.0F, 0.375F, 0.0F);
      var1.N(class02058.u.N(180.0F - f1));
      var1.N(class02058.R.N(-f));
   }

   public void method_3936(S var1, class01421 var2, class01237 var3, class06959 var4) {
      super.method_3936((S)var1, var2, var3, var4);
      var2.N();
      long i = var1.L;
      float f = (((float)(i >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float f1 = (((float)(i >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float f2 = (((float)(i >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      var2.N(f, f1, f2);
      if (var1.Z) {
         N(var1, var2);
      } else {
         y(var1, var2);
      }

      float f3 = var1.i;
      if (f3 > 0.0F) {
         var2.N(class02058.y.N(class04995.m(f3) * f3 * var1.R / 10.0F * var1.u));
      }

      class00500 class00500 = var1.B;
      if (class00500.b() != class06898.field_11455) {
         var2.N();
         var2.y(0.75F, 0.75F, 0.75F);
         var2.N(-0.5F, (var1.M - 8) / 16.0F, 0.5F);
         var2.N(class02058.u.N(90.0F));
         this.N((S)var1, class00500, var2, var3, var1.G);
         var2.y();
      }

      var2.y(-1.0F, -1.0F, 1.0F);
      var3.N(this.N, var1, var2, this.N.method_23500(y), var1.G, class01384.u, var1.l, null);
      var2.y();
   }

   protected class00734 method_62358(T var1) {
      class00734 class00734 = super.method_62358((T)var1);
      return !var1.i().P() ? class00734.y(0.0, var1.M() * 0.75F / 16.0F, 0.0) : class00734;
   }

   public class06889 method_23169(S var1) {
      class06889 class06889 = super.method_23169((S)var1);
      return var1.Z && var1.g != null ? class06889.y(var1.g.M - var1.E, var1.g.B - var1.W, var1.g.Z - var1.m) : class06889;
   }

   protected void N(S var1, class00500 var2, class01421 var3, class01237 var4, int var5) {
      var4.N(var3, var2, var5, class01384.u, var1.l);
   }

   private static <S extends class08454> void N(S var0, class01421 var1) {
      var1.N(class02058.u.N(var0.y));
      var1.N(class02058.R.N(-var0.N));
      var1.N(0.0F, 0.375F, 0.0F);
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      if (var1.N() instanceof class02726 class02726) {
         N(var1, class02726, var2, var3);
         var2.Z = true;
      } else if (var1.N() instanceof class02757 class02757) {
         N(var1, class02757, var2, var3);
         var2.Z = false;
      }

      long i = var1.method_5628() * 493286711L;
      var2.L = i * i * 4392167121L + i * 98761L;
      var2.i = var1.G() - var3;
      var2.u = var1.l();
      var2.R = Math.max(var1.t() - var3, 0.0F);
      var2.M = var1.M();
      var2.B = var1.i();
   }

   private static <T extends class07504, S extends class08454> void N(T var0, class02757 var1, S var2, float var3) {
      float f = 0.3F;
      var2.N = var0.method_61414(var3);
      var2.y = var0.method_61415(var3);
      double d0 = var2.E;
      double d1 = var2.W;
      double d2 = var2.m;
      class06889 class06889xx = var1.L(d0, d1, d2);
      if (class06889xx != null) {
         var2.I = class06889xx;
         class06889 class06889x = var1.N(d0, d1, d2, 0.3F);
         class06889 class06889xx = var1.N(d0, d1, d2, -0.3F);
         var2.J = Objects.requireNonNullElse(class06889x, class06889xx);
         var2.o = Objects.requireNonNullElse(class06889xx, class06889xx);
      } else {
         var2.I = null;
         var2.J = null;
         var2.o = null;
      }
   }

   private static <T extends class07504, S extends class08454> void N(T var0, class02726 var1, S var2, float var3) {
      if (var1.P()) {
         var2.g = var1.i(var3);
         var2.N = var1.L(var3);
         var2.y = var1.u(var3);
      } else {
         var2.g = null;
         var2.N = var0.method_36455();
         var2.y = var0.method_36454();
      }
   }
}
