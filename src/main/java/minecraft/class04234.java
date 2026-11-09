package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record class04234(class01894 resource, List<class04201> regions, double xDivisor, double yDivisor) implements class04233 {
   static final Logger y = LogUtils.getLogger();
   public static final MapCodec<class04234> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("resource").forGetter(class04234::y),
            class06338.y(class04201.R.listOf()).fieldOf("regions").forGetter(class04234::L),
            Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(class04234::u),
            Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(class04234::i)
         )
         .apply(var0, class04234::new)
   );

   public List<class04201> L() {
      return this.regions;
   }

   public class04234(class01894 resource, List<class04201> regions, double xDivisor, double yDivisor) {
      super();
      this.resource = resource;
      this.regions = regions;
      this.xDivisor = xDivisor;
      this.yDivisor = yDivisor;
   }

   public double i() {
      return this.yDivisor;
   }

   public double u() {
      return this.xDivisor;
   }

   public class01894 y() {
      return this.resource;
   }

   @Override
   public void N(class01089 var1, class04205 var2) {
      class01894 class01894 = N.N(this.resource);
      Optional optional = var1.method_14486(class01894);
      if (optional.isPresent()) {
         class04224 class04224 = new class04224(class01894, (class01079)optional.get(), this.regions.size());

         for (class04201 class04201 : this.regions) {
            var2.N(class04201.N(), new class04196(class04224, class04201, this.xDivisor, this.yDivisor));
         }
      } else {
         y.warn("Missing sprite: {}", class01894);
      }
   }

   @Override
   public MapCodec<class04234> N() {
      return L;
   }
}
