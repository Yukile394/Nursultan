package minecraft;

import Nursultan.class10739;
import Nursultan.class10741;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07357 implements AutoCloseable {
   private static final Logger i = LogUtils.getLogger();
   private static final int R = 4096;
   protected static final int N = 1024;
   private static final int M = 5;
   private static final int B = 0;
   private static final ByteBuffer Z = ByteBuffer.allocateDirect(1);
   private static final String z = ".mcc";
   private static final int U = 128;
   private static final int E = 256;
   private static final int W = 0;
   public final class02277 y;
   private final Path m;
   private final FileChannel P;
   private final Path s;
   public final class05530 L;
   private final ByteBuffer T = ByteBuffer.allocateDirect(8192);
   private final IntBuffer b;
   private final IntBuffer j;
   protected final class05495 u = new class05495();

   private static int L() {
      return (int)(class07536.i() / 1000L);
   }

   private static int L(int var0) {
      return (var0 + 4096 - 1) / 4096;
   }

   public DataOutputStream L(class07321 var1) throws IOException {
      return new DataOutputStream(this.L.N(new class10739(this, var1)));
   }

   private int M(class07321 var1) {
      return this.b.get(B(var1));
   }

   public class07357(class02277 var1, Path var2, Path var3, boolean var4) throws IOException {
      this(var1, var2, var3, class05530.N(), var4);
   }

   public class07357(class02277 var1, Path var2, Path var3, class05530 var4, boolean var5) throws IOException {
      super();
      this.y = var1;
      this.m = var2;
      this.L = var4;
      if (!Files.isDirectory(var3)) {
         throw new IllegalArgumentException("Expected directory, got " + var3.toAbsolutePath());
      } else {
         this.s = var3;
         this.b = this.T.asIntBuffer();
         this.b.limit(1024);
         this.T.position(4096);
         this.j = this.T.asIntBuffer();
         if (var5) {
            this.P = FileChannel.open(var2, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC);
         } else {
            this.P = FileChannel.open(var2, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
         }

         this.u.N(0, 2);
         this.T.position(0);
         int ix = this.P.read(this.T, 0L);
         if (ix != -1) {
            if (ix != 8192) {
               i.warn("Region file {} has truncated header: {}", var2, ix);
            }

            long jx = Files.size(var2);

            for (int k = 0; k < 1024; k++) {
               int l = this.b.get(k);
               if (l != 0) {
                  int i1 = y(l);
                  int j1 = N(l);
                  if (i1 < 2) {
                     i.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", new Object[]{var2, k, i1});
                     this.b.put(k, 0);
                  } else if (j1 == 0) {
                     i.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", var2, k);
                     this.b.put(k, 0);
                  } else if (i1 * 4096L > jx) {
                     i.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", new Object[]{var2, k, i1});
                     this.b.put(k, 0);
                  } else {
                     this.u.N(i1, j1);
                  }
               }
            }
         }
      }
   }

   private static int B(class07321 var0) {
      return var0.U() + var0.E() * 32;
   }

   private void i() throws IOException {
      this.T.position(0);
      this.P.write(this.T, 0L);
   }

   public boolean i(class07321 var1) {
      return this.M(var1) != 0;
   }

   @Override
   public void close() throws IOException {
      try {
         this.R();
      } finally {
         try {
            this.P.force(true);
         } finally {
            this.P.close();
         }
      }
   }

   public void u(class07321 var1) throws IOException {
      int ix = B(var1);
      int jx = this.b.get(ix);
      if (jx != 0) {
         this.b.put(ix, 0);
         this.j.put(ix, L());
         this.i();
         Files.deleteIfExists(this.R(var1));
         this.u.y(y(jx), N(jx));
      }
   }

   private ByteBuffer u() {
      ByteBuffer bytebuffer = ByteBuffer.allocate(5);
      bytebuffer.putInt(1);
      bytebuffer.put((byte)(this.L.y() | 128));
      bytebuffer.flip();
      return bytebuffer;
   }

   public void y() throws IOException {
      this.P.force(true);
   }

   public boolean y(class07321 var1) {
      int ix = this.M(var1);
      if (ix == 0) {
         return false;
      } else {
         int jx = y(ix);
         int k = N(ix);
         ByteBuffer bytebuffer = ByteBuffer.allocate(5);

         try {
            this.P.read(bytebuffer, jx * 4096);
            bytebuffer.flip();
            if (bytebuffer.remaining() != 5) {
               return false;
            } else {
               int l = bytebuffer.getInt();
               byte b0 = bytebuffer.get();
               if (N(b0)) {
                  if (!class05530.y(y(b0))) {
                     return false;
                  }

                  if (!Files.isRegularFile(this.R(var1))) {
                     return false;
                  }
               } else {
                  if (!class05530.y(b0)) {
                     return false;
                  }

                  if (l == 0) {
                     return false;
                  }

                  int i1 = l - 1;
                  if (i1 < 0 || i1 > 4096 * k) {
                     return false;
                  }
               }

               return true;
            }
         } catch (IOException ioexception) {
            return false;
         }
      }
   }

   private static int y(int var0) {
      return var0 >> 8 & 16777215;
   }

   private static byte y(byte var0) {
      return (byte)(var0 & -129);
   }

   @Nullable
   private DataInputStream N(class07321 var1, byte var2) throws IOException {
      Path path = this.R(var1);
      if (!Files.isRegularFile(path)) {
         i.error("External chunk path {} is not file", path);
         return null;
      } else {
         return this.N(var1, var2, Files.newInputStream(path));
      }
   }

   public synchronized void N(class07321 var1, ByteBuffer var2) throws IOException {
      int ix = B(var1);
      int jx = this.b.get(ix);
      int k = y(jx);
      int l = N(jx);
      int i1 = var2.remaining();
      int j1 = L(i1);
      int k1;
      class10741 class10741;
      if (j1 >= 256) {
         Path path = this.R(var1);
         i.warn("Saving oversized chunk {} ({} bytes} to external file {}", new Object[]{var1, i1, path});
         j1 = 1;
         k1 = this.u.N(j1);
         class10741 = this.N(path, var2);
         ByteBuffer bytebuffer = this.u();
         this.P.write(bytebuffer, k1 * 4096);
      } else {
         k1 = this.u.N(j1);
         class10741 = () -> Files.deleteIfExists(this.R(var1));
         this.P.write(var2, k1 * 4096);
      }

      this.b.put(ix, this.N(k1, j1));
      this.j.put(ix, L());
      this.i();
      class10741.run();
      if (k != 0) {
         this.u.y(k, l);
      }
   }

   private static ByteArrayInputStream N(ByteBuffer var0, int var1) {
      return new ByteArrayInputStream(var0.array(), var0.position(), var1);
   }

   @Nullable
   private DataInputStream N(class07321 var1, byte var2, InputStream var3) throws IOException {
      class05530 class05530 = class05530.N(var2);
      if (class05530 == class05530.i) {
         String sx = new DataInputStream(var3).readUTF();
         class01894 class01894 = class01894.L(sx);
         if (class01894 != null) {
            i.error("Unrecognized custom compression {}", class01894);
            return null;
         } else {
            i.error("Invalid custom compression id {}", sx);
            return null;
         }
      } else if (class05530 == null) {
         i.error("Chunk {} has invalid chunk stream version {}", var1, var2);
         return null;
      } else {
         return new DataInputStream(class05530.N(var3));
      }
   }

   public Path N() {
      return this.m;
   }

   @Nullable
   public synchronized DataInputStream N(class07321 var1) throws IOException {
      int ix = this.M(var1);
      if (ix == 0) {
         return null;
      } else {
         int jx = y(ix);
         int k = N(ix) * 4096;
         ByteBuffer bytebuffer = ByteBuffer.allocate(k);
         this.P.read(bytebuffer, jx * 4096);
         bytebuffer.flip();
         if (bytebuffer.remaining() < 5) {
            i.error("Chunk {} header is truncated: expected {} but read {}", new Object[]{var1, k, bytebuffer.remaining()});
            return null;
         } else {
            int l = bytebuffer.getInt();
            byte b0 = bytebuffer.get();
            if (l == 0) {
               i.warn("Chunk {} is allocated, but stream is missing", var1);
               return null;
            } else {
               int i1 = l - 1;
               if (N(b0)) {
                  if (i1 != 0) {
                     i.warn("Chunk has both internal and external streams");
                  }

                  return this.N(var1, y(b0));
               } else if (i1 > bytebuffer.remaining()) {
                  i.error("Chunk {} stream is truncated: expected {} but read {}", new Object[]{var1, i1, bytebuffer.remaining()});
                  return null;
               } else if (i1 < 0) {
                  i.error("Declared size {} of chunk {} is negative", l, var1);
                  return null;
               } else {
                  class01834.M.N(this.y, var1, this.L, i1);
                  return this.N(var1, b0, N(bytebuffer, i1));
               }
            }
         }
      }
   }

   private static boolean N(byte var0) {
      return (var0 & 128) != 0;
   }

   private int N(int var1, int var2) {
      return var1 << 8 | var2;
   }

   private class10741 N(Path var1, ByteBuffer var2) throws IOException {
      Path path = Files.createTempFile(this.s, "tmp", null);

      try (FileChannel filechannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
         var2.position(5);
         filechannel.write(var2);
      }

      return () -> Files.move(path, var1, StandardCopyOption.REPLACE_EXISTING);
   }

   private static int N(int var0) {
      return var0 & 0xFF;
   }

   private Path R(class07321 var1) {
      String sx = "c." + var1.B + "." + var1.Z + ".mcc";
      return this.s.resolve(sx);
   }

   private void R() throws IOException {
      int ix = (int)this.P.size();
      int jx = L(ix) * 4096;
      if (ix != jx) {
         ByteBuffer bytebuffer = Z.duplicate();
         bytebuffer.position(0);
         this.P.write(bytebuffer, jx - 1);
      }
   }
}
