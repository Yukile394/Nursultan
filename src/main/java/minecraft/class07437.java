package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class class07437 extends class00453 {
   public static final MapCodec<class07437> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class02936.i.fieldOf("component").forGetter(var0x -> var0x.y), class03942.N.listOf().fieldOf("entries").forGetter(var0x -> var0x.L)))
         .apply(var0, class07437::new)
   );
   private final class02928<?> y;
   private final List<class04129> L;

   class07437(List<class05957> var1, class02928<?> var2, List<class04129> var3) {
      super(var1);
      this.y = var2;
      this.L = List.copyOf(var3);
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.R()) {
         return var1;
      } else {
         Builder builder = Stream.builder();
         this.L.forEach(var2x -> var2x.expand(var2, var2xx -> var2xx.N(class05074.N(var2.u(), builder::add), var2)));
         this.y.N(var1, builder.build());
         return var1;
      }
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);

      for (int i = 0; i < this.L.size(); i++) {
         this.L.get(i).N(var1.N(new class10416("entries", i)));
      }
   }

   public static class07447 N(class02928<?> var0) {
      return new class07447(var0);
   }

   @Override
   public class05959<class07437> N() {
      return class07439.v;
   }
}
