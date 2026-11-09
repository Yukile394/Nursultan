package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;

public class class01158 extends class06391<class01154> {
   public class01158(Codec<class01154> var1) {
      super(var1);
   }

   private boolean y(class05974 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      if (!class00500.N(class00869.K) && !class00500.N(class00869.vF) && !class00500.N(class00869.vp)) {
         if (var1.method_8320(var2.method_10084()).Y().N(class01231.N)) {
            return false;
         } else {
            for (class07211 class07211 : class07221.field_11062) {
               if (!this.N((class07284)var1, var2.method_10093(class07211))) {
                  return false;
               }
            }

            return this.N((class07284)var1, var2.method_10074());
         }
      } else {
         return false;
      }
   }

   private boolean N(class07284 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      return class00500.N(class01210.yb) || class00500.Y().N(class01231.N);
   }

   private void N(class05974 var1, class07209 var2, int var3, class07211 var4) {
      class07218 class07218 = var2.method_25503();

      for (int i = 0; i < var3; i++) {
         if (!class01175.L(var1, class07218)) {
            return;
         }

         class07218.N(var4);
      }
   }

   private double N(int var1, int var2, int var3, int var4, class01154 var5) {
      int i = var1 - Math.abs(var3);
      int j = var2 - Math.abs(var4);
      return class04995.y((float)Math.min(i, j), 0.0F, (float)var5.E, var5.U, 1.0F);
   }

   private static float N(class06069 var0, float var1, float var2, float var3, float var4) {
      return class06073.N(var0, var3, var4, var1, var2);
   }

   private void N(class05974 var1, class06069 var2, class07209 var3, int var4, int var5, float var6, double var7, int var9, float var10, class01154 var11) {
      Optional<class01191> optional = class01191.N(var1, var3, var11.y, class01175::L, class01175::u);
      if (!optional.isEmpty()) {
         OptionalInt optionalint = optional.get().y();
         OptionalInt optionalint1 = optional.get().L();
         if (!optionalint.isEmpty() || !optionalint1.isEmpty()) {
            class01191 class01191;
            if (var2.z() < var6 && optionalint1.isPresent() && this.y(var1, var3.method_33096(optionalint1.getAsInt()))) {
               int i = optionalint1.getAsInt();
               class01191 = optional.get().N(OptionalInt.of(i - 1));
               var1.method_8652(var3.method_33096(i), class00869.K.W(), 2);
            } else {
               class01191 = optional.get();
            }

            OptionalInt optionalint2 = class01191.L();
            boolean flag = var2.U() < var7;
            int j;
            if (optionalint.isPresent() && flag && !this.N((class05487)var1, var3.method_33096(optionalint.getAsInt()))) {
               int k = var11.B.N(var2);
               this.N(var1, var3.method_33096(optionalint.getAsInt()), k, class07211.field_11036);
               int l;
               if (optionalint2.isPresent()) {
                  l = Math.min(var9, optionalint.getAsInt() - optionalint2.getAsInt());
               } else {
                  l = var9;
               }

               j = this.N(var2, var4, var5, var10, l, var11);
            } else {
               j = 0;
            }

            boolean flag1 = var2.U() < var7;
            int i3;
            if (optionalint2.isPresent() && flag1 && !this.N((class05487)var1, var3.method_33096(optionalint2.getAsInt()))) {
               int i1 = var11.B.N(var2);
               this.N(var1, var3.method_33096(optionalint2.getAsInt()), i1, class07211.field_11033);
               if (optionalint.isPresent()) {
                  i3 = Math.max(0, j + class04995.y(var2, -var11.i, var11.i));
               } else {
                  i3 = this.N(var2, var4, var5, var10, var9, var11);
               }
            } else {
               i3 = 0;
            }

            int j1;
            int j3;
            if (optionalint.isPresent() && optionalint2.isPresent() && optionalint.getAsInt() - j <= optionalint2.getAsInt() + i3) {
               int k1 = optionalint2.getAsInt();
               int l1 = optionalint.getAsInt();
               int i2 = Math.max(l1 - j, k1 + 1);
               int j2 = Math.min(k1 + i3, l1 - 1);
               int k2 = class04995.y(var2, i2, j2 + 1);
               int l2 = k2 - 1;
               j3 = l1 - k2;
               j1 = l2 - k1;
            } else {
               j3 = j;
               j1 = i3;
            }

            boolean flag2 = var2.Z() && j3 > 0 && j1 > 0 && class01191.u().isPresent() && j3 + j1 == class01191.u().getAsInt();
            if (optionalint.isPresent()) {
               class01175.N(var1, var3.method_33096(optionalint.getAsInt() - 1), class07211.field_11033, j3, flag2);
            }

            if (optionalint2.isPresent()) {
               class01175.N(var1, var3.method_33096(optionalint2.getAsInt() + 1), class07211.field_11036, j1, flag2);
            }
         }
      }
   }

   private boolean N(class05487 var1, class07209 var2) {
      return var1.method_8320(var2).N(class00869.V);
   }

   private int N(class06069 var1, int var2, int var3, float var4, int var5, class01154 var6) {
      if (var1.z() > var4) {
         return 0;
      } else {
         float f = (float)class04995.N((double)(Math.abs(var2) + Math.abs(var3)), 0.0, (double)var6.W, var5 / 2.0, 0.0);
         return (int)N(var1, 0.0F, var5, f, var6.M);
      }
   }

   @Override
   public boolean N(class06058<class01154> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class01154 class01154 = (class01154)var1.R();
      class06069 class06069 = var1.u();
      if (!class01175.N(class05974, class07209x)) {
         return false;
      } else {
         int i = class01154.L.N(class06069);
         float f = class01154.z.N(class06069);
         float f1 = class01154.Z.N(class06069);
         int j = class01154.u.N(class06069);
         int k = class01154.u.N(class06069);

         for (int l = -j; l <= j; l++) {
            for (int i1 = -k; i1 <= k; i1++) {
               double d0 = this.N(j, k, l, i1, class01154);
               class07209 class07209x = class07209x.method_10069(l, 0, i1);
               this.N(class05974, class06069, class07209x, l, i1, f, d0, i, f1, class01154);
            }
         }

         return true;
      }
   }
}
