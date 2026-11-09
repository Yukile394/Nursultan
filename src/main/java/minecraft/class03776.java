package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03776(class01247 dataPacks, class03767 enabledFeatures) {
   public static final String N = "enabled_features";
   public static final MapCodec<class03776> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01247.y.lenientOptionalFieldOf("DataPacks", class01247.N).forGetter(class03776::N),
            class03794.R.lenientOptionalFieldOf("enabled_features", class03794.B).forGetter(class03776::y)
         )
         .apply(var0, class03776::new)
   );
   public static final Codec<class03776> L = y.codec();
   public static final class03776 u = new class03776(class01247.N, class03794.B);

   public class03776(class01247 dataPacks, class03767 enabledFeatures) {
      this.dataPacks = dataPacks;
      this.enabledFeatures = enabledFeatures;
   }

   public class03767 y() {
      return this.enabledFeatures;
   }

   public class01247 N() {
      return this.dataPacks;
   }

   public class03776 N(class03767 var1) {
      return new class03776(this.dataPacks, this.enabledFeatures.L(var1));
   }
}
