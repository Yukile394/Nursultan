package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;

public interface class00909 {
   Optional<GameProfile> N(String var1);

   Optional<GameProfile> N(UUID var1);

   default Optional<GameProfile> N(Either<String, UUID> var1) {
      return (Optional<GameProfile>)var1.map(this::N, this::N);
   }
}
