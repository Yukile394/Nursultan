package minecraft;

import org.jspecify.annotations.Nullable;

public record class07359(int y, class00554 chunkSection, class00536 blockLight, class00536 skyLight) {

   @Nullable
   public class00536 L() {
      return this.blockLight;
   }

   public class07359(int y, @Nullable class00554 chunkSection, @Nullable class00536 blockLight, @Nullable class00536 skyLight) {
      super();
      this.y = y;
      this.chunkSection = chunkSection;
      this.blockLight = blockLight;
      this.skyLight = skyLight;
   }

   @Nullable
   public class00536 u() {
      return this.skyLight;
   }

   @Nullable
   public class00554 y() {
      return this.chunkSection;
   }

   public int N() {
      return this.y;
   }
}
