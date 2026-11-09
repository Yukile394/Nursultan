package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class class01236 {
   private static final int R = 11;
   private static final int M = 0;
   private static final int B = 1;
   private static final int Z = 2;
   private static final int z = 3;
   private static final int U = 4;
   private static final int E = 5;
   private static final int W = 65536;
   private static final int m = 131072;
   private static final int P = 262144;
   private static final int s = 1048576;
   private static final int T = 2097152;
   private static final int b = 4194304;
   private static final int j = 8388608;
   private static final int v = 983040;
   private static final int n = 65535;
   private final class06069 t;
   final class01227 N;
   final class01227 y;
   final class01227[] L;
   final int u;
   final int i;

   public class01236(class06069 var1) {
      super();
      this.t = var1;
      byte b0 = 11;
      this.u = 7;
      this.i = 4;
      this.N = new class01227(11, 11, 5);
      this.N.N(this.u, this.i, this.u + 1, this.i + 1, 3);
      this.N.N(this.u - 1, this.i, this.u - 1, this.i + 1, 2);
      this.N.N(this.u + 2, this.i - 2, this.u + 3, this.i + 3, 5);
      this.N.N(this.u + 1, this.i - 2, this.u + 1, this.i - 1, 1);
      this.N.N(this.u + 1, this.i + 2, this.u + 1, this.i + 3, 1);
      this.N.N(this.u - 1, this.i - 1, 1);
      this.N.N(this.u - 1, this.i + 2, 1);
      this.N.N(0, 0, 11, 1, 5);
      this.N.N(0, 9, 11, 11, 5);
      this.N(this.N, this.u, this.i - 2, class07211.field_11039, 6);
      this.N(this.N, this.u, this.i + 3, class07211.field_11039, 6);
      this.N(this.N, this.u - 2, this.i - 1, class07211.field_11039, 3);
      this.N(this.N, this.u - 2, this.i + 2, class07211.field_11039, 3);

      while (this.N(this.N)) {
      }

      this.L = new class01227[3];
      this.L[0] = new class01227(11, 11, 5);
      this.L[1] = new class01227(11, 11, 5);
      this.L[2] = new class01227(11, 11, 5);
      this.N(this.N, this.L[0]);
      this.N(this.N, this.L[1]);
      this.L[0].N(this.u + 1, this.i, this.u + 1, this.i + 1, 8388608);
      this.L[1].N(this.u + 1, this.i, this.u + 1, this.i + 1, 8388608);
      this.y = new class01227(this.N.N, this.N.y, 5);
      this.N();
      this.N(this.y, this.L[2]);
   }

   @Nullable
   public class07211 y(class01227 var1, int var2, int var3, int var4, int var5) {
      for (class07211 class07211 : class07221.field_11062) {
         if (this.N(var1, var2 + class07211.P(), var3 + class07211.T(), var4, var5)) {
            return class07211;
         }
      }

      return null;
   }

   private boolean N(class01227 var1) {
      boolean flag = false;

      for (int ix = 0; ix < var1.y; ix++) {
         for (int jx = 0; jx < var1.N; jx++) {
            if (var1.N(jx, ix) == 0) {
               int k = 0;
               k += N(var1, jx + 1, ix) ? 1 : 0;
               k += N(var1, jx - 1, ix) ? 1 : 0;
               k += N(var1, jx, ix + 1) ? 1 : 0;
               k += N(var1, jx, ix - 1) ? 1 : 0;
               if (k >= 3) {
                  var1.N(jx, ix, 2);
                  flag = true;
               } else if (k == 2) {
                  int l = 0;
                  l += N(var1, jx + 1, ix + 1) ? 1 : 0;
                  l += N(var1, jx - 1, ix + 1) ? 1 : 0;
                  l += N(var1, jx + 1, ix - 1) ? 1 : 0;
                  l += N(var1, jx - 1, ix - 1) ? 1 : 0;
                  if (l <= 1) {
                     var1.N(jx, ix, 2);
                     flag = true;
                  }
               }
            }
         }
      }

      return flag;
   }

   private void N() {
      ArrayList arraylist = Lists.newArrayList();
      class01227 class01227 = this.L[1];

      for (int ix = 0; ix < this.y.y; ix++) {
         for (int jx = 0; jx < this.y.N; jx++) {
            int k = class01227.N(jx, ix);
            int l = k & 983040;
            if (l == 131072 && (k & 2097152) == 2097152) {
               arraylist.add(new class05034<>(jx, ix));
            }
         }
      }

      if (arraylist.isEmpty()) {
         this.y.N(0, 0, this.y.N, this.y.y, 5);
      } else {
         class05034 class05034 = (class05034)arraylist.get(this.t.y(arraylist.size()));
         int l1 = class01227.N((Integer)class05034.N(), (Integer)class05034.y());
         class01227.N((Integer)class05034.N(), (Integer)class05034.y(), l1 | 4194304);
         class07211 class07211x = this.y(this.N, (Integer)class05034.N(), (Integer)class05034.y(), 1, l1 & 65535);
         int i2 = (Integer)class05034.N() + class07211x.P();
         int i1 = (Integer)class05034.y() + class07211x.T();

         for (int j1 = 0; j1 < this.y.y; j1++) {
            for (int var9 = 0; var9 < this.y.N; var9++) {
               if (!N(this.N, var9, j1)) {
                  this.y.N(var9, j1, 5);
               } else if (var9 == (Integer)class05034.N() && j1 == (Integer)class05034.y()) {
                  this.y.N(var9, j1, 3);
               } else if (var9 == i2 && j1 == i1) {
                  this.y.N(var9, j1, 3);
                  this.L[2].N(var9, j1, 8388608);
               }
            }
         }

         ArrayList arraylist1 = Lists.newArrayList();

         for (class07211 class07211x : class07221.field_11062) {
            if (this.y.N(i2 + class07211x.P(), i1 + class07211x.T()) == 0) {
               arraylist1.add(class07211x);
            }
         }

         if (arraylist1.isEmpty()) {
            this.y.N(0, 0, this.y.N, this.y.y, 5);
            class01227.N((Integer)class05034.N(), (Integer)class05034.y(), l1);
         } else {
            class07211 class07211xx = (class07211)arraylist1.get(this.t.y(arraylist1.size()));
            this.N(this.y, i2 + class07211xx.P(), i1 + class07211xx.T(), class07211xx, 4);

            while (this.N(this.y)) {
            }
         }
      }
   }

   private void N(class01227 var1, class01227 var2) {
      ObjectArrayList objectarraylist = new ObjectArrayList();

      for (int ix = 0; ix < var1.y; ix++) {
         for (int jx = 0; jx < var1.N; jx++) {
            if (var1.N(jx, ix) == 2) {
               objectarraylist.add(new class05034<>(jx, ix));
            }
         }
      }

      class07536.L(objectarraylist, this.t);
      int k3 = 10;
      ObjectListIterator objectlistiterator = objectarraylist.iterator();

      while (objectlistiterator.hasNext()) {
         class05034 class05034 = (class05034)objectlistiterator.next();
         int k = (Integer)class05034.N();
         int l = (Integer)class05034.y();
         if (var2.N(k, l) == 0) {
            int i1 = k;
            int j1 = k;
            int k1 = l;
            int l1 = l;
            int i2 = 65536;
            if (var2.N(k + 1, l) == 0
               && var2.N(k, l + 1) == 0
               && var2.N(k + 1, l + 1) == 0
               && var1.N(k + 1, l) == 2
               && var1.N(k, l + 1) == 2
               && var1.N(k + 1, l + 1) == 2) {
               j1 = k + 1;
               l1 = l + 1;
               i2 = 262144;
            } else if (var2.N(k - 1, l) == 0
               && var2.N(k, l + 1) == 0
               && var2.N(k - 1, l + 1) == 0
               && var1.N(k - 1, l) == 2
               && var1.N(k, l + 1) == 2
               && var1.N(k - 1, l + 1) == 2) {
               i1 = k - 1;
               l1 = l + 1;
               i2 = 262144;
            } else if (var2.N(k - 1, l) == 0
               && var2.N(k, l - 1) == 0
               && var2.N(k - 1, l - 1) == 0
               && var1.N(k - 1, l) == 2
               && var1.N(k, l - 1) == 2
               && var1.N(k - 1, l - 1) == 2) {
               i1 = k - 1;
               k1 = l - 1;
               i2 = 262144;
            } else if (var2.N(k + 1, l) == 0 && var1.N(k + 1, l) == 2) {
               j1 = k + 1;
               i2 = 131072;
            } else if (var2.N(k, l + 1) == 0 && var1.N(k, l + 1) == 2) {
               l1 = l + 1;
               i2 = 131072;
            } else if (var2.N(k - 1, l) == 0 && var1.N(k - 1, l) == 2) {
               i1 = k - 1;
               i2 = 131072;
            } else if (var2.N(k, l - 1) == 0 && var1.N(k, l - 1) == 2) {
               k1 = l - 1;
               i2 = 131072;
            }

            int j2 = this.t.Z() ? i1 : j1;
            int k2 = this.t.Z() ? k1 : l1;
            int l2 = 2097152;
            if (!var1.y(j2, k2, 1)) {
               j2 = j2 == i1 ? j1 : i1;
               k2 = k2 == k1 ? l1 : k1;
               if (!var1.y(j2, k2, 1)) {
                  k2 = k2 == k1 ? l1 : k1;
                  if (!var1.y(j2, k2, 1)) {
                     j2 = j2 == i1 ? j1 : i1;
                     k2 = k2 == k1 ? l1 : k1;
                     if (!var1.y(j2, k2, 1)) {
                        l2 = 0;
                        j2 = i1;
                        k2 = k1;
                     }
                  }
               }
            }

            for (int i3 = k1; i3 <= l1; i3++) {
               for (int j3 = i1; j3 <= j1; j3++) {
                  if (j3 == j2 && i3 == k2) {
                     var2.N(j3, i3, 1048576 | l2 | i2 | k3);
                  } else {
                     var2.N(j3, i3, i2 | k3);
                  }
               }
            }

            k3++;
         }
      }
   }

   private void N(class01227 var1, int var2, int var3, class07211 var4, int var5) {
      if (var5 > 0) {
         var1.N(var2, var3, 1);
         var1.N(var2 + var4.P(), var3 + var4.T(), 0, 1);

         for (int ix = 0; ix < 8; ix++) {
            class07211 class07211xx = class07211.y(this.t.y(4));
            if (class07211xx != var4.b() && (class07211xx != class07211.field_11034 || !this.t.Z())) {
               int jx = var2 + var4.P();
               int k = var3 + var4.T();
               if (var1.N(jx + class07211xx.P(), k + class07211xx.T()) == 0 && var1.N(jx + class07211xx.P() * 2, k + class07211xx.T() * 2) == 0) {
                  this.N(var1, var2 + var4.P() + class07211xx.P(), var3 + var4.T() + class07211xx.T(), class07211xx, var5 - 1);
                  break;
               }
            }
         }

         class07211 class07211x = var4.R();
         class07211 class07211x = var4.M();
         var1.N(var2 + class07211x.P(), var3 + class07211x.T(), 0, 2);
         var1.N(var2 + class07211x.P(), var3 + class07211x.T(), 0, 2);
         var1.N(var2 + var4.P() + class07211x.P(), var3 + var4.T() + class07211x.T(), 0, 2);
         var1.N(var2 + var4.P() + class07211x.P(), var3 + var4.T() + class07211x.T(), 0, 2);
         var1.N(var2 + var4.P() * 2, var3 + var4.T() * 2, 0, 2);
         var1.N(var2 + class07211x.P() * 2, var3 + class07211x.T() * 2, 0, 2);
         var1.N(var2 + class07211x.P() * 2, var3 + class07211x.T() * 2, 0, 2);
      }
   }

   public boolean N(class01227 var1, int var2, int var3, int var4, int var5) {
      return (this.L[var4].N(var2, var3) & 65535) == var5;
   }

   public static boolean N(class01227 var0, int var1, int var2) {
      int ix = var0.N(var1, var2);
      return ix == 1 || ix == 2 || ix == 3 || ix == 4;
   }
}
