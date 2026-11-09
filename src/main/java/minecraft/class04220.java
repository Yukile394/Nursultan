package minecraft;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;

public class class04220<T> implements Closeable {
   private static final Gson y = new Gson();
   private final Codec<T> L;
   final FileChannel N;
   private final AtomicInteger u = new AtomicInteger(1);

   public class04220(Codec<T> var1, FileChannel var2) {
      super();
      this.L = var1;
      this.N = var2;
   }

   @Override
   public void close() throws IOException {
      this.y();
   }

   void y() throws IOException {
      if (this.u.decrementAndGet() <= 0) {
         this.N.close();
      }
   }

   public class04239<T> N() throws IOException {
      if (this.u.get() <= 0) {
         throw new IOException("Event log has already been closed");
      } else {
         this.u.incrementAndGet();
         class04239 class04239 = class04239.N(this.L, Channels.newReader(this.N, StandardCharsets.UTF_8));
         return new class04228<>(this, class04239);
      }
   }

   public void N(T var1) throws IOException {
      JsonElement jsonelement = (JsonElement)this.L.encodeStart(JsonOps.INSTANCE, var1).getOrThrow(IOException::new);
      this.N.position(this.N.size());
      Writer writer = Channels.newWriter(this.N, StandardCharsets.UTF_8);
      y.toJson(jsonelement, y.newJsonWriter(writer));
      writer.write(10);
      writer.flush();
   }

   public static <T> class04220<T> N(Codec<T> var0, Path var1) throws IOException {
      FileChannel filechannel = FileChannel.open(var1, StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
      return new class04220<>(var0, filechannel);
   }
}
