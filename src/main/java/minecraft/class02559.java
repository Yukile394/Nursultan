package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02559(class03543<class07084> toApply, class02546 minDuration, class02546 maxDuration, class02546 minAmplifier, class02546 maxAmplifier)
   implements class02560 {
   public static final MapCodec<class02559> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03541.N(class04227.Ni).fieldOf("to_apply").forGetter(class02559::y),
            class02546.y.fieldOf("min_duration").forGetter(class02559::L),
            class02546.y.fieldOf("max_duration").forGetter(class02559::u),
            class02546.y.fieldOf("min_amplifier").forGetter(class02559::i),
            class02546.y.fieldOf("max_amplifier").forGetter(class02559::R)
         )
         .apply(var0, class02559::new)
   );

   public class02546 L() {
      return this.minDuration;
   }

   public class02559(class03543<class07084> toApply, class02546 minDuration, class02546 maxDuration, class02546 minAmplifier, class02546 maxAmplifier) {
      super();
      this.toApply = toApply;
      this.minDuration = minDuration;
      this.maxDuration = maxDuration;
      this.minAmplifier = minAmplifier;
      this.maxAmplifier = maxAmplifier;
   }

   public class02546 i() {
      return this.minAmplifier;
   }

   public class02546 u() {
      return this.maxDuration;
   }

   public class03543<class07084> y() {
      return this.toApply;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      if (var4 instanceof class07438 class07438) {
         class06069 class06069 = class07438.method_59922();
         Optional optional = this.toApply.N(class06069);
         if (optional.isPresent()) {
            int i = Math.round(class04995.y(class06069, this.minDuration.N(var2), this.maxDuration.N(var2)) * 20.0F);
            int j = Math.max(0, Math.round(class04995.y(class06069, this.minAmplifier.N(var2), this.maxAmplifier.N(var2))));
            class07438.method_6092(new class07055((class03556<class07084>)optional.get(), i, j));
         }
      }
   }

   @Override
   public MapCodec<class02559> N() {
      return N;
   }

   public class02546 R() {
      return this.maxAmplifier;
   }
}
