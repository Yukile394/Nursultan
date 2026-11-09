package minecraft;

import net.irisshaders.iris.mixin.texture.SpriteContentsFrameInfoAccessor;

public record class02007(int index, int time) implements SpriteContentsFrameInfoAccessor {

   public class02007(int index, int time) {
      this.index = index;
      this.time = time;
   }

   public int y() {
      return this.time;
   }

   public int N() {
      return this.index;
   }
}
