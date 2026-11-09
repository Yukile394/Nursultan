package minecraft;

import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public abstract class class01723<T extends class01711<T>> implements class01729<T> {
   public class01723() {
      super();
   }

   public final void y(T var1, ContextChain<T> var2, class03126 var3, class01744<T> var4) {
      try {
         this.N((T)var1, var2, var3, var4);
      } catch (CommandSyntaxException commandsyntaxexception) {
         this.N(commandsyntaxexception, (T)var1, var3, var4.N());
         var1.T().N();
      }
   }

   protected abstract void N(T var1, ContextChain<T> var2, class03126 var3, class01744<T> var4) throws CommandSyntaxException;

   protected void N(CommandSyntaxException var1, T var2, class03126 var3, @Nullable class01704 var4) {
      var2.N(var1, var3.N(), var4);
   }
}
