package minecraft;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;

class class05150 {
   private final long N = new Date().getTime();
   private final int y;
   private final byte[] L;
   private final byte[] u;
   private final String i;

   public byte[] L() {
      return this.L;
   }

   public class05150(DatagramPacket var1) {
      super();
      byte[] abyte = var1.getData();
      this.L = new byte[4];
      this.L[0] = abyte[3];
      this.L[1] = abyte[4];
      this.L[2] = abyte[5];
      this.L[3] = abyte[6];
      this.i = new String(this.L, StandardCharsets.UTF_8);
      this.y = class06069.u().y(16777216);
      this.u = String.format(Locale.ROOT, "\t%s%d\u0000", this.i, this.y).getBytes(StandardCharsets.UTF_8);
   }

   public String u() {
      return this.i;
   }

   public byte[] y() {
      return this.u;
   }

   public Boolean N(long var1) {
      return this.N < var1;
   }

   public int N() {
      return this.y;
   }
}
