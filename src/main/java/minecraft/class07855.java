package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

public enum class07855 {
   field_13097("START", 0) {
      @Override
      public void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5) {
         class07209 class07209 = new class07209(0, 128, 0);
         Iterator iterator = var3.iterator();

         while (iterator.hasNext()) {
            ((class00676)iterator.next()).N(class07209);
         }

         var2.N(field_13095);
      }
   },
   field_13095("PREPARING_TO_SUMMON_PILLARS", 1) {
      @Override
      public void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5) {
         if (var4 < 100) {
            if (var4 == 0 || var4 == 50 || var4 == 51 || var4 == 52 || var4 >= 95) {
               var1.N(3001, new class07209(0, 128, 0), 0);
            }
         } else {
            var2.N(field_13094);
         }
      }
   },
   field_13094("SUMMONING_PILLARS", 2) {
      @Override
      public void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5) {
         byte b0 = 40;
         boolean flag = var4 % 40 == 0;
         boolean flag1 = var4 % 40 == 39;
         if (flag || flag1) {
            List<class01076> list = class01058.N(var1);
            int i = var4 / 40;
            if (i < list.size()) {
               class01076 class01076 = list.get(i);
               if (flag) {
                  for (class00676 var13 : var3) {
                     var13.N(new class07209(class01076.N(), class01076.u() + 1, class01076.y()));
                  }
               } else {
                  byte b1 = 10;

                  for (class07209 class07209 : class07209.method_10097(
                     new class07209(class01076.N() - 10, class01076.u() - 10, class01076.y() - 10),
                     new class07209(class01076.N() + 10, class01076.u() + 10, class01076.y() + 10)
                  )) {
                     var1.method_8650(class07209, false);
                  }

                  var1.method_8437(null, class01076.N() + 0.5F, class01076.u(), class01076.y() + 0.5F, 5.0F, class07328.field_40889);
                  class04685 class04685 = new class04685(true, ImmutableList.of(class01076), new class07209(0, 128, 0));
                  class06391.o.N(class04685, var1, var1.method_14178().U(), class06069.u(), new class07209(class01076.N(), 45, class01076.y()));
               }
            } else if (flag) {
               var2.N(field_13098);
            }
         }
      }
   },
   field_13098("SUMMONING_DRAGON", 3) {
      @Override
      public void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5) {
         if (var4 >= 100) {
            var2.N(field_13099);
            var2.B();

            for (class00676 class00676x : var3) {
               class00676x.N(null);
               var1.method_8437(class00676x, class00676x.method_23317(), class00676x.method_23318(), class00676x.method_23321(), 6.0F, class07328.field_40888);
               class00676x.method_31472();
            }
         } else if (var4 >= 80) {
            var1.N(3001, new class07209(0, 128, 0), 0);
         } else if (var4 == 0) {
            for (class00676 class00676 : var3) {
               class00676.N(new class07209(0, 128, 0));
            }
         } else if (var4 < 5) {
            var1.N(3001, new class07209(0, 128, 0), 0);
         }
      }
   },
   field_13099("END", 4) {
      @Override
      public void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5) {
      }
   };

   class07855() {
   }

   public abstract void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5);
}
