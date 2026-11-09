package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public final class class02308 {
   private static final int N = 14;
   private static final int y = 20;
   private static final int L = 15;

   public class02308() {
      super();
   }

   private static boolean N(class02281 var0, class02302 var1) {
      return !var0.i().R() && var1 != class02302.field_48899;
   }

   private static List<class06584> N(class04782 var0, class02281 var1, class07209 var2, class08036 var3, class06584 var4) {
      class05074 class05074 = var0.method_8503().yd().N(var1.y());
      class04162 class04162 = new class04160(var0)
         .N(class06551.B, class06889.y(var2))
         .N(var3.method_7292())
         .N(class06551.N, var3)
         .N(class06551.U, var4)
         .N(class06925.W);
      return class05074.N(class04162);
   }

   private static void N(class04782 var0, class00500 var1, class07209 var2, class02281 var3, class02296 var4, class02274 var5, List<class06584> var6) {
      var4.N(var6);
      var5.N(var4.R());
      var4.y(var0.N() + 14L);
      N(var0, var2, var1, var1.y(class02271.y, class02302.field_48901), var3, var5);
   }

   private static boolean N(class02281 var0, class06584 var1) {
      return class06584.L(var1, var0.i()) && var1.c() >= var0.i().c();
   }

   private static boolean N(long var0, class02302 var2) {
      return var0 % 20L == 0L && var2 == class02302.field_48900;
   }

   private static void N(class04782 var0, class02296 var1, class07209 var2, class04891 var3) {
      if (var0.N() >= var1.N() + 15L) {
         var0.N(null, var2, var3, class04911.field_15245);
         var1.N(var0.N());
      }
   }

   public static void N(class04782 var0, class07209 var1, class00500 var2, class02281 var3, class02296 var4, class02274 var5) {
      class02302 class02302 = var2.L(class02271.y);
      if (N(var0.N(), class02302)) {
         N(var0, class02302, var3, var5, var1);
      }

      class00500 class00500 = var2;
      if (var0.N() >= var4.L()) {
         class00500 = var2.y(class02271.y, class02302.N(var0, var1, var3, var4, var5));
         if (var2 != class00500) {
            N(var0, var1, var2, class00500, var3, var5);
         }
      }

      if (var4.L || var5.L) {
         class02261.y(var0, var1, var2);
         if (var5.L) {
            var0.method_8413(var1, var2, class00500, 2);
         }

         var4.L = false;
         var5.L = false;
      }
   }

   public static void N(class04782 var0, class07209 var1, class00500 var2, class02281 var3, class02296 var4, class02274 var5, class08036 var6, class06584 var7) {
      class02302 class02302 = var2.L(class02271.y);
      if (N(var3, class02302)) {
         if (!N(var3, var7)) {
            N(var0, var4, var1, class04909.gL);
         } else if (var4.N(var6)) {
            N(var0, var4, var1, class04909.Oh);
         } else {
            List<class06584> list = N(var0, var3, var1, var6, var7);
            if (!list.isEmpty()) {
               var6.method_7259(class01235.L.y(var7.B()));
               var7.N(var3.i().c(), (class07438)var6);
               N(var0, var2, var1, var3, var4, var5, list);
               var4.y(var6);
               var5.N(var0, var1, var4, var3, var3.u());
            }
         }
      }
   }

   static void N(class04782 var0, class07209 var1, class00500 var2, class00500 var3, class02281 var4, class02274 var5) {
      class02302 class02302x = var2.L(class02271.y);
      class02302 class02302x = var3.L(class02271.y);
      var0.method_8652(var1, var3, 3);
      class02302x.N(var0, var1, class02302x, var4, var5, var3.L(class02271.u));
   }

   static void N(class04782 var0, class02302 var1, class02281 var2, class02274 var3, class07209 var4) {
      if (!N(var2, var1)) {
         var3.N(class06584.E);
      } else {
         class06584 class06584 = N(var0, var4, var2.R().orElse(var2.y()));
         var3.N(class06584);
      }
   }

   private static class06584 N(class04782 var0, class07209 var1, class05946<class05074> var2) {
      class05074 class05074 = var0.method_8503().yd().N(var2);
      class04162 class04162 = new class04160(var0).N(class06551.B, class06889.y(var1)).N(class06925.W);
      ObjectArrayList<class06584> objectarraylist = class05074.N(class04162, var0.method_8409());
      return objectarraylist.isEmpty() ? class06584.E : class07536.N_77(objectarraylist, var0.method_8409());
   }
}
