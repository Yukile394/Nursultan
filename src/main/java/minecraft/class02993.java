package minecraft;

import Nursultan.class10087;
import com.google.common.base.Splitter;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class02993 extends FileSystem {
   private static final Set<String> y = Set.of("basic");
   public static final String N = "/";
   private static final Splitter L = Splitter.on('/');
   private final FileStore u;
   private final FileSystemProvider i = new class02970();
   private final class02973 R;

   public static class02986 L() {
      return new class02986();
   }

   class02993(String var1, class02991 var2) {
      super();
      this.u = new class02958(var1);
      this.R = N(var2, this, "", null);
   }

   @Override
   public boolean isOpen() {
      return true;
   }

   @Override
   public FileSystemProvider provider() {
      return this.i;
   }

   @Override
   public void close() {
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public Path getPath(String var1, String... var2) {
      Stream stream = Stream.of(var1);
      if (var2.length > 0) {
         stream = Stream.concat(stream, Stream.of(var2));
      }

      String s = stream.collect(Collectors.joining("/"));
      if (s.equals("/")) {
         return this.R;
      } else if (s.startsWith("/")) {
         class02973 class02973 = this.R;

         for (String s2 : L.split(s.substring(1))) {
            if (s2.isEmpty()) {
               throw new IllegalArgumentException("Empty paths not allowed");
            }

            class02973 = class02973.N(s2);
         }

         return class02973;
      } else {
         class02973 class02973x = null;

         for (String s1 : L.split(s)) {
            if (s1.isEmpty()) {
               throw new IllegalArgumentException("Empty paths not allowed");
            }

            class02973x = new class02973(this, s1, class02973x, class02960.y);
         }

         if (class02973x == null) {
            throw new IllegalArgumentException("Empty paths not allowed");
         } else {
            return class02973x;
         }
      }
   }

   public class02973 y() {
      return this.R;
   }

   @Override
   public String getSeparator() {
      return "/";
   }

   @Override
   public Set<String> supportedFileAttributeViews() {
      return y;
   }

   @Override
   public Iterable<Path> getRootDirectories() {
      return List.of(this.R);
   }

   @Override
   public Iterable<FileStore> getFileStores() {
      return List.of(this.u);
   }

   @Override
   public UserPrincipalLookupService getUserPrincipalLookupService() {
      throw new UnsupportedOperationException();
   }

   @Override
   public PathMatcher getPathMatcher(String var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public WatchService newWatchService() {
      throw new UnsupportedOperationException();
   }

   public FileStore N() {
      return this.u;
   }

   private static class02973 N(class02991 var0, class02993 var1, String var2, @Nullable class02973 var3) {
      Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap();
      class02973 class02973 = new class02973(var1, var2, var3, new class02994(object2objectopenhashmap));
      var0.y().forEach((var3x, var4x) -> object2objectopenhashmap.put(var3x, new class02973(var1, var3x, class02973, new class10087(var4x))));
      var0.N().forEach((var3x, var4x) -> object2objectopenhashmap.put(var3x, N(var4x, var1, var3x, class02973)));
      object2objectopenhashmap.trim();
      return class02973;
   }
}
