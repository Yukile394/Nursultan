package minecraft;

import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload;
import net.fabricmc.fabric.impl.networking.payload.PayloadHelper;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public record class07812(int transactionId, class04155 payload) implements class00381<class07844> {
   public static final class02362<class00667, class07812> N = class00381.N(class07812::N, class07812::new);
   private static final int u = 1048576;

   private class07812(class00667 var1) {
      this(var1.E(), N(var1.T(), var1));
   }

   public class07812(int transactionId, class04155 payload) {
      super();
      this.transactionId = transactionId;
      this.payload = payload;
   }

   private static class04177 y(class01894 var0, class00667 var1) {
      int i = var1.readableBytes();
      if (i >= 0 && i <= 1048576) {
         var1.skipBytes(i);
         return new class04177(var0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public class04155 y() {
      return this.payload;
   }

   private static class04155 N(class01894 var0, class00667 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, callbackinforeturnable);
      return (class04155)(callbackinforeturnable.isCancelled() ? (class04155)callbackinforeturnable.getReturnValue() : y(var0, var1));
   }

   private static void N(class01894 var0, class00667 var1, CallbackInfoReturnable var2) {
      var2.setReturnValue(new PacketByteBufLoginQueryRequestPayload(var0, PayloadHelper.read(var1, u)));
   }

   private void N(class00667 var1) {
      var1.L(this.transactionId);
      var1.N(this.payload.comp_1571());
      this.payload.method_52296(var1);
   }

   public void method_65081(class07844 var1) {
      var1.N(this);
   }

   public int N() {
      return this.transactionId;
   }

   @Override
   public class02897<class07812> method_65080() {
      return class04271.N;
   }
}
