package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07343 implements class00381<class08051> {
   public static final class02362<class00667, class07343> N = class00381.N(class07343::N, class07343::new);
   private static final int y = 2;
   private final boolean L;
   private class08033 u;

   public class07343(class08033 var1) {
      super();
      this.L = var1.y;
      this.N(var1, null);
   }

   private class07343(class00667 var1) {
      super();
      byte b0 = var1.readByte();
      this.L = (b0 & 2) != 0;
   }

   public boolean N() {
      return this.L;
   }

   private void N(class08033 var1, CallbackInfo var2) {
      this.u = var1;
   }

   private class00667 N(class00667 var1, int var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         if (this.u.N) {
            var2 |= 1;
         }

         if (this.u.L) {
            var2 |= 4;
         }

         if (this.u.u) {
            var2 |= 8;
         }
      }

      return var1.writeByte(var2);
   }

   private void N(class00667 var1) {
      byte b0 = 0;
      if (this.L) {
         b0 = (byte)(b0 | 2);
      }

      this.N(var1, b0);
   }

   public void method_65081(class08051 var1) {
      var1.method_12083(this);
   }

   @Override
   public class02897<class07343> method_65080() {
      return class04248.yh;
   }
}
