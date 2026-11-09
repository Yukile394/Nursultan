package minecraft;

import org.jspecify.annotations.Nullable;

public class class06453 extends class06456 {
   private static final int N = 7;
   private static final int y = 8;
   private static final int L = 9;
   private boolean u;

   public class06453(int var1, class05163 var2, class07211 var3) {
      super(class04878.s, var1, var2);
      this.N(var3);
   }

   public class06453(class07001 var1) {
      super(class04878.s, var1);
      this.u = var1.y("Mob", false);
   }

   @Nullable
   public static class06453 N(class03860 var0, int var1, int var2, int var3, int var4, class07211 var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -2, 0, 0, 7, 8, 9, var5);
      return N(class05163) && var0.N(class05163) == null ? new class06453(var4, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 2, 0, 6, 7, 7, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 1, 0, 0, 5, 1, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 2, 1, 5, 2, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 3, 2, 5, 3, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 4, 3, 5, 4, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 2, 0, 1, 4, 2, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 2, 0, 5, 4, 2, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 5, 2, 1, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 5, 2, 5, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 5, 3, 0, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 5, 3, 6, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 5, 8, 5, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
      class00500 class00500x = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      this.L(var1, class00869.Mu.W().y(class00730.i, true), 1, 6, 3, var5);
      this.L(var1, class00869.Mu.W().y(class00730.L, true), 5, 6, 3, var5);
      this.L(var1, class00869.Mu.W().y(class00730.L, true).y(class00730.y, true), 0, 6, 3, var5);
      this.L(var1, class00869.Mu.W().y(class00730.i, true).y(class00730.y, true), 6, 6, 3, var5);
      this.N(var1, var5, 0, 6, 4, 0, 6, 7, class00500x, class00500x, false);
      this.N(var1, var5, 6, 6, 4, 6, 6, 7, class00500x, class00500x, false);
      this.L(var1, class00869.Mu.W().y(class00730.L, true).y(class00730.u, true), 0, 6, 8, var5);
      this.L(var1, class00869.Mu.W().y(class00730.i, true).y(class00730.u, true), 6, 6, 8, var5);
      this.N(var1, var5, 1, 6, 8, 5, 6, 8, class00500x, class00500x, false);
      this.L(var1, class00869.Mu.W().y(class00730.L, true), 1, 7, 8, var5);
      this.N(var1, var5, 2, 7, 8, 4, 7, 8, class00500x, class00500x, false);
      this.L(var1, class00869.Mu.W().y(class00730.i, true), 5, 7, 8, var5);
      this.L(var1, class00869.Mu.W().y(class00730.L, true), 2, 8, 8, var5);
      this.L(var1, class00500x, 3, 8, 8, var5);
      this.L(var1, class00869.Mu.W().y(class00730.i, true), 4, 8, 8, var5);
      if (!this.u) {
         class07218 class07218 = this.L(3, 5, 5);
         if (var5.y(class07218)) {
            this.u = true;
            var1.method_8652(class07218, class00869.La.W(), 2);
            class00394 class00394 = var1.method_8321(class07218);
            if (class00394 instanceof class07235) {
               ((class07235)class00394).N(class07078.T, var4);
            }
         }
      }

      for (int i = 0; i <= 6; i++) {
         for (int j = 0; j <= 6; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Mob", this.u);
   }
}
