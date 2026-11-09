package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.LongStream;

public class class04053 {
   private long y;
   private long L;
   public static final Codec<class04053> N = Codec.LONG_STREAM
      .comapFlatMap(var0 -> class07536.N(var0, 2).map(var0x -> new class04053(var0x[0], var0x[1])), var0 -> LongStream.of(var0.y, var0.L));

   public class04053(class04037 var1) {
      this(var1.y(), var1.L());
   }

   public class04053(long var1, long var3) {
      super();
      this.y = var1;
      this.L = var3;
      if ((this.y | this.L) == 0L) {
         this.y = -7046029254386353131L;
         this.L = 7640891576956012809L;
      }
   }

   public long N() {
      long i = this.y;
      long j = this.L;
      long k = Long.rotateLeft(i + j, 17) + i;
      j ^= i;
      this.y = Long.rotateLeft(i, 49) ^ j ^ j << 21;
      this.L = Long.rotateLeft(j, 28);
      return k;
   }
}
