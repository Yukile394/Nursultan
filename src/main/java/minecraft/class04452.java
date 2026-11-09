package minecraft;

public class class04452 {
   private static final String[] N = new String[]{"O o o", "o O o", "o o O", "o O o"};
   private static final long y = 300L;

   public class04452() {
      super();
   }

   public static String N(long var0) {
      int i = (int)(var0 / 300L % N.length);
      return N[i];
   }
}
