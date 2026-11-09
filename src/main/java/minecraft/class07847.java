package minecraft;

import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse;
import net.fabricmc.fabric.impl.networking.payload.PayloadHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public record class07847(int transactionId, class04191 payload) implements class00381<class07845> {
   public static final class02362<class00667, class07847> N = class00381.N(class07847::L, class07847::N);
   private static final int u = 1048576;

   private void L(class00667 var1) {
      var1.L(this.transactionId);
      var1.N(this.payload, (var0, var1x) -> var1x.method_52295(var0));
   }

   public class07847(int transactionId, @Nullable class04191 payload) {
      this.transactionId = transactionId;
      this.payload = payload;
   }

   private static class04191 y(class00667 var0) {
      int i = var0.readableBytes();
      if (i >= 0 && i <= 1048576) {
         var0.skipBytes(i);
         return class04185.N;
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Nullable
   public class04191 y() {
      return this.payload;
   }

   public void method_65081(class07845 var1) {
      var1.N(this);
   }

   private static class07847 N(class00667 var0) {
      int i = var0.E();
      return new class07847(i, N(i, var0));
   }

   private static void N(int var0, class00667 var1, CallbackInfoReturnable var2) {
      if (!var1.readBoolean()) {
         var2.setReturnValue(null);
      } else {
         var2.setReturnValue(new PacketByteBufLoginQueryResponse(PayloadHelper.read(var1, u)));
      }
   }

   private static class04191 N(int var0, class00667 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class04191)callbackinforeturnable.getReturnValue() : y(var1);
   }

   public int N() {
      return this.transactionId;
   }

   @Override
   public class02897<class07847> method_65080() {
      return class04271.R;
   }
}
