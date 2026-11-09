package minecraft;

import Nursultan.class11385;
import Nursultan.class11938;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04462 extends class04474 {
   private final class05630 N;

   public class04462(class05630 var1) {
      super();
      this.N = var1;
   }

   private void N(CallbackInfo var1) {
      class11385 class11385 = class11385.N(
         this.field_54155.N(),
         this.field_54155.y(),
         this.field_54155.L(),
         this.field_54155.u(),
         this.field_54155.i(),
         this.field_54155.R(),
         this.field_54155.M()
      );
      class11938.L().L(class11385);
      this.field_54155 = class11385.z();
      ((class05630)class06202.Nq().i_7).k.N(this.field_54155.M());
   }

   private class07109 N(class07109 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? var1 : var1.N();
   }

   public static float N(boolean var0, boolean var1) {
      if (var0 == var1) {
         return 0.0F;
      } else {
         return var0 ? 1.0F : -1.0F;
      }
   }

   @Override
   public void method_3129() {
      this.field_54155 = new class08687(this.N.n.R(), this.N.G.R(), this.N.t.R(), this.N.l.R(), this.N.d.R(), this.N.w.R(), this.N.k.R());
      this.N(null);
      float f = N(this.field_54155.N(), this.field_54155.y());
      float f1 = N(this.field_54155.L(), this.field_54155.u());
      class07109 class07109 = new class07109(f1, f);
      this.field_55868 = this.N(class07109);
   }
}
