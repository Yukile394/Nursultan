package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class05947(Optional<class05196> player, class05946<class05074> lootTable) implements class01425 {
   public static final Codec<class05947> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class05947::N), class05074.N.fieldOf("loot_table").forGetter(class05947::y))
         .apply(var0, class05947::new)
   );

   public class05947(Optional<class05196> player, class05946<class05074> lootTable) {
      this.player = player;
      this.lootTable = lootTable;
   }

   public class05946<class05074> y() {
      return this.lootTable;
   }

   public boolean y(class05946<class05074> var1) {
      return this.lootTable == var1;
   }

   public static class06915<class05947> N(class05946<class05074> var0) {
      return class06912.F.N(new class05947(Optional.empty(), var0));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
