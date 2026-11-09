package minecraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public class class00280 {
   private static final long N = 5368709120L;
   private static final String y = "world";
   private final BooleanSupplier L;
   private final Path u;

   private class00280(Path var1, BooleanSupplier var2) {
      super();
      this.L = var2;
      this.u = var1;
   }

   private void N(long var1) {
      if (var1 > 5368709120L) {
         throw new class08724(5368709120L);
      }
   }

   private void N(TarArchiveOutputStream var1, Path var2, String var3, boolean var4) throws IOException {
      if (this.L.getAsBoolean()) {
         throw new class08730();
      } else {
         this.N(var1.getBytesWritten());
         File file1 = var2.toFile();
         String s = var4 ? var3 : var3 + file1.getName();
         TarArchiveEntry tararchiveentry = new TarArchiveEntry(file1, s);
         var1.putArchiveEntry(tararchiveentry);
         if (file1.isFile()) {
            try (FileInputStream fileinputstream = new FileInputStream(file1)) {
               fileinputstream.transferTo(var1);
            }

            var1.closeArchiveEntry();
         } else {
            var1.closeArchiveEntry();
            File[] afile = file1.listFiles();
            if (afile != null) {
               for (File file2 : afile) {
                  this.N(var1, file2.toPath(), s + "/", false);
               }
            }
         }
      }
   }

   private File N() throws IOException {
      TarArchiveOutputStream tararchiveoutputstream = null;

      File file2;
      try {
         File file1 = File.createTempFile("realms-upload-file", ".tar.gz");
         tararchiveoutputstream = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream(file1)));
         tararchiveoutputstream.setLongFileMode(3);
         this.N(tararchiveoutputstream, this.u, "world", true);
         if (this.L.getAsBoolean()) {
            throw new class08730();
         }

         tararchiveoutputstream.finish();
         this.N(file1.length());
         file2 = file1;
      } finally {
         if (tararchiveoutputstream != null) {
            tararchiveoutputstream.close();
         }
      }

      return file2;
   }

   public static File N(Path var0, BooleanSupplier var1) throws IOException {
      return new class00280(var0, var1).N();
   }
}
