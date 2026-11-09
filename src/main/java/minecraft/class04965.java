package minecraft;

import Nursultan.class10479;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class class04965 implements class06304 {
   private final class04989 N;
   private class06304 y;
   private final BufferedInputStream L;

   public class04965(class04989 var1, InputStream var2) throws IOException {
      super();
      this.N = var1;
      this.L = new BufferedInputStream(var2);
      this.L.mark(Integer.MAX_VALUE);
      this.y = var1.create(new class10479(this.L));
   }

   @Override
   public void close() throws IOException {
      this.y.close();
      this.L.close();
   }

   @Override
   public AudioFormat N() {
      return this.y.N();
   }

   @Override
   public ByteBuffer N(int var1) throws IOException {
      ByteBuffer bytebuffer = this.y.N(var1);
      if (!bytebuffer.hasRemaining()) {
         this.y.close();
         this.L.reset();
         this.y = this.N.create(new class10479(this.L));
         bytebuffer = this.y.N(var1);
      }

      return bytebuffer;
   }
}
