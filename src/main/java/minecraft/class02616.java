package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class class02616 extends class06391<class02256> {
   public class02616(Codec<class02256> var1) {
      super(var1);
   }

   protected boolean N(class05974 var1, class02256 var2, Predicate<class00500> var3, class06069 var4, class07218 var5, int var6) {
      for (int i = 0; i < var6; i++) {
         class00500 class00500x = var2.L.N(var4, var5);
         class00500 class00500x = var1.method_8320(var5);
         if (!class00500x.N(class00500x.i())) {
            if (!var3.test(class00500x)) {
               return i != 0;
            }

            var1.method_8652(var5, class00500x, 2);
            var5.N(var2.i.N());
         }
      }

      return true;
   }

   protected boolean N(class05974 var1, class02256 var2, class08088 var3, class06069 var4, class07209 var5) {
      return var2.u.N().N(var1, var3, var4, var5.method_10093(var2.i.N().b()));
   }

   protected void N(class06058<class02256> var1, class05974 var2, class02256 var3, class06069 var4, Set<class07209> var5, int var6, int var7) {
      for (class07209 class07209 : var5) {
         if (var3.z > 0.0F && var4.z() < var3.z) {
            this.N(var2, var3, var1.L(), var4, class07209);
         }
      }
   }

   protected Set<class07209> N(class05974 var1, class02256 var2, class06069 var3, class07209 var4, Predicate<class00500> var5, int var6, int var7) {
      class07218 class07218x = var4.method_25503();
      class07218 class07218x = class07218x.method_25503();
      class07211 class07211x = var2.i.N();
      class07211 class07211x = class07211x.b();
      HashSet hashset = new HashSet();

      for (int i = -var6; i <= var6; i++) {
         boolean flag = i == -var6 || i == var6;

         for (int j = -var7; j <= var7; j++) {
            boolean flag1 = j == -var7 || j == var7;
            boolean flag2 = flag || flag1;
            boolean flag3 = flag && flag1;
            boolean flag4 = flag2 && !flag3;
            if (!flag3 && (!flag4 || var2.E != 0.0F && !(var3.z() > var2.E))) {
               class07218x.N(var4, i, 0, j);

               for (int k = 0; var1.method_16358(class07218x, class01339::P) && k < var2.Z; k++) {
                  class07218x.N(class07211x);
               }

               for (int i1 = 0; var1.method_16358(class07218x, var0 -> !var0.P()) && i1 < var2.Z; i1++) {
                  class07218x.N(class07211x);
               }

               class07218x.N(class07218x, var2.i.N());
               class00500 class00500 = var1.method_8320(class07218x);
               if (var1.R(class07218x) && class00500.L(var1, class07218x, var2.i.N().b())) {
                  int l = var2.M.N(var3) + (var2.B > 0.0F && var3.z() < var2.B ? 1 : 0);
                  class07209 class07209 = class07218x.method_10062();
                  if (this.N(var1, var2, var5, var3, class07218x, l)) {
                     hashset.add(class07209);
                  }
               }
            }
         }
      }

      return hashset;
   }

   @Override
   public boolean N(class06058<class02256> var1) {
      class05974 class05974 = var1.y();
      class02256 class02256 = (class02256)var1.R();
      class06069 class06069 = var1.u();
      class07209 class07209 = var1.i();
      Predicate predicate = var1x -> var1x.N(class02256.y);
      int i = class02256.U.N(class06069) + 1;
      int j = class02256.U.N(class06069) + 1;
      Set<class07209> set = this.N(class05974, class02256, class06069, class07209, predicate, i, j);
      this.N(var1, class05974, class02256, class06069, set, i, j);
      return !set.isEmpty();
   }
}
