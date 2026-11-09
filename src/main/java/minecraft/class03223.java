package minecraft;

import Nursultan.class10159;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jdk.jfr.Configuration;
import jdk.jfr.Event;
import jdk.jfr.FlightRecorder;
import jdk.jfr.Recording;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03223 implements class01834 {
   private static final Logger B = LogUtils.getLogger();
   public static final String N = "Minecraft";
   public static final String y = "World Generation";
   public static final String L = "Ticking";
   public static final String u = "Network";
   public static final String i = "Storage";
   private static final List<Class<? extends Event>> Z = List.of(
      class02803.class,
      class02791.class,
      class02785.class,
      class02800.class,
      class02780.class,
      class02779.class,
      class02788.class,
      class02784.class,
      class02778.class,
      class02790.class
   );
   private static final String z = "/flightrecorder-config.jfc";
   private static final DateTimeFormatter U = new DateTimeFormatterBuilder()
      .appendPattern("yyyy-MM-dd-HHmmss")
      .toFormatter(Locale.ROOT)
      .withZone(ZoneId.systemDefault());
   private static final class03223 E = new class03223();
   @Nullable
   Recording R;
   private int W;
   private float m;
   private final Map<String, class02799> P = new ConcurrentHashMap<>();
   private final Runnable s = () -> new class02784(this.W).commit();
   private final Runnable T = () -> new class02788(this.m).commit();
   private final Runnable b = () -> {
      Iterator<class02799> iterator = this.P.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().N();
         iterator.remove();
      }
   };

   @Override
   public Path L() {
      if (this.R == null) {
         throw new IllegalStateException("Not currently profiling");
      } else {
         this.P.clear();
         Path path = this.R.getDestination();
         this.R.stop();
         return path;
      }
   }

   private void M() {
      FlightRecorder.addListener(new class03207(this));
   }

   private class03223() {
      super();
      Z.forEach(FlightRecorder::register);
      this.N();
      FlightRecorder.addListener(new class10159(this));
   }

   @Override
   public boolean i() {
      return FlightRecorder.isAvailable();
   }

   @Override
   public boolean u() {
      return this.R != null;
   }

   @Override
   public void y(class00648 var1, class02897<?> var2, SocketAddress var3, int var4) {
      if (class02780.M.isEnabled()) {
         new class02780(var1.N(), var2.N().y(), var2.y().toString(), var3, var4).commit();
      }

      if (class02779.y.isEnabled()) {
         this.N(var3).N(var4);
      }
   }

   @Override
   public void y(class02277 var1, class07321 var2, class05530 var3, int var4) {
      if (class02785.W.isEnabled()) {
         new class02785(var1, var2, var3, var4).commit();
      }
   }

   public static class03223 y() {
      return E;
   }

   @Nullable
   @Override
   public class03299 N(class07321 var1, class05946<class07299> var2, String var3) {
      if (!class02803.y.isEnabled()) {
         return null;
      } else {
         class02803 class02803 = new class02803(var1, var2, var3);
         class02803.begin();
         return var1x -> class02803.commit();
      }
   }

   @Nullable
   @Override
   public class03299 N(class07321 var1, class05946<class07299> var2, class03556<class04748> var3) {
      if (!class02778.y.isEnabled()) {
         return null;
      } else {
         class02778 class02778 = new class02778(var1, var3, var2);
         class02778.begin();
         return var1x -> {
            class02778.M = var1x;
            class02778.commit();
         };
      }
   }

   private class02799 N(SocketAddress var1) {
      return this.P.computeIfAbsent(var1.toString(), class02799::new);
   }

   private boolean N(Reader var1, class03215 var2) {
      if (this.u()) {
         B.warn("Profiling already in progress");
         return false;
      } else {
         try {
            Configuration configuration = Configuration.create(var1);
            String sx = U.format(Instant.now());
            this.R = class07536.N(new Recording(configuration), var2x -> {
               Z.forEach(var2x::enable);
               var2x.setDumpOnExit(true);
               var2x.setToDisk(true);
               var2x.setName(String.format(Locale.ROOT, "%s-%s-%s", var2.N(), class07529.y().comp_4025(), sx));
            });
            Path path = Paths.get(String.format(Locale.ROOT, "debug/%s-%s.jfr", var2.N(), sx));
            class06290.L(path.getParent());
            this.R.setDestination(path);
            this.R.start();
            this.M();
         } catch (ParseException | IOException ioexception) {
            B.warn("Failed to start jfr profiling", ioexception);
            return false;
         }

         B.info(
            "Started flight recorder profiling id({}):name({}) - will dump to {} on exit or stop command",
            new Object[]{this.R.getId(), this.R.getName(), this.R.getDestination()}
         );
         return true;
      }
   }

   @Override
   public void N(float var1) {
      if (class02788.y.isEnabled()) {
         this.m = var1;
      }
   }

   @Override
   public void N(int var1) {
      if (class02784.y.isEnabled()) {
         this.W = var1;
      }
   }

   private static void N(Class<? extends Event> var0, Runnable var1) {
      FlightRecorder.removePeriodicEvent(var1);
      FlightRecorder.addPeriodicEvent(var0, var1);
   }

   @Override
   public void N(class00648 var1, class02897<?> var2, SocketAddress var3, int var4) {
      if (class02800.M.isEnabled()) {
         new class02800(var1.N(), var2.N().y(), var2.y().toString(), var3, var4).commit();
      }

      if (class02779.y.isEnabled()) {
         this.N(var3).y(var4);
      }
   }

   @Override
   public boolean N(class03215 var1) {
      URL url = class03223.class.getResource("/flightrecorder-config.jfc");
      if (url == null) {
         B.warn("Could not find default flight recorder config at {}", "/flightrecorder-config.jfc");
         return false;
      } else {
         try {
            boolean flag;
            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {
               flag = this.N(bufferedreader, var1);
            }

            return flag;
         } catch (IOException ioexception) {
            B.warn("Failed to start flight recorder using configuration at {}", url, ioexception);
            return false;
         }
      }
   }

   @Override
   public void N(class02277 var1, class07321 var2, class05530 var3, int var4) {
      if (class02791.W.isEnabled()) {
         new class02791(var1, var2, var3, var4).commit();
      }
   }

   public void N() {
      N(class02784.class, this.s);
      N(class02788.class, this.T);
      N(class02779.class, this.b);
   }

   @Nullable
   @Override
   public class03299 R() {
      if (!class02790.y.isEnabled()) {
         return null;
      } else {
         class02790 class02790 = new class02790();
         class02790.begin();
         return var1x -> class02790.commit();
      }
   }
}
