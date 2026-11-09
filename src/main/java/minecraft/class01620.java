package minecraft;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class class01620 implements class01061 {
   private final Path N;

   public class01620(Path var1) {
      super();
      this.N = var1;
   }

   @Override
   public class01622 method_52424(class02267 var1) {
      return new class01592(var1, this.N);
   }

   @Override
   public class01622 method_52425(class02267 var1, class01078 var2) {
      class01622 class01622 = this.method_52424(var1);
      List<String> list = var2.u();
      if (list.isEmpty()) {
         return class01622;
      } else {
         ArrayList arraylist = new ArrayList(list.size());

         for (String s : list) {
            Path path = this.N.resolve(s);
            arraylist.add(new class01592(var1, path));
         }

         return new class04154(class01622, arraylist);
      }
   }
}
