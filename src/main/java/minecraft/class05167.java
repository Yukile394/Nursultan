package minecraft;

import Nursultan.class10491;
import Nursultan.class10493;
import Nursultan.class10494;
import Nursultan.class10495;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;

public class class05167 extends class06476 {
   private static final int Q = 58;
   private static final int O = 22;
   private static final int g = 58;
   public static final int N = 29;
   private static final int I = 61;
   private class06433 J;
   private class06433 o;
   private final List<class06476> q = Lists.newArrayList();

   private void L(class05974 var1, class06069 var2, class05163 var3) {
      if (this.N(var3, 21, 21, 36, 36)) {
         this.N(var1, var3, 21, 0, 22, 36, 0, 36, y, y, false);
         this.N(var1, var3, 21, 1, 22, 36, 23, 36);

         for (int i = 0; i < 4; i++) {
            this.N(var1, var3, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, L, L, false);
            this.N(var1, var3, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, L, L, false);
            this.N(var1, var3, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, L, L, false);
            this.N(var1, var3, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, L, L, false);
         }

         this.N(var1, var3, 25, 16, 25, 32, 16, 32, y, y, false);
         this.N(var1, var3, 25, 17, 25, 25, 19, 25, L, L, false);
         this.N(var1, var3, 32, 17, 25, 32, 19, 25, L, L, false);
         this.N(var1, var3, 25, 17, 32, 25, 19, 32, L, L, false);
         this.N(var1, var3, 32, 17, 32, 32, 19, 32, L, L, false);
         this.L(var1, L, 26, 20, 26, var3);
         this.L(var1, L, 27, 21, 27, var3);
         this.L(var1, R, 27, 20, 27, var3);
         this.L(var1, L, 26, 20, 31, var3);
         this.L(var1, L, 27, 21, 30, var3);
         this.L(var1, R, 27, 20, 30, var3);
         this.L(var1, L, 31, 20, 31, var3);
         this.L(var1, L, 30, 21, 30, var3);
         this.L(var1, R, 30, 20, 30, var3);
         this.L(var1, L, 31, 20, 26, var3);
         this.L(var1, L, 30, 21, 27, var3);
         this.L(var1, R, 30, 20, 27, var3);
         this.N(var1, var3, 28, 21, 27, 29, 21, 27, y, y, false);
         this.N(var1, var3, 27, 21, 28, 27, 21, 29, y, y, false);
         this.N(var1, var3, 28, 21, 30, 29, 21, 30, y, y, false);
         this.N(var1, var3, 30, 21, 28, 30, 21, 29, y, y, false);
      }
   }

   public class05167(class06069 var1, int var2, int var3, class07211 var4) {
      super(class04878.H, var4, 0, N(var2, 39, var3, var4, 58, 23, 58));
      this.N(var4);
      List<class06433> list = this.N(var1);
      this.J.u = true;
      this.q.add(new class06480(var4, this.J));
      this.q.add(new class05158(var4, this.o));
      ArrayList arraylist = Lists.newArrayList();
      arraylist.add(new class10495());
      arraylist.add(new class10494());
      arraylist.add(new class05177());
      arraylist.add(new class10491());
      arraylist.add(new class10493());
      arraylist.add(new class05141());
      arraylist.add(new class05146());

      for (class06433 var8 : list) {
         if (!var8.u && !var8.y()) {
            for (class05143 class05143 : arraylist) {
               if (class05143.N(var8)) {
                  this.q.add(class05143.N(var4, var8, var1));
                  break;
               }
            }
         }
      }

      class07218 class07218 = this.L(9, 0, 22);

      for (class06476 class06476 : this.q) {
         class06476.L().N((class00753)class07218);
      }

      class05163 class05163xx = class05163.N(this.L(1, 1, 1), this.L(23, 8, 21));
      class05163 class05163x = class05163.N(this.L(34, 1, 1), this.L(56, 8, 21));
      class05163 class05163xx = class05163.N(this.L(22, 13, 22), this.L(35, 17, 35));
      int i = var1.M();
      this.q.add(new class06443(var4, class05163xx, i++));
      this.q.add(new class06443(var4, class05163x, i++));
      this.q.add(new class06442(var4, class05163xx));
   }

