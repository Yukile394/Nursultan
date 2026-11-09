package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00808(class07001 entityToSpawn, Optional<class00778> customSpawnRules, Optional<class02947> equipment) {
   public static final String N = "entity";
   public static final Codec<class00808> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07001.N.fieldOf("entity").forGetter(var0x -> var0x.entityToSpawn),
            class00778.N.optionalFieldOf("custom_spawn_rules").forGetter(var0x -> var0x.customSpawnRules),
            class02947.y.optionalFieldOf("equipment").forGetter(var0x -> var0x.equipment)
         )
         .apply(var0, class00808::new)
   );
   public static final Codec<class04540<class00808>> L = class04540.N(y);

   public Optional<class02947> L() {
      return this.equipment;
   }

   public class00808() {
      this(new class07001(), Optional.empty(), Optional.empty());
   }

   public class00808(class07001 entityToSpawn, Optional<class00778> customSpawnRules, Optional<class02947> equipment) {
      super();
      Optional optional = entityToSpawn.N_15("id", class01894.N);
      if (optional.isPresent()) {
         entityToSpawn.N("id", class01894.N, (class01894)optional.get());
      } else {
         entityToSpawn.b("id");
      }

      this.entityToSpawn = entityToSpawn;
      this.customSpawnRules = customSpawnRules;
      this.equipment = equipment;
   }

   public Optional<class00778> i() {
      return this.customSpawnRules;
   }

   public class07001 u() {
      return this.entityToSpawn;
   }

   public Optional<class00778> y() {
      return this.customSpawnRules;
   }

   public class07001 N() {
      return this.entityToSpawn;
   }

   public Optional<class02947> R() {
      return this.equipment;
   }
}
