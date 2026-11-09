package minecraft;

import com.google.gson.Strictness;
import com.google.gson.stream.JsonReader;
import com.mojang.serialization.Codec;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import org.jspecify.annotations.Nullable;

public interface class04239<T> extends Closeable {
   static <T> class04239<T> N(Codec<T> var0, Reader var1) {
      JsonReader jsonreader = new JsonReader(var1);
      jsonreader.setStrictness(Strictness.LENIENT);
      return new class04232<>(jsonreader, var0);
   }

   @Nullable
   T N() throws IOException;
}
