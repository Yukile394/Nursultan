package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

public abstract class class02173<C, V> implements class02170, class02324<StringReader, V> {
   private final class08501<StringReader, class01894> y;
   protected final C N;
   private final class08524<CommandSyntaxException> L;

   protected class02173(class08501<StringReader, class01894> var1, C var2) {
      super();
      this.y = var1;
      this.N = (C)var2;
      this.L = class08524.N(class01894.L);
   }

   @Nullable
   @Override
   public V y(class02325<StringReader> var1) {
      ((StringReader)var1.R()).skipWhitespace();
      int i = var1.M();
      class01894 class01894 = var1.N(this.y);
      if (class01894 != null) {
         try {
            return this.N((ImmutableStringReader)var1.R(), class01894);
         } catch (Exception exception) {
            var1.y().N(i, this, exception);
            return null;
         }
      } else {
         var1.y().N(i, this, this.L);
         return null;
      }
   }

   protected abstract V N(ImmutableStringReader var1, class01894 var2) throws Exception;
}
