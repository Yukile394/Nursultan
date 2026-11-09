package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import de.maxhenkel.voicechat.events.PublishServerEvents;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public class class08337 extends class02796 {
   private static final Logger W = LogUtils.getLogger();
   private static final int m = 2;
   public static final int N = 8;
   private final class06202 P;
   private boolean s = true;
   private int T = -1;
   @Nullable
   private class07282 b;
   @Nullable
   private class08338 j;
   @Nullable
   private UUID v;
   private int n = 0;
   private volatile List<class06748> t = new ArrayList<>();
   private final class06739 G = new class06739();

   protected class02270 l() {
      return this.P.ND().Z();
   }

   @Override
   public boolean M() {
      return true;
   }

   @Override
   public boolean P() {
      return this.T > -1;
   }

   private void X() {
      if (this.B.y()) {
         this.P.execute(() -> class06132.N(this.P));
      }
   }

   @Override
   public class06984 T() {
      return class06984.L;
   }

   public class08337(Thread var1, class06202 var2, class04785 var3, class01623 var4, class03531 var5, class03930 var6, class08773 var7) {
      super(var1, var3, var4, var5, var2.NJ(), var2.Nh(), var6, var7);
      this.N(var2.NH());
      this.U(var2.E());
      this.N(new class00074(this, this.yG(), this.Z));
      this.P = var2;
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public Path Z() {
      return ((File)this.P.l_1).toPath();
   }

   private void e() {
      this.c();
      Iterator<class04770> iterator = this.Nm().v().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_7281(class01235.E);
      }
   }

   public class06984 d() {
      return class06984.L;
   }

   @Override
   public class06289 n() {
      class07001 class07001 = this.E.t();
      if (class07001 == null) {
         return super.n();
      } else {
         try (class04495 class04495 = new class04495(W)) {
            class08299 class08299 = class08308.N(class04495, this.yt(), class07001);
            class04773 class04773 = class08299.<class04773>N(class04773.N).orElse(class04773.y);
            if (class04773.N().isPresent() && class04773.y().isPresent()) {
               return new class06289(class04773.N().get(), class07209.method_49638(class04773.y().get()));
            }
         }

         return super.n();
      }
   }

   @Override
   public void m() {
      super.m();
      if (this.j != null) {
         this.j.interrupt();
         this.j = null;
      }
   }

   @Override
   public int t() {
      return 8;
   }

   @Nullable
   @Override
   public class07282 v() {
      return this.P() && !this.ao_() ? (class07282)MoreObjects.firstNonNull(this.b, this.E.z()) : null;
   }

   @Override
   public boolean j() {
      return ((class05630)this.P.i_7).NQ;
   }

   @Override
   public int U() {
      return 0;
   }

   @Override
   public boolean z() {
      return false;
   }

   @Override
   public void y(Throwable var1, class02277 var2, class07321 var3) {
      super.y(var1, var2, var3);
      this.X();
      this.P.execute(() -> class06132.y(this.P, var3));
   }

   @Override
   public void y(boolean var1) {
      this.i(() -> {
         for (class04770 class04770 : Lists.newArrayList(this.Nm().v())) {
            if (!class04770.method_5667().equals(this.v)) {
               this.Nm().y(class04770);
            }
         }
      });
      super.y(var1);
      if (this.j != null) {
         this.j.interrupt();
         this.j = null;
      }
   }

   private int y(int var1) {
      return (int)(((class05630)this.P.i_7).M().method_41753() * var1);
   }

   @Override
   public boolean E() {
      return ((class05630)this.P.i_7).NC();
   }

   @Override
   public class03463 N(class03463 var1) {
      var1.N("Type", "Integrated Server (map_client.txt)");
      var1.N("Is Modded", () -> this.aq_().y());
      var1.N("Launched Version", this.P::f);
      return var1;
   }

   @Override
   public boolean N(@Nullable class07282 var1, boolean var2, int var3) {
      boolean flag2;
      try {
         this.P.No();
         this.P.NE().v();
         this.Na().N(null, var3);
         W.info("Started serving on {}", var3);
         this.T = var3;
         this.j = new class08338(this.x(), var3 + "");
         this.j.start();
         this.b = var1;
         this.Nm().N(var2);
         class06984 class06984 = this.y(((class04453)this.P.T_4).method_72498());
         ((class04453)this.P.T_4).N(class06984);

         for (class04770 class04770 : this.Nm().v()) {
            this.yL().N(class04770);
         }

         flag2 = true;
      } catch (IOException ioexception) {
         boolean flag1 = false;
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", false, flag1);
         this.N(var1, var2, var3, callbackinforeturnable1);
         return false;
      }

      boolean flag = flag2;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, flag);
      this.N(var1, var2, var3, callbackinforeturnable);
      return flag2;
   }

   public void N(@javax.annotation.Nullable class07282 var1, boolean var2, int var3, CallbackInfoReturnable var4) {
      if ((Boolean)var4.getReturnValue()) {
         ((Consumer)PublishServerEvents.SERVER_PUBLISHED.invoker()).accept(var3);
      }
   }

   private int N(int var1, Operation var2) {
      return !ZoomUtils.canSeeDistantEntities()
         ? (Integer)var2.call(new Object[]{var1})
         : (Integer)var2.call(new Object[]{var1 * (Zoom.isZooming() ? Math.max(1, class04995.L(Zoom.getZoomDivisor())) : 1)});
   }

   @Override
   public boolean N() {
      W.info("Starting integrated minecraft server version {}", class07529.y().comp_4025());
      this.E(true);
      this.Nq();
      this.NP();
      GameProfile gameprofile = this.NJ();
      String sx = this.yn().u();
      this.y(gameprofile != null ? gameprofile.name() + " - " + sx : sx);
      return true;
   }

   @Override
   public void N(class07080 var1) {
      this.P.L(var1);
   }

   @Override
   public boolean N(boolean var1, boolean var2, boolean var3) {
      boolean flag = super.N(var1, var2, var3);
      this.X();
      return flag;
   }

   @Override
   public void N(class07282 var1) {
      super.N(var1);
      this.b = null;
   }

   @Override
   public boolean N(class08774 var1) {
      return this.NJ() != null && var1.y().equalsIgnoreCase(this.NJ().name());
   }

   public void N(UUID var1) {
      this.v = var1;
   }

   @Override
   public void N(BooleanSupplier var1) {
      boolean flag = this.s;
      this.s = class06202.Nq().P() || this.Nm().v().isEmpty();
      class04643 class04643 = class08700.N();
      if (!flag && this.s) {
         class04643.N("autoSave");
         W.info("Saving and pausing game...");
         this.N(false, false, false);
         class04643.L();
      }

      if (this.s) {
         this.e();
      } else {
         if (flag) {
            this.Nw();
         }

         super.N(var1);
         int i = Math.max(2, ((class05630)this.P.i_7).i().method_41753());
         if (i != this.Nm().T()) {
            W.info("Changing view distance to {}, from {}", i, this.Nm().T());
            this.Nm().N(i);
         }

         int jx = Math.max(2, ((class05630)this.P.i_7).R().method_41753());
         if (jx != this.n) {
            W.info("Changing simulation distance to {}, from {}", jx, this.n);
            this.Nm().y(jx);
            this.n = jx;
         }
      }
   }

   @Override
   public int N(int var1) {
      return this.N(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[int]");
         return this.y((Integer)var1x[0]);
      });
   }

   @Override
   public void N(boolean var1) {
      try (class06734 class06734 = class06724.N(this.G)) {
         super.N(var1);
      }

      if (this.yW().Z()) {
         this.t = this.G.N();
      }
   }

   @Override
   public void N(Throwable var1, class02277 var2, class07321 var3) {
      super.N(var1, var2, var3);
      this.X();
      this.P.execute(() -> class06132.N(this.P, var3));
   }

   @Override
   public boolean ap_() {
      return this.s;
   }

   @Override
   public class04032 aq_() {
      return class06202.Z().N(super.aq_());
   }

   @Override
   public int ar_() {
      return this.T;
   }

   @Override
   public boolean R() {
      return true;
   }

   public Collection<class06748> G() {
      return this.t;
   }
}
