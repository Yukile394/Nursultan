package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import org.jspecify.annotations.Nullable;

public class class02703 {
   private static final int N = 4096;
   private static final int y = 4095;
   private final long[] L = new long[4096];
   private final class04425[] u = new class04425[4096];

   public class02703() {
      super();
   }

   private class04425 N(class07290 var1, class07209 var2, int var3, long var4) {
      class04425 class04425 = class07955.y(var1, var2);
      this.L[var3] = var4;
      this.u[var3] = class04425;
      return class04425;
   }

   public void N(class07209 var1) {
      long i = var1.method_10063();
      int j = N(i);
      if (this.L[j] == i) {
         this.u[j] = null;
      }
   }

   private static int N(long var0) {
      return (int)HashCommon.mix(var0) & 4095;
   }

   @Nullable
   private class04425 N(int var1, long var2) {
      return this.L[var1] == var2 ? this.u[var1] : null;
   }

   public class04425 N(class07290 var1, class07209 var2) {
      long i = var2.method_10063();
      int j = N(i);
      class04425 class04425 = this.N(j, i);
      return class04425 != null ? class04425 : this.N(var1, var2, j, i);
   }
}
