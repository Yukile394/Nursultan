package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class class02997 {
   private static final Logger y = LogUtils.getLogger();
   public static Consumer<class02997> N = var0 -> {};
   private static final Map<class01603, Path> L = class07536.N(() -> {
      synchronized (class01611.class) {
         Builder builder = ImmutableMap.builder();

         for (class01603 class01603 : class01603.values()) {
            String s = "/" + class01603.N() + "/.mcassetsroot";
            URL url = class01611.class.getResource(s);
            if (url == null) {
               y.error("File {} does not exist in classpath", s);
            } else {
               try {
                  URI uri = url.toURI();
                  String s1 = uri.getScheme();
                  if (!"jar".equals(s1) && !"file".equals(s1)) {
                     y.warn("Assets URL '{}' uses unexpected schema", uri);
                  }

                  Path path = class08606.N(uri);
                  builder.put(class01603, path.getParent());
               } catch (Exception exception) {
                  y.error("Couldn't resolve path to vanilla assets", exception);
               }
            }
         }

         return builder.build();
      }
   });
   private final Set<Path> u = new LinkedHashSet<>();
   private final Map<class01603, Set<Path>> i = new EnumMap<>(class01603.class);
   private class02955 R = class02955.N();
   private final Set<String> M = new HashSet<>();

   private void L(Path var1) {
      if (this.y(var1)) {
         this.u.add(var1);
      }
   }

   public class02997() {
      super();
   }

   private void y(class01603 var1, Path var2) {
      if (this.y(var2)) {
         this.i.computeIfAbsent(var1, var0 -> new LinkedHashSet<>()).add(var2);
      }
   }

   private boolean y(Path var1) {
      if (!Files.exists(var1)) {
         return false;
      } else if (!Files.isDirectory(var1)) {
         throw new IllegalArgumentException("Path " + var1.toAbsolutePath() + " is not directory");
      } else {
         return true;
      }
   }

   public class02997 y() {
      N.accept(this);
      return this;
   }

   private static List<Path> N(Collection<Path> var0) {
      ArrayList arraylist = new ArrayList(var0);
      Collections.reverse(arraylist);
      return List.copyOf(arraylist);
   }

   public class02997 N(class02955 var1) {
      this.R = var1;
      return this;
   }

   public class02997 N(class01603 var1, Class<?> var2) {
      Enumeration enumeration = null;

      try {
         enumeration = var2.getClassLoader().getResources(var1.N() + "/");
      } catch (IOException ioexception) {
      }

      while (enumeration != null && enumeration.hasMoreElements()) {
         URL url = (URL)enumeration.nextElement();

         try {
            URI uri = url.toURI();
            if ("file".equals(uri.getScheme())) {
               Path path = Paths.get(uri);
               this.L(path.getParent());
               this.y(var1, path);
            }
         } catch (Exception exception) {
            y.error("Failed to extract path from {}", url, exception);
         }
      }

      return this;
   }

   public class02997 N(Path var1) {
      this.L(var1);

      for (class01603 class01603 : class01603.values()) {
         this.y(class01603, var1.resolve(class01603.N()));
      }

      return this;
   }

   public class02997 N(class01603 var1, Path var2) {
      this.L(var2);
      this.y(var1, var2);
      return this;
   }

   public class02997 N() {
      L.forEach((var1, var2) -> {
         this.L(var2.getParent());
         this.y(var1, var2);
      });
      return this;
   }

   public class02997 N(String... var1) {
      this.M.addAll(Arrays.asList(var1));
      return this;
   }

   public class01611 N(class02267 var1) {
      return new class01611(var1, this.R, Set.copyOf(this.M), N(this.u), class07536.N_74(class01603.class, var1x -> N(this.i.getOrDefault(var1x, Set.of()))));
   }
}
