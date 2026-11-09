package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record class02708(List<class02717> layers) implements class02694 {
   static final Logger y = LogUtils.getLogger();
   public static final class02708 L = new class02708(List.of());
   public static final Codec<class02708> u = class02717.N.listOf().xmap(class02708::new, class02708::y);
   public static final class02362<class04247, class02708> i = class02717.y.N_33(class02389.N()).N_10(class02708::new, class02708::y);

   public class02708(List<class02717> layers) {
      this.layers = (List<class02717>)layers;
   }

   public List<class02717> y() {
      return this.layers;
   }

   public class02708 N() {
      return new class02708(List.copyOf(this.layers.subList(0, this.layers.size() - 1)));
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      for (int ix = 0; ix < Math.min(this.y().size(), 6); ix++) {
         var2.accept(this.y().get(ix).N().N(class06541.field_1080));
      }
   }
}
