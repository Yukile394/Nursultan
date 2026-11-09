package minecraft;

import com.mojang.datafixers.schemas.Schema;
import java.util.Iterator;
import java.util.List;

public class class02612 extends class02569 {
   private static final List<String> N = List.of("generic.", "horse.", "player.", "zombie.");

   public class02612(Schema var1) {
      super(var1, "AttributeIdPrefixFix", class02612::N);
   }

   private static String N(String var0) {
      String s = class00622.N(var0);
      Iterator<String> iterator = N.iterator();

      while (iterator.hasNext()) {
         String s1 = class00622.N(iterator.next());
         if (s.startsWith(s1)) {
            return "minecraft:" + s.substring(s1.length());
         }
      }

      return var0;
   }
}
