package minecraft;

import java.util.Optional;
import org.joml.Quaternionf;

public class class01170 extends class05848 {
   private final class01190 N;
   private float y;
   private float L;
   private float u;
   private float i;

   class01170(class03448 var1, double var2, double var4, double var6, class01190 var8, int var9, class08388 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var10);
      this.field_17867 = 0.3F;
      this.N = var8;
      this.field_3847 = var9;
      Optional<class06889> optional = var8.N(var1);
      if (optional.isPresent()) {
         class06889 class06889 = optional.get();
         double d0 = var2 - class06889.N();
         double d1 = var4 - class06889.y();
         double d2 = var6 - class06889.L();
         this.L = this.y = (float)class04995.u(d0, d2);
         this.i = this.u = (float)class04995.u(d1, Math.sqrt(d0 * d0 + d2 * d2));
      }
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public void method_3074(class00965 var1, class05363 var2, float var3) {
      float f = class04995.m((this.field_3866 + var3 - (float) (Math.PI * 2)) * 0.05F) * 2.0F;
      float f1 = class04995.B(var3, this.L, this.y);
      float f2 = class04995.B(var3, this.i, this.u) + (float) (Math.PI / 2);
      Quaternionf quaternionf = new Quaternionf();
      quaternionf.rotationY(f1).rotateX(-f2).rotateY(f);
      this.method_60373(var1, var2, quaternionf, var3);
      quaternionf.rotationY((float) -Math.PI + f1).rotateX(f2).rotateY(f);
      this.method_60373(var1, var2, quaternionf, var3);
   }

   @Override
   public int method_3068(float var1) {
      return 240;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         Optional<class06889> optional = this.N.N(this.field_3851);
         if (optional.isEmpty()) {
            this.method_3085();
         } else {
            int ix = this.field_3847 - this.field_3866;
            double d0 = 1.0 / ix;
            class06889 class06889 = optional.get();
            this.field_3874 = class04995.u(d0, this.field_3874, class06889.N());
            this.field_3854 = class04995.u(d0, this.field_3854, class06889.y());
            this.field_3871 = class04995.u(d0, this.field_3871, class06889.L());
            double d1 = this.field_3874 - class06889.N();
            double d2 = this.field_3854 - class06889.y();
            double d3 = this.field_3871 - class06889.L();
            this.L = this.y;
            this.y = (float)class04995.u(d1, d3);
            this.i = this.u;
            this.u = (float)class04995.u(d2, Math.sqrt(d1 * d1 + d3 * d3));
         }
      }
   }
}
