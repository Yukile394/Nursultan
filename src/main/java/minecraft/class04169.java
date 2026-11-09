package minecraft;

import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class class04169 {
   public static final int N = 250;
   public static final String y = "MC|PingHost";
   public static final int L = 254;
   public static final int u = 1;
   public static final int i = 255;
   public static final int R = 127;

   public class04169() {
      super();
   }

   public static void N(ByteBuf var0, String var1) {
      var0.writeShort(var1.length());
      var0.writeCharSequence(var1, StandardCharsets.UTF_16BE);
   }

   public static String N(ByteBuf var0) {
      int ix = var0.readShort() * 2;
      String s = var0.toString(var0.readerIndex(), ix, StandardCharsets.UTF_16BE);
      var0.skipBytes(ix);
      return s;
   }
}
