package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class class00671 extends MessageToByteEncoder<ByteBuf> {
   private final byte[] N = new byte[8192];
   private final Deflater y;
   private int L;

   public class00671(int var1) {
      super();
      this.L = var1;
      this.y = new Deflater();
   }

   protected void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      int i = var2.readableBytes();
      if (i > 8388608) {
         throw new IllegalArgumentException("Packet too big (is " + i + ", should be less than 8388608)");
      } else {
         if (i < this.L) {
            class01657.N(var3, 0);
            var3.writeBytes(var2);
         } else {
            byte[] abyte = new byte[i];
            var2.readBytes(abyte);
            class01657.N(var3, abyte.length);
            this.y.setInput(abyte, 0, i);
            this.y.finish();

            while (!this.y.finished()) {
               int j = this.y.deflate(this.N);
               var3.writeBytes(this.N, 0, j);
            }

            this.y.reset();
         }
      }
   }

   public void N(int var1) {
      this.L = var1;
   }

   public int N() {
      return this.L;
   }
}
