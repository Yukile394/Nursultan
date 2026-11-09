package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class class02943 extends ChannelInboundHandlerAdapter {
   private final class03706 N;

   public class02943(class03706 var1) {
      super();
      this.N = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      var2 = class08375.y(var2);
      if (var2 instanceof ByteBuf bytebuf) {
         this.N.N(bytebuf.readableBytes());
      }

      var1.fireChannelRead(var2);
   }
}
