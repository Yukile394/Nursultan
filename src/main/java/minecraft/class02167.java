package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class02167 extends class00453 {
   public static final MapCodec<class02167> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(Codec.unboundedMap(class02477.N, Codec.BOOL).fieldOf("toggles").forGetter(var0x -> var0x.y)).apply(var0, class02167::new)
   );
   private final Map<class02477<?>, Boolean> y;

   private class02167(List<class05957> var1, Map<class02477<?>, Boolean> var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class05959<class02167> N() {
      return class07439.a;
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.v, class08562.L, var1x -> {
         for (Entry entry : this.y.entrySet()) {
            boolean flag = (Boolean)entry.getValue();
            var1x = var1x.N((class02477<?>)entry.getKey(), !flag);
         }

         return var1x;
      });
      return var1;
   }
}
