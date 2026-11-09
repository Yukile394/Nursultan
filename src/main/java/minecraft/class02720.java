package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Consumer;

public record class02720(class05946<class05074> lootTable, long seed) implements class02694 {
   private static final class00392 u = class00392.L("item.container.loot_table.unknown");
   public static final Codec<class02720> N = RecordCodecBuilder.create(
      var0 -> var0.group(class05074.N.fieldOf("loot_table").forGetter(class02720::N), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(class02720::y))
         .apply(var0, class02720::new)
   );

   public class02720(class05946<class05074> lootTable, long seed) {
      super();
      this.lootTable = lootTable;
      this.seed = seed;
   }

   public long y() {
      return this.seed;
   }

   public class05946<class05074> N() {
      return this.lootTable;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      var2.accept(u);
   }
}
