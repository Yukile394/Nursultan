package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

public class class00932 implements class00909 {
   private final LoadingCache<String, Optional<GameProfile>> y;
   final LoadingCache<UUID, Optional<GameProfile>> N;

   public class00932(MinecraftSessionService var1, class08957 var2) {
      super();
      this.N = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofMinutes(10L)).maximumSize(256L).build(new class00911(this, var1));
      this.y = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofMinutes(10L)).maximumSize(256L).build(new class00925(this, var2));
   }

   @Override
   public Optional<GameProfile> N(String var1) {
      return class05018.R(var1) ? (Optional)this.y.getUnchecked(var1) : Optional.empty();
   }

   @Override
   public Optional<GameProfile> N(UUID var1) {
      return (Optional<GameProfile>)this.N.getUnchecked(var1);
   }
}
