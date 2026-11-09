package minecraft;

import Nursultan.class10554;
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
public class class03633 implements class01809 {
   private static final int u = 48;
   private static final long i = 281474976710655L;
   private static final long R = 25214903917L;
   private static final long M = 11L;
   private final AtomicLong B = new AtomicLong();
   private final class04019 Z = new class04019(this);

   @Override
   public class01818 L() {
      return new class10554(this.B());
   }

   public class03633(long var1) {
      super();
      this.N(var1);
   }

   @Override
   public class06069 y() {
      return new class03633(this.B());
   }

   @Override
   public double E() {
      return this.Z.y();
   }

   @Override
   public int N(int var1) {
      long ix;
      long j;
      do {
         ix = this.B.get();
         j = ix * 25214903917L + 11L & 281474976710655L;
      } while (!this.B.compareAndSet(ix, j));

      return (int)(j >>> 48 - var1);
   }

   @Override
   public void N(long var1) {
      this.B.set((var1 ^ 25214903917L) & 281474976710655L);
   }
}
