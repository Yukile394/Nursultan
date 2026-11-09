package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.DecoderException;
import io.netty.util.ReferenceCountUtil;

public class class02372 extends ChannelDuplexHandler {
   public class02372() {
      super();
   }

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      if (var2 instanceof class02403 class02403) {
         try {
            class02403.run(var1);
         } finally {
            ReferenceCountUtil.release(var2);
         }

         var3.setSuccess();
      } else {
         var1.write(var2, var3);
      }
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      if (!(var2 instanceof ByteBuf) && !(var2 instanceof class00381)) {
         var1.fireChannelRead(var2);
      } else {
         ReferenceCountUtil.release(var2);
         throw new DecoderException("Pipeline has no inbound protocol configured, can't process packet " + var2);
      }
   }
}
