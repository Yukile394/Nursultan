package minecraft;

import java.time.Duration;
import org.jspecify.annotations.Nullable;

public class class02103 {
   private final boolean N;
   @Nullable
   private final Duration y;

   public class02103(boolean var1, @Nullable Duration var2) {
      super();
      this.y = var2;
      this.N = var1;
   }

   public void N(class02097 var1) {
      if (this.y != null) {
         var1.send(class02129.i, var1x -> {
            var1x.N(class02117.l, (int)this.y.toMillis());
            var1x.N(class02117.d, this.N);
         });
      }
   }
}
