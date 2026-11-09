package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class03978(class03556<class01194> gameEvent, float distance, class06889 pos, UUID uuid, UUID projectileOwnerUuid, class07049 entity) {
   public static final Codec<class03978> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01194.Nz.fieldOf("game_event").forGetter(class03978::N),
            Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(class03978::y),
            class06889.N.fieldOf("pos").forGetter(class03978::L),
            class01487.N.lenientOptionalFieldOf("source").forGetter(var0x -> Optional.ofNullable(var0x.u())),
            class01487.N.lenientOptionalFieldOf("projectile_owner").forGetter(var0x -> Optional.ofNullable(var0x.i()))
         )
         .apply(var0, (var0x, var1, var2, var3, var4) -> new class03978(var0x, var1, var2, (UUID)var3.orElse(null), (UUID)var4.orElse(null)))
   );

   public class06889 L() {
      return this.pos;
   }

   public class03978(class03556<class01194> var1, float var2, class06889 var3, @Nullable UUID var4, @Nullable UUID var5) {
      this(var1, var2, var3, var4, var5, null);
   }

   public class03978(
      class03556<class01194> gameEvent, float distance, class06889 pos, @Nullable UUID uuid, @Nullable UUID projectileOwnerUuid, @Nullable class07049 entity
   ) {
      this.gameEvent = gameEvent;
      this.distance = distance;
      this.pos = pos;
      this.uuid = uuid;
      this.projectileOwnerUuid = projectileOwnerUuid;
      this.entity = entity;
   }

   public class03978(class03556<class01194> var1, float var2, class06889 var3, @Nullable class07049 var4) {
      this(var1, var2, var3, var4 == null ? null : var4.method_5667(), N(var4), var4);
   }

   @Nullable
   public UUID i() {
      return this.projectileOwnerUuid;
   }

   @Nullable
   public UUID u() {
      return this.uuid;
   }

   public float y() {
      return this.distance;
   }

   public Optional<class07049> y(class04782 var1) {
      return this.N(var1)
         .filter(var0 -> var0 instanceof class08005)
         .map(var0 -> (class08005)var0)
         .map(class08005::z)
         .or(() -> Optional.ofNullable(this.projectileOwnerUuid).map(var1::method_66347));
   }

   public Optional<class07049> N(class04782 var1) {
      return Optional.ofNullable(this.entity).or(() -> Optional.ofNullable(this.uuid).map(var1::method_66347));
   }

   @Nullable
   private static UUID N(@Nullable class07049 var0) {
      return var0 instanceof class08005 class08005 && class08005.z() != null ? class08005.z().method_5667() : null;
   }

   public class03556<class01194> N() {
      return this.gameEvent;
   }

   @Nullable
   public class07049 R() {
      return this.entity;
   }
}
