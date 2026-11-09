package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.hash.HashCode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;

record class07096(String version, ImmutableMap<Path, HashCode> data) {

   public ImmutableMap<Path, HashCode> L() {
      return this.data;
   }

   class07096(String version, ImmutableMap<Path, HashCode> data) {
      this.version = version;
      this.data = data;
   }

   private static String y(String var0) {
      return var0.replace('\\', '/');
   }

   public String y() {
      return this.version;
   }

   private ImmutableSet N(ImmutableSet var1) {
      return var1.stream().sorted(Entry.comparingByKey(Comparator.comparing(var0 -> y(var0.toString())))).collect(ImmutableSet.toImmutableSet());
   }

   private String N(String var1) {
      return y(var1);
   }

   public static class07096 N(Path var0, Path var1) throws IOException {
      class07096 class07096;
      try (BufferedReader bufferedreader = Files.newBufferedReader(var1, StandardCharsets.UTF_8)) {
         String s = bufferedreader.readLine();
         if (!s.startsWith("// ")) {
            throw new IllegalStateException("Missing cache file header");
         }

         String[] astring = s.substring("// ".length()).split("\t", 2);
         String s1 = astring[0];
         Builder builder = ImmutableMap.builder();
         bufferedreader.lines().forEach(var2x -> {
            int i = var2x.indexOf(32);
            builder.put(var0.resolve(var2x.substring(i + 1)), HashCode.fromString(var2x.substring(0, i)));
         });
         class07096 = new class07096(s1, builder.build());
      }

      return class07096;
   }

   public void N(Path var1, Path var2, String var3) {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var2, StandardCharsets.UTF_8)) {
         bufferedwriter.write("// ");
         bufferedwriter.write(this.version);
         bufferedwriter.write(9);
         bufferedwriter.write(var3);
         bufferedwriter.newLine();
         UnmodifiableIterator unmodifiableiterator = this.N(this.data.entrySet()).iterator();

         while (unmodifiableiterator.hasNext()) {
            Entry entry = (Entry)unmodifiableiterator.next();
            bufferedwriter.write(((HashCode)entry.getValue()).toString());
            bufferedwriter.write(32);
            bufferedwriter.write(this.N(var1.relativize((Path)entry.getKey()).toString()));
            bufferedwriter.newLine();
         }
      } catch (IOException ioexception) {
         class07104.N.warn("Unable write cachefile {}: {}", var2, ioexception);
      }
   }

   public int N() {
      return this.data.size();
   }

   @Nullable
   public HashCode N(Path var1) {
      return (HashCode)this.data.get(var1);
   }
}