   public class05167(class07001 var1) {
      super(class04878.H, var1);
   }

   private void i(class05974 var1, class06069 var2, class05163 var3) {
      if (this.N(var3, 7, 21, 13, 50)) {
         this.N(var1, var3, 7, 0, 21, 13, 0, 50, y, y, false);
         this.N(var1, var3, 7, 1, 21, 13, 10, 50);
         this.N(var1, var3, 11, 8, 21, 13, 8, 53, y, y, false);

         for (int i = 0; i < 4; i++) {
            this.N(var1, var3, i + 7, i + 5, 21, i + 7, i + 5, 54, L, L, false);
         }

         for (byte b0 = 21; b0 <= 45; b0 += 3) {
            this.L(var1, i, 12, 9, b0, var3);
         }
      }

      if (this.N(var3, 44, 21, 50, 54)) {
         this.N(var1, var3, 44, 0, 21, 50, 0, 50, y, y, false);
         this.N(var1, var3, 44, 1, 21, 50, 10, 50);
         this.N(var1, var3, 44, 8, 21, 46, 8, 53, y, y, false);

         for (int j = 0; j < 4; j++) {
            this.N(var1, var3, 50 - j, j + 5, 21, 50 - j, j + 5, 54, L, L, false);
         }

         for (byte b1 = 21; b1 <= 45; b1 += 3) {
            this.L(var1, i, 45, 9, b1, var3);
         }
      }

      if (this.N(var3, 8, 44, 49, 54)) {
         this.N(var1, var3, 14, 0, 44, 43, 0, 50, y, y, false);
         this.N(var1, var3, 14, 1, 44, 43, 10, 50);

         for (byte b2 = 12; b2 <= 45; b2 += 3) {
            this.L(var1, i, b2, 9, 45, var3);
            this.L(var1, i, b2, 9, 52, var3);
            if (b2 == 12 || b2 == 18 || b2 == 24 || b2 == 33 || b2 == 39 || b2 == 45) {
               this.L(var1, i, b2, 9, 47, var3);
               this.L(var1, i, b2, 9, 50, var3);
               this.L(var1, i, b2, 10, 45, var3);
               this.L(var1, i, b2, 10, 46, var3);
               this.L(var1, i, b2, 10, 51, var3);
               this.L(var1, i, b2, 10, 52, var3);
               this.L(var1, i, b2, 11, 47, var3);
               this.L(var1, i, b2, 11, 50, var3);
               this.L(var1, i, b2, 12, 48, var3);
               this.L(var1, i, b2, 12, 49, var3);
            }
         }

         for (int k = 0; k < 3; k++) {
            this.N(var1, var3, 8 + k, 5 + k, 54, 49 - k, 5 + k, 54, y, y, false);
         }

         this.N(var1, var3, 11, 8, 54, 46, 8, 54, L, L, false);
         this.N(var1, var3, 14, 8, 44, 43, 8, 53, y, y, false);
      }
   }

   private void u(class05974 var1, class06069 var2, class05163 var3) {
      if (this.N(var3, 0, 21, 6, 58)) {
         this.N(var1, var3, 0, 0, 21, 6, 0, 57, y, y, false);
         this.N(var1, var3, 0, 1, 21, 6, 7, 57);
         this.N(var1, var3, 4, 4, 21, 6, 4, 53, y, y, false);

         for (int i = 0; i < 4; i++) {
            this.N(var1, var3, i, i + 1, 21, i, i + 1, 57 - i, L, L, false);
         }

         for (byte b0 = 23; b0 < 53; b0 += 3) {
            this.L(var1, i, 5, 5, b0, var3);
         }

         this.L(var1, i, 5, 5, 52, var3);

         for (int j = 0; j < 4; j++) {
            this.N(var1, var3, j, j + 1, 21, j, j + 1, 57 - j, L, L, false);
         }

         this.N(var1, var3, 4, 1, 52, 6, 3, 52, y, y, false);
         this.N(var1, var3, 5, 1, 51, 5, 3, 53, y, y, false);
      }

      if (this.N(var3, 51, 21, 58, 58)) {
         this.N(var1, var3, 51, 0, 21, 57, 0, 57, y, y, false);
         this.N(var1, var3, 51, 1, 21, 57, 7, 57);
         this.N(var1, var3, 51, 4, 21, 53, 4, 53, y, y, false);

         for (int k = 0; k < 4; k++) {
            this.N(var1, var3, 57 - k, k + 1, 21, 57 - k, k + 1, 57 - k, L, L, false);
         }

         for (byte b1 = 23; b1 < 53; b1 += 3) {
            this.L(var1, i, 52, 5, b1, var3);
         }

         this.L(var1, i, 52, 5, 52, var3);
         this.N(var1, var3, 51, 1, 52, 53, 3, 52, y, y, false);
         this.N(var1, var3, 52, 1, 51, 52, 3, 53, y, y, false);
      }

      if (this.N(var3, 0, 51, 57, 57)) {
         this.N(var1, var3, 7, 0, 51, 50, 0, 57, y, y, false);
         this.N(var1, var3, 7, 1, 51, 50, 10, 57);

         for (int l = 0; l < 4; l++) {
            this.N(var1, var3, l + 1, l + 1, 57 - l, 56 - l, l + 1, 57 - l, L, L, false);
         }
      }
   }

