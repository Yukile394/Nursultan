package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Consumer;

public class class03024 extends class03328 {
   public static final MapCodec<class03024> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("name").forGetter(var0x -> var0x.u)).and(y(var0)).apply(var0, class03024::new)
   );
   private final class01894 u;

   private class03024(class01894 var1, int var2, int var3, List<class05957> var4, List<class08122> var5) {
      super(var2, var3, var4, var5);
      this.u = var1;
   }

   @Override
   public class05950 N() {
      return class03942.i;
   }

   @Override
   public void N(Consumer<class06584> var1, class05908 var2) {
      var2.N(this.u, var1);
   }

   public static class03366<?> N(class01894 var0) {
      return N((var1, var2, var3, var4) -> new class03024(var0, var1, var2, var3, var4));
   }
}
