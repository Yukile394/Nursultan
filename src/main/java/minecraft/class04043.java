package minecraft;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Longs;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLong;

public final class class04043 {
   public static final long N = -7046029254386353131L;
   public static final long y = 7640891576956012809L;
   private static final HashFunction L = Hashing.md5();
   private static final AtomicLong u = new AtomicLong(8682522807148012L);

   public static class04037 L(long var0) {
      return y(var0).N();
   }

   public class04043() {
      super();
   }

   public static class04037 y(long var0) {
      long i = var0 ^ 7640891576956012809L;
      long j = i + -7046029254386353131L;
      return new class04037(i, j);
   }

   public static class04037 N(String var0) {
      byte[] abyte = L.hashString(var0, StandardCharsets.UTF_8).asBytes();
      long i = Longs.fromBytes(abyte[0], abyte[1], abyte[2], abyte[3], abyte[4], abyte[5], abyte[6], abyte[7]);
      long j = Longs.fromBytes(abyte[8], abyte[9], abyte[10], abyte[11], abyte[12], abyte[13], abyte[14], abyte[15]);
      return new class04037(i, j);
   }

   public static long N() {
      return u.updateAndGet(var0 -> var0 * 1181783497276652981L) ^ System.nanoTime();
   }

   public static long N(long var0) {
      var0 = (var0 ^ var0 >>> 30) * -4658895280553007687L;
      var0 = (var0 ^ var0 >>> 27) * -7723592293110705685L;
      return var0 ^ var0 >>> 31;
   }
}
