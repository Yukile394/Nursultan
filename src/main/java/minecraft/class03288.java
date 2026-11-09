package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class03288 extends MessageToMessageDecoder<class00381<?>> {
   private final class03276 N;
   @Nullable
   private class03257 y;

   public class03288(class03276 var1) {
      super();
      this.N = var1;
   }

   protected void decode(ChannelHandlerContext var1, class00381<?> var2, List<Object> var3) throws Exception {
      if (this.y != null) {
         N(var2);
         class00381<?> class00381 = this.y.N(var2);
         if (class00381 != null) {
            this.y = null;
            var3.add(class00381);
         }
      } else {
         class03257 class03257 = this.N.N(var2);
         if (class03257 != null) {
            N(var2);
            this.y = class03257;
         } else {
            var3.add(var2);
            if (var2.R()) {
               var1.pipeline().remove(var1.name());
            }
         }
      }
   }

   private static void N(class00381<?> var0) {
      if (var0.R()) {
         throw new DecoderException("Terminal message received in bundle");
      }
   }
}
