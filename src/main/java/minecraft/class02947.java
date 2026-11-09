package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public record class02947(class05946<class05074> lootTable, Map<class07085, Float> slotDropChances) {
   public static final Codec<Map<class07085, Float>> N = Codec.either(Codec.FLOAT, Codec.unboundedMap(class07085.field_45739, Codec.FLOAT))
      .xmap(var0 -> (Map)var0.map(class02947::N, Function.identity()), var0 -> {
         boolean flag = var0.values().stream().distinct().count() == 1L;
         boolean flag1 = var0.keySet().containsAll(class07085.field_54086);
         return flag && flag1 ? Either.left(var0.values().stream().findFirst().orElse(0.0F)) : Either.right(var0);
      });
   public static final Codec<class02947> y = RecordCodecBuilder.create(
      var0 -> var0.group(class05074.N.fieldOf("loot_table").forGetter(class02947::N), N.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(class02947::y))
         .apply(var0, class02947::new)
   );

   public class02947(class05946<class05074> var1, float var2) {
      this(var1, N(var2));
   }

   public class02947(class05946<class05074> lootTable, Map<class07085, Float> slotDropChances) {
      super();
      this.lootTable = lootTable;
      this.slotDropChances = slotDropChances;
   }

   public Map<class07085, Float> y() {
      return this.slotDropChances;
   }

   private static Map<class07085, Float> N(List<class07085> var0, float var1) {
      HashMap hashmap = Maps.newHashMap();

      for (class07085 class07085 : var0) {
         hashmap.put(class07085, var1);
      }

      return hashmap;
   }

   private static Map<class07085, Float> N(float var0) {
      return N(List.of(class07085.values()), var0);
   }

   public class05946<class05074> N() {
      return this.lootTable;
   }
}
