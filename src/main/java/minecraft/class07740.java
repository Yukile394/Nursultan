package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class class07740 {
   private final Cipher N;
   private byte[] y = new byte[0];
   private byte[] L = new byte[0];

   protected class07740(Cipher var1) {
      super();
      this.N = var1;
   }

   protected void N(ByteBuf var1, ByteBuf var2) throws ShortBufferException {
      int i = var1.readableBytes();
      byte[] abyte = this.N(var1);
      int j = this.N.getOutputSize(i);
      if (this.L.length < j) {
         this.L = new byte[j];
      }

      var2.writeBytes(this.L, 0, this.N.update(abyte, 0, i, this.L));
   }

   protected ByteBuf N(ChannelHandlerContext var1, ByteBuf var2) throws ShortBufferException {
      int i = var2.readableBytes();
      byte[] abyte = this.N(var2);
      ByteBuf bytebuf = var1.alloc().heapBuffer(this.N.getOutputSize(i));
      bytebuf.writerIndex(this.N.update(abyte, 0, i, bytebuf.array(), bytebuf.arrayOffset()));
      return bytebuf;
   }

   private byte[] N(ByteBuf var1) {
      int i = var1.readableBytes();
      if (this.y.length < i) {
         this.y = new byte[i];
      }

      var1.readBytes(this.y, 0, i);
      return this.y;
   }
}
