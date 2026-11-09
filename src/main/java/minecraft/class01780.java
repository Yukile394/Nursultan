package minecraft;

import com.mojang.brigadier.StringReader;

public class class01780 {
   public class01780() {
      super();
   }

   public static String N(StringReader var0, class01036 var1) {
      int i = var0.getCursor();

      while (var0.canRead() && var1.test(var0.peek())) {
         var0.skip();
      }

      return var0.getString().substring(i, var0.getCursor());
   }
}
