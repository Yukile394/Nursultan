package minecraft;

public class class03933 {
   public static final int N = 8;
   public static final int y = 8;
   public static final int L = 8;
   public static final int u = 8;
   public static final int i = 40;
   public static final int R = 8;
   public static final int M = 8;
   public static final int B = 8;
   public static final int Z = 64;
   public static final int z = 64;

   public class03933() {
      super();
   }

   private static void N(class01054 var0, class01894 var1, int var2, int var3, int var4, boolean var5, int var6) {
      int ix = 8 + (var5 ? 8 : 0);
      int j = 8 * (var5 ? -1 : 1);
      var0.N(class08394.Na, var1, var2, var3, 40.0F, ix, var4, var4, 8, j, 64, 64, var6);
   }

   public static void N(class01054 var0, class01894 var1, int var2, int var3, int var4, boolean var5, boolean var6, int var7) {
      int ix = 8 + (var6 ? 8 : 0);
      int j = 8 * (var6 ? -1 : 1);
      var0.N(class08394.Na, var1, var2, var3, 8.0F, ix, var4, var4, 8, j, 64, 64, var7);
      if (var5) {
         N(var0, var1, var2, var3, var4, var6, var7);
      }
   }

   public static void N(class01054 var0, class01631 var1, int var2, int var3, int var4, int var5) {
      N(var0, var1.N().y(), var2, var3, var4, true, false, var5);
   }

   public static void N(class01054 var0, class01631 var1, int var2, int var3, int var4) {
      N(var0, var1, var2, var3, var4, -1);
   }
}
