package minecraft;

public class class05533 {
   private static final long N = 6364136223846793005L;
   private static final long y = 1442695040888963407L;

   public class05533() {
      super();
   }

   public static long N(long var0, long var2) {
      var0 *= var0 * 6364136223846793005L + 1442695040888963407L;
      return var0 + var2;
   }
}
