package minecraft;

import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.features.networking.remove_signed_commands.SignedCommands1_21_6;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05954 extends class05096 {
   static final class01894 N = class01894.y("gamemode_switcher/slot");
   static final class01894 y = class01894.y("gamemode_switcher/selection");
   private static final class01894 L = class01894.y("textures/gui/container/gamemode_switcher.png");
   private static final int u = 128;
   private static final int i = 128;
   private static final int R = 26;
   private static final int M = 5;
   private static final int B = 31;
   private static final int Z = 5;
   private static int z = class05949.values().length * 31 - 5;
   private final class05949 U;
   private class05949 E;
   private int W;
   private int m;
   private boolean P;
   private final List<class05951> s = Lists.newArrayList();
   private class05949[] T;

   private class05949[] L() {
      return ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6) ? this.T : class05949.values();
   }

   public class05954() {
      super(class05153.N);
      this.U = class05949.N(this.N());
      this.E = this.U;
      this.N(null);
   }

   private void y() {
      N(this.field_22787, this.E);
   }

   private void y(CallbackInfo var1) {
      if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
         this.method_25419();
      }
   }

   private static void N(class01683 var0, class00381 var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && var1 instanceof class09008 class09008x) {
         class09008 class09008x = class09008x;

         try {
            class07282 = class09008x.N();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         SignedCommands1_21_6.sendGameMode(class07282);
      } else {
         var0.N(var1);
      }
   }

   private void N(CallbackInfo var1) {
      if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
         ArrayList arraylist = new ArrayList<>(Arrays.stream(class05949.values()).toList());
         arraylist.remove(class05949.field_24579);
         if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
            arraylist.remove(class05949.field_24578);
         }

         this.T = arraylist.toArray(class05949[]::new);
         z = this.T.length * 31 - 5;
      }
   }

   private class07282 N() {
      class03443 class03443 = (class03443)class06202.Nq().T_2;
      class07282 class07282 = class03443.z();
      if (class07282 != null) {
         return class07282;
      } else {
         return class03443.U() == class07282.field_9220 ? class07282.field_9215 : class07282.field_9220;
      }
   }

   private static void N(class06202 var0, class05949 var1) {
      if (var0.T()) {
         class05949 class05949 = class05949.N(((class03443)var0.T_2).U());
         if (var1 != class05949 && class01557.N.N(((class04453)var0.T_4).method_75004())) {
            N((class01683)((class04453)var0.T_4).y_0, new class09008(var1.field_60755));
         }
      }
   }

   @Override
   public void method_25426() {
      this.y(null);
      super.method_25426();
      this.s.clear();
      this.E = this.U;

      for (int ix = 0; ix < this.L().length; ix++) {
         class05949 class05949 = this.L()[ix];
         this.s.add(new class05951(class05949, this.field_22789 / 2 - z / 2 + ix * 31, this.field_22790 / 2 - 31));
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (((class05630)this.field_22787.i_7).NZ.N(var1)) {
         this.P = false;
         this.E = this.E.N();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      int ix = this.field_22789 / 2 - 62;
      int j = this.field_22790 / 2 - 31 - 27;
      var1.N(class08394.Na, L, ix, j, 0.0F, 0.0F, 125, 75, 128, 128);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      var1.N(this.field_22793, this.E.field_24581, this.field_22789 / 2, this.field_22790 / 2 - 31 - 20, -1);
      class05216 class05216 = class00392.N("debug.gamemodes.select_next", ((class05630)this.field_22787.i_7).NZ.m().L().N(class06541.field_1075));
      var1.N(this.field_22793, class05216, this.field_22789 / 2, this.field_22790 / 2 + 5, -1);
      if (!this.P) {
         this.W = var2;
         this.m = var3;
         this.P = true;
      }

      boolean flag = this.W == var2 && this.m == var3;

      for (class05951 class05951 : this.s) {
         class05951.method_25394(var1, var2, var3, var4);
         class05951.N(this.E == class05951.N);
         if (!flag && class05951.method_25367()) {
            this.E = class05951.N;
         }
      }
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public boolean method_25406(class06613 var1) {
      if (((class05630)this.field_22787.i_7).r.N(var1)) {
         this.y();
         this.field_22787.N(null);
         return true;
      } else {
         return super.method_25406(var1);
      }
   }

   @Override
   public boolean method_16803(class06601 var1) {
      if (((class05630)this.field_22787.i_7).r.N(var1)) {
         this.y();
         this.field_22787.N(null);
         return true;
      } else {
         return super.method_16803(var1);
      }
   }
}
