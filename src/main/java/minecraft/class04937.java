package minecraft;

import org.jspecify.annotations.Nullable;

public class class04937 extends class04931 {
   protected static final int N = 11;
   protected static final int y = 8;
   protected static final int L = 16;
   private boolean u;

   public class04937(int var1, class05163 var2, class07211 var3) {
      super(class04878.d, var1, var2);
      this.N(var3);
   }

   public class04937(class07001 var1) {
      super(class04878.d, var1);
      this.u = var1.y("Mob", false);
   }

   @Nullable
   public static class04937 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -4, -1, 0, 11, 8, 16, var4);
      return N(class05163) && var0.N(class05163) == null ? new class04937(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 10, 7, 15, false, var4, class04933.L);
      this.N(var1, var4, var5, class04900.field_15289, 4, 1, 0);
      byte b0 = 6;
      this.N(var1, var5, 1, 6, 1, 1, 6, 14, false, var4, class04933.L);
      this.N(var1, var5, 9, 6, 1, 9, 6, 14, false, var4, class04933.L);
      this.N(var1, var5, 2, 6, 1, 8, 6, 2, false, var4, class04933.L);
      this.N(var1, var5, 2, 6, 14, 8, 6, 14, false, var4, class04933.L);
      this.N(var1, var5, 1, 1, 1, 2, 1, 4, false, var4, class04933.L);
      this.N(var1, var5, 8, 1, 1, 9, 1, 4, false, var4, class04933.L);
      this.N(var1, var5, 1, 1, 1, 1, 1, 3, class00869.V.W(), class00869.V.W(), false);
      this.N(var1, var5, 9, 1, 1, 9, 1, 3, class00869.V.W(), class00869.V.W(), false);
      this.N(var1, var5, 3, 1, 8, 7, 1, 12, false, var4, class04933.L);
      this.N(var1, var5, 4, 1, 9, 6, 1, 11, class00869.V.W(), class00869.V.W(), false);
      class00500 class00500xxxx = class00869.RQ.W().y(class07100.y, true).y(class07100.u, true);
      class00500 class00500x = class00869.RQ.W().y(class07100.i, true).y(class07100.L, true);

      for (byte b1 = 3; b1 < 14; b1 += 2) {
         this.N(var1, var5, 0, 3, b1, 0, 4, b1, class00500xxxx, class00500xxxx, false);
         this.N(var1, var5, 10, 3, b1, 10, 4, b1, class00500xxxx, class00500xxxx, false);
      }

      for (byte b2 = 2; b2 < 9; b2 += 2) {
         this.N(var1, var5, b2, 3, 15, b2, 4, 15, class00500x, class00500x, false);
      }

      class00500 class00500xx = class00869.RA.W().y(class07746.y, class07211.field_11043);
      this.N(var1, var5, 4, 1, 5, 6, 1, 7, false, var4, class04933.L);
      this.N(var1, var5, 4, 2, 6, 6, 2, 7, false, var4, class04933.L);
      this.N(var1, var5, 4, 3, 7, 6, 3, 7, false, var4, class04933.L);

      for (int i = 4; i <= 6; i++) {
         this.L(var1, class00500xx, i, 1, 4, var5);
         this.L(var1, class00500xx, i, 2, 5, var5);
         this.L(var1, class00500xx, i, 3, 6, var5);
      }

      class00500 class00500xxx = class00869.Mm.W().y(class07200.y, class07211.field_11043);
      class00500 class00500xxxx = class00869.Mm.W().y(class07200.y, class07211.field_11035);
      class00500 class00500xxxxx = class00869.Mm.W().y(class07200.y, class07211.field_11034);
      class00500 class00500xxxxxx = class00869.Mm.W().y(class07200.y, class07211.field_11039);
      boolean flag = true;
      boolean[] aboolean = new boolean[12];

      for (int j = 0; j < aboolean.length; j++) {
         aboolean[j] = var4.z() > 0.9F;
         flag &= aboolean[j];
      }

      this.L(var1, class00500xxx.y(class07200.L, aboolean[0]), 4, 3, 8, var5);
      this.L(var1, class00500xxx.y(class07200.L, aboolean[1]), 5, 3, 8, var5);
      this.L(var1, class00500xxx.y(class07200.L, aboolean[2]), 6, 3, 8, var5);
      this.L(var1, class00500xxxx.y(class07200.L, aboolean[3]), 4, 3, 12, var5);
      this.L(var1, class00500xxxx.y(class07200.L, aboolean[4]), 5, 3, 12, var5);
      this.L(var1, class00500xxxx.y(class07200.L, aboolean[5]), 6, 3, 12, var5);
      this.L(var1, class00500xxxxx.y(class07200.L, aboolean[6]), 3, 3, 9, var5);
      this.L(var1, class00500xxxxx.y(class07200.L, aboolean[7]), 3, 3, 10, var5);
      this.L(var1, class00500xxxxx.y(class07200.L, aboolean[8]), 3, 3, 11, var5);
      this.L(var1, class00500xxxxxx.y(class07200.L, aboolean[9]), 7, 3, 9, var5);
      this.L(var1, class00500xxxxxx.y(class07200.L, aboolean[10]), 7, 3, 10, var5);
      this.L(var1, class00500xxxxxx.y(class07200.L, aboolean[11]), 7, 3, 11, var5);
      if (flag) {
         class00500 class00500xxxxxxx = class00869.MW.W();
         this.L(var1, class00500xxxxxxx, 4, 3, 9, var5);
         this.L(var1, class00500xxxxxxx, 5, 3, 9, var5);
         this.L(var1, class00500xxxxxxx, 6, 3, 9, var5);
         this.L(var1, class00500xxxxxxx, 4, 3, 10, var5);
         this.L(var1, class00500xxxxxxx, 5, 3, 10, var5);
         this.L(var1, class00500xxxxxxx, 6, 3, 10, var5);
         this.L(var1, class00500xxxxxxx, 4, 3, 11, var5);
         this.L(var1, class00500xxxxxxx, 5, 3, 11, var5);
         this.L(var1, class00500xxxxxxx, 6, 3, 11, var5);
      }

      if (!this.u) {
         class07218 class07218 = this.L(5, 3, 6);
         if (var5.y(class07218)) {
            this.u = true;
            var1.method_8652(class07218, class00869.La.W(), 2);
            class00394 class00394 = var1.method_8321(class07218);
            if (class00394 instanceof class07235) {
               ((class07235)class00394).N(class07078.yW, var4);
            }
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      if (var1 != null) {
         ((class04898)var1).y = this;
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Mob", this.u);
   }
}
