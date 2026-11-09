package minecraft;

import com.mojang.jtracy.TracyClient;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import org.jspecify.annotations.Nullable;

class class07524 extends ForkJoinWorkerThread {
   class07524(ForkJoinPool var1, String var2, String var3) {
      super(var1);
      this.N = var2;
      this.y = var3;
   }

   @Override
   protected void onStart() {
      TracyClient.setThreadName(this.N, this.y.hashCode());
      super.onStart();
   }

   @Override
   protected void onTermination(@Nullable Throwable var1) {
      if (var1 != null) {
         class07536.N.warn("{} died", this.getName(), var1);
      } else {
         class07536.N.debug("{} shutdown", this.getName());
      }

      super.onTermination(var1);
   }
}
