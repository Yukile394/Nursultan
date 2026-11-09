package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class07589(class08545<class07582> modelAndTexture, class08585 spawnConditions) implements class08578<class08579, class08568> {
   public static final Codec<class07589> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class08545.N(class07582.field_64367, class07582.field_64365).forGetter(class07589::y),
            class08585.y.fieldOf("spawn_conditions").forGetter(class07589::L)
         )
         .apply(var0, class07589::new)
   );
   public static final Codec<class07589> y = RecordCodecBuilder.create(
      var0 -> var0.group(class08545.N(class07582.field_64367, class07582.field_64365).forGetter(class07589::y)).apply(var0, class07589::new)
   );
   public static final Codec<class03556<class07589>> L = class03539.N(class04227.Nx);
   public static final class02362<class04247, class03556<class07589>> u = class02389.y(class04227.Nx);

   public class08585 L() {
      return this.spawnConditions;
   }

   private class07589(class08545<class07582> var1) {
      this(var1, class08585.N);
   }

   public class07589(class08545<class07582> modelAndTexture, class08585 spawnConditions) {
      this.modelAndTexture = modelAndTexture;
      this.spawnConditions = spawnConditions;
   }

   public class08545<class07582> y() {
      return this.modelAndTexture;
   }

   @Override
   public List<class08556<class08579, class08568>> N() {
      return this.spawnConditions.N();
   }
}
