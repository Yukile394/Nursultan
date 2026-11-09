package minecraft;

import com.viaversion.viafabricplus.injection.access.networking.downloading_terrain.ILevelLoadingScreen;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05850 extends class05096 implements ILevelLoadingScreen {
   private static final class00392 N = class00392.L("multiplayer.downloadingTerrain");
   private static final class00392 y = class00392.L("narrator.ready_to_play");
   private static final long L = 2000L;
   private static final int u = 200;
   private class05384 i;
   private float R;
   private long M;
   private class05858 B;
   @Nullable
   private class08388 Z;
   private static final Object2IntMap<class00549> z = class07536.N(new Object2IntOpenHashMap(), var0 -> {
      var0.defaultReturnValue(0);
      var0.put(class00549.L, 5526612);
      var0.put(class00549.u, 10066329);
      var0.put(class00549.i, 6250897);
      var0.put(class00549.R, 8434258);
      var0.put(class00549.M, 13750737);
      var0.put(class00549.B, 7497737);
      var0.put(class00549.Z, 3159410);
      var0.put(class00549.z, 2213376);
      var0.put(class00549.U, 13421772);
      var0.put(class00549.E, 16769184);
      var0.put(class00549.W, 15884384);
      var0.put(class00549.m, 16777215);
   });
   private long U;
   private int E;
   private boolean W;
   private boolean m = false;

   public class05850(class05384 var1, class05858 var2) {
      super(class05153.N);
      this.M = -1L;
      this.i = var1;
      this.B = var2;
   }

   public static void N(class01054 var0, int var1, int var2, int var3, int var4, class08771 var5) {
      int ix = var3 + var4;
      int j = var5.N() * 2 + 1;
      int k = j * ix - var4;
      int l = var1 - k / 2;
      int i1 = var2 - k / 2;
      if (((class05731)class06202.Nq().L_0).y(class06134.V)) {
         int j1 = ix / 2 + 1;
         var0.N(var1 - j1, var2 - j1, var1 + j1, var2 + j1, -65536);
      }

      for (int j2 = 0; j2 < j; j2++) {
         for (int k1 = 0; k1 < j; k1++) {
            class00549 class00549 = var5.N(j2, k1);
            int l1 = l + j2 * ix;
            int i2 = i1 + k1 * ix;
            var0.N(l1, i2, l1 + var3, i2 + var3, class02566.M(z.getInt(class00549)));
         }
      }
   }

   private class08388 N() {
      if (this.Z != null) {
         return this.Z;
      } else {
         this.Z = this.field_22787.yU().N().N(class00869.iq.W());
         return this.Z;
      }
   }

   private class05858 N(class05850 var1) {
      return VisualSettings.INSTANCE.hideDownloadTerrainScreenTransitionEffects.isEnabled() ? class05858.field_51489 : this.B;
   }

   private void N(CallbackInfo var1) {
      if (class06202.Nq() == null || !class06202.Nq().q()) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            var1.cancel();
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
               if (this.W) {
                  this.method_25419();
               }

               if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_1)) {
                  this.E++;
                  if (this.E % 20 == 0) {
                     this.field_22787.NE().N(new class00552(0L));
                  }
               }
            } else if (System.currentTimeMillis() > this.U + 30000L) {
               this.method_25419();
            } else if (this.m) {
               if ((class04453)this.field_22787.T_4 == null) {
                  return;
               }

               class07209 class07209 = ((class04453)this.field_22787.T_4).method_24515();
               if ((class03448)this.field_22787.T_3 != null && ((class03448)this.field_22787.T_3).method_31601(class07209.method_10264())
                  || ((class03063)this.field_22787.B_2).N(class07209)
                  || ((class04453)this.field_22787.T_4).method_7325()
                  || !((class04453)this.field_22787.T_4).method_5805()) {
                  this.method_25419();
               }
            } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1)) {
               this.m = this.W || System.currentTimeMillis() > this.U + 2000L;
            } else {
               this.m = this.W;
            }
         }
      }
   }

   private void N(class01054 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if ((Boolean)GeneralSettings.INSTANCE.showClassicLoadingProgressInConnectScreen.getValue()) {
         UserConnection userconnection = ProtocolTranslator.getPlayNetworkUserConnection();
         if (userconnection == null) {
            return;
         }

         ClassicProgressStorage classicprogressstorage = (ClassicProgressStorage)userconnection.get(ClassicProgressStorage.class);
         if (classicprogressstorage == null) {
            return;
         }

         var1.N((class01590)this.field_22787.i_3, ChatUtil.prefixText(classicprogressstorage.status), this.field_22789 / 2, this.field_22790 / 2 - 30, -1);
      }
   }

   public void N(class05384 var1, class05858 var2) {
      this.i = var1;
      this.B = var2;
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5, float var6) {
      var1.N(var2, var3, var2 + var4, var3 + var5, -16777216);
      var1.N(var2, var3, var2 + Math.round(var6 * var4), var3 + var5, -16711936);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.method_37063(class05362.method_46430(class05220.U, var1 -> this.method_25419()).N(74).N(5, 5).N());
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25393() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         super.method_25393();
         this.R = this.R + (this.i.i() - this.R) * 0.2F;
         if (this.i.y()) {
            this.method_25419();
         }
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      switch (this.N(this)) {
         case field_51487:
            var1.N(class08394.Nf, this.N(), 0, 0, var1.N(), var1.y());
            break;
         case field_51488:
            class08627 class08627 = class06202.Nq().NO();
            class08918 class08918x = class08627.y(class03334.N);
            class08918 class08918x = class08627.y(class03334.y);
            class08679 class08679 = class08679.N(class08918x.method_71659(), class08918x.method_75484(), class08918x.method_71659(), class08918x.method_75484());
            var1.N(class08394.Nb, class08679, 0, 0, this.field_22789, this.field_22790);
            break;
         case field_51489:
            this.method_57728(var1, var4);
            this.method_57734(var1);
            this.method_57735(var1);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      long ix = class07536.L();
      if (ix - this.M > 2000L) {
         this.M = ix;
         this.method_37064(true);
      }

      int j = this.field_22789 / 2;
      int k = this.field_22790 / 2;
      class08771 class08771 = this.i.u();
      int l;
      if (class08771 != null) {
         byte b0 = 2;
         N(var1, j, k, 2, 0, class08771);
         l = k - class08771.N() * 2 - 27;
      } else {
         l = k - 50;
      }

      var1.N(this.field_22793, N, j, l, -1);
      if (this.i.R()) {
         this.N(var1, j - 100, l + 9 + 3, 200, 2, this.R);
      }

      this.N(var1, var2, var3, var4, null);
   }

   @Override
   public void method_25419() {
      this.field_22787.NT().u(y);
      super.method_25419();
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   protected boolean method_48262() {
      return false;
   }

   @Override
   protected void method_37056(class03428 var1) {
      if (this.i.R()) {
         var1.N(class03457.field_33788, class00392.N("loading.progress", class04995.y(this.i.i() * 100.0F)));
      }
   }

   public void viaFabricPlus$setReady() {
      this.W = true;
   }
}
