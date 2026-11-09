package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class02505(class02497 assetInfo, class08585 spawnConditions) implements class08578<class08579, class08568> {
   public static final Codec<class02505> N = RecordCodecBuilder.create(
      var0 -> var0.group(class02497.N.fieldOf("assets").forGetter(class02505::y), class08585.y.fieldOf("spawn_conditions").forGetter(class02505::L))
         .apply(var0, class02505::new)
   );
   public static final Codec<class02505> y = RecordCodecBuilder.create(
      var0 -> var0.group(class02497.N.fieldOf("assets").forGetter(class02505::y)).apply(var0, class02505::new)
   );
   public static final Codec<class03556<class02505>> L = class03539.N(class04227.yY);
   public static final class02362<class04247, class03556<class02505>> u = class02389.y(class04227.yY);

   public class08585 L() {
      return this.spawnConditions;
   }

   private class02505(class02497 var1) {
      this(var1, class08585.N);
   }

   public class02505(class02497 assetInfo, class08585 spawnConditions) {
      this.assetInfo = assetInfo;
      this.spawnConditions = spawnConditions;
   }

   public class02497 y() {
      return this.assetInfo;
   }

   @Override
   public List<class08556<class08579, class08568>> N() {
      return this.spawnConditions.N();
   }
}
