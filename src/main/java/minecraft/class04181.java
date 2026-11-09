package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class class04181<T> {
   private final class04173 N;

   @Nullable
   protected abstract T L(Path var1) throws IOException;

   protected class04181(class04173 var1) {
      super();
      this.N = var1;
   }

   @Nullable
   protected abstract T u(Path var1) throws IOException;

   @Nullable
   public T N(Path var1, List<class04168> var2) throws IOException {
      Path path = var1;

      BasicFileAttributes basicfileattributes;
      try {
         basicfileattributes = Files.readAttributes(var1, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
      } catch (NoSuchFileException nosuchfileexception) {
         return null;
      }

      if (basicfileattributes.isSymbolicLink()) {
         this.N.N(var1, var2);
         if (!var2.isEmpty()) {
            return null;
         }

         path = Files.readSymbolicLink(var1);
         basicfileattributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
      }

      if (basicfileattributes.isDirectory()) {
         this.N.y(path, var2);
         if (!var2.isEmpty()) {
            return null;
         } else {
            return !Files.isRegularFile(path.resolve("pack.mcmeta")) ? null : this.L(path);
         }
      } else {
         return basicfileattributes.isRegularFile() && path.getFileName().toString().endsWith(".zip") ? this.u(path) : null;
      }
   }
}
