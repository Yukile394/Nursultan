package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record class02602(Map<String, String> details) implements class00381<class01662> {
   private static final int L = 128;
   private static final int u = 4096;
   private static final int i = 32;
   private static final class02362<ByteBuf, Map<String, String>> R = class02389.N(HashMap::new, class02389.y(128), class02389.y(4096), 32);
   public static final class02362<ByteBuf, class02602> N = class02362.N(R, class02602::N, class02602::new);

   public class02602(Map<String, String> details) {
      this.details = details;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   public Map<String, String> N() {
      return this.details;
   }

   @Override
   public class02897<class02602> method_65080() {
      return class02885.L;
   }
}
