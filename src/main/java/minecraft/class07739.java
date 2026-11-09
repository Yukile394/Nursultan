package minecraft;

import org.joml.Vector3i;

public abstract class class07739 {
   private static final class07185[] field_1375 = class07185.values();
   public final int field_1374;
   public final int field_1373;
   public final int field_1372;

   public class07739(int var1, int var2, int var3) {
      super();
      if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
         this.field_1374 = var1;
         this.field_1373 = var2;
         this.field_1372 = var3;
      } else {
         throw new IllegalArgumentException("Need all positive sizes: x: " + var1 + ", y: " + var2 + ", z: " + var3);
      }
   }

   public void method_1053(class07716 var1, boolean var2) {
      class06890.N(this, var1, var2);
   }

   public abstract int method_1045(class07185 var1);

   public int method_1058(class07185 var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         class07185 class07185x = class07214.field_10963.N(var1);
         class07185 class07185x = class07214.field_10965.N(var1);
         if (var2 < this.method_1051(class07185x) && var3 < this.method_1051(class07185x)) {
            int i = this.method_1051(var1);
            class07214 class07214 = class07214.N(class07185.field_11048, var1);

            for (int j = i - 1; j >= 0; j--) {
               if (this.method_1057(class07214, j, var2, var3)) {
                  return j + 1;
               }
            }

            return 0;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public void method_1064(class07716 var1, boolean var2) {
      this.method_1052(var1, class07214.field_10962, var2);
      this.method_1052(var1, class07214.field_10963, var2);
      this.method_1052(var1, class07214.field_10965, var2);
   }

   public boolean method_1056() {
      int i = field_1375.length;

      for (int j = 0; j < i; j++) {
         class07185 class07185 = field_1375[j];
         if (this.method_1055(class07185) >= this.method_1045(class07185)) {
            return true;
         }
      }

      return false;
   }

   public int method_1051(class07185 var1) {
      return var1.N(this.field_1374, this.field_1373, this.field_1372);
   }

   public abstract int method_1055(class07185 var1);

   public boolean method_1044(int var1, int var2, int var3) {
      if (var1 < 0 || var2 < 0 || var3 < 0) {
         return false;
      } else {
         return var1 < this.field_1374 && var2 < this.field_1373 && var3 < this.field_1372 ? this.method_1063(var1, var2, var3) : false;
      }
   }

   public int method_35592(class07185 var1, int var2, int var3) {
      int i = this.method_1051(var1);
      if (var2 >= 0 && var3 >= 0) {
         class07185 class07185x = class07214.field_10963.N(var1);
         class07185 class07185x = class07214.field_10965.N(var1);
         if (var2 < this.method_1051(class07185x) && var3 < this.method_1051(class07185x)) {
            class07214 class07214 = class07214.N(class07185.field_11048, var1);

            for (int j = 0; j < i; j++) {
               if (this.method_1057(class07214, j, var2, var3)) {
                  return j;
               }
            }

            return i;
         } else {
            return i;
         }
      } else {
         return i;
      }
   }

   public boolean method_1062(class07214 var1, int var2, int var3, int var4) {
      return this.method_1044(
         var1.N(var2, var3, var4, class07185.field_11048), var1.N(var2, var3, var4, class07185.field_11052), var1.N(var2, var3, var4, class07185.field_11051)
      );
   }

   public int method_1050() {
      return this.method_1051(class07185.field_11048);
   }

   public boolean method_1057(class07214 var1, int var2, int var3, int var4) {
      return this.method_1063(
         var1.N(var2, var3, var4, class07185.field_11048), var1.N(var2, var3, var4, class07185.field_11052), var1.N(var2, var3, var4, class07185.field_11051)
      );
   }

   private void method_1061(class07715 var1, class07214 var2) {
      class07214 class07214 = var2.N();
      class07185 class07185 = class07214.N(class07185.field_11051);
      int i = this.method_1051(class07214.N(class07185.field_11048));
      int j = this.method_1051(class07214.N(class07185.field_11052));
      int k = this.method_1051(class07185);
      class07211 class07211x = class07211.N(class07185, class07212.field_11060);
      class07211 class07211x = class07211.N(class07185, class07212.field_11056);

      for (int l = 0; l < i; l++) {
         for (int i1 = 0; i1 < j; i1++) {
            boolean flag = false;

            for (int j1 = 0; j1 <= k; j1++) {
               boolean flag1 = j1 != k && this.method_1057(class07214, l, i1, j1);
               if (!flag && flag1) {
                  var1.consume(
                     class07211x,
                     class07214.N(l, i1, j1, class07185.field_11048),
                     class07214.N(l, i1, j1, class07185.field_11052),
                     class07214.N(l, i1, j1, class07185.field_11051)
                  );
               }

               if (flag && !flag1) {
                  var1.consume(
                     class07211x,
                     class07214.N(l, i1, j1 - 1, class07185.field_11048),
                     class07214.N(l, i1, j1 - 1, class07185.field_11052),
                     class07214.N(l, i1, j1 - 1, class07185.field_11051)
                  );
               }

               flag = flag1;
            }
         }
      }
   }

   public class07739 method_66493(class01372 var1) {
      if (var1 == class01372.field_23292) {
         return this;
      } else {
         Vector3i vector3i = var1.N(new Vector3i(this.field_1374, this.field_1373, this.field_1372));
         int i = method_75279(vector3i, 0);
         int j = method_75279(vector3i, 1);
         int k = method_75279(vector3i, 2);
         class06890 class06890 = new class06890(vector3i.x, vector3i.y, vector3i.z);

         for (int l = 0; l < this.field_1374; l++) {
            for (int i1 = 0; i1 < this.field_1373; i1++) {
               for (int j1 = 0; j1 < this.field_1372; j1++) {
                  if (this.method_1063(l, i1, j1)) {
                     Vector3i vector3i1 = var1.N(vector3i.set(l, i1, j1));
                     int k1 = i + vector3i1.x;
                     int l1 = j + vector3i1.y;
                     int i2 = k + vector3i1.z;
                     class06890.method_1049(k1, l1, i2);
                  }
               }
            }
         }

         return class06890;
      }
   }

   public int method_1047() {
      return this.method_1051(class07185.field_11052);
   }

   public abstract boolean method_1063(int var1, int var2, int var3);

   private static int method_75279(Vector3i var0, int var1) {
      int i = var0.get(var1);
      if (i < 0) {
         var0.setComponent(var1, -i);
         return -i - 1;
      } else {
         return 0;
      }
   }

   public void method_1046(class07715 var1) {
      this.method_1061(var1, class07214.field_10962);
      this.method_1061(var1, class07214.field_10963);
      this.method_1061(var1, class07214.field_10965);
   }

   private void method_1052(class07716 var1, class07214 var2, boolean var3) {
      class07214 class07214 = var2.N();
      int j = this.method_1051(class07214.N(class07185.field_11048));
      int k = this.method_1051(class07214.N(class07185.field_11052));
      int l = this.method_1051(class07214.N(class07185.field_11051));

      for (int i1 = 0; i1 <= j; i1++) {
         for (int j1 = 0; j1 <= k; j1++) {
            int i = -1;

            for (int k1 = 0; k1 <= l; k1++) {
               int l1 = 0;
               int i2 = 0;

               for (int j2 = 0; j2 <= 1; j2++) {
                  for (int k2 = 0; k2 <= 1; k2++) {
                     if (this.method_1062(class07214, i1 + j2 - 1, j1 + k2 - 1, k1)) {
                        l1++;
                        i2 ^= j2 ^ k2;
                     }
                  }
               }

               if (l1 == 1 || l1 == 3 || l1 == 2 && (i2 & 1) == 0) {
                  if (var3) {
                     if (i == -1) {
                        i = k1;
                     }
                  } else {
                     var1.consume(
                        class07214.N(i1, j1, k1, class07185.field_11048),
                        class07214.N(i1, j1, k1, class07185.field_11052),
                        class07214.N(i1, j1, k1, class07185.field_11051),
                        class07214.N(i1, j1, k1 + 1, class07185.field_11048),
                        class07214.N(i1, j1, k1 + 1, class07185.field_11052),
                        class07214.N(i1, j1, k1 + 1, class07185.field_11051)
                     );
                  }
               } else if (i != -1) {
                  var1.consume(
                     class07214.N(i1, j1, i, class07185.field_11048),
                     class07214.N(i1, j1, i, class07185.field_11052),
                     class07214.N(i1, j1, i, class07185.field_11051),
                     class07214.N(i1, j1, k1, class07185.field_11048),
                     class07214.N(i1, j1, k1, class07185.field_11052),
                     class07214.N(i1, j1, k1, class07185.field_11051)
                  );
                  i = -1;
               }
            }
         }
      }
   }

   public abstract void method_1049(int var1, int var2, int var3);

   public int method_1048() {
      return this.method_1051(class07185.field_11051);
   }
}