   private void y(class05974 var1, class06069 var2, class05163 var3) {
      if (this.N(var3, 15, 20, 42, 21)) {
         this.N(var1, var3, 15, 0, 21, 42, 0, 21, y, y, false);
         this.N(var1, var3, 26, 1, 21, 31, 3, 21);
         this.N(var1, var3, 21, 12, 21, 36, 12, 21, y, y, false);
         this.N(var1, var3, 17, 11, 21, 40, 11, 21, y, y, false);
         this.N(var1, var3, 16, 10, 21, 41, 10, 21, y, y, false);
         this.N(var1, var3, 15, 7, 21, 42, 9, 21, y, y, false);
         this.N(var1, var3, 16, 6, 21, 41, 6, 21, y, y, false);
         this.N(var1, var3, 17, 5, 21, 40, 5, 21, y, y, false);
         this.N(var1, var3, 21, 4, 21, 36, 4, 21, y, y, false);
         this.N(var1, var3, 22, 3, 21, 26, 3, 21, y, y, false);
         this.N(var1, var3, 31, 3, 21, 35, 3, 21, y, y, false);
         this.N(var1, var3, 23, 2, 21, 25, 2, 21, y, y, false);
         this.N(var1, var3, 32, 2, 21, 34, 2, 21, y, y, false);
         this.N(var1, var3, 28, 4, 20, 29, 4, 21, L, L, false);
         this.L(var1, L, 27, 3, 21, var3);
         this.L(var1, L, 30, 3, 21, var3);
         this.L(var1, L, 26, 2, 21, var3);
         this.L(var1, L, 31, 2, 21, var3);
         this.L(var1, L, 25, 1, 21, var3);
         this.L(var1, L, 32, 1, 21, var3);

         for (int i = 0; i < 7; i++) {
            this.L(var1, u, 28 - i, 6 + i, 21, var3);
            this.L(var1, u, 29 + i, 6 + i, 21, var3);
         }

         for (int j = 0; j < 4; j++) {
            this.L(var1, u, 28 - j, 9 + j, 21, var3);
            this.L(var1, u, 29 + j, 9 + j, 21, var3);
         }

         this.L(var1, u, 28, 12, 21, var3);
         this.L(var1, u, 29, 12, 21, var3);

         for (int k = 0; k < 3; k++) {
            this.L(var1, u, 22 - k * 2, 8, 21, var3);
            this.L(var1, u, 22 - k * 2, 9, 21, var3);
            this.L(var1, u, 35 + k * 2, 8, 21, var3);
            this.L(var1, u, 35 + k * 2, 9, 21, var3);
         }

         this.N(var1, var3, 15, 13, 21, 42, 15, 21);
         this.N(var1, var3, 15, 1, 21, 15, 6, 21);
         this.N(var1, var3, 16, 1, 21, 16, 5, 21);
         this.N(var1, var3, 17, 1, 21, 20, 4, 21);
         this.N(var1, var3, 21, 1, 21, 21, 3, 21);
         this.N(var1, var3, 22, 1, 21, 22, 2, 21);
         this.N(var1, var3, 23, 1, 21, 24, 1, 21);
         this.N(var1, var3, 42, 1, 21, 42, 6, 21);
         this.N(var1, var3, 41, 1, 21, 41, 5, 21);
         this.N(var1, var3, 37, 1, 21, 40, 4, 21);
         this.N(var1, var3, 36, 1, 21, 36, 3, 21);
         this.N(var1, var3, 33, 1, 21, 34, 1, 21);
         this.N(var1, var3, 35, 1, 21, 35, 2, 21);
      }
   }

