package minecraft;

import java.util.Optional;

public class class07442 implements class08701 {
   protected final class07079 y;
   protected float L;
   protected float u;
   protected int i;
   protected double R;
   protected double M;
   protected double B;

   protected boolean L() {
      return true;
   }

   public double M() {
      return this.B;
   }

   public class07442(class07079 var1) {
      super();
      this.y = var1;
   }

   protected Optional<Float> B() {
      double d0 = this.R - this.y.method_23317();
      double d1 = this.M - this.y.method_23320();
      double d2 = this.B - this.y.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      return !(Math.abs(d1) > 1.0E-5F) && !(Math.abs(d3) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(-(class04995.u(d1, d3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> Z() {
      double d0 = this.R - this.y.method_23317();
      double d1 = this.B - this.y.method_23321();
      return !(Math.abs(d1) > 1.0E-5F) && !(Math.abs(d0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(class04995.u(d1, d0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   public double i() {
      return this.R;
   }

   public boolean u() {
      return this.i > 0;
   }

   protected void y() {
      if (!this.y.f().U()) {
         this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = class04995.L(
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2, this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0, (float)this.y.NR()
         );
      }
   }

   public void N(double var1, double var3, double var5, float var7, float var8) {
      this.R = var1;
      this.M = var3;
      this.B = var5;
      this.L = var7;
      this.u = var8;
      this.i = 2;
   }

   public void N(double var1, double var3, double var5) {
      this.N(var1, var3, var5, this.y.NB(), this.y.Ni());
   }

   public void N(class07049 var1, float var2, float var3) {
      this.N(var1.method_23317(), var1.method_23320(), var1.method_23321(), var2, var3);
   }

   public void N(class07049 var1) {
      this.N(var1.method_23317(), var1.method_23320(), var1.method_23321());
   }

   public void N() {
      if (this.L()) {
         this.y.method_36457(0.0F);
      }

      if (this.i > 0) {
         this.i--;
         this.Z()
            .ifPresent(var1 -> this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.N(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2, var1, this.L));
         this.B().ifPresent(var1 -> this.y.method_36457(this.N(this.y.method_36455(), var1, this.u)));
      } else {
         this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.N(
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2, this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0, 10.0F
         );
      }

      this.y();
   }

   public void N(class06889 var1) {
      this.N(var1.M, var1.B, var1.Z);
   }

   public double R() {
      return this.M;
   }
}
