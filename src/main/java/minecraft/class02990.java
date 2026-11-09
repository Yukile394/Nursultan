package minecraft;

import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

class class02990 implements BasicFileAttributeView {
   class02990(class02973 var1) {
      super();
      this.N = var1;
   }

   @Override
   public String name() {
      return "basic";
   }

   @Override
   public void setTimes(FileTime var1, FileTime var2, FileTime var3) {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public BasicFileAttributes readAttributes() throws IOException {
      return this.N.U();
   }
}
