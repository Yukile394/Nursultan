package minecraft;

import Nursultan.class09436;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import de.maxhenkel.voicechat.events.PlayerEvents;
import java.io.File;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents.AfterPlayerChange;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.AfterRespawn;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.Join;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.Leave;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.SyncDataPackContents;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.AllowChatMessage;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.AllowCommandMessage;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.AllowGameMessage;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.ChatMessage;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.CommandMessage;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents.GameMessage;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.network.SyncHandler;

public abstract class class01062 {
   public static final File N = new File("banned-players.json");
   public static final File y = new File("banned-ips.json");
   public static final File L = new File("ops.json");
   public static final File u = new File("whitelist.json");
   public static final class00392 i = class00392.L("chat.filtered_full");
   public static final class00392 R = class00392.L("multiplayer.disconnect.duplicate_login");
   private static final Logger M = LogUtils.getLogger();
   private static final int B = 600;
   private static final SimpleDateFormat Z = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z", Locale.ROOT);
   private final class02796 z;
   private final List<class04770> U = Lists.newArrayList();
   private final Map<UUID, class04770> E = Maps.newHashMap();
   private final class05170 W;
   private final class01086 m;
   private final class01077 P;
   private final class05152 s;
   private final Map<UUID, class04895> T = Maps.newHashMap();
   private final Map<UUID, class03704> b = Maps.newHashMap();
   private final class07842 j;
   private final class02003<class02969> v;
   private int n;
   private int t;
   private boolean G;
   private int l;

   public Optional<class07001> L(class08774 var1) {
      class07001 class07001 = this.z.yn().t();
      if (this.z.N(var1) && class07001 != null) {
         M.debug("loading single player");
         return Optional.of(class07001);
      } else {
         return this.j.N(var1);
      }
   }

   private void L(class00642 var1, class04770 var2, class03713 var3, CallbackInfo var4) {
      ((SyncDataPackContents)ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.invoker()).onSyncDataPackContents(var2, true);
   }

   public class02796 N() {
      return this.z;
   }

   public void L(class04770 var1) {
      this.N(var1, var1.field_13987);
   }

   @Nullable
   public class04770 L(String var1) {
      for (class04770 class04770 : this.U) {
         if (class04770.method_7334().name().equalsIgnoreCase(var1)) {
            return class04770;
         }
      }

      return null;
   }

   public class05170 M() {
      return this.W;
   }

   public int P() {
      return this.z.t();
   }

   public int T() {
      return this.n;
   }

   public class01062(class02796 var1, class02003<class02969> var2, class07842 var3, class06633 var4) {
      super();
      this.z = var1;
      this.v = var2;
      this.j = var3;
      this.s = new class05152(u, var4);
      this.P = new class01077(L, var4);
      this.W = new class05170(N, var4);
      this.m = new class01086(y, var4);
   }

   public class01086 B() {
      return this.m;
   }

   public void Z() {
      for (int ix = 0; ix < this.U.size(); ix++) {
         this.N(this.U.get(ix));
      }
   }

   public void i(class04770 var1) {
      var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y();
      var1.method_14217();
      var1.field_13987.method_14364(new class06664(var1.method_31548().N()));
   }

   public void i(class08774 var1) {
      if (this.P.N(var1)) {
         class04770 class04770 = this.y(var1.N());
         if (class04770 != null) {
            this.u(class04770);
         }
      }
   }

   private void i(class00642 var1, class04770 var2, class03713 var3, CallbackInfo var4) {
      ((Consumer)PlayerEvents.PLAYER_LOGGED_IN.invoker()).accept(var2);
   }

   public void i() {
      if (++this.l > 600) {
         this.N(new class06661(EnumSet.of(class06680.field_29138), this.U));
         this.l = 0;
      }
   }

   public int b() {
      return this.t;
   }

   public boolean s() {
      return this.z.D_();
   }

   public void n() {
      for (class03704 class03704 : this.b.values()) {
         class03704.N(this.z.Nh());
      }

      Map map = class03525.N(this.v);
      this.N(null);
      this.N(new class08076(map));
      class06482 class06482 = this.z.yM();
      class08069 class08069 = new class08069(class06482.y(), class06482.L());

      for (class04770 class04770 : this.U) {
         class04770.field_13987.method_14364(class08069);
         class04770.method_14253().N(class04770);
      }
   }

