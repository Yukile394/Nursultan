package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class08039 extends class08005 {
   public static final double N = 0.1;
   public static final double y = 0.5;
   public double L = 0.1;

   private void M() {
      class06889 class06889x = this.method_18798();
      class06889 class06889x = this.method_73189();
      float f;
      if (this.method_5799()) {
         for (int i = 0; i < 4; i++) {
            float f1 = 0.25F;
            this.method_73183()
               .method_8406(
                  class07107.u,
                  class06889x.M - class06889x.M * 0.25,
                  class06889x.B - class06889x.B * 0.25,
                  class06889x.Z - class06889x.Z * 0.25,
                  class06889x.M,
                  class06889x.B,
                  class06889x.Z
               );
         }

         f = this.R();
      } else {
         f = this.i();
      }

      this.method_18799(class06889x.i(class06889x.u().L(this.L)).L((double)f));
   }

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   public void method_5773() {
      class07049 class07049 = this.z();
      this.M();
      if (this.method_73183().method_8608() || (class07049 == null || !class07049.method_31481()) && this.method_73183().E(this.method_24515())) {
         class07089 class07089 = class08038.N(this, this::N, this.y());
         class06889 class06889;
         if (class07089.N() != class07113.field_1333) {
            class06889 = class07089.y();
         } else {
            class06889 = this.method_73189().i(this.method_18798());
         }

         class08038.N(this, 0.2F);
         this.method_33574(class06889);
         this.method_61409();
         super.method_5773();
         if (this.ad_()) {
            this.method_5639(1.0F);
         }

         if (class07089.N() != class07113.field_1333 && this.method_5805()) {
            this.y(class07089);
         }

         this.B();
      } else {
         this.method_31472();
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   public float method_5718() {
      return 1.0F;
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("acceleration_power", this.L);
   }

   @Override
   public boolean method_5640(double var1) {
      double d0 = this.method_5829().N() * 4.0;
      if (Double.isNaN(d0)) {
         d0 = 4.0;
      }

      d0 *= 64.0;
      return var1 < d0 * d0;
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L = var1.N("acceleration_power", 0.1);
   }

   protected class08039(class07078<? extends class08039> var1, class07299 var2) {
      super(var1, var2);
   }

   protected class08039(class07078<? extends class08039> var1, double var2, double var4, double var6, class07299 var8) {
      this(var1, var8);
      this.method_5814(var2, var4, var6);
   }

   public class08039(class07078<? extends class08039> var1, class07438 var2, class06889 var3, class07299 var4) {
      this(var1, var2.method_23317(), var2.method_23318(), var2.method_23321(), var3, var4);
      this.L(var2);
      this.method_5710(var2.method_36454(), var2.method_36455());
   }

   public class08039(class07078<? extends class08039> var1, double var2, double var4, double var6, class06889 var8, class07299 var9) {
      this(var1, var9);
      this.method_5808(var2, var4, var6, this.method_36454(), this.method_36455());
      this.method_23311();
      this.N(var8, this.L);
   }

   private void B() {
      class07126 class07126 = this.u();
      class06889 class06889 = this.method_73189();
      if (class07126 != null) {
         this.method_73183().method_8406(class07126, class06889.M, class06889.B + 0.5, class06889.Z, 0.0, 0.0, 0.0);
      }
   }

   protected float i() {
      return 0.95F;
   }

   @Nullable
   protected class07126 u() {
      return class07107.NZ;
   }

   protected class05849 y() {
      return class05849.field_17558;
   }

   private void N(class06889 var1, double var2) {
      this.method_18799(var1.u().L(var2));
      this.field_64356 = true;
   }

   @Override
   protected boolean N(class07049 var1) {
      return super.N(var1) && !var1.field_5960;
   }

   protected float R() {
      return 0.8F;
   }

   @Override
   protected void a_(boolean var1) {
      super.a_(var1);
      if (var1) {
         this.L = 0.1;
      } else {
         this.L *= 0.5;
      }
   }

   protected boolean ad_() {
      return true;
   }
}
