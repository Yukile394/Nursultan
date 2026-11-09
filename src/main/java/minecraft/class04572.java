package minecraft;

import Nursultan.class10452;
import java.util.Optional;

public class class04572 {
   public final String N;
   public final Optional<class10452> y;

   public class04572(String var1, Optional<class10452> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return this.y.<String>map(var1 -> this.N + ":" + var1).orElse(this.N);
   }
}
