package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00684 {
   private static final Logger N = LogUtils.getLogger();
   private final class00690 y;
   private final class00699[] L = new class00699[class00702.L()];
   @Nullable
   private class00699 u;

   public class00684(class00690 var1) {
      super();
      this.y = var1;
      this.N(class00702.U);
   }

   public <T extends class00699> T y(class00702<T> var1) {
      int i = var1.y();
      class00699 class00699 = this.L[i];
      if (class00699 == null) {
         class00699 = var1.N(this.y);
         this.L[i] = class00699;
      }

      return (T)class00699;
   }

   public void N(class00702<?> var1) {
      if (this.u == null || var1 != this.u.B()) {
         if (this.u != null) {
            this.u.u();
         }

         this.u = this.y(var1);
         if (!this.y.method_73183().method_8608()) {
            this.y.method_5841().N(class00690.N, var1.y());
         }

         N.debug("Dragon is now in phase {} on the {}", var1, this.y.method_73183().method_8608() ? "client" : "server");
         this.u.L();
      }
   }

   public class00699 N() {
      return Objects.requireNonNull(this.u);
   }
}
