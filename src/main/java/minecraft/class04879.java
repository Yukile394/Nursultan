package minecraft;

import Nursultan.class09413;
import Nursultan.class09415;
import org.jspecify.annotations.Nullable;

class class04879 implements class01621, AutoCloseable {
   private final boolean y;
   @Nullable
   private volatile class04846 L;
   @Nullable
   private volatile class07913 u;

   class04879(class04866 var1, boolean var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void close() {
      this.y();
   }

   private class08985 y(class00949 var1) {
      return switch (var1) {
         case class00913 class00913 -> this.N.N(class00913.N()).N(this.y);
         case class09413 class09413 -> this.N.N(class09413);
         case class09415 class09415 -> this.N.i.N(class09415);
         default -> this.N.L.N(this.y);
      };
   }

   public void y() {
      this.L = null;
      this.u = null;
   }

   @Override
   public class08985 N(class00949 var1) {
      class04846 class04846 = this.L;
      if (class04846 != null && var1.equals(class04846.N())) {
         return class04846.y();
      } else {
         class08985 class08985 = this.y(var1);
         this.L = new class04846(var1, class08985);
         return class08985;
      }
   }

   @Override
   public class07913 N() {
      class07913 class07913 = this.u;
      if (class07913 == null) {
         class07913 = this.N.N(class00949.y.N()).N();
         this.u = class07913;
      }

      return class07913;
   }
}
