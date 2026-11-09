package minecraft;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;

class class01591 implements AutoCloseable {
   final File N;
   @Nullable
   private ZipFile y;
   private boolean L;

   class01591(File var1) {
      super();
      this.N = var1;
   }

   @Override
   protected void finalize() throws Throwable {
      this.close();
      super.finalize();
   }

   @Override
   public void close() {
      if (this.y != null) {
         IOUtils.closeQuietly(this.y);
         this.y = null;
      }
   }

   @Nullable
   ZipFile N() {
      if (this.L) {
         return null;
      } else {
         if (this.y == null) {
            try {
               this.y = new ZipFile(this.N);
            } catch (IOException ioexception) {
               class01597.N.error("Failed to open pack {}", this.N, ioexception);
               this.L = true;
               return null;
            }
         }

         return this.y;
      }
   }
}
