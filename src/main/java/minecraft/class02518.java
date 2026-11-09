package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02518(class02546 amount) implements class02560 {
   public static final MapCodec<class02518> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("amount").forGetter(var0x -> var0x.amount)).apply(var0, class02518::new)
   );

   public class02518(class02546 amount) {
      this.amount = amount;
   }

   public class02546 y() {
      return this.amount;
   }

   @Override
   public MapCodec<class02518> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class06584 class06584 = var3.N();
      if (class06584.L(class02484.u) && class06584.L(class02484.i)) {
         class04770 class04770x = var3.L() instanceof class04770 class04770x ? class04770x : null;
         int i = (int)this.amount.N(var2);
         class06584.N(i, var1, class04770x, var3.u());
      }
   }
}
