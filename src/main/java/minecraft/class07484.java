package minecraft;

import java.util.Optional;

class class07484 extends class06937 {
   @Override
   public class01894 L() {
      return class07489.y;
   }

   public class07484(class06695 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public static boolean y(class06584 var0) {
      return var0.N(class06570.ns) || var0.N(class06570.lO) || var0.N(class06570.lJ) || var0.N(class06570.nP);
   }

   @Override
   public int y() {
      return 1;
   }

   @Override
   public boolean N(class06584 var1) {
      return y(var1);
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      Optional<class03556<class06525>> optional = var2.a_(class02484.h, class06517.N).i();
      if (optional.isPresent() && var1 instanceof class04770 class04770) {
         class06912.E.N(class04770, optional.get());
      }

      super.N(var1, var2);
   }
}
