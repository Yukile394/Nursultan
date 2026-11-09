package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class class00217 {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "gametestserver";
   private static final String L = "gametestworld";
   private static final OptionParser u = new OptionParser();
   private static final OptionSpec<String> i = u.accepts(
         "universe", "The path to where the test server world will be created. Any existing folder will be replaced."
      )
      .withRequiredArg()
      .defaultsTo("gametestserver", new String[0]);
   private static final OptionSpec<File> R = u.accepts("report", "Exports results in a junit-like XML report at the given path.")
      .withRequiredArg()
      .ofType(File.class);
   private static final OptionSpec<String> M = u.accepts("tests", "Which test(s) to run (namespaced ID selector using wildcards). Empty means run all.")
      .withRequiredArg();
   private static final OptionSpec<Boolean> B = u.accepts(
         "verify", "Runs the tests specified with `test` or `testNamespace` 100 times for each 90 degree rotation step"
      )
      .withRequiredArg()
      .ofType(Boolean.class)
      .defaultsTo(false, new Boolean[0]);
   private static final OptionSpec<String> Z = u.accepts("packs", "A folder of datapacks to include in the world").withRequiredArg();
   private static final OptionSpec<Void> z = u.accepts("help").forHelp();

   public class00217() {
      super();
   }

   private static void N(String var0) throws IOException {
      Path path = Paths.get(var0);
      if (Files.exists(path)) {
         FileUtils.deleteDirectory(path.toFile());
      }

      Files.createDirectories(path);
   }

   private static void N(String var0, String var1) throws IOException {
      Path path = Paths.get(var0).resolve("gametestworld").resolve("datapacks");
      if (!Files.exists(path)) {
         Files.createDirectories(path);
      }

      Path path1 = Paths.get(var1);
      if (Files.exists(path1)) {
         try (Stream<Path> stream = Files.list(path1)) {
            for (Path path2 : stream.toList()) {
               Path path3 = path.resolve(path2.getFileName());
               if (Files.isDirectory(path2)) {
                  if (Files.isRegularFile(path2.resolve("pack.mcmeta"))) {
                     FileUtils.copyDirectory(path2.toFile(), path3.toFile());
                     N.info("Included folder pack {}", path2.getFileName());
                  }
               } else if (path2.toString().endsWith(".zip")) {
                  Files.copy(path2, path3);
                  N.info("Included zip pack {}", path2.getFileName());
               }
            }
         }
      }
   }

   public static void N(String[] var0, Consumer<String> var1) throws Exception {
      u.allowsUnrecognizedOptions();
      OptionSet optionset = u.parse(var0);
      if (optionset.has(z)) {
         u.printHelpOn(System.err);
      } else {
         if ((Boolean)optionset.valueOf(B) && !optionset.has(M)) {
            N.error("Please specify a test selection to run the verify option. For example: --verify --tests example:test_something_*");
            System.exit(-1);
         }

         N.info("Running GameTestMain with cwd '{}', universe path '{}'", System.getProperty("user.dir"), optionset.valueOf(i));
         if (optionset.has(R)) {
            class04833.N(new class01693((File)R.value(optionset)));
         }

         class03914.N();
         class07536.s();
         String s = (String)optionset.valueOf(i);
         N(s);
         var1.accept(s);
         if (optionset.has(Z)) {
            String s1 = (String)optionset.valueOf(Z);
            N(s, s1);
         }

         class04785 class04785 = class04777.y(Paths.get(s)).i("gametestworld");
         class01623 class01623 = class01093.N(class04785);
         class02796.N((Function<Thread, class01695>)(var3x -> class01695.N(var3x, class04785, class01623, N(optionset, M), optionset.has(B))));
      }
   }

   private static Optional<String> N(OptionSet var0, OptionSpec<String> var1) {
      return var0.has(var1) ? Optional.of((String)var0.valueOf(var1)) : Optional.empty();
   }
}
