package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07100 extends class06788 implements ICrossCollisionBlock {
   public static final MapCodec<class07100> B = y(class07100::new);
   private class00494[] N;
   private class00494[] Z;

   @Override
   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00389.N();
   }

   public class07100(class01362 var1) {
      super(2.0F, 16.0F, 2.0F, 16.0F, 16.0F, var1);
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false).y(i, false).y(R, false));
      this.N(var1, null);
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)
         ? this.Z[this.viaFabricPlus$getShapeIndex(var1)]
         : super.y_4(var1, var2, var3, var4);
   }

   @Override
   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      if (var2.N(this) || var2.N(class01210.NP) && var1.N(class01210.NP) && var2.y(M.get(var3.b()))) {
         if (!var3.z().L()) {
            return true;
         }

         if (var1.L(M.get(var3)) && var2.L(M.get(var3.b()))) {
            return true;
         }
      }

      return super.y(var1, var2, var3);
   }

   private void N(class01362 var1, CallbackInfo var2) {
      float f = 7.0F;
      float f1 = 9.0F;
      float f2 = 7.0F;
      float f3 = 9.0F;
      class00494 class00494xxxxxx = class00891.N(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
      this.N = new class00494[]{
         class00494xxxxxx,
         class00891.N(7.0, 0.0, 7.0, 9.0, 16.0, 16.0),
         class00891.N(0.0, 0.0, 7.0, 9.0, 16.0, 9.0),
         class00891.N(0.0, 0.0, 7.0, 9.0, 16.0, 16.0),
         class00891.N(7.0, 0.0, 0.0, 9.0, 16.0, 9.0),
         class00891.N(7.0, 0.0, 0.0, 9.0, 16.0, 16.0),
         class00891.N(0.0, 0.0, 0.0, 9.0, 16.0, 9.0),
         class00891.N(0.0, 0.0, 0.0, 9.0, 16.0, 16.0),
         class00891.N(7.0, 0.0, 7.0, 16.0, 16.0, 9.0),
         class00891.N(7.0, 0.0, 7.0, 16.0, 16.0, 16.0),
         class00891.N(0.0, 0.0, 7.0, 16.0, 16.0, 9.0),
         class00891.N(0.0, 0.0, 7.0, 16.0, 16.0, 16.0),
         class00891.N(7.0, 0.0, 0.0, 16.0, 16.0, 9.0),
         class00891.N(7.0, 0.0, 0.0, 16.0, 16.0, 16.0),
         class00891.N(0.0, 0.0, 0.0, 16.0, 16.0, 9.0),
         class00389.y()
      };
      class00494 class00494x = class00891.N(7.0, 0.0, 0.0, 9.0, 16.0, 8.0);
      class00494 class00494xx = class00891.N(7.0, 0.0, 8.0, 9.0, 16.0, 16.0);
      class00494 class00494xxx = class00891.N(0.0, 0.0, 7.0, 8.0, 16.0, 9.0);
      class00494 class00494xxxx = class00891.N(8.0, 0.0, 7.0, 16.0, 16.0, 9.0);
      class00494 class00494xxxxx = class00389.N(class00494x, class00494xxxx);
      class00494 class00494xxxxxx = class00389.N(class00494xx, class00494xxx);
      this.Z = new class00494[]{
         class00494xxxxxx,
         class00494xx,
         class00494xxx,
         class00494xxxxxx,
         class00494x,
         class00389.N(class00494xx, class00494x),
         class00389.N(class00494xxx, class00494x),
         class00389.N(class00494xxxxxx, class00494x),
         class00494xxxx,
         class00389.N(class00494xx, class00494xxxx),
         class00389.N(class00494xxx, class00494xxxx),
         class00389.N(class00494xxxxxx, class00494xxxx),
         class00494xxxxx,
         class00389.N(class00494xx, class00494xxxxx),
         class00389.N(class00494xxx, class00494xxxxx),
         class00389.N(class00494xxxxxx, class00494xxxxx)
      };
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return DebugSettings.INSTANCE.legacyPaneOutlines.isEnabled() ? this.N[this.viaFabricPlus$getShapeIndex(var1)] : super.N(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<? extends class07100> N() {
      return B;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, i, u, R);
   }

   public final boolean N(class00500 var1, boolean var2) {
      return !m(var1) && var2 || var1.i() instanceof class07100 || var1.N(class01210.q);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(R)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5.z().L() ? var1.y(M.get(var5), this.N(var7, var7.L(var2, var6, var5.b()))) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      LocalIntRefImpl localintrefimpl = new LocalIntRefImpl();
      localintrefimpl.init(0);
      class07299 class07299 = var1.method_8045();
      class07209 class07209xx = var1.method_8037();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      class07209 class07209x = class07209xx.method_10095();
      class07209 class07209xx = class07209xx.method_10072();
      class07209 class07209xxx = class07209xx.method_10067();
      class07209 class07209xxxx = class07209xx.method_10078();
      class00500 class00500xx = class07299.method_8320(class07209x);
      class00500 class00500x = class07299.method_8320(class07209xx);
      class00500 class00500xx = class07299.method_8320(class07209xxx);
      class00500 class00500xxx = class07299.method_8320(class07209xxxx);
      class00500 class00500xxxx = this.W();
      class06667 class06667 = y;
      boolean flag = class00500xx.L(class07299, class07209x, class07211.field_11035);
      class00500xxxx = class00500xxxx.y(class06667, this.N(this, class00500xx, flag, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
         return ((class07100)var0[0]).N((class00500)var0[1], (Boolean)var0[2]);
      }, localintrefimpl));
      class06667 = u;
      flag = class00500x.L(class07299, class07209xx, class07211.field_11043);
      class00500xxxx = class00500xxxx.y(class06667, this.N(this, class00500x, flag, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
         return ((class07100)var0[0]).N((class00500)var0[1], (Boolean)var0[2]);
      }, localintrefimpl));
      class06667 = i;
      flag = class00500xx.L(class07299, class07209xxx, class07211.field_11034);
      class00500xxxx = class00500xxxx.y(class06667, this.N(this, class00500xx, flag, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
         return ((class07100)var0[0]).N((class00500)var0[1], (Boolean)var0[2]);
      }, localintrefimpl));
      class06667 = L;
      flag = class00500xxx.L(class07299, class07209xxxx, class07211.field_11039);
      class00500 class00500xxxxx;
      class00500xxxx = class00500xxxxx = class00500xxxx.y(class06667, this.N(this, class00500xxx, flag, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_2389, net.minecraft.class_2680, boolean]");
         return ((class07100)var0[0]).N((class00500)var0[1], (Boolean)var0[2]);
      }, localintrefimpl)).y(R, class04688.N() == class04684.L);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00500xxxxx);
      this.N(var1, callbackinforeturnable, localintrefimpl);
      return callbackinforeturnable.isCancelled() ? (class00500)callbackinforeturnable.getReturnValue() : class00500xxxx;
   }

   private boolean N(class07100 var1, class00500 var2, boolean var3, Operation var4, LocalIntRef var5) {
      boolean flag = (Boolean)var4.call(new Object[]{var1, var2, var3});
      if (flag) {
         var5.set(var5.get() + 1);
      }

      return flag;
   }

   private void N(class06942 var1, CallbackInfoReturnable var2, LocalIntRef var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && var3.get() == 0) {
         var2.setReturnValue(((class00500)var2.getReturnValue()).y(y, true).y(u, true).y(i, true).y(L, true));
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var5.setReturnValue(this.y_4(var1, var2, var3, var4));
      }
   }
}
