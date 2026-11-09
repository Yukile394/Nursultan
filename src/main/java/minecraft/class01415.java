package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class01415(Optional<class03543<class04651>> fluids, Optional<class01400> properties) {
   public static final Codec<class01415> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.e).optionalFieldOf("fluids").forGetter(class01415::N), class01400.N.optionalFieldOf("state").forGetter(class01415::y)
         )
         .apply(var0, class01415::new)
   );

   public class01415(Optional<class03543<class04651>> fluids, Optional<class01400> properties) {
      this.fluids = fluids;
      this.properties = properties;
   }

   public Optional<class01400> y() {
      return this.properties;
   }

   public Optional<class03543<class04651>> N() {
      return this.fluids;
   }

   public boolean N(class04782 var1, class07209 var2) {
      if (!var1.method_8477(var2)) {
         return false;
      } else {
         class04688 class04688 = var1.method_8316(var2);
         return this.fluids.isPresent() && !class04688.N(this.fluids.get()) ? false : !this.properties.isPresent() || this.properties.get().N(class04688);
      }
   }
}
