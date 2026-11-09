package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.chars.CharList;
import java.util.stream.Collectors;

public abstract class class02165 implements class02315<StringReader> {
   private final class08524<CommandSyntaxException> N;
   private final class02350<StringReader> y;

   public class02165(CharList var1) {
      super();
      String s = var1.intStream().mapToObj(Character::toString).collect(Collectors.joining("|"));
      this.N = class08524.N(CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), s);
      this.y = var1x -> var1.intStream().mapToObj(Character::toString);
   }

   protected abstract boolean N(char var1);

   @Override
   public boolean N(class02325<StringReader> var1, class02332 var2, class02328 var3) {
      ((StringReader)var1.R()).skipWhitespace();
      int i = var1.M();
      if (((StringReader)var1.R()).canRead() && this.N(((StringReader)var1.R()).read())) {
         return true;
      } else {
         var1.y().N(i, this.y, this.N);
         return false;
      }
   }
}
