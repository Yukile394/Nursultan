package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.slf4j.Logger;

public record class02533(class01894 function) implements class02560 {
   private static final Logger i = LogUtils.getLogger();
   public static final MapCodec<class02533> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("function").forGetter(class02533::y)).apply(var0, class02533::new)
   );

   public class02533(class01894 function) {
      this.function = function;
   }

   public class01894 y() {
      return this.function;
   }

   @Override
   public MapCodec<class02533> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class02796 class02796 = var1.method_8503();
      class03800 class03800 = class02796.Nr();
      Optional optional = class03800.N(this.function);
      if (optional.isPresent()) {
         class07701 class07701 = class02796.yu().N(class06984.L).y().N(var4).N(var1).N(var5).N(var4.method_5802());
         class03800.N((class07684<class07701>)optional.get(), class07701);
      } else {
         i.error("Enchantment run_function effect failed for non-existent function {}", this.function);
      }
   }
}
