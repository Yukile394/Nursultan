package minecraft;

import Nursultan.class11666;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;

public record class08904(List<class08895> models) implements class08895 {
   public static final MapCodec<class08904> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class08913.y.listOf().fieldOf("models").forGetter(class08904::N)).apply(var0, class08904::new)
   );

   public class08904(List<class08895> models) {
      super();
      this.models = models;
   }

   public List<class08895> N() {
      return this.models;
   }

   @Override
   public void method_62326(class08350 var1) {
      Iterator iterator = this.models.iterator();

      while (iterator.hasNext()) {
         ((class08895)iterator.next()).method_62326(var1);
      }
   }

   @Override
   public MapCodec<class08904> method_65585() {
      return N;
   }

   @Override
   public class08910 method_65587(class08905 var1) {
      return new class11666(this.models.stream().map(var1x -> var1x.method_65587(var1)).toList());
   }
}
