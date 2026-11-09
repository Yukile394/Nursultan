package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.TextureFormat;

public record class07353(int location, int samplerIndex, TextureFormat format, int texture) implements class07345 {
   public TextureFormat L() {
      return this.format;
   }

   public class07353(int var1, int var2, TextureFormat var3) {
      this(var1, var2, var3, GlStateManager._genTexture());
   }

   public class07353(int location, int samplerIndex, TextureFormat format, int texture) {
      this.location = location;
      this.samplerIndex = samplerIndex;
      this.format = format;
      this.texture = texture;
   }

   @Override
   public void close() {
      GlStateManager._deleteTexture(this.texture);
   }

   public int u() {
      return this.texture;
   }

   public int y() {
      return this.samplerIndex;
   }

   public int N() {
      return this.location;
   }
}
