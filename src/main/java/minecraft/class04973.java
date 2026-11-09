package minecraft;

import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class class04973 {
   private static final class01894 L = class01894.y("container/inventory/effect_background");
   private static final class01894 u = class01894.y("container/inventory/effect_background_ambient");
   private static final int i = 18;
   public static final int N = 7;
   private static final int R = 32;
   public static final int y = 32;
   private final class01463<?> M;
   private final class06202 B;

   public class04973(class01463<?> var1) {
      super();
      this.M = var1;
      this.B = class06202.Nq();
   }

   private int N(class01054 var1, class01590 var2, class00392 var3, class00392 var4, int var5, int var6, boolean var7, int var8) {
      int ix = 32 + var2.N(var3) + 7;
      int j = 32 + var2.N(var4) + 7;
      int k = Math.min(var8, Math.max(ix, j));
      var1.N(class08394.Na, var7 ? u : L, var5, var6, k, 32);
      return k;
   }

   private class00392 N(class07055 var1) {
      class05216 class05216 = var1.L().N().M().L();
      if (var1.i() >= 1 && var1.i() <= 9) {
         class05216.y(class05220.l).y(class00392.L("enchantment.level." + (var1.i() + 1)));
      }

      return class05216;
   }

   private void N(class01054 var1, class00392 var2, class00392 var3, class01590 var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int ix = var5 + 32;
      int j = var6 + 7;
      int k = var7 - 32 - 7;
      boolean flag;
      if (k > 0) {
         boolean flag1 = var4.N(var2) > k;
         class01028 class01028 = flag1 ? class02071.N(var2, var4, k) : var2.method_30937();
         var1.y(var4, class01028, ix, j, -1);
         var1.y(var4, var3, ix, j + 9, -8355712);
         flag = flag1;
      } else {
         flag = true;
      }

      if (flag && var9 >= var5 && var9 <= var5 + var7 && var10 >= var6 && var10 <= var6 + var8) {
         var1.N(this.M.method_64506(), List.of(var2, var3), Optional.empty(), var9, var10);
      }
   }

   public boolean N() {
      int ix = this.M.T + this.M.B + 2;
      return this.M.field_22789 - ix >= 32;
   }

   private void N(class01054 var1, Collection<class07055> var2, int var3, int var4, int var5, int var6, int var7) {
      List list = Ordering.natural().sortedCopy(var2);
      int ix = this.M.b;
      class01590 class01590 = this.M.method_64506();

      for (class07055 class07055 : list) {
         boolean flag = class07055.R();
         class00392 class00392x = this.N(class07055);
         class00392 class00392x = class07063.N(class07055, 1.0F, ((class03448)this.B.T_3).method_54719().R());
         int j = this.N(var1, class01590, class00392x, class00392x, var3, ix, flag, var7);
         this.N(var1, class00392x, class00392x, class01590, var3, ix, j, var4, var5, var6);
         var1.N(class08394.Na, class01056.N(class07055.L()), var3 + 7, ix + 7, 18, 18);
         ix += var4;
      }
   }

   public void N(class01054 var1, int var2, int var3) {
      int ix = this.M.T + this.M.B + 2;
      int j = this.M.field_22789 - ix;
      Collection<class07055> collection = ((class04453)this.B.T_4).method_6026();
      if (!collection.isEmpty() && j >= 32) {
         int k = j >= 120 ? j - 7 : 32;
         int l = 33;
         if (collection.size() > 5) {
            l = 132 / (collection.size() - 1);
         }

         this.N(var1, collection, ix, l, var2, var3, k);
      }
   }
}
