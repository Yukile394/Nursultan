package minecraft;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.IntConsumer;
import net.caffeinemc.mods.sodium.client.world.BitStorageExtension;

public class class03236 implements class04552, BitStorageExtension {
   public static final long[] N = new long[0];
   private final int y;

   @Override
   public int L() {
      return 0;
   }

   public class03236(int var1) {
      super();
      this.y = var1;
   }

   @Override
   public class04552 u() {
      return this;
   }

   @Override
   public int y() {
      return this.y;
   }

   @Override
   public void y(int var1, int var2) {
      long l = this.y - 1;
      long k = var1;
      long j = l;
      long i = 0L;
      this.N(i, j, k);
      k = var2;
      j = 0L;
      i = 0L;
      this.N(i, j, k);
   }

   public void N(long var1, long var3, long var5) {
   }

   @Override
   public void N(int[] var1) {
      Arrays.fill(var1, 0, this.y, 0);
   }

   @Override
   public int N(int var1) {
      long l = this.y - 1;
      long k = var1;
      long j = l;
      long i = 0L;
      this.N(i, j, k);
      return 0;
   }

   @Override
   public long[] N() {
      return N;
   }

   @Override
   public int N(int var1, int var2) {
      long l = this.y - 1;
      long k = var1;
      long j = l;
      long i = 0L;
      this.N(i, j, k);
      k = var2;
      j = 0L;
      i = 0L;
      this.N(i, j, k);
      return 0;
   }

   @Override
   public void N(IntConsumer var1) {
      for (int i = 0; i < this.y; i++) {
         var1.accept(0);
      }
   }

   public void sodium$unpack(Object[] var1, class07340 var2) {
      if (this.y != var1.length) {
         throw new IllegalArgumentException("Array has mismatched size");
      } else {
         Object object = Objects.requireNonNull(var2.method_12288(0), "Palette must have default entry");
         Arrays.fill(var1, object);
      }
   }
}
