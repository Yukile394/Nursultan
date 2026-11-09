package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Function;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00730 extends class06788 implements ICrossCollisionBlock {
   public static final MapCodec<class00730> N = y(class00730::new);
   private final Function<class00500, class00494> B;
   private final class00494[] Z = new class00494[]{
      class00389.N(0.375, 0.0, 0.375, 0.625, 1.0, 0.625),
      class00389.N(0.375, 0.0, 0.375, 0.625, 1.0, 1.0),
      class00389.N(0.0, 0.0, 0.375, 0.625, 1.0, 0.625),
      class00389.N(0.0, 0.0, 0.375, 0.625, 1.0, 1.0),
      class00389.N(0.375, 0.0, 0.0, 0.625, 1.0, 0.625),
      class00389.N(0.375, 0.0, 0.0, 0.625, 1.0, 1.0),
      class00389.N(0.0, 0.0, 0.0, 0.625, 1.0, 0.625),
      class00389.N(0.0, 0.0, 0.0, 0.625, 1.0, 1.0),
      class00389.N(0.375, 0.0, 0.375, 1.0, 1.0, 0.625),
      class00389.N(0.375, 0.0, 0.375, 1.0, 1.0, 1.0),
      class00389.N(0.0, 0.0, 0.375, 1.0, 1.0, 0.625),
      class00389.N(0.0, 0.0, 0.375, 1.0, 1.0, 1.0),
      class00389.N(0.375, 0.0, 0.0, 1.0, 1.0, 0.625),
      class00389.N(0.375, 0.0, 0.0, 1.0, 1.0, 1.0),
      class00389.N(0.0, 0.0, 0.0, 1.0, 1.0, 0.625),
      class00389.N(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)
   };
   private final class00494 O = class00891.N(0.0, 0.0, 0.0, 16.0, 24.0, 16.0);
   private class00494[] F;
   private class00494[] A;

   @Override
   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.N(var1, var2, var3, var4);
   }

   public class00730(class01362 var1) {
      super(4.0F, 16.0F, 4.0F, 16.0F, 24.0F, var1);
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false).y(i, false).y(R, false));
      this.B = this.N(4.0F, 16.0F, 2.0F, 6.0F, 15.0F);
      this.N(var1, null);
   }

   private boolean U(class00500 var1) {
      return var1.N(class01210.A) && var1.N(class01210.U) == this.W().N(class01210.U);
   }

   @Override
   protected class00494 z(class00500 var1) {
      return this.B.apply(var1);
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
         return this.O;
      } else {
         return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)
            ? this.F[this.viaFabricPlus$getShapeIndex(var1)]
            : super.y_4(var1, var2, var3, var4);
      }
   }

   private void N(class01362 var1, CallbackInfo var2) {
      this.F = this.N(24.0F);
      this.A = this.N(16.0F);
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
         return (class07082)(var1.N(class06570.Gr) ? class07082.N : class07082.i);
      } else {
         return (class07082)(ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_10)
            ? class07082.N
            : super.N(var1, var2, var3, var4, var5, var6, var7));
      }
   }

   private class00494[] N(float var1) {
      float f = 6.0F;
      float f1 = 10.0F;
      float f2 = 6.0F;
      float f3 = 10.0F;
      class00494 class00494xxxx = class00891.N(6.0, 0.0, 6.0, 10.0, var1, 10.0);
      class00494 class00494x = class00891.N(6.0, 0.0, 0.0, 10.0, var1, 10.0);
      class00494 class00494xx = class00891.N(6.0, 0.0, 6.0, 10.0, var1, 16.0);
      class00494 class00494xxx = class00891.N(0.0, 0.0, 6.0, 10.0, var1, 10.0);
      class00494 class00494xxxx = class00891.N(6.0, 0.0, 6.0, 16.0, var1, 10.0);
      class00494[] aclass00494 = new class00494[]{
         class00389.N(),
         class00891.N(6.0, 0.0, 6.0, 10.0, var1, 16.0),
         class00891.N(0.0, 0.0, 6.0, 10.0, var1, 10.0),
         class00891.N(0.0, 0.0, 6.0, 10.0, var1, 16.0),
         class00891.N(6.0, 0.0, 0.0, 10.0, var1, 10.0),
         class00389.N(class00494xx, class00494x),
         class00891.N(0.0, 0.0, 0.0, 10.0, var1, 10.0),
         class00891.N(0.0, 0.0, 1.0, 10.0, var1, 16.0),
         class00891.N(6.0, 0.0, 6.0, 16.0, var1, 10.0),
         class00891.N(6.0, 0.0, 6.0, 16.0, var1, 16.0),
         class00389.N(class00494xxx, class00494xxxx),
         class00891.N(1.0, 0.0, 6.0, 16.0, var1, 16.0),
         class00891.N(6.0, 0.0, 0.0, 16.0, var1, 10.0),
         class00891.N(6.0, 0.0, 0.0, 16.0, var1, 15.0),
         class00891.N(1.0, 0.0, 0.0, 16.0, var1, 10.0),
         class00891.N(0.0, 0.0, 0.0, 16.0, var1, 16.0)
      };

      for (int i = 0; i < 16; i++) {
         aclass00494[i] = class00389.N(class00494xxxx, aclass00494[i]);
      }

      return aclass00494;
   }

   private void N(class00500 var1, boolean var2, class07211 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && !Block1_14.isExceptBlockForAttachWithPiston(var1.i())) {
         var4.setReturnValue(false);
      }
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
         return class00389.y();
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)) {
         return this.A[this.viaFabricPlus$getShapeIndex(var1)];
      } else {
         return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)
            ? this.Z[this.viaFabricPlus$getShapeIndex(var1)]
            : super.N(var1, var2, var3, var4);
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      return (class07082)(!var2.method_8608() ? class06553.N(var4, var2, var3) : class07082.i);
   }

   public boolean N(class00500 var1, boolean var2, class07211 var3) {
      class00891 class00891 = var1.i();
      boolean flag = this.U(var1);
      boolean flag1 = class00891 instanceof class07188 && class07188.N(var1, var3);
      boolean flag2;
      boolean flag3 = flag2 = !m(var1) && var2 || flag || flag1;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag2);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag3;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class00730> N() {
      return N;
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209xxxx = var1.method_8037();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      class07209 class07209x = class07209xxxx.method_10095();
      class07209 class07209xx = class07209xxxx.method_10078();
      class07209 class07209xxx = class07209xxxx.method_10072();
      class07209 class07209xxxx = class07209xxxx.method_10067();
      class00500 class00500xxx = class07299.method_8320(class07209x);
      class00500 class00500x = class07299.method_8320(class07209xx);
      class00500 class00500xx = class07299.method_8320(class07209xxx);
      class00500 class00500xxx = class07299.method_8320(class07209xxxx);
      return super.N(var1)
         .y(y, this.N(class00500xxx, class00500xxx.L(class07299, class07209x, class07211.field_11035), class07211.field_11035))
         .y(L, this.N(class00500x, class00500x.L(class07299, class07209xx, class07211.field_11039), class07211.field_11039))
         .y(u, this.N(class00500xx, class00500xx.L(class07299, class07209xxx, class07211.field_11043), class07211.field_11043))
         .y(i, this.N(class00500xxx, class00500xxx.L(class07299, class07209xxxx, class07211.field_11034), class07211.field_11034))
         .y(R, class04688.N() == class04684.L);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(R)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5.z().L() ? var1.y(M.get(var5), this.N(var7, var7.L(var2, var6, var5.b()), var5.b())) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, i, u, R);
   }
}
