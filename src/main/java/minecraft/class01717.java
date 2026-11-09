package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class class01717<T extends class01711<T>> implements class01716<T> {
   private final String N;
   private final class03126 y;
   private final CommandContext<T> L;

   public class01717(String var1, class03126 var2, CommandContext<T> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public void N(T var1, class01752<T> var2, class03099 var3) {
      var2.L().N(() -> "execute " + this.N);

      try {
         var2.i();
         int i = ContextChain.runExecutable(this.L, var1, class01711.k(), this.y.N());
         class01704 class01704 = var2.y();
         if (class01704 != null) {
            class01704.N(var3.L(), this.N, i);
         }
      } catch (CommandSyntaxException commandsyntaxexception) {
         var1.N(commandsyntaxexception, this.y.N(), var2.y());
      } finally {
         var2.L().L();
      }
   }
}
