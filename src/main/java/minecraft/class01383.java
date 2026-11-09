package minecraft;

import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.render.viewport.ViewportProvider;
import net.caffeinemc.mods.sodium.client.render.viewport.frustum.SimpleFrustum;
import org.joml.FrustumIntersection;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.joml.Vector4f;

public class class01383 implements ViewportProvider {
   public static final int field_34820 = 4;
   private final FrustumIntersection field_40823 = new FrustumIntersection();
   private final Matrix4f field_40824 = new Matrix4f();
   private Vector4f field_34821;
   private double field_20995;
   private double field_20996;
   private double field_20997;

   public class01383(Matrix4f var1, Matrix4f var2) {
      super();
      this.method_23092(var1, var2);
   }

   public class01383(class01383 var1) {
      super();
      this.field_40823.set(var1.field_40824);
      this.field_40824.set(var1.field_40824);
      this.field_20995 = var1.field_20995;
      this.field_20996 = var1.field_20996;
      this.field_20997 = var1.field_20997;
      this.field_34821 = var1.field_34821;
   }

   public double method_62345() {
      return this.field_20997;
   }

   public Vector4f[] method_62342() {
      Vector4f[] avector4f = new Vector4f[]{
         new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F),
         new Vector4f(1.0F, -1.0F, -1.0F, 1.0F),
         new Vector4f(1.0F, 1.0F, -1.0F, 1.0F),
         new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F),
         new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F),
         new Vector4f(1.0F, -1.0F, 1.0F, 1.0F),
         new Vector4f(1.0F, 1.0F, 1.0F, 1.0F),
         new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F)
      };
      Matrix4f matrix4f = this.field_40824.invert(new Matrix4f());

      for (int i = 0; i < 8; i++) {
         matrix4f.transform(avector4f[i]);
         avector4f[i].div(avector4f[i].w());
      }

      return avector4f;
   }

   public class01383 method_38557(int var1) {
      double d0 = Math.floor(this.field_20995 / var1) * var1;
      double d1 = Math.floor(this.field_20996 / var1) * var1;
      double d2 = Math.floor(this.field_20997 / var1) * var1;
      double d3 = Math.ceil(this.field_20995 / var1) * var1;
      double d4 = Math.ceil(this.field_20996 / var1) * var1;

      for (double d5 = Math.ceil(this.field_20997 / var1) * var1;
         this.field_40823
               .intersectAab(
                  (float)(d0 - this.field_20995),
                  (float)(d1 - this.field_20996),
                  (float)(d2 - this.field_20997),
                  (float)(d3 - this.field_20995),
                  (float)(d4 - this.field_20996),
                  (float)(d5 - this.field_20997)
               )
            != -2;
         this.field_20997 = this.field_20997 - this.field_34821.z() * 4.0F
      ) {
         this.field_20995 = this.field_20995 - this.field_34821.x() * 4.0F;
         this.field_20996 = this.field_20996 - this.field_34821.y() * 4.0F;
      }

      return this;
   }

   public int method_62978(class05163 var1) {
      return this.method_23089(var1.B(), var1.Z(), var1.z(), var1.U() + 1, var1.E() + 1, var1.W() + 1);
   }

   private void method_23092(Matrix4f var1, Matrix4f var2) {
      var2.mul(var1, this.field_40824);
      this.field_40823.set(this.field_40824);
      this.field_34821 = this.field_40824.transformTranspose(new Vector4f(0.0F, 0.0F, 1.0F, 0.0F));
   }

   public class01383 method_74403(float var1) {
      this.field_20995 = this.field_20995 + this.field_34821.x * var1;
      this.field_20996 = this.field_20996 + this.field_34821.y * var1;
      this.field_20997 = this.field_20997 + this.field_34821.z * var1;
      return this;
   }

   private int method_23089(double var1, double var3, double var5, double var7, double var9, double var11) {
      float f = (float)(var1 - this.field_20995);
      float f1 = (float)(var3 - this.field_20996);
      float f2 = (float)(var5 - this.field_20997);
      float f3 = (float)(var7 - this.field_20995);
      float f4 = (float)(var9 - this.field_20996);
      float f5 = (float)(var11 - this.field_20997);
      return this.field_40823.intersectAab(f, f1, f2, f3, f4, f5);
   }

   public double method_62344() {
      return this.field_20996;
   }

   public void method_23088(double var1, double var3, double var5) {
      this.field_20995 = var1;
      this.field_20996 = var3;
      this.field_20997 = var5;
   }

   public double method_62343() {
      return this.field_20995;
   }

   public Viewport sodium$createViewport() {
      return new Viewport(new SimpleFrustum(this.field_40823), new Vector3d(this.field_20995, this.field_20996, this.field_20997));
   }

   public boolean method_23093(class00734 var1) {
      int i = this.method_23089(var1.N, var1.y, var1.L, var1.u, var1.i, var1.R);
      return i == -2 || i == -1;
   }

   public boolean method_74404(double var1, double var3, double var5) {
      return this.field_40823.testPoint((float)(var1 - this.field_20995), (float)(var3 - this.field_20996), (float)(var5 - this.field_20997));
   }
}
