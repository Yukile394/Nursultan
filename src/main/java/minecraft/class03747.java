package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class class03747 {
   public class03747() {
      super();
   }

   public static void N(String[] var0) throws IOException {
      class07529.N(class05257.N);
      class03914.N();
      String[] astring = var0;
      int i = var0.length;

      for (int j = 0; j < i; j++) {
         N(astring[j]);
      }
   }

   private static void N(String var0) throws IOException {
      try (Stream<Path> stream = Files.walk(Paths.get(var0))) {
         stream.filter(var0x -> var0x.toString().endsWith(".snbt")).forEach(var0x -> {
            try {
               String s = Files.readString(var0x);
               class07001 class07001x = class07717.N(s);
               class07001 class07001x = class05633.y(var0x.toString(), class07001x);
               class06887.N(class04476.N, var0x, class07717.N(class07001x));
            } catch (IOException | CommandSyntaxException commandsyntaxexception) {
               throw new RuntimeException(commandsyntaxexception);
            }
         });
      }
   }
}
