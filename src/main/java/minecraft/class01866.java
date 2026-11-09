package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.base.sync_tasks.DataCustomPayload;
import com.viaversion.viafabricplus.base.sync_tasks.SyncTasks;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public abstract class class01866 implements class01662, NetworkHandlerExtensions, ClientCommonPacketListenerImplAccessor {
   private static final class00392 N = class00392.L("disconnect.lost");
   private static final Logger y = LogUtils.getLogger();
   protected final class06202 L;
   protected final class00642 u;
   @Nullable
   protected final class04568 i;
   @Nullable
   protected String R;
   protected final class02090 M;
   @Nullable
   protected final class05096 B;
   protected boolean Z;
   private final List<class01884> m = new ArrayList<>();
   protected final Map<class01894, byte[]> z;
   protected Map<String, String> U;
   private class02243 P;
   protected final Map<UUID, class03458> E;
   protected boolean W;

   protected void K() {
      Iterator<class01884> iterator = this.m.iterator();

      while (iterator.hasNext()) {
         class01884 class01884 = iterator.next();
         if (class01884.y().getAsBoolean()) {
            this.N(class01884.N());
            iterator.remove();
         } else if (class01884.L() <= class07536.L()) {
            iterator.remove();
         }
      }
   }

   protected class01866(class06202 var1, class00642 var2, class01892 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3.M();
      this.R = var3.R();
      this.M = var3.L();
      this.B = var3.B();
      this.z = var3.Z();
      this.U = var3.U();
      this.P = var3.E();
      this.E = new HashMap<>(var3.W());
      this.W = var3.m();
   }

   @Nullable
   public String V() {
      return this.R;
   }

   protected abstract class08781 n();

   public class02243 o() {
      return this.P;
   }

   public void q() {
      class05096 class05096 = (class05096)this.L.v_3;
      if (class05096 instanceof class00132 class00132) {
         if (class00132.N() instanceof class00134 class00134) {
            class00132.N(class00134.L());
         }
      } else {
         class05096 = (class05096)this.L.v_3;
         if (class05096 instanceof class00134 class00134x) {
            this.L.N(class00134x.L());
         }
      }
   }

   private void y(class00489 var1, CallbackInfo var2) {
      if (var1.N() instanceof DataCustomPayload datacustompayload) {
         DataCustomPayload datacustompayload1 = datacustompayload;

         try {
            class00667 = datacustompayload1.buf();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         SyncTasks.handleSyncTask(class00667);
         var2.cancel();
      }
   }

   private void N(class00381<? extends class01636> var1, BooleanSupplier var2, Duration var3) {
      if (var2.getAsBoolean()) {
         this.N(var1);
      } else {
         this.m.add(new class01884(var1, var2, class07536.L() + var3.toMillis()));
      }
   }

   public void N(class00381<?> var1) {
      this.u.method_10743(var1);
   }

   @Override
   public void N(class07080 var1, class07074 var2) {
      var2.N("Is Local", () -> String.valueOf(this.u.method_10756()));
      var2.N("Server type", () -> this.i != null ? this.i.R().toString() : "<none>");
      var2.N("Server brand", () -> this.R);
      if (!this.U.isEmpty()) {
         class07074 class07074 = var1.N("Custom Server Details");
         this.U.forEach(class07074::N);
      }
   }

   protected class05096 N(class02570 var1) {
      class05096 class05096 = Objects.requireNonNullElseGet(this.B, () -> (class05096)(this.i != null ? new class05304(new class04705()) : new class04705()));
      return this.i != null && this.i.i() ? new class05364(class05096, N, var1, class05220.U) : new class05364(class05096, N, var1);
   }

   private class05096 N(UUID var1, URL var2, String var3, boolean var4, @Nullable class00392 var5) {
      class05096 class05096 = (class05096)this.L.v_3;
      return class05096 instanceof class01851
         ? ((class01851)class05096).N(this.L, var1, var2, var3, var4, var5)
         : new class01851(this, this.L, class05096, (boolean)List.<class01847>of(new class01847(var1, var2, var3)), var4, var5);
   }

   private void N(CallbackInfoReturnable var1) {
      if (DebugSettings.INSTANCE.dontCreatePacketErrorCrashReports.isEnabled()) {
         var1.setReturnValue(Optional.empty());
      }
   }

   private boolean N(class00642 var1, class02570 var2) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_3);
   }

   private void N(class06666 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2) && N(var1.y()) == null) {
         this.u.method_10743(new class07367(var1.N(), class07369.field_47667));
         var2.cancel();
      }
   }

   private void N(class01866 var1, class00381 var2, BooleanSupplier var3, Duration var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)) {
         this.N(var2);
      } else {
         this.N(var2, var3, var4);
      }
   }

   private void N(class03462 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         short short1 = (short)(var1.N() >> 16 & 0xFF);
         if (short1 != 0 && short1 != ((class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b) {
            var2.cancel();
         }
      }
   }

   @Override
   public void N(class00501 var1) {
      this.u.method_10747(var1.N());
   }

   public void N(class00489 var1, CallbackInfo var2) {
      class01659 class01659 = var1.N();

      try {
         AbstractNetworkAddon<?> abstractnetworkaddon = this.getAddon();
         boolean flag;
         if (abstractnetworkaddon instanceof ClientPlayNetworkAddon) {
            flag = ((ClientPlayNetworkAddon)abstractnetworkaddon).handle(class01659);
         } else {
            abstractnetworkaddon = this.getAddon();
            if (!(abstractnetworkaddon instanceof ClientConfigurationNetworkAddon)) {
               throw new IllegalStateException("Unknown network addon");
            }

            flag = ((ClientConfigurationNetworkAddon)abstractnetworkaddon).handle(class01659);
         }

         if (flag) {
            var2.cancel();
         }
      } catch (class03096 class03096) {
         this.L.B().N(this, var1);
         var2.cancel();
      }
   }

   @Override
   public void N(class03807 var1) {
      class00417.N(var1, this, this.L.B());
      var1.N().ifPresentOrElse(var1x -> this.L.yL().N(var1x), () -> this.L.yL().i());
   }

   static class00392 N(class00392 var0, @Nullable class00392 var1) {
      return (class00392)(var1 == null ? var0 : class00392.N("multiplayer.texturePrompt.serverPrompt", var0, var1));
   }

   @Nullable
   private static URL N(String var0) {
      try {
         URL url = new URL(var0);
         String s = url.getProtocol();
         return !"http".equals(s) && !"https".equals(s) ? null : url;
      } catch (MalformedURLException malformedurlexception) {
         return null;
      }
   }

   @Override
   public void N(class04278 var1) {
      class00417.N(var1, this, this.L.B());
      this.u.method_10743(new class04269(var1.N(), this.z.get(var1.N())));
   }

   private Optional<Path> N(@Nullable class00381 var1, Throwable var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Optional<Path>)callbackinforeturnable.getReturnValue();
      } else {
         class07080 class07080 = class07080.N(var2, "Packet handling error");
         class00417.N(class07080, this, var1);
         Path path = ((File)this.L.l_1).toPath().resolve("debug").resolve("disconnect-" + class07536.R() + "-client.txt");
         List list = this.P.N(class02222.field_51981).map(var0 -> List.of("Server bug reporting link: " + var0.L())).orElse(List.of());
         return class07080.N(path, class02587.u, list) ? Optional.of(path) : Optional.empty();
      }
   }

   @Override
   public void N(class02602 var1) {
      class00417.N(var1, this, this.L.B());
      this.U = var1.N();
   }

   @Override
   public void N(class00506 var1) {
      class00552 class00552 = new class00552(var1.N());
      BooleanSupplier booleansupplier1 = () -> !RenderSystem.isFrozenAtPollEvents();
      Duration duration = Duration.ofMinutes(1L);
      BooleanSupplier booleansupplier = booleansupplier1;
      class00552 class00552x = class00552;
      this.N(this, class00552x, booleansupplier, duration);
   }

   @Override
   public void N(class03462 var1) {
      class00417.N(var1, this, this.L.B());
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(new class03451(var1.N()));
      }
   }

   @Override
   public void N(class00489 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.N(var1, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            class01659 class01659 = var1.N();
            if (!(class01659 instanceof class01638)) {
               class00417.N(var1, this, this.L.B());
               if (class01659 instanceof class01644 class01644) {
                  this.R = class01644.N();
                  this.M.N(class01644.N());
               } else {
                  this.N(class01659);
               }
            }
         }
      }
   }

   protected abstract void N(class01659 var1);

   @Override
   public void N(class06666 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class00417.N(var1, this, this.L.B());
         UUID uuid = var1.N();
         URL url = N(var1.y());
         if (url == null) {
            this.u.method_10743(new class07367(uuid, class07369.field_47667));
         } else {
            String s = var1.L();
            boolean flag = var1.u();
            class04575 class04575 = this.i != null ? this.i.y() : class04575.field_3767;
            if (class04575 != class04575.field_3767 && (!flag || class04575 != class04575.field_3764)) {
               this.L.yL().N(uuid, url, s);
            } else {
               this.L.N(this.N(uuid, url, s, flag, var1.M().orElse(null)));
            }
         }
      }
   }

   protected void N(class03556<class09037> var1, class08781 var2, @Nullable class05096 var3) {
      if (var3 instanceof class00132 class00132) {
         class05096 class05096x = class00132.N();
         class05096 class05096x = class05096x instanceof class00134 class00134xx ? class00134xx.L() : class05096x;
         class00134 class00134x = class00097.N((class09037)var1.N(), class05096x, var2);
         if (class00134x != null) {
            class00132.N(class00134x);
         } else {
            y.warn("Failed to show dialog for data {}", var1);
         }
      } else {
         class05096 class05096xx;
         if (var3 instanceof class00134 class00134xxx) {
            class05096xx = class00134xxx.L();
         } else if (var3 instanceof class08739 class08739) {
            class05096xx = class08739.N();
         } else {
            class05096xx = var3;
         }

         class00134 class00134x = class00097.N((class09037)var1.N(), class05096xx, var2);
         if (class00134x != null) {
            this.L.N(class00134x);
         } else {
            y.warn("Failed to show dialog for data {}", var1);
         }
      }
   }

   @Override
   public void N(class09014 var1) {
      class00417.N(var1, this, this.L.B());
      this.q();
   }

   @Override
   public void N(class02870 var1) {
      this.Z = true;
      class00417.N(var1, this, this.L.B());
      if (this.i == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.u.method_10747(class00392.L("disconnect.transfer"));
         this.u.method_10757();
         this.u.method_10768();
         class03420 class03420 = new class03420(var1.N(), var1.y());
         class05763.N(Objects.requireNonNullElseGet(this.B, class04705::new), this.L, class03420, this.i, false, new class04254(this.z, this.E, this.W));
      }
   }

   @Override
   public class02570 N(class00392 var1, Throwable var2) {
      Optional<Path> optional = this.N(null, var2);
      Optional optional1 = this.P.N(class02222.field_51981).map(class02213::L);
      return new class02570(var1, optional, optional1);
   }

   @Override
   public void N(class02872 var1) {
      class00417.N(var1, this, this.L.B());
      this.z.put(var1.N(), var1.y());
   }

   @Override
   public void N(class02581 var1) {
      class00417.N(var1, this, this.L.B());
      List<class02231> list = var1.N();
      Builder builder = ImmutableList.builderWithExpectedSize(list.size());

      for (class02231 class02231 : list) {
         try {
            URI uri = class07536.N(class02231.y());
            builder.add(new class02213(class02231.N(), uri));
         } catch (Exception exception) {
            y.warn("Received invalid link for type {}:{}", new Object[]{class02231.N(), class02231.y(), exception});
         }
      }

      this.P = new class02243(builder.build());
   }

   @Override
   public void N(class09030 var1) {
      class00417.N(var1, this, this.L.B());
      this.N(var1.N(), (class05096)this.L.v_3);
   }

   public void N(class03556<class09037> var1, @Nullable class05096 var2) {
      this.N(var1, this.n(), var2);
   }

   @Override
   public void method_10839(class02570 var1) {
      this.M.L();
      this.L.N(this.N(var1), this.Z);
      y.warn("Client disconnected with reason: {}", var1.N().getString());
   }

   @Override
   public void method_59807(class00381 var1, Exception var2) {
      y.error("Failed to handle packet {}, disconnecting", var1, var2);
      Optional<Path> optional = this.N(var1, var2);
      Optional optional1 = this.P.N(class02222.field_51981).map(class02213::L);
      class00642 class00642 = this.u;
      class02570 class02570 = new class02570(class00392.L("disconnect.packetError"), optional, optional1);
      class00642 class00642x = class00642;
      if (this.N(class00642x, class02570)) {
         class00642x.method_60924(class02570);
      }
   }

   @Override
   public boolean method_52413(class00381<?> var1) {
      return class01662.super.method_52413(var1) ? true : this.Z && (var1 instanceof class02872 || var1 instanceof class02870);
   }
}
