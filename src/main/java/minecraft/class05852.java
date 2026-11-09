package minecraft;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Locale;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Bitmap;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_GlyphSlot;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public class class05852 implements class06262 {
   @Nullable
   private ByteBuffer L;
   @Nullable
   private FT_Face u;
   final float N;
   private final class03475<class05859> i = new class03475<>(class05859[]::new, class05859[][]::new);

   public class05852(ByteBuffer var1, FT_Face var2, float var3, float var4, float var5, float var6, String var7) {
      super();
      this.L = var1;
      this.u = var2;
      this.N = var4;
      IntArraySet intarrayset = new IntArraySet();
      var7.codePoints().forEach(intarrayset::add);
      int ix = Math.round(var3 * var4);
      FreeType.FT_Set_Pixel_Sizes(var2, ix, ix);
      float f = var5 * var4;
      float f1 = -var6 * var4;
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         FT_Vector ft_vector = class04284.N(FT_Vector.malloc(memorystack), f, f1);
         FreeType.FT_Set_Transform(var2, null, ft_vector);
         IntBuffer intbuffer = memorystack.mallocInt(1);
         int j = (int)FreeType.FT_Get_First_Char(var2, intbuffer);

         while (true) {
            int k = intbuffer.get(0);
            if (k == 0) {
               break;
            }

            if (!intarrayset.contains(j)) {
               this.i.N(j, new class05859(k));
            }

            j = (int)FreeType.FT_Get_Next_Char(var2, j, intbuffer);
         }
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
   }

   @Override
   public void close() {
      if (this.u != null) {
         synchronized (class04284.N) {
            class04284.y(FreeType.FT_Done_Face(this.u), "Deleting face");
         }

         this.u = null;
      }

      MemoryUtil.memFree(this.L);
      this.L = null;
   }

   FT_Face y() {
      if (this.L != null && this.u != null) {
         return this.u;
      } else {
         throw new IllegalStateException("Provider already closed");
      }
   }

   private class00947 N(int var1, class05859 var2) {
      class00947 class00947 = var2.y;
      if (class00947 == null) {
         FT_Face ft_face = this.y();
         synchronized (ft_face) {
            class00947 = var2.y;
            if (class00947 == null) {
               class00947 = this.N(var1, ft_face, var2.N);
               var2.y = class00947;
            }
         }
      }

      return class00947;
   }

   private class00947 N(int var1, FT_Face var2, int var3) {
      int ix = FreeType.FT_Load_Glyph(var2, var3, 4194312);
      if (ix != 0) {
         class04284.N(ix, String.format(Locale.ROOT, "Loading glyph U+%06X", var1));
      }

      FT_GlyphSlot ft_glyphslot = var2.glyph();
      if (ft_glyphslot == null) {
         throw new NullPointerException(String.format(Locale.ROOT, "Glyph U+%06X not initialized", var1));
      } else {
         float f = class04284.N(ft_glyphslot.advance());
         FT_Bitmap ft_bitmap = ft_glyphslot.bitmap();
         int j = ft_glyphslot.bitmap_left();
         int k = ft_glyphslot.bitmap_top();
         int l = ft_bitmap.width();
         int i1 = ft_bitmap.rows();
         return (class00947)(l > 0 && i1 > 0 ? new class05861(this, j, k, l, i1, f, var3) : new class05647(f / this.N));
      }
   }

   @Override
   public IntSet N() {
      return this.i.y();
   }

   @Nullable
   @Override
   public class00947 N(int var1) {
      class05859 class05859 = this.i.N(var1);
      return class05859 != null ? this.N(var1, class05859) : null;
   }
}
