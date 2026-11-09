package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public record class03590(class07321 pos, byte[] buffer) {
   public byte[] L() {
      return this.buffer;
   }

   public class03590(class00570 var1) {
      this(var1.R(), new byte[N(var1)]);
      N(new class00667(this.u()), var1);
   }

   public class03590(class07321 pos, byte[] buffer) {
      this.pos = pos;
      this.buffer = buffer;
   }

   public class03590(class00667 var1) {
      this(var1.R(), var1.N(2097152));
   }

   private ByteBuf u() {
      ByteBuf bytebuf = Unpooled.wrappedBuffer(this.buffer);
      bytebuf.writerIndex(0);
      return bytebuf;
   }

   public class07321 y() {
      return this.pos;
   }

   public static void N(class00667 var0, class00570 var1) {
      class00554[] aclass00554 = var1.u();
      int i = aclass00554.length;

      for (int j = 0; j < i; j++) {
         aclass00554[j].Z().y(var0);
      }

      if (var0.writerIndex() != var0.capacity()) {
         throw new IllegalStateException("Didn't fill biome buffer: expected " + var0.capacity() + " bytes, got " + var0.writerIndex());
      }
   }

   private static int N(class00570 var0) {
      int i = 0;

      for (class00554 class00554 : var0.u()) {
         i += class00554.Z().y();
      }

      return i;
   }

   public void N(class00667 var1) {
      var1.N(this.pos);
      var1.N(this.buffer);
   }

   public class00667 N() {
      return new class00667(Unpooled.wrappedBuffer(this.buffer));
   }
}
