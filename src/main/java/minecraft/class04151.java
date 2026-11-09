package minecraft;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class class04151 extends Exception {
   private final Path N;
   private final List<class04168> y;

   public class04151(Path var1, List<class04168> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String getMessage() {
      return N(this.N, this.y);
   }

   public static String N(Path var0, List<class04168> var1) {
      return "Failed to validate '"
         + var0
         + "'. Found forbidden symlinks: "
         + var1.stream().map(var0x -> var0x.N() + "->" + var0x.y()).collect(Collectors.joining(", "));
   }
}
