package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class02930 extends class00453 {
   public static final MapCodec<class02930> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class02936.i.fieldOf("component").forGetter(var0x -> var0x.y), class07439.L.fieldOf("modifier").forGetter(var0x -> var0x.L)))
         .apply(var0, class02930::new)
   );
   private final class02928<?> y;
   private final class08122 L;

   private class02930(List<class05957> var1, class02928<?> var2, class08122 var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.R()) {
         return var1;
      } else {
         this.y.N(var1, var2x -> this.L.apply(var2x, var2));
         return var1;
      }
   }

   @Override
   public class05959<class02930> N() {
      return class07439.n;
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);
      this.L.N(var1.N(new class10419("modifier")));
   }
}
