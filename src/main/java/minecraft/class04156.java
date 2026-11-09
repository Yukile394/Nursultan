package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;
import net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class04156
   implements class01652,
   NetworkHandlerExtensions,
   ServerCommonPacketListenerImplAccessor,
   net.fabricmc.fabric.mixin.recipe.sync.ServerCommonPacketListenerImplAccessor {
   private static final Logger field_45014 = LogUtils.getLogger();
   public static final int field_45011 = 15000;
   private static final int field_51342 = 15000;
   private static final class00392 field_45015 = class00392.L("disconnect.timeout");
   static final class00392 field_48273 = class00392.L("multiplayer.disconnect.unexpected_query_response");
   protected final class02796 field_45012;
   protected final class00642 field_45013;
   private final boolean field_48274;
   private long field_45016;
   private boolean field_45017;
   private long field_45018;
   private long field_51343;
   private boolean field_51344 = false;
   private int field_45019;
   private volatile boolean field_45715 = false;

   public GameProfile method_52404() {
      return this.method_52403();
   }

   public void method_52396(class00392 var1) {
      this.method_60673(new class02570(var1));
   }

   public void method_14364(class00381<?> var1) {
      this.method_52391(var1, null);
   }

   public class04156(class02796 var1, class00642 var2, class03713 var3) {
      super();
      this.field_45012 = var1;
      this.field_45013 = var2;
      this.field_45016 = class07536.L();
      this.field_45019 = var3.y();
      this.field_48274 = var3.u();
   }

   public void method_52391(class00381<?> var1, @Nullable ChannelFutureListener var2) {
      if (var1.R()) {
         this.method_59512();
      }

      boolean flag = !this.field_45715 || !this.field_45012.E_();

      try {
         this.field_45013.method_52906(var1, var2, flag);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Sending packet");
         class07080.N("Packet being sent").N("Packet class", () -> var1.getClass().getCanonicalName());
         throw new class07878(class07080);
      }
   }

   private void m_handler$zji000$fabric_networking_api_v1$onPlayPong_20(class03451 var1, CallbackInfo var2) {
      AbstractNetworkAddon<?> abstractnetworkaddon = this.getAddon();
      if (abstractnetworkaddon instanceof ServerConfigurationNetworkAddon) {
         ((ServerConfigurationNetworkAddon)abstractnetworkaddon).onPong(var1.N());
      }
   }

   public void method_53047() {
      this.field_45715 = false;
      this.field_45013.method_52915();
   }

   public void method_53046() {
      this.field_45715 = true;
   }

   protected abstract GameProfile method_52403();

   @Override
   public void method_10839(class02570 var1) {
      if (this.method_52402()) {
         field_45014.info("Stopping singleplayer server as player logged out");
         this.field_45012.y(false);
      }
   }

   protected void method_52400() {
      class08700.N().N("keepAlive");
      long i = class07536.L();
      if (!this.method_52402() && i - this.field_45016 >= 15000L) {
         if (this.field_45017) {
            this.method_52396(field_45015);
         } else if (this.method_59511(i)) {
            this.field_45017 = true;
            this.field_45016 = i;
            this.field_45018 = i;
            this.method_14364(new class00506(this.field_45018));
         }
      }

      class08700.N().L();
   }

   protected class03713 method_53825(class03737 var1) {
      return new class03713(this.method_52403(), this.field_45019, var1, this.field_48274);
   }

   @Override
   public void method_52395(class07367 var1) {
      class00417.N(var1, this, this.field_45012.yK());
      if (var1.y() == class07369.field_13018 && this.field_45012.Ne()) {
         field_45014.info("Disconnecting {} due to resource pack {} rejection", this.method_52403().name(), var1.N());
         this.method_52396(class00392.L("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   protected boolean method_52402() {
      return this.field_45012.N(new class08774(this.method_52403()));
   }

   private void method_59512() {
      if (!this.field_51344) {
         this.field_51343 = class07536.L();
         this.field_51344 = true;
      }
   }

   @Override
   public void method_55851(class04269 var1) {
      this.method_52396(field_48273);
   }

   private boolean method_59511(long var1) {
      if (this.field_51344) {
         if (var1 - this.field_51343 >= 15000L) {
            this.method_52396(field_45015);
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_71953(class09036 var1) {
      class00417.N(var1, this, this.field_45012.yK());
      this.field_45012.N(var1.N(), var1.y());
   }

   public void method_60673(class02570 var1) {
      this.field_45013.method_10752(new class00501(var1.N()), class03041.N(() -> this.field_45013.method_60924(var1)));
      this.field_45013.method_10757();
      this.field_45012.i(this.field_45013::method_10768);
   }

   @Override
   public void method_52394(class03451 var1) {
      this.m_handler$zji000$fabric_networking_api_v1$onPlayPong_20(var1, null);
   }

   @Override
   public void method_52393(class00552 var1) {
      if (this.field_45017 && var1.N() == this.field_45018) {
         int i = (int)(class07536.L() - this.field_45016);
         this.field_45019 = (this.field_45019 * 3 + i) / 4;
         this.field_45017 = false;
      } else if (!this.method_52402()) {
         this.method_52396(field_45015);
      }
   }

   @Override
   public void method_52392(class00559 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.m_handler$zji000$fabric_networking_api_v1$handleCustomPayloadReceivedAsync_21(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         ;
      }
   }

   @Override
   public void method_59807(class00381 var1, Exception var2) throws class07878 {
      class01652.super.method_59807(var1, var2);
      this.field_45012.N(var2, var1.method_65080());
   }

   public int method_52405() {
      return this.field_45019;
   }

   private void m_handler$zji000$fabric_networking_api_v1$handleCustomPayloadReceivedAsync_21(class00559 var1, CallbackInfo var2) {
      class01659 class01659 = var1.N();

      try {
         AbstractNetworkAddon<?> abstractnetworkaddon = this.getAddon();
         if (!(abstractnetworkaddon instanceof ServerConfigurationNetworkAddon)) {
            throw new IllegalStateException("Unknown addon");
         }

         boolean flag = ((ServerConfigurationNetworkAddon)abstractnetworkaddon).handle(class01659);
         if (flag) {
            var2.cancel();
         }
      } catch (class03096 class03096) {
         this.field_45012.yK().N(this, var1);
         var2.cancel();
      }
   }
}
