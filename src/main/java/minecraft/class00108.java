package minecraft;

import org.jspecify.annotations.Nullable;

public class class00108 implements class04680 {
   private static final class01894 N = class01894.y("toast/now_playing");
   private static final class01894 i = class01894.N("icon/music_notes");
   private static final int R = 7;
   private static final int M = 16;
   private static final int B = 30;
   private static final int Z = 30;
   private static final int z = 5000;
   private static final int U = class06563.field_7967.R();
   private static final long E = 25L;
   private static int W;
   private static long m;
   private static int P = -1;
   private boolean s;
   private double T;
   private final class06202 b;
   private class04650 j = class04650.field_2209;

   @Override
   public int L() {
      return N(B(), (class01590)this.b.i_3);
   }

   public class00108() {
      super();
      this.b = class06202.Nq();
   }

   @Nullable
   private static String B() {
      return class06202.Nq().A().u();
   }

   @Override
   public class04650 i() {
      return this.j;
   }

   @Override
   public int u() {
      return 30;
   }

   @Override
   public void y() {
      this.s = false;
   }

   @Override
   public float N(int var1) {
      return 0.0F;
   }

   @Override
   public float N(int var1, float var2) {
      return this.L() * var2 - this.L();
   }

   public static void N() {
      if (B() != null) {
         long ix = System.currentTimeMillis();
         if (ix > m + 25L) {
            W++;
            m = ix;
            P = class00095.N(class00111.field_60688, (float)W);
         }
      }
   }

   public void N(class04650 var1) {
      this.j = var1;
   }

   private static class00392 N(@Nullable String var0) {
      return var0 == null ? class00392.i() : class00392.L(var0.replace("/", "."));
   }

   public void N(class05630 var1) {
      this.s = true;
      this.T = var1.K().method_41753();
      this.N(class04650.field_2210);
   }

   @Override
   public void N(class06086 var1, long var2) {
      if (this.s) {
         this.j = var2 < 5000.0 * this.T ? class04650.field_2210 : class04650.field_2209;
         N();
      }
   }

   @Override
   public void N(class01054 var1, class01590 var2, long var3) {
      N(var1, var2);
   }

   public static void N(class01054 var0, class01590 var1) {
      String sx = B();
      if (sx != null) {
         var0.N(class08394.Na, N, 0, 0, N(sx, var1), 30);
         byte b0 = 7;
         var0.N(class08394.Na, i, 7, 7, 16, 16, P);
         var0.y(var1, N(sx), 30, 15 - 4, U);
      }
   }

   private static int N(@Nullable String var0, class01590 var1) {
      return 30 + var1.N(N(var0)) + 7;
   }
}
