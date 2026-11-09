package minecraft;

public class class04893 extends class04894 {
   private boolean N;
   private boolean y;

   public class04893(class06069 var1, int var2, int var3) {
      super(class04878.V, var2, 64, var3, 7, 7, 9, y(var1));
   }

   public class04893(class07001 var1) {
      super(class04878.V, var1);
      this.N = var1.y("Witch", false);
      this.y = var1.y("Cat", false);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.N(var1, var5, 0)) {
         this.N(var1, var5, 1, 1, 1, 5, 1, 7, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 1, 4, 2, 5, 4, 7, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 2, 1, 0, 4, 1, 0, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 2, 2, 2, 3, 3, 2, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 1, 2, 3, 1, 3, 6, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 5, 2, 3, 5, 3, 6, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 2, 2, 7, 4, 3, 7, class00869.P.W(), class00869.P.W(), false);
         this.N(var1, var5, 1, 0, 2, 1, 3, 2, class00869.D.W(), class00869.D.W(), false);
         this.N(var1, var5, 5, 0, 2, 5, 3, 2, class00869.D.W(), class00869.D.W(), false);
         this.N(var1, var5, 1, 0, 7, 1, 3, 7, class00869.D.W(), class00869.D.W(), false);
         this.N(var1, var5, 5, 0, 7, 5, 3, 7, class00869.D.W(), class00869.D.W(), false);
         this.L(var1, class00869.il.W(), 2, 3, 2, var5);
         this.L(var1, class00869.il.W(), 3, 3, 7, var5);
         this.L(var1, class00869.N.W(), 1, 3, 4, var5);
         this.L(var1, class00869.N.W(), 5, 3, 4, var5);
         this.L(var1, class00869.N.W(), 5, 3, 5, var5);
         this.L(var1, class00869.BR.W(), 1, 3, 5, var5);
         this.L(var1, class00869.LD.W(), 3, 2, 6, var5);
         this.L(var1, class00869.MZ.W(), 4, 2, 6, var5);
         this.L(var1, class00869.il.W(), 1, 2, 1, var5);
         this.L(var1, class00869.il.W(), 5, 2, 1, var5);
         class00500 class00500xxx = class00869.Mw.W().y(class07746.y, class07211.field_11043);
         class00500 class00500x = class00869.Mw.W().y(class07746.y, class07211.field_11034);
         class00500 class00500xx = class00869.Mw.W().y(class07746.y, class07211.field_11039);
         class00500 class00500xxx = class00869.Mw.W().y(class07746.y, class07211.field_11035);
         this.N(var1, var5, 0, 4, 1, 6, 4, 1, class00500xxx, class00500xxx, false);
         this.N(var1, var5, 0, 4, 2, 0, 4, 7, class00500x, class00500x, false);
         this.N(var1, var5, 6, 4, 2, 6, 4, 7, class00500xx, class00500xx, false);
         this.N(var1, var5, 0, 4, 8, 6, 4, 8, class00500xxx, class00500xxx, false);
         this.L(var1, class00500xxx.y(class07746.u, class08061.field_12709), 0, 4, 1, var5);
         this.L(var1, class00500xxx.y(class07746.u, class08061.field_12708), 6, 4, 1, var5);
         this.L(var1, class00500xxx.y(class07746.u, class08061.field_12708), 0, 4, 8, var5);
         this.L(var1, class00500xxx.y(class07746.u, class08061.field_12709), 6, 4, 8, var5);

         for (byte b0 = 2; b0 <= 7; b0 += 5) {
            for (byte b1 = 1; b1 <= 5; b1 += 4) {
               this.N(var1, class00869.D.W(), b1, -1, b0, var5);
            }
         }

         if (!this.N) {
            class07218 class07218 = this.L(2, 2, 5);
            if (var5.y(class07218)) {
               this.N = true;
               class08047 class08047 = class07078.yp.N(var1.method_8410(), class06113.field_16474);
               if (class08047 != null) {
                  class08047.NW();
                  class08047.method_5808(class07218.method_10263() + 0.5, class07218.method_10264(), class07218.method_10260() + 0.5, 0.0F, 0.0F);
                  class08047.N(var1, var1.method_8404(class07218), class06113.field_16474, null);
                  var1.y(class08047);
               }
            }
         }

         this.N(var1, var5);
      }
   }

   private void N(class01001 var1, class05163 var2) {
      if (!this.y) {
         class07218 class07218 = this.L(2, 2, 5);
         if (var2.y(class07218)) {
            this.y = true;
            class07617 class07617 = class07078.l.N(var1.method_8410(), class06113.field_16474);
            if (class07617 != null) {
               class07617.NW();
               class07617.method_5808(class07218.method_10263() + 0.5, class07218.method_10264(), class07218.method_10260() + 0.5, 0.0F, 0.0F);
               class07617.N(var1, var1.method_8404(class07218), class06113.field_16474, null);
               var1.y(class07617);
            }
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Witch", this.N);
      var2.N("Cat", this.y);
   }
}
