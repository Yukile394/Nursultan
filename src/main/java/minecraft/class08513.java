package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class08513 implements class02324<StringReader, String> {
   private final Pattern N;
   private final class08524<CommandSyntaxException> y;

   public class08513(Pattern var1, class08524<CommandSyntaxException> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public String y(class02325<StringReader> var1) {
      StringReader stringreader = (StringReader)var1.R();
      String s = stringreader.getString();
      Matcher matcher = this.N.matcher(s).region(stringreader.getCursor(), s.length());
      if (!matcher.lookingAt()) {
         var1.y().N(var1.M(), this.y);
         return null;
      } else {
         stringreader.setCursor(matcher.end());
         return matcher.group(0);
      }
   }
}
