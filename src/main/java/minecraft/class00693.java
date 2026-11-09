package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00693(int width, int height, class01894 assetId, Optional<class00392> title, Optional<class00392> author) {
   public static final Codec<class00693> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.N(1, 16).fieldOf("width").forGetter(class00693::y),
            class06338.N(1, 16).fieldOf("height").forGetter(class00693::L),
            class01894.N.fieldOf("asset_id").forGetter(class00693::u),
            class03748.N.optionalFieldOf("title").forGetter(class00693::i),
            class03748.N.optionalFieldOf("author").forGetter(class00693::R)
         )
         .apply(var0, class00693::new)
   );
   public static final class02362<class04247, class00693> y = class02362.N(
      class02389.B,
      class00693::y,
      class02389.B,
      class00693::L,
      class01894.y,
      class00693::u,
      class03748.i,
      class00693::i,
      class03748.i,
      class00693::R,
      class00693::new
   );
   public static final Codec<class03556<class00693>> L = class03539.N(class04227.ym);
   public static final class02362<class04247, class03556<class00693>> u = class02389.N(class04227.ym, y);

   public int L() {
      return this.height;
   }

   public class00693(int width, int height, class01894 assetId, Optional<class00392> title, Optional<class00392> author) {
      this.width = width;
      this.height = height;
      this.assetId = assetId;
      this.title = title;
      this.author = author;
   }

   public Optional<class00392> i() {
      return this.title;
   }

   public class01894 u() {
      return this.assetId;
   }

   public int y() {
      return this.width;
   }

   public int N() {
      return this.y() * this.L();
   }

   public Optional<class00392> R() {
      return this.author;
   }
}
