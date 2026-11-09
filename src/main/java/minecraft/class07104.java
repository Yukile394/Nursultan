package minecraft;

import Nursultan.class10716;
import com.google.common.collect.ImmutableMap;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class class07104 {
   static final Logger N = LogUtils.getLogger();
   private static final String L = "// ";
   private final Path u;
   private final Path i;
   private final String R;
   private final Map<String, class07096> M;
   private final Set<String> B = new HashSet<>();
   final Set<Path> y = new HashSet<>();
   private final int Z;
   private int z;

   public class07104(Path var1, Collection<String> var2, class04551 var3) throws IOException {
      super();
      this.R = var3.comp_4024();
      this.u = var1;
      this.i = var1.resolve(".cache");
      Files.createDirectories(this.i);
      HashMap hashmap = new HashMap();
      int ix = 0;

      for (String s : var2) {
         Path path = this.y(s);
         this.y.add(path);
         class07096 class07096 = N(var1, path);
         hashmap.put(s, class07096);
         ix += class07096.N();
      }

      this.M = hashmap;
      this.Z = ix;
   }

   private ZonedDateTime y() {
      return ZonedDateTime.of(LocalDateTime.MIN, ZoneOffset.UTC);
   }

   private Path y(String var1) {
      return this.i.resolve(Hashing.sha1().hashString(var1, StandardCharsets.UTF_8).toString());
   }

   public void N(class07129 var1) {
      this.M.put(var1.N(), var1.y());
      this.B.add(var1.N());
      this.z = this.z + var1.L();
   }

   public boolean N(String var1) {
      class07096 class07096 = this.M.get(var1);
      return class07096 == null || !class07096.y().equals(this.R);
   }

   public CompletableFuture<class07129> N(String var1, class10716 var2) {
      class07096 class07096 = this.M.get(var1);
      if (class07096 == null) {
         throw new IllegalStateException("Provider not registered: " + var1);
      } else {
         class07120 class07120 = new class07120(var1, this.R, class07096);
         return var2.update(class07120).thenApply(var1x -> class07120.N());
      }
   }

   private static class07096 N(Path var0, Path var1) {
      if (Files.isReadable(var1)) {
         try {
            return class07096.N(var0, var1);
         } catch (Exception exception) {
            N.warn("Failed to parse cache {}, discarding", var1, exception);
         }
      }

      return new class07096("unknown", ImmutableMap.of());
   }

   public void N() throws IOException {
      HashSet hashset = new HashSet();
      this.M.forEach((var2x, var3x) -> {
         if (this.B.contains(var2x)) {
            Path path = this.y(var2x);
            var3x.N(this.u, path, DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(this.y()) + "\t" + var2x);
         }

         hashset.addAll(var3x.L().keySet());
      });
      hashset.add(this.u.resolve("version.json"));
      MutableInt mutableint = new MutableInt();
      MutableInt mutableint1 = new MutableInt();
      Files.walkFileTree(this.u, new class07102(this, mutableint, hashset, mutableint1));
      N.info(
         "Caching: total files: {}, old count: {}, new count: {}, removed stale: {}, written: {}",
         new Object[]{mutableint, this.Z, hashset.size(), mutableint1, this.z}
      );
   }
}
