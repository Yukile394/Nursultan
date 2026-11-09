package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public class class02196 implements class02324<StringReader, class01894> {
   public static final class02324<StringReader, class01894> N = new class02196();

   private class02196() {
      super();
   }

   @Nullable
   public class01894 y(class02325<StringReader> var1) {
      ((StringReader)var1.R()).skipWhitespace();

      try {
         return class01894.y((StringReader)var1.R());
      } catch (CommandSyntaxException commandsyntaxexception) {
         return null;
      }
   }
}
