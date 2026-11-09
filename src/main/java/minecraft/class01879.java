package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import org.slf4j.Logger;

public class class01879 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 50;
   private static final String L = "command_history.txt";
   private final Path u;
   private final class04189<String> i = new class04189<>(50);

   public class01879(Path var1) {
      super();
      this.u = var1.resolve("command_history.txt");
      if (Files.exists(this.u)) {
         try (BufferedReader bufferedreader = Files.newBufferedReader(this.u, StandardCharsets.UTF_8)) {
            this.i.addAll(bufferedreader.lines().toList());
         } catch (Exception exception) {
            N.error("Failed to read {}, command history will be missing", "command_history.txt", exception);
         }
      }
   }

   private void y() {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(this.u, StandardCharsets.UTF_8)) {
         for (String s : this.i) {
            bufferedwriter.write(s);
            bufferedwriter.newLine();
         }
      } catch (IOException ioexception) {
         N.error("Failed to write {}, command history will be missing", "command_history.txt", ioexception);
      }
   }

   public Collection<String> N() {
      return this.i;
   }

   public void N(String var1) {
      if (!var1.equals(this.i.peekLast())) {
         if (this.i.size() >= 50) {
            this.i.removeFirst();
         }

         this.i.addLast(var1);
         this.y();
      }
   }
}
