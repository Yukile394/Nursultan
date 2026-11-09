package minecraft;

import Nursultan.class10683;
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class06874 implements class07135 {
   private static final Logger N = LogUtils.getLogger();
   private final class01996 i;
   private final Iterable<Path> R;
   private final List<class06904> M = Lists.newArrayList();

   public class06874(class01996 var1, Iterable<Path> var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   private void N(class04476 var1, class06860 var2, Path var3) {
      Path path = var3.resolve(var2.N() + ".nbt");

      try {
         var1.method_43346(path, var2.y(), var2.L());
      } catch (IOException ioexception) {
         N.error("Couldn't write structure {} at {}", new Object[]{var2.N(), path, ioexception});
      }
   }

   private class07001 N(String var1, class07001 var2) {
      class07001 class07001 = var2;
      Iterator<class06904> iterator = this.M.iterator();

      while (iterator.hasNext()) {
         class07001 = iterator.next().N(var1, class07001);
      }

      return class07001;
   }

   private String N(Path var1, Path var2) {
      String s = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return s.substring(0, s.length() - ".snbt".length());
   }

   private class06860 N(Path var1, String var2) {
      try {
         class06860 class06860;
         try (BufferedReader bufferedreader = Files.newBufferedReader(var1)) {
            String s = IOUtils.toString(bufferedreader);
            class07001 class07001 = this.N(var2, class07717.N(s));
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            HashingOutputStream hashingoutputstream = new HashingOutputStream(Hashing.sha1(), bytearrayoutputstream);
            class07742.N(class07001, hashingoutputstream);
            byte[] abyte = bytearrayoutputstream.toByteArray();
            HashCode hashcode = hashingoutputstream.hash();
            class06860 = new class06860(var2, abyte, hashcode);
         }

         return class06860;
      } catch (Throwable throwable1) {
         throw new class10683(var1, throwable1);
      }
   }

   public class06874 N(class06904 var1) {
      this.M.add(var1);
      return this;
   }

   @Override
   public String method_10321() {
      return "SNBT -> NBT";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      Path path = this.i.method_45971();
      ArrayList arraylist = Lists.newArrayList();

      for (Path path1 : this.R) {
         arraylist.add(
            CompletableFuture.<CompletableFuture<Void>>supplyAsync(
                  () -> {
                     try {
                        CompletableFuture<Void> completablefuture;
                        try (Stream<Path> stream = Files.walk(path1)) {
                           completablefuture = CompletableFuture.allOf(
                              stream.filter(var0 -> var0.toString().endsWith(".snbt")).map(var4x -> CompletableFuture.runAsync(() -> {
                                 class06860 class06860 = this.N(var4x, this.N(path1, var4x));
                                 this.N(var1, class06860, path);
                              }, class07536.B().N("SnbtToNbt"))).toArray(CompletableFuture[]::new)
                           );
                        }

                        return completablefuture;
                     } catch (Exception exception) {
                        throw new RuntimeException("Failed to read structure input directory, aborting", exception);
                     }
                  },
                  class07536.B().N("SnbtToNbt")
               )
               .thenCompose(var0 -> (CompletionStage<Void>)var0)
         );
      }

      return class07536.u(arraylist);
   }
}
