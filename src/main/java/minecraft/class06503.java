package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class class06503 extends class06520 {
   private static final Map<class06581, class02835> N = Map.of(
      class06570.GZ,
      class02835.field_7977,
      class06570.Tr,
      class02835.field_7970,
      class06570.nW,
      class02835.field_7973,
      class06570.Gl,
      class02835.field_7974,
      class06570.Gd,
      class02835.field_7974,
      class06570.GY,
      class02835.field_7974,
      class06570.Gw,
      class02835.field_7974,
      class06570.GQ,
      class02835.field_7974,
      class06570.Gk,
      class02835.field_7974,
      class06570.GO,
      class02835.field_7974
   );
   private static final class06510 y = class06510.method_8101(class06570.TN);
   private static final class06510 L = class06510.method_8101(class06570.vL);
   private static final class06510 u = class06510.method_8101(class06570.bN);

   public class06503(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      class02835 class02835x = class02835.field_7976;
      boolean flag = false;
      boolean flag1 = false;
      IntArrayList intarraylist = new IntArrayList();

      for (int i = 0; i < var1.N(); i++) {
         class06584 class06584x = var1.N(i);
         if (!class06584x.R()) {
            class02835 class02835x = N.get(class06584x.B());
            if (class02835x != null) {
               class02835x = class02835x;
            } else if (L.method_8093(class06584x)) {
               flag = true;
            } else if (y.method_8093(class06584x)) {
               flag1 = true;
            } else if (class06584x.B() instanceof class06559 class06559) {
               intarraylist.add(class06559.N().i());
            }
         }
      }

      class06584 class06584 = new class06584(class06570.Go);
      class06584.N(class02484.Ns, new class02827(class02835x, intarraylist, IntList.of(), flag1, flag));
      return class06584;
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.i() < 2) {
         return false;
      } else {
         boolean flag = false;
         boolean flag1 = false;
         boolean flag2 = false;
         boolean flag3 = false;
         boolean flag4 = false;

         for (int i = 0; i < var1.N(); i++) {
            class06584 class06584 = var1.N(i);
            if (!class06584.R()) {
               if (N.containsKey(class06584.B())) {
                  if (flag2) {
                     return false;
                  }

                  flag2 = true;
               } else if (L.method_8093(class06584)) {
                  if (flag4) {
                     return false;
                  }

                  flag4 = true;
               } else if (y.method_8093(class06584)) {
                  if (flag3) {
                     return false;
                  }

                  flag3 = true;
               } else if (u.method_8093(class06584)) {
                  if (flag) {
                     return false;
                  }

                  flag = true;
               } else {
                  if (!(class06584.B() instanceof class06559)) {
                     return false;
                  }

                  flag1 = true;
               }
            }
         }

         return flag && flag1;
      }
   }

   @Override
   public class06514<class06503> method_8119() {
      return class06514.Z;
   }
}
