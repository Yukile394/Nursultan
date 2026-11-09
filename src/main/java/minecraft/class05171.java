package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class05171 extends class04894 {
   public static final int N = 21;
   public static final int y = 21;
   private final boolean[] M = new boolean[4];
   private final List<class07209> B = new ArrayList<>();
   private class07209 Z = class07209.field_10980;

   public class05171(class06069 var1, int var2, int var3) {
      super(class04878.e, var2, 64, var3, 21, 15, 21, y(var1));
   }

   public class05171(class07001 var1) {
      super(class04878.e, var1);
      this.M[0] = var1.y("hasPlacedChest0", false);
      this.M[1] = var1.y("hasPlacedChest1", false);
      this.M[2] = var1.y("hasPlacedChest2", false);
      this.M[3] = var1.y("hasPlacedChest3", false);
   }

   private void y(int var1, int var2, int var3) {
      class07218 class07218 = this.L(var1, var2, var3);
      this.B.add(class07218);
   }

   private void y(class07209 var1, class05974 var2, class05163 var3) {
      int i = var1.method_10263();
      int j = var1.method_10264();
      int k = var1.method_10260();
      class00500 class00500xxx = class00869.yi.W();
      class00500 class00500x = class00869.yu.W();
      this.N(var2, var3, i - 3, j + 1, k - 3, i - 3, j + 1, k + 2, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i + 3, j + 1, k - 3, i + 3, j + 1, k + 2, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i - 3, j + 1, k - 3, i + 3, j + 1, k - 2, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i - 3, j + 1, k + 3, i + 3, j + 1, k + 3, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i - 3, j + 2, k - 3, i - 3, j + 2, k + 2, class00500x, class00500x, true);
      this.N(var2, var3, i + 3, j + 2, k - 3, i + 3, j + 2, k + 2, class00500x, class00500x, true);
      this.N(var2, var3, i - 3, j + 2, k - 3, i + 3, j + 2, k - 2, class00500x, class00500x, true);
      this.N(var2, var3, i - 3, j + 2, k + 3, i + 3, j + 2, k + 3, class00500x, class00500x, true);
      this.N(var2, var3, i - 3, -1, k - 3, i - 3, -1, k + 2, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i + 3, -1, k - 3, i + 3, -1, k + 2, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i - 3, -1, k - 3, i + 3, -1, k - 2, class00500xxx, class00500xxx, true);
      this.N(var2, var3, i - 3, -1, k + 3, i + 3, -1, k + 3, class00500xxx, class00500xxx, true);
      this.N(i - 2, j + 1, k - 2, i + 2, j + 3, k + 2);
      this.N(var2, var3, i - 2, j + 4, k - 2, i + 2, k + 2);
      class00500 class00500xx = class00869.Zy.W();
      class00500 class00500xxx = class00869.ZE.W();
      this.L(var2, class00500xxx, i, j, k, var3);
      this.L(var2, class00500xx, i + 1, j, k - 1, var3);
      this.L(var2, class00500xx, i + 1, j, k + 1, var3);
      this.L(var2, class00500xx, i - 1, j, k - 1, var3);
      this.L(var2, class00500xx, i - 1, j, k + 1, var3);
      this.L(var2, class00500xx, i + 2, j, k, var3);
      this.L(var2, class00500xx, i - 2, j, k, var3);
      this.L(var2, class00500xx, i, j, k + 2, var3);
      this.L(var2, class00500xx, i, j, k - 2, var3);
      this.L(var2, class00500xx, i + 3, j, k, var3);
      this.y(i + 3, j + 1, k);
      this.y(i + 3, j + 2, k);
      this.L(var2, class00500xxx, i + 4, j + 1, k, var3);
      this.L(var2, class00500x, i + 4, j + 2, k, var3);
      this.L(var2, class00500xx, i - 3, j, k, var3);
      this.y(i - 3, j + 1, k);
      this.y(i - 3, j + 2, k);
      this.L(var2, class00500xxx, i - 4, j + 1, k, var3);
      this.L(var2, class00500x, i - 4, j + 2, k, var3);
      this.L(var2, class00500xx, i, j, k + 3, var3);
      this.y(i, j + 1, k + 3);
      this.y(i, j + 2, k + 3);
      this.L(var2, class00500xx, i, j, k - 3, var3);
      this.y(i, j + 1, k - 3);
      this.y(i, j + 2, k - 3);
      this.L(var2, class00500xxx, i, j + 1, k - 4, var3);
      this.L(var2, class00500x, i, -2, k - 4, var3);
   }

   public class07209 y() {
      return this.Z;
   }

   private void N(class05974 var1, int var2, int var3, int var4, class05163 var5) {
      if (var1.method_8409().z() < 0.33F) {
         class00500 class00500x = class00869.yL.W();
         this.L(var1, class00500x, var2, var3, var4, var5);
      } else {
         class00500 class00500 = class00869.e.W();
         this.L(var1, class00500, var2, var3, var4, var5);
      }
   }

   private void N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7) {
      for (int i = var3; i <= var6; i++) {
         for (int j = var5; j <= var7; j++) {
            this.N(var1, i, var4, j, var2);
         }
      }

      class06069 class06069 = class06069.y(var1.method_8412()).L().N(this.L(var3, var4, var5));
      int l = class06069.N(var3, var6);
      int k = class06069.N(var5, var7);
      this.Z = new class07209(this.N(l, k), this.L(var4), this.y(l, k));
   }

   public List<class07209> N() {
      return this.B;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("hasPlacedChest0", this.M[0]);
      var2.N("hasPlacedChest1", this.M[1]);
      var2.N("hasPlacedChest2", this.M[2]);
      var2.N("hasPlacedChest3", this.M[3]);
   }

   private void N(class07209 var1, class05974 var2, class05163 var3) {
      int i = var1.method_10263();
      int j = var1.method_10264();
      int k = var1.method_10260();
      class00500 class00500xx = class00869.Mj.W();
      this.L(var2, class00500xx.N(class06993.field_11465), 13, -1, 17, var3);
      this.L(var2, class00500xx.N(class06993.field_11465), 14, -2, 17, var3);
      this.L(var2, class00500xx.N(class06993.field_11465), 15, -3, 17, var3);
      class00500 class00500x = class00869.e.W();
      class00500 class00500xx = class00869.yL.W();
      boolean flag = var2.method_8409().Z();
      this.L(var2, class00500x, i - 4, j + 4, k + 4, var3);
      this.L(var2, class00500x, i - 3, j + 4, k + 4, var3);
      this.L(var2, class00500x, i - 2, j + 4, k + 4, var3);
      this.L(var2, class00500x, i - 1, j + 4, k + 4, var3);
      this.L(var2, class00500x, i, j + 4, k + 4, var3);
      this.L(var2, class00500x, i - 2, j + 3, k + 4, var3);
      this.L(var2, flag ? class00500x : class00500xx, i - 1, j + 3, k + 4, var3);
      this.L(var2, !flag ? class00500x : class00500xx, i, j + 3, k + 4, var3);
      this.L(var2, class00500x, i - 1, j + 2, k + 4, var3);
      this.L(var2, class00500xx, i, j + 2, k + 4, var3);
      this.L(var2, class00500x, i, j + 1, k + 4, var3);
   }

   private void N(class05974 var1, class05163 var2) {
      class07209 class07209 = new class07209(16, -4, 13);
      this.N(class07209, var1, var2);
      this.y(class07209, var1, var2);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.N(var1, -var4.y(3))) {
         this.N(var1, var5, 0, -4, 0, this.L - 1, 0, this.i - 1, class00869.yL.W(), class00869.yL.W(), false);

         for (int i = 1; i <= 9; i++) {
            this.N(var1, var5, i, i, i, this.L - 1 - i, i, this.i - 1 - i, class00869.yL.W(), class00869.yL.W(), false);
            this.N(var1, var5, i + 1, i, i + 1, this.L - 2 - i, i, this.i - 2 - i, class00869.N.W(), class00869.N.W(), false);
         }

         for (int i1 = 0; i1 < this.L; i1++) {
            for (int j = 0; j < this.i; j++) {
               byte b0 = -5;
               this.N(var1, class00869.yL.W(), i1, -5, j, var5);
            }
         }

         class00500 class00500xx = class00869.Mj.W().y(class07746.y, class07211.field_11043);
         class00500 class00500x = class00869.Mj.W().y(class07746.y, class07211.field_11035);
         class00500 class00500xx = class00869.Mj.W().y(class07746.y, class07211.field_11034);
         class00500 class00500xxx = class00869.Mj.W().y(class07746.y, class07211.field_11039);
         this.N(var1, var5, 0, 0, 0, 4, 9, 4, class00869.yL.W(), class00869.N.W(), false);
         this.N(var1, var5, 1, 10, 1, 3, 10, 3, class00869.yL.W(), class00869.yL.W(), false);
         this.L(var1, class00500xx, 2, 10, 0, var5);
         this.L(var1, class00500x, 2, 10, 4, var5);
         this.L(var1, class00500xx, 0, 10, 2, var5);
         this.L(var1, class00500xxx, 4, 10, 2, var5);
         this.N(var1, var5, this.L - 5, 0, 0, this.L - 1, 9, 4, class00869.yL.W(), class00869.N.W(), false);
         this.N(var1, var5, this.L - 4, 10, 1, this.L - 2, 10, 3, class00869.yL.W(), class00869.yL.W(), false);
         this.L(var1, class00500xx, this.L - 3, 10, 0, var5);
         this.L(var1, class00500x, this.L - 3, 10, 4, var5);
         this.L(var1, class00500xx, this.L - 5, 10, 2, var5);
         this.L(var1, class00500xxx, this.L - 1, 10, 2, var5);
         this.N(var1, var5, 8, 0, 0, 12, 4, 4, class00869.yL.W(), class00869.N.W(), false);
         this.N(var1, var5, 9, 1, 0, 11, 3, 4, class00869.N.W(), class00869.N.W(), false);
         this.L(var1, class00869.yi.W(), 9, 1, 1, var5);
         this.L(var1, class00869.yi.W(), 9, 2, 1, var5);
         this.L(var1, class00869.yi.W(), 9, 3, 1, var5);
         this.L(var1, class00869.yi.W(), 10, 3, 1, var5);
         this.L(var1, class00869.yi.W(), 11, 3, 1, var5);
         this.L(var1, class00869.yi.W(), 11, 2, 1, var5);
         this.L(var1, class00869.yi.W(), 11, 1, 1, var5);
         this.N(var1, var5, 4, 1, 1, 8, 3, 3, class00869.yL.W(), class00869.N.W(), false);
         this.N(var1, var5, 4, 1, 2, 8, 2, 2, class00869.N.W(), class00869.N.W(), false);
         this.N(var1, var5, 12, 1, 1, 16, 3, 3, class00869.yL.W(), class00869.N.W(), false);
         this.N(var1, var5, 12, 1, 2, 16, 2, 2, class00869.N.W(), class00869.N.W(), false);
         this.N(var1, var5, 5, 4, 5, this.L - 6, 4, this.i - 6, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, 9, 4, 9, 11, 4, 11, class00869.N.W(), class00869.N.W(), false);
         this.N(var1, var5, 8, 1, 8, 8, 3, 8, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, 12, 1, 8, 12, 3, 8, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, 8, 1, 12, 8, 3, 12, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, 12, 1, 12, 12, 3, 12, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, 1, 1, 5, 4, 4, 11, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, this.L - 5, 1, 5, this.L - 2, 4, 11, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, 6, 7, 9, 6, 7, 11, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, this.L - 7, 7, 9, this.L - 7, 7, 11, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, 5, 5, 9, 5, 7, 11, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, this.L - 6, 5, 9, this.L - 6, 7, 11, class00869.yi.W(), class00869.yi.W(), false);
         this.L(var1, class00869.N.W(), 5, 5, 10, var5);
         this.L(var1, class00869.N.W(), 5, 6, 10, var5);
         this.L(var1, class00869.N.W(), 6, 6, 10, var5);
         this.L(var1, class00869.N.W(), this.L - 6, 5, 10, var5);
         this.L(var1, class00869.N.W(), this.L - 6, 6, 10, var5);
         this.L(var1, class00869.N.W(), this.L - 7, 6, 10, var5);
         this.N(var1, var5, 2, 4, 4, 2, 6, 4, class00869.N.W(), class00869.N.W(), false);
         this.N(var1, var5, this.L - 3, 4, 4, this.L - 3, 6, 4, class00869.N.W(), class00869.N.W(), false);
         this.L(var1, class00500xx, 2, 4, 5, var5);
         this.L(var1, class00500xx, 2, 3, 4, var5);
         this.L(var1, class00500xx, this.L - 3, 4, 5, var5);
         this.L(var1, class00500xx, this.L - 3, 3, 4, var5);
         this.N(var1, var5, 1, 1, 3, 2, 2, 3, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, this.L - 3, 1, 3, this.L - 2, 2, 3, class00869.yL.W(), class00869.yL.W(), false);
         this.L(var1, class00869.yL.W(), 1, 1, 2, var5);
         this.L(var1, class00869.yL.W(), this.L - 2, 1, 2, var5);
         this.L(var1, class00869.Ud.W(), 1, 2, 2, var5);
         this.L(var1, class00869.Ud.W(), this.L - 2, 2, 2, var5);
         this.L(var1, class00500xxx, 2, 1, 2, var5);
         this.L(var1, class00500xx, this.L - 3, 1, 2, var5);
         this.N(var1, var5, 4, 3, 5, 4, 3, 17, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, this.L - 5, 3, 5, this.L - 5, 3, 17, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, 3, 1, 5, 4, 2, 16, class00869.N.W(), class00869.N.W(), false);
         this.N(var1, var5, this.L - 6, 1, 5, this.L - 5, 2, 16, class00869.N.W(), class00869.N.W(), false);

         for (byte var12 = 5; var12 <= 17; var12 += 2) {
            this.L(var1, class00869.yi.W(), 4, 1, var12, var5);
            this.L(var1, class00869.yu.W(), 4, 2, var12, var5);
            this.L(var1, class00869.yi.W(), this.L - 5, 1, var12, var5);
            this.L(var1, class00869.yu.W(), this.L - 5, 2, var12, var5);
         }

         this.L(var1, class00869.Zy.W(), 10, 0, 7, var5);
         this.L(var1, class00869.Zy.W(), 10, 0, 8, var5);
         this.L(var1, class00869.Zy.W(), 9, 0, 9, var5);
         this.L(var1, class00869.Zy.W(), 11, 0, 9, var5);
         this.L(var1, class00869.Zy.W(), 8, 0, 10, var5);
         this.L(var1, class00869.Zy.W(), 12, 0, 10, var5);
         this.L(var1, class00869.Zy.W(), 7, 0, 10, var5);
         this.L(var1, class00869.Zy.W(), 13, 0, 10, var5);
         this.L(var1, class00869.Zy.W(), 9, 0, 11, var5);
         this.L(var1, class00869.Zy.W(), 11, 0, 11, var5);
         this.L(var1, class00869.Zy.W(), 10, 0, 12, var5);
         this.L(var1, class00869.Zy.W(), 10, 0, 13, var5);
         this.L(var1, class00869.ZE.W(), 10, 0, 10, var5);

         for (int j1 = 0; j1 <= this.L - 1; j1 += this.L - 1) {
            this.L(var1, class00869.yi.W(), j1, 2, 1, var5);
            this.L(var1, class00869.Zy.W(), j1, 2, 2, var5);
            this.L(var1, class00869.yi.W(), j1, 2, 3, var5);
            this.L(var1, class00869.yi.W(), j1, 3, 1, var5);
            this.L(var1, class00869.Zy.W(), j1, 3, 2, var5);
            this.L(var1, class00869.yi.W(), j1, 3, 3, var5);
            this.L(var1, class00869.Zy.W(), j1, 4, 1, var5);
            this.L(var1, class00869.yu.W(), j1, 4, 2, var5);
            this.L(var1, class00869.Zy.W(), j1, 4, 3, var5);
            this.L(var1, class00869.yi.W(), j1, 5, 1, var5);
            this.L(var1, class00869.Zy.W(), j1, 5, 2, var5);
            this.L(var1, class00869.yi.W(), j1, 5, 3, var5);
            this.L(var1, class00869.Zy.W(), j1, 6, 1, var5);
            this.L(var1, class00869.yu.W(), j1, 6, 2, var5);
            this.L(var1, class00869.Zy.W(), j1, 6, 3, var5);
            this.L(var1, class00869.Zy.W(), j1, 7, 1, var5);
            this.L(var1, class00869.Zy.W(), j1, 7, 2, var5);
            this.L(var1, class00869.Zy.W(), j1, 7, 3, var5);
            this.L(var1, class00869.yi.W(), j1, 8, 1, var5);
            this.L(var1, class00869.yi.W(), j1, 8, 2, var5);
            this.L(var1, class00869.yi.W(), j1, 8, 3, var5);
         }

         for (int k1 = 2; k1 <= this.L - 3; k1 += this.L - 3 - 2) {
            this.L(var1, class00869.yi.W(), k1 - 1, 2, 0, var5);
            this.L(var1, class00869.Zy.W(), k1, 2, 0, var5);
            this.L(var1, class00869.yi.W(), k1 + 1, 2, 0, var5);
            this.L(var1, class00869.yi.W(), k1 - 1, 3, 0, var5);
            this.L(var1, class00869.Zy.W(), k1, 3, 0, var5);
            this.L(var1, class00869.yi.W(), k1 + 1, 3, 0, var5);
            this.L(var1, class00869.Zy.W(), k1 - 1, 4, 0, var5);
            this.L(var1, class00869.yu.W(), k1, 4, 0, var5);
            this.L(var1, class00869.Zy.W(), k1 + 1, 4, 0, var5);
            this.L(var1, class00869.yi.W(), k1 - 1, 5, 0, var5);
            this.L(var1, class00869.Zy.W(), k1, 5, 0, var5);
            this.L(var1, class00869.yi.W(), k1 + 1, 5, 0, var5);
            this.L(var1, class00869.Zy.W(), k1 - 1, 6, 0, var5);
            this.L(var1, class00869.yu.W(), k1, 6, 0, var5);
            this.L(var1, class00869.Zy.W(), k1 + 1, 6, 0, var5);
            this.L(var1, class00869.Zy.W(), k1 - 1, 7, 0, var5);
            this.L(var1, class00869.Zy.W(), k1, 7, 0, var5);
            this.L(var1, class00869.Zy.W(), k1 + 1, 7, 0, var5);
            this.L(var1, class00869.yi.W(), k1 - 1, 8, 0, var5);
            this.L(var1, class00869.yi.W(), k1, 8, 0, var5);
            this.L(var1, class00869.yi.W(), k1 + 1, 8, 0, var5);
         }

         this.N(var1, var5, 8, 4, 0, 12, 6, 0, class00869.yi.W(), class00869.yi.W(), false);
         this.L(var1, class00869.N.W(), 8, 6, 0, var5);
         this.L(var1, class00869.N.W(), 12, 6, 0, var5);
         this.L(var1, class00869.Zy.W(), 9, 5, 0, var5);
         this.L(var1, class00869.yu.W(), 10, 5, 0, var5);
         this.L(var1, class00869.Zy.W(), 11, 5, 0, var5);
         this.N(var1, var5, 8, -14, 8, 12, -11, 12, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, 8, -10, 8, 12, -10, 12, class00869.yu.W(), class00869.yu.W(), false);
         this.N(var1, var5, 8, -9, 8, 12, -9, 12, class00869.yi.W(), class00869.yi.W(), false);
         this.N(var1, var5, 8, -8, 8, 12, -1, 12, class00869.yL.W(), class00869.yL.W(), false);
         this.N(var1, var5, 9, -11, 9, 11, -1, 11, class00869.N.W(), class00869.N.W(), false);
         this.L(var1, class00869.uh.W(), 10, -11, 10, var5);
         this.N(var1, var5, 9, -13, 9, 11, -13, 11, class00869.Ln.W(), class00869.N.W(), false);
         this.L(var1, class00869.N.W(), 8, -11, 10, var5);
         this.L(var1, class00869.N.W(), 8, -10, 10, var5);
         this.L(var1, class00869.yu.W(), 7, -10, 10, var5);
         this.L(var1, class00869.yi.W(), 7, -11, 10, var5);
         this.L(var1, class00869.N.W(), 12, -11, 10, var5);
         this.L(var1, class00869.N.W(), 12, -10, 10, var5);
         this.L(var1, class00869.yu.W(), 13, -10, 10, var5);
         this.L(var1, class00869.yi.W(), 13, -11, 10, var5);
         this.L(var1, class00869.N.W(), 10, -11, 8, var5);
         this.L(var1, class00869.N.W(), 10, -10, 8, var5);
         this.L(var1, class00869.yu.W(), 10, -10, 7, var5);
         this.L(var1, class00869.yi.W(), 10, -11, 7, var5);
         this.L(var1, class00869.N.W(), 10, -11, 12, var5);
         this.L(var1, class00869.N.W(), 10, -10, 12, var5);
         this.L(var1, class00869.yu.W(), 10, -10, 13, var5);
         this.L(var1, class00869.yi.W(), 10, -11, 13, var5);

         for (class07211 class07211 : class07221.field_11062) {
            if (!this.M[class07211.u()]) {
               int k = class07211.P() * 2;
               int l = class07211.T() * 2;
               this.M[class07211.u()] = this.N(var1, var5, var4, 10 + k, -11, 10 + l, class06273.d);
            }
         }

         this.N(var1, var5);
      }
   }

   private void N(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int i = var2; i <= var5; i++) {
         for (int j = var1; j <= var4; j++) {
            for (int k = var3; k <= var6; k++) {
               this.y(j, i, k);
            }
         }
      }
   }
}
