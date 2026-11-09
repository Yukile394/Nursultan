package minecraft;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalLong;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.slf4j.Logger;

public class class03467 {
   public static final class03467 N = new class03467(Ticker.systemTicker());
   private static final Logger y = LogUtils.getLogger();
   private final Ticker L;
   private final Map<class02117<class03497>, Stopwatch> u = new HashMap<>();
   private OptionalLong i = OptionalLong.empty();

   protected class03467(Ticker var1) {
      super();
      this.L = var1;
   }

   public synchronized void y(class02117<class03497> var1) {
      Stopwatch stopwatch = this.u.get(var1);
      if (stopwatch == null) {
         y.warn("Attempted to end step for {} before starting it", var1.y());
      } else {
         if (stopwatch.isRunning()) {
            stopwatch.stop();
         }
      }
   }

   public synchronized void N(class02117<class03497> var1) {
      this.N(var1, (Function<class02117<class03497>, Stopwatch>)(var1x -> Stopwatch.createStarted(this.L)));
   }

   public synchronized void N(long var1) {
      this.i = OptionalLong.of(var1);
   }

   private synchronized void N(class02117<class03497> var1, Function<class02117<class03497>, Stopwatch> var2) {
      this.u.computeIfAbsent(var1, var2);
   }

   public void N(class02097 var1) {
      var1.send(class02129.B, var1x -> {
         synchronized (this) {
            this.u.forEach((var1xx, var2) -> {
               if (!var2.isRunning()) {
                  long ix = var2.elapsed(TimeUnit.MILLISECONDS);
                  var1x.N((class02117<class03497>)var1xx, new class03497((int)ix));
               } else {
                  y.warn("Measurement {} was discarded since it was still ongoing when the event {} was sent.", var1xx.y(), class02129.B.N());
               }
            });
            this.i.ifPresent(var1xx -> var1x.N(class02117.Y, new class03497((int)var1xx)));
            this.u.clear();
         }
      });
   }

   public synchronized void N(class02117<class03497> var1, Stopwatch var2) {
      this.N(var1, (Function<class02117<class03497>, Stopwatch>)(var1x -> var2));
   }
}
