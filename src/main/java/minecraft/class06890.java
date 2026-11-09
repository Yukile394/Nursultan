package minecraft;

import java.util.BitSet;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.BitSetDiscreteVoxelShapeAccessor;

public final class class06890 extends class07739 implements BitSetDiscreteVoxelShapeAccessor {
   private final BitSet N;
   private int y;
   private int L;
   private int u;
   private int i;
   private int R;
   private int M;

   public class06890(class07739 var1) {
      super(var1.field_1374, var1.field_1373, var1.field_1372);
      if (var1 instanceof class06890) {
         this.N = (BitSet)((class06890)var1).N.clone();
      } else {
         this.N = new BitSet(this.field_1374 * this.field_1373 * this.field_1372);

         for (int ix = 0; ix < this.field_1374; ix++) {
            for (int j = 0; j < this.field_1373; j++) {
               for (int k = 0; k < this.field_1372; k++) {
                  if (var1.method_1063(ix, j, k)) {
                     this.N.set(this.N(ix, j, k));
                  }
               }
            }
         }
      }

      this.y = var1.method_1055(class07185.field_11048);
      this.L = var1.method_1055(class07185.field_11052);
      this.u = var1.method_1055(class07185.field_11051);
      this.i = var1.method_1045(class07185.field_11048);
      this.R = var1.method_1045(class07185.field_11052);
      this.M = var1.method_1045(class07185.field_11051);
   }

   public class06890(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.N = new BitSet(var1 * var2 * var3);
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private void y(int var1, int var2, int var3, int var4) {
      this.N.clear(this.N(var3, var4, var1), this.N(var3, var4, var2));
   }

   public boolean y(int var1, int var2, int var3) {
      return var1 > 0
         && var1 < this.field_1374 - 1
         && var2 > 0
         && var2 < this.field_1373 - 1
         && var3 > 0
         && var3 < this.field_1372 - 1
         && this.method_1063(var1, var2, var3)
         && this.method_1063(var1 - 1, var2, var3)
         && this.method_1063(var1 + 1, var2, var3)
         && this.method_1063(var1, var2 - 1, var3)
         && this.method_1063(var1, var2 + 1, var3)
         && this.method_1063(var1, var2, var3 - 1)
         && this.method_1063(var1, var2, var3 + 1);
   }

   private boolean N(int var1, int var2, int var3, int var4, int var5) {
      for (int ix = var1; ix < var2; ix++) {
         if (!this.N(var3, var4, ix, var5)) {
            return false;
         }
      }

      return true;
   }

   private boolean N(int var1, int var2, int var3, int var4) {
      return var3 < this.field_1374 && var4 < this.field_1373 ? this.N.nextClearBit(this.N(var3, var4, var1)) >= this.N(var3, var4, var2) : false;
   }

   public static void N(class07739 var0, class07716 var1, boolean var2) {
      class06890 class06890 = new class06890(var0);

      for (int ix = 0; ix < class06890.field_1373; ix++) {
         for (int j = 0; j < class06890.field_1374; j++) {
            int k = -1;

            for (int l = 0; l <= class06890.field_1372; l++) {
               if (class06890.method_1044(j, ix, l)) {
                  if (var2) {
                     if (k == -1) {
                        k = l;
                     }
                  } else {
                     var1.consume(j, ix, l, j + 1, ix + 1, l + 1);
                  }
               } else if (k != -1) {
                  int i1 = j;
                  int j1 = ix;
                  class06890.y(k, l, j, ix);

                  while (class06890.N(k, l, i1 + 1, ix)) {
                     class06890.y(k, l, i1 + 1, ix);
                     i1++;
                  }

                  while (class06890.N(j, i1 + 1, k, l, j1 + 1)) {
                     for (int k1 = j; k1 <= i1; k1++) {
                        class06890.y(k, l, k1, j1 + 1);
                     }

                     j1++;
                  }

                  var1.consume(j, ix, k, i1 + 1, j1 + 1, l);
                  k = -1;
               }
            }
         }
      }
   }

   static class06890 N(class07739 var0, class07739 var1, class00630 var2, class00630 var3, class00630 var4, class07003 var5) {
      class06890 class06890 = new class06890(var2.size() - 1, var3.size() - 1, var4.size() - 1);
      int[] aint = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      var2.method_1065((var7x, var8, var9) -> {
         boolean[] aboolean = new boolean[]{false};
         var3.method_1065((var10x, var11, var12) -> {
            boolean[] abooleanx = new boolean[]{false};
            var4.method_1065((var12x, var13x, var14) -> {
               if (var5.apply(var0.method_1044(var7x, var10x, var12x), var1.method_1044(var8, var11, var13x))) {
                  class06890.N.set(class06890.N(var9, var12, var14));
                  aint[2] = Math.min(aint[2], var14);
                  aint[5] = Math.max(aint[5], var14);
                  abooleanx[0] = true;
               }

               return true;
            });
            if (abooleanx[0]) {
               aint[1] = Math.min(aint[1], var12);
               aint[4] = Math.max(aint[4], var12);
               aboolean[0] = true;
            }

            return true;
         });
         if (aboolean[0]) {
            aint[0] = Math.min(aint[0], var9);
            aint[3] = Math.max(aint[3], var9);
         }

         return true;
      });
      class06890.y = aint[0];
      class06890.L = aint[1];
      class06890.u = aint[2];
      class06890.i = aint[3] + 1;
      class06890.R = aint[4] + 1;
      class06890.M = aint[5] + 1;
      return class06890;
   }

   protected int N(int var1, int var2, int var3) {
      return (var1 * this.field_1373 + var2) * this.field_1372 + var3;
   }

   public static class06890 N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class06890 class06890 = new class06890(var0, var1, var2);
      class06890.y = var3;
      class06890.L = var4;
      class06890.u = var5;
      class06890.i = var6;
      class06890.R = var7;
      class06890.M = var8;

      for (int ix = var3; ix < var6; ix++) {
         for (int j = var4; j < var7; j++) {
            for (int k = var5; k < var8; k++) {
               class06890.N(ix, j, k, false);
            }
         }
      }

      return class06890;
   }

   private void N(int var1, int var2, int var3, boolean var4) {
      this.N.set(this.N(var1, var2, var3));
      if (var4) {
         this.y = Math.min(this.y, var1);
         this.L = Math.min(this.L, var2);
         this.u = Math.min(this.u, var3);
         this.i = Math.max(this.i, var1 + 1);
         this.R = Math.max(this.R, var2 + 1);
         this.M = Math.max(this.M, var3 + 1);
      }
   }

   @Override
   public int method_1045(class07185 var1) {
      return var1.N(this.i, this.R, this.M);
   }

   @Override
   public boolean method_1056() {
      return this.N.isEmpty();
   }

   @Override
   public int method_1055(class07185 var1) {
      return var1.N(this.y, this.L, this.u);
   }

   @Override
   public boolean method_1063(int var1, int var2, int var3) {
      return this.N.get(this.N(var1, var2, var3));
   }

   @Override
   public void method_1049(int var1, int var2, int var3) {
      this.N(var1, var2, var3, true);
   }
}
