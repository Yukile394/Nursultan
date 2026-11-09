package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

public class class06314 implements FloatConsumer {
   private final List<ByteBuffer> N = Lists.newArrayList();
   private final int y;
   private int L;
   private ByteBuffer u;

   public class06314(int var1) {
      super();
      this.y = var1 + 1 & -2;
      this.u = BufferUtils.createByteBuffer(var1);
   }

   public void accept(float var1) {
      if (this.u.remaining() == 0) {
         this.u.flip();
         this.N.add(this.u);
         this.u = BufferUtils.createByteBuffer(this.y);
      }

      int i = class04995.N((int)(var1 * 32767.5F - 0.5F), -32768, 32767);
      this.u.putShort((short)i);
      this.L += 2;
   }

   public int y() {
      return this.L;
   }

   public ByteBuffer N() {
      this.u.flip();
      if (this.N.isEmpty()) {
         return this.u;
      } else {
         ByteBuffer bytebuffer = BufferUtils.createByteBuffer(this.L);
         this.N.forEach(bytebuffer::put);
         bytebuffer.put(this.u);
         bytebuffer.flip();
         return bytebuffer;
      }
   }
}
