package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Optional;
import java.util.UUID;

class class00911 extends CacheLoader<UUID, Optional<GameProfile>> {
   class00911(class00932 var1, MinecraftSessionService var2) {
      super();
      this.N = var2;
   }

   public Optional<GameProfile> load(UUID var1) {
      return Optional.ofNullable(this.N.fetchProfile(var1, true)).map(ProfileResult::profile);
   }
}
