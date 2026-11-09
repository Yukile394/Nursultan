package minecraft;

import com.google.common.base.Splitter;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.List;

public class class01849 extends SimpleChannelInboundHandler<ByteBuf> {
   private static final Splitter N = Splitter.on('\u0000').limit(6);
   private final class03420 y;
   private final class01876 L;

   public class01849(class03420 var1, class01876 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   protected void channelRead0(ChannelHandlerContext var1, ByteBuf var2) {
      if (var2.readUnsignedByte() == 255) {
         String s = class04169.N(var2);
         List<String> list = N.splitToList(s);
         if ("§1".equals(list.get(0))) {
            int i = class04995.N(list.get(1), 0);
            String s1 = list.get(2);
            String s2 = list.get(3);
            int j = class04995.N(list.get(4), -1);
            int k = class04995.N(list.get(5), -1);
            this.L.handleResponse(i, s1, s2, j, k);
         }
      }

      var1.close();
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var1.close();
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      ByteBuf bytebuf = var1.alloc().buffer();

      try {
         bytebuf.writeByte(254);
         bytebuf.writeByte(1);
         bytebuf.writeByte(250);
         class04169.N(bytebuf, "MC|PingHost");
         int i = bytebuf.writerIndex();
         bytebuf.writeShort(0);
         int j = bytebuf.writerIndex();
         bytebuf.writeByte(127);
         class04169.N(bytebuf, this.y.N());
         bytebuf.writeInt(this.y.y());
         int k = bytebuf.writerIndex() - j;
         bytebuf.setShort(i, k);
         var1.channel().writeAndFlush(bytebuf).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
      } catch (Exception exception) {
         bytebuf.release();
         throw exception;
      }
   }
}
