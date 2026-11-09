package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.SocketAddress;
import java.util.Locale;
import org.slf4j.Logger;

public class class01602 extends ChannelInboundHandlerAdapter {
   private static final Logger N = LogUtils.getLogger();
   private final class04184 y;

   public class01602(class04184 var1) {
      super();
      this.y = var1;
   }

   private static String y(class04184 var0) {
      return String.format(Locale.ROOT, "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, var0.w(), var0.x(), var0.Q(), var0.t());
   }

   private static void N(ChannelHandlerContext var0, ByteBuf var1) {
      var0.pipeline().firstContext().writeAndFlush(var1).addListener(ChannelFutureListener.CLOSE);
   }

   private static ByteBuf N(ByteBufAllocator var0, String var1) {
      ByteBuf bytebuf = var0.buffer();
      bytebuf.writeByte(255);
      class04169.N(bytebuf, var1);
      return bytebuf;
   }

   private static boolean N(ByteBuf var0) {
      if (var0.readUnsignedByte() != 250) {
         return false;
      } else {
         String s = class04169.N(var0);
         if (!"MC|PingHost".equals(s)) {
            return false;
         } else {
            int i = var0.readUnsignedShort();
            if (var0.readableBytes() != i) {
               return false;
            } else if (var0.readUnsignedByte() < 73) {
               return false;
            } else {
               String s1 = class04169.N(var0);
               return var0.readInt() <= 65535;
            }
         }
      }
   }

   private static String N(class04184 var0) {
      return String.format(Locale.ROOT, "%s§%d§%d", var0.x(), var0.Q(), var0.t());
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) {
      ByteBuf bytebuf = (ByteBuf)var2;
      bytebuf.markReaderIndex();
      boolean flag = true;

      try {
         try {
            if (bytebuf.readUnsignedByte() != 254) {
               return;
            }

            SocketAddress socketaddress = var1.channel().remoteAddress();
            if (bytebuf.readableBytes() == 0) {
               N.debug("Ping: (<1.3.x) from {}", socketaddress);
               String s = N(this.y);
               N(var1, N(var1.alloc(), s));
            } else {
               if (bytebuf.readUnsignedByte() != 1) {
                  return;
               }

               if (bytebuf.isReadable()) {
                  if (!N(bytebuf)) {
                     return;
                  }

                  N.debug("Ping: (1.6) from {}", socketaddress);
               } else {
                  N.debug("Ping: (1.4-1.5.x) from {}", socketaddress);
               }

               String s1 = y(this.y);
               N(var1, N(var1.alloc(), s1));
            }

            bytebuf.release();
            flag = false;
         } catch (RuntimeException runtimeexception) {
         }
      } finally {
         if (flag) {
            bytebuf.resetReaderIndex();
            var1.channel().pipeline().remove(this);
            var1.fireChannelRead(var2);
         }
      }
   }
}
