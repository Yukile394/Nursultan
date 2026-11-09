package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;

public class class05065 extends class01209 {
   private static final float i = 0.3F;
   private static final float R = 0.07F;
   private static final float M = 0.2F;
   private final class05085 B;
   private final class05073 Z;

   private void L(class06069 var1, class07284 var2, class07209 var3) {
      class07218 class07218 = var3.method_25503();
      this.u(var1, var2, class07218);
      int ix = 8;

      while (ix > 0 && var1.z() < 0.5F) {
         class07218.N(class07211.field_11033);
         ix--;
         this.u(var1, var2, class07218);
      }
   }

   public class05065(
      class01224 var1, class07209 var2, class05085 var3, class05073 var4, class01894 var5, class01207 var6, class06993 var7, class07111 var8, class07209 var9
   ) {
      super(class04878.K, 0, var1, var5, var5.toString(), N(var8, var7, var3, var9, var4), var2);
      this.B = var3;
      this.Z = var4;
   }

   public class05065(class01224 var1, class07001 var2) {
      super(class04878.K, var2, var1, var2x -> N(var1, var2, var2x));
      this.B = var2.<class05085>N_15("VerticalPlacement", class05085.field_37811).orElseThrow();
      this.Z = var2.<class05073>N_15("Properties", class05073.N).orElseThrow();
   }

   private void u(class06069 var1, class07284 var2, class07209 var3) {
      if (!this.Z.y && var1.z() < 0.07F) {
         var2.method_8652(var3, class00869.EI.W(), 3);
      } else {
         var2.method_8652(var3, class00869.id.W(), 3);
      }
   }

   private void y(class06069 var1, class07284 var2, class07209 var3) {
      if (var1.z() < 0.5F && var2.method_8320(var3).N(class00869.id) && var2.method_8320(var3.method_10084()).P()) {
         var2.method_8652(var3.method_10084(), class00869.Nc.W().y(class07131.i, true), 3);
      }
   }

   private void y(class06069 var1, class07284 var2) {
      boolean flag = this.B == class05085.field_24029 || this.B == class05085.field_24031;
      class07209 class07209 = this.k.M();
      int ix = class07209.method_10263();
      int j = class07209.method_10260();
      float[] afloat = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int k = afloat.length;
      int l = (this.k.u() + this.k.R()) / 2;
      int i1 = var1.y(Math.max(1, 8 - l / 2));
      byte b0 = 3;
      class07218 class07218 = class07209.field_10980.method_25503();

      for (int j1 = ix - k; j1 <= ix + k; j1++) {
         for (int k1 = j - k; k1 <= j + k; k1++) {
            int l1 = Math.abs(j1 - ix) + Math.abs(k1 - j);
            int i2 = Math.max(0, l1 + i1);
            if (i2 < k) {
               float f = afloat[i2];
               if (var1.U() < f) {
                  int j2 = N(var2, j1, k1, this.B);
                  int k2 = flag ? j2 : Math.min(this.k.Z(), j2);
                  class07218.N(j1, k2, k1);
                  if (Math.abs(k2 - this.k.Z()) <= 3 && this.N(var2, class07218)) {
                     this.u(var1, var2, class07218);
                     if (this.Z.i) {
                        this.y(var1, var2, class07218);
                     }

                     this.L(var1, var2, class07218.method_10074());
                  }
               }
            }
         }
      }
   }

   private static class05265 N(class00891 var0, float var1, class00891 var2) {
      return new class05265(new class05258(var0, var1), class05243.y, var2.W());
   }

   public static class07830 N(class05085 var0) {
      return var0 == class05085.field_24031 ? class07830.field_13195 : class07830.field_13194;
   }

   private static int N(class07284 var0, int var1, int var2, class05085 var3) {
      return var0.method_8624(N(var3), var1, var2) - 1;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Rotation", class06993.field_56670, this.L.u());
      var2.N("Mirror", class07111.field_56669, this.L.L());
      var2.N("VerticalPlacement", class05085.field_37811, this.B);
      var2.N("Properties", class05073.N, this.Z);
   }

