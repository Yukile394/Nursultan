package minecraft;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.DirectoryStream.Filter;
import java.util.Iterator;

class class02975 implements DirectoryStream<Path> {
   class02975(class02970 var1, class02994 var2, Filter var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   @Override
   public Iterator<Path> iterator() {
      return this.N.N().values().stream().filter(var1 -> {
         try {
            return var0.accept(var1);
         } catch (IOException ioexception) {
            throw new DirectoryIteratorException(ioexception);
         }
      }).map(var0 -> (Path)var0).iterator();
   }

   @Override
   public void close() {
   }
}
