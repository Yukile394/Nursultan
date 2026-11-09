package minecraft;

public class class05175 extends class04894 {
   public static final int N = 12;
   public static final int y = 15;
   private boolean M;
   private boolean B;
   private boolean Z;
   private boolean z;
   private static final class05181 U = new class05181();

   public class05175(class06069 var1, int var2, int var3) {
      super(class04878.J, var2, 64, var3, 12, 10, 15, y(var1));
   }

   public class05175(class07001 var1) {
      super(class04878.J, var1);
      this.M = var1.y("placedMainChest", false);
      this.B = var1.y("placedHiddenChest", false);
      this.Z = var1.y("placedTrap1", false);
      this.z = var1.y("placedTrap2", false);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.N(var1, var5, 0)) {
         this.N(var1, var5, 0, -4, 0, this.L - 1, 0, this.i - 1, false, var4, U);
         this.N(var1, var5, 2, 1, 2, 9, 2, 2, false, var4, U);
         this.N(var1, var5, 2, 1, 12, 9, 2, 12, false, var4, U);
         this.N(var1, var5, 2, 1, 3, 2, 2, 11, false, var4, U);
         this.N(var1, var5, 9, 1, 3, 9, 2, 11, false, var4, U);
         this.N(var1, var5, 1, 3, 1, 10, 6, 1, false, var4, U);
         this.N(var1, var5, 1, 3, 13, 10, 6, 13, false, var4, U);
         this.N(var1, var5, 1, 3, 2, 1, 6, 12, false, var4, U);
         this.N(var1, var5, 10, 3, 2, 10, 6, 12, false, var4, U);
         this.N(var1, var5, 2, 3, 2, 9, 3, 12, false, var4, U);
         this.N(var1, var5, 2, 6, 2, 9, 6, 12, false, var4, U);
         this.N(var1, var5, 3, 7, 3, 8, 7, 11, false, var4, U);
         this.N(var1, var5, 4, 8, 4, 7, 8, 10, false, var4, U);
         this.y(var1, var5, 3, 1, 3, 8, 2, 11);
         this.y(var1, var5, 4, 3, 6, 7, 3, 9);
         this.y(var1, var5, 2, 4, 2, 9, 5, 12);
         this.y(var1, var5, 4, 6, 5, 7, 6, 9);
         this.y(var1, var5, 5, 7, 6, 6, 7, 8);
         this.y(var1, var5, 5, 1, 2, 6, 2, 2);
         this.y(var1, var5, 5, 2, 12, 6, 2, 12);
         this.y(var1, var5, 5, 5, 1, 6, 5, 1);
         this.y(var1, var5, 5, 5, 13, 6, 5, 13);
         this.L(var1, class00869.N.W(), 1, 5, 5, var5);
         this.L(var1, class00869.N.W(), 10, 5, 5, var5);
         this.L(var1, class00869.N.W(), 1, 5, 9, var5);
         this.L(var1, class00869.N.W(), 10, 5, 9, var5);

         for (byte b0 = 0; b0 <= 14; b0 += 14) {
            this.N(var1, var5, 2, 4, b0, 2, 5, b0, false, var4, U);
            this.N(var1, var5, 4, 4, b0, 4, 5, b0, false, var4, U);
            this.N(var1, var5, 7, 4, b0, 7, 5, b0, false, var4, U);
            this.N(var1, var5, 9, 4, b0, 9, 5, b0, false, var4, U);
         }

         this.N(var1, var5, 5, 6, 0, 6, 6, 0, false, var4, U);

         for (byte b2 = 0; b2 <= 11; b2 += 11) {
            for (byte b1 = 2; b1 <= 12; b1 += 2) {
               this.N(var1, var5, b2, 4, b1, b2, 5, b1, false, var4, U);
            }

            this.N(var1, var5, b2, 6, 5, b2, 6, 5, false, var4, U);
            this.N(var1, var5, b2, 6, 9, b2, 6, 9, false, var4, U);
         }

         this.N(var1, var5, 2, 7, 2, 2, 9, 2, false, var4, U);
         this.N(var1, var5, 9, 7, 2, 9, 9, 2, false, var4, U);
         this.N(var1, var5, 2, 7, 12, 2, 9, 12, false, var4, U);
         this.N(var1, var5, 9, 7, 12, 9, 9, 12, false, var4, U);
         this.N(var1, var5, 4, 9, 4, 4, 9, 4, false, var4, U);
         this.N(var1, var5, 7, 9, 4, 7, 9, 4, false, var4, U);
         this.N(var1, var5, 4, 9, 10, 4, 9, 10, false, var4, U);
         this.N(var1, var5, 7, 9, 10, 7, 9, 10, false, var4, U);
         this.N(var1, var5, 5, 9, 7, 6, 9, 7, false, var4, U);
         class00500 class00500xx = class00869.uP.W().y(class07746.y, class07211.field_11034);
         class00500 class00500x = class00869.uP.W().y(class07746.y, class07211.field_11039);
         class00500 class00500xx = class00869.uP.W().y(class07746.y, class07211.field_11035);
         class00500 class00500xxx = class00869.uP.W().y(class07746.y, class07211.field_11043);
         this.L(var1, class00500xxx, 5, 9, 6, var5);
         this.L(var1, class00500xxx, 6, 9, 6, var5);
         this.L(var1, class00500xx, 5, 9, 8, var5);
         this.L(var1, class00500xx, 6, 9, 8, var5);
         this.L(var1, class00500xxx, 4, 0, 0, var5);
         this.L(var1, class00500xxx, 5, 0, 0, var5);
         this.L(var1, class00500xxx, 6, 0, 0, var5);
         this.L(var1, class00500xxx, 7, 0, 0, var5);
         this.L(var1, class00500xxx, 4, 1, 8, var5);
         this.L(var1, class00500xxx, 4, 2, 9, var5);
         this.L(var1, class00500xxx, 4, 3, 10, var5);
         this.L(var1, class00500xxx, 7, 1, 8, var5);
         this.L(var1, class00500xxx, 7, 2, 9, var5);
         this.L(var1, class00500xxx, 7, 3, 10, var5);
         this.N(var1, var5, 4, 1, 9, 4, 1, 9, false, var4, U);
         this.N(var1, var5, 7, 1, 9, 7, 1, 9, false, var4, U);
         this.N(var1, var5, 4, 1, 10, 7, 2, 10, false, var4, U);
         this.N(var1, var5, 5, 4, 5, 6, 4, 5, false, var4, U);
         this.L(var1, class00500xx, 4, 4, 5, var5);
         this.L(var1, class00500x, 7, 4, 5, var5);

         for (int i = 0; i < 4; i++) {
            this.L(var1, class00500xx, 5, 0 - i, 6 + i, var5);
            this.L(var1, class00500xx, 6, 0 - i, 6 + i, var5);
            this.y(var1, var5, 5, 0 - i, 7 + i, 6, 0 - i, 9 + i);
         }

         this.y(var1, var5, 1, -3, 12, 10, -1, 13);
         this.y(var1, var5, 1, -3, 1, 3, -1, 13);
         this.y(var1, var5, 1, -3, 1, 9, -1, 5);

         for (byte b3 = 1; b3 <= 13; b3 += 2) {
            this.N(var1, var5, 1, -3, b3, 1, -2, b3, false, var4, U);
         }

         for (byte b4 = 2; b4 <= 12; b4 += 2) {
            this.N(var1, var5, 1, -1, b4, 3, -1, b4, false, var4, U);
         }

         this.N(var1, var5, 2, -2, 1, 5, -2, 1, false, var4, U);
         this.N(var1, var5, 7, -2, 1, 9, -2, 1, false, var4, U);
         this.N(var1, var5, 6, -3, 1, 6, -3, 1, false, var4, U);
         this.N(var1, var5, 6, -1, 1, 6, -1, 1, false, var4, U);
         this.L(var1, class00869.MG.W().y(class00637.y, class07211.field_11034).y(class00637.u, true), 1, -3, 8, var5);
         this.L(var1, class00869.MG.W().y(class00637.y, class07211.field_11039).y(class00637.u, true), 4, -3, 8, var5);
         this.L(var1, class00869.Ml.W().y(class00664.R, true).y(class00664.B, true).y(class00664.L, true), 2, -3, 8, var5);
         this.L(var1, class00869.Ml.W().y(class00664.R, true).y(class00664.B, true).y(class00664.L, true), 3, -3, 8, var5);
         class00500 class00500xxxx = class00869.Lf.W().y(class06884.y, class08075.field_12689).y(class06884.u, class08075.field_12689);
         this.L(var1, class00500xxxx, 5, -3, 7, var5);
         this.L(var1, class00500xxxx, 5, -3, 6, var5);
         this.L(var1, class00500xxxx, 5, -3, 5, var5);
         this.L(var1, class00500xxxx, 5, -3, 4, var5);
         this.L(var1, class00500xxxx, 5, -3, 3, var5);
         this.L(var1, class00500xxxx, 5, -3, 2, var5);
         this.L(var1, class00869.Lf.W().y(class06884.y, class08075.field_12689).y(class06884.i, class08075.field_12689), 5, -3, 1, var5);
         this.L(var1, class00869.Lf.W().y(class06884.L, class08075.field_12689).y(class06884.i, class08075.field_12689), 4, -3, 1, var5);
         this.L(var1, class00869.LK.W(), 3, -3, 1, var5);
         if (!this.Z) {
            this.Z = this.N(var1, var5, var4, 3, -2, 1, class07211.field_11043, class06273.k);
         }

         this.L(var1, class00869.Rc.W().y(class00659.i, true), 3, -2, 2, var5);
         this.L(var1, class00869.MG.W().y(class00637.y, class07211.field_11043).y(class00637.u, true), 7, -3, 1, var5);
         this.L(var1, class00869.MG.W().y(class00637.y, class07211.field_11035).y(class00637.u, true), 7, -3, 5, var5);
         this.L(var1, class00869.Ml.W().y(class00664.i, true).y(class00664.M, true).y(class00664.L, true), 7, -3, 2, var5);
         this.L(var1, class00869.Ml.W().y(class00664.i, true).y(class00664.M, true).y(class00664.L, true), 7, -3, 3, var5);
         this.L(var1, class00869.Ml.W().y(class00664.i, true).y(class00664.M, true).y(class00664.L, true), 7, -3, 4, var5);
         this.L(var1, class00869.Lf.W().y(class06884.L, class08075.field_12689).y(class06884.i, class08075.field_12689), 8, -3, 6, var5);
         this.L(var1, class00869.Lf.W().y(class06884.i, class08075.field_12689).y(class06884.u, class08075.field_12689), 9, -3, 6, var5);
         this.L(var1, class00869.Lf.W().y(class06884.y, class08075.field_12689).y(class06884.u, class08075.field_12686), 9, -3, 5, var5);
         this.L(var1, class00869.LK.W(), 9, -3, 4, var5);
         this.L(var1, class00500xxxx, 9, -2, 4, var5);
         if (!this.z) {
            this.z = this.N(var1, var5, var4, 9, -2, 3, class07211.field_11039, class06273.k);
         }

         this.L(var1, class00869.Rc.W().y(class00659.u, true), 8, -1, 3, var5);
         this.L(var1, class00869.Rc.W().y(class00659.u, true), 8, -2, 3, var5);
         if (!this.M) {
            this.M = this.N(var1, var5, var4, 8, -3, 3, class06273.w);
         }

         this.L(var1, class00869.LK.W(), 9, -3, 2, var5);
         this.L(var1, class00869.LK.W(), 8, -3, 1, var5);
         this.L(var1, class00869.LK.W(), 4, -3, 5, var5);
         this.L(var1, class00869.LK.W(), 5, -2, 5, var5);
         this.L(var1, class00869.LK.W(), 5, -1, 5, var5);
         this.L(var1, class00869.LK.W(), 6, -3, 5, var5);
         this.L(var1, class00869.LK.W(), 7, -2, 5, var5);
         this.L(var1, class00869.LK.W(), 7, -1, 5, var5);
         this.L(var1, class00869.LK.W(), 8, -3, 5, var5);
         this.N(var1, var5, 9, -1, 1, 9, -1, 5, false, var4, U);
         this.y(var1, var5, 8, -3, 8, 10, -1, 10);
         this.L(var1, class00869.RT.W(), 8, -2, 11, var5);
         this.L(var1, class00869.RT.W(), 9, -2, 11, var5);
         this.L(var1, class00869.RT.W(), 10, -2, 11, var5);
         class00500 class00500xxxxx = class00869.uD.W().y(class07127.R, class07211.field_11043).y(class07127.L, class06657.field_12471);
         this.L(var1, class00500xxxxx, 8, -2, 12, var5);
         this.L(var1, class00500xxxxx, 9, -2, 12, var5);
         this.L(var1, class00500xxxxx, 10, -2, 12, var5);
         this.N(var1, var5, 8, -3, 8, 8, -3, 10, false, var4, U);
         this.N(var1, var5, 10, -3, 8, 10, -3, 10, false, var4, U);
         this.L(var1, class00869.LK.W(), 10, -2, 9, var5);
         this.L(var1, class00500xxxx, 8, -2, 9, var5);
         this.L(var1, class00500xxxx, 8, -2, 10, var5);
         this.L(
            var1,
            class00869.Lf
               .W()
               .y(class06884.y, class08075.field_12689)
               .y(class06884.u, class08075.field_12689)
               .y(class06884.L, class08075.field_12689)
               .y(class06884.i, class08075.field_12689),
            10,
            -1,
            9,
            var5
         );
         this.L(var1, class00869.yd.W().y(class00513.y, class07211.field_11036), 9, -2, 8, var5);
         this.L(var1, class00869.yd.W().y(class00513.y, class07211.field_11039), 10, -2, 8, var5);
         this.L(var1, class00869.yd.W().y(class00513.y, class07211.field_11039), 10, -1, 8, var5);
         this.L(var1, class00869.iH.W().y(class06859.R, class07211.field_11043), 10, -2, 10, var5);
         if (!this.B) {
            this.B = this.N(var1, var5, var4, 9, -3, 10, class06273.w);
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("placedMainChest", this.M);
      var2.N("placedHiddenChest", this.B);
      var2.N("placedTrap1", this.Z);
      var2.N("placedTrap2", this.z);
   }
}
