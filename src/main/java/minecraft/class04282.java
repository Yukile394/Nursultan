package minecraft;

import Nursultan.class09561;
import java.time.Duration;
import org.jspecify.annotations.Nullable;

public class class04282 {
   @Nullable
   private class04141 N;
   private Duration y = Duration.ZERO;
   private long L;
   private boolean u;

   public class04282() {
      super();
   }

   public void N(class01054 var1, int var2, int var3, boolean var4, boolean var5, class03255 var6) {
      if (this.N == null) {
         this.u = false;
      } else {
         class06202 class06202 = class06202.Nq();
         boolean flag = var4 || var5 && class06202.Nc().y();
         if (flag != this.u) {
            if (flag) {
               this.L = class07536.L();
            }

            this.u = flag;
         }

         if (flag && class07536.L() - this.L > this.y.toMillis()) {
            var1.N((class01590)class06202.i_3, this.N.N(class06202), this.N(var6, var4, var5), var2, var3, var5);
         }
      }
   }

   private class02112 N(class03255 var1, boolean var2, boolean var3) {
      return (class02112)(!var2 && var3 && class06202.Nq().Nc().y() ? new class09561(var1) : new class03673(var1));
   }

   public void N(class03428 var1) {
      if (this.N != null) {
         this.N.method_37020(var1);
      }
   }

   @Nullable
   public class04141 N() {
      return this.N;
   }

   public void N(@Nullable class04141 var1) {
      this.N = var1;
   }

   public void N(Duration var1) {
      this.y = var1;
   }
}