   private List<class06433> N(class06069 var1) {
      class06433[] aclass06433 = new class06433[75];

      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 4; j++) {
            boolean flag = false;
            int k = y(i, 0, j);
            aclass06433[k] = new class06433(k);
         }
      }

      for (int l1 = 0; l1 < 5; l1++) {
         for (int k2 = 0; k2 < 4; k2++) {
            boolean flag1 = true;
            int k3 = y(l1, 1, k2);
            aclass06433[k3] = new class06433(k3);
         }
      }

      for (int i2 = 1; i2 < 4; i2++) {
         for (int l2 = 0; l2 < 2; l2++) {
            byte b0 = 2;
            int l3 = y(i2, 2, l2);
            aclass06433[l3] = new class06433(l3);
         }
      }

      this.J = aclass06433[b];

      for (int j2 = 0; j2 < 5; j2++) {
         for (int i3 = 0; i3 < 5; i3++) {
            for (int j3 = 0; j3 < 3; j3++) {
               int i4 = y(j2, j3, i3);
               if (aclass06433[i4] != null) {
                  for (class07211 class07211 : class07211.values()) {
                     int l = j2 + class07211.P();
                     int i1 = j3 + class07211.s();
                     int j1 = i3 + class07211.T();
                     if (l >= 0 && l < 5 && j1 >= 0 && j1 < 5 && i1 >= 0 && i1 < 3) {
                        int k1 = y(l, i1, j1);
                        if (aclass06433[k1] != null) {
                           if (j1 == i3) {
                              aclass06433[i4].N(class07211, aclass06433[k1]);
                           } else {
                              aclass06433[i4].N(class07211.b(), aclass06433[k1]);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      class06433 class06433xxx = new class06433(1003);
      class06433 class06433x = new class06433(1001);
      class06433 class06433xx = new class06433(1002);
      aclass06433[j].N(class07211.field_11036, class06433xxx);
      aclass06433[v].N(class07211.field_11035, class06433x);
      aclass06433[n].N(class07211.field_11035, class06433xx);
      class06433xxx.u = true;
      class06433x.u = true;
      class06433xx.u = true;
      this.J.i = true;
      this.o = aclass06433[y(var1.y(4), 0, 2)];
      this.o.u = true;
      this.o.y[class07211.field_11034.L()].u = true;
      this.o.y[class07211.field_11043.L()].u = true;
      this.o.y[class07211.field_11034.L()].y[class07211.field_11043.L()].u = true;
      this.o.y[class07211.field_11036.L()].u = true;
      this.o.y[class07211.field_11034.L()].y[class07211.field_11036.L()].u = true;
      this.o.y[class07211.field_11043.L()].y[class07211.field_11036.L()].u = true;
      this.o.y[class07211.field_11034.L()].y[class07211.field_11043.L()].y[class07211.field_11036.L()].u = true;
      ObjectArrayList objectarraylist = new ObjectArrayList();

      for (class06433 class06433xxx : aclass06433) {
         if (class06433xxx != null) {
            class06433xxx.N();
            objectarraylist.add(class06433xxx);
         }
      }

      class06433xxx.N();
      class07536.L(objectarraylist, var1);
      int j4 = 1;
      ObjectListIterator objectlistiterator = objectarraylist.iterator();

      while (objectlistiterator.hasNext()) {
         class06433 class06433xxxx = (class06433)objectlistiterator.next();
         int k4 = 0;
         int l4 = 0;

         while (k4 < 2 && l4 < 5) {
            l4++;
            int i5 = var1.y(6);
            if (class06433xxxx.L[i5]) {
               int j5 = class07211.N(i5).b().L();
               class06433xxxx.L[i5] = false;
               class06433xxxx.y[i5].L[j5] = false;
               if (class06433xxxx.N(j4++) && class06433xxxx.y[i5].N(j4++)) {
                  k4++;
               } else {
                  class06433xxxx.L[i5] = true;
                  class06433xxxx.y[i5].L[j5] = true;
               }
            }
         }
      }

      objectarraylist.add(class06433xxx);
      objectarraylist.add(class06433x);
      objectarraylist.add(class06433xx);
      return objectarraylist;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      int i = Math.max(var1.method_8615(), 64) - this.k.Z();
      this.N(var1, var5, 0, 0, 0, 58, i, 58);
      this.N(false, 0, var1, var4, var5);
      this.N(true, 33, var1, var4, var5);
      this.N(var1, var4, var5);
      this.y(var1, var4, var5);
      this.L(var1, var4, var5);
      this.u(var1, var4, var5);
      this.i(var1, var4, var5);
      this.R(var1, var4, var5);

      for (int var9 = 0; var9 < 7; var9++) {
         int k = 0;

         while (k < 7) {
            if (k == 0 && var9 == 3) {
               k = 6;
            }

            int l = var9 * 9;
            int i1 = k * 9;

            for (int j1 = 0; j1 < 4; j1++) {
               for (int k1 = 0; k1 < 4; k1++) {
                  this.L(var1, L, l + j1, 0, i1 + k1, var5);
                  this.N(var1, L, l + j1, -1, i1 + k1, var5);
               }
            }

            if (var9 != 0 && var9 != 6) {
               k += 6;
            } else {
               k++;
            }
         }
      }

      for (int l1 = 0; l1 < 5; l1++) {
         this.N(var1, var5, -1 - l1, 0 + l1 * 2, -1 - l1, -1 - l1, 23, 58 + l1);
         this.N(var1, var5, 58 + l1, 0 + l1 * 2, -1 - l1, 58 + l1, 23, 58 + l1);
         this.N(var1, var5, 0 - l1, 0 + l1 * 2, -1 - l1, 57 + l1, 23, -1 - l1);
         this.N(var1, var5, 0 - l1, 0 + l1 * 2, 58 + l1, 57 + l1, 23, 58 + l1);
      }

      for (class06476 class06476 : this.q) {
         if (class06476.L().N(var5)) {
            class06476.N(var1, var2, var3, var4, var5, var6, var7);
         }
      }
   }

   private void N(boolean var1, int var2, class05974 var3, class06069 var4, class05163 var5) {
      byte b0 = 24;
      if (this.N(var5, var2, 0, var2 + 23, 20)) {
         this.N(var3, var5, var2 + 0, 0, 0, var2 + 24, 0, 20, y, y, false);
         this.N(var3, var5, var2 + 0, 1, 0, var2 + 24, 10, 20);

         for (int i = 0; i < 4; i++) {
            this.N(var3, var5, var2 + i, i + 1, i, var2 + i, i + 1, 20, L, L, false);
            this.N(var3, var5, var2 + i + 7, i + 5, i + 7, var2 + i + 7, i + 5, 20, L, L, false);
            this.N(var3, var5, var2 + 17 - i, i + 5, i + 7, var2 + 17 - i, i + 5, 20, L, L, false);
            this.N(var3, var5, var2 + 24 - i, i + 1, i, var2 + 24 - i, i + 1, 20, L, L, false);
            this.N(var3, var5, var2 + i + 1, i + 1, i, var2 + 23 - i, i + 1, i, L, L, false);
            this.N(var3, var5, var2 + i + 8, i + 5, i + 7, var2 + 16 - i, i + 5, i + 7, L, L, false);
         }

         this.N(var3, var5, var2 + 4, 4, 4, var2 + 6, 4, 20, y, y, false);
         this.N(var3, var5, var2 + 7, 4, 4, var2 + 17, 4, 6, y, y, false);
         this.N(var3, var5, var2 + 18, 4, 4, var2 + 20, 4, 20, y, y, false);
         this.N(var3, var5, var2 + 11, 8, 11, var2 + 13, 8, 20, y, y, false);
         this.L(var3, i, var2 + 12, 9, 12, var5);
         this.L(var3, i, var2 + 12, 9, 15, var5);
         this.L(var3, i, var2 + 12, 9, 18, var5);
         int l = var2 + (var1 ? 19 : 5);
         int j = var2 + (var1 ? 5 : 19);

         for (byte b1 = 20; b1 >= 5; b1 -= 3) {
            this.L(var3, i, l, 5, b1, var5);
         }

         for (byte b2 = 19; b2 >= 7; b2 -= 3) {
            this.L(var3, i, j, 5, b2, var5);
         }

         for (int i1 = 0; i1 < 4; i1++) {
            int k = var1 ? var2 + 24 - (17 - i1 * 3) : var2 + 17 - i1 * 3;
            this.L(var3, i, k, 5, 5, var5);
         }

         this.L(var3, i, j, 5, 5, var5);
         this.N(var3, var5, var2 + 11, 1, 12, var2 + 13, 7, 12, y, y, false);
         this.N(var3, var5, var2 + 12, 1, 11, var2 + 12, 7, 13, y, y, false);
      }
   }

   private void N(class05974 var1, class06069 var2, class05163 var3) {
      if (this.N(var3, 22, 5, 35, 17)) {
         this.N(var1, var3, 25, 0, 0, 32, 8, 20);

         for (int i = 0; i < 4; i++) {
            this.N(var1, var3, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, L, L, false);
            this.N(var1, var3, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, L, L, false);
            this.L(var1, L, 25, 5, 5 + i * 4, var3);
            this.L(var1, L, 26, 6, 5 + i * 4, var3);
            this.L(var1, R, 26, 5, 5 + i * 4, var3);
            this.N(var1, var3, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, L, L, false);
            this.N(var1, var3, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, L, L, false);
            this.L(var1, L, 32, 5, 5 + i * 4, var3);
            this.L(var1, L, 31, 6, 5 + i * 4, var3);
            this.L(var1, R, 31, 5, 5 + i * 4, var3);
            this.N(var1, var3, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, y, y, false);
         }
      }
   }

   private void R(class05974 var1, class06069 var2, class05163 var3) {
      if (this.N(var3, 14, 21, 20, 43)) {
         this.N(var1, var3, 14, 0, 21, 20, 0, 43, y, y, false);
         this.N(var1, var3, 14, 1, 22, 20, 14, 43);
         this.N(var1, var3, 18, 12, 22, 20, 12, 39, y, y, false);
         this.N(var1, var3, 18, 12, 21, 20, 12, 21, L, L, false);

         for (int i = 0; i < 4; i++) {
            this.N(var1, var3, i + 14, i + 9, 21, i + 14, i + 9, 43 - i, L, L, false);
         }

         for (byte b0 = 23; b0 <= 39; b0 += 3) {
            this.L(var1, i, 19, 13, b0, var3);
         }
      }

      if (this.N(var3, 37, 21, 43, 43)) {
         this.N(var1, var3, 37, 0, 21, 43, 0, 43, y, y, false);
         this.N(var1, var3, 37, 1, 22, 43, 14, 43);
         this.N(var1, var3, 37, 12, 22, 39, 12, 39, y, y, false);
         this.N(var1, var3, 37, 12, 21, 39, 12, 21, L, L, false);

         for (int j = 0; j < 4; j++) {
            this.N(var1, var3, 43 - j, j + 9, 21, 43 - j, j + 9, 43 - j, L, L, false);
         }

         for (byte b1 = 23; b1 <= 39; b1 += 3) {
            this.L(var1, i, 38, 13, b1, var3);
         }
      }

      if (this.N(var3, 15, 37, 42, 43)) {
         this.N(var1, var3, 21, 0, 37, 36, 0, 43, y, y, false);
         this.N(var1, var3, 21, 1, 37, 36, 14, 43);
         this.N(var1, var3, 21, 12, 37, 36, 12, 39, y, y, false);

         for (int k = 0; k < 4; k++) {
            this.N(var1, var3, 15 + k, k + 9, 43 - k, 42 - k, k + 9, 43 - k, L, L, false);
         }

         for (byte b2 = 21; b2 <= 36; b2 += 3) {
            this.L(var1, i, b2, 13, 38, var3);
         }
      }
   }
}
