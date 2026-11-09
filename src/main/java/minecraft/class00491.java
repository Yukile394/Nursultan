package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00491 extends class07279 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 200;
   private static final int L = 40;
   private static final int u = 2400;
   private static final int i = 1;
   private static final int R = 10;
   private static final long M = 0L;
   private static final boolean B = false;
   private long Z = 0L;
   private int m;
   @Nullable
   private class07209 P;
   private boolean s = false;

   public boolean L() {
      return this.m > 0;
   }

   private static class06889 L(class04782 var0, class07209 var1) {
      class06889 class06889x = new class06889(var1.method_10263(), 0.0, var1.method_10260()).u();
      short short1 = 1024;
      class06889 class06889x = class06889x.L(1024.0);

      for (int ix = 16; !N(var0, class06889x) && ix-- > 0; class06889x = class06889x.i(class06889x.L(-16.0))) {
         N.debug("Skipping backwards past nonempty chunk at {}", class06889x);
      }

      for (int j = 16; N(var0, class06889x) && j-- > 0; class06889x = class06889x.i(class06889x.L(16.0))) {
         N.debug("Skipping forward past empty chunk at {}", class06889x);
      }

      N.debug("Found chunk at {}", class06889x);
      return class06889x;
   }

   public static void L(class07299 var0, class07209 var1, class00500 var2, class00491 var3) {
      if (!var0.method_8608()) {
         var3.m = 40;
         var0.method_8427(var1, var2.i(), 1, 0);
         N(var0, var1, var2);
      }
   }

   public class00491(class07209 var1, class00500 var2) {
      super(class00404.field_11906, var1, var2);
   }

   public class07269 i() {
      return class07269.N(this);
   }

   public float y(float var1) {
      return 1.0F - class04995.N((this.m - var1) / 40.0F, 0.0F, 1.0F);
   }

   public static void y(class07299 var0, class07209 var1, class00500 var2, class00491 var3) {
      boolean flag = var3.N();
      boolean flag1 = var3.L();
      var3.Z++;
      if (flag1) {
         var3.m--;
      } else if (var3.Z % 2400L == 0L) {
         L(var0, var1, var2, var3);
      }

      if (flag != var3.N() || flag1 != var3.L()) {
         N(var0, var1, var2);
      }
   }

   private static class07209 y(class04782 var0, class07209 var1) {
      class06889 class06889 = L(var0, var1);
      class07209 class07209x = N(N((class07299)var0, class06889));
      if (class07209x == null) {
         class07209 class07209x = class07209.method_49637(class06889.M + 0.5, 75.0, class06889.Z + 0.5);
         N.debug("Failed to find a suitable block to teleport to, spawning an island on {}", class07209x);
         var0.method_30349()
            .method_46759(class04227.Nh)
            .flatMap(var0x -> var0x.N(class03155.R))
            .ifPresent(var2x -> var2x.N().N(var0, var0.method_14178().U(), class06069.y(class07209.method_10063()), class07209));
         class07209x = class07209x;
      } else {
         N.debug("Found suitable block to teleport to: {}", class07209x);
      }

      return N(var0, class07209x, 16, true);
   }

   private static void N(class04782 var0, class07209 var1, class06414 var2) {
      class06391.K.N(var2, var0, var0.method_14178().U(), class06069.u(), var1);
   }

   @Nullable
   private static class07209 N(class00570 var0) {
      class07321 class07321 = var0.R();
      class07209 class07209xxxxx = new class07209(class07321.i(), 30, class07321.R());
      int ix = var0.y() + 16 - 1;
      class07209 class07209x = new class07209(class07321.M(), ix, class07321.B());
      class07209 class07209xx = null;
      double d0 = 0.0;

      for (class07209 class07209xxx : class07209.method_10097(class07209xxxxx, class07209x)) {
         class00500 class00500 = var0.method_8320(class07209xxx);
         class07209 class07209xxxx = class07209xxx.method_10084();
         class07209 class07209xxxxx = class07209xxx.method_10086(2);
         if (class00500.N(class00869.MP)
            && !var0.method_8320(class07209xxxx).W(var0, class07209xxxx)
            && !var0.method_8320(class07209xxxxx).W(var0, class07209xxxxx)) {
            double d1 = class07209xxx.method_10268(0.0, 0.0, 0.0);
            if (class07209xx == null || d1 < d0) {
               class07209xx = class07209xxx;
               d0 = d1;
            }
         }
      }

      return class07209xx;
   }

   private static class07209 N(class07290 var0, class07209 var1, int var2, boolean var3) {
      class07209 class07209x = null;

      for (int ix = -var2; ix <= var2; ix++) {
         for (int j = -var2; j <= var2; j++) {
            if (ix != 0 || j != 0 || var3) {
               for (int k = var0.method_31600(); k > (class07209x == null ? var0.method_31607() : class07209x.method_10264()); k--) {
                  class07209 class07209x = new class07209(var1.method_10263() + ix, k, var1.method_10260() + j);
                  class00500 class00500 = var0.method_8320(class07209x);
                  if (class00500.W(var0, class07209x) && (var3 || !class00500.N(class00869.q))) {
                     class07209x = class07209x;
                     break;
                  }
               }
            }
         }
      }

      return class07209x == null ? var1 : class07209x;
   }

   private static class00570 N(class07299 var0, class06889 var1) {
      return var0.method_8497(class04995.N(var1.M / 16.0), class04995.N(var1.Z / 16.0));
   }

   private static class07209 N(class07299 var0, class07209 var1) {
      class07209 class07209 = N(var0, var1.method_10069(0, 2, 0), 5, false);
      N.debug("Best exit position for portal at {} is {}", var1, class07209);
      return class07209.method_10084();
   }

   public void N(class07209 var1, boolean var2) {
      this.s = var2;
      this.P = var1;
      this.method_5431();
   }

   @Override
   public boolean N(class07211 var1) {
      return class00891.N(this.w(), this.z.method_8320(this.d().method_10093(var1)), var1);
   }

   @Override
   public boolean N(int var1, int var2) {
      if (var1 == 1) {
         this.m = 40;
         return true;
      } else {
         return super.N(var1, var2);
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00491 var3) {
      var3.Z++;
      if (var3.L()) {
         var3.m--;
      }
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public float N(float var1) {
      return class04995.N(((float)this.Z + var1) / 200.0F, 0.0F, 1.0F);
   }

   public boolean N() {
      return this.Z < 200L;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("Age", this.Z);
      var1.y("exit_portal", class07209.field_25064, this.P);
      if (this.s) {
         var1.N("ExactTeleport", true);
      }
   }

   private static boolean N(class04782 var0, class06889 var1) {
      return N((class07299)var0, var1).N() == -1;
   }

   @Nullable
   public class06889 N(class04782 var1, class07209 var2) {
      if (this.P == null && var1.method_27983() == class07299.field_25181) {
         class07209 class07209x = y(var1, var2);
         class07209x = class07209x.method_10086(10);
         N.debug("Creating portal at {}", class07209x);
         N(var1, class07209x, class06414.N(var2, false));
         this.N(class07209x, this.s);
      }

      if (this.P != null) {
         class07209 class07209 = this.s ? this.P : N((class07299)var1, this.P);
         return class07209.method_61082();
      } else {
         return null;
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.Z = var1.N("Age", 0L);
      this.P = var1.<class07209>N("exit_portal", class07209.field_25064).filter(class07299::method_25953).orElse(null);
      this.s = var1.N("ExactTeleport", false);
   }

   public int R() {
      int ix = 0;

      for (class07211 class07211 : class07211.values()) {
         ix += this.N(class07211) ? 1 : 0;
      }

      return ix;
   }
}
