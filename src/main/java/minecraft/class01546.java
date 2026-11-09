package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;
import java.util.function.IntPredicate;

class class01546 implements class01734<class07701> {
   private final IntPredicate N;

   class01546(boolean var1) {
      super();
      this.N = var1 ? var0 -> var0 != 0 : var0 -> var0 == 0;
   }

   public void N(class07701 var1, List<class07701> var2, ContextChain<class07701> var3, class03126 var4, class01744<class07701> var5) {
      class01577.N(var1, var2, class01568::N, this.N, var3, null, var5, var0 -> class06808.N(var0, "name"), var4);
   }
}
