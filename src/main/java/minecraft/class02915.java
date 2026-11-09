package minecraft;

import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface class02915 extends class02917 {
   int N = 8192;

   @Override
   default ByteBuffer y() throws IOException {
      class06314 class06314 = new class06314(16384);

      while (this.N(class06314)) {
      }

      return class06314.N();
   }

   @Override
   default ByteBuffer N(int var1) throws IOException {
      class06314 class06314 = new class06314(var1 + 8192);

      while (this.N(class06314) && class06314.y() < var1) {
      }

      return class06314.N();
   }

   boolean N(FloatConsumer var1) throws IOException;
}
