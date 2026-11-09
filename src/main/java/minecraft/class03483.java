package minecraft;

import Nursultan.class09518;
import com.mojang.brigadier.context.ContextChain;
import java.util.List;

public class class03483<T extends class01711<T>> implements class01734<T> {
   public class03483() {
      super();
   }

   public void N(T var1, List<T> var2, ContextChain<T> var3, class03126 var4, class01744<T> var5) {
      if (var2.isEmpty()) {
         if (var4.L()) {
            var5.N(class03144.N());
         }
      } else {
         var5.y().y();
         ContextChain contextchain = var3.nextStage();
         String s = contextchain.getTopContext().getInput();
         var5.N(new class09518<>(s, contextchain, var4.u(), (T)var1, var2));
      }
   }
}
