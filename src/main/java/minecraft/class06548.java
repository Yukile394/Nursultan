package minecraft;

import Nursultan.class10791;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multisets;
import org.jspecify.annotations.Nullable;

public class class06548 extends class06581 {
   public static final int N = 128;
   public static final int y = 128;

   public class06548(class06573 var1) {
      super(var1);
   }

   @Nullable
   public static class07769 y(class06584 var0, class07299 var1) {
      return N(var0.method_58694(class02484.f), var1);
   }

   private static void y(class06584 var0, class04782 var1) {
      class07769 class07769x = y(var0, (class07299)var1);
      if (class07769x != null) {
         class02265 class02265 = var1.method_17889();
         class07769 class07769x = class07769x.N();
         var1.method_17890(class02265, class07769x);
         var0.N(class02484.f, class02265);
      }
   }

   public static void N(class04782 var0, class06584 var1) {
      class07769 class07769 = y(var1, (class07299)var0);
      if (class07769 != null) {
         if (var0.method_27983() == class07769.R) {
            int i = 1 << class07769.M;
            int j = class07769.u;
            int k = class07769.i;
            boolean[] aboolean = new boolean[16384];
            int l = j / i - 64;
            int i1 = k / i - 64;
            class07218 class07218 = new class07218();

            for (int j1 = 0; j1 < 128; j1++) {
               for (int k1 = 0; k1 < 128; k1++) {
                  class03556<class00780> class03556 = var0.i(class07218.N((l + k1) * i, 0, (i1 + j1) * i));
                  aboolean[j1 * 128 + k1] = class03556.N(class03557.r);
               }
            }

            for (int j2 = 1; j2 < 127; j2++) {
               for (int k2 = 1; k2 < 127; k2++) {
                  int l2 = 0;

                  for (int l1 = -1; l1 < 2; l1++) {
                     for (int i2 = -1; i2 < 2; i2++) {
                        if ((l1 != 0 || i2 != 0) && N(aboolean, j2 + l1, k2 + i2)) {
                           l2++;
                        }
                     }
                  }

                  class04659 class04659 = class04659.field_34762;
                  class04689 class04689 = class04689.N;
                  if (N(aboolean, j2, k2)) {
                     class04689 = class04689.s;
                     if (l2 > 7 && k2 % 2 == 0) {
                        switch ((j2 + (int)(class04995.m(k2 + 0.0F) * 7.0F)) / 8 % 5) {
                           case 0:
                           case 4:
                              class04659 = class04659.field_34759;
                              break;
                           case 1:
                           case 3:
                              class04659 = class04659.field_34760;
                              break;
                           case 2:
                              class04659 = class04659.field_34761;
                        }
                     } else if (l2 > 7) {
                        class04689 = class04689.N;
                     } else if (l2 > 5) {
                        class04659 = class04659.field_34760;
                     } else if (l2 > 3) {
                        class04659 = class04659.field_34759;
                     } else if (l2 > 1) {
                        class04659 = class04659.field_34759;
                     }
                  } else if (l2 > 0) {
                     class04689 = class04689.k;
                     if (l2 > 3) {
                        class04659 = class04659.field_34760;
                     } else {
                        class04659 = class04659.field_34762;
                     }
                  }

                  if (class04689 != class04689.N) {
                     class07769.y(j2, k2, class04689.y(class04659));
                  }
               }
            }
         }
      }
   }

   @Override
   public void N(class06584 var1, class04782 var2, class07049 var3, @Nullable class07085 var4) {
      class07769 class07769 = y(var1, (class07299)var2);
      if (class07769 != null) {
         if (var3 instanceof class08036 class08036) {
            class07769.N(class08036, var1);
         }

         if (!class07769.Z && var4 != null && var4.N() == class07043.field_6177) {
            this.N(var2, var3, class07769);
         }
      }
   }

   @Override
   public void N(class06584 var1, class07299 var2) {
      class02705 class02705 = var1.y(class02484.S);
      if (class02705 != null) {
         if (var2 instanceof class04782 class04782) {
            switch (class02705) {
               case field_49353:
                  y(var1, class04782);
                  break;
               case field_49354:
                  N(var1, class04782);
            }
         }
      }
   }

   private static void N(class06584 var0, class04782 var1) {
      class07769 class07769 = y(var0, (class07299)var1);
      if (class07769 != null) {
         class02265 class02265 = var1.method_17889();
         var1.method_17890(class02265, class07769.y());
         var0.N(class02484.f, class02265);
      }
   }

   @Override
   public class07082 N(class06501 var1) {
      if (var1.method_8045().method_8320(var1.method_8037()).N(class01210.NG)) {
         if (!var1.method_8045().method_8608()) {
            class07769 class07769 = y(var1.method_8041(), var1.method_8045());
            if (class07769 != null && !class07769.N(var1.method_8045(), var1.method_8037())) {
               return class07082.u;
            }
         }

         return class07082.N;
      } else {
         return super.N(var1);
      }
   }

   public static class06584 N(class04782 var0, int var1, int var2, byte var3, boolean var4, boolean var5) {
      class06584 class06584 = new class06584(class06570.vh);
      class02265 class02265 = N(var0, var1, var2, var3, var4, var5, var0.method_27983());
      class06584.N(class02484.f, class02265);
      return class06584;
   }

   @Nullable
   public static class07769 N(@Nullable class02265 var0, class07299 var1) {
      return var0 == null ? null : var1.method_17891(var0);
   }

