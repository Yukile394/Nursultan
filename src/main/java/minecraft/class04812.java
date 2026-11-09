package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.BiFunction;

public class class04812 implements class08122 {
   public static final MapCodec<class04812> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07439.y.listOf().fieldOf("functions").forGetter(var0x -> var0x.L)).apply(var0, class04812::new)
   );
   public static final Codec<class04812> y = class07439.y.listOf().xmap(class04812::new, var0 -> var0.L);
   private final List<class08122> L;
   private final BiFunction<class06584, class05908, class06584> u;

   private class04812(List<class08122> var1) {
      super();
      this.L = var1;
      this.u = class07439.N(var1);
   }

   public class06584 apply(class06584 var1, class05908 var2) {
      return this.u.apply(var1, var2);
   }

   public static class04812 N(List<class08122> var0) {
      return new class04812(List.copyOf(var0));
   }

   @Override
   public class05959<class04812> N() {
      return class07439.q;
   }

   @Override
   public void N(class05561 var1) {
      class08122.super.N(var1);

      for (int i = 0; i < this.L.size(); i++) {
         this.L.get(i).N(var1.N(new class10416("functions", i)));
      }
   }
}
