package minecraft;

import Nursultan.class09175;
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor;
import org.slf4j.Logger;

public class class00658<T extends class00638> extends ByteToMessageDecoder implements class01671, PacketDecoderAccessor {
   private static final Logger N = LogUtils.getLogger();
   private final class04275<T> y;

   public class00658(class04275<T> var1) {
      super();
      this.y = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      int i = var2.readableBytes();

      class00381 class00381;
      try {
         class00381 = this.y.L().decode(var2);
      } catch (Exception exception) {
         if (exception instanceof class09175) {
            var2.skipBytes(var2.readableBytes());
         }

         throw exception;
      }

      class02897 class02897 = class00381.method_65080();
      class01834.M.N(this.y.N(), class02897, var1.channel().remoteAddress(), i);
      if (var2.readableBytes() > 0) {
         throw new IOException(
            "Packet "
               + this.y.N().N()
               + "/"
               + class02897
               + " ("
               + class00381.getClass().getSimpleName()
               + ") was larger than I expected, found "
               + var2.readableBytes()
               + " bytes extra whilst reading packet "
               + class02897
         );
      } else {
         var3.add(class00381);
         if (N.isDebugEnabled()) {
            N.debug(class00642.field_36379, " IN: [{}:{}] {} -> {} bytes", new Object[]{this.y.N().N(), class02897, class00381.getClass().getName(), i});
         }

         class01671.N(var1, class00381);
      }
   }
}
