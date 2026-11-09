package minecraft;

import Nursultan.class10522;
import com.google.common.collect.Streams;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Timer;
import java.util.stream.Collectors;
import net.fabricmc.fabric.impl.crash.report.info.ThreadPrinting;
import org.slf4j.Logger;

public class class05615 implements Runnable {
   private static final Logger N = LogUtils.getLogger();
   private static final long y = 10000L;
   private static final int L = 1;
   private final class05623 u;
   private final long i;

   public class05615(class05623 var1) {
      super();
      this.u = var1;
      this.i = var1.NL() * class01517.y;
   }

   @Override
   public void run() {
      while (this.u.Nj()) {
         long ix = this.u.Nx();
         long j = class07536.u();
         long k = j - ix;
         if (k > this.i) {
            N.error(
               LogUtils.FATAL_MARKER,
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)k / (float)class01517.N),
               String.format(Locale.ROOT, "%.2f", this.u.yW().M() / (float)class01517.L)
            );
            N.error(LogUtils.FATAL_MARKER, "Considering it to be crashed, server will forcibly shutdown.");
            class07080 class07080 = N("Watching Server", this.u.k().threadId());
            this.u.y(class07080.R());
            class07074 class07074 = class07080.N("Performance stats");
            class07074.N("Random tick rate", () -> this.u.yn().m().y(class07305.X));
            class07074.N(
               "Level stats",
               () -> Streams.stream(this.u.NO()).map(var0 -> var0.method_27983().N() + ": " + var0.method_31268()).collect(Collectors.joining(",\n"))
            );
            class03914.N("Crash report:\n" + class07080.N(class02587.N));
            Path path = this.u.Z().resolve("crash-reports").resolve("crash-" + class07536.R() + "-server.txt");
            if (class07080.N(path, class02587.N)) {
               N.error("This crash report has been saved to: {}", path.toAbsolutePath());
            } else {
               N.error("We were unable to save this crash report to disk.");
            }

            this.N();
         }

         try {
            Thread.sleep((ix + this.i - j) / class01517.y);
         } catch (InterruptedException interruptedexception) {
         }
      }
   }

   private static Object N(Object var0) {
      return var0 instanceof ThreadInfo ? ThreadPrinting.fullThreadInfoToString((ThreadInfo)var0) : var0;
   }

   public static class07080 N(String var0, long var1) {
      ThreadInfo[] athreadinfo = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
      StringBuilder stringbuilder = new StringBuilder();
      Error error = new Error("Watchdog");

      for (ThreadInfo threadinfo : athreadinfo) {
         if (threadinfo.getThreadId() == var1) {
            error.setStackTrace(threadinfo.getStackTrace());
         }

         stringbuilder.append(N(threadinfo));
         stringbuilder.append("\n");
      }

      class07080 class07080 = new class07080(var0, error);
      class07074 class07074 = class07080.N("Thread Dump");
      class07074.N("Threads", stringbuilder);
      return class07080;
   }

   private void N() {
      try {
         new Timer().schedule(new class10522(this), 10000L);
         System.exit(1);
      } catch (Throwable throwable) {
         Runtime.getRuntime().halt(1);
      }
   }
}
