package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record class07826(
   boolean needsStateScanning,
   boolean dragonKilled,
   boolean previouslyKilled,
   boolean isRespawning,
   Optional<UUID> dragonUUID,
   Optional<class07209> exitPortalLocation,
   Optional<List<Integer>> gateways
) {
   public static final Codec<class07826> B = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(class07826::N),
            Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(class07826::y),
            Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(class07826::L),
            Codec.BOOL.lenientOptionalFieldOf("IsRespawning", false).forGetter(class07826::u),
            class01487.N.lenientOptionalFieldOf("Dragon").forGetter(class07826::i),
            class07209.field_25064.lenientOptionalFieldOf("ExitPortalLocation").forGetter(class07826::R),
            Codec.list(Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(class07826::M)
         )
         .apply(var0, class07826::new)
   );
   public static final class07826 Z = new class07826(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

   public boolean L() {
      return this.previouslyKilled;
   }

   public Optional<List<Integer>> M() {
      return this.gateways;
   }

   public class07826(
      boolean needsStateScanning,
      boolean dragonKilled,
      boolean previouslyKilled,
      boolean isRespawning,
      Optional<UUID> dragonUUID,
      Optional<class07209> exitPortalLocation,
      Optional<List<Integer>> gateways
   ) {
      super();
      this.needsStateScanning = needsStateScanning;
      this.dragonKilled = dragonKilled;
      this.previouslyKilled = previouslyKilled;
      this.isRespawning = isRespawning;
      this.dragonUUID = dragonUUID;
      this.exitPortalLocation = exitPortalLocation;
      this.gateways = gateways;
   }

   public Optional<UUID> i() {
      return this.dragonUUID;
   }

   public boolean u() {
      return this.isRespawning;
   }

   public boolean y() {
      return this.dragonKilled;
   }

   public boolean N() {
      return this.needsStateScanning;
   }

   public Optional<class07209> R() {
      return this.exitPortalLocation;
   }
}
