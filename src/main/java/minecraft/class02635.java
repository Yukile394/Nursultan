package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class02635 extends class00453 {
   static final MapCodec<class02635> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class06339.N.fieldOf("amplifier").forGetter(var0x -> var0x.y)).apply(var0, class02635::new)
   );
   private final class06378 y;

   public class06378 L() {
      return this.y;
   }

   private class02635(List<class05957> var1, class06378 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.y();
   }

   public static class00471<?> N(class06378 var0) {
      return N(var1 -> new class02635(var1, var0));
   }

   @Override
   public class05959<class02635> N() {
      return class07439.p;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      int i = class04995.N(this.y.N(var2), 0, 4);
      var1.N(class02484.NU, new class08213(i));
      return var1;
   }
}
