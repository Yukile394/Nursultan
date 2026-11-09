package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class08538 implements class02325 {
   private class08516[] N = new class08516[256];
   private final class02346 y;
   private final class02332 L = new class02332();
   private class08506[] u = new class08506[16];
   private int i;
   private final class08508 R = new class08508(this);

   @Override
   public class02328 L() {
      int ix = this.u.length;
      if (this.i >= ix) {
         int j = class07536.N(ix, this.i + 1);
         class08506[] aclass08506 = new class08506[j];
         System.arraycopy(this.u, 0, aclass08506, 0, ix);
         this.u = aclass08506;
      }

      int k = this.i++;
      class08506 class08506 = this.u[k];
      if (class08506 == null) {
         class08506 = new class08506();
         this.u[k] = class08506;
      } else {
         class08506.L();
      }

      return class08506;
   }

   protected class08538(class02346 var1) {
      super();
      this.y = var1;
   }

   @Override
   public class02325 i() {
      return this.R;
   }

   @Override
   public void u() {
      this.i--;
   }

   private class08516 y(int var1) {
      int ix = this.N.length;
      if (var1 >= ix) {
         int j = class07536.N(ix, var1 + 1);
         class08516[] aclass08516 = new class08516[j];
         System.arraycopy(this.N, 0, aclass08516, 0, ix);
         this.N = aclass08516;
      }

      class08516 class08516 = this.N[var1];
      if (class08516 == null) {
         class08516 = new class08516();
         this.N[var1] = class08516;
      }

      return class08516;
   }

   @Override
   public class02346 y() {
      return this.y;
   }

   @Nullable
   @Override
   public Object N(class08501 var1) {
      int ix = this.M();
      class08516 class08516 = this.y(ix);
      int j = class08516.N(var1.N());
      if (j != -1) {
         class08527 class08527x = class08516.N(j);
         if (class08527x != null) {
            if (class08527x == class08527.L) {
               return null;
            }

            this.N(class08527x.L());
            return class08527x.y();
         }
      } else {
         j = class08516.y(var1.N());
      }

      Object object = var1.y().y(this);
      class08527 class08527;
      if (object == null) {
         class08527 = class08527.N();
      } else {
         int k = this.M();
         class08527 = new class08527<>(object, k);
      }

      class08516.N(j, class08527);
      return object;
   }

   @Override
   public class02332 N() {
      return this.L;
   }
}
