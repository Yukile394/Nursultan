package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import org.jspecify.annotations.Nullable;

public class class05692 extends class05681 implements class07583 {
   private static final int y = 32;
   private static final int L = 5;
   private static final int u = 10;
   private static final int i = 8;
   private final class05304 R;
   private final class06202 M;
   private final class04568 B;
   private class04182 Z;
   @Nullable
   private byte[] z;
   @Nullable
   private List<class00392> U;
   @Nullable
   private class01894 E;
   @Nullable
   private class00392 W;
   private boolean m;

   public class04568 L() {
      return this.B;
   }

   protected class05692(class05691 var1, class05304 var2, class04568 var3) {
      super();
      this.N = var1;
      this.m = false;
      this.R = var2;
      this.B = var3;
      this.M = class06202.Nq();
      this.Z = class04182.y(this.M.NO(), var3.y);
      this.u();
   }

   @Override
   public void close() {
      this.Z.close();
   }

   private class04579 z() {
      return this.m ? this.B.B() : class04579.field_47883;
   }

   private void u() {
      this.U = null;
      switch (this.B.B()) {
         case field_47880:
         case field_47881:
            this.E = class05691.L;
            this.W = class05691.w;
            break;
         case field_47883:
            this.E = class05691.N;
            this.W = class05691.l;
            this.U = this.B.Z;
            break;
         case field_47882:
            this.E = class05691.y;
            this.W = class05691.d;
            break;
         case field_47884:
            if (this.B.R < 150L) {
               this.E = class05691.M;
            } else if (this.B.R < 300L) {
               this.E = class05691.R;
            } else if (this.B.R < 600L) {
               this.E = class05691.i;
            } else if (this.B.R < 1000L) {
               this.E = class05691.u;
            } else {
               this.E = class05691.L;
            }

            this.W = class00392.N("multiplayer.status.ping", this.B.R);
            this.U = this.B.Z;
      }
   }

   public void y() {
      this.R.L().y();
   }

   private Future N(ThreadPoolExecutor var1, Runnable var2, Operation var3) {
      ProtocolVersion protocolversion = this.B.viaFabricPlus$forcedVersion();
      if (protocolversion == null) {
         protocolversion = ProtocolTranslator.getTargetVersion();
      }

      this.m = DebugSettings.INSTANCE.disableServerPinging.isEnabled(protocolversion);
      if (this.m) {
         this.B.B = class00392.N(protocolversion.getName());
         return null;
      } else {
         return (Future)var3.call(new Object[]{var1, var2});
      }
   }

   private List N(class01590 var1, class05936 var2, int var3) {
      return this.m ? var1.L(class00392.N(this.B.y), var3) : var1.L(var2, var3);
   }

   private void N(class01054 var1, class00392 var2, int var3, int var4, Operation var5) {
      ArrayList arraylist = new ArrayList();
      arraylist.add(var2);
      if ((Boolean)GeneralSettings.INSTANCE.showAdvertisedServerVersion.getValue()) {
         ProtocolVersion protocolversion = this.B.viaFabricPlus$translatingVersion();
         if (protocolversion != null) {
            arraylist.add(class00392.N("base.viafabricplus.via_translates_to", protocolversion.getName() + " (" + protocolversion.getOriginalVersion() + ")"));
            arraylist.add(class00392.N("base.viafabricplus.server_version", this.B.B.getString() + " (" + this.B.M + ")"));
         }
      }

      var1.N(Lists.transform(arraylist, class00392::method_30937), var3, var4);
   }

   private boolean N(class01054 var1, class00392 var2, int var3, int var4) {
      return !this.m;
   }

   private class01894 N(class04182 var1) {
      return this.m ? class04182.N : this.Z.y();
   }

   private boolean N(class01054 var1, List var2, int var3, int var4) {
      return !this.m;
   }

   private boolean N(class01054 var1, RenderPipeline var2, class01894 var3, int var4, int var5, int var6, int var7) {
      return !this.m;
   }

   private int N(int var1) {
      if (this.m) {
         var1 += 12;
      }

      return var1;
   }

   private boolean N(@Nullable byte[] var1) {
      if (var1 == null) {
         this.Z.N();
      } else {
         try {
            this.Z.N(class08280.N(var1));
         } catch (Throwable throwable) {
            class05691.j.error("Invalid icon for server {} ({})", new Object[]{this.B.N, this.B.y, throwable});
            return false;
         }
      }

      return true;
   }

