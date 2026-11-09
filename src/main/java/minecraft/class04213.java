package minecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;
import org.jspecify.annotations.Nullable;

public record class04213(Path path, class04215 id) implements class04200 {
   @Override
   public Path L() {
      return this.path;
   }

   public class04213(Path path, class04215 id) {
      super();
      this.path = path;
      this.id = id;
   }

   @Override
   public class04215 u() {
      return this.id;
   }

   @Override
   public class04213 y() {
      return this;
   }

   @Nullable
   @Override
   public Reader N() throws IOException {
      return !Files.exists(this.path)
         ? null
         : new BufferedReader(new InputStreamReader(new GZIPInputStream(Files.newInputStream(this.path)), StandardCharsets.UTF_8));
   }
}
