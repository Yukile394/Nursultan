package minecraft;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class class01613 implements class01061 {
   private final File N;

   public class01613(Path var1) {
      this(var1.toFile());
   }

   public class01613(File var1) {
      super();
      this.N = var1;
   }

   @Override
   public class01622 method_52424(class02267 var1) {
      class01591 class01591 = new class01591(this.N);
      return new class01597(var1, class01591, "");
   }

   @Override
   public class01622 method_52425(class02267 var1, class01078 var2) {
      class01591 class01591 = new class01591(this.N);
      class01597 class01597 = new class01597(var1, class01591, "");
      List<String> list = var2.u();
      if (list.isEmpty()) {
         return class01597;
      } else {
         ArrayList arraylist = new ArrayList(list.size());

         for (String s : list) {
            arraylist.add(new class01597(var1, class01591, s));
         }

         return new class04154(class01597, arraylist);
      }
   }
}
