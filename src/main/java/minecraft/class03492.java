package minecraft;

import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FreeType;

public record class03492(class01894 location, float size, float oversample, class03505 shift, String skip) implements class06270 {
   private static final Codec<String> B = Codec.withAlternative(Codec.STRING, Codec.STRING.listOf(), var0 -> String.join("", var0));
   public static final MapCodec<class03492> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("file").forGetter(class03492::L),
            Codec.FLOAT.optionalFieldOf("size", 11.0F).forGetter(class03492::u),
            Codec.FLOAT.optionalFieldOf("oversample", 1.0F).forGetter(class03492::i),
            class03505.u.optionalFieldOf("shift", class03505.L).forGetter(class03492::R),
            B.optionalFieldOf("skip", "").forGetter(class03492::M)
         )
         .apply(var0, class03492::new)
   );

   public class01894 L() {
      return this.location;
   }

   public String M() {
      return this.skip;
   }

   public class03492(class01894 location, float size, float oversample, class03505 shift, String skip) {
      this.location = location;
      this.size = size;
      this.oversample = oversample;
      this.shift = shift;
      this.skip = skip;
   }

   public float i() {
      return this.oversample;
   }

   public float u() {
      return this.size;
   }

   @Override
   public Either<class06246, class06254> y() {
      return Either.left(this::N);
   }

   private class06262 N(class01089 var1) throws IOException {
      FT_Face ft_face = null;
      ByteBuffer bytebuffer = null;

      try {
         class05852 class05852;
         try (InputStream inputstream = var1.u(this.location.R("font/"))) {
            bytebuffer = TextureUtil.readResource(inputstream);
            synchronized (class04284.N) {
               MemoryStack memorystack = MemoryStack.stackPush();

               try {
                  PointerBuffer pointerbuffer = memorystack.mallocPointer(1);
                  class04284.N(FreeType.FT_New_Memory_Face(class04284.N(), bytebuffer, 0L, pointerbuffer), "Initializing font face");
                  ft_face = FT_Face.create(pointerbuffer.get());
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

               String s = FreeType.FT_Get_Font_Format(ft_face);
               if (!"TrueType".equals(s)) {
                  throw new IOException("Font is not in TTF format, was " + s);
               }

               class04284.N(FreeType.FT_Select_Charmap(ft_face, FreeType.FT_ENCODING_UNICODE), "Find unicode charmap");
               class05852 = new class05852(bytebuffer, ft_face, this.size, this.oversample, this.shift.N(), this.shift.y(), this.skip);
            }
         }

         return class05852;
      } catch (Exception exception) {
         synchronized (class04284.N) {
            if (ft_face != null) {
               FreeType.FT_Done_Face(ft_face);
            }
         }

         MemoryUtil.memFree(bytebuffer);
         throw exception;
      }
   }

   @Override
   public class05855 N() {
      return class05855.field_2317;
   }

   public class03505 R() {
      return this.shift;
   }
}
