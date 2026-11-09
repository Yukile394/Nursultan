package minecraft;

import Nursultan.class11281;
import Nursultan.class11284;
import Nursultan.class11305;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Types;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InteractPacket_Action;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05410 extends class00277<class07492> {
   private float N;
   private float y;
   private boolean L;
   private final class04973 u;
   private class11284 n;

   @Override
   protected boolean L() {
      return false;
   }

   public class05410(class08036 var1) {
      super(
         var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_2,
         new class02411(var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_2),
         var1.method_31548(),
         class00392.L("container.crafting")
      );
      this.z = 97;
      this.u = new class04973(this);
      this.y(null);
   }

   @Override
   protected void u(class01054 var1, int var2, int var3) {
      var1.N(this.field_22793, this.field_22785, this.z, this.U, -12566464, false);
   }

   @Override
   public void u() {
      super.u();
      this.R();
   }

   private void y(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         UserConnection userconnection = ProtocolTranslator.getPlayNetworkUserConnection();
         PacketWrapper packetwrapper = PacketWrapper.create(ServerboundBedrockPackets.INTERACT, userconnection);
         packetwrapper.write(Types.UNSIGNED_BYTE, (short)InteractPacket_Action.OpenInventory.getValue());
         packetwrapper.write(BedrockTypes.UNSIGNED_VAR_LONG, ((EntityTracker)userconnection.get(EntityTracker.class)).getClientPlayer().runtimeId());
         packetwrapper.write(BedrockTypes.OPTIONAL_POSITION_3F, null);
         packetwrapper.sendToServer(BedrockProtocol.class);
      }
   }

   @Override
   protected void y() {
      this.L = true;
   }

   public static void N(class01054 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, class07438 var9) {
      float f = (var1 + var3) / 2.0F;
      float f1 = (var2 + var4) / 2.0F;
      float f2 = (float)Math.atan((f - var7) / 40.0F);
      float f3 = (float)Math.atan((f1 - var8) / 40.0F);
      Quaternionf quaternionf = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf quaternionf1 = new Quaternionf().rotateX(f3 * 20.0F * (float) (Math.PI / 180.0));
      quaternionf.mul(quaternionf1);
      class08800 class08800 = N(var9);
      if (class08800 instanceof class08476 class08476) {
         class08476.x = 180.0F + f2 * 20.0F;
         class08476.D = f2 * 20.0F;
         if (class08476.Nm != class01312.field_18077) {
            class08476.h = -f3 * 20.0F;
         } else {
            class08476.h = 0.0F;
         }

         class08476.s = class08476.s / class08476.NL;
         class08476.T = class08476.T / class08476.NL;
         class08476.NL = 1.0F;
      }

      Vector3f vector3f = new Vector3f(0.0F, class08800.T / 2.0F + var6, 0.0F);
      var0.N(class08800, var5, vector3f, quaternionf, quaternionf1, var1, var2, var3, var4);
   }

   private void N(CallbackInfo var1) {
      this.method_37063(this.n = class11305.N(this, this.field_22789, this.field_22790));
      this.R();
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = this.T;
      int j = this.b;
      var1.N(class08394.Na, i, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      N(var1, i + 26, j + 8, i + 75, j + 78, 30, 0.0625F, this.N, this.y, (class04453)this.field_22787.T_4);
   }

   private static class08800 N(class07438 var0) {
      class08800 class08800 = class06202.Nq().Ng().N(var0).method_62425(var0, 1.0F);
      class08800.G = 15728880;
      class08800.O.clear();
      class08800.l = 0;
      return class08800;
   }

   @Override
   protected class03283 N() {
      return new class03283(this.T + 104, this.field_22790 / 2 - 22);
   }

   @Override
   public void method_25426() {
      if (((class04453)this.field_22787.T_4).method_56992()) {
         this.field_22787
            .N(
               new class01488(
                  (class04453)this.field_22787.T_4,
                  ((class01683)((class04453)this.field_22787.T_4).y_0).G(),
                  ((class05630)this.field_22787.i_7).S().method_41753()
               )
            );
      } else {
         super.method_25426();
         this.N(null);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      this.u.N(var1, var2, var3);
      super.method_25394(var1, var2, var3, var4);
      this.N = var2;
      this.y = var3;
   }

   @Override
   public boolean method_64507() {
      return this.u.N();
   }

   @Override
   public boolean method_25406(class06613 var1) {
      if (this.L) {
         this.L = false;
         return true;
      } else {
         return super.method_25406(var1);
      }
   }

   private void R() {
      this.n.field_22763 = !class11281.y();
      this.n.N();
   }
}