   @Override
   public void N() {
      this.R.N(this.B);
   }

   private void N(int var1, int var2) {
      this.R.L().N(var1, var2);
      class05691.N(this.R.N, var1, var2);
   }

   @Override
   boolean N(class05681 var1) {
      return var1 instanceof class05692 && ((class05692)var1).B == this.B;
   }

   protected void N(class01054 var1, int var2, int var3, class01894 var4) {
      var1.N(class08394.Na, var4, var2, var3, 0.0F, 0.0F, 32, 32, 32, 32);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.N();
         return true;
      } else {
         if (var1.W()) {
            int ix = this.R.N.method_25396().indexOf(this);
            if (ix == -1) {
               return true;
            }

            if (var1.Z() && ix < this.R.L().L() - 1 || var1.B() && ix > 0) {
               this.N(ix, var1.Z() ? ix + 1 : ix - 1);
               return true;
            }
         }

         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      int ix = (int)var1.n() - this.method_73380();
      int j = (int)var1.t() - this.method_73382();
      if (this.L(ix, j, 32)) {
         this.N();
         return true;
      } else {
         int k = this.R.N.method_25396().indexOf(this);
         if (k > 0 && this.R(ix, j, 32)) {
            this.N(k, k - 1);
            return true;
         } else if (k < this.R.L().L() - 1 && this.M(ix, j, 32)) {
            this.N(k, k + 1);
            return true;
         } else {
            if (var2) {
               this.N();
            }

            return super.method_25402(var1, var2);
         }
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      if (this.B.B() == class04579.field_47880) {
         this.B.N(class04579.field_47881);
         this.B.u = class05220.N;
         this.B.L = class05220.N;
         ThreadPoolExecutor threadpoolexecutor1 = class05691.v;
         Runnable runnable = () -> {
            try {
               this.R.y().N(this.B, () -> this.M.execute(this::y), () -> {
                  this.B.N(this.B.M == class07529.y().comp_4027() ? class04579.field_47884 : class04579.field_47883);
                  this.M.execute(this::u);
               }, class00606.N(((class05630)this.M.i_7).NC()));
            } catch (UnknownHostException unknownhostexception) {
               this.B.N(class04579.field_47882);
               this.B.u = class05691.t;
               this.M.execute(this::u);
            } catch (Exception exception) {
               this.B.N(class04579.field_47882);
               this.B.u = class05691.G;
               this.M.execute(this::u);
            }
         };
         ThreadPoolExecutor threadpoolexecutor = threadpoolexecutor1;
         this.N(threadpoolexecutor, runnable, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.concurrent.ThreadPoolExecutor, java.lang.Runnable]");
            return ((ThreadPoolExecutor)var0[0]).submit((Runnable)var0[1]);
         });
      }

      var1.y((class01590)this.M.i_3, this.B.N, this.method_73380() + 32 + 3, this.method_73382() + 1, -1);
      class01590 class01590x = (class01590)this.M.i_3;
      class00392 class00392x = this.B.u;
      int k1 = this.method_73387() - 32 - 2;
      class00392 class00392x = class00392x;
      class01590 class01590x = class01590x;
      List list = this.N(class01590x, class00392x, k1);

      for (int ix = 0; ix < Math.min(list.size(), 2); ix++) {
         var1.y((class01590)this.M.i_3, (class01028)list.get(ix), this.method_73380() + 32 + 3, this.method_73382() + 12 + 9 * ix, -8355712);
      }

      class04182 class04182 = this.Z;
      this.N(var1, this.method_73380(), this.method_73382(), this.N(class04182));
      int i2 = this.N.method_25396().indexOf(this);
      if (this.B.B() == class04579.field_47881) {
         int j = (int)(class07536.L() / 100L + i2 * 2 & 7L);
         if (j > 4) {
            j = 8 - j;
         }
         this.E = switch (j) {
            case 1 -> class05691.Z;
            case 2 -> class05691.z;
            case 3 -> class05691.U;
            case 4 -> class05691.E;
            default -> class05691.B;
         };
      }

      int j2 = this.method_73389() - 10 - 5;
      if (this.E != null) {
         RenderPipeline renderpipeline1 = class08394.Na;
         class01894 class01894x = this.E;
         int i3 = this.method_73382();
         byte b1 = 8;
         byte b0 = 10;
         int l1 = i3;
         class01894 class01894x = class01894x;
         RenderPipeline renderpipeline = renderpipeline1;
         if (this.N(var1, renderpipeline, class01894x, j2, l1, b0, b1)) {
            var1.N(renderpipeline, class01894x, j2, l1, b0, b1);
         }
      }

