package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Consumer;

public class class03626 extends class03328 {
   public static final MapCodec<class03626> N = RecordCodecBuilder.mapCodec(var0 -> y(var0).apply(var0, class03626::new));

   private class03626(int var1, int var2, List<class05957> var3, List<class08122> var4) {
      super(var1, var2, var3, var4);
   }

   public static class03366<?> y() {
      return N(class03626::new);
   }

   @Override
   public class05950 N() {
      return class03942.y;
   }

   @Override
   public void N(Consumer<class06584> var1, class05908 var2) {
   }
}
