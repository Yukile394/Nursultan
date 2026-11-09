package minecraft;

import org.jspecify.annotations.Nullable;

public class class05162 extends class05154 {
   private final boolean y;
   private final boolean L;
   private boolean u;
   private final int i;

   public class05162(int var1, class06069 var2, class05163 var3, class07211 var4, class06187 var5) {
      super(class04878.N, var1, var5, var3);
      this.N(var4);
      this.y = var2.y(3) == 0;
      this.L = !this.y && var2.y(23) == 0;
      if (this.i().z() == class07185.field_11051) {
         this.i = var3.R() / 5;
      } else {
         this.i = var3.u() / 5;
      }
   }

   public class05162(class07001 var1) {
      super(class04878.N, var1);
      this.y = var1.y("hr", false);
      this.L = var1.y("sc", false);
      this.u = var1.y("hps", false);
      this.i = var1.y("Num", 0);
   }

   private boolean y(class05487 var1, class07209 var2, class00500 var3) {
      return class00891.N_6(var1, var2, class07211.field_11033) && !(var3.i() instanceof class07204);
   }

   protected void y(class05974 var1, class00500 var2, int var3, int var4, int var5, class05163 var6) {
      class07218 class07218 = this.L(var3, var4, var5);
      if (var6.y(class07218)) {
         int ix = class07218.method_10264();
         int j = 1;
         boolean flag = true;

         for (boolean flag1 = true; flag || flag1; j++) {
            if (flag) {
               class07218.method_10099(ix - j);
               class00500 class00500x = var1.method_8320(class07218);
               boolean flag2 = this.N(class00500x) && !class00500x.N(class00869.V);
               if (!flag2 && this.N(var1, class07218, class00500x)) {
                  N(var1, var2, class07218, ix - j + 1, ix);
                  return;
               }

               flag = j <= 20 && flag2 && class07218.method_10264() > var1.method_31607() + 1;
            }

            if (flag1) {
               class07218.method_10099(ix + j);
               class00500 class00500 = var1.method_8320(class07218);
               boolean flag3 = this.N(class00500);
               if (!flag3 && this.y(var1, class07218, class00500)) {
                  var1.method_8652(class07218.method_10099(ix + 1), this.N.u(), 2);
                  N(var1, class00869.Rg.W(), class07218, ix + 2, ix + j);
                  return;
               }

               flag1 = j <= 50 && flag3 && class07218.method_10264() < var1.method_31600();
            }
         }
      }
   }

