package minecraft;

public class class05027 {
   private static final int N = 4;
   private static final int y = 6;
   private static final long L = 15L;
   private static final long u = 1008L;
   private static final long i = 1024L;
   private static final long R = 2048L;

   private static long L(long var0, class07211 var2) {
      return var0 & ~(1L << var2.ordinal() + 4);
   }

   public static boolean L(long var0) {
      return (var0 & 2048L) != 0L;
   }

   public class05027() {
      super();
   }

   private static long y(long var0, class07211 var2) {
      return var0 | 1L << var2.ordinal() + 4;
   }

   public static long y(int var0, boolean var1, class07211 var2) {
      long ix = 0L;
      if (var1) {
         ix |= 1024L;
      }

      ix = y(ix, var2);
      return N(ix, var0);
   }

   public static boolean y(long var0) {
      return (var0 & 1024L) != 0L;
   }

   public static long N(int var0, class07211 var1) {
      return N(L(1008L, var1), var0);
   }

   public static boolean N(long var0, class07211 var2) {
      return (var0 & 1L << var2.ordinal() + 4) != 0L;
   }

   private static long N(long var0, int var2) {
      return var0 & -16L | var2 & 15L;
   }

   public static int N(long var0) {
      return (int)(var0 & 15L);
   }

   public static long N(int var0, boolean var1, class07211 var2) {
      long ix = L(1008L, var2);
      if (var1) {
         ix |= 1024L;
      }

      return N(ix, var0);
   }

   public static long N(boolean var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      long ix = N(0L, 15);
      if (var0) {
         ix = y(ix, class07211.field_11033);
      }

      if (var1) {
         ix = y(ix, class07211.field_11043);
      }

      if (var2) {
         ix = y(ix, class07211.field_11035);
      }

      if (var3) {
         ix = y(ix, class07211.field_11039);
      }

      if (var4) {
         ix = y(ix, class07211.field_11034);
      }

      return ix;
   }

   public static long N(int var0) {
      return N(1008L, var0);
   }

   public static long N(int var0, boolean var1) {
      long ix = 1008L;
      ix |= 2048L;
      if (var1) {
         ix |= 1024L;
      }

      return N(ix, var0);
   }
}
