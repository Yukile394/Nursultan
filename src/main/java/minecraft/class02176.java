package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;

public final class class02176 implements class02315<StringReader> {
   private final String N;
   private final class08524<CommandSyntaxException> y;
   private final class02350<StringReader> L;

   public class02176(String var1) {
      super();
      this.N = var1;
      this.y = class08524.N(CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect(), var1);
      this.L = var1x -> Stream.of(var1);
   }

   @Override
   public String toString() {
      return "terminal[" + this.N + "]";
   }

   @Override
   public boolean N(class02325<StringReader> var1, class02332 var2, class02328 var3) {
      ((StringReader)var1.R()).skipWhitespace();
      int i = var1.M();
      if (!((StringReader)var1.R()).readUnquotedString().equals(this.N)) {
         var1.y().N(i, this.L, this.y);
         return false;
      } else {
         return true;
      }
   }
}
