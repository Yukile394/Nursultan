package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableObject;

final class class04863 {
   private final class00751<class05281> y;
   private final int L;
   private final class08088 u;
   private final class01224 i;
   private final List<? super class05236> R;
   private final class06069 M;
   final class03119<class04867> N = new class03119<>();

   class04863(class00751<class05281> var1, int var2, class08088 var3, class01224 var4, List<? super class05236> var5, class06069 var6) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
   }

   void N(class05236 var1, MutableObject<class00494> var2, int var3, boolean var4, class05474 var5, class04084 var6, class03098 var7, class02610 var8) {
      class05248 class05248 = var1.y();
      class07209 class07209xxxx = var1.Z();
      class06993 class06993 = var1.R();
      class05246 class05246x = class05248.M();
      boolean flag = class05246x == class05246.field_16687;
      MutableObject mutableobject = new MutableObject();
      class05163 class05163xx = var1.L();
      int ix = class05163xx.Z();

      label129:
      for (class01203 class01203 : class05248.N(this.i, class07209xxxx, class06993, this.M)) {
         class01228 class01228 = class01203.N();
         class07211 class07211 = class04884.U(class01228.y());
         class07209 class07209x = class01228.N();
         class07209 class07209xx = class07209x.method_10093(class07211);
         int j = class07209x.method_10264() - ix;
         int k = Integer.MIN_VALUE;
         class05946<class05281> class05946 = var7.lookup(class01203.u());
         Optional<class03529<class05281>> optional = this.y.N(class05946);
         if (optional.isEmpty()) {
            class04848.N.warn("Empty or non-existent pool: {}", class05946.N());
         } else {
            class03556<class05281> class03556 = optional.get();
            if (class03556.N().L() == 0 && !class03556.N(class01019.N)) {
               class04848.N.warn("Empty or non-existent pool: {}", class05946.N());
            } else {
               class03556<class05281> class03556x = class03556.N().y();
               if (class03556x.N().L() == 0 && !class03556x.N(class01019.N)) {
                  class04848.N.warn("Empty or non-existent fallback pool: {}", class03556x.i().map(var0 -> var0.N().toString()).orElse("<unregistered>"));
               } else {
                  MutableObject mutableobject1;
                  if (class05163xx.y(class07209xx)) {
                     mutableobject1 = mutableobject;
                     if (mutableobject.get() == null) {
                        mutableobject.setValue(class00389.N(class00734.N(class05163xx)));
                     }
                  } else {
                     mutableobject1 = var2;
                  }

                  ArrayList arraylist = Lists.newArrayList();
                  if (var3 != this.L) {
                     arraylist.addAll(class03556.N().y(this.M));
                  }

                  arraylist.addAll(class03556x.N().y(this.M));
                  int l = class01203.R();

                  for (class05248 class05248x : arraylist) {
                     if (class05248x == class04869.y) {
                        break;
                     }

                     for (class06993 class06993x : class06993.y(this.M)) {
                        List<class01203> list = class05248x.N(this.i, class07209.field_10980, class06993x, this.M);
                        class05163 class05163x = class05248x.N(this.i, class07209.field_10980, class06993x);
                        int i1;
                        if (var4 && class05163x.i() <= 16) {
                           i1 = list.stream().mapToInt(var3x -> {
                              class01228 class01228x = var3x.N();
                              if (!class05163.y(class01228x.N().method_10093(class04884.U(class01228x.y())))) {
                                 return 0;
                              } else {
                                 class05946<class05281> class05946x = var7.lookup(var3x.u());
                                 Optional<class03529<class05281>> optionalx = this.y.N(class05946x);
                                 Optional optional1 = optionalx.map(var0 -> var0.N().y());
                                 int ixx = optionalx.<Integer>map(var1xx -> var1xx.N().N(this.i)).orElse(0);
                                 int jx = optional1.<Integer>map(var1xx -> ((class05281)var1xx.N()).N(this.i)).orElse(0);
                                 return Math.max(ixx, jx);
                              }
                           }).max().orElse(0);
                        } else {
                           i1 = 0;
                        }

                        for (class01203 class01203x : list) {
                           if (class04884.N(class01203, class01203x)) {
                              class07209 class07209xxx = class01203x.N().N();
                              class07209 class07209xxxx = class07209xx.method_10059(class07209xxx);
                              class05163 class05163xx = class05248x.N(this.i, class07209xxxx, class06993x);
                              int j1 = class05163xx.Z();
                              class05246 class05246x = class05248x.M();
                              boolean flag1 = class05246x == class05246.field_16687;
                              int k1 = class07209xxx.method_10264();
                              int l1 = j - k1 + class04884.U(class01228.y()).s();
                              int i2;
                              if (flag && flag1) {
                                 i2 = ix + l1;
                              } else {
                                 if (k == Integer.MIN_VALUE) {
                                    k = this.u.y(class07209x.method_10263(), class07209x.method_10260(), class07830.field_13194, var5, var6);
                                 }

                                 i2 = k - k1;
                              }

                              int j2 = i2 - j1;
                              class05163 class05163xxx = class05163xx.y(0, j2, 0);
                              class07209 class07209xxxxx = class07209xxxx.method_10069(0, j2, 0);
                              if (i1 > 0) {
                                 int k2 = Math.max(i1 + 1, class05163xxx.E() - class05163xxx.Z());
                                 class05163xxx.N(new class07209(class05163xxx.B(), class05163xxx.Z() + k2, class05163xxx.z()));
                              }

                              if (!class00389.L((class00494)mutableobject1.get(), class00389.N(class00734.N(class05163xxx).B(0.25)), class07003.L)) {
                                 mutableobject1.setValue(
                                    class00389.y((class00494)mutableobject1.get(), class00389.N(class00734.N(class05163xxx)), class07003.i)
                                 );
                                 int j3 = var1.z();
                                 int l2;
                                 if (flag1) {
                                    l2 = j3 - l1;
                                 } else {
                                    l2 = class05248x.B();
                                 }

                                 class05236 class05236 = new class05236(this.i, class05248x, class07209xxxxx, l2, class06993x, class05163xxx, var8);
                                 int i3;
                                 if (flag) {
                                    i3 = ix + j;
                                 } else if (flag1) {
                                    i3 = i2 + k1;
                                 } else {
                                    if (k == Integer.MIN_VALUE) {
                                       k = this.u.y(class07209x.method_10263(), class07209x.method_10260(), class07830.field_13194, var5, var6);
                                    }

                                    i3 = k + l1 / 2;
                                 }

                                 var1.N(new class04844(class07209xx.method_10263(), i3 - j + j3, class07209xx.method_10260(), l1, class05246x));
                                 class05236.N(new class04844(class07209x.method_10263(), i3 - k1 + l2, class07209x.method_10260(), -l1, class05246x));
                                 this.R.add(class05236);
                                 if (var3 + 1 <= this.L) {
                                    class04867 class04867 = new class04867(class05236, mutableobject1, var3 + 1);
                                    this.N.N(class04867, l);
                                 }
                                 continue label129;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
