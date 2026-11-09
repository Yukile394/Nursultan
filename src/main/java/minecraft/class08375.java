package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.util.ReferenceCounted;

public record class08375(ByteBuf contents) implements ReferenceCounted {
   public class08375 touch(Object var1) {
      this.contents.touch(var1);
      return this;
   }

   public ByteBuf L() {
      return this.contents;
   }

   public class08375(ByteBuf contents) {
      this.contents = ByteBufUtil.ensureAccessible(contents);
   }

   public boolean release() {
      return this.contents.release();
   }

   public boolean release(int var1) {
      return this.contents.release(var1);
   }

   public class08375 touch() {
      this.contents.touch();
      return this;
   }

   public static Object y(Object var0) {
      return var0 instanceof class08375 ? ByteBufUtil.ensureAccessible(((class08375)var0).contents) : var0;
   }

   public static Object N(Object var0) {
      return var0 instanceof ByteBuf bytebuf ? new class08375(bytebuf) : var0;
   }

   public class08375 retain(int var1) {
      this.contents.retain(var1);
      return this;
   }

   public class08375 retain() {
      this.contents.retain();
      return this;
   }

   public int refCnt() {
      return this.contents.refCnt();
   }
}
