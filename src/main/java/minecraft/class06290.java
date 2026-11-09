package minecraft;

import com.mojang.serialization.DataResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;

public class class06290 {
   private static final Pattern N = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
   private static final int y = 255;
   private static final Pattern L = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);
   private static final Pattern u = Pattern.compile("[-._a-z0-9]+");

   public static String L(String var0) {
      return FilenameUtils.getFullPath(var0).replace(File.separator, "/");
   }

   public static void L(Path var0) throws IOException {
      Files.createDirectories(Files.exists(var0) ? var0.toRealPath() : var0);
   }

   private static boolean M(String var0) {
      return u.matcher(var0).matches();
   }

   public class06290() {
      super();
   }

   public static DataResult<List<String>> i(String var0) {
      int i = var0.indexOf(47);
      if (i == -1) {
         return switch (var0) {
            case "", ".", ".." -> DataResult.error(() -> "Invalid path '" + var0 + "'");
            default -> !M(var0) ? DataResult.error(() -> "Invalid path '" + var0 + "'") : DataResult.success(List.of(var0));
         };
      } else {
         ArrayList arraylist = new ArrayList();
         int j = 0;
         boolean flag = false;

         while (true) {
            String s = var0.substring(j, i);
            switch (s) {
               case "":
               case ".":
               case "..":
                  return DataResult.error(() -> "Invalid segment '" + s + "' in path '" + var0 + "'");
            }

            if (!M(s)) {
               return DataResult.error(() -> "Invalid segment '" + s + "' in path '" + var0 + "'");
            }

            arraylist.add(s);
            if (flag) {
               return DataResult.success(arraylist);
            }

            j = i + 1;
            i = var0.indexOf(47, j);
            if (i == -1) {
               i = var0.length();
               flag = true;
            }
         }
      }
   }

   public static String u(String var0) {
      return FilenameUtils.normalize(var0).replace(File.separator, "/");
   }

   public static boolean y(String var0) {
      return !L.matcher(var0).matches();
   }

   public static boolean y(Path var0) {
      Iterator<Path> iterator = var0.iterator();

      while (iterator.hasNext()) {
         if (!y(iterator.next().toString())) {
            return false;
         }
      }

      return true;
   }

   public static Path y(Path var0, String var1, String var2) {
      String s = var1 + var2;
      Path path = Paths.get(s);
      if (path.endsWith(var2)) {
         throw new InvalidPathException(s, "empty resource name");
      } else {
         return var0.resolve(path);
      }
   }

   public static String N(String var0) {
      int i = class07529.yM.length;

      for (int j = 0; j < i; j++) {
         char c0 = class07529.yM[j];
         var0 = var0.replace(c0, '_');
      }

      return var0.replaceAll("[./\"]", "_");
   }

   public static boolean N(Path var0) {
      return var0.normalize().equals(var0);
   }

   public static String N(Path var0, String var1, String var2) throws IOException {
      var1 = N(var1);
      if (!y(var1)) {
         var1 = "_" + var1 + "_";
      }

      Matcher matcher = N.matcher(var1);
      int i = 0;
      if (matcher.matches()) {
         var1 = matcher.group("name");
         i = Integer.parseInt(matcher.group("count"));
      }

      if (var1.length() > 255 - var2.length()) {
         var1 = var1.substring(0, 255 - var2.length());
      }

      while (true) {
         String s = var1;
         if (i != 0) {
            String s1 = " (" + i + ")";
            int j = 255 - s1.length();
            if (var1.length() > j) {
               s = var1.substring(0, j);
            }

            s = s + s1;
         }

         s = s + var2;
         Path path = var0.resolve(s);

         try {
            Path path1 = Files.createDirectory(path);
            Files.deleteIfExists(path1);
            return var0.relativize(path1).toString();
         } catch (FileAlreadyExistsException filealreadyexistsexception) {
            i++;
         }
      }
   }

   public static Path N(Path var0, List<String> var1) {
      int i = var1.size();

      return switch (i) {
         case 0 -> var0;
         case 1 -> var0.resolve((String)var1.get(0));
         default -> {
            String[] astring = new String[i - 1];

            for (int j = 1; j < i; j++) {
               astring[j - 1] = (String)var1.get(j);
            }

            yield var0.resolve(var0.getFileSystem().getPath((String)var1.get(0), astring));
         }
      };
   }

   public static void N(String... var0) {
      if (var0.length == 0) {
         throw new IllegalArgumentException("Path must have at least one element");
      } else {
         for (String s : var0) {
            if (!R(s)) {
               throw new IllegalArgumentException("Illegal segment " + s + " in path " + Arrays.toString((Object[])var0));
            }
         }
      }
   }

   public static boolean R(String var0) {
      return !var0.equals("..") && !var0.equals(".") && M(var0);
   }
}
