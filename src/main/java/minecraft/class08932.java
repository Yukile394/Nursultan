package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08932(class08938<?, ?> unbakedSwitch, Optional<class08895> fallback) implements class08895 {
   public static final MapCodec<class08932> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class08938.N.forGetter(class08932::N), class08913.y.optionalFieldOf("fallback").forGetter(class08932::y)).apply(var0, class08932::new)
   );

   public class08932(class08938<?, ?> unbakedSwitch, Optional<class08895> fallback) {
      this.unbakedSwitch = unbakedSwitch;
      this.fallback = fallback;
   }

   public Optional<class08895> y() {
      return this.fallback;
   }

   public class08938<?, ?> N() {
      return this.unbakedSwitch;
   }

   @Override
   public void method_62326(class08350 var1) {
      this.unbakedSwitch.N(var1);
      this.fallback.ifPresent(var1x -> var1x.method_62326(var1));
   }

   @Override
   public MapCodec<class08932> method_65585() {
      return N;
   }

   @Override
   public class08910 method_65587(class08905 var1) {
      class08910 class08910 = this.fallback.<class08910>map(var1x -> var1x.method_65587(var1)).orElse(var1.i());
      return this.unbakedSwitch.N(var1, class08910);
   }
}
