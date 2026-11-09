package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class08403(class08545<class08438> modelAndTexture, class08585 spawnConditions) implements class08578<class08579, class08568> {
   public static final Codec<class08403> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class08545.N(class08438.field_56432, class08438.field_56429).forGetter(class08403::y),
            class08585.y.fieldOf("spawn_conditions").forGetter(class08403::L)
         )
         .apply(var0, class08403::new)
   );
   public static final Codec<class08403> y = RecordCodecBuilder.create(
      var0 -> var0.group(class08545.N(class08438.field_56432, class08438.field_56429).forGetter(class08403::y)).apply(var0, class08403::new)
   );
   public static final Codec<class03556<class08403>> L = class03539.N(class04227.Nr);
   public static final class02362<class04247, class03556<class08403>> u = class02389.y(class04227.Nr);

   public class08585 L() {
      return this.spawnConditions;
   }

   private class08403(class08545<class08438> var1) {
      this(var1, class08585.N);
   }

   public class08403(class08545<class08438> modelAndTexture, class08585 spawnConditions) {
      super();
      this.modelAndTexture = modelAndTexture;
      this.spawnConditions = spawnConditions;
   }

   public class08545<class08438> y() {
      return this.modelAndTexture;
   }

   @Override
   public List<class08556<class08579, class08568>> N() {
      return this.spawnConditions.N();
   }
}
