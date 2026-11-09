package minecraft;

import java.io.IOException;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessDeniedException;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.StandardOpenOption;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class class02970 extends FileSystemProvider {
   public static final String N = "x-mc-link";

   class02970() {
      super();
   }

   @Override
   public boolean isHidden(Path var1) {
      return false;
   }

   @Override
   public void delete(Path var1) {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public void checkAccess(Path var1, AccessMode... var2) throws IOException {
      if (var2.length == 0 && !N(var1).M()) {
         throw new NoSuchFileException(var1.toString());
      } else {
         AccessMode[] aaccessmode = var2;
         int i = var2.length;
         int j = 0;

         while (j < i) {
            AccessMode accessmode = aaccessmode[j];
            switch (accessmode) {
               case READ:
                  if (!N(var1).M()) {
                     throw new NoSuchFileException(var1.toString());
                  }
               default:
                  j++;
                  break;
               case EXECUTE:
               case WRITE:
                  throw new AccessDeniedException(accessmode.toString());
            }
         }
      }
   }

   @Override
   public void copy(Path var1, Path var2, CopyOption... var3) {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public String getScheme() {
      return "x-mc-link";
   }

   @Override
   public Path getPath(URI var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void createDirectory(Path var1, FileAttribute<?>... var2) {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public FileSystem getFileSystem(URI var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isSameFile(Path var1, Path var2) {
      return var1 instanceof class02973 && var2 instanceof class02973 && var1.equals(var2);
   }

   @Override
   public FileSystem newFileSystem(URI var1, Map<String, ?> var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public SeekableByteChannel newByteChannel(Path var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      if (!var2.contains(StandardOpenOption.CREATE_NEW)
         && !var2.contains(StandardOpenOption.CREATE)
         && !var2.contains(StandardOpenOption.APPEND)
         && !var2.contains(StandardOpenOption.WRITE)) {
         Path path = N(var1).toAbsolutePath().B();
         if (path == null) {
            throw new NoSuchFileException(var1.toString());
         } else {
            return Files.newByteChannel(path, var2, var3);
         }
      } else {
         throw new UnsupportedOperationException();
      }
   }

   @Override
   public FileStore getFileStore(Path var1) {
      return N(var1).getFileSystem().N();
   }

   @Override
   public DirectoryStream<Path> newDirectoryStream(Path var1, Filter<? super Path> var2) throws IOException {
      class02994 class02994 = N(var1).toAbsolutePath().Z();
      if (class02994 == null) {
         throw new NotDirectoryException(var1.toString());
      } else {
         return new class02975(this, class02994, var2);
      }
   }

   @Override
   public void setAttribute(Path var1, String var2, Object var3, LinkOption... var4) {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public Map<String, Object> readAttributes(Path var1, String var2, LinkOption... var3) {
      throw new UnsupportedOperationException();
   }

   @Override
   public <A extends BasicFileAttributes> A readAttributes(Path var1, Class<A> var2, LinkOption... var3) throws IOException {
      class02973 class02973 = N(var1).toAbsolutePath();
      if (var2 == BasicFileAttributes.class) {
         return (A)class02973.U();
      } else {
         throw new UnsupportedOperationException("Attributes of type " + var2.getName() + " not supported");
      }
   }

   private static class02973 N(@Nullable Path var0) {
      if (var0 == null) {
         throw new NullPointerException();
      } else if (var0 instanceof class02973) {
         return (class02973)var0;
      } else {
         throw new ProviderMismatchException();
      }
   }

   @Nullable
   @Override
   public <V extends FileAttributeView> V getFileAttributeView(Path var1, Class<V> var2, LinkOption... var3) {
      class02973 class02973 = N(var1);
      return (V)(var2 == BasicFileAttributeView.class ? class02973.z() : null);
   }

   @Override
   public void move(Path var1, Path var2, CopyOption... var3) {
      throw new ReadOnlyFileSystemException();
   }
}
