package minecraft;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05299 implements class01294, class04654 {
   private static final class01894 L = class01894.y("recipe_book/overlay_recipe");
   private static final int u = 4;
   private static final int i = 5;
   private static final float R = 0.375F;
   public static final int N = 25;
   private final List<class05328> M = Lists.newArrayList();
   private boolean B;
   private int Z;
   private int z;
   private class05287 U = class05287.N;
   @Nullable
   private class00329 E;
   final class02422 y;
   private final boolean W;

   public boolean L() {
      return this.B;
   }

   public class05299(class02422 var1, boolean var2) {
      super();
      this.y = var1;
      this.W = var2;
   }

   @Nullable
   public class00329 y() {
      return this.E;
   }

   public class05287 N() {
      return this.U;
   }

   public void N(boolean var1) {
      this.B = var1;
   }

   public void N(class05287 var1, class00311 var2, boolean var3, int var4, int var5, int var6, int var7, float var8) {
      this.U = var1;
      List<class00295> list = var1.N(class05317.field_52848);
      List<class00295> list1 = var3 ? Collections.emptyList() : var1.N(class05317.field_52849);
      int ix = list.size();
      int j = ix + list1.size();
      int k = j <= 16 ? 4 : 5;
      int l = (int)Math.ceil((float)j / k);
      this.Z = var4;
      this.z = var5;
      float f = this.Z + Math.min(j, k) * 25;
      float f1 = var6 + 50;
      if (f > f1) {
         this.Z = (int)(this.Z - var8 * (int)((f - f1) / var8));
      }

      float f2 = this.z + l * 25;
      float f3 = var7 + 50;
      if (f2 > f3) {
         this.z = (int)(this.z - var8 * class04995.u((f2 - f3) / var8));
      }

      float f4 = this.z;
      float f5 = var7 - 100;
      if (f4 < f5) {
         this.z = (int)(this.z - var8 * class04995.u((f4 - f5) / var8));
      }

      this.B = true;
      this.M.clear();

      for (int i1 = 0; i1 < j; i1++) {
         boolean flag = i1 < ix;
         class00295 class00295 = flag ? list.get(i1) : list1.get(i1 - ix);
         int j1 = this.Z + 4 + 25 * (i1 % k);
         int k1 = this.z + 5 + 25 * (i1 / k);
         if (this.W) {
            this.M.add(new class05311(this, j1, k1, class00295.N(), class00295.y(), var2, flag));
         } else {
            this.M.add(new class05319(this, j1, k1, class00295.N(), class00295.y(), var2, flag));
         }
      }

      this.E = null;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (this.B) {
         int ix = this.M.size() <= 16 ? 4 : 5;
         int j = Math.min(this.M.size(), ix);
         int k = class04995.u((float)this.M.size() / ix);
         byte b0 = 4;
         var1.N(class08394.Na, L, this.Z, this.z, j * 25 + 8, k * 25 + 8);
         Iterator<class05328> iterator = this.M.iterator();

         while (iterator.hasNext()) {
            iterator.next().method_25394(var1, var2, var3, var4);
         }
      }
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return false;
   }

   @Override
   public void method_25365(boolean var1) {
   }

   @Override
   public boolean method_25370() {
      return false;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (var1.v() != 0) {
         return false;
      } else {
         for (class05328 class05328 : this.M) {
            if (class05328.method_25402(var1, var2)) {
               this.E = class05328.N;
               return true;
            }
         }

         return false;
      }
   }
}
