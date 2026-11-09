package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class06184 implements class06521<class02904> {
   private final class06510 N;
   private final class06584 y;
   private final String L;
   @Nullable
   private class02754 u;

   public class06184(String var1, class06510 var2, class06584 var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   protected class06584 U() {
      return this.y;
   }

   public class06510 z() {
      return this.N;
   }

   @Override
   public abstract class05838<? extends class06184> u();

   @Override
   public String y() {
      return this.L;
   }

   public class06584 method_8116(class02904 var1, class01929 var2) {
      return this.y.t();
   }

   public boolean method_8115(class02904 var1, class07299 var2) {
      return this.N.method_8093(var1.L());
   }

   @Override
   public abstract class06514<? extends class06184> method_8119();

   @Override
   public class02754 method_61671() {
      if (this.u == null) {
         this.u = class02754.N(this.N);
      }

      return this.u;
   }
}
