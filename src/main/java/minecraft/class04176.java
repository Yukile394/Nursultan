package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import net.fabricmc.fabric.api.networking.v1.FabricServerConfigurationNetworkHandler;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04176 extends class04156 implements class01667, class03077, FabricServerConfigurationNetworkHandler, NetworkHandlerExtensions {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("multiplayer.disconnect.invalid_player_data");
   private static final class00392 L = class00392.L("multiplayer.disconnect.configuration_error");
   private final GameProfile u;
   private final Queue<class04188> i = new ConcurrentLinkedQueue<>();
   @Nullable
   private class04188 M;
   private class03737 B;
   @Nullable
   private class02290 Z;
   @Nullable
   private class08758 z;
   private ServerConfigurationNetworkAddon U;
   private boolean E;
   private boolean W;

   public void L() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.method_14364(new class00489(new class01644(this.field_45012.Ng())));
         class02243 class02243 = this.field_45012.NU();
         if (!class02243.N()) {
            this.method_14364(new class02581(class02243.y()));
         }

         class02003<class02969> class02003 = this.field_45012.yG();
         List list = this.field_45012.yw().y().flatMap(var0 -> var0.method_56926().u().stream()).toList();
         this.method_14364(new class02037(class03794.i.y(this.field_45012.yn().K())));
         this.Z = new class02290(this.N(list), class02003);
         this.i.add(this.Z);
         this.R();
         this.u();
      }
   }

   private void M() {
      if (this.M != null) {
         throw new IllegalStateException("Task " + this.M.method_52375().N() + " has not finished yet");
      } else if (this.method_48106()) {
         class04188 class04188 = this.i.poll();
         if (class04188 != null) {
            this.M = class04188;

            try {
               class04188.method_52376(this::method_14364);
            } catch (Exception exception) {
               N.error("Failed to start configuration task {}", class04188.method_52375(), exception);
               this.method_52396(L);
            }
         }
      }
   }

   public class04176(class02796 var1, class00642 var2, class03713 var3) {
      super(var1, var2, var3);
      this.u = var3.N();
      this.B = var3.L();
      this.N(null);
   }

   private boolean B() {
      if (!this.W) {
         throw new IllegalStateException("Early task execution has finished");
      } else if (this.M != null) {
         throw new IllegalStateException("Task " + this.M.method_52375().N() + " has not finished yet");
      } else if (!this.method_48106()) {
         return false;
      } else {
         class04188 class04188 = this.i.poll();
         if (class04188 != null) {
            this.M = class04188;
            class04188.method_52376(this::method_14364);
            return true;
         } else {
            return false;
         }
      }
   }

   public ServerConfigurationNetworkAddon getAddon() {
      return this.U;
   }

   public void u() {
      this.z = new class08758(this.field_45012, new class08774(this.u));
      this.i.add(this.z);
      this.i.add(new class04171());
      this.M();
   }

   private void y(CallbackInfo var1) {
      if (this.U.startConfiguration()) {
         if (this.M != null) {
            throw new IllegalStateException("A task is already running: " + this.M.method_52375().N());
         } else {
            var1.cancel();
         }
      } else {
         if (!this.E) {
            this.U.preConfiguration();
            this.E = true;
            this.W = true;
         }

         if (this.W) {
            if (this.B()) {
               var1.cancel();
               return;
            }

            this.W = false;
         }

         if (this.M == null && this.i.isEmpty()) {
            this.U.configuration();
         } else {
            throw new IllegalStateException("All early tasks should have been completed, current: " + this.M + ", queued: " + this.i.size());
         }
      }
   }

   private Function N(class01042 var1, Operation var2) {
      return ((Function)var2.call(new Object[]{var1})).andThen(var1x -> {
         var1x.fabric_setSendableConfigurationChannels(Set.copyOf(this.U.getSendableChannels()));
         return (class04247)var1x;
      });
   }

   private void N(CallbackInfo var1) {
      this.U = new ServerConfigurationNetworkAddon(this, this.field_45012);
      this.U.lateInit();
   }

   public List N(List var1) {
      return this.field_45012.fabric$getOriginalKnownPacks().stream().filter(var1::contains).toList();
   }

   @Override
   public void N(class02275 var1) {
      class00417.N(var1, this, this.field_45012.yK());
      if (this.Z == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.Z.N(var1.N(), this::method_14364);
         this.N(class02290.N);
      }
   }

   @Override
   public void N(class00929 var1) {
      this.N(class00914.N);
   }

   @Override
   public void N(class01635 var1) {
      class00417.N(var1, this, this.field_45012.yK());
      this.N(class04171.N);
      class00642 class00642 = this.field_45013;
      class00165 class00165 = class04266.L;
      class01022 class01022 = this.field_45012.yt();
      class00642.method_56329(class00165.N(this.N(class01022, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_5455]");
         return class04247.N((class01042)var0[0]);
      })));

      try {
         class01062 class01062 = this.field_45012.Nm();
         if (class01062.y(this.u.id()) != null) {
            this.method_52396(class01062.R);
            return;
         }

         class00392 class00392 = class01062.N(this.field_45013.method_10755(), new class08774(this.u));
         if (class00392 != null) {
            this.method_52396(class00392);
            return;
         }

         Objects.requireNonNull(this.z).N(this.field_45013, this.method_53825(this.B));
      } catch (Exception exception) {
         N.error("Couldn't place player in world", exception);
         this.method_52396(y);
      }
   }

   private void N(class04159 var1) {
      class04159 class04159 = this.M != null ? this.M.method_52375() : null;
      if (!var1.equals(class04159)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + class04159 + ", requested: " + var1);
      } else {
         this.M = null;
         this.M();
      }
   }

   @Override
   public boolean method_48106() {
      return this.field_45013.method_10758();
   }

   private void R() {
      Map<String, String> map = this.field_45012.NW();
      if (!map.isEmpty()) {
         this.i.add(new class00914(() -> {
            String s = map.get(this.B.y().toLowerCase(Locale.ROOT));
            if (s == null) {
               s = map.get("en_us");
            }

            if (s == null) {
               s = map.values().iterator().next();
            }

            return s;
         }));
      }

      this.field_45012.NB().ifPresent(var1x -> this.i.add(new class04174(var1x)));
   }

   public void addTask(class04188 var1) {
      this.i.add(var1);
   }

   public void completeTask(class04159 var1) {
      if (!this.W) {
         this.N(var1);
      } else {
         class04159 class04159 = this.M != null ? this.M.method_52375() : null;
         if (!var1.equals(class04159)) {
            throw new IllegalStateException("Unexpected request for task finish, current task: " + class04159 + ", requested: " + var1);
         } else {
            this.M = null;
            this.L();
         }
      }
   }

   @Override
   protected GameProfile method_52403() {
      return this.u;
   }

   @Override
   public void method_10839(class02570 var1) {
      N.info("{} ({}) lost connection: {}", new Object[]{this.u.name(), this.u.id(), var1.N().getString()});
      if (this.z != null) {
         this.z.L();
         this.z = null;
      }

      super.method_10839(var1);
   }

   @Override
   public void method_18784() {
      this.method_52400();
      class04188 class04188 = this.M;
      if (class04188 != null) {
         try {
            if (class04188.N()) {
               this.N(class04188.method_52375());
            }
         } catch (Exception exception) {
            N.error("Failed to tick configuration task {}", class04188.method_52375(), exception);
            this.method_52396(L);
         }
      }

      if (this.z != null) {
         this.z.y();
      }
   }

   @Override
   public void method_52395(class07367 var1) {
      super.method_52395(var1);
      if (var1.y().N()) {
         this.N(class04174.N);
      }
   }

   @Override
   public void method_12069(class00541 var1) {
      this.B = var1.N();
   }
}
