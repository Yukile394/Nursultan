package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class class08363 extends ChannelInboundHandlerAdapter {
   public class08363() {
      super();
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      var1.fireChannelRead(class08375.y(var2));
   }
}
