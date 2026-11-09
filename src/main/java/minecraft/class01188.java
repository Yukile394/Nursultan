package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.Set;
import java.util.function.Function;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01188<T extends class08467> extends class06078<T> implements class06230, class06240<T> {
   public static final class02415 N = new class02441(true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));
   public static final float y = 0.25F;
   public static final float L = 0.5F;
   public static final float u = -0.1F;
   private static final float m = 0.005F;
   private static final float P = (float) (Math.PI / 12);
   private static final float s = 1.9198622F;
   private static final float T = (float) (Math.PI / 12);
   private static final float b = (float) (-Math.PI * 4.0 / 9.0);
   private static final float j = 0.43633232F;
   private static final float v = (float) (Math.PI / 6);
   public static final float i = 1.4835298F;
   public static final float R = (float) (Math.PI / 6);
   public final class01686 M;
   public final class01686 B;
   public final class01686 Z;
   public final class01686 z;
   public final class01686 U;
   public final class01686 E;
   public final class01686 W;

   private void L(T var1) {
      switch (var1.No) {
         case field_3409:
            this.z.R = 0.0F;
            break;
         case field_3410:
            this.z.i = this.z.i * 0.5F - (float) (Math.PI / 10);
            this.z.R = 0.0F;
            break;
         case field_3406:
            this.N(this.z, true);
            break;
         case field_3403:
            this.z.R = -0.1F + this.M.R;
            this.U.R = 0.1F + this.M.R + 0.4F;
            this.z.i = (float) (-Math.PI / 2) + this.M.i;
            this.U.i = (float) (-Math.PI / 2) + this.M.i;
            break;
         case field_63542:
            this.z.i = this.z.i * 0.5F - (float) Math.PI;
            this.z.R = 0.0F;
            break;
         case field_3405:
            class05402.N(this.z, this.U, var1.i, var1.R, true);
            break;
         case field_3408:
            class05402.N(this.z, this.U, this.M, true);
            break;
         case field_27434:
            this.z.i = class04995.N(this.M.i - 1.9198622F - (var1.Z ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.z.R = this.M.R - (float) (Math.PI / 12);
            break;
         case field_39071:
            this.z.i = class04995.N(this.M.i, -1.2F, 1.2F) - 1.4835298F;
            this.z.R = this.M.R - (float) (Math.PI / 6);
            break;
         case field_42877:
            this.z.i = this.z.i * 0.5F - (float) (Math.PI / 5);
            this.z.R = 0.0F;
            break;
         case field_63543:
            class06733.N(this.z, this.M, true, var1.y(class07070.field_6183), var1);
      }
   }

   public class01188(class01686 var1) {
      this(var1, class06851::M);
   }

   public class01188(class01686 var1, Function<class01894, class07311> var2) {
      super(var1, var2);
      this.M = var1.y("head");
      this.B = this.M.y("hat");
      this.Z = var1.y("body");
      this.z = var1.y("right_arm");
      this.U = var1.y("left_arm");
      this.E = var1.y("right_leg");
      this.W = var1.y("left_leg");
   }

   private void u(T var1) {
      switch (var1.NV) {
         case field_3409:
            this.U.R = 0.0F;
            break;
         case field_3410:
            this.U.i = this.U.i * 0.5F - (float) (Math.PI / 10);
            this.U.R = 0.0F;
            break;
         case field_3406:
            this.N(this.U, false);
            break;
         case field_3403:
            this.z.R = -0.1F + this.M.R - 0.4F;
            this.U.R = 0.1F + this.M.R;
            this.z.i = (float) (-Math.PI / 2) + this.M.i;
            this.U.i = (float) (-Math.PI / 2) + this.M.i;
            break;
         case field_63542:
            this.U.i = this.U.i * 0.5F - (float) Math.PI;
            this.U.R = 0.0F;
            break;
         case field_3405:
            class05402.N(this.z, this.U, var1.i, var1.R, false);
            break;
         case field_3408:
            class05402.N(this.z, this.U, this.M, false);
            break;
         case field_27434:
            this.U.i = class04995.N(this.M.i - 1.9198622F - (var1.Z ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.U.R = this.M.R + (float) (Math.PI / 12);
            break;
         case field_39071:
            this.U.i = class04995.N(this.M.i, -1.2F, 1.2F) - 1.4835298F;
            this.U.R = this.M.R + (float) (Math.PI / 6);
            break;
         case field_42877:
            this.U.i = this.U.i * 0.5F - (float) (Math.PI / 5);
            this.U.R = 0.0F;
            break;
         case field_63543:
            class06733.N(this.U, this.M, false, var1.y(class07070.field_6182), var1);
      }
   }

   protected void y(T var1) {
      float f = var1.NX;
      if (!(f <= 0.0F)) {
         this.Z.R = class04995.m(class04995.N(f) * (float) (Math.PI * 2)) * 0.2F;
         if (var1.M == class07070.field_6182) {
            this.Z.R *= -1.0F;
         }

         float f1 = var1.Nu;
         this.z.u = class04995.m(this.Z.R) * 5.0F * f1;
         this.z.y = -class04995.P(this.Z.R) * 5.0F * f1;
         this.U.u = -class04995.m(this.Z.R) * 5.0F * f1;
         this.U.y = class04995.P(this.Z.R) * 5.0F * f1;
         this.z.R = this.z.R + this.Z.R;
         this.U.R = this.U.R + this.Z.R;
         this.U.i = this.U.i + this.Z.R;
         switch (var1.Nc) {
            case field_63399:
               float f2 = class04995.m(class08173.G(f) * (float) Math.PI);
               float f3 = class04995.m(f * (float) Math.PI) * -(this.M.i - 0.7F) * 0.75F;
               class01686 class01686 = this.N(var1.M);
               class01686.i -= f2 * 1.2F + f3;
               class01686.R = class01686.R + this.Z.R * 2.0F;
               class01686.M = class01686.M + class04995.m(f * (float) Math.PI) * -0.4F;
            case field_63398:
            default:
               break;
            case field_63400:
               class06733.N(this, (T)var1);
         }
      }
   }

   public static class08118<class04792> y(class04834 var0, class04834 var1) {
      return N(class01188::N, var0, var1);
   }

   public void N(class08467 var1, class07070 var2, class01421 var3) {
      this.field_54014.N(var3);
      this.N(var2).N(var3);
   }

   public class01686 N(class07070 var1) {
      return var1 == class07070.field_6182 ? this.U : this.z;
   }

   public static class04792 N(class04834 var0, float var1) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0), class04838.N(0.0F, 0.0F + var1, 0.0F))
         .N("hat", class04822.L().N(32, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0.N(0.5F)), class04838.N);
      class04839.N("body", class04822.L().N(16, 16).N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var0), class04838.N(0.0F, 0.0F + var1, 0.0F));
      class04839.N("right_arm", class04822.L().N(40, 16).N(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(-5.0F, 2.0F + var1, 0.0F));
      class04839.N("left_arm", class04822.L().N(40, 16).N().N(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(5.0F, 2.0F + var1, 0.0F));
      class04839.N("right_leg", class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(-1.9F, 12.0F + var1, 0.0F));
      class04839.N("left_leg", class04822.L().N(0, 16).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(1.9F, 12.0F + var1, 0.0F));
      return class04792;
   }

   private void N(class08467 var1, CallbackInfo var2) {
      if (VisualSettings.INSTANCE.oldWalkingAnimation.isEnabled()) {
         float f = var1.NN;
         float f1 = var1.Ny;
         this.z.i = class04995.P(f * 0.6662F + (float) Math.PI) * 2.0F * f1;
         this.z.M = (class04995.P(f * 0.2312F) + 1.0F) * 1.0F * f1;
         this.U.i = class04995.P(f * 0.6662F) * 2.0F * f1;
         this.U.M = (class04995.P(f * 0.2812F) - 1.0F) * 1.0F * f1;
      }
   }

   private float N(float var1, float var2, float var3) {
      return VisualSettings.INSTANCE.lockBlockingArmRotation.isEnabled() ? 0.0F : class04995.N(var1, var2, var3);
   }

   private void N(class01686 var1, boolean var2) {
      float f3 = var1.i * 0.5F - 0.9424779F;
      float f2 = 0.43633232F;
      float f1 = (float) (-Math.PI * 4.0 / 9.0);
      float f = this.M.i;
      var1.i = f3 + this.N(f, f1, f2);
      f3 = (var2 ? -30.0F : 30.0F) * (float) (Math.PI / 180.0);
      f2 = (float) (Math.PI / 6);
      f1 = (float) (-Math.PI / 6);
      f = this.M.R;
      var1.R = f3 + this.N(f, f1, f2);
   }

   protected static class08118<class04792> N(Function<class04834, class04792> var0, class04834 var1, class04834 var2) {
      class04792 class04792xxx = (class04792)var0.apply(var2);
      class04792xxx.N().N(Set.of("head"));
      class04792 class04792x = (class04792)var0.apply(var2);
      class04792x.N().y(Set.of("body", "left_arm", "right_arm"));
      class04792 class04792xx = (class04792)var0.apply(var1);
      class04792xx.N().y(Set.of("left_leg", "right_leg", "body"));
      class04792 class04792xxx = (class04792)var0.apply(var2);
      class04792xxx.N().y(Set.of("left_leg", "right_leg"));
      return new class08118<>(class04792xxx, class04792x, class04792xx, class04792xxx);
   }

   private static class04792 N(class04834 var0) {
      class04792 class04792 = N(var0, 0.0F);
      class04839 class04839 = class04792.N();
      class04839.N("right_leg", class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(-0.1F)), class04838.N(-1.9F, 12.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(0, 16).N().N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0.N(-0.1F)), class04838.N(1.9F, 12.0F, 0.0F));
      return class04792;
   }

   public void method_2819(T var1) {
      super.method_2819((T)var1);
      class01180 class01180x = var1.NV;
      class01180 class01180x = var1.No;
      float f = var1.L;
      boolean flag = var1.g;
      this.M.i = var1.h * (float) (Math.PI / 180.0);
      this.M.R = var1.D * (float) (Math.PI / 180.0);
      if (flag) {
         this.M.i = (float) (-Math.PI / 4);
      } else if (f > 0.0F) {
         this.M.i = class04995.z(f, this.M.i, (float) (-Math.PI / 4));
      }

      float f1 = var1.NN;
      float f2 = var1.Ny;
      this.z.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 2.0F * f2 * 0.5F / var1.u;
      this.U.i = class04995.P(f1 * 0.6662F) * 2.0F * f2 * 0.5F / var1.u;
      this.E.i = class04995.P(f1 * 0.6662F) * 1.4F * f2 / var1.u;
      this.W.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f2 / var1.u;
      this.E.R = 0.005F;
      this.W.R = -0.005F;
      this.E.M = 0.005F;
      this.W.M = -0.005F;
      this.N(var1, null);
      if (var1.J) {
         this.z.i += (float) (-Math.PI / 5);
         this.U.i += (float) (-Math.PI / 5);
         this.E.i = -1.4137167F;
         this.E.R = (float) (Math.PI / 10);
         this.E.M = 0.07853982F;
         this.W.i = -1.4137167F;
         this.W.R = (float) (-Math.PI / 10);
         this.W.M = -0.07853982F;
      }

      boolean flag1 = var1.NJ == class07070.field_6183;
      if (var1.o) {
         boolean flag2 = var1.B == class07050.field_5808;
         if (flag2 == flag1) {
            this.L((T)var1);
            if (!var1.No.y()) {
               this.u((T)var1);
            }
         } else {
            this.u((T)var1);
            if (!var1.NV.y()) {
               this.L((T)var1);
            }
         }
      } else {
         boolean flag3 = flag1 ? class01180x.N() : class01180x.N();
         if (flag1 != flag3) {
            this.u((T)var1);
            if (!var1.NV.y()) {
               this.L((T)var1);
            }
         } else {
            this.L((T)var1);
            if (!var1.No.y()) {
               this.u((T)var1);
            }
         }
      }

      this.y((T)var1);
      if (var1.Z) {
         this.Z.i = 0.5F;
         this.z.i += 0.4F;
         this.U.i += 0.4F;
         this.E.u += 4.0F;
         this.W.u += 4.0F;
         this.M.L += 4.2F;
         this.Z.L += 3.2F;
         this.U.L += 3.2F;
         this.z.L += 3.2F;
      }

      if (class01180x != class01180.field_27434) {
         class05402.N(this.z, var1.P, 1.0F);
      }

      if (class01180x != class01180.field_27434) {
         class05402.N(this.U, var1.P, -1.0F);
      }

      if (f > 0.0F) {
         float f7 = f1 % 26.0F;
         class07070 class07070 = var1.M;
         float f3 = var1.No != class01180.field_63543 && (class07070 != class07070.field_6183 || !(var1.NX > 0.0F)) ? f : 0.0F;
         float f4 = var1.NV != class01180.field_63543 && (class07070 != class07070.field_6182 || !(var1.NX > 0.0F)) ? f : 0.0F;
         if (!var1.o) {
            if (f7 < 14.0F) {
               this.U.i = class04995.z(f4, this.U.i, 0.0F);
               this.z.i = class04995.B(f3, this.z.i, 0.0F);
               this.U.R = class04995.z(f4, this.U.R, (float) Math.PI);
               this.z.R = class04995.B(f3, this.z.R, (float) Math.PI);
               this.U.M = class04995.z(f4, this.U.M, (float) Math.PI + 1.8707964F * this.N(f7) / this.N(14.0F));
               this.z.M = class04995.B(f3, this.z.M, (float) Math.PI - 1.8707964F * this.N(f7) / this.N(14.0F));
            } else if (f7 >= 14.0F && f7 < 22.0F) {
               float f8 = (f7 - 14.0F) / 8.0F;
               this.U.i = class04995.z(f4, this.U.i, (float) (Math.PI / 2) * f8);
               this.z.i = class04995.B(f3, this.z.i, (float) (Math.PI / 2) * f8);
               this.U.R = class04995.z(f4, this.U.R, (float) Math.PI);
               this.z.R = class04995.B(f3, this.z.R, (float) Math.PI);
               this.U.M = class04995.z(f4, this.U.M, 5.012389F - 1.8707964F * f8);
               this.z.M = class04995.B(f3, this.z.M, 1.2707963F + 1.8707964F * f8);
            } else if (f7 >= 22.0F && f7 < 26.0F) {
               float f5 = (f7 - 22.0F) / 4.0F;
               this.U.i = class04995.z(f4, this.U.i, (float) (Math.PI / 2) - (float) (Math.PI / 2) * f5);
               this.z.i = class04995.B(f3, this.z.i, (float) (Math.PI / 2) - (float) (Math.PI / 2) * f5);
               this.U.R = class04995.z(f4, this.U.R, (float) Math.PI);
               this.z.R = class04995.B(f3, this.z.R, (float) Math.PI);
               this.U.M = class04995.z(f4, this.U.M, (float) Math.PI);
               this.z.M = class04995.B(f3, this.z.M, (float) Math.PI);
            }
         }

         float f9 = 0.3F;
         float f6 = 0.33333334F;
         this.W.i = class04995.B(f, this.W.i, 0.3F * class04995.P(f1 * 0.33333334F + (float) Math.PI));
         this.E.i = class04995.B(f, this.E.i, 0.3F * class04995.P(f1 * 0.33333334F));
      }
   }

   public void N(boolean var1) {
      this.M.U = var1;
      this.B.U = var1;
      this.Z.U = var1;
      this.z.U = var1;
      this.U.U = var1;
      this.E.U = var1;
      this.W.U = var1;
   }

   private float N(float var1) {
      return -65.0F * var1 + var1 * var1;
   }

   @Override
   public class01686 R() {
      return this.M;
   }
}
