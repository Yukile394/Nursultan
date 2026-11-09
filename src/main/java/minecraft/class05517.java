package minecraft;

import com.google.common.hash.Hashing;

public class class05517 {
   public static final int N = class01146.N(8);
   private static final int y = 2;
   private static final int L = 4;
   private static final int u = 3;
   private final class05527 i;
   private final long R;

   public class05517(class05527 var1, long var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   private static double y(long var0) {
      return (Math.floorMod(var0 >> 24, 1024) / 1024.0 - 0.5) * 0.9;
   }

   public class03556<class00780> y(class07209 var1) {
      int ix = class01146.N(var1.method_10263());
      int j = class01146.N(var1.method_10264());
      int k = class01146.N(var1.method_10260());
      return this.N(ix, j, k);
   }

   public class03556<class00780> N(int var1, int var2, int var3) {
      return this.i.method_16359(var1, var2, var3);
   }

   private static double N(long var0, int var2, int var3, int var4, double var5, double var7, double var9) {
      long ix = class05533.N(var0, var2);
      ix = class05533.N(ix, var3);
      ix = class05533.N(ix, var4);
      ix = class05533.N(ix, var2);
      ix = class05533.N(ix, var3);
      ix = class05533.N(ix, var4);
      double d0 = y(ix);
      ix = class05533.N(ix, var0);
      double d1 = y(ix);
      ix = class05533.N(ix, var0);
      double d2 = y(ix);
      return class04995.E(var9 + d2) + class04995.E(var7 + d1) + class04995.E(var5 + d0);
   }

   public class05517 N(class05527 var1) {
      return new class05517(var1, this.R);
   }

   public static long N(long var0) {
      return Hashing.sha256().hashLong(var0).asLong();
   }

   public class03556<class00780> N(double var1, double var3, double var5) {
      int ix = class01146.N(class04995.N(var1));
      int j = class01146.N(class04995.N(var3));
      int k = class01146.N(class04995.N(var5));
      return this.N(ix, j, k);
   }

   public class03556<class00780> N(class07209 var1) {
      int ix = var1.method_10263() - 2;
      int j = var1.method_10264() - 2;
      int k = var1.method_10260() - 2;
      int l = ix >> 2;
      int i1 = j >> 2;
      int j1 = k >> 2;
      double d0 = (ix & 3) / 4.0;
      double d1 = (j & 3) / 4.0;
      double d2 = (k & 3) / 4.0;
      int k1 = 0;
      double d3 = Double.POSITIVE_INFINITY;

      for (int l1 = 0; l1 < 8; l1++) {
         boolean flag = (l1 & 4) == 0;
         boolean flag1 = (l1 & 2) == 0;
         boolean flag2 = (l1 & 1) == 0;
         int i2 = flag ? l : l + 1;
         int j2 = flag1 ? i1 : i1 + 1;
         int k2 = flag2 ? j1 : j1 + 1;
         double d4 = flag ? d0 : d0 - 1.0;
         double d5 = flag1 ? d1 : d1 - 1.0;
         double d6 = flag2 ? d2 : d2 - 1.0;
         double d7 = N(this.R, i2, j2, k2, d4, d5, d6);
         if (d3 > d7) {
            k1 = l1;
            d3 = d7;
         }
      }

      int l2 = (k1 & 4) == 0 ? l : l + 1;
      int i3 = (k1 & 2) == 0 ? i1 : i1 + 1;
      int j3 = (k1 & 1) == 0 ? j1 : j1 + 1;
      return this.i.method_16359(l2, i3, j3);
   }
}
