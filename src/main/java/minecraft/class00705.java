package minecraft;

import org.jspecify.annotations.Nullable;

public class class00705 extends class00692 {
   @Nullable
   private class06889 y;

   @Override
   public void L() {
      this.y = null;
   }

   @Override
   public float M() {
      float f = (float)this.N.method_18798().Z() + 1.0F;
      return Math.min(f, 40.0F) / f;
   }

   public class00705(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00705> B() {
      return class00702.u;
   }

   @Override
   public float i() {
      return 1.5F;
   }

   @Override
   public void y() {
      class06889 class06889x = this.N.u(1.0F).u();
      class06889x.y((float) (-Math.PI / 4));
      double d0 = this.N.L.method_23317();
      double d1 = this.N.L.method_23323(0.5);
      double d2 = this.N.L.method_23321();

      for (int i = 0; i < 8; i++) {
         class06069 class06069 = this.N.method_59922();
         double d3 = d0 + class06069.E() / 2.0;
         double d4 = d1 + class06069.E() / 2.0;
         double d5 = d2 + class06069.E() / 2.0;
         class06889 class06889x = this.N.method_18798();
         this.N
            .method_73183()
            .method_8406(
               class00473.N(class07107.Z, 1.0F),
               d3,
               d4,
               d5,
               -class06889x.M * 0.08F + class06889x.M,
               -class06889x.B * 0.3F + class06889x.B,
               -class06889x.Z * 0.08F + class06889x.Z
            );
         class06889x.y((float) (Math.PI / 16));
      }
   }

   @Override
   public void N(class04782 var1) {
      if (this.y == null) {
         this.y = class06889.L(var1.N(class07830.field_13203, class06403.N(this.N.M())));
      }

      if (this.y.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321()) < 1.0) {
         this.N.W().y(class00702.R).Z();
         this.N.W().N(class00702.M);
      }
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.y;
   }
}
