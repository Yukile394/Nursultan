package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00660 extends ByteToMessageDecoder {
   private static final int N = 3;
   private final ByteBuf y = Unpooled.directBuffer(3);
   @Nullable
   private final class03706 L;

   public class00660(@Nullable class03706 var1) {
      super();
      this.L = var1;
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) {
      var2.markReaderIndex();
      this.y.clear();
      if (!N(var2, this.y)) {
         var2.resetReaderIndex();
      } else {
         int i = class01657.N(this.y);
         if (i == 0) {
            throw new CorruptedFrameException("Frame length cannot be zero");
         } else if (var2.readableBytes() < i) {
            var2.resetReaderIndex();
         } else {
            if (this.L != null) {
               this.L.N(i + class01657.N(i));
            }

            var3.add(var2.readBytes(i));
         }
      }
   }

   private static boolean N(ByteBuf var0, ByteBuf var1) {
      for (int i = 0; i < 3; i++) {
         if (!var0.isReadable()) {
            return false;
         }

         byte b0 = var0.readByte();
         var1.writeByte(b0);
         if (!class01657.N(b0)) {
            return true;
         }
      }

      throw new CorruptedFrameException("length wider than 21-bit");
   }

   protected void handlerRemoved0(ChannelHandlerContext var1) {
      this.y.release();
   }
}
