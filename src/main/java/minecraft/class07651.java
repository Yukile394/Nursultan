package minecraft;

import org.jspecify.annotations.Nullable;

public class class07651 extends class07655 {
   @Nullable
   private class07209 N;

   public class07651(class07079 var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public void N() {
      if (!this.U()) {
         super.N();
      } else {
         if (this.N != null) {
            if (!this.N.method_19769(this.y.method_73189(), this.y.method_17681())
               && (
                  !(this.y.method_23318() > this.N.method_10264())
                     || !class07209.method_49637(this.N.method_10263(), this.y.method_23318(), this.N.method_10260())
                        .method_19769(this.y.method_73189(), this.y.method_17681())
               )) {
               this.y.F().N(this.N.method_10263(), this.N.method_10264(), this.N.method_10260(), this.i);
            } else {
               this.N = null;
            }
         }
      }
   }

   @Override
   public boolean N(class07049 var1, double var2) {
      class00143 class00143 = this.N(var1, 0);
      if (class00143 != null) {
         return this.N(class00143, var2);
      } else {
         this.N = var1.method_24515();
         this.i = var2;
         return true;
      }
   }

   @Override
   public class00143 N(class07049 var1, int var2) {
      this.N = var1.method_24515();
      return super.N(var1, var2);
   }

   @Override
   public class00143 N(class07209 var1, int var2) {
      this.N = var1;
      return super.N(var1, var2);
   }
}
