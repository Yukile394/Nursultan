package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class03594 implements class03336 {
   public static final MapCodec<class03594> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05074.N.fieldOf("loot_table").forGetter(var0x -> var0x.y)).apply(var0, class03594::new)
   );
   private final class05946<class05074> y;

   public class03594(class05946<class05074> var1) {
      super();
      this.y = var1;
   }

   @Override
   public class07001 N(class06069 var1, @Nullable class07001 var2) {
      class07001 class07001 = var2 == null ? new class07001() : var2.N();
      class07001.N("LootTable", class05074.N, this.y);
      class07001.N("LootTableSeed", var1.B());
      return class07001;
   }

   @Override
   public class03368<?> N() {
      return class03368.u;
   }
}
