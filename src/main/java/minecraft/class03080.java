package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03080 {
   static final Logger N = LogUtils.getLogger();
   @Nullable
   class02083 y;
   Instant L = Instant.EPOCH;

   public class03080(UUID var1, UUID var2) {
      super();
      this.y = class02083.N(var1, var2);
   }

   public class03065 N(class03954 var1) {
      return var2 -> {
         class02083 class02083 = this.y;
         if (class02083 == null) {
            return null;
         } else {
            this.y = class02083.N();
            return new class04469(var1.sign(var2x -> class03926.N(var2x, class02083, var2)));
         }
      };
   }

   public class03073 N(class04470 var1) {
      class03962 class03962 = var1.N();
      return new class03045(this, var1, class03962);
   }
}
