package minecraft;

import Nursultan.class09450;
import Nursultan.class09453;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class01224 {
   private static final Logger y = LogUtils.getLogger();
   public static final String N = "structure";
   private static final String L = "structures";
   private static final String u = ".nbt";
   private static final String i = ".snbt";
   private final Map<class01894, Optional<class01207>> R = Maps.newConcurrentMap();
   private final DataFixer M;
   private class01089 B;
   private final Path Z;
   private final List<class09450> z;
   private final class02055<class00891> U;
   private static final class03069 E = new class03069("structure", ".nbt");

   public boolean L(class01894 var1) {
      Optional<class01207> optional = this.R.get(var1);
      if (optional.isEmpty()) {
         return false;
      } else {
         class01207 class01207 = optional.get();
         Path path = this.N(var1, class07529.V ? ".snbt" : ".nbt");
         Path path1 = path.getParent();
         if (path1 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists(path1) ? path1.toRealPath() : path1);
            } catch (IOException ioexception) {
               y.error("Failed to create parent directory: {}", path1);
               return false;
            }

            class07001 class07001 = class01207.N(new class07001());
            if (class07529.V) {
               try {
                  class06887.N(class04476.N, path, class07717.N(class07001));
               } catch (Throwable throwable1) {
                  return false;
               }
            } else {
               try (FileOutputStream fileoutputstream = new FileOutputStream(path.toFile())) {
                  class07742.N(class07001, fileoutputstream);
               } catch (Throwable throwable) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private Stream<class01894> L() {
      if (!Files.isDirectory(class05514.L)) {
         return Stream.empty();
      } else {
         ArrayList arraylist = new ArrayList();
         this.N(class05514.L, "minecraft", ".snbt", arraylist::add);
         return arraylist.stream();
      }
   }

   private Optional<class01207> M(class01894 var1) {
      return this.N(var1, class05514.L);
   }

   public class01224(class01089 var1, class04785 var2, DataFixer var3, class02055<class00891> var4) {
      super();
      this.B = var1;
      this.M = var3;
      this.Z = var2.N(class05071.Z).normalize();
      this.U = var4;
      Builder builder = ImmutableList.builder();
      builder.add(new class09450(this::B, this::u));
      if (class07529.ND) {
         builder.add(new class09450(this::M, this::L));
      }

      builder.add(new class09450(this::R, this::y));
      this.z = builder.build();
   }

   private Optional<class01207> B(class01894 var1) {
      if (!Files.isDirectory(this.Z)) {
         return Optional.empty();
      } else {
         Path path = this.N(var1, ".nbt");
         return this.N(() -> new FileInputStream(path.toFile()), var1x -> y.error("Couldn't load structure from {}", path, var1x));
      }
   }

   private Optional<class01207> i(class01894 var1) {
      for (class09450 class09450 : this.z) {
         try {
            Optional<class01207> optional = class09450.N().apply(var1);
            if (optional.isPresent()) {
               return optional;
            }
         } catch (Exception exception) {
         }
      }

      return Optional.empty();
   }

   private Stream<class01894> u() {
      if (!Files.isDirectory(this.Z)) {
         return Stream.empty();
      } else {
         try {
            ArrayList arraylist = new ArrayList();

            try (DirectoryStream<Path> directorystream = Files.newDirectoryStream(this.Z, var0 -> Files.isDirectory(var0))) {
               for (Path path : directorystream) {
                  String s = path.getFileName().toString();
                  Path path1 = path.resolve("structures");
                  this.N(path1, s, ".nbt", arraylist::add);
               }
            }

            return arraylist.stream();
         } catch (IOException ioexception) {
            return Stream.empty();
         }
      }
   }

   public void u(class01894 var1) {
      this.R.remove(var1);
   }

   public Optional<class01207> y(class01894 var1) {
      return this.R.computeIfAbsent(var1, this::i);
   }

   private Stream<class01894> y() {
      return E.N(this.B).keySet().stream().map(E::y);
   }

   private Optional<class01207> N(class09453 var1, Consumer<Throwable> var2) {
      try {
         Optional optional;
         try (
            InputStream inputstream = var1.open();
            class03172 class03172 = new class03172(inputstream);
         ) {
            optional = Optional.of(this.N(class03172));
         }

         return optional;
      } catch (FileNotFoundException filenotfoundexception) {
         return Optional.empty();
      } catch (Throwable throwable1) {
         var2.accept(throwable1);
         return Optional.empty();
      }
   }

   private Optional<class01207> N(class01894 var1, Path var2) {
      if (!Files.isDirectory(var2)) {
         return Optional.empty();
      } else {
         Path path = class06290.y(var2, var1.N(), ".snbt");

         try {
            Optional optional;
            try (BufferedReader bufferedreader = Files.newBufferedReader(path)) {
               String s = IOUtils.toString(bufferedreader);
               optional = Optional.of(this.N(class07717.N(s)));
            }

            return optional;
         } catch (NoSuchFileException nosuchfileexception) {
            return Optional.empty();
         } catch (CommandSyntaxException | IOException ioexception) {
            y.error("Couldn't load structure from {}", path, ioexception);
            return Optional.empty();
         }
      }
   }

   private String N(Path var1, Path var2) {
      return var1.relativize(var2).toString().replace(File.separator, "/");
   }

   private void N(Path var1, String var2, String var3, Consumer<class01894> var4) {
      Function function = var1x -> var1x.substring(0, var1x.length() - var0);

      try (Stream<Path> stream = Files.find(var1, Integer.MAX_VALUE, (var1x, var2x) -> var2x.isRegularFile() && var1x.toString().endsWith(var3))) {
         stream.forEach(var5 -> {
            try {
               var4.accept(class01894.N(var2, (String)function.apply(this.N(var1, var5))));
            } catch (class00719 class00719) {
               y.error("Invalid location while listing folder {} contents", var1, class00719);
            }
         });
      } catch (IOException ioexception) {
         y.error("Failed to list folder {} contents", var1, ioexception);
      }
   }

   public Stream<class01894> N() {
      return this.z.stream().flatMap(var0 -> var0.y().get()).distinct();
   }

   public void N(class01089 var1) {
      this.B = var1;
      this.R.clear();
   }

   public Path N(class01894 var1, String var2) {
      if (var1.N().contains("//")) {
         throw new class00719("Invalid resource path: " + var1);
      } else {
         try {
            Path path = this.Z.resolve(var1.y());
            Path path1 = class06290.y(path.resolve("structures"), var1.N(), var2);
            if (path1.startsWith(this.Z) && class06290.N(path1) && class06290.y(path1)) {
               return path1;
            } else {
               throw new class00719("Invalid resource path: " + path1);
            }
         } catch (InvalidPathException invalidpathexception) {
            throw new class00719("Invalid resource path: " + var1, invalidpathexception);
         }
      }
   }

   public class01207 N(class01894 var1) {
      Optional<class01207> optional = this.y(var1);
      if (optional.isPresent()) {
         return optional.get();
      } else {
         class01207 class01207 = new class01207();
         this.R.put(var1, Optional.of(class01207));
         return class01207;
      }
   }

   public class01207 N(class07001 var1) {
      class01207 class01207 = new class01207();
      int ix = class07717.y(var1, 500);
      class01207.N(this.U, class05715.field_19217.N(this.M, var1, ix));
      return class01207;
   }

   private class01207 N(InputStream var1) throws IOException {
      class07001 class07001 = class07742.N_82(var1, class07726.L());
      return this.N(class07001);
   }

   private Optional<class01207> R(class01894 var1) {
      class01894 class01894 = E.N(var1);
      return this.N(() -> this.B.u(class01894), var1x -> y.error("Couldn't load structure {}", var1, var1x));
   }
}
