package minecraft;

import Nursultan.class10487;
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

public class class05079 extends class05291 {
   public static final MapCodec<class05079> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05079::new));
   private static final double M = 0.618;
   private static final double B = 1.382;
   private static final double Z = 0.381;
   private static final double z = 0.328;

   public class05079(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   private static float y(int var0, int var1) {
      if (var1 < var0 * 0.3F) {
         return -1.0F;
      } else {
         float f = var0 / 2.0F;
         float f1 = f - var1;
         float f2 = class04995.N(f * f - f1 * f1);
         if (f1 == 0.0F) {
            f2 = f;
         } else if (Math.abs(f1) >= f) {
            return 0.0F;
         }

         return f2 * 0.5F;
      }
   }

   private void N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, List<class10487> var6, class01476 var7) {
      for (class10487 class10487 : var6) {
         int i = class10487.N();
         class07209 class07209 = new class07209(var5.method_10263(), i, var5.method_10260());
         if (!class07209.equals(class10487.N.N()) && this.N(var4, i - var5.method_10264())) {
            this.N(var1, var2, var3, class07209, class10487.N.N(), true, var7);
         }
      }
   }

   private boolean N(int var1, int var2) {
      return var2 >= var1 * 0.2;
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      byte b0 = 5;
      int i = var4 + 2;
      int j = class04995.N(i * 0.618);
      N(var1, var2, var3, var5.method_10074(), var6);
      double d0 = 1.0;
      int k = Math.min(1, class04995.N(1.382 + Math.pow(1.0 * i / 13.0, 2.0)));
      int l = var5.method_10264() + j;
      int i1 = i - 5;
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(new class10487(var5.method_10086(i1), l));

      for (; i1 >= 0; i1--) {
         float f = y(i, i1);
         if (!(f < 0.0F)) {
            for (int j1 = 0; j1 < k; j1++) {
               double d1 = 1.0;
               double d2 = 1.0 * f * (var3.z() + 0.328);
               double d3 = var3.z() * 2.0F * Math.PI;
               double d4 = d2 * Math.sin(d3) + 0.5;
               double d5 = d2 * Math.cos(d3) + 0.5;
               class07209 class07209x = var5.method_10069(class04995.N(d4), i1 - 1, class04995.N(d5));
               class07209 class07209x = class07209x.method_10086(5);
               if (this.N(var1, var2, var3, class07209x, class07209x, false, var6)) {
                  int k1 = var5.method_10263() - class07209x.method_10263();
                  int l1 = var5.method_10260() - class07209x.method_10260();
                  double d6 = class07209x.method_10264() - Math.sqrt(k1 * k1 + l1 * l1) * 0.381;
                  int i2 = d6 > l ? l : (int)d6;
                  class07209 class07209xx = new class07209(var5.method_10263(), i2, var5.method_10260());
                  if (this.N(var1, var2, var3, class07209xx, class07209x, false, var6)) {
                     arraylist.add(new class10487(class07209x, class07209xx.method_10264()));
                  }
               }
            }
         }
      }

      this.N(var1, var2, var3, var5, var5.method_10086(j), true, var6);
      this.N(var1, var2, var3, i, var5, arraylist, var6);
      ArrayList arraylist1 = Lists.newArrayList();

      for (class10487 class10487 : arraylist) {
         if (this.N(i, class10487.N() - var5.method_10264())) {
            arraylist1.add(class10487.N);
         }
      }

      return arraylist1;
   }

   private boolean N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class07209 var5, boolean var6, class01476 var7) {
      if (!var6 && Objects.equals(var4, var5)) {
         return true;
      } else {
         class07209 class07209x = var5.method_10069(-var4.method_10263(), -var4.method_10264(), -var4.method_10260());
         int i = this.N(class07209x);
         float f = (float)class07209x.method_10263() / i;
         float f1 = (float)class07209x.method_10264() / i;
         float f2 = (float)class07209x.method_10260() / i;

         for (int j = 0; j <= i; j++) {
            class07209 class07209x = var4.method_10069(class04995.y(0.5F + j * f), class04995.y(0.5F + j * f1), class04995.y(0.5F + j * f2));
            if (var6) {
               this.N(var1, var2, var3, class07209x, var7, var3x -> var3x.L(class07004.L, this.N(var4, class07209)));
            } else if (!this.y(var1, class07209x)) {
               return false;
            }
         }

         return true;
      }
   }

   private int N(class07209 var1) {
      int i = class04995.N(var1.method_10263());
      int j = class04995.N(var1.method_10264());
      int k = class04995.N(var1.method_10260());
      return Math.max(i, Math.max(j, k));
   }

   private class07185 N(class07209 var1, class07209 var2) {
      class07185 class07185 = class07185.field_11052;
      int i = Math.abs(var2.method_10263() - var1.method_10263());
      int j = Math.abs(var2.method_10260() - var1.method_10260());
      int k = Math.max(i, j);
      if (k > 0) {
         if (i == k) {
            class07185 = class07185.field_11048;
         } else {
            class07185 = class07185.field_11051;
         }
      }

      return class07185;
   }

   @Override
   protected class05312<?> N() {
      return class05312.R;
   }
}
