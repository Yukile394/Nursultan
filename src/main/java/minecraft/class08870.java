package minecraft;

import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;

public record class08870(RenderPipeline info, class02255 program) implements CompiledRenderPipeline {
   public boolean isValid() {
      return this.program != class02255.field_57864;
   }

   public class08870(RenderPipeline info, class02255 program) {
      this.info = info;
      this.program = program;
   }

   public class02255 y() {
      return this.program;
   }

   public RenderPipeline N() {
      return this.info;
   }
}
