package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class01025 extends class00642 {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("disconnect.exceeded_packet_rate");
   private final int L;

   public class01025(int var1) {
      super(class00423.field_11941);
      this.L = var1;
   }

   @Override
   protected void method_30615() {
      super.method_30615();
      float f = this.method_10762();
      if (f > this.L) {
         N.warn("Player exceeded rate-limit (sent {} packets per second)", f);
         this.method_10752(new class00501(y), class03041.N(() -> this.method_10747(y)));
         this.method_10757();
      }
   }
}
