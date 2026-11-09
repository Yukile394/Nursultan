package minecraft;

import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public record class08778(class08650 guiItemRenderState, int x0, int y0, int x1, int y1) implements class08647 {
   @Override
   public int M() {
      return this.x1;
   }

   public class08778(class08650 guiItemRenderState, int x0, int y0, int x1, int y1) {
      this.guiItemRenderState = guiItemRenderState;
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
   }

   @Override
   public int B() {
      return this.y1;
   }

   @Nullable
   @Override
   public class03255 Z() {
      return this.guiItemRenderState.R();
   }

   @Override
   public int i() {
      return this.x0;
   }

   public class08650 y() {
      return this.guiItemRenderState;
   }

   @Override
   public Matrix3x2f E() {
      return this.guiItemRenderState.y();
   }

   @Override
   public float N() {
      return 16.0F;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.guiItemRenderState.comp_4274();
   }

   @Override
   public int R() {
      return this.y0;
   }
}
