package minecraft;

import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06887 implements class07135 {
   private static final Logger N = LogUtils.getLogger();
   private final Iterable<Path> i;
   private final class01996 R;

   public class06887(class01996 var1, Collection<Path> var2) {
      super();
      this.i = var2;
      this.R = var1;
   }

   private static String N(Path var0, Path var1) {
      String s = var0.relativize(var1).toString().replaceAll("\\\\", "/");
      return s.substring(0, s.length() - ".nbt".length());
   }

   public static void N(class04476 var0, Path var1, String var2) throws IOException {
      ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
      HashingOutputStream hashingoutputstream = new HashingOutputStream(Hashing.sha1(), bytearrayoutputstream);
      hashingoutputstream.write(var2.getBytes(StandardCharsets.UTF_8));
      hashingoutputstream.write(10);
      var0.method_43346(var1, bytearrayoutputstream.toByteArray(), hashingoutputstream.hash());
   }

   @Nullable
   public static Path N(class04476 var0, Path var1, String var2, Path var3) {
      try {
         Path path1;
         try (
            InputStream inputstream = Files.newInputStream(var1);
            class03172 class03172 = new class03172(inputstream);
         ) {
            Path path = var3.resolve(var2 + ".snbt");
            N(var0, path, class07717.N(class07742.N_82(class03172, class07726.L())));
            N.info("Converted {} from NBT to SNBT", var2);
            path1 = path;
         }

         return path1;
      } catch (IOException ioexception) {
         N.error("Couldn't convert {} from NBT to SNBT at {}", new Object[]{var2, var1, ioexception});
         return null;
      }
   }

   @Override
   public String method_10321() {
      return "NBT -> SNBT";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      Path path = this.R.method_45971();
      ArrayList arraylist = new ArrayList();

      for (Path path1 : this.i) {
         arraylist.add(
            CompletableFuture.<CompletableFuture<Void>>supplyAsync(
                  () -> {
                     try {
                        CompletableFuture<Void> completablefuture;
                        try (Stream<Path> stream = Files.walk(path1)) {
                           completablefuture = CompletableFuture.allOf(
                              stream.filter(var0x -> var0x.toString().endsWith(".nbt"))
                                 .map(var3x -> CompletableFuture.runAsync(() -> N(var1, var3x, N(path1, var3x), path), class07536.Z()))
                                 .toArray(CompletableFuture[]::new)
                           );
                        }

                        return completablefuture;
                     } catch (IOException ioexception) {
                        N.error("Failed to read structure input directory", ioexception);
                        return CompletableFuture.completedFuture(null);
                     }
                  },
                  class07536.B().N("NbtToSnbt")
               )
               .thenCompose(var0 -> (CompletionStage<Void>)var0)
         );
      }

      return CompletableFuture.allOf(arraylist.toArray(CompletableFuture[]::new));
   }
}
