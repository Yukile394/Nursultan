package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface class00281 extends class07309 {
   default <T extends class07438> List<T> N(Class<T> var1, class01328 var2, class07438 var3, class00734 var4) {
      List list = this.N(var1, var4, var0 -> true);
      ArrayList arraylist = new ArrayList();

      for (class07438 class07438 : list) {
         if (var2.N(this.method_8410(), var3, class07438)) {
            arraylist.add(class07438);
         }
      }

      return arraylist;
   }

   default List<class08036> N(class01328 var1, class07438 var2, class00734 var3) {
      ArrayList arraylist = new ArrayList();

      for (class08036 class08036 : this.method_18456()) {
         if (var3.i(class08036.method_23317(), class08036.method_23318(), class08036.method_23321()) && var1.N(this.method_8410(), var2, class08036)) {
            arraylist.add(class08036);
         }
      }

      return arraylist;
   }

   @Nullable
   default <T extends class07438> T N(List<? extends T> var1, class01328 var2, @Nullable class07438 var3, double var4, double var6, double var8) {
      double d0 = -1.0;
      class07438 class07438x = null;

      for (class07438 class07438x : var1) {
         if (var2.N(this.method_8410(), var3, class07438x)) {
            double d1 = class07438x.method_5649(var4, var6, var8);
            if (d0 == -1.0 || d1 < d0) {
               d0 = d1;
               class07438x = class07438x;
            }
         }
      }

      return (T)class07438x;
   }

   @Nullable
   default class08036 N(class01328 var1, class07438 var2) {
      return this.N(this.method_18456(), var1, var2, var2.method_23317(), var2.method_23318(), var2.method_23321());
   }

   @Nullable
   default class08036 N(class01328 var1, class07438 var2, double var3, double var5, double var7) {
      return this.N(this.method_18456(), var1, var2, var3, var5, var7);
   }

   @Nullable
   default class08036 N(class01328 var1, double var2, double var4, double var6) {
      return this.N(this.method_18456(), var1, null, var2, var4, var6);
   }

   @Nullable
   default <T extends class07438> T N(
      Class<? extends T> var1, class01328 var2, @Nullable class07438 var3, double var4, double var6, double var8, class00734 var10
   ) {
      return this.N(this.N(var1, var10, var0 -> true), var2, var3, var4, var6, var8);
   }

   @Nullable
   default class07438 N(class03530<class07078<?>> var1, class01328 var2, @Nullable class07438 var3, double var4, double var6, double var8, class00734 var10) {
      double d0 = Double.MAX_VALUE;
      class07438 class07438x = null;

      for (class07438 class07438x : this.N(class07438.class, var10, var1x -> var1x.method_5864().N(var1))) {
         if (var2.N(this.method_8410(), var3, class07438x)) {
            double d1 = class07438x.method_5649(var4, var6, var8);
            if (d1 < d0) {
               d0 = d1;
               class07438x = class07438x;
            }
         }
      }

      return class07438x;
   }

   class04782 method_8410();
}
