package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Consumer;

public class class03798 extends class03328 {
   public static final MapCodec<class03798> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06581.u.fieldOf("name").forGetter(var0x -> var0x.u)).and(y(var0)).apply(var0, class03798::new)
   );
   private final class03556<class06581> u;

   private class03798(class03556<class06581> var1, int var2, int var3, List<class05957> var4, List<class08122> var5) {
      super(var2, var3, var4, var5);
      this.u = var1;
   }

   @Override
   public class05950 N() {
      return class03942.L;
   }

   @Override
   public void N(Consumer<class06584> var1, class05908 var2) {
      var1.accept(new class06584(this.u));
   }

   public static class03366<?> N(class07310 var0) {
      return N((var1, var2, var3, var4) -> new class03798(var0.B().i(), var1, var2, var3, var4));
   }
}
