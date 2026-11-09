package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03296 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 5;
   private final String L;
   private final int u;
   private final class02796 i;
   private volatile boolean R;
   @Nullable
   private Socket M;
   @Nullable
   private Thread B;

   public void L() {
      String s = this.L + ":" + this.u;

      while (this.R) {
         try {
            N.info("Connecting to remote control server {}", s);
            this.M = new Socket(this.L, this.u);
            N.info("Connected to remote control server! Will continuously execute the command broadcasted by that server.");

            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(this.M.getInputStream(), StandardCharsets.US_ASCII))) {
               while (this.R) {
                  String s1 = bufferedreader.readLine();
                  if (s1 == null) {
                     N.warn("Lost connection to remote control server {}. Will retry in {}s.", s, 5);
                     break;
                  }

                  this.N(s1);
               }
            } catch (IOException ioexception) {
               N.warn("Lost connection to remote control server {}. Will retry in {}s.", s, 5);
            }
         } catch (IOException ioexception1) {
            N.warn("Failed to connect to remote control server {}. Will retry in {}s.", s, 5);
         }

         if (this.R) {
            try {
               Thread.sleep(5000L);
            } catch (InterruptedException interruptedexception) {
            }
         }
      }
   }

   public class03296(String var1, int var2, class02796 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   private Optional<class03304> y(Scanner var1) {
      class05946<class07299> class05946 = (class05946<class07299>)class03305.N.get(var1.next());
      if (class05946 == null) {
         return Optional.empty();
      } else {
         float f = var1.nextFloat();
         float f1 = var1.nextFloat();
         float f2 = var1.nextFloat();
         float f3 = var1.nextFloat();
         float f4 = var1.nextFloat();
         return Optional.of(new class03304(class05946, new class06889(f, f1, f2), new class07109(f4, f3)));
      }
   }

   public void y() {
      this.R = false;
      IOUtils.closeQuietly(this.M);
      this.M = null;
      this.B = null;
   }

   private void y(String var1) {
      this.i
         .execute(
            () -> {
               List<class04770> list = this.i.Nm().v();
               if (!list.isEmpty()) {
                  class04770 class04770 = list.get(0);
                  class04782 class04782 = this.i.NY();
                  class07701 class07701 = new class07701(
                     class04770.method_64401(),
                     class06889.N(class04782.method_74854().y()),
                     class07109.N,
                     class04782,
                     class06984.i,
                     "",
                     class05220.N,
                     this.i,
                     class04770
                  );
                  this.i.yL().N(class07701, var1);
               }
            }
         );
   }

   private void N(Scanner var1) {
      this.y(var1)
         .ifPresent(
            var1x -> this.y(
               String.format(
                  Locale.ROOT,
                  "execute in %s run tp @s %.3f %.3f %.3f %.3f %.3f",
                  var1x.N().N(),
                  var1x.y().M,
                  var1x.y().B,
                  var1x.y().Z,
                  var1x.L().U,
                  var1x.L().z
               )
            )
         );
   }

   public void N() {
      if (this.B != null && this.B.isAlive()) {
         N.warn("Remote control client was asked to start, but it is already running. Will ignore.");
      }

      this.R = true;
      this.B = new Thread(this::L, "chase-client");
      this.B.setDaemon(true);
      this.B.start();
   }

   private void N(String var1) {
      try (Scanner scanner = new Scanner(new StringReader(var1))) {
         scanner.useLocale(Locale.ROOT);
         String s = scanner.next();
         if ("t".equals(s)) {
            this.N(scanner);
         } else {
            N.warn("Unknown message type '{}'", s);
         }
      } catch (NoSuchElementException nosuchelementexception) {
         N.warn("Could not parse message '{}', ignoring", var1);
      }
   }
}
