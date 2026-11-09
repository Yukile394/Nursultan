package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class class00634 extends ByteToMessageDecoder {
   public static final int N = 2097152;
   public static final int y = 8388608;
   private final Inflater L;
   private int u;
   private boolean i;

   public class00634(int var1, boolean var2) {
      super();
      this.u = var1;
      this.i = var2;
      this.L = new Inflater();
   }

   protected void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      int ix = class01657.N(var2);
      if (ix == 0) {
         var3.add(var2.readBytes(var2.readableBytes()));
      } else {
         if (this.i) {
            if (ix < this.u) {
               throw new DecoderException("Badly compressed packet - size of " + ix + " is below server threshold of " + this.u);
            }

            if (ix > 8388608) {
               throw new DecoderException("Badly compressed packet - size of " + ix + " is larger than protocol maximum of 8388608");
            }
         }

         this.N(var2);
         ByteBuf bytebuf = this.N(var1, ix);
         this.L.reset();
         var3.add(bytebuf);
      }
   }

   private ByteBuf N(ChannelHandlerContext var1, int var2) throws DataFormatException {
      ByteBuf bytebuf = var1.alloc().directBuffer(var2);

      try {
         ByteBuffer bytebuffer = bytebuf.internalNioBuffer(0, var2);
         int ix = bytebuffer.position();
         this.L.inflate(bytebuffer);
         int j = bytebuffer.position() - ix;
         if (j != var2) {
            throw new DecoderException("Badly compressed packet - actual length of uncompressed payload " + j + " is does not match declared size " + var2);
         } else {
            bytebuf.writerIndex(bytebuf.writerIndex() + j);
            return bytebuf;
         }
      } catch (Exception exception) {
         bytebuf.release();
         throw exception;
      }
   }

   public void N(int var1, boolean var2) {
      this.u = var1;
      this.i = var2;
   }

   private void N(ByteBuf var1) {
      ByteBuffer bytebuffer;
      if (var1.nioBufferCount() > 0) {
         bytebuffer = var1.nioBuffer();
         var1.skipBytes(var1.readableBytes());
      } else {
         bytebuffer = ByteBuffer.allocateDirect(var1.readableBytes());
         var1.readBytes(bytebuffer);
         bytebuffer.flip();
      }

      this.L.setInput(bytebuffer);
   }
}
