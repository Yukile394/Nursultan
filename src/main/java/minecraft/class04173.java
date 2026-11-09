package minecraft;

import Nursultan.class10322;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class class04173 {
   private final PathMatcher N;

   public class04173(PathMatcher var1) {
      super();
      this.N = var1;
   }

   public void y(Path var1, List<class04168> var2) throws IOException {
      Files.walkFileTree(var1, new class10322(this, var2));
   }

   public void N(Path var1, List<class04168> var2) throws IOException {
      Path path = Files.readSymbolicLink(var1);
      if (!this.N.matches(path)) {
         var2.add(new class04168(var1, path));
      }
   }

   public List<class04168> N(Path var1, boolean var2) throws IOException {
      ArrayList arraylist = new ArrayList();

      BasicFileAttributes basicfileattributes;
      try {
         basicfileattributes = Files.readAttributes(var1, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
      } catch (NoSuchFileException nosuchfileexception) {
         return arraylist;
      }

      if (basicfileattributes.isRegularFile()) {
         throw new IOException("Path " + var1 + " is not a directory");
      } else {
         if (basicfileattributes.isSymbolicLink()) {
            if (!var2) {
               this.N(var1, arraylist);
               return arraylist;
            }

            var1 = Files.readSymbolicLink(var1);
         }

         this.y(var1, arraylist);
         return arraylist;
      }
   }

   public List<class04168> N(Path var1) throws IOException {
      ArrayList arraylist = new ArrayList();
      this.N(var1, arraylist);
      return arraylist;
   }
}