   private void N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, class06069 var8) {
      if (this.N(var1, var2, var3, var7, var6, var5)) {
         class00500 class00500x = this.N.L();
         class00500 class00500x = this.N.u();
         this.N(var1, var2, var3, var4, var5, var3, var6 - 1, var5, class00500x.y(class00730.i, true), w, false);
         this.N(var1, var2, var7, var4, var5, var7, var6 - 1, var5, class00500x.y(class00730.L, true), w, false);
         if (var8.y(4) == 0) {
            this.N(var1, var2, var3, var6, var5, var3, var6, var5, class00500x, w, false);
            this.N(var1, var2, var7, var6, var5, var7, var6, var5, class00500x, w, false);
         } else {
            this.N(var1, var2, var3, var6, var5, var7, var6, var5, class00500x, w, false);
            this.N(var1, var2, var8, 0.05F, var3 + 1, var6, var5 - 1, class00869.LH.W().y(class00651.i, class07211.field_11035));
            this.N(var1, var2, var8, 0.05F, var3 + 1, var6, var5 + 1, class00869.LH.W().y(class00651.i, class07211.field_11043));
         }
      }
   }

   private static void N(class05974 var0, class00500 var1, class07218 var2, int var3, int var4) {
      for (int ix = var3; ix < var4; ix++) {
         var0.method_8652(var2.method_10099(ix), var1, 2);
      }
   }

   private boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var3.L(var1, var2, class07211.field_11036);
   }

   private boolean N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6) {
      class07218 class07218 = this.L(var3, var4, var5);
      int ix = 0;

      for (class07211 class07211 : class07211.values()) {
         class07218.N(class07211);
         if (var2.y(class07218) && var1.method_8320(class07218).L(var1, class07218, class07211.b())) {
            if (++ix >= var6) {
               return true;
            }
         }

         class07218.N(class07211.b());
      }

      return false;
   }

   private void N(class05974 var1, class05163 var2, class06069 var3, float var4, int var5, int var6, int var7) {
      if (this.y(var1, var5, var6, var7, var2) && var3.z() < var4 && this.N(var1, var2, var5, var6, var7, 2)) {
         this.L(var1, class00869.yw.W(), var5, var6, var7, var2);
      }
   }

   @Override
   protected boolean N(class05974 var1, class05163 var2, class06069 var3, int var4, int var5, int var6, class05946<class05074> var7) {
      class07218 class07218 = this.L(var4, var5, var6);
      if (var2.y(class07218) && var1.method_8320(class07218).P() && !var1.method_8320(class07218.method_10074()).P()) {
         class00500 class00500 = class00869.um.W().y(class06892.L, var3.Z() ? class08080.field_12665 : class08080.field_12674);
         this.L(var1, class00500, var4, var5, var6, var2);
         class07498 class07498 = class07078.Y.N(var1.method_8410(), class06113.field_16472);
         if (class07498 != null) {
            class07498.N(class07218.method_10263() + 0.5, class07218.method_10264() + 0.5, class07218.method_10260() + 0.5);
            class07498.N(var7, var3.B());
            var1.method_8649(class07498);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      int ix = this.u();
      int j = var3.y(4);
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
            default:
               if (j <= 1) {
                  class05184.N(var1, var2, var3, this.k.B(), this.k.Z() - 1 + var3.y(3), this.k.z() - 1, class07211, ix);
               } else if (j == 2) {
                  class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z() - 1 + var3.y(3), this.k.z(), class07211.field_11039, ix);
               } else {
                  class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z() - 1 + var3.y(3), this.k.z(), class07211.field_11034, ix);
               }
               break;
            case field_11035:
               if (j <= 1) {
                  class05184.N(var1, var2, var3, this.k.B(), this.k.Z() - 1 + var3.y(3), this.k.W() + 1, class07211, ix);
               } else if (j == 2) {
                  class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z() - 1 + var3.y(3), this.k.W() - 3, class07211.field_11039, ix);
               } else {
                  class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z() - 1 + var3.y(3), this.k.W() - 3, class07211.field_11034, ix);
               }
               break;
            case field_11039:
               if (j <= 1) {
                  class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z() - 1 + var3.y(3), this.k.z(), class07211, ix);
               } else if (j == 2) {
                  class05184.N(var1, var2, var3, this.k.B(), this.k.Z() - 1 + var3.y(3), this.k.z() - 1, class07211.field_11043, ix);
               } else {
                  class05184.N(var1, var2, var3, this.k.B(), this.k.Z() - 1 + var3.y(3), this.k.W() + 1, class07211.field_11035, ix);
               }
               break;
            case field_11034:
               if (j <= 1) {
                  class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z() - 1 + var3.y(3), this.k.z(), class07211, ix);
               } else if (j == 2) {
                  class05184.N(var1, var2, var3, this.k.U() - 3, this.k.Z() - 1 + var3.y(3), this.k.z() - 1, class07211.field_11043, ix);
               } else {
                  class05184.N(var1, var2, var3, this.k.U() - 3, this.k.Z() - 1 + var3.y(3), this.k.W() + 1, class07211.field_11035, ix);
               }
         }
      }

      if (ix < 8) {
         if (class07211 != class07211.field_11043 && class07211 != class07211.field_11035) {
            for (int i1 = this.k.B() + 3; i1 + 3 <= this.k.U(); i1 += 5) {
               int j1 = var3.y(5);
               if (j1 == 0) {
                  class05184.N(var1, var2, var3, i1, this.k.Z(), this.k.z() - 1, class07211.field_11043, ix + 1);
               } else if (j1 == 1) {
                  class05184.N(var1, var2, var3, i1, this.k.Z(), this.k.W() + 1, class07211.field_11035, ix + 1);
               }
            }
         } else {
            for (int k = this.k.z() + 3; k + 3 <= this.k.W(); k += 5) {
               int l = var3.y(5);
               if (l == 0) {
                  class05184.N(var1, var2, var3, this.k.B() - 1, this.k.Z(), k, class07211.field_11039, ix + 1);
               } else if (l == 1) {
                  class05184.N(var1, var2, var3, this.k.U() + 1, this.k.Z(), k, class07211.field_11034, ix + 1);
               }
            }
         }
      }
   }

   @Nullable
   public static class05163 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5) {
      for (int ix = var1.y(3) + 2; ix > 0; ix--) {
         int j = ix * 5;

         class05163 class05163 = switch (var5) {
            default -> new class05163(0, 0, -(j - 1), 2, 2, 0);
            case field_11035 -> new class05163(0, 0, 0, 2, 2, j - 1);
            case field_11039 -> new class05163(-(j - 1), 0, 0, 0, 2, 2);
            case field_11034 -> new class05163(0, 0, 0, j - 1, 2, 2);
         };
         class05163.N(var2, var3, var4);
         if (var0.N(class05163) == null) {
            return class05163;
         }
      }

      return null;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("hr", this.y);
      var2.N("sc", this.L);
      var2.N("hps", this.u);
      var2.N("Num", this.i);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (!this.N(var1, var5)) {
         boolean flag = false;
         byte b0 = 2;
         boolean flag1 = false;
         byte b1 = 2;
         int ix = this.i * 5 - 1;
         class00500 class00500 = this.N.L();
         this.N(var1, var5, 0, 0, 0, 2, 1, ix, w, w, false);
         this.N(var1, var5, var4, 0.8F, 0, 2, 0, 2, 2, ix, w, w, false, false);
         if (this.L) {
            this.N(var1, var5, var4, 0.6F, 0, 0, 0, 2, 1, ix, class00869.yw.W(), w, false, true);
         }

         for (int j = 0; j < this.i; j++) {
            int k = 2 + j * 5;
            this.N(var1, var5, 0, 0, k, 2, 2, var4);
            this.N(var1, var5, var4, 0.1F, 0, 2, k - 1);
            this.N(var1, var5, var4, 0.1F, 2, 2, k - 1);
            this.N(var1, var5, var4, 0.1F, 0, 2, k + 1);
            this.N(var1, var5, var4, 0.1F, 2, 2, k + 1);
            this.N(var1, var5, var4, 0.05F, 0, 2, k - 2);
            this.N(var1, var5, var4, 0.05F, 2, 2, k - 2);
            this.N(var1, var5, var4, 0.05F, 0, 2, k + 2);
            this.N(var1, var5, var4, 0.05F, 2, 2, k + 2);
            if (var4.y(100) == 0) {
               this.N(var1, var5, var4, 2, 0, k - 1, class06273.v);
            }

            if (var4.y(100) == 0) {
               this.N(var1, var5, var4, 0, 0, k + 1, class06273.v);
            }

            if (this.L && !this.u) {
               boolean flag2 = true;
               int l = k - 1 + var4.y(3);
               class07218 class07218 = this.L(1, 0, l);
               if (var5.y(class07218) && this.y(var1, 1, 0, l, var5)) {
                  this.u = true;
                  var1.method_8652(class07218, class00869.La.W(), 2);
                  class00394 class00394 = var1.method_8321(class07218);
                  if (class00394 instanceof class07235) {
                     ((class07235)class00394).N(class07078.d, var4);
                  }
               }
            }
         }

         for (int i1 = 0; i1 <= 2; i1++) {
            for (int j1 = 0; j1 <= ix; j1++) {
               this.N(var1, var5, class00500, i1, -1, j1);
            }
         }

         byte b2 = 2;
         this.N(var1, var5, 0, -1, 2);
         if (this.i > 1) {
            int k1 = ix - 2;
            this.N(var1, var5, 0, -1, k1);
         }

         if (this.y) {
            class00500 class00500x = class00869.um.W().y(class06892.L, class08080.field_12665);

            for (int l1 = 0; l1 <= ix; l1++) {
               class00500 class00500xx = this.N(var1, 1, -1, l1, var5);
               if (!class00500xx.P() && class00500xx.t()) {
                  float f = this.y(var1, 1, 0, l1, var5) ? 0.7F : 0.9F;
                  this.N(var1, var5, var4, f, 1, 0, l1, class00500x);
               }
            }
         }
      }
   }

   private void N(class05974 var1, class05163 var2, int var3, int var4, int var5) {
      class00500 class00500x = this.N.y();
      class00500 class00500x = this.N.L();
      if (this.N(var1, var3, var4, var5, var2).N(class00500x.i())) {
         this.y(var1, class00500x, var3, var4, var5, var2);
      }

      if (this.N(var1, var3 + 2, var4, var5, var2).N(class00500x.i())) {
         this.y(var1, class00500x, var3 + 2, var4, var5, var2);
      }
   }

   @Override
   protected void N(class05974 var1, class00500 var2, int var3, int var4, int var5, class05163 var6) {
      class07218 class07218 = this.L(var3, var4, var5);
      if (var6.y(class07218)) {
         int ix = class07218.method_10264();

         while (this.N(var1.method_8320(class07218)) && class07218.method_10264() > var1.method_31607() + 1) {
            class07218.N(class07211.field_11033);
         }

         if (this.N(var1, class07218, var1.method_8320(class07218))) {
            while (class07218.method_10264() < ix) {
               class07218.N(class07211.field_11036);
               var1.method_8652(class07218, var2, 2);
            }
         }
      }
   }
}
