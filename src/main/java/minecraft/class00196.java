package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.slf4j.Logger;

public record class00196(Optional<class01894> setupFunction, Optional<class01894> teardownFunction) implements class00225 {
   private static final Logger R = LogUtils.getLogger();
   public static final MapCodec<class00196> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.optionalFieldOf("setup").forGetter(class00196::y), class01894.N.optionalFieldOf("teardown").forGetter(class00196::L))
         .apply(var0, class00196::new)
   );

   public Optional<class01894> L() {
      return this.teardownFunction;
   }

   public class00196(Optional<class01894> setupFunction, Optional<class01894> teardownFunction) {
      super();
      this.setupFunction = setupFunction;
      this.teardownFunction = teardownFunction;
   }

   @Override
   public void y(class04782 var1) {
      this.teardownFunction.ifPresent(var1x -> N(var1, var1x));
   }

   public Optional<class01894> y() {
      return this.setupFunction;
   }

   @Override
   public MapCodec<class00196> N() {
      return L;
   }

   @Override
   public void N(class04782 var1) {
      this.setupFunction.ifPresent(var1x -> N(var1, var1x));
   }

   private static void N(class04782 var0, class01894 var1) {
      class02796 class02796 = var0.method_8503();
      class03800 class03800 = class02796.Nr();
      Optional<class07684<class07701>> optional = class03800.N(var1);
      if (optional.isPresent()) {
         class07701 class07701 = class02796.yu().N(class06984.L).y().N(var0);
         class03800.N(optional.get(), class07701);
      } else {
         R.error("Test Batch failed for non-existent function {}", var1);
      }
   }
}
