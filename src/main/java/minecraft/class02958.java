package minecraft;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileStoreAttributeView;
import org.jspecify.annotations.Nullable;

class class02958 extends FileStore {
   private final String N;

   public class02958(String var1) {
      super();
      this.N = var1;
   }

   @Override
   public String name() {
      return this.N;
   }

   @Override
   public String type() {
      return "index";
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public Object getAttribute(String var1) throws IOException {
      throw new UnsupportedOperationException();
   }

   @Override
   public long getTotalSpace() {
      return 0L;
   }

   @Override
   public long getUsableSpace() {
      return 0L;
   }

   @Override
   public long getUnallocatedSpace() {
      return 0L;
   }

   @Override
   public boolean supportsFileAttributeView(String var1) {
      return "basic".equals(var1);
   }

   @Override
   public boolean supportsFileAttributeView(Class<? extends FileAttributeView> var1) {
      return var1 == BasicFileAttributeView.class;
   }

   @Nullable
   @Override
   public <V extends FileStoreAttributeView> V getFileStoreAttributeView(Class<V> var1) {
      return null;
   }
}
