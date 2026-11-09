package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public abstract class class08499 implements class02324<StringReader, String> {
   private final class08524<CommandSyntaxException> N;
   private final class08524<CommandSyntaxException> y;

   public class08499(class08524<CommandSyntaxException> var1, class08524<CommandSyntaxException> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Nullable
   public String y(class02325<StringReader> var1) {
      StringReader stringreader = (StringReader)var1.R();
      stringreader.skipWhitespace();
      String s = stringreader.getString();
      int i = stringreader.getCursor();
      int j = i;

      while (j < s.length() && this.N(s.charAt(j))) {
         j++;
      }

      if (j - i == 0) {
         var1.y().N(var1.M(), this.N);
         return null;
      } else if (s.charAt(i) != '_' && s.charAt(j - 1) != '_') {
         stringreader.setCursor(j);
         return s.substring(i, j);
      } else {
         var1.y().N(var1.M(), this.y);
         return null;
      }
   }

   protected abstract boolean N(char var1);
}
