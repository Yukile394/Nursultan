package minecraft;

import java.io.IOException;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import org.jspecify.annotations.Nullable;

public record class04209(Path path, class04215 id) implements class04200 {
   @Override
   public Path L() {
      return this.path;
   }

   public class04209(Path path, class04215 id) {
      super();
      this.path = path;
      this.id = id;
   }

   public FileChannel i() throws IOException {
      return FileChannel.open(this.path, StandardOpenOption.WRITE, StandardOpenOption.READ);
   }

   @Override
   public class04215 u() {
      return this.id;
   }

   @Override
   public class04213 y() throws IOException {
      Path pathx = this.path.resolveSibling(this.path.getFileName().toString() + ".gz");
      class04242.N(this.path, pathx);
      return new class04213(pathx, this.id);
   }

   @Nullable
   @Override
   public Reader N() throws IOException {
      return Files.exists(this.path) ? Files.newBufferedReader(this.path) : null;
   }
}
