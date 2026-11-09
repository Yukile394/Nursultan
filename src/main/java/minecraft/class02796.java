package minecraft;

import Nursultan.class09955;
import Nursultan.class09959;
import Nursultan.class11345;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.net.Proxy;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.AfterSave;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.BeforeSave;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.EndDataPackReload;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarted;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarting;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopped;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopping;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.StartDataPackReload;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndTick;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartTick;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents.Unload;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleEvents.ValueUpdate;
import net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore.Key;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationImpl;
import net.fabricmc.fabric.impl.gamerule.GameRuleEventsImpl;
import net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource;
import net.fabricmc.fabric.impl.resource.pack.FabricOriginalKnownPacksGetter;
import net.fabricmc.fabric.impl.resource.pack.ModNioPackResources;
import net.fabricmc.loader.impl.game.minecraft.Hooks;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class02796 extends class01303<class06114> implements class02599, class04184, class07703, DataResourceStore, FabricOriginalKnownPacksGetter {
   private static final Logger N = LogUtils.getLogger();
   public static final String L = "vanilla";
   private static final float W = 0.8F;
   private static final int m = 100;
   private static final long P = 20L * class01517.N / 20L;
   private static final int s = 20;
   private static final long T = 10L * class01517.N;
   private static final int b = 100;
   private static final long j = 5L * class01517.N;
   private static final long v = 10L * class01517.y;
   private static final int n = 12;
   public static final int u = 5;
   private static final int t = 30;
   private static final int G = 6000;
   private static final int l = 100;
   private static final int d = 3;
   public static final int i = 29999984;
   public static final class07312 R = new class07312(
      "Demo World", class07282.field_9215, false, class07086.field_5802, false, new class07305(class03794.B), class03776.u
   );
   public static final class08774 M = new class08774(class07536.R, "Anonymous Player");
   protected final class04785 B;
   protected final class07842 Z;
   private final List<Runnable> w = Lists.newArrayList();
   private class04526 k = class04538.N;
   private Consumer<class04681> Y = var1x -> this.yT();
   private Consumer<Path> Q = var0 -> {};
   private boolean O;
   @Nullable
   private class02801 g;
   private boolean I;
   private final class01618 J;
   private final class08773 o;
   @Nullable
   private class07806 q;
   @Nullable
   private class07824 K;
   private final class06069 V = class06069.u();
   private final DataFixer e;
   private String H;
   private int c = -1;
   private final class02003<class02969> X;
   private final Map<class05946<class07299>, class04782> a = Maps.newLinkedHashMap();
   private class01062 p;
   private volatile boolean F = true;
   private boolean A;
   private int f;
   private int C = 6000;
   protected final Proxy z;
   private boolean S;
   private boolean x;
   @Nullable
   private String D;
   private int h;
   private final long[] r = new long[100];
   private long NN = 0L;
   @Nullable
   private KeyPair Ny;
   @Nullable
   private GameProfile NL;
   private boolean Nu;
   private volatile boolean Ni;
   private long NR;
   protected final class03930 U;
   private final class06605 NM;
   private final class06975 NB;
   private long NZ;
   private final Thread Nz;
   private long NU = class07536.u();
   private long NE = class07536.u();
   private long NW;
   private long Nm = class07536.u();
   private boolean NP = false;
   private long Ns;
   private boolean NT;
   private final class01623 Nb;
   private final class06394 Nj = new class06394(this);
   @Nullable
   private class08170 Nv;
   @Nullable
   private class01418 Nn;
   private final class06398 Nt = new class06398();
   private final class03800 NG;
   private boolean Nl;
   private boolean Nd;
   private float Nw;
   private final Executor Nk;
   @Nullable
   private String NY;
   private class02797 NQ;
   private final class01224 NO;
   private final class03143 Ng;
   private final class06954 NI = new class06954(this);
   protected final class05081 E;
   private class05042 NJ = class05042.N;
   private final class06511 No;
   private class02755 Nq;
   private int NK;
   private volatile boolean NV;
   private static final AtomicReference<RuntimeException> Ne = new AtomicReference<>();
   private final class02576 NH = new class02576();
   private final DiscontinuousFrame Nc;
   private final class00458 NX;
   private List Na;

   @Override
   public String w() {
      return class07529.y().comp_4025();
   }

   public final class04782 NY() {
      return this.a.get(class07299.field_25179);
   }

   protected void L(BooleanSupplier var1) {
      class04643 class04643 = class08700.N();
      this.Nm().v().forEach(var0 -> var0.field_13987.method_53046());
      class04643.N("commandFunctions");
      this.Nr().y();
      class04643.y("levels");
      this.ye();

      for (class04782 class04782 : this.NO()) {
         class04643.N(() -> class04782 + " " + class04782.method_27983().N());
         if (this.f % 20 == 0) {
            class04643.N("timeSync");
            this.N(class04782);
            class04643.L();
         }

         class04643.N("tick");

         try {
            class04782.method_18765(var1);
         } catch (Throwable throwable) {
            class07080 class07080 = class07080.N(throwable, "Exception ticking world");
            class04782.method_8538(class07080);
            throw new class07878(class07080);
         }

         class04643.L();
         class04643.L();
      }

      class04643.y("connection");
      this.c();
      class04643.y("players");
      this.p.i();
      class04643.y("debugSubscribers");
      this.NI.N();
      if (this.Ng.Z()) {
         class04643.y("gameTests");
         class05492.N.y();
      }

      class04643.y("server gui refresh");

      for (Runnable runnable : this.w) {
         runnable.run();
      }

      class04643.y("send chunks");

      for (class04770 class04770 : this.p.v()) {
         class04770.field_13987.field_45026.N(class04770);
         class04770.field_13987.method_53047();
      }

      class04643.L();
      this.NB.N();
   }

   private void L(class04770 var1) {
      class05087 class05087 = var1.method_51469().method_8401();
      var1.field_13987.method_14364(new class07258(class05087.s(), class05087.T()));
   }

   public int L(@Nullable class07282 var1) {
      if (var1 == null) {
         return 0;
      } else {
         int ix = 0;
         Iterator<class04770> iterator = this.Nm().v().iterator();

         while (iterator.hasNext()) {
            if (iterator.next().method_7336(var1)) {
               ix++;
            }
         }

         return ix;
      }
   }

   public void L(boolean var1) {
      this.Nl = var1;
   }

   private void L(Path var1) throws IOException {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1)) {
         bufferedwriter.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.F_()));
         bufferedwriter.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.yE()));
         bufferedwriter.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.r)));
         bufferedwriter.write(String.format(Locale.ROOT, "queue: %s\n", class07536.B()));
      }
   }

   private void L(CallbackInfo var1) {
      ((ServerStarted)ServerLifecycleEvents.SERVER_STARTED.invoker()).onServerStarted(this);
   }

   public void L(String var1) {
      this.H = var1;
   }

   public void Nd() {
      int ix = this.Ni();
      if (ix < this.C) {
         this.C = ix;
      }
   }

   public class06975 Nl() {
      return this.NB;
   }

   public boolean No() {
      return this.NL != null;
   }

   private void M(Path var1) throws IOException {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1)) {
         ArrayList arraylist;
         try {
            arraylist = Lists.newArrayList(class04544.N());
         } catch (Throwable throwable) {
            N.warn("Failed to list native modules", throwable);
            return;
         }

         arraylist.sort(Comparator.comparing(var0 -> var0.N));

         for (class04572 class04572 : arraylist) {
            bufferedwriter.write(class04572.toString());
            bufferedwriter.write(10);
         }
      }
   }

   public abstract boolean M();

   public abstract boolean P();

   protected void NP() {
      boolean flag = !class01834.M.u() && class07529.Nn && class01834.M.N(class03215.N(this));
      class03299 class03299 = class01834.M.R();
      this.E.N(this.Ng(), this.aq_().N());
      this.Ns();
      this.K();
      this.e();
      if (class03299 != null) {
         class03299.finish(true);
      }

      if (flag) {
         try {
            class01834.M.L();
         } catch (Throwable throwable) {
            N.warn("Failed to stop JFR profiling", throwable);
         }
      }
   }

   private void X() {
      long ix = class07536.u();
      if (this.R()) {
         this.l().N(ix - this.NU);
      }

      this.NU = ix;
   }

   protected void K() {
   }

   public abstract class06984 T();

   @Override
   public int Q() {
      return this.p.m();
   }

   public class02796(Thread var1, class04785 var2, class01623 var3, class03531 var4, Proxy var5, DataFixer var6, class03930 var7, class08773 var8) {
      super("Server");
      this.X = var4.L();
      this.E = var4.u();
      if (!this.X.N().L(class04227.yI).R(class01255.y)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.z = var5;
         this.Nb = var3;
         this.NQ = new class02797(var4.N(), var4.y());
         this.U = var7;
         this.J = new class01618(this);
         this.Ng = new class03143(this);
         this.o = var8;
         this.B = var2;
         this.Z = var2.M();
         this.e = var6;
         this.NG = new class03800(this, this.NQ.y().N());
         class01921 class01921 = this.X.N().L(class04227.Z).N(this.E.K());
         this.NO = new class01224(var4.N(), var2, var6, class01921);
         this.Nz = var1;
         this.Nk = class07536.B();
         this.No = class06511.N(this.E.K());
         this.NQ.y().L().N(this.E.K());
         this.Nq = class02755.N(this.X.N(), this.E.K());
         this.Nc = TracyClient.createDiscontinuousFrame("Server Tick");
         this.NM = new class06605();
         this.NB = new class06975(this.NM, 30);
         this.NX = new class00458(var1);
         this.N(null);
         this.N(var1, var2, var3, var4, var5, var6, var7, var8, null);
      }
   }

   public class06114 y(Runnable var1) {
      return new class06114(this.f, var1);
   }

   @Override
   public abstract boolean B();

   public int C() {
      return this.h;
   }

   public int D() {
      return 29999984;
   }

   private boolean F() {
      return this.yl() || class07536.u() < (this.NT ? this.Ns : this.Nm);
   }

   @Override
   public boolean J() {
      boolean flag = this.S();
      this.NT = flag;
      return flag;
   }

   private boolean S() {
      if (super.J()) {
         return true;
      } else {
         if (this.Ng.N() || this.I() || this.F()) {
            Iterator<class04782> iterator = this.NO().iterator();

            while (iterator.hasNext()) {
               if (iterator.next().method_14178().B()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void Z(Runnable var1) {
      this.w.add(var1);
   }

   public Path Z() {
      return Path.of("");
   }

   private void e() {
      class08742 class08742 = new class08742();

      for (class04782 class04782 : this.a.values()) {
         class08742.N(class04782, () -> {
            class08593 class08593 = class04782.method_17983().y(class08593.y);
            if (class08593 != null) {
               class08593.N();
            }
         });
      }

      this.o.N(class08753.field_61107, class08742.L());

      do {
         this.o.N(class08753.field_61107, class08742.N(), class08742.L());
         this.Nm = class07536.u() + v;
         this.y_();
      } while (class08742.y() > 0);

      this.o.N(class08753.field_61107);
      this.NK();
      this.ye();
   }

   private void i(CallbackInfo var1) {
      ((ServerStopped)ServerLifecycleEvents.SERVER_STOPPED.invoker()).onServerStopped(this);
   }

   public Path i(String var1) {
      return this.Z().resolve(var1);
   }

   private void i(Path var1) throws IOException {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1)) {
         String sx = System.getProperty("java.class.path");
         String s1 = File.pathSeparator;

         for (String s2 : Splitter.on(s1).split(sx)) {
            bufferedwriter.write(s2);
            bufferedwriter.write("\n");
         }
      }
   }

   @Override
   public String x() {
      return this.D;
   }

   public void c() {
      this.Na().L();
   }

   public class06289 n() {
      return this.E.o().N().L();
   }

   public int h() {
      return 256;
   }

   public boolean f() {
      return false;
   }

   protected abstract class01675 l();

   public abstract class08152 d();

   private void a() {
      if (this.R()) {
         this.NE = class07536.u();
         this.NW = 0L;
      }
   }

   public void m() {
      this.u(null);
      this.NX.close();
      if (this.k.i()) {
         this.yj();
      }

      N.info("Stopping server");
      this.Na().y();
      this.NV = true;
      if (this.p != null) {
         N.info("Saving players");
         this.p.Z();
         this.p.j();
      }

      N.info("Saving worlds");

      for (class04782 class04782x : this.NO()) {
         if (class04782x != null) {
            class04782x.field_13957 = false;
         }
      }

      while (this.a.values().stream().anyMatch(var0 -> var0.method_14178().L.i())) {
         this.Nm = class07536.u() + class01517.y;

         for (class04782 class04782x : this.NO()) {
            class04782x.method_14178().j();
            class04782x.method_14178().N(() -> true, false);
         }

         this.y_();
      }

      this.y(false, true, false);

      for (class04782 class04782x : this.NO()) {
         if (class04782x != null) {
            try {
               this.N(null, class04782x);
               class04782x.close();
            } catch (IOException ioexception1) {
               N.error("Exception closing the level", ioexception1);
            }
         }
      }

      this.NV = false;
      this.NQ.close();

      try {
         this.B.close();
      } catch (IOException ioexception) {
         N.error("Failed to unlock level {}", this.B.R(), ioexception);
      }

      this.i(null);
   }

   public boolean m(boolean var1) {
      boolean flag = false;

      for (class04782 class04782 : this.NO()) {
         if (class04782 != null && class04782.field_13957 == var1) {
            class04782.field_13957 = !var1;
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public void o() {
      boolean flag = this.R();
      long ix = flag ? class07536.u() : 0L;
      long jx = this.NP ? this.Nm - class07536.u() : 100000L;
      LockSupport.parkNanos("waiting for tasks", jx);
      if (flag) {
         this.NW = this.NW + (class07536.u() - ix);
      }
   }

   private void p() {
      if (this.R()) {
         class01675 class01675 = this.l();
         class01675.N(class07536.u() - this.NE - this.NW, class02869.field_48720.ordinal());
         class01675.N(this.NW, class02869.field_48721.ordinal());
      }
   }

   @Override
   public Thread k() {
      return this.Nz;
   }

   @Nullable
   public class07282 v() {
      return null;
   }

   public boolean j() {
      return true;
   }

   public boolean q() {
      return true;
   }

   public abstract int U();

   public void U(int var1) {
      this.c = var1;
   }

   public void U(boolean var1) {
      this.Nu = var1;
   }

   @Override
   public void close() {
      this.m();
   }

   public void z(boolean var1) {
      this.E.u(var1);
      this.Nm().v().forEach(this::L);
   }

   public class08771 z(int var1) {
      return new class09959(this, var1);
   }

   public abstract boolean z();

   public void u(boolean var1) {
      this.Nd = var1;
   }

   private void u(Path var1) throws IOException {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1)) {
         ArrayList arraylist = Lists.newArrayList();
         class07305 class07305 = this.E.m();
         class07305.N(new class09955(this, arraylist, class07305));

         for (String sx : arraylist) {
            bufferedwriter.write(sx);
         }
      }
   }

   public void u(String var1) {
      this.NY = var1;
   }

   private void u(CallbackInfo var1) {
      ((ServerStopping)ServerLifecycleEvents.SERVER_STOPPING.invoker()).onServerStopping(this);
   }

   public boolean r() {
      return false;
   }

   public void y(String var1) {
      this.D = var1;
   }

   public class04787 y(class04770 var1) {
      return (class04787)(this.NV() ? new class04786(var1) : new class04787(var1));
   }

   @Override
   public void y(Throwable var1, class02277 var2, class07321 var3) {
      N.error("Failed to save chunk {},{}", new Object[]{var3.B, var3.Z, var1});
      this.NH.N("chunk/save", var1);
      this.N(class07080.N(var1, "Chunk save failure"), var3, var2);
   }

   public class06984 y(class08774 var1) {
      if (this.Nm().R(var1)) {
         class01087 class01087 = this.Nm().E().L(var1);
         if (class01087 != null) {
            return class01087.N();
         } else if (this.N(var1)) {
            return class06984.i;
         } else if (this.No()) {
            return this.Nm().t() ? class06984.i : class06984.N;
         } else {
            return this.T();
         }
      } else {
         return class06984.N;
      }
   }

   private void y(Path var1) {
      Path path = var1.resolve("levels");

      try {
         for (Entry entry : this.a.entrySet()) {
            class01894 class01894 = ((class05946)entry.getKey()).N();
            Path path1 = path.resolve(class01894.y()).resolve(class01894.N());
            Files.createDirectories(path1);
            ((class04782)entry.getValue()).method_21625(path1);
         }

         this.u(var1.resolve("gamerules.txt"));
         this.i(var1.resolve("classpath.txt"));
         this.L(var1.resolve("stats.txt"));
         this.R(var1.resolve("threads.txt"));
         this.N(var1.resolve("server.properties.txt"));
         this.M(var1.resolve("modules.txt"));
      } catch (IOException ioexception) {
         N.warn("Failed to save debug report", ioexception);
      }
   }

   private static class07080 y(Throwable var0) {
      class07878 class07878x = null;

      for (Throwable throwable = var0; throwable != null; throwable = throwable.getCause()) {
         if (throwable instanceof class07878 class07878x) {
            class07878x = class07878x;
         }
      }

      class07080 class07080;
      if (class07878x != null) {
         class07080 = class07878x.N();
         if (class07878x != var0) {
            class07080.N("Wrapped in").N("Wrapping exception", var0);
         }
      } else {
         class07080 = new class07080("Exception in server tick loop", var0);
      }

      return class07080;
   }

   private void y(CallbackInfo var1) {
      ((ServerStarting)ServerLifecycleEvents.SERVER_STARTING.invoker()).onServerStarting(this);
   }

   protected void M(class06114 var1) {
      class08700.N().R("runTask");
      super.M_1(var1);
   }

   private void y(Collection var1, CallbackInfoReturnable var2) {
      ((CompletableFuture)var2.getReturnValue()).handleAsync((var1x, var2x) -> {
         ((EndDataPackReload)ServerLifecycleEvents.END_DATA_PACK_RELOAD.invoker()).endDataPackReload(this, this.NQ.N(), var2x == null);
         return (Void)var1x;
      }, this);
   }

   public void y(boolean var1) {
      this.F = false;
      if (var1) {
         try {
            this.Nz.join();
         } catch (InterruptedException interruptedexception) {
            N.error("Error while shutting down", interruptedexception);
         }
      }
   }

   private void y(boolean var1, boolean var2, boolean var3, CallbackInfoReturnable var4) {
      ((AfterSave)ServerLifecycleEvents.AFTER_SAVE.invoker()).onAfterSave(this, var2, var3);
   }

   public boolean y(boolean var1, boolean var2, boolean var3) {
      this.N(var1, var2, var3, null);
      this.Nj.N(this.NY().method_17983().N(class06676.N));
      boolean flag = false;

      for (class04782 class04782x : this.NO()) {
         if (!var1) {
            N.info("Saving chunks for level '{}'/{}", class04782x, class04782x.method_27983().N());
         }

         class04782x.method_14176(null, var2, class07529.D || class04782x.field_13957 && !var3);
         flag = true;
      }

      this.E.N(this.yU().N(this.yt()));
      this.B.N(this.yt(), this.E, this.Nm().y());
      if (var2) {
         for (class04782 class04782 : this.NO()) {
            N.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", class04782.method_14178().L.E());
         }

         N.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      this.y(var1, var2, var3, null);
      return flag;
   }

   @Override
   public void y(BooleanSupplier var1) {
      super.y(() -> Nn() && var1.getAsBoolean());
   }

   private void y(BooleanSupplier var1, CallbackInfo var2) {
      ((EndTick)ServerTickEvents.END_SERVER_TICK.invoker()).onEndTick(this);
   }

   public class03463 y(class03463 var1) {
      var1.N("Server Running", () -> Boolean.toString(this.F));
      if (this.p != null) {
         var1.N("Player Count", () -> this.p.m() + " / " + this.p.P() + "; " + this.p.v());
      }

      var1.N("Active Data Packs", () -> class01623.N(this.Nb.M()));
      var1.N("Available Data Packs", () -> class01623.N(this.Nb.u()));
      var1.N("Enabled Feature Flags", () -> class03794.i.y(this.E.K()).stream().map(class01894::toString).collect(Collectors.joining(", ")));
      var1.N("World Generation", () -> this.E.k().toString());
      var1.N("World Seed", () -> String.valueOf(this.E.l().L()));
      var1.N("Suppressed Exceptions", this.NH::N);
      if (this.NY != null) {
         var1.N("Server Id", () -> this.NY);
      }

      return this.N(var1);
   }

   public void E(boolean var1) {
      this.S = var1;
   }

   public abstract boolean E();

   public boolean A() {
      return true;
   }

   private void N(Collection var1, CallbackInfoReturnable var2) {
      ((StartDataPackReload)ServerLifecycleEvents.START_DATA_PACK_RELOAD.invoker()).startDataPackReload(this, this.NQ.N());
   }

   private static class01247 N(class01623 var0, boolean var1) {
      Collection<String> collection = var0.i();
      ImmutableList immutablelist = ImmutableList.copyOf(collection);
      List list = var1 ? var0.L().stream().filter(var1x -> !collection.contains(var1x)).toList() : List.of();
      return new class01247(immutablelist, list);
   }

   private void N(CallbackInfo var1, class04782 var2) {
      ((Unload)ServerWorldEvents.UNLOAD.invoker()).onWorldUnload(this, var2);
   }

   public Path N(class05071 var1) {
      return this.B.N(var1);
   }

   public void N(Consumer<class04681> var1, Consumer<Path> var2) {
      this.Y = var2x -> {
         this.yT();
         var1.accept(var2x);
      };
      this.Q = var2;
      this.O = true;
   }

   public class05477 N(class04770 var1) {
      return class05477.N;
   }

   public abstract boolean N(class08774 var1);

   private static boolean N(List var0, Object var1, class01623 var2) {
      String sx = (String)var1;
      if (var0.contains(sx)) {
         return true;
      } else {
         class01055 class01055 = var2.L(sx);
         if (class01055.E() instanceof BuiltinModResourcePackSource) {
            boolean flag;
            try (class01622 class01622 = class01055.R()) {
               flag = class01622 instanceof ModNioPackResources modniopackresources && !modniopackresources.getActivationType().isEnabledByDefault();
            }

            return flag;
         } else {
            return false;
         }
      }
   }

   public void N(class05042 var1) {
      class05212 class05212 = this.E.o();
      if (!class05212.N().equals(var1)) {
         class05212.N(var1);
         this.Nm().N(new class08096(var1));
         this.ye();
      }
   }

   public static <S extends class02796> S N(Function<Thread, S> var0) {
      AtomicReference atomicreference = new AtomicReference();
      Thread thread = new Thread(() -> ((class02796)atomicreference.get()).Nv(), "Server thread");
      thread.setUncaughtExceptionHandler((var0x, var1x) -> N.error("Uncaught exception in server thread", var1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         thread.setPriority(8);
      }

      class02796 class02796 = (class02796)var0.apply(thread);
      atomicreference.set(class02796);
      thread.start();
      return (S)class02796;
   }

   private void N(boolean var1, boolean var2, boolean var3, CallbackInfoReturnable var4) {
      ((BeforeSave)ServerLifecycleEvents.BEFORE_SAVE.invoker()).onBeforeSave(this, var2, var3);
   }

   private void N(CallbackInfoReturnable var1) {
      var1.setReturnValue((class03937)(var0, var1x) -> ((class03937)ServerMessageDecoratorEvent.EVENT.invoker()).decorate(var0, var1x));
   }

   private void N(
      Thread var1, class04785 var2, class01623 var3, class03531 var4, Proxy var5, DataFixer var6, class03930 var7, class08773 var8, CallbackInfo var9
   ) {
      this.Na = var4.N().y().flatMap(var0 -> var0.method_56926().u().stream()).toList();
   }

   public void N(Path var1) throws IOException {
   }

   private void N(BooleanSupplier var1, CallbackInfo var2) {
      ((StartTick)ServerTickEvents.START_SERVER_TICK.invoker()).onStartTick(this);
   }

   public <T> void N(class06839<T> var1, T var2) {
      this.Nt().N(var1, var2);
      if (var1 == class07305.a) {
         int ix = (Boolean)var2 ? 22 : 23;

         for (class04770 class04770 : this.Nm().v()) {
            class04770.field_13987.method_14364(new class00509(class04770, (byte)ix));
         }
      } else if (var1 == class07305.n || var1 == class07305.b) {
         class00521 class00521 = var1 == class07305.n ? class00503.m : class00503.W;
         class00503 class00503 = new class00503(class00521, (Boolean)var2 ? 1.0F : 0.0F);
         this.Nm().v().forEach(var1x -> var1x.field_13987.method_14364(class00503));
      } else if (var1 == class07305.t) {
         this.NO().forEach(var1x -> {
            class00031 class00031 = var1x.method_70636();
            if ((Boolean)var2) {
               var1x.method_18456().forEach(class00031::y);
            } else {
               class00031.N();
            }
         });
      } else if (var1 == class07305.x) {
         this.NK();
      }

      this.N(var1, var2, null);
   }

   private void N(class07080 var1, class07321 var2, class02277 var3) {
      class07536.Z().execute(() -> {
         try {
            Path path = this.i("debug");
            class06290.L(path);
            String sx = class06290.N(var3.N());
            Path path1 = path.resolve("chunk-" + sx + "-" + class07536.R() + "-server.txt");
            FileStore filestore = Files.getFileStore(path);
            if (filestore.getUsableSpace() < 8192L) {
               N.warn("Not storing chunk IO report due to low space on drive {}", filestore.name());
               return;
            }

            class07074 class07074 = var1.N("Chunk Info");
            class07074.N("Level", var3::N);
            class07074.N("Dimension", () -> var3.y().N().toString());
            class07074.N("Storage", var3::L);
            class07074.N("Position", var2::toString);
            var1.N(path1, class02587.i);
            N.info("Saved details to {}", var1.i());
         } catch (Exception exception) {
            N.warn("Failed to store chunk IO exception", exception);
         }
      });
   }

   private void N(class06839 var1, Object var2, CallbackInfo var3) {
      Event event = GameRuleEventsImpl.getValueUpdate(var1);
      if (event != null) {
         ((ValueUpdate)event.invoker()).onGameRuleUpdated(var2, this);
      }
   }

   public void N(class01894 var1, Optional<class07709> var2) {
      N.debug("Received custom click action {} with payload {}", var1, var2.orElse(null));
   }

   public void N(class00392 var1, class00649 var2, @Nullable String var3) {
      String sx = var2.N(var1).getString();
      if (var3 != null) {
         N.info("[{}] {}", var3, sx);
      } else {
         N.info("{}", sx);
      }
   }

   private Object N(Map var1, Object var2, Object var3, Operation var4) {
      Object object = var4.call(new Object[]{var1, var2, var3});
      ((Load)ServerWorldEvents.LOAD.invoker()).onWorldLoad(this, (class04782)var3);
      return object;
   }

   public void N(Throwable var1, class02897<?> var2) {
      this.NH.N("packet/" + var2, var1);
   }

   @Override
   public void N(Throwable var1, class02277 var2, class07321 var3) {
      N.error("Failed to load chunk {},{}", new Object[]{var3.B, var3.Z, var1});
      this.NH.N("chunk/load", var1);
      this.N(class07080.N(var1, "Chunk load failure"), var3, var2);
   }

   private void N(CallbackInfo var1) {
      BiomeModificationImpl.INSTANCE.finalizeWorldGen(this.yt());
   }

   public abstract class03463 N(class03463 var1);

   private void N(class04782 var1) {
      this.p.N(new class08068(var1.N(), var1.method_8532(), var1.method_64395().N(class07305.N)), var1.method_27983());
   }

   private void N(class05081 var1) {
      var1.N(class07086.field_5801);
      var1.u(true);
      class05212 class05212 = var1.o();
      class05212.y(false);
      class05212.N(false);
      class05212.N(1000000000);
      class05212.y(6000L);
      class05212.N(class07282.field_9219);
   }

   public void N(class01062 var1) {
      this.p = var1;
   }

   protected abstract boolean N() throws IOException;

   public CompletableFuture<Void> N(Collection<String> var1) {
      this.N(var1, null);
      CompletableFuture<Void> completablefuture = CompletableFuture.<ImmutableList>supplyAsync(
            () -> var1.stream().map(this.Nb::L).filter(Objects::nonNull).map(class01055::R).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose(
            var1x -> {
               class03545 class03545 = new class03545(class01603.field_14190, var1x);
               List<class00720<?>> list = class01214.N(class03545, this.X.N());
               return class01248.N(class03545, this.X, list, this.E.K(), this.z() ? class07671.field_25420 : class07671.field_25421, this.d(), this.Nk, this)
                  .whenComplete((var1xx, var2x) -> {
                     if (var2x != null) {
                        class03545.close();
                     }
                  })
                  .thenApply(var1xx -> new class02797(class03545, var1xx));
            }
         )
         .thenAcceptAsync(var2x -> {
            this.NQ.close();
            this.NQ = var2x;
            this.Nb.y(var1);
            class03776 class03776 = new class03776(N(this.Nb, true), this.E.K());
            this.E.N(class03776);
            this.NQ.y().M();
            this.NQ.y().L().N(this.E.K());
            this.Nm().Z();
            this.Nm().n();
            this.NG.N(this.NQ.y().N());
            this.NO.N(this.NQ.N());
            this.Nq = class02755.N(this.X.N(), this.E.K());
         }, this);
      if (this.E_()) {
         this.y(completablefuture::isDone);
      }

      this.y(var1, new CallbackInfoReturnable("", false, completablefuture));
      return completablefuture;
   }

   private void N(long var1) {
      if (this.R()) {
         this.l().N(class07536.u() - var1, class02869.field_48719.ordinal());
      }
   }

   private static void N(class04782 var0, class05212 var1, boolean var2, boolean var3, class08773 var4) {
      if (class07529.Nl && class07529.Nc) {
         var1.N(class05042.N(var0.method_27983(), new class07209(0, 64, -100), 0.0F, 0.0F));
      } else if (var3) {
         var1.N(class05042.N(var0.method_27983(), class07209.field_10980.method_10086(80), 0.0F, 0.0F));
      } else {
         class04751 class04751 = var0.method_14178();
         class07321 class07321 = new class07321(class04751.W().y().N());
         var4.N(class08753.field_61106, 0);
         var4.N(var0.method_27983(), class07321);
         int ix = class04751.U().N(var0);
         if (ix < var0.method_31607()) {
            class07209 class07209x = class07321.W();
            ix = var0.method_8624(class07830.field_13202, class07209x.method_10263() + 8, class07209x.method_10260() + 8);
         }

         var1.N(class05042.N(var0.method_27983(), class07321.W().method_10069(8, ix, 8), 0.0F, 0.0F));
         int j1 = 0;
         int jx = 0;
         int kx = 0;
         int lx = -1;

         for (int i1 = 0; i1 < class04995.Z(11); i1++) {
            if (j1 >= -5 && j1 <= 5 && jx >= -5 && jx <= 5) {
               class07209 class07209 = class05960.N(var0, new class07321(class07321.B + j1, class07321.Z + jx));
               if (class07209 != null) {
                  var1.N(class05042.N(var0.method_27983(), class07209, 0.0F, 0.0F));
                  break;
               }
            }

            if (j1 == jx || j1 < 0 && j1 == -jx || j1 > 0 && j1 == 1 - jx) {
               int k1 = kx;
               kx = -lx;
               lx = k1;
            }

            j1 += kx;
            jx += lx;
         }

         if (var2) {
            var0.method_30349()
               .method_46759(class04227.Nh)
               .flatMap(var0x -> var0x.N(class03177.W))
               .ifPresent(var3x -> var3x.N().N(var0, class04751.U(), var0.field_9229, var1.N().y()));
         }

         var4.N(class08753.field_61106);
      }
   }

   @Override
   public void N(class00392 var1) {
      N.info(var1.getString());
   }

   public static void N(RuntimeException var0) {
      Ne.compareAndSet(null, var0);
   }

   protected boolean L(class06114 var1) {
      return var1.N() + 3 < this.f || this.F();
   }

   public void N(class07282 var1) {
      this.E.N(var1);
   }

   public boolean N(boolean var1, boolean var2, boolean var3) {
      boolean flag;
      try {
         this.NV = true;
         this.Nm().Z();
         flag = this.y(var1, var2, var3);
      } finally {
         this.NV = false;
      }

      return flag;
   }

   public boolean N(class04782 var1, class07209 var2, class08036 var3) {
      return false;
   }

   public void N(class07080 var1) {
   }

   public boolean N(@Nullable class07282 var1, boolean var2, int var3) {
      return false;
   }

   private static class03776 N(class01623 var0, Collection<String> var1, class03767 var2, boolean var3) {
      var0.y(var1);
      N(var0, var2);
      class01247 class01247 = N(var0, var3);
      class03767 class03767 = var0.R().L(var2);
      return new class03776(class01247, class03767);
   }

   public void N(class07086 var1, boolean var2) {
      if (var2 || !this.E.T()) {
         this.E.N(this.E.U() ? class07086.field_5807 : var1);
         this.NK();
         this.Nm().v().forEach(this::L);
      }
   }

   public void N(@Nullable GameProfile var1) {
      this.NL = var1;
   }

   private static void N(class01623 var0, class03767 var1) {
      class03767 class03767xx = var0.R();
      class03767 class03767x = var1.u(class03767xx);
      if (!class03767x.y()) {
         ObjectArraySet objectarrayset = new ObjectArraySet(var0.i());

         for (class01055 class01055 : var0.u()) {
            if (class03767x.y()) {
               break;
            }

            if (class01055.E() == class01283.u) {
               String sx = class01055.M();
               class03767 class03767xx = class01055.i();
               if (!class03767xx.y() && class03767xx.y(class03767x) && class03767xx.N(var1)) {
                  if (!objectarrayset.add(sx)) {
                     throw new IllegalStateException("Tried to force '" + sx + "', but it was already enabled");
                  }

                  N.info("Found feature pack ('{}') for requested feature, forcing to enabled", sx);
                  class03767x = class03767x.u(class03767xx);
               }
            }
         }

         var0.y(objectarrayset);
      }
   }

   public static class03776 N(class01623 var0, class03776 var1, boolean var2, boolean var3) {
      class01247 class01247 = var1.N();
      class03767 class03767xx = var2 ? class03767.N() : var1.y();
      class03767 class03767x = var2 ? class03794.i.N() : var1.y();
      var0.N();
      if (var3) {
         return N(var0, List.of("vanilla"), class03767xx, false);
      } else {
         LinkedHashSet linkedhashset = Sets.newLinkedHashSet();

         for (String sx : class01247.N()) {
            if (var0.u(sx)) {
               linkedhashset.add(sx);
            } else {
               N.warn("Missing data pack {}", sx);
            }
         }

         for (class01055 class01055 : var0.u()) {
            String s1 = class01055.M();
            if (!N(class01247.y(), s1, var0)) {
               class03767 class03767xx = class01055.i();
               boolean flag = linkedhashset.contains(s1);
               if (!flag && class01055.E().method_45279()) {
                  if (class03767xx.N(class03767x)) {
                     N.info("Found new data pack {}, loading it automatically", s1);
                     linkedhashset.add(s1);
                  } else {
                     N.info("Found new data pack {}, but can't load it due to missing features {}", s1, class03794.N(class03767x, class03767xx));
                  }
               }

               if (flag && !class03767xx.N(class03767x)) {
                  N.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", s1, class03794.N(class03767x, class03767xx));
                  linkedhashset.remove(s1);
               }
            }
         }

         if (linkedhashset.isEmpty()) {
            N.info("No datapacks selected, forcing vanilla");
            linkedhashset.add("vanilla");
         }

         return N(var0, linkedhashset, class03767xx, true);
      }
   }

   @Nullable
   public class04782 N(class05946<class07299> var1) {
      return this.a.get(var1);
   }

   public void N(BooleanSupplier var1) {
      long ix = class07536.u();
      int jx = this.NE() * 20;
      if (jx > 0) {
         if (this.p.m() == 0 && !this.Ng.N()) {
            this.NK++;
         } else {
            this.NK = 0;
         }

         if (this.NK >= jx) {
            if (this.NK == jx) {
               N.info("Server empty for {} seconds, pausing", this.NE());
               this.NL();
            }

            this.c();
            return;
         }
      }

      this.f++;
      this.Ng.W();
      this.N(var1, null);
      this.L(var1);
      if (ix - this.NZ >= j) {
         this.NZ = ix;
         this.q = this.NR();
      }

      this.C--;
      if (this.C <= 0) {
         this.NL();
      }

      class04643 class04643 = class08700.N();
      class04643.N("tallying");
      long kx = class07536.u() - ix;
      int lx = this.f % 100;
      this.NN = this.NN - this.r[lx];
      this.NN += kx;
      this.r[lx] = kx;
      this.Nw = this.Nw * 0.8F + (float)kx / (float)class01517.y * 0.19999999F;
      this.N(ix);
      class04643.L();
      this.y(var1, null);
   }

   public void N(boolean var1) {
      class04643 class04643 = class08700.N();
      class04643.N("tick");
      this.Nc.start();
      class04643.N("scheduledPacketProcessing");
      this.NX.y();
      class04643.L();
      this.N(var1 ? () -> false : this::F);
      this.Nc.end();
      class04643.L();
   }

   public int N(int var1) {
      return var1;
   }

   public class04782 yi() {
      class05946<class07299> class05946 = this.yn().o().N().N();
      class04782 class04782 = this.N(class05946);
      return class04782 != null ? class04782 : this.NY();
   }

   public Proxy NA() {
      return this.z;
   }

   public boolean ap_() {
      return false;
   }

   public class04032 aq_() {
      return class04032.N("vanilla", this::Ng, "Server", class02796.class);
   }

   public int ar_() {
      return this.c;
   }

   public boolean ao_() {
      return this.E.U();
   }

   public void W(boolean var1) {
      this.x = var1;
   }

   public class02003<class02969> yG() {
      return this.X;
   }

   @Override
   public void R(Runnable var1) {
      if (this.NX()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.R(var1);
      }
   }

   private void R(Path var1) throws IOException {
      ThreadInfo[] athreadinfo = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
      Arrays.sort(athreadinfo, Comparator.comparing(ThreadInfo::getThreadName));

      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1)) {
         for (ThreadInfo threadinfo : athreadinfo) {
            bufferedwriter.write(threadinfo.toString());
            bufferedwriter.write(10);
         }
      }
   }

   public void R(int var1) {
      this.h = var1;
   }

   public abstract boolean R();

   public class07701 yu() {
      class04782 class04782 = this.yi();
      return new class07701(this, class06889.N(this.yR().y()), class07109.N, class04782, class06984.i, "Server", class00392.y("Server"), this, null);
   }

   public boolean yY() {
      return this.I || this.g != null;
   }

   public class07282 NT() {
      return this.E.z();
   }

   private int Ni() {
      float fx;
      if (this.Ng.N()) {
         long ix = this.ym() + 1L;
         fx = (float)class01517.N / (float)ix;
      } else {
         fx = this.Ng.R();
      }

      short short1 = 300;
      return Math.max(100, (int)(fx * 300.0F));
   }

   public class06954 yV() {
      return this.NI;
   }

   public boolean yk() {
      return this.NV;
   }

   public int Nu() {
      return 1000000;
   }

   public class01418 yZ() {
      if (this.Nn == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.Nn;
      }
   }

   public float yE() {
      return this.Nw;
   }

   public class03143 yW() {
      return this.Ng;
   }

   public class01089 yw() {
      return this.NQ.N();
   }

   public class06398 yU() {
      return this.Nt;
   }

   public void H() {
   }

   public class01022 yt() {
      return this.X.N();
   }

   public DataFixer ND() {
      return this.e;
   }

   public long[] yP() {
      return this.r;
   }

   public class06482 yM() {
      return this.NQ.y().L();
   }

   public class06394 yB() {
      return this.Nj;
   }

   public void yj() {
      this.k.y();
   }

   public class02755 yq() {
      return this.Nq;
   }

   public boolean Nz() {
      return false;
   }

   public class06511 yo() {
      return this.No;
   }

   public class01224 yv() {
      return this.NO;
   }

   public class01062 Nm() {
      return this.p;
   }

   public class03937 yg() {
      class03937 class03937x;
      class03937 class03937x = class03937x = class03937.N;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class03937x);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class03937)callbackinforeturnable.getReturnValue() : class03937x;
   }

   public void NZ() {
      this.k.u();
   }

   public class05081 yn() {
      return this.E;
   }

   private class07806 NR() {
      class07837 class07837 = this.NM();
      return new class07806(class00392.N(this.x()), Optional.of(class07837), Optional.of(class07808.N()), Optional.ofNullable(this.K), this.r());
   }

   public class05042 yR() {
      return this.NJ;
   }

   public boolean ys() {
      return this.k.i();
   }

   @Override
   public boolean Y() {
      return super.Y() && !this.NX();
   }

   public Optional<class02794> NB() {
      return Optional.empty();
   }

   public Iterable<class04782> NO() {
      return this.a.values();
   }

   public class02331 yd() {
      return this.NQ.y().y();
   }

   public class00458 yK() {
      return this.NX;
   }

   private void NL() {
      this.C = this.Ni();
      N.debug("Autosave started");
      class04643 class04643 = class08700.N();
      class04643.N("save");
      this.N(true, false, false);
      class04643.L();
      N.debug("Autosave finished");
   }

   public boolean NN() {
      return true;
   }

   private class07837 NM() {
      List<class04770> list = this.p.v();
      int ix = this.t();
      if (this.f()) {
         return new class07837(ix, list.size(), List.of());
      } else {
         int jx = Math.min(list.size(), 12);
         ObjectArrayList objectarraylist = new ObjectArrayList(jx);
         int kx = class04995.N(this.V, 0, list.size() - jx);

         for (int lx = 0; lx < jx; lx++) {
            class04770 class04770 = list.get(kx + lx);
            objectarraylist.add(class04770.method_39426() ? class04770.method_72498() : M);
         }

         class07536.L(objectarraylist, this.V);
         return new class07837(ix, list.size(), objectarraylist);
      }
   }

   public long Nx() {
      return this.Nm;
   }

   public String Nb() {
      return this.H;
   }

   public Set<class05946<class07299>> NQ() {
      return this.a.keySet();
   }

   @Override
   public boolean A_() {
      return true;
   }

   @Override
   public boolean B_() {
      return true;
   }

   public String[] z_() {
      return this.p.R();
   }

   public class03800 Nr() {
      return this.NG;
   }

   public class04478 Nh() {
      return this.NQ.y().i();
   }

   public void NK() {
      for (class04782 class04782 : this.NO()) {
         class04782.method_8424(class04782.method_74962());
      }
   }

   public Optional<Path> NG() {
      return this.B.z();
   }

   public class06605 Nt() {
      return this.NM;
   }

   protected int NE() {
      return 0;
   }

   protected void Nv() {
      try {
         this.y(null);
         if (!this.N()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.Nm = class07536.u();
         this.K = this.Ny().orElse(null);
         this.L(null);
         this.q = this.NR();

         while (this.F) {
            long ix;
            if (!this.ap_() && this.Ng.N() && this.Ng.u()) {
               ix = 0L;
               this.Nm = class07536.u();
               this.NR = this.Nm;
            } else {
               ix = this.Ng.B();
               long kx = class07536.u() - this.Nm;
               if (kx > P + 20L * ix && this.Nm - this.NR >= T + 100L * ix) {
                  long jx = kx / ix;
                  N.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", kx / class01517.y, jx);
                  this.Nm += jx * ix;
                  this.NR = this.Nm;
               }
            }

            boolean flag = ix == 0L;
            if (this.I) {
               this.I = false;
               this.g = new class02801(class07536.u(), this.f);
            }

            this.Nm += ix;

            try (class11345 class11345 = class08700.N(this.yH())) {
               this.N(flag);
               class04643 class04643 = class08700.N();
               class04643.N("nextTickWait");
               this.NT = true;
               this.Ns = Math.max(class07536.u() + ix, this.Nm);
               this.a();
               this.y_();
               this.p();
               if (flag) {
                  this.Ng.i();
               }

               class04643.L();
               this.X();
            } finally {
               this.NZ();
            }

            this.Ni = true;
            class01834.M.N(this.Nw);
         }
      } catch (Throwable throwable2) {
         N.error("Encountered an unexpected exception", throwable2);
         class07080 class07080 = y(throwable2);
         this.y(class07080.R());
         Path path = this.Z().resolve("crash-reports").resolve("crash-" + class07536.R() + "-server.txt");
         if (class07080.N(path, class02587.N)) {
            N.error("This crash report has been saved to: {}", path.toAbsolutePath());
         } else {
            N.error("We were unable to save this crash report to disk.");
         }

         this.N(class07080);
      } finally {
         try {
            this.A = true;
            this.m();
         } catch (Throwable throwable) {
            N.error("Exception stopping the server", throwable);
         } finally {
            this.H();
         }
      }
   }

   public boolean Nk() {
      return !this.Nz.isAlive();
   }

   protected void Ns() {
      class05212 class05212 = this.E.o();
      boolean flag = this.E.w();
      class00751 class00751 = this.X.N().L(class04227.yI);
      class05934 class05934 = this.E.l();
      long ix = class05517.N(class05934.L());
      ImmutableList immutablelist = ImmutableList.of(new class07815(), new class04874(), new class05730(), new class07622(), new class06170(class05212));
      class01255 class01255 = class00751.L(class01255.y);
      class04782 class04782x = new class04782(this, this.Nk, this.B, class05212, class07299.field_25179, class01255, flag, ix, immutablelist, true, null);
      class05946<class07299> class05946 = class07299.field_25179;
      Map<class05946<class07299>, class04782> map = this.a;
      this.N(map, class05946, class04782x, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[java.util.Map, java.lang.Object, java.lang.Object]");
         return ((Map)var0[0]).put(var0[1], var0[2]);
      });
      class00408 class00408x = class04782x.method_17983();
      this.Nj.N(class00408x.N(class06676.N).N());
      this.Nn = new class01418(class00408x);
      this.Nv = class00408x.N(class08170.N);
      if (!class05212.W()) {
         try {
            N(class04782x, class05212, class05934.i(), flag, this.o);
            class05212.L(true);
            if (flag) {
               this.N(this.E);
            }
         } catch (Throwable throwable1) {
            class07080 class07080 = class07080.N(throwable1, "Exception initializing level");

            try {
               class04782x.method_8538(class07080);
            } catch (Throwable throwable) {
            }

            throw new class07878(class07080);
         }

         class05212.L(true);
      }

      class06289 class06289 = this.n();
      this.o.N(class06289.N(), new class07321(class06289.y()));
      if (this.E.O() != null) {
         this.yU().N(this.E.O(), this.yt());
      }

      class03470 class03470 = class04782x.method_52168();
      boolean flag1 = false;

      for (Entry entry : class00751.Z()) {
         class05946 class05946x = (class05946)entry.getKey();
         class04782 class04782x;
         if (class05946x != class01255.y) {
            class05946 class05946xx = class05946.N(class04227.yg, class05946x.N());
            class06654 class06654 = new class06654(this.E, class05212);
            class04782x = new class04782(
               this, this.Nk, this.B, class06654, class05946xx, (class01255)entry.getValue(), flag, ix, ImmutableList.of(), false, class03470
            );
            map = this.a;
            this.N(map, class05946xx, class04782x, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[java.util.Map, java.lang.Object, java.lang.Object]");
               return ((Map)var0[0]).put(var0[1], var0[2]);
            });
         } else {
            class04782x = class04782x;
         }

         Optional<class08074> optional = class05212.P();
         if (optional.isPresent()) {
            class08074 class08074x = optional.get();
            class00408 class00408x = class04782x.method_17983();
            if (class00408x.y(class08057.u) == null) {
               double d0 = class04782x.method_8597().M();
               class08074 class08074x = new class08074(
                  class08074x.N() / d0,
                  class08074x.y() / d0,
                  class08074x.L(),
                  class08074x.u(),
                  class08074x.i(),
                  class08074x.R(),
                  class08074x.M(),
                  class08074x.B(),
                  class08074x.Z()
               );
               class08057 class08057 = new class08057(class08074x);
               class08057.N(class04782x.N());
               class00408x.N(class08057.u, class08057);
            }

            flag1 = true;
         }

         class04782x.method_8621().N(this.D());
         this.Nm().N(class04782x);
      }

      if (flag1) {
         class05212.N(Optional.empty());
      }
   }

   public class02243 NU() {
      return class02243.N;
   }

   public class08170 yz() {
      if (this.Nv == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.Nv;
      }
   }

   public Map<String, String> NW() {
      return Map.of();
   }

   public static boolean Nn() {
      RuntimeException runtimeexception = Ne.get();
      if (runtimeexception != null) {
         throw runtimeexception;
      } else {
         return true;
      }
   }

   public class03930 Nf() {
      return this.U;
   }

   public void Nw() {
      class04643 class04643 = class08700.N();
      class04643.N("timeSync");

      for (class04782 class04782 : this.NO()) {
         this.N(class04782);
      }

      class04643.L();
   }

   public void NS() {
      this.NZ = 0L;
   }

   public boolean NH() {
      return this.S;
   }

   public void yQ() {
      this.I = true;
   }

   public class07686 yL() {
      return this.NQ.y().u();
   }

   public class01623 yy() {
      return this.Nb;
   }

   public boolean Nc() {
      return this.x;
   }

   public long ym() {
      return this.NN / Math.min(100, Math.max(this.f, 1));
   }

   private Optional<class07824> Ny() {
      return Optional.of(this.i("server-icon.png"))
         .filter(var0 -> Files.isRegularFile(var0))
         .or(() -> this.B.z().filter(var0 -> Files.isRegularFile(var0)))
         .flatMap(var0 -> {
            try {
               byte[] abyte = Files.readAllBytes(var0);
               class03726 class03726 = class03726.N(abyte);
               if (class03726.N() == 64 && class03726.y() == 64) {
                  return Optional.of(new class07824(abyte));
               } else {
                  throw new IllegalArgumentException("Invalid world icon size [" + class03726.N() + ", " + class03726.y() + "], but expected [64, 64]");
               }
            } catch (Exception exception) {
               N.error("Couldn't load server icon", exception);
               return Optional.empty();
            }
         });
   }

   public boolean Np() {
      return this.Ni;
   }

   public class04681 yO() {
      if (this.g == null) {
         return class04645.N;
      } else {
         class04681 class04681 = this.g.N(class07536.u(), this.f);
         this.g = null;
         return class04681;
      }
   }

   public void yN() {
      if (this.C_() && this.D_()) {
         class01062 class01062 = this.Nm();
         class05152 class05152 = class01062.z();

         for (class04770 class04770 : Lists.newArrayList(class01062.v())) {
            if (!class05152.N(class04770.method_72498())) {
               class04770.field_13987.method_52396(class00392.L("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public boolean yJ() {
      for (class04782 class04782 : this.NO()) {
         if (class04782 != null && !class04782.field_13957) {
            return true;
         }
      }

      return false;
   }

   public void yb() {
      this.k.N();
   }

   public boolean Ne() {
      return this.NB().filter(class02794::u).isPresent();
   }

   public boolean Nj() {
      return this.F;
   }

   public class08773 yI() {
      return this.o;
   }

   public boolean NX() {
      return this.A;
   }

   public int NF() {
      return this.f;
   }

   private class04643 yH() {
      if (this.O) {
         this.k = class04541.N(new class04553(class07536.u, this.z()), class07536.u, class07536.Z(), new class04524("server"), this.Y, var1 -> {
            this.i(() -> this.y(var1.resolve("server")));
            this.Q.accept(var1);
         });
         this.O = false;
      }

      this.k.L();
      return class06014.N(this.k.R(), class06014.N("Server"));
   }

   public String Ng() {
      return Hooks.insertBranding("vanilla");
   }

   @Nullable
   public GameProfile NJ() {
      return this.NL;
   }

   private void ye() {
      class05042 class05042 = this.E.o().N();
      class04782 class04782 = this.yi();
      this.NJ = class04782.method_74891(class05042);
   }

   public KeyPair NI() {
      return Objects.requireNonNull(this.Ny);
   }

   public boolean NV() {
      return this.Nu;
   }

   protected void Nq() {
      N.info("Generating keypair");

      try {
         this.Ny = class01222.y();
      } catch (class05449 class05449) {
         throw new IllegalStateException("Failed to generate key pair", class05449);
      }
   }

   public void yT() {
      this.k = class04538.N;
   }

   @Nullable
   public class07806 NC() {
      return this.q;
   }

   public class01618 Na() {
      return this.J;
   }

   public Object getOrThrow(Key var1) {
      return this.NQ.y().fabric$getDataResourceStore().getOrThrow(var1);
   }

   public List fabric$getOriginalKnownPacks() {
      return this.Na;
   }

   public boolean C_() {
      return this.Nl;
   }

   public boolean D_() {
      return this.Nd;
   }

   protected void y_() {
      this.g();
      this.NP = true;

      try {
         this.y((BooleanSupplier)(() -> !this.F()));
      } finally {
         this.NP = false;
      }
   }
}
