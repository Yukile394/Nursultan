package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.slf4j.Logger;

public record class04216(class01894 resourceId, Optional<class01894> spriteId) implements class04233 {
   private static final Logger i = LogUtils.getLogger();
   public static final MapCodec<class04216> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("resource").forGetter(class04216::y), class01894.N.optionalFieldOf("sprite").forGetter(class04216::L))
         .apply(var0, class04216::new)
   );

   public Optional<class01894> L() {
      return this.spriteId;
   }

   public class04216(class01894 var1) {
      this(var1, Optional.empty());
   }

   public class04216(class01894 resourceId, Optional<class01894> spriteId) {
      super();
      this.resourceId = resourceId;
      this.spriteId = spriteId;
   }

   public class01894 y() {
      return this.resourceId;
   }

   @Override
   public MapCodec<class04216> N() {
      return y;
   }

   @Override
   public void N(class01089 var1, class04205 var2) {
      class01894 class01894 = N.N(this.resourceId);
      Optional optional = var1.method_14486(class01894);
      if (optional.isPresent()) {
         var2.N(this.spriteId.orElse(this.resourceId), (class01079)optional.get());
      } else {
         i.warn("Missing sprite: {}", class01894);
      }
   }
}
