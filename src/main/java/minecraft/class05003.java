package minecraft;

import com.google.common.primitives.Longs;
import it.unimi.dsi.fastutil.bytes.ByteArrays;

public record class05003(long salt, byte[] signature) {
   public static final class05003 N = new class05003(0L, ByteArrays.EMPTY_ARRAY);

   public long L() {
      return this.salt;
   }

   public class05003(class00667 var1) {
      this(var1.readLong(), var1.y());
   }

   public class05003(long salt, byte[] signature) {
      this.salt = salt;
      this.signature = signature;
   }

   public byte[] u() {
      return this.signature;
   }

   public byte[] y() {
      return Longs.toByteArray(this.salt);
   }

   public static void N(class00667 var0, class05003 var1) {
      var0.writeLong(var1.salt);
      var0.N(var1.signature);
   }

   public boolean N() {
      return this.signature.length > 0;
   }
}
