package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class class00666 extends MessageToByteEncoder<ByteBuf> {
   private final class07740 N;

   public class00666(Cipher var1) {
      super();
      this.N = new class07740(var1);
   }

   protected void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.N.N(var2, var3);
   }
}
