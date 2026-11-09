package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

class class03411 implements class03375 {
   private static final Logger L = LogUtils.getLogger();
   private int u;

   class03411(int var1) {
      super();
      this.y = var1;
   }

   @Override
   public long y() {
      this.u++;
      long i = Math.min(1L << this.u, (long)this.y);
      L.debug("Skipping for {} extra cycles", i);
      return i;
   }

   @Override
   public long N() {
      this.u = 0;
      return 1L;
   }
}
