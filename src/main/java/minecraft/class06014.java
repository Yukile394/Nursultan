package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06014 {
   private static final Logger N = LogUtils.getLogger();
   private final LongSupplier y;
   private final long L;
   private int u;
   private final File i;
   private class04657 R = class04687.N;

   public class06014(LongSupplier var1, String var2, long var3) {
      super();
      this.y = var1;
      this.i = new File("debug", var2);
      this.L = var3;
   }

   public void y() {
      if (this.R != class04687.N) {
         class04681 class04681 = this.R.u();
         this.R = class04687.N;
         if (class04681.M() >= this.L) {
            File file1 = new File(this.i, "tick-results-" + class07536.R() + ".txt");
            class04681.N(file1.toPath());
            N.info("Recorded long tick -- wrote info to: {}", file1.getAbsolutePath());
         }
      }
   }

   public static class04643 N(class04643 var0, @Nullable class06014 var1) {
      return var1 != null ? class04643.N(var1.N(), var0) : var0;
   }

   public class04643 N() {
      this.R = new class05011(this.y, () -> this.u, () -> true);
      this.u++;
      return this.R;
   }

   @Nullable
   public static class06014 N(String var0) {
      return class07529.S ? new class06014(class07536.u, var0, class07529.NA) : null;
   }
}
