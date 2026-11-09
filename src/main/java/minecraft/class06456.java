package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

abstract class class06456 extends class04890 {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   protected class04890 L(class06461 var1, class03860 var2, class06069 var3, int var4, int var5, boolean var6) {
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
               return this.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11034, this.u(), var6);
            case field_11035:
               return this.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11034, this.u(), var6);
            case field_11039:
               return this.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.W() + 1, class07211.field_11035, this.u(), var6);
            case field_11034:
               return this.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.W() + 1, class07211.field_11035, this.u(), var6);
         }
      }

      return null;
   }

   protected class06456(class04878 var1, int var2, class05163 var3) {
      super(var1, var2, var3);
   }

   public class06456(class04878 var1, class07001 var2) {
      super(var1, var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   protected class04890 y(class06461 var1, class03860 var2, class06069 var3, int var4, int var5, boolean var6) {
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
               return this.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11039, this.u(), var6);
            case field_11035:
               return this.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var4, this.k.z() + var5, class07211.field_11039, this.u(), var6);
            case field_11039:
               return this.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.z() - 1, class07211.field_11043, this.u(), var6);
            case field_11034:
               return this.N(var1, var2, var3, this.k.B() + var5, this.k.Z() + var4, this.k.z() - 1, class07211.field_11043, this.u(), var6);
         }
      }

      return null;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   protected class04890 N(class06461 var1, class03860 var2, class06069 var3, int var4, int var5, boolean var6) {
      class07211 class07211 = this.i();
      if (class07211 != null) {
         switch (class07211) {
            case field_11043:
               return this.N(var1, var2, var3, this.k.B() + var4, this.k.Z() + var5, this.k.z() - 1, class07211, this.u(), var6);
            case field_11035:
               return this.N(var1, var2, var3, this.k.B() + var4, this.k.Z() + var5, this.k.W() + 1, class07211, this.u(), var6);
            case field_11039:
               return this.N(var1, var2, var3, this.k.B() - 1, this.k.Z() + var5, this.k.z() + var4, class07211, this.u(), var6);
            case field_11034:
               return this.N(var1, var2, var3, this.k.U() + 1, this.k.Z() + var5, this.k.z() + var4, class07211, this.u(), var6);
         }
      }

      return null;
   }

   protected static boolean N(class05163 var0) {
      return var0.Z() > 10;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
   }

   private int N(List<class06471> var1) {
      boolean flag = false;
      int i = 0;

      for (class06471 class06471 : var1) {
         if (class06471.u > 0 && class06471.L < class06471.u) {
            flag = true;
         }

         i += class06471.y;
      }

      return flag ? i : -1;
   }

   @Nullable
   private class06456 N(class06461 var1, List<class06471> var2, class03860 var3, class06069 var4, int var5, int var6, int var7, class07211 var8, int var9) {
      int i = this.N(var2);
      boolean flag = i > 0 && var9 <= 30;
      int j = 0;

      while (j < 5 && flag) {
         j++;
         int k = var4.y(i);

         for (class06471 class06471 : var2) {
            k -= class06471.y;
            if (k < 0) {
               if (!class06471.N(var9) || class06471 == var1.N && !class06471.i) {
                  break;
               }

               class06456 class06456 = class06454.N(class06471, var3, var4, var5, var6, var7, var8, var9);
               if (class06456 != null) {
                  class06471.L++;
                  var1.N = class06471;
                  if (!class06471.N()) {
                     var2.remove(class06471);
                  }

                  return class06456;
               }
            }
         }
      }

      return class06462.N(var3, var4, var5, var6, var7, var8, var9);
   }

   @Nullable
   private class04890 N(class06461 var1, class03860 var2, class06069 var3, int var4, int var5, int var6, class07211 var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.L().B()) <= 112 && Math.abs(var6 - var1.L().z()) <= 112) {
         List<class06471> list = var1.y;
         if (var9) {
            list = var1.L;
         }

         class06456 class06456 = this.N(var1, list, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (class06456 != null) {
            var2.N(class06456);
            var1.u.add(class06456);
         }

         return class06456;
      } else {
         return class06462.N(var2, var3, var4, var5, var6, var7, var8);
      }
   }
}
