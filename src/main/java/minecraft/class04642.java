package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

class class04642 {
   long N;
   long y;
   final Map<String, class04642> L = Maps.newHashMap();

   class04642() {
      super();
   }

   public void N(Iterator<String> var1, long var2) {
      this.y += var2;
      if (!var1.hasNext()) {
         this.N += var2;
      } else {
         this.L.computeIfAbsent((String)var1.next(), var0 -> new class04642()).N(var1, var2);
      }
   }
}
