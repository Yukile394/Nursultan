package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02764(class03543<class06581> items) {
   public static final Codec<class02764> N = RecordCodecBuilder.create(
      var0 -> var0.group(class03541.N(class04227.F).fieldOf("items").forGetter(class02764::N)).apply(var0, class02764::new)
   );
   public static final class02362<class04247, class02764> y = class02362.N(class02389.L(class04227.F), class02764::N, class02764::new);

   public class02764(class03543<class06581> items) {
      super();
      this.items = items;
   }

   public class03543<class06581> N() {
      return this.items;
   }

   public boolean N(class06584 var1) {
      return var1.N(this.items);
   }
}
