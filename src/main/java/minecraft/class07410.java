package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class class07410 {
   public class07410() {
      super();
   }

   public static class07420 N(List<class07425<?>> var0) {
      ArrayList arraylist = new ArrayList(class04206.NQ.L() + class04206.NO.L());
      class04206.NQ.z().forEach(var1x -> {
         if (var1x.N().y().y()) {
            arraylist.add(var1x.N().N().N(var1x.B().N()));
         }
      });
      class04206.NO.z().forEach(var1x -> {
         if (var1x.N().y().N()) {
            arraylist.add(var1x.N().N().N(var1x.B().N()));
         }
      });
      HashMap hashmap = new HashMap();

      for (class07425 class07425 : var0) {
         hashmap.put(class07425.L(), class07425.i().y());
      }

      class07414 class07414 = new class07414("Minecraft Server JSON-RPC", "2.0.0");
      return new class07420("1.3.2", class07414, arraylist, new class07422(hashmap));
   }
}
