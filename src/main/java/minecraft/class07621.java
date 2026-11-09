package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class07621 extends class00453 {
   public static final MapCodec<class07621> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class06339.N.fieldOf("count").forGetter(var0x -> var0x.y), Codec.BOOL.fieldOf("add").orElse(false).forGetter(var0x -> var0x.L)))
         .apply(var0, class07621::new)
   );
   private final class06378 y;
   private final boolean L;

   private class07621(List<class05957> var1, class06378 var2, boolean var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.y();
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      int i = this.L ? var1.c() : 0;
      var1.i(i + this.y.N(var2));
      return var1;
   }

   public static class00471<?> N(class06378 var0) {
      return N(var1 -> new class07621(var1, var0, false));
   }

   public static class00471<?> N(class06378 var0, boolean var1) {
      return N(var2 -> new class07621(var2, var0, var1));
   }

   @Override
   public class05959<class07621> N() {
      return class07439.i;
   }
}
