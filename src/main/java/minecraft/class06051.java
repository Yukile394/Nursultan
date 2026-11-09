package minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06051 implements class03874 {
   public static final int N = 12;
   private static final int M = 24;
   private static final float[] B = class07536.N(new float[13824], var0 -> {
      for (int i = 0; i < 24; i++) {
         for (int j = 0; j < 24; j++) {
            for (int k = 0; k < 24; k++) {
               var0[i * 24 * 24 + j * 24 + k] = (float)N(j - 12, k - 12, i - 12);
            }
         }
      }
   });
   public static final class06051 y = new class06051(List.of(), List.of(), null);
   private final List<class06053> Z;
   private final List<class04844> z;
   @Nullable
   private final class05163 U;

   public class06051(List<class06053> var1, List<class04844> var2, @Nullable class05163 var3) {
      super();
      this.Z = var1;
      this.z = var2;
      this.U = var3;
   }

   @Override
   public double y() {
      return Double.POSITIVE_INFINITY;
   }

   private static double N(int var0, double var1, int var3) {
      double d0 = class04995.R((double)var0, var1, (double)var3);
      return Math.pow(Math.E, -d0 / 16.0);
   }

   private static double N(int var0, int var1, int var2) {
      return N(var0, var1 + 0.5, var2);
   }

   private static boolean N(int var0) {
      return var0 >= 0 && var0 < 24;
   }

   public static class06051 N(class05324 var0, class07321 var1) {
      List<class04932> list = var0.N(var1, var0x -> var0x.i() != class06040.field_28922);
      if (list.isEmpty()) {
         return y;
      } else {
         int i = var1.i();
         int j = var1.R();
         ArrayList arraylist = new ArrayList();
         ArrayList arraylist1 = new ArrayList();
         class05163 class05163xx = null;

         for (class04932 class04932 : list) {
            class06040 class06040 = class04932.B().i();

            for (class04890 class04890 : class04932.Z()) {
               if (class04890.N(var1, 12)) {
                  if (class04890 instanceof class05236 class05236) {
                     if (class05236.y().M() == class05246.field_16687) {
                        arraylist.add(new class06053(class05236.L(), class06040, class05236.z()));
                        class05163xx = N(class05163xx, class04890.L());
                     }

                     for (class04844 class04844 : class05236.U()) {
                        int k = class04844.N();
                        int l = class04844.L();
                        if (k > i - 12 && l > j - 12 && k < i + 15 + 12 && l < j + 15 + 12) {
                           arraylist1.add(class04844);
                           class05163 class05163x = new class05163(new class07209(k, class04844.y(), l));
                           class05163xx = N(class05163xx, class05163x);
                        }
                     }
                  } else {
                     arraylist.add(new class06053(class04890.L(), class06040, 0));
                     class05163xx = N(class05163xx, class04890.L());
                  }
               }
            }
         }

         if (class05163xx == null) {
            return y;
         } else {
            class05163 class05163x = class05163xx.N(24);
            return new class06051(List.copyOf(arraylist), List.copyOf(arraylist1), class05163x);
         }
      }
   }

   private static class05163 N(@Nullable class05163 var0, class05163 var1) {
      return var0 == null ? var1 : class05163.N(var0, var1);
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      if (this.U == null) {
         Arrays.fill(var1, 0.0);
      } else {
         class03874.super.N(var1, var2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public double N(class03875 var1) {
      if (this.U == null) {
         return 0.0;
      } else {
         int i = var1.y();
         int j = var1.L();
         int k = var1.u();
         if (!this.U.u(i, j, k)) {
            return 0.0;
         } else {
            double d0 = 0.0;

            for (class06053 class06053 : this.Z) {
               class05163 class05163 = class06053.N();
               int l = class06053.L();
               int i1 = Math.max(0, Math.max(class05163.B() - i, i - class05163.U()));
               int j1 = Math.max(0, Math.max(class05163.z() - k, k - class05163.W()));
               int k1 = class05163.Z() + l;
               int l1 = j - k1;

               int i2 = switch (class06053.y()) {
                  case field_28922 -> 0;
                  case field_28923, field_38431 -> l1;
                  case field_38432 -> Math.max(0, Math.max(k1 - j, j - class05163.E()));
                  case field_51413 -> Math.max(0, Math.max(class05163.Z() - j, j - class05163.E()));
               };

               d0 += switch (class06053.y()) {
                  case field_28922 -> 0.0;
                  case field_28923 -> N((double)i1, i2 / 2.0, (double)j1);
                  case field_38431, field_38432 -> N(i1, i2, j1, l1) * 0.8;
                  case field_51413 -> N(i1 / 2.0, i2 / 2.0, j1 / 2.0) * 0.8;
               };
            }

            for (class04844 class04844 : this.z) {
               int j2 = i - class04844.N();
               int k2 = j - class04844.y();
               int l2 = k - class04844.L();
               d0 += N(j2, k2, l2, k2) * 0.4;
            }

            return d0;
         }
      }
   }

   @Override
   public double N() {
      return Double.NEGATIVE_INFINITY;
   }

   private static double N(double var0, double var2, double var4) {
      return class04995.N(class04995.M(var0, var2, var4), 0.0, 6.0, 1.0, 0.0);
   }

   private static double N(int var0, int var1, int var2, int var3) {
      int i = var0 + 12;
      int j = var1 + 12;
      int k = var2 + 12;
      if (N(i) && N(j) && N(k)) {
         double d0 = var3 + 0.5;
         double d1 = class04995.R((double)var0, d0, (double)var2);
         return -d0 * class04995.B(d1 / 2.0) / 2.0 * B[k * 24 * 24 + i * 24 + j];
      } else {
         return 0.0;
      }
   }
}
