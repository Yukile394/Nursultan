package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToByteEncoder;

@Sharable
public class class00632 extends MessageToByteEncoder<ByteBuf> {
   public static final int N = 3;

   public class00632() {
      super();
   }

   protected void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      int i = var2.readableBytes();
      int j = class01657.N(i);
      if (j > 3) {
         throw new EncoderException("Packet too large: size " + i + " is over 8");
      } else {
         var3.ensureWritable(j + i);
         class01657.N(var3, i);
         var3.writeBytes(var2, var2.readerIndex(), i);
      }
   }
}
