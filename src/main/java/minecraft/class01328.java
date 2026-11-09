package minecraft;

import org.jspecify.annotations.Nullable;

public class class01328 {
   public static final class01328 N = N();
   private static final double y = 2.0;
   private final boolean L;
   private double u = -1.0;
   private boolean i = true;
   private boolean R = true;
   @Nullable
   private class01317 M;

   public class01328 L() {
      class01328 class01328 = this.L ? N() : y();
      class01328.u = this.u;
      class01328.i = this.i;
      class01328.R = this.R;
      class01328.M = this.M;
      return class01328;
   }

   private class01328(boolean var1) {
      super();
      this.L = var1;
   }

   public class01328 i() {
      this.R = false;
      return this;
   }

   public class01328 u() {
      this.i = false;
      return this;
   }

   public static class01328 y() {
      return new class01328(false);
   }

   public static class01328 N() {
      return new class01328(true);
   }

   public boolean N(class04782 var1, @Nullable class07438 var2, class07438 var3) {
      if (var2 == var3) {
         return false;
      } else if (!var3.method_36608()) {
         return false;
      } else if (this.M != null && !this.M.method_18303(var3, var1)) {
         return false;
      } else {
         if (var2 == null) {
            if (this.L && (!var3.method_33190() || var1.y() == class07086.field_5801)) {
               return false;
            }
         } else {
            if (this.L && (!var2.method_18395(var3) || !var2.method_5973(var3.method_5864()) || var2.method_5722(var3))) {
               return false;
            }

            if (this.u > 0.0) {
               double d0 = this.R ? var3.method_18390(var2) : 1.0;
               double d1 = Math.max(this.u * d0, 2.0);
               if (var2.method_5649(var3.method_23317(), var3.method_23318(), var3.method_23321()) > d1 * d1) {
                  return false;
               }
            }

            if (this.i && var2 instanceof class07079 class07079 && !class07079.C().N(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   public class01328 N(@Nullable class01317 var1) {
      this.M = var1;
      return this;
   }

   public class01328 N(double var1) {
      this.u = var1;
      return this;
   }
}
