package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;

public class class00484 {
   public static final int N = 12;
   private final class07299 y;
   private final class07209 L;
   private final boolean u;
   private final class07209 i;
   private final class07211 R;
   private final List<class07209> M = Lists.newArrayList();
   private final List<class07209> B = Lists.newArrayList();
   private final class07211 Z;

   public List<class07209> L() {
      return this.M;
   }

   public class00484(class07299 var1, class07209 var2, class07211 var3, boolean var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.Z = var3;
      this.u = var4;
      if (var4) {
         this.R = var3;
         this.i = var2.method_10093(var3);
      } else {
         this.R = var3.b();
         this.i = var2.method_10079(var3, 2);
      }
   }

   private class07211[] i() {
      return DirectionConstants.ALL;
   }

   public List<class07209> u() {
      return this.B;
   }

   public class07211 y() {
      return this.R;
   }

   private void N(int var1, int var2) {
      ArrayList arraylist = Lists.newArrayList();
      ArrayList arraylist1 = Lists.newArrayList();
      ArrayList arraylist2 = Lists.newArrayList();
      arraylist.addAll(this.M.subList(0, var2));
      arraylist1.addAll(this.M.subList(this.M.size() - var1, this.M.size()));
      arraylist2.addAll(this.M.subList(var2, this.M.size() - var1));
      this.M.clear();
      this.M.addAll(arraylist);
      this.M.addAll(arraylist1);
      this.M.addAll(arraylist2);
   }

   public boolean N() {
      this.M.clear();
      this.B.clear();
      class00500 class00500 = this.y.method_8320(this.i);
      if (!class00513.N(class00500, this.y, this.i, this.R, false, this.Z)) {
         if (this.u && class00500.n() == class04641.field_15971) {
            this.B.add(this.i);
            return true;
         } else {
            return false;
         }
      } else if (!this.N(this.i, this.R)) {
         return false;
      } else {
         for (int ix = 0; ix < this.M.size(); ix++) {
            class07209 class07209 = this.M.get(ix);
            if (N(this.y.method_8320(class07209)) && !this.N(class07209)) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean N(class00500 var0, class00500 var1) {
      if (var0.N(class00869.TM) && var1.N(class00869.Zc)) {
         return false;
      } else {
         return var0.N(class00869.Zc) && var1.N(class00869.TM) ? false : N(var0) || N(var1);
      }
   }

   private boolean N(class07209 var1) {
      class00500 class00500 = this.y.method_8320(var1);

      for (class07211 class07211 : this.i()) {
         if (class07211.z() != this.R.z()) {
            class07209 class07209 = var1.method_10093(class07211);
            if (N(this.y.method_8320(class07209), class00500) && !this.N(class07209, class07211)) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean N(class00500 var0) {
      return var0.N(class00869.Zc) || var0.N(class00869.TM);
   }

   private boolean N(class07209 var1, class07211 var2) {
      class00500 class00500x = this.y.method_8320(var1);
      if (class00500x.P()) {
         return true;
      } else if (!class00513.N(class00500x, this.y, var1, this.R, false, var2)) {
         return true;
      } else if (var1.equals(this.L)) {
         return true;
      } else if (this.M.contains(var1)) {
         return true;
      } else {
         int ix = 1;
         if (ix + this.M.size() > 12) {
            return false;
         } else {
            while (N(class00500x)) {
               class07209 class07209xx = var1.method_10079(this.R.b(), ix);
               class00500 class00500x = class00500x;
               class00500x = this.y.method_8320(class07209xx);
               if (class00500x.P()
                  || !N(class00500x, class00500x)
                  || !class00513.N(class00500x, this.y, class07209xx, this.R, false, this.R.b())
                  || class07209xx.equals(this.L)) {
                  break;
               }

               if (++ix + this.M.size() > 12) {
                  return false;
               }
            }

            int l = 0;

            for (int i1 = ix - 1; i1 >= 0; i1--) {
               this.M.add(var1.method_10079(this.R.b(), i1));
               l++;
            }

            int j1 = 1;

            while (true) {
               class07209 class07209x = var1.method_10079(this.R, j1);
               int j = this.M.indexOf(class07209x);
               if (j > -1) {
                  this.N(l, j);

                  for (int k = 0; k <= j + l; k++) {
                     class07209 class07209xx = this.M.get(k);
                     if (N(this.y.method_8320(class07209xx)) && !this.N(class07209xx)) {
                        return false;
                     }
                  }

                  return true;
               }

               class00500x = this.y.method_8320(class07209x);
               if (class00500x.P()) {
                  return true;
               }

               if (!class00513.N(class00500x, this.y, class07209x, this.R, true, this.R) || class07209x.equals(this.L)) {
                  return false;
               }

               if (class00500x.n() == class04641.field_15971) {
                  this.B.add(class07209x);
                  return true;
               }

               if (this.M.size() >= 12) {
                  return false;
               }

               this.M.add(class07209x);
               l++;
               j1++;
            }
         }
      }
   }
}
