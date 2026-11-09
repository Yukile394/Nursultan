package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public class class08515 implements class02324<StringReader, String> {
   private final int N;
   private final class08524<CommandSyntaxException> y;

   public class08515(int var1, class08524<CommandSyntaxException> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Nullable
   public String y(class02325<StringReader> var1) {
      ((StringReader)var1.R()).skipWhitespace();
      int i = var1.M();
      String s = ((StringReader)var1.R()).readUnquotedString();
      if (s.length() < this.N) {
         var1.y().N(i, this.y);
         return null;
      } else {
         return s;
      }
   }
}
