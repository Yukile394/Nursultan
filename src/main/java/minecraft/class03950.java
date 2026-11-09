package minecraft;

import java.util.Arrays;
import java.util.Map;

public class class03950 implements AutoCloseable {
   public static final int N = Arrays.stream(class08743.values()).mapToInt(class08743::y).sum();
   private final Map<class08743, class02579> y = class07536.N_74(class08743.class, var0 -> new class02579(var0.y()));

   public class03950() {
      super();
   }

   @Override
   public void close() {
      this.y.values().forEach(class02579::close);
   }

   public void y() {
      this.y.values().forEach(class02579::L);
   }

   public class02579 N(class08743 var1) {
      return this.y.get(var1);
   }

   public void N() {
      this.y.values().forEach(class02579::y);
   }
}
