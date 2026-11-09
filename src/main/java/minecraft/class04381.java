package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class class04381 {
   private final float N;
   private final Map<String, List<class04373>> y = Maps.newHashMap();
   private boolean L;

   private class04381(float var1) {
      super();
      this.N = var1;
   }

   public class04353 y() {
      return new class04353(this.N, this.L, this.y);
   }

   public class04381 N(String var1, class04373 var2) {
      this.y.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
      return this;
   }

   public class04381 N() {
      this.L = true;
      return this;
   }

   public static class04381 N(float var0) {
      return new class04381(var0);
   }
}
