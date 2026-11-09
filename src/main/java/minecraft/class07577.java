package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Consumer;

public class class07577 extends class03328 {
   public static final MapCodec<class07577> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06848.y.fieldOf("slot_source").forGetter(var0x -> var0x.u)).and(y(var0)).apply(var0, class07577::new)
   );
   private final class06834 u;

   private class07577(class06834 var1, int var2, int var3, List<class05957> var4, List<class08122> var5) {
      super(var2, var3, var4, var5);
      this.u = var1;
   }

   @Override
   public class05950 N() {
      return class03942.M;
   }

   @Override
   public void N(Consumer<class06584> var1, class05908 var2) {
      this.u.N(var2).itemCopies().filter(var0 -> !var0.R()).forEach(var1);
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);
      this.u.N(var1.N(new class10419("slot_source")));
   }
}