      byte[] abyte = this.B.L();
      if (!Arrays.equals(abyte, this.z)) {
         if (this.N(abyte)) {
            this.z = abyte;
         } else {
            this.B.N(null);
            this.y();
         }
      }

      Object object = this.B.B() == this.z() ? this.B.B.L().N(class06541.field_1061) : this.B.L;
      int k = ((class01590)this.M.i_3).N((class05936)object);
      int l = j2 - k - 5;
      class01590 class01590xx = (class01590)this.M.i_3;
      int l2 = this.method_73382() + 1;
      k1 = -8355712;
      int k2 = l2;
      var1.y(class01590xx, (class00392)object, this.N(l), k2, k1);
      if (this.W != null && var2 >= j2 && var2 <= j2 + 10 && var3 >= this.method_73382() && var3 <= this.method_73382() + 8) {
         class00392x = this.W;
         if (this.N(var1, class00392x, var2, var3)) {
            this.N(var1, class00392x, var2, var3, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 4, "[net.minecraft.class_332, net.minecraft.class_2561, int, int]");
               ((class01054)var0[0]).N((class00392)var0[1], (Integer)var0[2], (Integer)var0[3]);
               return (Void)null;
            });
         }
      } else if (this.U != null && var2 >= l && var2 <= l + k && var3 >= this.method_73382() && var3 <= this.method_73382() - 1 + 9) {
         List list1 = Lists.transform(this.U, class00392::method_30937);
         if (this.N(var1, list1, var2, var3)) {
            var1.N(list1, var2, var3);
         }
      }

      if (((class05630)this.M.i_7).Nm().method_41753() || var4) {
         var1.N(this.method_73380(), this.method_73382(), this.method_73380() + 32, this.method_73382() + 32, -1601138544);
         int i1 = var2 - this.method_73380();
         int j1 = var3 - this.method_73382();
         if (this.L(i1, j1, 32)) {
            var1.N(class08394.Na, class05691.W, this.method_73380(), this.method_73382(), 32, 32);
            class05691.N(this.N, var1);
         } else {
            var1.N(class08394.Na, class05691.m, this.method_73380(), this.method_73382(), 32, 32);
         }

         if (i2 > 0) {
            if (this.R(i1, j1, 32)) {
               var1.N(class08394.Na, class05691.P, this.method_73380(), this.method_73382(), 32, 32);
               class05691.y(this.N, var1);
            } else {
               var1.N(class08394.Na, class05691.s, this.method_73380(), this.method_73382(), 32, 32);
            }
         }

         if (i2 < this.R.L().L() - 1) {
            if (this.M(i1, j1, 32)) {
               var1.N(class08394.Na, class05691.T, this.method_73380(), this.method_73382(), 32, 32);
               class05691.L(this.N, var1);
            } else {
               var1.N(class08394.Na, class05691.b, this.method_73380(), this.method_73382(), 32, 32);
            }
         }
      }
   }

   @Override
   public class00392 method_37006() {
      class05216 class05216 = class00392.i();
      class05216.y(class00392.N("narrator.select", this.B.N));
      class05216.y(class05220.t);
      switch (this.B.B()) {
         case field_47881:
            class05216.y(class05691.w);
            break;
         case field_47883:
            class05216.y(class05691.l);
            class05216.y(class05220.t);
            class05216.y(class00392.N("multiplayer.status.version.narration", this.B.B));
            class05216.y(class05220.t);
            class05216.y(class00392.N("multiplayer.status.motd.narration", this.B.u));
            break;
         case field_47882:
            class05216.y(class05691.d);
            break;
         default:
            class05216.y(class05691.k);
            class05216.y(class05220.t);
            class05216.y(class00392.N("multiplayer.status.ping.narration", this.B.R));
            class05216.y(class05220.t);
            class05216.y(class00392.N("multiplayer.status.motd.narration", this.B.u));
            if (this.B.i != null) {
               class05216.y(class05220.t);
               class05216.y(class00392.N("multiplayer.status.player_count.narration", this.B.i.y(), this.B.i.N()));
               class05216.y(class05220.t);
               class05216.y(class00390.N(this.B.Z, class00392.y(", ")));
            }
      }

      return class05216;
   }
}
