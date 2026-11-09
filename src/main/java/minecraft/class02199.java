package minecraft;

import java.util.ArrayList;

@FunctionalInterface
public interface class02199 {
   int count(int var1);

   static class02199 N(class07438 var0) {
      return var1 -> {
         ArrayList arraylist = new ArrayList();
         var0.method_73183().method_47575(class07078.ys, var0.method_5829().M(2.0), var1x -> var1x != var0, arraylist, var1);
         return arraylist.size();
      };
   }
}