   public int m() {
      return this.U.size();
   }

   public boolean t() {
      return this.G;
   }

   public List<class04770> v() {
      return this.U;
   }

   public void j() {
      for (int ix = 0; ix < this.U.size(); ix++) {
         this.U.get(ix).field_13987.method_52396(class00392.L("multiplayer.disconnect.server_shutdown"));
      }
   }

   public String[] U() {
      return this.s.y();
   }

   public class05152 z() {
      return this.s;
   }

   private void u(class00642 var1, class04770 var2, class03713 var3, CallbackInfo var4) {
      ServerNetworkingImpl.getAddon(var2.field_13987).onClientReady();
   }

   public void u(class08774 var1) {
      this.N(var1, Optional.empty(), Optional.empty());
   }

   public void u(class04770 var1) {
      class06984 class06984 = this.z.y(var1.method_72498());
      this.N(var1, class06984);
   }

   private void y_3(class04770 var1, CallbackInfo var2) {
      ((Consumer)PlayerEvents.PLAYER_LOGGED_OUT.invoker()).accept(var1);
   }

   public void y(int var1) {
      this.t = var1;
      this.N(new class04022(var1));
      Iterator<class04782> iterator = this.z.NO().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_14178().y(var1);
      }
   }

   @Nullable
   public class04770 y(UUID var1) {
      return this.E.get(var1);
   }

   public boolean y(class08774 var1) {
      return false;
   }

   @Nullable
   public class07001 y() {
      return null;
   }

   private void y(class00642 var1, class04770 var2, class03713 var3, CallbackInfo var4) {
      ((Join)ServerPlayerEvents.JOIN.invoker()).onJoin(var2);
   }

   public List<class04770> y(String var1) {
      ArrayList arraylist = Lists.newArrayList();

      for (class04770 class04770 : this.U) {
         if (class04770.method_14209().equals(var1)) {
            arraylist.add(class04770);
         }
      }

      return arraylist;
   }

   public void y(class04770 var1) {
      this.N(var1, null);
      this.y_3(var1, null);
      class04782 class04782 = var1.method_51469();
      var1.method_7281(class01235.z);
      this.N(var1);
      if (var1.method_5765()) {
         class07049 var3 = var1.method_5668();
         if (var3.method_5817()) {
            M.debug("Removing player mount");
            var1.method_5848();
            var3.method_31748().forEach(var0 -> var0.method_31745(class07062.field_27001));
         }
      }

      var1.method_18375();

      for (class07488 class07488 : var1.method_64128()) {
         class07488.method_31745(class07062.field_27001);
      }

      class04782.method_18770(var1, class07062.field_27001);
      var1.method_14236().N();
      this.U.remove(var1);
      this.z.yU().y(var1);
      UUID uuid = var1.method_5667();
      class04770 class04770 = this.E.get(uuid);
      if (class04770 == var1) {
         this.E.remove(uuid);
         this.T.remove(uuid);
         this.b.remove(uuid);
         this.z.Nt().y(var1);
      }

      this.N(new class02079(List.of(var1.method_5667())));
   }

   public void y(class08036 var1, class00392 var2) {
      class00502 class00502 = var1.method_5781();
      if (class00502 == null) {
         this.N(var2, false);
      } else {
         for (int ix = 0; ix < this.U.size(); ix++) {
            class04770 class04770 = this.U.get(ix);
            if (class04770.method_5781() != class00502) {
               class04770.method_64398(var2);
            }
         }
      }
   }

   public class01077 E() {
      return this.P;
   }

   private void N(class00642 var1, class04770 var2, class03713 var3, CallbackInfo var4) {
      SyncHandler.onPlayerLoggedIn(var2);
   }

   @Nullable
   public class00392 N(SocketAddress var1, class08774 var2) {
      if (this.W.N(var2)) {
         class05157 class05157 = this.W.L(var2);
         class05216 class05216 = class00392.N("multiplayer.disconnect.banned.reason", class05157.i());
         if (class05157.L() != null) {
            class05216.y(class00392.N("multiplayer.disconnect.banned.expiration", Z.format(class05157.L())));
         }

         return class05216;
      } else if (!this.N(var2)) {
         return class00392.L("multiplayer.disconnect.not_whitelisted");
      } else if (this.m.N(var1)) {
         class01072 class01072 = this.m.y(var1);
         class05216 class05216x = class00392.N("multiplayer.disconnect.banned_ip.reason", class01072.i());
         if (class01072.L() != null) {
            class05216x.y(class00392.N("multiplayer.disconnect.banned_ip.expiration", Z.format(class01072.L())));
         }

         return class05216x;
      } else {
         return this.U.size() >= this.P() && !this.y(var2) ? class00392.L("multiplayer.disconnect.server_full") : null;
      }
   }

   public void N(class08036 var1, class00392 var2) {
      class00502 class00502 = var1.method_5781();
      if (class00502 != null) {
         for (String sx : class00502.B()) {
            class04770 class04770 = this.N(sx);
            if (class04770 != null && class04770 != var1) {
               class04770.method_64398(var2);
            }
         }
      }
   }

   public void N(class00381<?> var1, class05946<class07299> var2) {
      for (class04770 class04770 : this.U) {
         if (class04770.method_51469().method_27983() == var2) {
            class04770.field_13987.method_14364(var1);
         }
      }
   }

   public void N(class00381<?> var1) {
      Iterator<class04770> iterator = this.U.iterator();

      while (iterator.hasNext()) {
         iterator.next().field_13987.method_14364(var1);
      }
   }

   public void N(class07438 var1, class01615 var2) {
      for (class07055 class07055 : var1.method_6026()) {
         var2.method_14364(new class08087(var1.method_5628(), class07055, false));
      }
   }

   public class04770 N(class04770 var1, boolean var2, class07062 var3) {
      class01032 class01032 = var1.method_60590(!var2, class01032.N);
      this.U.remove(var1);
      var1.method_51469().method_18770(var1, var3);
      class04782 class04782xx = class01032.y();
      class04770 class04770 = new class04770(this.z, class04782xx, var1.method_7334(), var1.method_53823());
      class04770.field_13987 = var1.field_13987;
      class04770.method_14203(var1, var2);
      class04770.method_5838(var1.method_5628());
      class04770.method_74090(var1.method_6068());
      if (!class01032.M()) {
         class04770.method_60592(var1);
      }

      for (String sx : var1.method_5752()) {
         class04770.method_5780(sx);
      }

      class06889 class06889 = class01032.L();
      class04770.method_5808(class06889.M, class06889.B, class06889.Z, class01032.i(), class01032.R());
      if (class01032.M()) {
         class04770.field_13987.method_14364(new class00503(class00503.y, 0.0F));
      }

      int ix = var2 ? 1 : 0;
      class04782 class04782x = class04770.method_51469();
      class05087 class05087 = class04782x.method_8401();
      class04770.field_13987.method_14364(new class06643(class04770.method_52374(class04782x), (byte)ix));
      class04770.field_13987
         .method_14363(class04770.method_23317(), class04770.method_23318(), class04770.method_23321(), class04770.method_36454(), class04770.method_36455());
      class04770.field_13987.method_14364(new class08096(class04782xx.method_74854()));
      class04770.field_13987.method_14364(new class07258(class05087.s(), class05087.T()));
      class04770.field_13987
         .method_14364(
            new class08060(
               class04770.fields_37fa3311b0e9d3e9b883d09222919bf5a_2,
               class04770.fields_37fa3311b0e9d3e9b883d09222919bf5a_1,
               class04770.fields_37fa3311b0e9d3e9b883d09222919bf5a_0
            )
         );
      this.L(class04770);
      this.N(class04770, class04782xx);
      this.u(class04770);
      class04782xx.method_18215(class04770);
      this.U.add(class04770);
      this.E.put(class04770.method_5667(), class04770);
      class04770.method_34225();
      class04770.method_6033(class04770.method_6032());
      class04744 class04744 = class04770.method_67564();
      if (!var2 && class04744 != null) {
         class05042 class05042 = class04744.N();
         class04782 class04782xx = this.z.N(class05042.N());
         if (class04782xx != null) {
            class07209 class07209 = class05042.y();
            if (class04782xx.method_8320(class07209).N(class00869.TE)) {
               class04770.field_13987
                  .method_14364(
                     new class08073(
                        class04909.dj,
                        class04911.field_15245,
                        class07209.method_10263(),
                        class07209.method_10264(),
                        class07209.method_10260(),
                        1.0F,
                        1.0F,
                        class04782xx.method_8409().B()
                     )
                  );
            }
         }
      }

      this.N(var1, var2, var3, new CallbackInfoReturnable("", false, class04770));
      return class04770;
   }

   public boolean N(UUID var1) {
      Set set = Sets.newIdentityHashSet();

      for (class04770 class04770x : this.U) {
         if (class04770x.method_5667().equals(var1)) {
            set.add(class04770x);
         }
      }

      class04770 class04770x = this.E.get(var1);
      if (class04770x != null) {
         set.add(class04770x);
      }

      Iterator iterator = set.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).field_13987.method_52396(R);
      }

      return !set.isEmpty();
   }

   private void N(class00392 var1, Function var2, boolean var3, CallbackInfo var4) {
      if (!((AllowGameMessage)ServerMessageEvents.ALLOW_GAME_MESSAGE.invoker()).allowGameMessage(this.z, var1, var3)) {
         var4.cancel();
      } else {
         ((GameMessage)ServerMessageEvents.GAME_MESSAGE.invoker()).onGameMessage(this.z, var1, var3);
      }
   }

   private void N(class03926 var1, class07701 var2, class00649 var3, CallbackInfo var4) {
      if (!((AllowCommandMessage)ServerMessageEvents.ALLOW_COMMAND_MESSAGE.invoker()).allowCommandMessage(var1, var2, var3)) {
         var4.cancel();
      } else {
         ((CommandMessage)ServerMessageEvents.COMMAND_MESSAGE.invoker()).onCommandMessage(var1, var2, var3);
      }
   }

   public void N(class04782 var1) {
      var1.method_8621().N(new class09436(this, var1));
   }

   protected void N(class06394 var1, class04770 var2) {
      HashSet hashset = Sets.newHashSet();

      for (class00502 class00502 : var1.i()) {
         var2.field_13987.method_14364(class02565.N(class00502, true));
      }

      for (class01890 class01890 : class01890.values()) {
         class00518 class00518 = var1.N(class01890);
         if (class00518 != null && !hashset.contains(class00518)) {
            for (class00381<?> class00381 : var1.R(class00518)) {
               var2.field_13987.method_14364(class00381);
            }

            hashset.add(class00518);
         }
      }
   }

   public void N(class00642 var1, class04770 var2, class03713 var3) {
      class08774 class08774 = var2.method_72498();
      class08957 class08957 = this.z.Nf().R();
      String sx = class08957.N(class08774.N()).map(class08774::y).orElse(class08774.y());
      class08957.N(class08774);
      class04782 class04782 = var2.method_51469();
      String s1 = var1.method_52909(this.z.NN());
      M.info(
         "{}[{}] logged in with entity id {} at ({}, {}, {})",
         new Object[]{var2.method_74861(), s1, var2.method_5628(), var2.method_23317(), var2.method_23318(), var2.method_23321()}
      );
      class05087 class05087 = class04782.method_8401();
      class01615 class01615 = new class01615(this.z, var1, var2, var3);
      var1.method_56330(class04266.y.N(class04247.N(this.z.yt()), class01615), class01615);
      class01615.method_53046();
      class07305 class07305 = class04782.method_64395();
      boolean flag = class07305.N(class07305.b);
      boolean flag1 = class07305.N(class07305.a);
      boolean flag2 = class07305.N(class07305.n);
      class01615.method_14364(
         new class00482(
            var2.method_5628(), class05087.U(), this.z.NQ(), this.P(), this.T(), this.b(), flag1, !flag, flag2, var2.method_52374(class04782), this.z.r()
         )
      );
      class01615.method_14364(new class07258(class05087.s(), class05087.T()));
      class08033 class08033 = var2.method_31549();
      this.u(var1, var2, var3, null);
      class01615.method_14364(new class06659(class08033));
      class01615.method_14364(new class06664(var2.method_31548().N()));
      class06482 class06482 = this.z.yM();
      this.L(var1, var2, var3, null);
      class01615.method_14364(new class08069(class06482.y(), class06482.L()));
      this.u(var2);
      var2.method_14248().L();
      var2.method_14253().N(var2);
      this.N(class04782.method_14170(), var2);
      this.z.NS();
      class05216 class05216;
      if (var2.method_7334().name().equalsIgnoreCase(sx)) {
         class05216 = class00392.N("multiplayer.player.joined", var2.method_5476());
      } else {
         class05216 = class00392.N("multiplayer.player.joined.renamed", var2.method_5476(), sx);
      }

      this.N(class05216.N(class06541.field_1054), false);
      class01615.method_14363(var2.method_23317(), var2.method_23318(), var2.method_23321(), var2.method_36454(), var2.method_36455());
      class07806 class07806 = this.z.NC();
      if (class07806 != null && !var3.u()) {
         var2.method_43930(class07806);
      }

      var2.field_13987.method_14364(class06661.N(this.U));
      this.U.add(var2);
      this.E.put(var2.method_5667(), var2);
      this.N(class06661.N(List.of(var2)));
      this.N(var2, class04782);
      class04782.method_18213(var2);
      this.z.yU().N(var2);
      this.L(var2);
      var2.method_34225();
      this.z.Nt().N(var2);
      class01615.method_53047();
      this.N(var1, var2, var3, null);
      this.y(var1, var2, var3, null);
      this.i(var1, var2, var3, null);
   }

   private void N(class04770 var1, boolean var2, class07062 var3, CallbackInfoReturnable var4) {
      class04770 class04770 = (class04770)var4.getReturnValue();
      ((AfterRespawn)ServerPlayerEvents.AFTER_RESPAWN.invoker()).afterRespawn(var1, class04770, var2);
      if (var1.method_51469() != class04770.method_51469()) {
         ((AfterPlayerChange)ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.invoker())
            .afterChangeWorld(class04770, var1.method_51469(), class04770.method_51469());
      }
   }

   private void N(class04770 var1, CallbackInfo var2) {
      ((Leave)ServerPlayerEvents.LEAVE.invoker()).onLeave(var1);
   }

   protected void N(class04770 var1) {
      this.j.N(var1);
      class04895 class04895 = this.T.get(var1.method_5667());
      if (class04895 != null) {
         class04895.N();
      }

      class03704 class03704 = this.b.get(var1.method_5667());
      if (class03704 != null) {
         class03704.y();
      }
   }

   private void N(CallbackInfo var1) {
      for (class04770 class04770 : this.v()) {
         ((SyncDataPackContents)ServerLifecycleEvents.SYNC_DATA_PACK_CONTENTS.invoker()).onSyncDataPackContents(class04770, false);
      }
   }

   private void N(class03926 var1, class04770 var2, class00649 var3, CallbackInfo var4) {
      if (!((AllowChatMessage)ServerMessageEvents.ALLOW_CHAT_MESSAGE.invoker()).allowChatMessage(var1, var2, var3)) {
         var4.cancel();
      } else {
         ((ChatMessage)ServerMessageEvents.CHAT_MESSAGE.invoker()).onChatMessage(var1, var2, var3);
      }
   }

   public void N(class08774 var1, Optional<class06984> var2, Optional<Boolean> var3) {
      this.P.N(new class01087(var1, var2.orElse(this.z.T()), var3.orElse(this.P.y(var1))));
      class04770 class04770 = this.y(var1.N());
      if (class04770 != null) {
         this.u(class04770);
      }
   }

   public void N(boolean var1) {
      this.G = var1;
   }

   public void N(class00392 var1, boolean var2) {
      this.N(var1, var1x -> var1, var2);
   }

   public void N(class00392 var1, Function<class04770, class00392> var2, boolean var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.z.N(var1);

         for (class04770 class04770 : this.U) {
            class00392 class00392 = (class00392)var2.apply(class04770);
            if (class00392 != null) {
               class04770.method_43502(class00392, var3);
            }
         }
      }
   }

   public void N(class03926 var1, class07701 var2, class00649 var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1, var2::N, var2.z(), var3);
      }
   }

   public void N(@Nullable class08036 var1, double var2, double var4, double var6, double var8, class05946<class07299> var10, class00381<?> var11) {
      for (int ix = 0; ix < this.U.size(); ix++) {
         class04770 class04770 = this.U.get(ix);
         if (class04770 != var1 && class04770.method_51469().method_27983() == var10) {
            double d0 = var2 - class04770.method_23317();
            double d1 = var4 - class04770.method_23318();
            double d2 = var6 - class04770.method_23321();
            if (d0 * d0 + d1 * d1 + d2 * d2 < var8 * var8) {
               class04770.field_13987.method_14364(var11);
            }
         }
      }
   }

   @Nullable
   public class04770 N(String var1) {
      int ix = this.U.size();

      for (int jx = 0; jx < ix; jx++) {
         class04770 class04770 = this.U.get(jx);
         if (class04770.method_7334().name().equalsIgnoreCase(var1)) {
            return class04770;
         }
      }

      return null;
   }

   public boolean N(class08774 var1) {
      return !this.s() || this.P.u(var1) || this.s.u(var1);
   }

   private void N(class04770 var1, class06984 var2) {
      if (var1.field_13987 != null) {
         byte b0 = switch (var2.N()) {
            case field_63196 -> 24;
            case field_63197 -> 25;
            case field_63198 -> 26;
            case field_63199 -> 27;
            case field_63200 -> 28;
         };
         var1.field_13987.method_14364(new class00509(var1, b0));
      }

      this.z.yL().N(var1);
   }

   public class04895 N(class08036 var1) {
      GameProfile gameprofile = var1.method_7334();
      return this.T.computeIfAbsent(gameprofile.id(), var2x -> {
         Path path = this.N(gameprofile);
         return new class04895(this.z, path);
      });
   }

   private Path N(GameProfile var1) {
      Path path = this.z.N(class05071.y);
      Path path1 = path.resolve(var1.id() + ".json");
      if (Files.exists(path1)) {
         return path1;
      } else {
         String sx = var1.name() + ".json";
         if (class06290.R(sx)) {
            Path path2 = path.resolve(sx);
            if (Files.isRegularFile(path2)) {
               try {
                  return Files.move(path2, path1);
               } catch (IOException ioexception) {
                  M.warn("Failed to copy file {} to {}", sx, path1);
                  return path2;
               }
            }
         }

         return path1;
      }
   }

   public void N(class04770 var1, class04782 var2) {
      class08057 class08057 = var2.method_8621();
      var1.field_13987.method_14364(new class02860(class08057));
      var1.field_13987.method_14364(new class08068(var2.N(), var2.method_8532(), var2.method_64395().N(class07305.N)));
      var1.field_13987.method_14364(new class08096(var2.method_74854()));
      if (var2.method_8419()) {
         var1.field_13987.method_14364(new class00503(class00503.L, 0.0F));
         var1.field_13987.method_14364(new class00503(class00503.Z, var2.method_8430(1.0F)));
         var1.field_13987.method_14364(new class00503(class00503.z, var2.method_8478(1.0F)));
      }

      var1.field_13987.method_14364(new class00503(class00503.P, 0.0F));
      this.z.yW().N(var1);
   }

   public void N(int var1) {
      this.n = var1;
      this.N(new class05705(var1));
      Iterator<class04782> iterator = this.z.NO().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_14178().N(var1);
      }
   }

   public void N(class03926 var1, class04770 var2, class00649 var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1, var2::method_33795, var2, var3);
      }
   }

   private void N(class03926 var1, Predicate<class04770> var2, @Nullable class04770 var3, class00649 var4) {
      boolean flag = this.N(var1);
      this.z.N(var1.u(), var4, flag ? null : "Not Secure");
      class03059 class03059 = class03059.N(var1);
      boolean flag1 = false;

      for (class04770 class04770 : this.U) {
         boolean flag2 = var2.test(class04770);
         class04770.method_43505(class03059, flag2, var4);
         flag1 |= flag2 && var1.z();
      }

      if (flag1 && var3 != null) {
         var3.method_64398(i);
      }
   }

   private boolean N(class03926 var1) {
      return var1.Z() && !var1.N(Instant.now());
   }

   public String[] W() {
      return this.P.y();
   }

   public String[] R() {
      String[] astring = new String[this.U.size()];

      for (int ix = 0; ix < this.U.size(); ix++) {
         astring[ix] = this.U.get(ix).method_7334().name();
      }

      return astring;
   }

   public class03704 R(class04770 var1) {
      UUID uuid = var1.method_5667();
      class03704 class03704 = this.b.get(uuid);
      if (class03704 == null) {
         Path path = this.z.N(class05071.N).resolve(uuid + ".json");
         class03704 = new class03704(this.z.ND(), this, this.z.Nh(), path, var1);
         this.b.put(uuid, class03704);
      }

      class03704.N(var1);
      return class03704;
   }

   public boolean R(class08774 var1) {
      return this.P.u(var1) || this.z.N(var1) && this.z.yn().E() || this.G;
   }

   public void x_() {
   }
}
