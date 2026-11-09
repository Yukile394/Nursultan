package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class03362 implements class03358<class00396, class00991> {
   public static final class08571 N = new class08571(class08626.N, "entity/conduit");
   public static final class05913 y = N.N("base");
   public static final class05913 L = N.N("cage");
   public static final class05913 u = N.N("wind");
   public static final class05913 i = N.N("wind_vertical");
   public static final class05913 R = N.N("open_eye");
   public static final class05913 M = N.N("closed_eye");
   private final class08097 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;

   public static class04806 M() {
      class04792 class04792 = new class04792();
      class04792.N().N("shell", class04822.L().N(0, 0).N(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), class04838.N);
      return class04806.N(class04792, 32, 16);
   }

   public class03362(class04811 var1) {
      super();
      this.B = var1.B();
      this.Z = var1.N(class04802.NU);
      this.z = var1.N(class04802.NW);
      this.U = var1.N(class04802.NE);
      this.E = var1.N(class04802.Nz);
   }

   public class00991 i() {
      return new class00991();
   }

   public static class04806 u() {
      class04792 class04792 = new class04792();
      class04792.N().N("wind", class04822.L().N(0, 0).N(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), class04838.N);
      return class04806.N(class04792, 64, 32);
   }

   public void N(class00991 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (!var1.y) {
         var2.N();
         var2.N(0.5F, 0.5F, 0.5F);
         var2.N(new Quaternionf().rotationY(var1.L * (float) (Math.PI / 180.0)));
         var3.N(this.U, var2, y.N(class06851::u), var1.Z, class01384.u, this.B.N(y), -1, var1.z);
         var2.y();
      } else {
         float f = var1.L * (180.0F / (float)Math.PI);
         float f1 = class04995.m(var1.N * 0.1F) / 2.0F + 0.5F;
         f1 = f1 * f1 + f1;
         var2.N();
         var2.N(0.5F, 0.3F + f1 * 0.2F, 0.5F);
         Vector3f vector3f = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         var2.N(new Quaternionf().rotationAxis(f * (float) (Math.PI / 180.0), vector3f));
         var3.N(this.E, var2, L.N(class06851::M), var1.Z, class01384.u, this.B.N(L), -1, var1.z);
         var2.y();
         var2.N();
         var2.N(0.5F, 0.5F, 0.5F);
         if (var1.u == 1) {
            var2.N(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if (var1.u == 2) {
            var2.N(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         class05913 class05913x = var1.u == 1 ? i : u;
         class07311 class07311 = class05913x.N(class06851::M);
         class08388 class08388 = this.B.N(class05913x);
         var3.N(this.z, var2, class07311, var1.Z, class01384.u, class08388);
         var2.y();
         var2.N();
         var2.N(0.5F, 0.5F, 0.5F);
         var2.y(0.875F, 0.875F, 0.875F);
         var2.N(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         var3.N(this.z, var2, class07311, var1.Z, class01384.u, class08388);
         var2.y();
         var2.N();
         var2.N(0.5F, 0.3F + f1 * 0.2F, 0.5F);
         var2.y(0.5F, 0.5F, 0.5F);
         var2.N(var4.i);
         var2.N(new Quaternionf().rotationZ((float) Math.PI).rotateY((float) Math.PI));
         float f2 = 1.3333334F;
         var2.y(1.3333334F, 1.3333334F, 1.3333334F);
         class05913 class05913x = var1.i ? R : M;
         var3.N(this.Z, var2, class05913x.N(class06851::M), var1.Z, class01384.u, this.B.N(class05913x));
         var2.y();
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04792.N().N("eye", class04822.L().N(0, 0).N(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new class04834(0.01F)), class04838.N);
      return class04806.N(class04792, 16, 16);
   }

   public void N(class00396 var1, class00991 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.y = var1.L();
      var2.L = var1.N(var1.L() ? var3 : 0.0F);
      var2.N = var1.N + var3;
      var2.u = var1.N / 66 % 3;
      var2.i = var1.u();
   }

   public static class04806 R() {
      class04792 class04792 = new class04792();
      class04792.N().N("shell", class04822.L().N(0, 0).N(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), class04838.N);
      return class04806.N(class04792, 32, 16);
   }
}
