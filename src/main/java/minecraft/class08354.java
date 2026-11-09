package minecraft;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.jspecify.annotations.Nullable;

public record class08354(class08280 image, class08500 metadata) implements Closeable {
   public boolean L() {
      return this.metadata != null ? this.metadata.y() : false;
   }

   public class08354(class08280 image, @Nullable class08500 metadata) {
      super();
      this.image = image;
      this.metadata = metadata;
   }

   @Nullable
   public class08500 i() {
      return this.metadata;
   }

   @Override
   public void close() {
      this.image.close();
   }

   public class08280 u() {
      return this.image;
   }

   public boolean y() {
      return this.metadata != null ? this.metadata.N() : false;
   }

   public static class08354 N() {
      return new class08354(class08923.N(), null);
   }

   public static class08354 N(class01089 var0, class01894 var1) throws IOException {
      class01079 class01079 = var0.L(var1);

      class08280 class08280;
      try (InputStream inputstream = class01079.method_14482()) {
         class08280 = class08280.N(inputstream);
      }

      class08500 class08500 = class01079.method_14481().N(class08500.i).orElse(null);
      return new class08354(class08280, class08500);
   }
}
