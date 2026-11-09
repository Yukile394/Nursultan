package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.List;

public class class02986 {
   private final class02991 N = new class02991();

   public class02986() {
      super();
   }

   public class02986 N(List<String> var1, String var2, Path var3) {
      class02991 class02991 = this.N;

      for (String s : var1) {
         class02991 = class02991.N().computeIfAbsent(s, var0 -> new class02991());
      }

      class02991.y().put(var2, var3);
      return this;
   }

   public FileSystem N(String var1) {
      return new class02993(var1, this.N);
   }

   public class02986 N(List<String> var1, Path var2) {
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Path can't be empty");
      } else {
         int i = var1.size() - 1;
         return this.N(var1.subList(0, i), (String)var1.get(i), var2);
      }
   }
}