   private static class02265 N(class04782 var0, int var1, int var2, int var3, boolean var4, boolean var5, class05946<class07299> var6) {
      class07769 class07769 = class07769.N(var1, var2, (byte)var3, var4, var5, var6);
      class02265 class02265 = var0.method_17889();
      var0.method_17890(class02265, class07769);
      return class02265;
   }

   public void N(class07299 var1, class07049 var2, class07769 var3) {
      if (var1.method_27983() == var3.R && var2 instanceof class08036) {
         int i = 1 << var3.M;
         int j = var3.u;
         int k = var3.i;
         int l = class04995.N(var2.method_23317() - j) / i + 64;
         int i1 = class04995.N(var2.method_23321() - k) / i + 64;
         int j1 = 128 / i;
         if (var1.method_8597().R()) {
            j1 /= 2;
         }

         class10791 class10791 = var3.N((class08036)var2);
         class10791.y++;
         class07218 class07218 = new class07218();
         class07218 class07218x = new class07218();
         boolean flag = false;

         for (int k1 = l - j1 + 1; k1 < l + j1; k1++) {
            if ((k1 & 15) == (class10791.y & 15) || flag) {
               flag = false;
               double d0 = 0.0;

               for (int l1 = i1 - j1 - 1; l1 < i1 + j1; l1++) {
                  if (k1 >= 0 && l1 >= -1 && k1 < 128 && l1 < 128) {
                     int i2 = class04995.Z(k1 - l) + class04995.Z(l1 - i1);
                     boolean flag1 = i2 > (j1 - 2) * (j1 - 2);
                     int j2 = (j / i + k1 - 64) * i;
                     int k2 = (k / i + l1 - 64) * i;
                     LinkedHashMultiset linkedhashmultiset = LinkedHashMultiset.create();
                     class00570 class00570 = var1.method_8497(class01296.N(j2), class01296.N(k2));
                     if (!class00570.O()) {
                        int l2 = 0;
                        double d1 = 0.0;
                        if (var1.method_8597().R()) {
                           int i3 = j2 + k2 * 231871;
                           i3 = i3 * i3 * 31287121 + i3 * 11;
                           if ((i3 >> 20 & 1) == 0) {
                              linkedhashmultiset.add(class00869.z.W().N((class07290)var1, class07209.field_10980), 10);
                           } else {
                              linkedhashmultiset.add(class00869.y.W().N((class07290)var1, class07209.field_10980), 100);
                           }

                           d1 = 100.0;
                        } else {
                           for (int i4 = 0; i4 < i; i4++) {
                              for (int j3 = 0; j3 < i; j3++) {
                                 class07218.N(j2 + i4, 0, k2 + j3);
                                 int k3 = class00570.N(class07830.field_13202, class07218.method_10263(), class07218.method_10260()) + 1;
                                 class00500 class00500x;
                                 if (k3 <= var1.method_31607()) {
                                    class00500x = class00869.q.W();
                                 } else {
                                    do {
                                       class07218.method_10099(--k3);
                                       class00500x = class00570.method_8320(class07218);
                                    } while (class00500x.N(var1, class07218) == class04689.N && k3 > var1.method_31607());

                                    if (k3 > var1.method_31607() && !class00500x.Y().W()) {
                                       int l3 = k3 - 1;
                                       class07218x.N(class07218);

                                       class00500 class00500x;
                                       do {
                                          class07218x.method_10099(l3--);
                                          class00500x = class00570.method_8320(class07218x);
                                          l2++;
                                       } while (l3 > var1.method_31607() && !class00500x.Y().W());

                                       class00500x = this.N(var1, class00500x, class07218);
                                    }
                                 }

                                 var3.N(var1, class07218.method_10263(), class07218.method_10260());
                                 d1 += (double)k3 / (i * i);
                                 linkedhashmultiset.add(class00500x.N(var1, class07218));
                              }
                           }
                        }

                        l2 /= i * i;
                        class04689 class04689 = (class04689)Iterables.getFirst(Multisets.copyHighestCountFirst(linkedhashmultiset), class04689.N);
                        class04659 class04659;
                        if (class04689 == class04689.W) {
                           double d2 = l2 * 0.1 + (k1 + l1 & 1) * 0.2;
                           if (d2 < 0.5) {
                              class04659 = class04659.field_34761;
                           } else if (d2 > 0.9) {
                              class04659 = class04659.field_34759;
                           } else {
                              class04659 = class04659.field_34760;
                           }
                        } else {
                           double d3 = (d1 - d0) * 4.0 / (i + 4) + ((k1 + l1 & 1) - 0.5) * 0.4;
                           if (d3 > 0.6) {
                              class04659 = class04659.field_34761;
                           } else if (d3 < -0.6) {
                              class04659 = class04659.field_34759;
                           } else {
                              class04659 = class04659.field_34760;
                           }
                        }

                        d0 = d1;
                        if (l1 >= 0 && i2 < j1 * j1 && (!flag1 || (k1 + l1 & 1) != 0)) {
                           flag |= var3.N(k1, l1, class04689.y(class04659));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private class00500 N(class07299 var1, class00500 var2, class07209 var3) {
      class04688 class04688 = var2.Y();
      return !class04688.W() && !var2.L(var1, var3, class07211.field_11036) ? class04688.B() : var2;
   }

   private static boolean N(boolean[] var0, int var1, int var2) {
      return var0[var2 * 128 + var1];
   }
}
