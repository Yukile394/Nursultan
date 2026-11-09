package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;

public record class05846(boolean translucent, class01894 textureAtlasLocation, RenderPipeline pipeline) {
   public static final class05846 N = new class05846(true, class08626.N, class08394.Ng);
   public static final class05846 y = new class05846(true, class08626.y, class08394.Ng);
   public static final class05846 L = new class05846(false, class08626.L, class08394.NO);
   public static final class05846 u = new class05846(true, class08626.L, class08394.Ng);

   public RenderPipeline L() {
      return this.pipeline;
   }

   public class05846(boolean translucent, class01894 textureAtlasLocation, RenderPipeline pipeline) {
      this.translucent = translucent;
      this.textureAtlasLocation = textureAtlasLocation;
      this.pipeline = pipeline;
   }

   public class01894 y() {
      return this.textureAtlasLocation;
   }

   public boolean N() {
      return this.translucent;
   }
}
