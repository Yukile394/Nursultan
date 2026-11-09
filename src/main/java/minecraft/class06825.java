package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06825(class02546 amount) implements class02560 {
   public static final MapCodec<class06825> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("amount").forGetter(class06825::y)).apply(var0, class06825::new)
   );

   public class06825(class02546 amount) {
      super();
      this.amount = amount;
   }

   public class02546 y() {
      return this.amount;
   }

   @Override
   public MapCodec<class06825> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      if (var4 instanceof class08036) {
         ((class08036)var4).method_7322(this.amount.N(var2));
      }
   }
}
