package minecraft;

import java.util.concurrent.Executor;
import org.jspecify.annotations.Nullable;

class class06234 extends class04778 {
   protected class06234(class06265 var1, class08593 var2, Executor var3, Executor var4) {
      super(var2, var3, var4);
      this.B = var1;
   }

   @Nullable
   @Override
   protected class04745 y(long var1) {
      return this.B.N(var1);
   }

   @Override
   protected boolean N(long var1) {
      return this.B.i.contains(var1);
   }

   @Nullable
   @Override
   protected class04745 N(long var1, int var3, @Nullable class04745 var4, int var5) {
      return this.B.N(var1, var3, var4, var5);
   }
}
