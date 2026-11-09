package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public final class class05785 extends class05015<class05818, class05828> {
   private static final long M = class05027.N(15);
   private static final long B = class05027.N(15, class07211.field_11036);
   private static final long Z = class05027.N(15, false, class07211.field_11036);
   private final class07218 z = new class07218();
   private final class03480 U;

   public class05785(class00538 var1) {
      this(var1, new class05828(var1));
   }

   protected class05785(class00538 var1, class05828 var2) {
      super(var1, var2);
      this.U = new class03480(var1.i());
   }

   private int u(long var1) {
      int i = class07209.method_10071(var1);
      if (class01296.y(i) != 0) {
         return 0;
      } else {
         int j = class07209.method_10061(var1);
         int k = class07209.method_10083(var1);
         int l = class01296.y(j);
         int i1 = class01296.y(k);
         if (l != 0 && l != 15 && i1 != 0 && i1 != 15) {
            return 0;
         } else {
            int j1 = class01296.N(j);
            int k1 = class01296.N(i);
            int l1 = class01296.N(k);
            int i2 = 0;

            while (!this.R.y(class01296.y(j1, k1 - i2 - 1, l1)) && this.R.N(k1 - i2 - 1)) {
               i2++;
            }

            return i2;
         }
      }
   }

   private void y(int var1, int var2, int var3) {
      int i = class01296.L(this.R.L());
      this.N(var1, var2, var3, i);
      this.y(var1, var2, var3, i);
   }

   @Override
   public void y(class07321 var1) {
      long i = class01296.y(var1.B, var1.Z);
      this.R.y(i, true);
      class03480 class03480xxxx = Objects.requireNonNullElse(this.y(var1.B, var1.Z), this.U);
      class03480 class03480x = Objects.requireNonNullElse(this.y(var1.B, var1.Z - 1), this.U);
      class03480 class03480xx = Objects.requireNonNullElse(this.y(var1.B, var1.Z + 1), this.U);
      class03480 class03480xxx = Objects.requireNonNullElse(this.y(var1.B - 1, var1.Z), this.U);
      class03480 class03480xxxx = Objects.requireNonNullElse(this.y(var1.B + 1, var1.Z), this.U);
      int j = this.R.m(i);
      int k = this.R.L();
      int l = class01296.L(var1.B);
      int i1 = class01296.L(var1.Z);

      for (int j1 = j - 1; j1 >= k; j1--) {
         long k1 = class01296.y(var1.B, j1, var1.Z);
         class00536 class00536 = this.R.L(k1);
         if (class00536 != null) {
            int l1 = class01296.L(j1);
            int i2 = l1 + 15;
            boolean flag = false;

            for (int j2 = 0; j2 < 16; j2++) {
               for (int k2 = 0; k2 < 16; k2++) {
                  int l2 = class03480xxxx.N(k2, j2);
                  if (l2 <= i2) {
                     int i3 = j2 == 0 ? class03480x.N(k2, 15) : class03480xxxx.N(k2, j2 - 1);
                     int j3 = j2 == 15 ? class03480xx.N(k2, 0) : class03480xxxx.N(k2, j2 + 1);
                     int k3 = k2 == 0 ? class03480xxx.N(15, j2) : class03480xxxx.N(k2 - 1, j2);
                     int l3 = k2 == 15 ? class03480xxxx.N(0, j2) : class03480xxxx.N(k2 + 1, j2);
                     int i4 = Math.max(Math.max(i3, j3), Math.max(k3, l3));

                     for (int j4 = i2; j4 >= Math.max(l1, l2); j4--) {
                        class00536.N(k2, class01296.y(j4), j2, 15);
                        if (j4 == l2 || j4 < i4) {
                           long k4 = class07209.method_10064(l + k2, j4, i1 + j2);
                           this.L(k4, class05027.N(j4 == l2, j4 < i3, j4 < j3, j4 < k3, j4 < l3));
                        }
                     }

                     if (l2 < l1) {
                        flag = true;
                     }
                  }
               }
            }

            if (!flag) {
               break;
            }
         }
      }
   }

   private void y(int var1, int var2, int var3, int var4) {
      int i = class01296.N(var1);
      int j = class01296.N(var2);
      int k = Math.max(
         Math.max(this.N(var1 - 1, var2, Integer.MIN_VALUE), this.N(var1 + 1, var2, Integer.MIN_VALUE)),
         Math.max(this.N(var1, var2 - 1, Integer.MIN_VALUE), this.N(var1, var2 + 1, Integer.MIN_VALUE))
      );
      int l = Math.max(var3, var4);

      for (long i1 = class01296.y(i, class01296.N(l), j); !this.R.W(i1); i1 = class01296.N(i1, class07211.field_11036)) {
         if (this.R.y(i1)) {
            int j1 = class01296.L(class01296.L(i1));
            int k1 = j1 + 15;

            for (int l1 = Math.max(j1, l); l1 <= k1; l1++) {
               long i2 = class07209.method_10064(var1, l1, var2);
               if (N(this.R.i(i2))) {
                  return;
               }

               this.R.N(i2, 15);
               if (l1 < k || l1 == var3) {
                  this.L(i2, Z);
               }
            }
         }
      }
   }

   @Nullable
   private class03480 y(int var1, int var2) {
      class03482 class03482 = this.i.y(var1, var2);
      return class03482 != null ? class03482.Y() : null;
   }

   private int N(int var1, int var2, int var3) {
      class03480 class03480 = this.y(class01296.N(var1), class01296.N(var2));
      return class03480 == null ? var3 : class03480.N(class01296.y(var1), class01296.y(var2));
   }

   private void N(long var1, class07211 var3, int var4, boolean var5, int var6) {
      if (var6 != 0) {
         int i = class07209.method_10061(var1);
         int j = class07209.method_10083(var1);
         if (N(var3, class01296.y(i), class01296.y(j))) {
            int k = class07209.method_10071(var1);
            int l = class01296.N(i);
            int i1 = class01296.N(j);
            int j1 = class01296.N(k) - 1;
            int k1 = j1 - var6 + 1;

            while (j1 >= k1) {
               if (!this.R.y(class01296.y(l, j1, i1))) {
                  j1--;
               } else {
                  int l1 = class01296.L(j1);

                  for (int i2 = 15; i2 >= 0; i2--) {
                     long j2 = class07209.method_10064(i, l1 + i2, j);
                     if (var5) {
                        this.R.N(j2, var4);
                        if (var4 > 1) {
                           this.L(j2, class05027.N(var4, true, var3.b()));
                        }
                     } else {
                        this.R.N(j2, 0);
                        this.y(j2, class05027.N(var4, var3.b()));
                     }
                  }

                  j1--;
               }
            }
         }
      }
   }

   private static boolean N(class07211 var0, int var1, int var2) {
      return switch (var0) {
         case field_11043 -> var2 == 15;
         case field_11035 -> var2 == 0;
         case field_11039 -> var1 == 15;
         case field_11034 -> var1 == 0;
         default -> false;
      };
   }

   @Override
   public void N(class07321 var1, boolean var2) {
      super.N(var1, var2);
      if (var2) {
         int i = class01296.N(Objects.requireNonNullElse(this.y(var1.B, var1.Z), this.U).N() - 1) + 1;
         long j = class01296.y(var1.B, var1.Z);
         int k = this.R.m(j);
         int l = Math.max(this.R.L(), i);

         for (int i1 = k - 1; i1 >= l; i1--) {
            class00536 class00536 = this.R.L(class01296.y(var1.B, i1, var1.Z));
            if (class00536 != null && class00536.u()) {
               class00536.N(15);
            }
         }
      }
   }

   @Override
   protected void N(long var1) {
      int i = class07209.method_10061(var1);
      int j = class07209.method_10071(var1);
      int k = class07209.method_10083(var1);
      long l = class01296.i(var1);
      int i1 = this.R.z(l) ? this.N(i, k, Integer.MAX_VALUE) : Integer.MAX_VALUE;
      if (i1 != Integer.MAX_VALUE) {
         this.y(i, k, i1);
      }

      if (this.R.y(l)) {
         if (j >= i1) {
            this.y(var1, B);
            this.L(var1, Z);
         } else {
            int j1 = this.R.i(var1);
            if (j1 > 0) {
               this.R.N(var1, 0);
               this.y(var1, class05027.N(j1));
            } else {
               this.y(var1, L);
            }
         }
      }
   }

   private void N(int var1, int var2, int var3, int var4) {
      if (var3 > var4) {
         int i = class01296.N(var1);
         int j = class01296.N(var2);
         int k = var3 - 1;

         for (int l = class01296.N(k); this.R.N(l); l--) {
            if (this.R.y(class01296.y(i, l, j))) {
               int i1 = class01296.L(l);

               for (int j1 = Math.min(i1 + 15, k); j1 >= i1; j1--) {
                  long k1 = class07209.method_10064(var1, j1, var2);
                  if (!N(this.R.i(k1))) {
                     return;
                  }

                  this.R.N(k1, 0);
                  this.y(k1, j1 == var3 - 1 ? M : B);
               }
            }
         }
      }
   }

   private static boolean N(int var0) {
      return var0 == 15;
   }

   @Override
   protected void N(long var1, long var3, int var5) {
      class00500 class00500x = null;
      int i = this.u(var1);
      int j = u.length;

      for (int k = 0; k < j; k++) {
         class07211 class07211 = u[k];
         if (class05027.N(var3, class07211)) {
            long l = class07209.method_10060(var1, class07211);
            if (this.R.y(class01296.i(l))) {
               int i1 = this.R.i(l);
               if (var5 - 1 > i1) {
                  this.z.N(l);
                  class00500 class00500x = this.y(this.z);
                  int j1 = var5 - this.y(class00500x);
                  if (j1 > i1) {
                     if (class00500x == null) {
                        class00500x = class05027.y(var3) ? class00869.N.W() : this.y(this.z.N(var1));
                     }

                     if (!this.N(class00500x, class00500x, class07211)) {
                        this.R.N(l, j1);
                        if (j1 > 1) {
                           this.L(l, class05027.N(j1, N(class00500x), class07211.b()));
                        }

                        this.N(l, class07211, j1, true, i);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void N(long var1, long var3) {
      int i = this.u(var1);
      int j = class05027.N(var3);
      int k = u.length;

      for (int l = 0; l < k; l++) {
         class07211 class07211 = u[l];
         if (class05027.N(var3, class07211)) {
            long i1 = class07209.method_10060(var1, class07211);
            if (this.R.y(class01296.i(i1))) {
               int j1 = this.R.i(i1);
               if (j1 != 0) {
                  if (j1 <= j - 1) {
                     this.R.N(i1, 0);
                     this.y(i1, class05027.N(j1, class07211.b()));
                     this.N(i1, class07211, j1, false, i);
                  } else {
                     this.L(i1, class05027.y(j1, false, class07211.b()));
                  }
               }
            }
         }
      }
   }
}
