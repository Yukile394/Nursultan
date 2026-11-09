package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

public class class03258 extends MessageToMessageEncoder<class00381<?>> {
   private final class03276 N;

   public class03258(class03276 var1) {
      super();
      this.N = var1;
   }

   protected void encode(ChannelHandlerContext var1, class00381<?> var2, List<Object> var3) throws Exception {
      this.N.N(var2, var3::add);
      if (var2.R()) {
         var1.pipeline().remove(var1.name());
      }
   }
}
