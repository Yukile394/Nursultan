package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00412(class01894 assetId, String translationKey) {
   public static final Codec<class00412> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01894.N.fieldOf("asset_id").forGetter(class00412::N), Codec.STRING.fieldOf("translation_key").forGetter(class00412::y))
         .apply(var0, class00412::new)
   );
   public static final class02362<class04247, class00412> y = class02362.N(class01894.y, class00412::N, class02389.s, class00412::y, class00412::new);
   public static final Codec<class03556<class00412>> L = class01281.N(class04227.NF, N);
   public static final class02362<class04247, class03556<class00412>> u = class02389.N(class04227.NF, y);

   public class00412(class01894 assetId, String translationKey) {
      this.assetId = assetId;
      this.translationKey = translationKey;
   }

   public String y() {
      return this.translationKey;
   }

   public class01894 N() {
      return this.assetId;
   }
}
