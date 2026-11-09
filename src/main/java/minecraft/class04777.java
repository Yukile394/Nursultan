package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04777 {
   public static final Logger N = LogUtils.getLogger();
   public static final String y = "Data";
   private static final PathMatcher i = var0 -> false;
   public static final String L = "allowed_symlinks.txt";
   private static final int R = 67108864;
   private final Path M;
   private final Path B;
   final DataFixer u;
   private final class04173 Z;

   public Path L(String var1) {
      return this.M.resolve(var1);
   }

   static class07001 L(Path var0) throws IOException {
      return class07742.N(var0, class07726.y());
   }

   public Path L() {
      return this.M;
   }

   public class04777(Path var1, Path var2, class04173 var3, DataFixer var4) {
      super();
      this.u = var4;

      try {
         class06290.L(var1);
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }

      this.M = var1;
      this.B = var2;
      this.Z = var3;
   }

   public class04785 i(String var1) throws IOException {
      Path path = this.L(var1);
      return new class04785(this, var1, path);
   }

   public class04173 i() {
      return this.Z;
   }

   @Nullable
   private static class07709 i(Path var0) throws IOException {
      class03526 class03526 = new class03526(new class03152("Data", class07001.y, "Player"), new class03152("Data", class07001.y, "WorldGenSettings"));
      class07742.N(var0, class03526, class07726.y());
      return class03526.u();
   }

   public class04785 u(String var1) throws IOException, class04151 {
      Path path = this.L(var1);
      List<class04168> list = this.Z.N(path, true);
      if (!list.isEmpty()) {
         throw new class04151(path, list);
      } else {
         return new class04785(this, var1, path);
      }
   }

   @Nullable
   static Instant u(Path var0) {
      try {
         return Files.getLastModifiedTime(var0).toInstant();
      } catch (IOException ioexception) {
         return null;
      }
   }

   public Path u() {
      return this.B;
   }

   public boolean y(String var1) {
      try {
         return Files.isDirectory(this.L(var1));
      } catch (InvalidPathException invalidpathexception) {
         return false;
      }
   }

   public class04749 y() throws class01091 {
      if (!Files.isDirectory(this.M)) {
         throw new class01091(class00392.L("selectWorld.load_folder_access"));
      } else {
         try {
            class04749 class04749;
            try (Stream<Path> stream = Files.list(this.M)) {
               List list = stream.filter(var0 -> Files.isDirectory(var0))
                  .map(class04779::new)
                  .filter(var0 -> Files.isRegularFile(var0.y()) || Files.isRegularFile(var0.L()))
                  .toList();
               class04749 = new class04749(list);
            }

            return class04749;
         } catch (IOException ioexception) {
            throw new class01091(class00392.L("selectWorld.load_folder_access"));
         }
      }
   }

   private static class03767 y(Dynamic<?> var0) {
      Set set = var0.get("enabled_features").asStream().flatMap(var0x -> var0x.asString().result().map(class01894::L).stream()).collect(Collectors.toSet());
      return class03794.i.N(set, var0x -> {});
   }

   public static class04777 y(Path var0) {
      class04173 class04173 = N(var0.resolve("allowed_symlinks.txt"));
      return new class04777(var0, var0.resolve("../backups"), class04173, class04999.N());
   }

   public static class04173 N(Path var0) {
      if (Files.exists(var0)) {
         try {
            class04173 class04173;
            try (BufferedReader bufferedreader = Files.newBufferedReader(var0)) {
               class04173 = new class04173(class04153.N(bufferedreader));
            }

            return class04173;
         } catch (Exception exception) {
            N.error("Failed to parse {}, disallowing all symbolic links", "allowed_symlinks.txt", exception);
         }
      }

      return new class04173(i);
   }

   public boolean N(String var1) {
      try {
         Path path = this.L(var1);
         Files.createDirectory(path);
         Files.deleteIfExists(path);
         return true;
      } catch (IOException ioexception) {
         return false;
      }
   }

   public static class03776 N(Dynamic<?> var0) {
      return class03776.L.parse(var0).resultOrPartial(N::error).orElse(class03776.u);
   }

   class06434 N(Dynamic<?> var1, class04779 var2, boolean var3) {
      class05976 class05976 = class05976.N(var1);
      int ix = class05976.N();
      if (ix != 19132 && ix != 19133) {
         throw new class03140("Unknown data version: " + Integer.toHexString(ix));
      } else {
         boolean flag = ix != this.R();
         Path path = var2.u();
         class03776 class03776 = N(var1);
         class07312 class07312 = class07312.N(var1, class03776);
         boolean flag1 = class03794.N(y(var1));
         return new class06434(class07312, class05976, var2.N(), flag, var3, flag1, path);
      }
   }

   private static long N(class04779 var0) {
      Instant instant = u(var0.y());
      if (instant == null) {
         instant = u(var0.L());
      }

      return instant == null ? -1L : instant.toEpochMilli();
   }

   private class06434 N(class04779 var1, boolean var2) {
      Path path = var1.y();
      if (Files.exists(path)) {
         try {
            if (Files.isSymbolicLink(path)) {
               List<class04168> list = this.Z.N(path);
               if (!list.isEmpty()) {
                  N.warn("{}", class04151.N(path, list));
                  return new class06479(var1.N(), var1.u());
               }
            }

            class07709 class07709 = i(path);
            if (class07709 instanceof class07001) {
               class07001 class07001 = ((class07001)class07709).m("Data");
               int ix = class07717.R(class07001);
               Dynamic dynamic = class05715.field_59995.N(this.u, new Dynamic(class07713.N, class07001), ix);
               return this.N(dynamic, var1, var2);
            }

            N.warn("Invalid root tag in {}", path);
         } catch (Exception exception) {
            N.error("Exception reading {}", path, exception);
         }
      }

      return new class06435(var1.N(), var1.u(), N(var1));
   }

   static Dynamic<?> N(Path var0, DataFixer var1) throws IOException {
      class07001 class07001 = L(var0).m("Data");
      int ix = class07717.R(class07001);
      Dynamic dynamic = class05715.field_19212.N(var1, new Dynamic(class07713.N, class07001), ix);
      dynamic = dynamic.update("Player", var2 -> class05715.field_19213.N(var1, var2, ix));
      return dynamic.update("WorldGenSettings", var2 -> class05715.field_24640.N(var1, var2, ix));
   }

   public CompletableFuture<List<class06434>> N(class04749 var1) {
      ArrayList arraylist = new ArrayList(var1.y().size());

      for (class04779 class04779 : var1.y()) {
         arraylist.add(CompletableFuture.supplyAsync(() -> {
            boolean flag;
            try {
               flag = class05323.y(class04779.R());
            } catch (Exception exception) {
               N.warn("Failed to read {} lock", class04779.R(), exception);
               return null;
            }

            try {
               return this.N(class04779, flag);
            } catch (OutOfMemoryError outofmemoryerror1) {
               class04583.y();
               String s = "Ran out of memory trying to read summary of world folder \"" + class04779.N() + "\"";
               N.error(LogUtils.FATAL_MARKER, s);
               OutOfMemoryError outofmemoryerror = new OutOfMemoryError("Ran out of memory reading level data");
               outofmemoryerror.initCause(outofmemoryerror1);
               class07080 class07080 = class07080.N(outofmemoryerror, s);
               class07074 class07074 = class07080.N("World details");
               class07074.N("Folder Name", class04779.N());

               try {
                  long ix = Files.size(class04779.y());
                  class07074.N("level.dat size", ix);
               } catch (IOException ioexception) {
                  class07074.N("level.dat size", (Throwable)ioexception);
               }

               throw new class07878(class07080);
            }
         }, class07536.B().N("loadLevelSummaries")));
      }

      return class07536.i(arraylist).thenApply(var0 -> var0.stream().filter(Objects::nonNull).sorted().toList());
   }

   public static class01898 N(Dynamic<?> var0, class01623 var1, boolean var2) {
      return new class01898(var1, N(var0), var2, false);
   }

   public static class03101 N(Dynamic<?> var0, class03776 var1, class00751<class01255> var2, class01929 var3) {
      Dynamic dynamic = class03519.N(var0, var3);
      Dynamic dynamic1 = dynamic.get("WorldGenSettings").orElseEmptyMap();
      class03796 class03796 = (class03796)class03796.N.parse(dynamic1).getOrThrow();
      class07312 class07312 = class07312.N(dynamic, var1);
      class03781 class03781 = class03796.y().N(var2);
      Lifecycle lifecycle = class03781.N().add(var3.u());
      class06207 class06207 = class06207.N(dynamic, class07312, class03781.u(), class03796.N(), lifecycle);
      return new class03101(class06207, class03781);
   }

   public String N() {
      return "Anvil";
   }

   private int R() {
      return 19133;
   }
}
