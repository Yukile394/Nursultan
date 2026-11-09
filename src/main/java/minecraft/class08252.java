package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class08252 extends class00453 {
   public static final MapCodec<class08252> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class06841.N.fieldOf("source").forGetter(var0x -> var0x.y)).apply(var0, class08252::new)
   );
   private final class06841<Object> y;

   private class08252(List<class05957> var1, class06841<?> var2) {
      super(var1);
      this.y = class06841.N((class06841<? extends Object>)var2);
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(this.y.N());
   }

   public static class00471<?> N(class06841<?> var0) {
      return N(var1 -> new class08252(var1, var0));
   }

   @Override
   public class05959<class08252> N() {
      return class07439.j;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (this.y.N(var2) instanceof class07061 class07061) {
         var1.N(class02484.B, class07061.method_5797());
      }

      return var1;
   }
}
