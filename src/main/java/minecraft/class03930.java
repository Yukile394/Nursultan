package minecraft;

import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import org.jspecify.annotations.Nullable;

public record class03930(
   MinecraftSessionService sessionService,
   ServicesKeySet servicesKeySet,
   GameProfileRepository profileRepository,
   class08957 nameToIdCache,
   class00909 profileResolver
) {
   private static final String R = "usercache.json";

   public MinecraftSessionService L() {
      return this.sessionService;
   }

   public class00909 M() {
      return this.profileResolver;
   }

   public class03930(
      MinecraftSessionService sessionService,
      ServicesKeySet servicesKeySet,
      GameProfileRepository profileRepository,
      class08957 nameToIdCache,
      class00909 profileResolver
   ) {
      this.sessionService = sessionService;
      this.servicesKeySet = servicesKeySet;
      this.profileRepository = profileRepository;
      this.nameToIdCache = nameToIdCache;
      this.profileResolver = profileResolver;
   }

   public GameProfileRepository i() {
      return this.profileRepository;
   }

   public ServicesKeySet u() {
      return this.servicesKeySet;
   }

   public boolean y() {
      return !this.servicesKeySet.keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public static class03930 N(YggdrasilAuthenticationService var0, File var1) {
      MinecraftSessionService minecraftsessionservice = var0.createMinecraftSessionService();
      GameProfileRepository gameprofilerepository = var0.createProfileRepository();
      class01053 class01053 = new class01053(gameprofilerepository, new File(var1, "usercache.json"));
      class00932 class00932 = new class00932(minecraftsessionservice, class01053);
      return new class03930(minecraftsessionservice, var0.getServicesKeySet(), gameprofilerepository, class01053, class00932);
   }

   @Nullable
   public class03962 N() {
      return class03962.N(this.servicesKeySet, ServicesKeyType.PROFILE_KEY);
   }

   public class08957 R() {
      return this.nameToIdCache;
   }
}
