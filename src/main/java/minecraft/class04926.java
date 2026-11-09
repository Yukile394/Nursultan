package minecraft;

import org.jspecify.annotations.Nullable;

public class class04926 extends class04931 {
   protected static final int N = 14;
   protected static final int y = 6;
   protected static final int L = 11;
   protected static final int u = 15;
   private final boolean R;

   public class04926(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.l, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
      this.R = var3.i() > 6;
   }

   public class04926(class07001 var1) {
      super(class04878.l, var1);
      this.R = var1.y("Tall", false);
   }

   @Nullable
   public static class04926 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!N(class05163) || var0.N(class05163) != null) {
         class05163 = class05163.N(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!N(class05163) || var0.N(class05163) != null) {
            return null;
         }
      }

      return new class04926(var6, var1, class05163, var5);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      byte b0 = 11;
      if (!this.R) {
         b0 = 6;
      }

      this.N(var1, var5, 0, 0, 0, 13, b0 - 1, 14, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 4, 1, 0);
      this.N(var1, var5, var4, 0.07F, 2, 1, 1, 11, 4, 13, class00869.yw.W(), class00869.yw.W(), false, false);
      boolean flag = true;
      byte b1 = 12;

      for (int i = 1; i <= 13; i++) {
         if ((i - 1) % 4 == 0) {
            this.N(var1, var5, 1, 1, i, 1, 4, i, class00869.m.W(), class00869.m.W(), false);
            this.N(var1, var5, 12, 1, i, 12, 4, i, class00869.m.W(), class00869.m.W(), false);
            this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11034), 2, 3, i, var5);
            this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11039), 11, 3, i, var5);
            if (this.R) {
               this.N(var1, var5, 1, 6, i, 1, 9, i, class00869.m.W(), class00869.m.W(), false);
               this.N(var1, var5, 12, 6, i, 12, 9, i, class00869.m.W(), class00869.m.W(), false);
            }
         } else {
            this.N(var1, var5, 1, 1, i, 1, 4, i, class00869.Lt.W(), class00869.Lt.W(), false);
            this.N(var1, var5, 12, 1, i, 12, 4, i, class00869.Lt.W(), class00869.Lt.W(), false);
            if (this.R) {
               this.N(var1, var5, 1, 6, i, 1, 9, i, class00869.Lt.W(), class00869.Lt.W(), false);
               this.N(var1, var5, 12, 6, i, 12, 9, i, class00869.Lt.W(), class00869.Lt.W(), false);
            }
         }
      }

      for (byte b4 = 3; b4 < 12; b4 += 2) {
         this.N(var1, var5, 3, 1, b4, 4, 3, b4, class00869.Lt.W(), class00869.Lt.W(), false);
         this.N(var1, var5, 6, 1, b4, 7, 3, b4, class00869.Lt.W(), class00869.Lt.W(), false);
         this.N(var1, var5, 9, 1, b4, 10, 3, b4, class00869.Lt.W(), class00869.Lt.W(), false);
      }

      if (this.R) {
         this.N(var1, var5, 1, 5, 1, 3, 5, 13, class00869.m.W(), class00869.m.W(), false);
         this.N(var1, var5, 10, 5, 1, 12, 5, 13, class00869.m.W(), class00869.m.W(), false);
         this.N(var1, var5, 4, 5, 1, 9, 5, 2, class00869.m.W(), class00869.m.W(), false);
         this.N(var1, var5, 4, 5, 12, 9, 5, 13, class00869.m.W(), class00869.m.W(), false);
         this.L(var1, class00869.m.W(), 9, 5, 11, var5);
         this.L(var1, class00869.m.W(), 8, 5, 11, var5);
         this.L(var1, class00869.m.W(), 9, 5, 10, var5);
         class00500 class00500x = class00869.il.W().y(class00730.i, true).y(class00730.L, true);
         class00500 class00500x = class00869.il.W().y(class00730.y, true).y(class00730.u, true);
         this.N(var1, var5, 3, 6, 3, 3, 6, 11, class00500x, class00500x, false);
         this.N(var1, var5, 10, 6, 3, 10, 6, 9, class00500x, class00500x, false);
         this.N(var1, var5, 4, 6, 2, 9, 6, 2, class00500x, class00500x, false);
         this.N(var1, var5, 4, 6, 12, 7, 6, 12, class00500x, class00500x, false);
         this.L(var1, class00869.il.W().y(class00730.y, true).y(class00730.L, true), 3, 6, 2, var5);
         this.L(var1, class00869.il.W().y(class00730.u, true).y(class00730.L, true), 3, 6, 12, var5);
         this.L(var1, class00869.il.W().y(class00730.y, true).y(class00730.i, true), 10, 6, 2, var5);

         for (int j = 0; j <= 2; j++) {
            this.L(var1, class00869.il.W().y(class00730.u, true).y(class00730.i, true), 8 + j, 6, 12 - j, var5);
            if (j != 2) {
               this.L(var1, class00869.il.W().y(class00730.y, true).y(class00730.L, true), 8 + j, 6, 11 - j, var5);
            }
         }

         class00500 class00500xx = class00869.uW.W().y(class07123.y, class07211.field_11035);
         this.L(var1, class00500xx, 10, 1, 13, var5);
         this.L(var1, class00500xx, 10, 2, 13, var5);
         this.L(var1, class00500xx, 10, 3, 13, var5);
         this.L(var1, class00500xx, 10, 4, 13, var5);
         this.L(var1, class00500xx, 10, 5, 13, var5);
         this.L(var1, class00500xx, 10, 6, 13, var5);
         this.L(var1, class00500xx, 10, 7, 13, var5);
         byte b2 = 7;
         byte b3 = 7;
         class00500 class00500xxx = class00869.il.W().y(class00730.L, true);
         this.L(var1, class00500xxx, 6, 9, 7, var5);
         class00500 class00500xxxx = class00869.il.W().y(class00730.i, true);
         this.L(var1, class00500xxxx, 7, 9, 7, var5);
         this.L(var1, class00500xxx, 6, 8, 7, var5);
         this.L(var1, class00500xxxx, 7, 8, 7, var5);
         class00500 class00500xxxxx = class00500x.y(class00730.i, true).y(class00730.L, true);
         this.L(var1, class00500xxxxx, 6, 7, 7, var5);
         this.L(var1, class00500xxxxx, 7, 7, 7, var5);
         this.L(var1, class00500xxx, 5, 7, 7, var5);
         this.L(var1, class00500xxxx, 8, 7, 7, var5);
         this.L(var1, class00500xxx.y(class00730.y, true), 6, 7, 6, var5);
         this.L(var1, class00500xxx.y(class00730.u, true), 6, 7, 8, var5);
         this.L(var1, class00500xxxx.y(class00730.y, true), 7, 7, 6, var5);
         this.L(var1, class00500xxxx.y(class00730.u, true), 7, 7, 8, var5);
         class00500 class00500xxxxxx = class00869.Le.W();
         this.L(var1, class00500xxxxxx, 5, 8, 7, var5);
         this.L(var1, class00500xxxxxx, 8, 8, 7, var5);
         this.L(var1, class00500xxxxxx, 6, 8, 6, var5);
         this.L(var1, class00500xxxxxx, 6, 8, 8, var5);
         this.L(var1, class00500xxxxxx, 7, 8, 6, var5);
         this.L(var1, class00500xxxxxx, 7, 8, 8, var5);
      }

      this.N(var1, var5, var4, 3, 3, 5, class06273.t);
      if (this.R) {
         this.L(var1, w, 12, 9, 1, var5);
         this.N(var1, var5, var4, 12, 8, 1, class06273.t);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Tall", this.R);
   }
}
