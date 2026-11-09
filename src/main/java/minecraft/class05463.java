package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class class05463 {
   private final class06202 N;
   private final Set<UUID> y = Sets.newHashSet();
   private final UserApiService L;
   private final Map<String, UUID> u = Maps.newHashMap();
   private boolean i;
   private CompletableFuture<?> R = CompletableFuture.completedFuture(null);

   public boolean L(UUID var1) {
      return this.u(var1) || this.i(var1);
   }

   public Set<UUID> L() {
      return this.y;
   }

   public class05463(class06202 var1, UserApiService var2) {
      super();
      this.N = var1;
      this.L = var2;
   }

   public boolean i(UUID var1) {
      if (!this.i) {
         return false;
      } else {
         this.R.join();
         return this.L.isBlockedPlayer(var1);
      }
   }

   public boolean u(UUID var1) {
      return this.y.contains(var1);
   }

   public void y() {
      this.i = false;
   }

   public void y(UUID var1) {
      this.y.remove(var1);
   }

   public void N(class03458 var1) {
      GameProfile gameprofile = var1.N();
      this.u.put(gameprofile.name(), gameprofile.id());
      class05096 class05096 = (class05096)this.N.v_3;
      if (class05096 instanceof class05470) {
         ((class05470)class05096).N(var1);
      }
   }

   public UUID N(String var1) {
      return this.u.getOrDefault(var1, class07536.R);
   }

   public void N(UUID var1) {
      this.y.add(var1);
   }

   public void N() {
      this.i = true;
      this.R = this.R.thenRunAsync(this.L::refreshBlockList, class07536.Z());
   }

   public void R(UUID var1) {
      class05096 class05096 = (class05096)this.N.v_3;
      if (class05096 instanceof class05470) {
         ((class05470)class05096).N(var1);
      }
   }
}
