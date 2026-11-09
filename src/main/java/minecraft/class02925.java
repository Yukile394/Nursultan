package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class02925 extends class00453 {
   public static final MapCodec<class02925> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class06581.u.fieldOf("item").forGetter(var0x -> var0x.y)).apply(var0, class02925::new)
   );
   private final class03556<class06581> y;

   private class02925(List<class05957> var1, class03556<class06581> var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      return var1.N(this.y.N());
   }

   @Override
   public class05959<class02925> N() {
      return class07439.R;
   }
}
