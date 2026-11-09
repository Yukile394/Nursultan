package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.EOFException;
import java.io.IOException;
import org.jspecify.annotations.Nullable;

class class04232<T> implements class04239<T> {
   class04232(JsonReader var1, Codec var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void close() throws IOException {
      this.N.close();
   }

   @Nullable
   @Override
   public T N() throws IOException {
      try {
         if (!this.N.hasNext()) {
            return null;
         } else {
            JsonElement jsonelement = JsonParser.parseReader(this.N);
            return (T)this.y.parse(JsonOps.INSTANCE, jsonelement).getOrThrow(IOException::new);
         }
      } catch (JsonParseException jsonparseexception) {
         throw new IOException(jsonparseexception);
      } catch (EOFException eofexception) {
         return null;
      }
   }
}
