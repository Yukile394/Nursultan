package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class04677 extends class00453 {
   public static final MapCodec<class04677> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class05919.field_45792.fieldOf("entity").forGetter(var0x -> var0x.y)).apply(var0, class04677::new)
   );
   private final class05919 y;

   public class04677(List<class05957> var1, class05919 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(this.y.N());
   }

   public static class00471<?> N(class05919 var0) {
      return N(var1 -> new class04677(var1, var0));
   }

   @Override
   public class05959<class04677> N() {
      return class07439.Y;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.N(class06570.Gw) && var2.L(this.y.N()) instanceof class08036 class08036) {
         var1.N(class02484.Nb, class02689.N(class08036.method_7334()));
      }

      return var1;
   }
}
