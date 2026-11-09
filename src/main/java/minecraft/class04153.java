package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;

public class class04153 implements PathMatcher {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "#";
   private final List<class04170> L;
   private final Map<String, PathMatcher> u = new ConcurrentHashMap<>();

   public class04153(List<class04170> var1) {
      super();
      this.L = var1;
   }

   @Override
   public boolean matches(Path var1) {
      return this.N(var1.getFileSystem()).matches(var1);
   }

   public static class04153 N(BufferedReader var0) {
      return new class04153(var0.lines().flatMap(var0x -> class04170.N(var0x).stream()).toList());
   }

   public PathMatcher N(FileSystem var1) {
      return this.u.computeIfAbsent(var1.provider().getScheme(), var2 -> {
         List list;
         try {
            list = this.L.stream().map(var1xx -> var1xx.N(var1)).toList();
         } catch (Exception exception) {
            N.error("Failed to compile file pattern list", exception);
            return var0 -> false;
         }
         return switch (list.size()) {
            case 0 -> var0 -> false;
            case 1 -> (PathMatcher)list.get(0);
            default -> var1xx -> {
               Iterator iterator = list.iterator();

               while (iterator.hasNext()) {
                  if (((PathMatcher)iterator.next()).matches(var1xx)) {
                     return true;
                  }
               }

               return false;
            };
         };
      });
   }
}
