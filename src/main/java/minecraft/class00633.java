package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class class00633 extends MessageToMessageDecoder<ByteBuf> {
   private final class07740 N;

   public class00633(Cipher var1) {
      super();
      this.N = new class07740(var1);
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      var3.add(this.N.N(var1, var2));
   }
}
