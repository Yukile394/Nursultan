package minecraft;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HexFormat;

public record class03726(int width, int height) {
   private static final HexFormat L = HexFormat.of().withUpperCase().withPrefix("0x");
   private static final long u = -8552249625308161526L;
   private static final int i = 1229472850;
   private static final int R = 13;

   public class03726(int width, int height) {
      this.width = width;
      this.height = height;
   }

   public int y() {
      return this.height;
   }

   public static class03726 N(byte[] var0) throws IOException {
      return N(new ByteArrayInputStream(var0));
   }

   public int N() {
      return this.width;
   }

   public static void N(ByteBuffer var0) throws IOException {
      ByteOrder byteorder = var0.order();
      var0.order(ByteOrder.BIG_ENDIAN);
      if (var0.limit() < 16) {
         throw new IOException("PNG header missing");
      } else if (var0.getLong(0) != -8552249625308161526L) {
         throw new IOException("Bad PNG Signature");
      } else if (var0.getInt(8) != 13) {
         throw new IOException("Bad length for IHDR chunk!");
      } else if (var0.getInt(12) != 1229472850) {
         throw new IOException("Bad type for IHDR chunk!");
      } else {
         var0.order(byteorder);
      }
   }

   public static class03726 N(InputStream var0) throws IOException {
      DataInputStream datainputstream = new DataInputStream(var0);
      long ix = datainputstream.readLong();
      if (ix != -8552249625308161526L) {
         throw new IOException("Bad PNG Signature: " + L.toHexDigits(ix));
      } else {
         int j = datainputstream.readInt();
         if (j != 13) {
            throw new IOException("Bad length for IHDR chunk: " + j);
         } else {
            int k = datainputstream.readInt();
            if (k != 1229472850) {
               throw new IOException("Bad type for IHDR chunk: " + L.toHexDigits(k));
            } else {
               int l = datainputstream.readInt();
               int i1 = datainputstream.readInt();
               return new class03726(l, i1);
            }
         }
      }
   }
}
