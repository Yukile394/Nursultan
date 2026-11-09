package minecraft;

import Nursultan.class10939;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import net.caffeinemc.mods.sodium.mixin.features.textures.NativeImageAccessor;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public final class class08280 implements AutoCloseable, NativeImageAccessor {
   private static final Logger y = LogUtils.getLogger();
   private static final MemoryPool L = TracyClient.createMemoryPool("NativeImage");
   private static final Set<StandardOpenOption> u = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
   private final class08247 i;
   private final int R;
   private final int M;
   private final boolean B;
   public long N;
   private final long Z;

   private boolean L(int var1, int var2) {
      return var1 < 0 || var1 >= this.R || var2 < 0 || var2 >= this.M;
   }

   public class08247 L() {
      return this.i;
   }

   public void M() {
      class06417.N(this.N);
   }

   public class08280(int var1, int var2, boolean var3) {
      this(class08247.field_4997, var1, var2, var3);
   }

   public class08280(class08247 var1, int var2, int var3, boolean var4, long var5) {
      super();
      if (var2 > 0 && var3 > 0) {
         this.i = var1;
         this.R = var2;
         this.M = var3;
         this.B = var4;
         this.N = var5;
         this.Z = (long)var2 * var3 * var1.N();
      } else {
         throw new IllegalArgumentException("Invalid texture size: " + var2 + "x" + var3);
      }
   }

   public class08280(class08247 var1, int var2, int var3, boolean var4) {
      super();
      if (var2 > 0 && var3 > 0) {
         this.i = var1;
         this.R = var2;
         this.M = var3;
         this.Z = (long)var2 * var3 * var1.N();
         this.B = false;
         if (var4) {
            this.N = MemoryUtil.nmemCalloc(1L, this.Z);
         } else {
            this.N = MemoryUtil.nmemAlloc(this.Z);
         }

         L.malloc(this.N, (int)this.Z);
         if (this.N == 0L) {
            throw new IllegalStateException("Unable to allocate texture of size " + var2 + "x" + var3 + " (" + var1.N() + " channels)");
         }
      } else {
         throw new IllegalArgumentException("Invalid texture size: " + var2 + "x" + var3);
      }
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.i + " " + this.R + "x" + this.M + "@" + this.N + (this.B ? "S" : "N") + "]";
   }

   public long B() {
      return this.N;
   }

   private void Z() {
      if (this.N == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   public int[] i() {
      int[] aint = this.u();

      for (int ix = 0; ix < aint.length; ix++) {
         aint[ix] = class02566.b(aint[ix]);
      }

      return aint;
   }

   @Override
   public void close() {
      if (this.N != 0L) {
         if (this.B) {
            STBImage.nstbi_image_free(this.N);
         } else {
            MemoryUtil.nmemFree(this.N);
         }

         L.free(this.N);
      }

      this.N = 0L;
   }

   private int u(int var1, int var2) {
      if (this.i != class08247.field_4997) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixelRGBA only works on RGBA images; have %s", this.i));
      } else if (this.L(var1, var2)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.R, this.M));
      } else {
         this.Z();
         long ix = (var1 + (long)var2 * this.R) * 4L;
         return MemoryUtil.memGetInt(this.N + ix);
      }
   }

   public int[] u() {
      if (this.i != class08247.field_4997) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "getPixels only works on RGBA images; have %s", this.i));
      } else {
         this.Z();
         int[] aint = new int[this.R * this.M];
         MemoryUtil.memIntBuffer(this.N, this.R * this.M).get(aint);
         return aint;
      }
   }

   public void y(int var1, int var2, int var3) {
      this.N(var1, var2, class02566.T(var3));
   }

   public byte y(int var1, int var2) {
      if (!this.i.P()) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "no luminance or alpha in %s", this.i));
      } else if (this.L(var1, var2)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.R, this.M));
      } else {
         int ix = (var1 + var2 * this.R) * this.i.N() + this.i.j() / 8;
         return MemoryUtil.memGetByte(this.N + ix);
      }
   }

   public int y() {
      return this.M;
   }

   public void N(class08280 var1) {
      if (var1.L() != this.i) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int ix = this.i.N();
         this.Z();
         var1.Z();
         if (this.R == var1.R) {
            MemoryUtil.memCopy(var1.N, this.N, Math.min(this.Z, var1.Z));
         } else {
            int j = Math.min(this.N(), var1.N());
            int k = Math.min(this.y(), var1.y());

            for (int l = 0; l < k; l++) {
               int i1 = l * var1.N() * ix;
               int j1 = l * this.N() * ix;
               MemoryUtil.memCopy(var1.N + i1, this.N + j1, j);
            }
         }
      }
   }

   public void N(int var1, int var2, int var3, int var4, int var5) {
      for (int ix = var2; ix < var2 + var4; ix++) {
         for (int j = var1; j < var1 + var3; j++) {
            this.y(j, ix, var5);
         }
      }
   }

   public void N(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      this.N(this, var1, var2, var1 + var3, var2 + var4, var5, var6, var7, var8);
   }

   private boolean N(WritableByteChannel var1) throws IOException {
      class10939 class10939 = new class10939(var1);

      boolean flag;
      try {
         int ix = Math.min(this.y(), Integer.MAX_VALUE / this.N() / this.i.N());
         if (ix < this.y()) {
            y.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.y(), ix);
         }

         if (STBImageWrite.nstbi_write_png_to_func(class10939.address(), 0L, this.N(), ix, this.i.N(), this.N, 0) != 0) {
            class10939.N();
            return true;
         }

         flag = false;
      } finally {
         class10939.free();
      }

      return flag;
   }

   public void N(Path var1) throws IOException {
      if (!this.i.v()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.i);
      } else {
         this.Z();

         try (SeekableByteChannel seekablebytechannel = Files.newByteChannel(var1, u)) {
            if (!this.N(seekablebytechannel)) {
               throw new IOException("Could not write image to the PNG file \"" + var1.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
         }
      }
   }

   public static class08280 N(InputStream var0) throws IOException {
      return N(class08247.field_4997, var0);
   }

   public static class08280 N(@Nullable class08247 var0, InputStream var1) throws IOException {
      ByteBuffer bytebuffer = null;

      class08280 class08280;
      try {
         bytebuffer = TextureUtil.readResource(var1);
         class08280 = N(var0, bytebuffer);
      } finally {
         MemoryUtil.memFree(bytebuffer);
         IOUtils.closeQuietly(var1);
      }

      return class08280;
   }

   public static class08280 N(ByteBuffer var0) throws IOException {
      return N(class08247.field_4997, var0);
   }

   public void N(int var1, int var2, int var3, int var4, class08280 var5) {
      this.Z();
      if (var5.L() != this.i) {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      } else {
         int ix = this.i.N();
         STBImageResize.nstbir_resize_uint8(this.N + (var1 + var2 * this.N()) * ix, var3, var4, this.N() * ix, var5.N, var5.N(), var5.y(), 0, ix);
      }
   }

   public void N(class08280 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      for (int ix = 0; ix < var7; ix++) {
         for (int j = 0; j < var6; j++) {
            int k = var8 ? var6 - 1 - j : j;
            int l = var9 ? var7 - 1 - ix : ix;
            int i1 = this.u(var2 + j, var3 + ix);
            var1.N(var4 + k, var5 + l, i1);
         }
      }
   }

   public static class08280 N(@Nullable class08247 var0, ByteBuffer var1) throws IOException {
      if (var0 != null && !var0.v()) {
         throw new UnsupportedOperationException("Don't know how to read format " + var0);
      } else if (MemoryUtil.memAddress(var1) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         class03726.N(var1);
         MemoryStack memorystack = MemoryStack.stackPush();

         class08280 class08280;
         try {
            IntBuffer intbuffer = memorystack.mallocInt(1);
            IntBuffer intbuffer1 = memorystack.mallocInt(1);
            IntBuffer intbuffer2 = memorystack.mallocInt(1);
            ByteBuffer bytebuffer = STBImage.stbi_load_from_memory(var1, intbuffer, intbuffer1, intbuffer2, var0 == null ? 0 : var0.field_4994);
            if (bytebuffer == null) {
               throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }

            long ix = MemoryUtil.memAddress(bytebuffer);
            L.malloc(ix, bytebuffer.limit());
            class08280 = new class08280(var0 == null ? class08247.N(intbuffer2.get(0)) : var0, intbuffer.get(0), intbuffer1.get(0), true, ix);
         } catch (Throwable throwable1) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return class08280;
      }
   }

   public class08280 N(IntUnaryOperator var1) {
      if (this.i != class08247.field_4997) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "function application only works on RGBA images; have %s", this.i));
      } else {
         this.Z();
         class08280 class08280 = new class08280(this.R, this.M, false);
         int ix = this.R * this.M;
         IntBuffer intbuffer = MemoryUtil.memIntBuffer(this.N, ix);
         IntBuffer intbuffer1 = MemoryUtil.memIntBuffer(class08280.N, ix);

         for (int j = 0; j < ix; j++) {
            int k = class02566.b(intbuffer.get(j));
            int l = var1.applyAsInt(k);
            intbuffer1.put(j, class02566.T(l));
         }

         return class08280;
      }
   }

   public int N() {
      return this.R;
   }

   public void N(int var1, int var2, int var3) {
      if (this.i != class08247.field_4997) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "setPixelRGBA only works on RGBA images; have %s", this.i));
      } else if (this.L(var1, var2)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.R, this.M));
      } else {
         this.Z();
         long ix = (var1 + (long)var2 * this.R) * 4L;
         MemoryUtil.memPutInt(this.N + ix, var3);
      }
   }

   public int N(int var1, int var2) {
      return class02566.b(this.u(var1, var2));
   }

   public boolean N(FT_Face var1, int var2) {
      if (this.i.N() != 1) {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      } else if (class04284.y(FreeType.FT_Load_Glyph(var1, var2, 4), "Loading glyph")) {
         return false;
      } else {
         FT_Bitmap ft_bitmap = Objects.requireNonNull(var1.glyph(), "Glyph not initialized").bitmap();
         if (ft_bitmap.pixel_mode() != 2) {
            throw new IllegalStateException("Rendered glyph was not 8-bit grayscale");
         } else if (ft_bitmap.width() == this.N() && ft_bitmap.rows() == this.y()) {
            int ix = ft_bitmap.width() * ft_bitmap.rows();
            MemoryUtil.memCopy(MemoryUtil.memAddress(Objects.requireNonNull(ft_bitmap.buffer(ix), "Glyph has no bitmap")), this.N, ix);
            return true;
         } else {
            throw new IllegalArgumentException(
               String.format(
                  Locale.ROOT, "Glyph bitmap of size %sx%s does not match image of size: %sx%s", ft_bitmap.width(), ft_bitmap.rows(), this.N(), this.y()
               )
            );
         }
      }
   }

   public void N(File var1) throws IOException {
      this.N(var1.toPath());
   }

   private static class08280 N(ByteBuffer var0, byte[] var1) throws IOException {
      var0.put(var1);
      var0.rewind();
      return N(var0);
   }

   public static class08280 N(byte[] var0) throws IOException {
      if (MemoryStack.stackGet().getPointer() < var0.length) {
         ByteBuffer bytebuffer1 = MemoryUtil.memAlloc(var0.length);

         class08280 class08280;
         try {
            class08280 = N(bytebuffer1, var0);
         } finally {
            MemoryUtil.memFree(bytebuffer1);
         }

         return class08280;
      } else {
         MemoryStack memorystack = MemoryStack.stackPush();

         class08280 class08280x;
         try {
            ByteBuffer bytebuffer = memorystack.malloc(var0.length);
            class08280x = N(bytebuffer, var0);
         } catch (Throwable throwable1) {
            if (memorystack != null) {
               try {
                  memorystack.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (memorystack != null) {
            memorystack.close();
         }

         return class08280x;
      }
   }

   @Deprecated
   public int[] R() {
      if (this.i != class08247.field_4997) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.Z();
         int[] aint = new int[this.N() * this.y()];

         for (int ix = 0; ix < this.y(); ix++) {
            for (int j = 0; j < this.N(); j++) {
               aint[j + ix * this.N()] = this.N(j, ix);
            }
         }

         return aint;
      }
   }
}
