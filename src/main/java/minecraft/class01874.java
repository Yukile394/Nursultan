package minecraft;

import Nursultan.class09535;
import Nursultan.class09538;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.TagsLoaded;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.recipe.sync.RecipeSyncImpl;
import net.fabricmc.fabric.impl.recipe.sync.SupportedRecipeSerializersPayloadC2S;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01874 extends class01866 implements class01656, class03077, NetworkHandlerExtensions, ClientConfigurationPacketListenerImplAccessor {
   public static final Logger N = LogUtils.getLogger();
   public static final class00392 y = class00392.L("multiplayer.disconnect.code_of_conduct");
   private final class05384 P;
   private final GameProfile s;
   private class03767 T;
   private final class01022 b;
   private final class02879 j = new class02879();
   @Nullable
   private class02301 v;
   @Nullable
   protected class06467 m;
   private boolean n;
   private ClientConfigurationNetworkAddon t;

   private void L(class01651 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
         this.u.field_11651.config().setAutoRead(true);
      }
   }

   public ClientConfigurationNetworkAddon getAddon() {
      return this.t;
   }

   public class01874(class06202 var1, class00642 var2, class01892 var3) {
      super(var1, var2, var3);
      this.P = var3.N();
      this.s = var3.y();
      this.b = var3.u();
      this.T = var3.i();
      this.m = var3.z();
      this.N(null);
   }

   @Override
   protected class08781 n() {
      return new class09538(this);
   }

   private void y(class01651 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
         this.u.field_11651.config().setAutoRead(false);
      }
   }

   private void y(class01659 var1) {
      N.warn("Unknown custom packet payload: {}", var1.method_56479().N());
   }

   private void N(class02817 var1, CallbackInfo var2) {
      if (ClientConfigurationNetworking.canSend(SupportedRecipeSerializersPayloadC2S.ID)) {
         HashSet hashset = new HashSet();

         for (class06514<?> class06514 : RecipeSyncImpl.getSyncedSerializers()) {
            hashset.add(class04206.j.y(class06514));
         }

         if (!hashset.isEmpty()) {
            ClientConfigurationNetworking.send(new SupportedRecipeSerializersPayloadC2S(hashset));
         }
      }
   }

   @Override
   public void N(class01654 var1) {
      class00417.N(var1, this, this.L.B());
      this.j.N(var1.N(), var1.y());
   }

   private void N(CallbackInfo var1) {
      this.t = new ClientConfigurationNetworkAddon(this, this.L);
      ClientNetworkingImpl.setClientConfigurationAddon(this.t);
      this.t.lateInit();
   }

   public void N(class01651 var1, CallbackInfo var2) {
      this.t.handleComplete();
   }

   private void N(class02857 var1, CallbackInfoReturnable var2) {
      ((TagsLoaded)CommonLifecycleEvents.TAGS_LOADED.invoker()).onTagsLoaded((class01042)var2.getReturnValue(), true);
   }

   private <T> T N(Function<class02857, T> var1) {
      if (this.v == null) {
         return (T)var1.apply(class02857.L);
      } else {
         Object object;
         try (class03554 class03554 = this.v.N()) {
            object = var1.apply(class03554);
         }

         return (T)object;
      }
   }

   @Override
   public void N(class02182 var1) {
      this.m = null;
   }

   @Override
   public void N(class02817 var1) {
      class00417.N(var1, this, this.L.B());
      if (this.v == null) {
         this.v = new class02301();
      }

      List<class02298> list = this.v.N(var1.N());
      this.N(new class02275(list));
      this.N(var1, null);
   }

   @Override
   public void N(class02037 var1) {
      this.T = class03794.i.N(var1.N());
   }

   @Override
   protected void N(class01659 var1) {
      this.y(var1);
   }

   @Override
   public void N(class08076 var1) {
      class00417.N(var1, this, this.L.B());
      this.j.N(var1.N());
   }

   @Override
   public void N(class00927 var1) {
      class00417.N(var1, this, this.L.B());
      if (this.n) {
         throw new IllegalStateException("Server sent duplicate Code of Conduct");
      } else {
         this.n = true;
         String sx = var1.N();
         if (this.i != null && this.i.N(sx)) {
            this.N(class00929.N);
         } else {
            class05096 class05096 = (class05096)this.L.v_3;
            this.L.N(new class07933(this.i, class05096, sx, var2x -> {
               if (var2x) {
                  this.N(class00929.N);
                  this.L.N(class05096);
               } else {
                  this.n().N(y);
               }
            }));
         }
      }
   }

   @Override
   public void N(class01651 var1) {
      this.y(var1, null);
      class00417.N(var1, this, this.L.B());
      class01022 class01022 = this.N((Function<class02857, class01022>)(var1x -> {
         class01022 class01022x;
         class01022 class01022xx = class01022x = this.j.N(var1x, this.b, this.u.method_10756());
         this.N(var1x, new CallbackInfoReturnable("", false, class01022x));
         return class01022xx;
      }));
      class00642 class00642 = this.u;
      class04275 class04275 = class04266.L.N(class04247.N(class01022));
      this.N(var1, null);
      class00642.method_56330(
         class04275,
         new class01683(
            this.L,
            this.u,
            new class01892(this.P, this.s, this.M, class01022, this.T, this.R, this.i, this.B, this.z, this.m, this.U, this.o(), this.E, this.W)
         )
      );
      this.u.method_10743(class01635.N);
      this.u.method_56329(class04266.y.N(class04247.N(class01022), new class09535(this)));
      this.L(var1, null);
   }

   @Override
   public boolean method_48106() {
      return this.u.method_10758();
   }

   @Override
   public void method_10839(class02570 var1) {
      super.method_10839(var1);
      this.L.l();
   }

   @Override
   public void method_18784() {
      this.K();
   }
}
