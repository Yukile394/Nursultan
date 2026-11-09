package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;

class class01862<T extends class01711<T>> implements class01887<T> {
   private final class01737 N;
   private final IntList y;
   private final T L;

   public class01862(class01737 var1, IntList var2, T var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = (T)var3;
   }

   @Override
   public IntList N() {
      return this.y;
   }

   @Override
   public class01716<T> N(List<String> var1, CommandDispatcher<T> var2, class01894 var3) throws class01878 {
      String s = this.N.N(var1);

      try {
         return class07684.N(var2, this.L, new StringReader(s));
      } catch (CommandSyntaxException commandsyntaxexception) {
         throw new class01878(class00392.N("commands.function.error.parse", class00392.N(var3), s, commandsyntaxexception.getMessage()));
      }
   }
}
