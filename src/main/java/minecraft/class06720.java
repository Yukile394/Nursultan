package minecraft;

import Nursultan.class10668;
import Nursultan.class10671;
import Nursultan.class10672;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector4f;

record class06720(boolean opaque, List<class10668> lines, List<class06754> quads, List<class06752> triangleFans, List<class10672> texts, List<class10671> points) {

   private void L(class01421 var1, class01407 var2, class06959 var3) {
      class01391 class01391 = var2.method_73477(class06851.n());
      class01423 class01423 = var1.L();
      double d0 = var3.y.N();
      double d1 = var3.y.y();
      double d2 = var3.y.L();

      for (class06754 class06754 : this.quads) {
         class01391.N(class01423, (float)(class06754.N().N() - d0), (float)(class06754.N().y() - d1), (float)(class06754.N().L() - d2))
            .method_39415(class06754.i());
         class01391.N(class01423, (float)(class06754.y().N() - d0), (float)(class06754.y().y() - d1), (float)(class06754.y().L() - d2))
            .method_39415(class06754.i());
         class01391.N(class01423, (float)(class06754.L().N() - d0), (float)(class06754.L().y() - d1), (float)(class06754.L().L() - d2))
            .method_39415(class06754.i());
         class01391.N(class01423, (float)(class06754.u().N() - d0), (float)(class06754.u().y() - d1), (float)(class06754.u().L() - d2))
            .method_39415(class06754.i());
      }
   }

   public List<class06754> L() {
      return this.quads;
   }

   class06720(boolean var1) {
      this(var1, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
   }

   private class06720(
      boolean opaque, List<class10668> lines, List<class06754> quads, List<class06752> triangleFans, List<class10672> texts, List<class10671> points
   ) {
      this.opaque = opaque;
      this.lines = lines;
      this.quads = quads;
      this.triangleFans = triangleFans;
      this.texts = texts;
      this.points = points;
   }

   public List<class10672> i() {
      return this.texts;
   }

   public List<class06752> u() {
      return this.triangleFans;
   }

   private void u(class01421 var1, class01407 var2, class06959 var3) {
      class01391 class01391 = var2.method_73477(class06851.t());
      class01423 class01423 = var1.L();
      double d0 = var3.y.N();
      double d1 = var3.y.y();
      double d2 = var3.y.L();

      for (class10671 class10671 : this.points) {
         class01391.N(class01423, (float)(class10671.N().N() - d0), (float)(class10671.N().y() - d1), (float)(class10671.N().L() - d2))
            .method_39415(class10671.y())
            .method_75298(class10671.L());
      }
   }

   public List<class10668> y() {
      return this.lines;
   }

   private void y(class01421 var1, class01407 var2, class06959 var3) {
      class01423 class01423 = var1.L();
      double d0 = var3.y.N();
      double d1 = var3.y.y();
      double d2 = var3.y.L();

      for (class06752 class06752 : this.triangleFans) {
         class01391 class01391 = var2.method_73477(class06851.l());

         for (class06889 class06889 : class06752.N()) {
            class01391.N(class01423, (float)(class06889.N() - d0), (float)(class06889.y() - d1), (float)(class06889.L() - d2)).method_39415(class06752.y());
         }
      }
   }

   private void y(class01421 var1, class01407 var2, class06959 var3, Matrix4f var4) {
      class01391 class01391 = var2.method_73477(this.opaque ? class06851.b() : class06851.j());
      class01423 class01423 = var1.L();
      Vector4f vector4f = new Vector4f();
      Vector4f vector4f1 = new Vector4f();
      Vector4f vector4f2 = new Vector4f();
      Vector4f vector4f3 = new Vector4f();
      Vector4f vector4f4 = new Vector4f();
      double d0 = var3.y.N();
      double d1 = var3.y.y();
      double d2 = var3.y.L();

      for (class10668 class10668 : this.lines) {
         vector4f.set(class10668.N().N() - d0, class10668.N().y() - d1, class10668.N().L() - d2, 1.0);
         vector4f1.set(class10668.y().N() - d0, class10668.y().y() - d1, class10668.y().L() - d2, 1.0);
         vector4f.mul(var4, vector4f2);
         vector4f1.mul(var4, vector4f3);
         boolean flag = vector4f2.z > -0.05F;
         boolean flag1 = vector4f3.z > -0.05F;
         if (!flag || !flag1) {
            if (flag || flag1) {
               float f = vector4f3.z - vector4f2.z;
               if (Math.abs(f) < 1.0E-9F) {
                  continue;
               }

               float f1 = class04995.N((-0.05F - vector4f2.z) / f, 0.0F, 1.0F);
               vector4f.lerp(vector4f1, f1, vector4f4);
               if (flag) {
                  vector4f.set(vector4f4);
               } else {
                  vector4f1.set(vector4f4);
               }
            }

            class01391.N(class01423, vector4f.x, vector4f.y, vector4f.z)
               .y(class01423, vector4f1.x - vector4f.x, vector4f1.y - vector4f.y, vector4f1.z - vector4f.z)
               .method_39415(class10668.L())
               .method_75298(class10668.u());
            class01391.N(class01423, vector4f1.x, vector4f1.y, vector4f1.z)
               .y(class01423, vector4f1.x - vector4f.x, vector4f1.y - vector4f.y, vector4f1.z - vector4f.z)
               .method_39415(class10668.L())
               .method_75298(class10668.u());
         }
      }
   }

   public void N(class01421 var1, class01407 var2, class06959 var3, Matrix4f var4) {
      this.L(var1, var2, var3);
      this.y(var1, var2, var3);
      this.y(var1, var2, var3, var4);
      this.N(var1, var2, var3);
      this.u(var1, var2, var3);
   }

   public boolean N() {
      return this.opaque;
   }

   private void N(class01421 var1, class01407 var2, class06959 var3) {
      class01590 class01590 = (class01590)class06202.Nq().i_3;
      if (var3.L) {
         double d0 = var3.y.N();
         double d1 = var3.y.y();
         double d2 = var3.y.L();

         for (class10672 class10672 : this.texts) {
            var1.N();
            var1.N((float)(class10672.N().N() - d0), (float)(class10672.N().y() - d1), (float)(class10672.N().L() - d2));
            var1.N(var3.i);
            var1.y(class10672.L().L() / 16.0F, -class10672.L().L() / 16.0F, class10672.L().L() / 16.0F);
            float f;
            if (class10672.L().u().isEmpty()) {
               f = -class01590.y(class10672.y()) / 2.0F;
            } else {
               f = (float)(-class10672.L().u().getAsDouble()) / class10672.L().L();
            }

            class01590.N(class10672.y(), f, 0.0F, class10672.L().y(), false, var1.L().N(), var2, class01583.field_33993, 0, 15728880);
            var1.y();
         }
      }
   }

   public List<class10671> R() {
      return this.points;
   }
}
