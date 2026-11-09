package minecraft;

import com.google.common.collect.Queues;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.AllowChat;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.AllowGame;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.Chat;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.ChatCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.Game;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.GameCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents.ModifyGame;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class03040 {
   private static final class00392 N = class00392.L("chat.validation_error").N(class06541.field_1061, class06541.field_1056);
   private final class06202 y;
   private final Deque<class03062> L = Queues.newArrayDeque();
   private long u;
   private long i;

   public long L() {
      return this.L.size();
   }

   public class03040(class06202 var1) {
      super();
      this.y = var1;
   }

   private boolean i() {
      return this.u > 0L && class07536.L() < this.i + this.u;
   }

   public void u() {
      this.L.forEach(class03062::N);
      this.L.clear();
      this.i = 0L;
   }

   private void y(class00649 var1, class03926 var2, class00392 var3, GameProfile var4, boolean var5, Instant var6, CallbackInfoReturnable var7) {
      class00392 class00392 = var2.P().y(var2.L());
      if (class00392 != null) {
         this.N(var1.N(class00392), var2, var4, var1, var6, var7);
      }
   }

   public void y() {
      this.L.remove().N();
   }

   public void N(class00392 var1, boolean var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var1);
      this.N(var1, var2, callbackinfo, localrefimpl);
      var1 = (class00392)localrefimpl.dispose();
      if (!callbackinfo.isCancelled()) {
         if (!((class05630)this.y.i_7).Nt().method_41753() || !this.y.N(this.N(var1))) {
            if (var2) {
               ((class01056)this.y.i_6).N(var1, false);
               this.y.NT().L(var1);
            } else {
               ((class01056)this.y.i_6).i().N(var1);
               this.N(var1, Instant.now());
               this.y.NT().y(var1);
            }
         }
      }
   }

   private boolean N(UUID var1) {
      return this.y.q() && (class04453)this.y.T_4 != null ? ((class04453)this.y.T_4).method_7334().id().equals(var1) : false;
   }

   private UUID N(class00392 var1) {
      String s = StringUtils.substringBetween(class05232.N(var1), "<", ">");
      return s == null ? class07536.R : this.y.yv().N(s);
   }

   private void N(class00392 var1, boolean var2, CallbackInfo var3, LocalRef var4) {
      if (((AllowGame)ClientReceiveMessageEvents.ALLOW_GAME.invoker()).allowReceiveGameMessage((class00392)var4.get(), var2)) {
         var4.set(((ModifyGame)ClientReceiveMessageEvents.MODIFY_GAME.invoker()).modifyReceivedGameMessage((class00392)var4.get(), var2));
         ((Game)ClientReceiveMessageEvents.GAME.invoker()).onReceiveGameMessage((class00392)var4.get(), var2);
      } else {
         ((GameCanceled)ClientReceiveMessageEvents.GAME_CANCELED.invoker()).onReceiveGameMessageCanceled((class00392)var4.get(), var2);
         var3.cancel();
      }
   }

   private void N(class00392 var1, @Nullable class03926 var2, @Nullable GameProfile var3, class00649 var4, Instant var5, CallbackInfoReturnable var6) {
      if (((AllowChat)ClientReceiveMessageEvents.ALLOW_CHAT.invoker()).allowReceiveChatMessage(var1, var2, var3, var4, var5)) {
         ((Chat)ClientReceiveMessageEvents.CHAT.invoker()).onReceiveChatMessage(var1, var2, var3, var4, var5);
      } else {
         ((ChatCanceled)ClientReceiveMessageEvents.CHAT_CANCELED.invoker()).onReceiveChatMessageCanceled(var1, var2, var3, var4, var5);
         var6.setReturnValue(false);
      }
   }

   private void N(class00649 var1, class00392 var2, Instant var3, CallbackInfoReturnable var4) {
      this.N(var1.N(var2), null, null, var1, var3, var4);
   }

   private void N(class00649 var1, class03926 var2, class00392 var3, GameProfile var4, boolean var5, Instant var6, CallbackInfoReturnable var7) {
      this.N(var3, var2, var4, var1, var6, var7);
   }

   public void N(UUID var1, @Nullable class04469 var2, class00649 var3) {
      this.N(null, () -> {
         class01683 class01683 = this.y.NE();
         if (class01683 != null && var2 != null) {
            class01683.N(var2, false);
         }

         if (this.y.N(var1)) {
            return false;
         } else {
            class00392 class00392 = var3.N(N);
            ((class01056)this.y.i_6).i().N(class00392, null, class03054.u());
            this.y.NT().y(var3.y(N));
            this.i = class07536.L();
            return true;
         }
      });
   }

   public void N(class03926 var1, GameProfile var2, class00649 var3) {
      boolean flag = ((class05630)this.y.i_7).Nl().method_41753();
      class03926 class03926 = flag ? var1.N() : var1;
      class00392 class00392 = var3.N(class03926.u());
      Instant instant = Instant.now();
      this.N(var1.E(), () -> {
         boolean flagx = this.N(var3, var1, class00392, var2, flag, instant);
         class01683 class01683 = this.y.NE();
         if (class01683 != null && var1.E() != null) {
            class01683.N(var1.E(), flagx);
         }

         return flagx;
      });
   }

   private void N(@Nullable class04469 var1, BooleanSupplier var2) {
      if (this.i()) {
         this.L.add(new class03062(var1, var2));
      } else {
         var2.getAsBoolean();
      }
   }

   public boolean N(class04469 var1) {
      return this.L.removeIf(var1x -> var1.equals(var1x.y()));
   }

   public void N(double var1) {
      long ix = (long)(var1 * 1000.0);
      if (ix == 0L && this.u > 0L && !this.y.P()) {
         this.u();
      }

      this.u = ix;
   }

   public void N() {
      if (this.y.P()) {
         if (this.u > 0L) {
            this.i += 50L;
         }
      } else {
         if (this.u == 0L) {
            if (!this.L.isEmpty()) {
               this.u();
            }
         } else {
            class03062 class03062;
            if (class07536.L() >= this.i + this.u) {
               do {
                  class03062 = this.L.poll();
               } while (class03062 != null && !class03062.N());
            }
         }
      }
   }

   private void N(class00392 var1, Instant var2) {
      this.y.R().y().N(class03387.N(var1, var2));
   }

   private void N(class03926 var1, GameProfile var2, class03086 var3) {
      this.y.R().y().N(class03387.N(var2, var1, var3));
   }

   private class03086 N(class03926 var1, class00392 var2, Instant var3) {
      return this.N(var1.M()) ? class03086.field_39780 : class03086.N(var1, var2, var3);
   }

   private void N(class00649 var1, class00392 var2) {
      this.y.NT().N(var1.y(var2));
   }

   private boolean N(class00649 var1, class03926 var2, class00392 var3, GameProfile var4, boolean var5, Instant var6) {
      class03086 class03086 = this.N(var2, var3, var6);
      if (var5 && class03086.N()) {
         return false;
      } else if (!this.y.N(var2.M()) && !var2.z()) {
         class03054 class03054 = class03086.N(var2);
         class04469 class04469 = var2.E();
         class03055 class03055 = var2.P();
         if (class03055.N()) {
            class01056 class01056x = (class01056)this.y.i_6;
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
            this.N(var1, var2, var3, var4, var5, var6, callbackinforeturnable);
            if (callbackinforeturnable.isCancelled()) {
               return callbackinforeturnable.getReturnValueZ();
            }

            class01056x.i().N(var3, class04469, class03054);
            this.N(var1, var2.u());
         } else {
            class00392 class00392 = class03055.y(var2.L());
            if (class00392 != null) {
               class01056 class01056 = (class01056)this.y.i_6;
               CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
               this.y(var1, var2, var3, var4, var5, var6, callbackinforeturnable1);
               if (callbackinforeturnable1.isCancelled()) {
                  return callbackinforeturnable1.getReturnValueZ();
               }

               class01056.i().N(var1.N(class00392), class04469, class03054);
               this.N(var1, class00392);
            }
         }

         this.N(var2, var4, class03086);
         this.i = class07536.L();
         return true;
      } else {
         return false;
      }
   }

   public void N(class00392 var1, class00649 var2) {
      Instant instant = Instant.now();
      this.N(null, () -> {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.N(var2, var1, instant, callbackinforeturnable);
         if (callbackinforeturnable.isCancelled()) {
            return callbackinforeturnable.getReturnValueZ();
         } else {
            class00392 class00392 = var2.N(var1);
            ((class01056)this.y.i_6).i().N(class00392);
            this.N(var2, var1);
            this.N(class00392, instant);
            this.i = class07536.L();
            return true;
         }
      });
   }
}
