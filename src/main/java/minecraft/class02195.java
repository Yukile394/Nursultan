package minecraft;

import com.mojang.serialization.Codec;

public record class02195(class01894 assetId, boolean showOnItemFrame, int mapColor, boolean explorationMapElement, boolean trackCount) {
   public static final int N = -1;
   public static final Codec<class03556<class02195>> y = class04206.NT.b();
   public static final class02362<class04247, class03556<class02195>> L = class02389.y(class04227.r);

   public boolean L() {
      return this.showOnItemFrame;
   }

   public class02195(class01894 assetId, boolean showOnItemFrame, int mapColor, boolean explorationMapElement, boolean trackCount) {
      super();
      this.assetId = assetId;
      this.showOnItemFrame = showOnItemFrame;
      this.mapColor = mapColor;
      this.explorationMapElement = explorationMapElement;
      this.trackCount = trackCount;
   }

   public boolean i() {
      return this.explorationMapElement;
   }

   public int u() {
      return this.mapColor;
   }

   public class01894 y() {
      return this.assetId;
   }

   public boolean N() {
      return this.mapColor != -1;
   }

   public boolean R() {
      return this.trackCount;
   }
}
