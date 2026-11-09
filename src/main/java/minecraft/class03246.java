package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03246(class01894 assetId, class00392 description, boolean decal) {
   public static final Codec<class03246> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01894.N.fieldOf("asset_id").forGetter(class03246::N),
            class03748.N.fieldOf("description").forGetter(class03246::y),
            Codec.BOOL.fieldOf("decal").orElse(false).forGetter(class03246::L)
         )
         .apply(var0, class03246::new)
   );
   public static final class02362<class04247, class03246> y = class02362.N(
      class01894.y, class03246::N, class03748.y, class03246::y, class02389.y, class03246::L, class03246::new
   );
   public static final Codec<class03556<class03246>> L = class01281.N(class04227.yk, N);
   public static final class02362<class04247, class03556<class03246>> u = class02389.N(class04227.yk, y);

   public boolean L() {
      return this.decal;
   }

   public class03246(class01894 assetId, class00392 description, boolean decal) {
      this.assetId = assetId;
      this.description = description;
      this.decal = decal;
   }

   public class00392 y() {
      return this.description;
   }

   public class00392 N(class03556<class03252> var1) {
      return this.description.L().L(((class03252)var1.N()).y().method_10866());
   }

   public class01894 N() {
      return this.assetId;
   }
}
