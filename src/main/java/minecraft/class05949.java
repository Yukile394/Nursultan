package minecraft;

import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public enum class05949 {
   field_24576(class00392.L("gameMode.creative"), class07282.field_9220, new class06584(class00869.Z)),
   field_24577(class00392.L("gameMode.survival"), class07282.field_9215, new class06584(class06570.To)),
   field_24578(class00392.L("gameMode.adventure"), class07282.field_9216, new class06584(class06570.Gt)),
   field_24579(class00392.L("gameMode.spectator"), class07282.field_9219, new class06584(class06570.nG));

   static final class05949[] field_24580 = values();
   private static final int field_32317 = 16;
   private static final int field_32316 = 5;
   final class00392 field_24581;
   final class07282 field_60755;
   private final class06584 field_24583;

   private class05949(class00392 var3, class07282 var4, class06584 var5) {
      this.field_24581 = var3;
      this.field_60755 = var4;
      this.field_24583 = var5;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void N(CallbackInfoReturnable var1) {
      if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
         switch (this) {
            case field_24576:
               var1.setReturnValue(field_24577);
               break;
            case field_24577:
               if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
                  var1.setReturnValue(field_24576);
               } else {
                  var1.setReturnValue(field_24578);
               }
               break;
            case field_24578:
               var1.setReturnValue(field_24576);
         }
      }
   }

   static class05949 N(class07282 var0) {
      return switch (var0) {
         case field_9219 -> field_24579;
         case field_9215 -> field_24577;
         case field_9220 -> field_24576;
         case field_9216 -> field_24578;
      };
   }

   class05949 N() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class05949)callbackinforeturnable.getReturnValue();
      } else {
         return switch (this) {
            case field_24576 -> field_24577;
            case field_24577 -> field_24578;
            case field_24578 -> field_24579;
            case field_24579 -> field_24576;
         };
      }
   }

   void N(class01054 var1, int var2, int var3) {
      var1.N(this.field_24583, var2, var3);
   }
}
