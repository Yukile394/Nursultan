package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class08642(class08545<class08603> modelAndTexture, class08585 spawnConditions) implements class08578<class08579, class08568> {
   public static final Codec<class08642> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class08545.N(class08603.field_55690, class08603.field_55688).forGetter(class08642::y),
            class08585.y.fieldOf("spawn_conditions").forGetter(class08642::L)
         )
         .apply(var0, class08642::new)
   );
   public static final Codec<class08642> y = RecordCodecBuilder.create(
      var0 -> var0.group(class08545.N(class08603.field_55690, class08603.field_55688).forGetter(class08642::y)).apply(var0, class08642::new)
   );
   public static final Codec<class03556<class08642>> L = class03539.N(class04227.yP);
   public static final class02362<class04247, class03556<class08642>> u = class02389.y(class04227.yP);

   public class08585 L() {
      return this.spawnConditions;
   }

   private class08642(class08545<class08603> var1) {
      this(var1, class08585.N);
   }

   public class08642(class08545<class08603> modelAndTexture, class08585 spawnConditions) {
      super();
      this.modelAndTexture = modelAndTexture;
      this.spawnConditions = spawnConditions;
   }

   public class08545<class08603> y() {
      return this.modelAndTexture;
   }

   @Override
   public List<class08556<class08579, class08568>> N() {
      return this.spawnConditions.N();
   }
}
