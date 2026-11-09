package minecraft;

import org.jspecify.annotations.Nullable;

public class class02224 {
   private final class02234 N;
   private class07209 y;
   private int L;
   private boolean u;

   public class07209 L() {
      return this.y;
   }

   public class02224(class02234 var1, class07209 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.u = true;
   }

   public boolean i() {
      return this.u;
   }

   public int u() {
      return this.L;
   }

   public boolean y() {
      return this.L <= 0;
   }

   public void N(class07209 var1) {
      this.y = var1;
   }

   public boolean N(class02234 var1) {
      return this.N == var1;
   }

   public void N(boolean var1) {
      this.u = var1;
   }

   @Nullable
   public class01032 N(class04782 var1, class07049 var2) {
      return this.N.N(var1, var2, this.y);
   }

   public class02244 N() {
      return this.N.y();
   }

   public boolean N(class04782 var1, class07049 var2, boolean var3) {
      if (!this.u) {
         this.R();
         return false;
      } else {
         this.u = false;
         return var3 && this.L++ >= this.N.N(var1, var2);
      }
   }

   private void R() {
      this.L = Math.max(this.L - 4, 0);
   }
}
