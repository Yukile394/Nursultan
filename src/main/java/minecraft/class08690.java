package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class08690 implements class05857 {
   final String N;
   final class03762 y;
   final class06510 L;
   final class06510 u;
   final class08604 i;
   @Nullable
   private class02754 Z;

   public class08690(String var1, class03762 var2, class06510 var3, class06510 var4, class08604 var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   @Override
   public String y() {
      return this.N;
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      for (int ix = 0; ix < var1.N(); ix++) {
         class06584 class06584 = var1.N(ix);
         if (!class06584.R() && this.L.method_8093(class06584)) {
            return this.i.N(class06584);
         }
      }

      return class06584.E;
   }

   @Override
   public List<class00265> N() {
      return List.of(new class00315(List.of(this.L.method_64673(), this.u.method_64673()), this.i.N(), new class00330(class06570.Rn)));
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.i() != 2) {
         return false;
      } else {
         boolean flag = false;
         boolean flag1 = false;

         for (int ix = 0; ix < var1.N(); ix++) {
            class06584 class06584 = var1.N(ix);
            if (!class06584.R()) {
               if (!flag && this.L.method_8093(class06584)) {
                  if (this.i.y(class06584)) {
                     return false;
                  }

                  flag = true;
               } else {
                  if (flag1 || !this.u.method_8093(class06584)) {
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
   public class06514<class08690> method_8119() {
      return class06514.m;
   }

   @Override
   public class02754 method_61671() {
      if (this.Z == null) {
         this.Z = class02754.y(List.of(this.L, this.u));
      }

      return this.Z;
   }

   @Override
   public class03762 method_45441() {
      return this.y;
   }
}
