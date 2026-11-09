package minecraft;

import Nursultan.class10953;
import Nursultan.class11528;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.maxhenkel.voicechat.events.RenderEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager.RenderNameplateEvent;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08287<AvatarlikeEntity extends class06600 & class06618> extends class02294<AvatarlikeEntity, class08468, class02721> {
   public class01894 L(class08468 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class01894)callbackinforeturnable.getReturnValue() : var1.N.N().y();
   }

   private void L(AvatarlikeEntity var1, class08468 var2, float var3) {
      class06602 class06602 = ((class06618)var1).B();
      double d0 = class06602.y(var3) - class04995.u((double)var3, var1.field_6014, var1.method_23317());
      double d1 = class06602.L(var3) - class04995.u((double)var3, var1.field_6036, var1.method_23318());
      double d2 = class06602.u(var3) - class04995.u((double)var3, var1.field_5969, var1.method_23321());
      float f = class04995.Z(var3, var1.fields_4212a028292fd3c078969e3ee4c71d9e8_1, var1.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
      double d3 = class04995.m(f * (float) (Math.PI / 180.0));
      double d4 = -class04995.P(f * (float) (Math.PI / 180.0));
      var2.y = (float)d1 * 10.0F;
      var2.y = class04995.N(var2.y, -6.0F, 32.0F);
      var2.a = (float)(d0 * d3 + d2 * d4) * 100.0F;
      var2.a = var2.a * (1.0F - var2.N());
      var2.a = class04995.N(var2.a, 0.0F, 150.0F);
      var2.p = (float)(d0 * d4 - d2 * d3) * 100.0F;
      var2.p = class04995.N(var2.p, -20.0F, 20.0F);
      float f1 = class06602.R(var3);
      float f2 = class06602.B(var3);
      var2.y = var2.y + class04995.m(f2 * 6.0F) * 32.0F * f1;
   }

   public class08287(class04832 var1, boolean var2) {
      super(var1, new class02721(var1.N(var2 ? class04802.LK : class04802.Lg), var2), 0.5F);
      this.N(new class02562<>(this, class08118.N(var2 ? class04802.LV : class04802.Lq, var1.R(), var1x -> new class02721(var1x, var2)), var1.B()));
      this.N(new class06368<>(this));
      this.N(new class02554<>(this, var1));
      this.N(new class02241(this, var1.R()));
      this.N(new class02549(this, var1.R(), var1.M()));
      this.N(new class02245<>(this, var1.R(), var1.U()));
      this.N(new class02242<>(this, var1.R(), var1.B()));
      this.N(new class02600(this, var1.R()));
      this.N(new class02440(this, var1.R()));
      this.N(new class05489<>(this, var1));
   }

   private boolean u(class08468 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_11_1) && var1.Z;
   }

   public class08468 method_55269() {
      return new class08468();
   }

   private void y(AvatarlikeEntity var1, class08468 var2, float var3) {
      var2.Nl = var1.method_6003() + var3;
      class06889 class06889x = var1.method_5828(var3);
      class06889 class06889x = ((class06618)var1).B().N().N(var1.method_18798(), (double)var3);
      if (class06889x.z() > 1.0E-5F && class06889x.z() > 1.0E-5F) {
         var2.Nd = true;
         double d0 = class06889x.R().u().y(class06889x.R().u());
         double d1 = class06889x.M * class06889x.Z - class06889x.Z * class06889x.M;
         var2.Nw = (float)(Math.signum(d1) * Math.acos(Math.min(1.0, Math.abs(d0))));
      } else {
         var2.Nd = false;
         var2.Nw = 0.0F;
      }
   }

   public void y(class01421 var1, class01237 var2, int var3, class01894 var4, boolean var5) {
      this.N(var1, var2, var3, var4, this.y.U, var5);
   }

   public class06889 method_23169(class08468 var1) {
      class06889 class06889xx = super.method_23169(var1);
      if (this.u(var1)) {
         class06889 class06889x;
         class06889 class06889xx = class06889x = class06889xx.y(0.0, var1.NL * -2.0F / 16.0, 0.0);
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class06889x);
         this.y(var1, callbackinforeturnable1);
         return callbackinforeturnable1.isCancelled() ? (class06889)callbackinforeturnable1.getReturnValue() : class06889xx;
      } else {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class06889xx);
         this.y(var1, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? (class06889)callbackinforeturnable.getReturnValue() : class06889xx;
      }
   }

   private void y(class08468 var1, CallbackInfoReturnable var2) {
      if (var1.Nm == class01312.field_18078) {
         class07211 class07211 = var1.NW;
         if (class07211 != null) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
               var2.setReturnValue(((class06889)var2.getReturnValue()).N(class07211.P() * 0.4, 0.0, class07211.T() * 0.4));
            }

            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_5tob1_5_2)) {
               var2.setReturnValue(((class06889)var2.getReturnValue()).N(class07211.P() * 0.1, 0.0, class07211.T() * 0.1));
            }

            if (ProtocolTranslator.getTargetVersion().betweenInclusive(LegacyProtocolVersion.b1_6tob1_6_6, ProtocolVersion.v1_7_6)) {
               var2.setReturnValue(((class06889)var2.getReturnValue()).N(0.0, 0.3F, 0.0));
            }
         }
      }
   }

   private void N(
      class01237 var1,
      class01421 var2,
      class06889 var3,
      int var4,
      class00392 var5,
      boolean var6,
      int var7,
      double var8,
      class06959 var10,
      Operation var11,
      LocalRef var12,
      LocalRef var13
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11, (class08468)var12.get(), (class01237)var13.get());
   }

   private void N(
      class01237 var1,
      class01421 var2,
      class06889 var3,
      int var4,
      class00392 var5,
      boolean var6,
      int var7,
      double var8,
      class06959 var10,
      Operation var11,
      class08468 var12,
      class01237 var13
   ) {
      var11.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var10});
      ((RenderNameplateEvent)RenderEvents.RENDER_NAMEPLATE.invoker()).render(var12, var10, var2, var13);
   }

   private static void N(class06600 var0, class06584 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (var0 != (class04453)class06202.Nq().T_4 && var0 instanceof class08036 class08036 && !var1.R()) {
         boolean flag = class11528.N(class08036, false);
         if (class08036.method_6058() == var2 && class08036.method_6014() > 0 && var1.G() == class06509.field_8949) {
            var3.setReturnValue(flag ? class01180.field_3406 : class01180.field_3410);
         } else if (flag && !class08036.fields_0212a028292fd3c078969e3ee4c71d9e8_4 && var1.N(class06570.dw) && class06593.u(var1)) {
            var3.setReturnValue(class01180.field_3410);
         }
      }
   }

   public void N(class08468 var1, CallbackInfoReturnable var2) {
      class10953 class10953 = class10953.N(var1, var1.N.N().y());
      class11938.L().L(class10953);
      var2.setReturnValue(class10953.y());
   }

   public void method_62354(AvatarlikeEntity var1, class08468 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class04256.N(var1, var2, var3, this.L);
      var2.NV = N(var1, class07070.field_6182);
      var2.No = N(var1, class07070.field_6183);
      var2.N = ((class06618)var1).Z();
      var2.F = var1.method_6022();
      var2.A = var1.method_21753();
      var2.f = var1.method_7325();
      var2.C = var1.method_74091(class08030.field_7563);
      var2.S = var1.method_74091(class08030.field_7564);
      var2.Nj = var1.method_74091(class08030.field_7566);
      var2.Nv = var1.method_74091(class08030.field_7565);
      var2.Nn = var1.method_74091(class08030.field_7568);
      var2.Nt = var1.method_74091(class08030.field_7570);
      var2.NG = var1.method_74091(class08030.field_7559);
      this.y((AvatarlikeEntity)var1, var2, var3);
      this.L((AvatarlikeEntity)var1, var2, var3);
      if (var2.j < 100.0) {
         var2.Nk = ((class06618)var1).z();
      } else {
         var2.Nk = null;
      }

      var2.NY = ((class06618)var1).y(true);
      var2.NQ = ((class06618)var1).y(false);
      var2.NO = var1.method_5628();
      var2.Ng = ((class06618)var1).U();
      var2.NI.y();
      if (var2.o) {
         class06584 class06584 = var1.method_5998(var2.B);
         if (class06584.N(class06570.vy)) {
            this.L.N(var2.NI, class06584, class03662.field_4316, (class07438)var1);
         }
      }
   }

   protected boolean method_3921(AvatarlikeEntity var1, double var2) {
      return super.method_3921(var1, var2) && (var1.method_5733() || var1.method_16914() && var1 == this.field_4676.L);
   }

   public void N(class01421 var1, class01237 var2, int var3, class01894 var4, boolean var5) {
      this.N(var1, var2, var3, var4, this.y.z, var5);
   }

   protected boolean N(class08468 var1) {
      return !var1.f;
   }

   private static class01180 N(class06600 var0, class07070 var1) {
      class06584 class06584x = var0.method_5998(class07050.field_5808);
      class06584 class06584x = var0.method_5998(class07050.field_5810);
      class01180 class01180x = N(var0, class06584x, class07050.field_5808);
      class01180 class01180x = N(var0, class06584x, class07050.field_5810);
      if (class01180x.N()) {
         class01180x = class06584x.R() ? class01180.field_3409 : class01180.field_3410;
      }

      return var0.method_6068() == var1 ? class01180x : class01180x;
   }

   private static class01180 N(class06600 var0, class06584 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class01180)callbackinforeturnable.getReturnValue();
      } else if (var1.R()) {
         return class01180.field_3409;
      } else if (!var0.fields_0212a028292fd3c078969e3ee4c71d9e8_4 && var1.N(class06570.dw) && class06593.u(var1)) {
         return class01180.field_3408;
      } else {
         if (var0.method_6058() == var2 && var0.method_6014() > 0) {
            class06509 class06509 = var1.G();
            if (class06509 == class06509.field_8949) {
               return class01180.field_3406;
            }

            if (class06509 == class06509.field_8953) {
               return class01180.field_3403;
            }

            if (class06509 == class06509.field_63380) {
               return class01180.field_63542;
            }

            if (class06509 == class06509.field_8947) {
               return class01180.field_3405;
            }

            if (class06509 == class06509.field_27079) {
               return class01180.field_27434;
            }

            if (class06509 == class06509.field_39058) {
               return class01180.field_39071;
            }

            if (class06509 == class06509.field_42717) {
               return class01180.field_42877;
            }

            if (class06509 == class06509.field_8951) {
               return class01180.field_63543;
            }
         }

         class08186 class08186 = var1.method_58694(class02484.a);
         if (class08186 != null && class08186.N() == class08155.field_63400 && var0.fields_0212a028292fd3c078969e3ee4c71d9e8_4) {
            return class01180.field_63543;
         } else {
            return var1.N(class01226.LR) ? class01180.field_63543 : class01180.field_3410;
         }
      }
   }

   protected void y(class08468 var1, class01421 var2) {
      float f = 0.9375F;
      var2.y(0.9375F, 0.9375F, 0.9375F);
   }

   protected void method_3926(class08468 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      int i = var1.Ng ? -10 : 0;
      if (var1.Nk != null) {
         var3.N(var2, var1.k, i, var1.Nk, !var1.n, var1.G, var1.j, var4);
         var2.N(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      if (var1.w != null) {
         boolean flag1 = !var1.n;
         double d0 = var1.j;
         int j = var1.G;
         boolean flag = flag1;
         class00392 class00392 = var1.w;
         class06889 class06889 = var1.k;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0,
               9,
               "[net.minecraft.class_11659, net.minecraft.class_4587, net.minecraft.class_243, int, net.minecraft.class_2561, boolean, int, double, net.minecraft.class_12075]"
            );
            ((class01237)var0[0])
               .N(
                  (class01421)var0[1],
                  (class06889)var0[2],
                  (Integer)var0[3],
                  (class00392)var0[4],
                  (Boolean)var0[5],
                  (Integer)var0[6],
                  (Double)var0[7],
                  (class06959)var0[8]
               );
            return (Void)null;
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         LocalRefImpl localrefimpl1 = new LocalRefImpl();
         localrefimpl.init(var1);
         localrefimpl1.init(var3);
         this.N(var3, var2, class06889, i, class00392, flag, j, d0, var4, operation, localrefimpl, localrefimpl1);
         var3 = (class01237)localrefimpl1.dispose();
         var1 = (class08468)localrefimpl.dispose();
      }

      var2.y();
   }

   public static boolean N(class08036 var0) {
      return N(var0.method_7334().name());
   }

   private void N(class01421 var1, class01237 var2, int var3, class01894 var4, class01686 var5, boolean var6) {
      class02721 class02721 = this.L();
      var5.L();
      var5.U = true;
      class02721.b.U = var6;
      class02721.j.U = var6;
      class02721.U.M = -0.1F;
      class02721.z.M = 0.1F;
      var2.N(var5, var1, class06851.z(var4), var3, class01384.u, null);
   }

   public boolean N(AvatarlikeEntity var1) {
      if (var1.method_74091(class08030.field_7559)) {
         return var1 instanceof class08036 ? N((class08036)var1) : super.N(var1);
      } else {
         return false;
      }
   }

   protected void y(class08468 var1, class01421 var2, float var3, float var4) {
      float f = var1.L;
      float f1 = var1.h;
      if (var1.g) {
         super.y(var1, var2, var3, var4);
         float f2 = var1.N();
         if (!var1.Nz) {
            var2.N(class02058.y.N(f2 * (-90.0F - f1)));
         }

         if (var1.Nd) {
            var2.N(class02058.u.rotation(var1.Nw));
         }
      } else if (f > 0.0F) {
         super.y(var1, var2, var3, var4);
         float f4 = var1.NZ ? -90.0F - f1 : -90.0F;
         float f3 = class04995.B(f, 0.0F, f4);
         var2.N(class02058.y.N(f3));
         if (var1.I) {
            var2.N(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.y(var1, var2, var3, var4);
      }
   }
}
