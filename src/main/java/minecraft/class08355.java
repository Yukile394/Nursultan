package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class class08355 extends ChannelOutboundHandlerAdapter {
   public class08355() {
      super();
   }

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) {
      var1.write(class08375.N(var2), var3);
   }
}
