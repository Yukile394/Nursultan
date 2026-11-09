package minecraft;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.ContextChain;

public class class03478<T extends class01711<T>> implements class01743<T> {
   public class03478() {
      super();
   }

   public void N(T var1, ContextChain<T> var2, class03126 var3, class01744<T> var4) {
      int i = IntegerArgumentType.getInteger(var2.getTopContext(), "value");
      var1.T().N(i);
      class03099 class03099 = var4.y();
      class03099.N(i);
      class03099.y();
   }
}
