package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class09004 extends class00453 {
   public static final MapCodec<class09004> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class05338.N.fieldOf("limit").forGetter(var0x -> var0x.y)).apply(var0, class09004::new)
   );
   private final class05338 y;

   private class09004(List<class05957> var1, class05338 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.N();
   }

   public static class00471<?> N(class05338 var0) {
      return N(var1 -> new class09004(var1, var0));
   }

   @Override
   public class05959<class09004> N() {
      return class07439.G;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      int i = this.y.N(var2, var1.c());
      var1.i(i);
      return var1;
   }
}
