package minecraft;

import java.util.OptionalInt;

public record class01018(int width, int height, OptionalInt fullscreenWidth, OptionalInt fullscreenHeight, boolean isFullscreen) {
   public OptionalInt L() {
      return this.fullscreenWidth;
   }

   public class01018(int width, int height, OptionalInt fullscreenWidth, OptionalInt fullscreenHeight, boolean isFullscreen) {
      super();
      this.width = width;
      this.height = height;
      this.fullscreenWidth = fullscreenWidth;
      this.fullscreenHeight = fullscreenHeight;
      this.isFullscreen = isFullscreen;
   }

   public boolean i() {
      return this.isFullscreen;
   }

   public OptionalInt u() {
      return this.fullscreenHeight;
   }

   public int y() {
      return this.height;
   }

   public int N() {
      return this.width;
   }

   public class01018 N(int var1, int var2) {
      return new class01018(var1, var2, this.fullscreenWidth, this.fullscreenHeight, this.isFullscreen);
   }

   public class01018 N(boolean var1) {
      return new class01018(this.width, this.height, this.fullscreenWidth, this.fullscreenHeight, var1);
   }
}
