package minecraft;

import java.util.Iterator;
import org.jspecify.annotations.Nullable;

class class06136 extends class07952<class07438> {
   @Nullable
   private class07438 z;
   @Nullable
   private class07438 U;
   private int E;

   @Override
   public void L() {
      this.N(this.z);
      this.L = this.z;
      if (this.U != null) {
         this.E = this.U.method_6117();
      }

      this.Z.method_5783(class04909.Uf, 1.0F, 1.0F);
      this.Z.B(true);
      this.Z.w();
      super.L();
   }

   public class06136(Class<class07438> var1, boolean var2, boolean var3, @Nullable class01317 var4, class01317 var5) {
      super(var1, var2, 10, var3, var4, var5);
      this.Z = var1;
   }

   @Override
   public boolean N() {
      if (this.y > 0 && this.i.method_59922().y(this.y) != 0) {
         return false;
      } else {
         class04782 class04782 = N_18(this.Z.method_73183());
         Iterator<class08372<class07438>> iterator = this.Z.m().toList().iterator();

         while (iterator.hasNext()) {
            class07438 class07438 = iterator.next().N(class04782, class07438.class);
            if (class07438 != null) {
               this.U = class07438;
               this.z = class07438.method_6065();
               return class07438.method_6117() != this.E && this.N(this.z, this.u);
            }
         }

         return false;
      }
   }
}
