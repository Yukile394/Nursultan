package minecraft;

import org.jspecify.annotations.Nullable;

public class class00713 extends class00692 {
   @Nullable
   private class06889 y;
   private int L;

   @Override
   public void L() {
      this.y = null;
      this.L = 0;
   }

   public class00713(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00713> B() {
      return class00702.z;
   }

   @Override
   public float i() {
      return 3.0F;
   }

   @Override
   public void y() {
      if (this.L++ % 10 == 0) {
         float f = (this.N.method_59922().z() - 0.5F) * 8.0F;
         float f1 = (this.N.method_59922().z() - 0.5F) * 4.0F;
         float f2 = (this.N.method_59922().z() - 0.5F) * 8.0F;
         this.N
            .method_73183()
            .method_8406(class07107.G, this.N.method_23317() + f, this.N.method_23318() + 2.0 + f1, this.N.method_23321() + f2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void N(class04782 var1) {
      this.L++;
      if (this.y == null) {
         class07209 class07209 = var1.N(class07830.field_13197, class06403.N(this.N.M()));
         this.y = class06889.L(class07209);
      }

      double d0 = this.y.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
      if (!(d0 < 100.0) && !(d0 > 22500.0) && !this.N.field_5976 && !this.N.field_5992) {
         this.N.method_6033(1.0F);
      } else {
         this.N.method_6033(0.0F);
      }
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.y;
   }
}
