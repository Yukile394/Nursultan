package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public abstract class class08522 implements class02324<StringReader, String> {
   private final int N;
   private final int y;
   private final class08524<CommandSyntaxException> L;

   public class08522(int var1, class08524<CommandSyntaxException> var2) {
      this(var1, Integer.MAX_VALUE, var2);
   }

   public class08522(int var1, int var2, class08524<CommandSyntaxException> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   protected abstract boolean N(char var1);

   @Nullable
   public String y(class02325<StringReader> var1) {
      StringReader stringreader = (StringReader)var1.R();
      String s = stringreader.getString();
      int i = stringreader.getCursor();
      int j = i;

      while (j < s.length() && this.N(s.charAt(j)) && j - i < this.y) {
         j++;
      }

      if (j - i < this.N) {
         var1.y().N(var1.M(), this.L);
         return null;
      } else {
         stringreader.setCursor(j);
         return s.substring(i, j);
      }
   }
}