   private static class05265 N(class00891 var0, class00891 var1) {
      return new class05265(new class05244(var0), class05243.y, var1.W());
   }

   private void N(class06069 var1, class07284 var2) {
      for (int ix = this.k.B() + 1; ix < this.k.U(); ix++) {
         for (int j = this.k.z() + 1; j < this.k.W(); j++) {
            class07209 class07209 = new class07209(ix, this.k.Z(), j);
            if (var2.method_8320(class07209).N(class00869.id)) {
               this.L(var1, var2, class07209.method_10074());
            }
         }
      }
   }

   private static class05265 N(class05085 var0, class05073 var1) {
      if (var0 == class05085.field_24031) {
         return N(class00869.V, class00869.EI);
      } else {
         return var1.y ? N(class00869.V, class00869.id) : N(class00869.V, 0.2F, class00869.EI);
      }
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class05163 class05163 = this.y.y(this.L, this.u);
      if (var5.y(class05163.M())) {
         var5.y(class05163);
         super.N(var1, var2, var3, var4, var5, var6, var7);
         this.y(var4, var1);
         this.N(var4, var1);
         if (this.Z.R || this.Z.i) {
            class07209.method_23627(this.L()).forEach(var3x -> {
               if (this.Z.R) {
                  this.N(var4, (class07284)var1, var3x);
               }

               if (this.Z.i) {
                  this.y(var4, var1, var3x);
               }
            });
         }
      }
   }

   private void N(class06069 var1, class07284 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3);
      if (!class00500.P() && !class00500.N(class00869.Rc)) {
         class07211 class07211 = y(var1);
         class07209 class07209 = var3.method_10093(class07211);
         if (var2.method_8320(class07209).P()) {
            if (class00891.N(class00500.M(var2, var3), class07211)) {
               class06667 class06667 = class00659.N(class07211.b());
               var2.method_8652(class07209, class00869.Rc.W().y(class06667, true), 3);
            }
         }
      }
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
   }

   private static class01233 N(class07111 var0, class06993 var1, class05085 var2, class07209 var3, class05073 var4) {
      class05282 class05282 = var4.u ? class05282.y : class05282.u;
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(N(class00869.Lb, 0.3F, class00869.N));
      arraylist.add(N(var2, var4));
      if (!var4.y) {
         arraylist.add(N(class00869.id, 0.07F, class00869.EI));
      }

      class01233 class01233 = new class01233()
         .N(var1)
         .N(var0)
         .N(var3)
         .N(class05282)
         .N(new class05273(arraylist))
         .N(new class05083(var4.L))
         .N(new class03442(class01210.Lu))
         .N(new class01249());
      if (var4.M) {
         class01233.N(class05077.y);
      }

      return class01233;
   }

   private static class01233 N(class01224 var0, class07001 var1, class01894 var2) {
      class01207 class01207 = var0.N(var2);
      class07209 class07209 = new class07209(class01207.N().method_10263() / 2, 0, class01207.N().method_10260() / 2);
      return N(
         var1.<class07111>N_15("Mirror", class07111.field_56669).orElseThrow(),
         var1.<class06993>N_15("Rotation", class06993.field_56670).orElseThrow(),
         var1.<class05085>N_15("VerticalPlacement", class05085.field_37811).orElseThrow(),
         class07209,
         (class05073)class05073.N.parse(new Dynamic(class07713.N, var1.N("Properties"))).getPartialOrThrow()
      );
   }

   private boolean N(class07284 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      return !class00500.N(class00869.N)
         && !class00500.N(class00869.LV)
         && !class00500.N(class01210.Lu)
         && (this.B == class05085.field_24034 || !class00500.N(class00869.V));
   }
}
