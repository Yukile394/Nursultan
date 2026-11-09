package minecraft;

import java.util.List;
import java.util.Optional;

public abstract class class04406 {
   private static final class00734 field_3860 = new class00734(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double field_36193 = class04995.E(100.0);
   protected final class03448 field_3851;
   protected double field_3858;
   protected double field_3838;
   protected double field_3856;
   protected double field_3874;
   protected double field_3854;
   protected double field_3871;
   protected double field_3852;
   protected double field_3869;
   protected double field_3850;
   private class00734 field_3872 = field_3860;
   protected boolean field_3845;
   protected boolean field_3862 = true;
   private boolean field_21507;
   protected boolean field_3843;
   protected float field_3849 = 0.6F;
   protected float field_3867 = 1.8F;
   protected final class06069 field_3840 = class06069.u();
   protected int field_3866;
   public int field_3847;
   public float field_3844;
   protected float field_28786 = 0.98F;
   protected boolean field_28787 = false;

   protected class04406(class03448 var1, double var2, double var4, double var6) {
      super();
      this.field_3851 = var1;
      this.method_3080(0.2F, 0.2F);
      this.method_3063(var2, var4, var6);
      this.field_3858 = var2;
      this.field_3838 = var4;
      this.field_3856 = var6;
      this.field_3847 = (int)(4.0F / (this.field_3840.z() * 0.9F + 0.1F));
   }

   public class04406(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6);
      this.field_3852 = var8 + (this.field_3840.z() * 2.0F - 1.0F) * 0.4F;
      this.field_3869 = var10 + (this.field_3840.z() * 2.0F - 1.0F) * 0.4F;
      this.field_3850 = var12 + (this.field_3840.z() * 2.0F - 1.0F) * 0.4F;
      double d0 = (this.field_3840.z() + this.field_3840.z() + 1.0F) * 0.15F;
      double d1 = Math.sqrt(this.field_3852 * this.field_3852 + this.field_3869 * this.field_3869 + this.field_3850 * this.field_3850);
      this.field_3852 = this.field_3852 / d1 * d0 * 0.4F;
      this.field_3869 = this.field_3869 / d1 * d0 * 0.4F + 0.1F;
      this.field_3850 = this.field_3850 / d1 * d0 * 0.4F;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + ", Pos (" + this.field_3874 + "," + this.field_3854 + "," + this.field_3871 + "), Age " + this.field_3866;
   }

   public class04406 method_3087(float var1) {
      this.method_3080(0.2F * var1, 0.2F * var1);
      return this;
   }

   public class04406 method_3075(float var1) {
      this.field_3852 *= var1;
      this.field_3869 = (this.field_3869 - 0.1F) * var1 + 0.1F;
      this.field_3850 *= var1;
      return this;
   }

   public void method_3077(int var1) {
      this.field_3847 = var1;
   }

   public void method_3063(double var1, double var3, double var5) {
      this.field_3874 = var1;
      this.field_3854 = var3;
      this.field_3871 = var5;
      float f = this.field_3849 / 2.0F;
      float f1 = this.field_3867;
      this.method_3067(new class00734(var1 - f, var3, var5 - f, var1 + f, var3 + f1, var5 + f));
   }

   public int method_3082() {
      return this.field_3847;
   }

   public void method_3085() {
      this.field_3843 = true;
   }

   public class00734 method_3064() {
      return this.field_3872;
   }

   public void method_3069(double var1, double var3, double var5) {
      if (!this.field_21507) {
         double d0 = var1;
         double d1 = var3;
         double d2 = var5;
         if (this.field_3862 && (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) && var1 * var1 + var3 * var3 + var5 * var5 < field_36193) {
            class06889 class06889 = class07049.method_20736(null, new class06889(var1, var3, var5), this.method_3064(), this.field_3851, List.of());
            var1 = class06889.M;
            var3 = class06889.B;
            var5 = class06889.Z;
         }

         if (var1 != 0.0 || var3 != 0.0 || var5 != 0.0) {
            this.method_3067(this.method_3064().u(var1, var3, var5));
            this.method_3072();
         }

         if (Math.abs(d1) >= 1.0E-5F && Math.abs(var3) < 1.0E-5F) {
            this.field_21507 = true;
         }

         this.field_3845 = d1 != var3 && d1 < 0.0;
         if (d0 != var1) {
            this.field_3852 = 0.0;
         }

         if (d2 != var5) {
            this.field_3850 = 0.0;
         }
      }
   }

   public void method_34753(double var1, double var3, double var5) {
      this.field_3852 = var1;
      this.field_3869 = var3;
      this.field_3850 = var5;
   }

   protected void method_3072() {
      class00734 class00734 = this.method_3064();
      this.field_3874 = (class00734.N + class00734.u) / 2.0;
      this.field_3854 = class00734.y;
      this.field_3871 = (class00734.L + class00734.R) / 2.0;
   }

   public boolean method_3086() {
      return !this.field_3843;
   }

   protected void method_3080(float var1, float var2) {
      if (var1 != this.field_3849 || var2 != this.field_3867) {
         this.field_3849 = var1;
         this.field_3867 = var2;
         class00734 class00734 = this.method_3064();
         double d0 = (class00734.N + class00734.u - var1) / 2.0;
         double d1 = (class00734.L + class00734.R - var1) / 2.0;
         this.method_3067(new class00734(d0, class00734.y, d1, d0 + this.field_3849, class00734.y + this.field_3867, d1 + this.field_3849));
      }
   }

   public Optional<class06064> method_34019() {
      return Optional.empty();
   }

   protected int method_3068(float var1) {
      class07209 class07209 = class07209.method_49637(this.field_3874, this.field_3854, this.field_3871);
      return this.field_3851.E(class07209) ? class03063.N(this.field_3851, class07209) : 0;
   }

   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         this.field_3869 = this.field_3869 - 0.04 * this.field_3844;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         if (this.field_28787 && this.field_3854 == this.field_3838) {
            this.field_3852 *= 1.1;
            this.field_3850 *= 1.1;
         }

         this.field_3852 = this.field_3852 * this.field_28786;
         this.field_3869 = this.field_3869 * this.field_28786;
         this.field_3850 = this.field_3850 * this.field_28786;
         if (this.field_3845) {
            this.field_3852 *= 0.7F;
            this.field_3850 *= 0.7F;
         }
      }
   }

   public void method_3067(class00734 var1) {
      this.field_3872 = var1;
   }

   public abstract class06166 method_74274();
}
