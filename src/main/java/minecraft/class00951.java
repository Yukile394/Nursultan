package minecraft;

import Nursultan.class09425;
import Nursultan.class09442;
import Nursultan.class09466;
import Nursultan.class09515;
import Nursultan.class09523;
import Nursultan.class09529;
import Nursultan.class09532;
import Nursultan.class09541;
import Nursultan.class09546;
import Nursultan.class09550;
import Nursultan.class10095;
import Nursultan.class10098;
import Nursultan.class10150;
import Nursultan.class10155;
import Nursultan.class10157;
import Nursultan.class10163;
import Nursultan.class10170;
import Nursultan.class10174;
import Nursultan.class10176;
import Nursultan.class10177;
import Nursultan.class10180;
import Nursultan.class10181;
import Nursultan.class10182;
import Nursultan.class10185;
import Nursultan.class10211;
import Nursultan.class10212;
import Nursultan.class10214;
import Nursultan.class10216;
import Nursultan.class10217;
import Nursultan.class10218;
import Nursultan.class10220;
import Nursultan.class10221;
import Nursultan.class10222;
import Nursultan.class10225;
import Nursultan.class10284;
import Nursultan.class10294;
import Nursultan.class10299;
import Nursultan.class10307;
import Nursultan.class10334;
import Nursultan.class10341;
import Nursultan.class10391;
import Nursultan.class10396;
import Nursultan.class10397;
import Nursultan.class10405;
import Nursultan.class10453;
import Nursultan.class10454;
import Nursultan.class10455;
import Nursultan.class10458;
import Nursultan.class10636;
import Nursultan.class11164;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.client.particle.ParticleFactoryRegistryImpl;
import net.fabricmc.fabric.impl.registry.sync.trackers.Int2ObjectMapTracker;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class00951 implements class01081, FabricResourceReloader {
   private static final Logger L = LogUtils.getLogger();
   private static final class03069 u = class03069.N("particles");
   public final Map<class01894, class00975> N = Maps.newHashMap();
   public final Int2ObjectMap<class04417<?>> y = new Int2ObjectOpenHashMap();
   @Nullable
   private Runnable i;
   private class01894 R;

   public class00951() {
      super();
      this.y();
      this.N(null);
   }

   private void y(CallbackInfo var1) {
      ParticleFactoryRegistryImpl.INSTANCE.initialize(this);
   }

   private void y() {
      this.N(class07107.N, class03185::new);
      this.N(class07107.L, new class03006());
      this.N(class07107.y, new class03975());
      this.N(class07107.u, class09532::new);
      this.N(class07107.Nn, class10163::new);
      this.N(class07107.Nj, class09523::new);
      this.N(class07107.Nl, class05878::new);
      this.N(class07107.Nd, class05867::new);
      this.N(class07107.i, class10397::new);
      this.N(class07107.A, class03624::new);
      this.N(class07107.R, class10212::new);
      this.N(class07107.M, class09529::new);
      this.N(class07107.Nv, class10220::new);
      this.N(class07107.B, class01826::new);
      this.N(class07107.Z, class04027::new);
      this.N(class07107.NG, class03654::new);
      this.N(class07107.z, class10185::new);
      this.N(class07107.U, class10180::new);
      this.N(class07107.E, class03315::new);
      this.N(class07107.W, class10177::new);
      this.N(class07107.m, class10181::new);
      this.N(class07107.P, class10095::new);
      this.N(class07107.s, class09442::new);
      this.N(class07107.T, class04060::new);
      this.N(class07107.b, new class10636());
      this.N(class07107.j, class01819::new);
      this.N(class07107.v, class10294::new);
      this.N(class07107.n, class10334::new);
      this.N(class07107.t, class04077::new);
      this.N(class07107.G, new class10211());
      this.N(class07107.l, class10214::new);
      this.N(class07107.Q, class10405::new);
      this.N(class07107.O, class10157::new);
      this.N(class07107.d, class01790::new);
      this.N(class07107.w, class01773::new);
      this.N(class07107.k, new class01758(3.0, 7, 0));
      this.N(class07107.Y, new class01758(1.0, 3, 2));
      this.N(class07107.g, class04322::new);
      this.N(class07107.I, class10217::new);
      this.N(class07107.J, class10212::new);
      this.N(class07107.o, class10307::new);
      this.N(class07107.e, class01379::new);
      this.N(class07107.H, class01932::new);
      this.N(class07107.c, class01926::new);
      this.N(class07107.a, class01355::new);
      this.N(class07107.X, class10212::new);
      this.N(class07107.p, class04307::new);
      this.N(class07107.F, class10218::new);
      this.N(class07107.f, class10155::new);
      this.N(class07107.C, class04060::new);
      this.N(class07107.S, new class04557());
      this.N(class07107.h, new class10454());
      this.N(class07107.r, new class10453());
      this.N(class07107.NN, new class10455());
      this.N(class07107.Ny, class10396::new);
      this.N(class07107.NL, class10284::new);
      this.N(class07107.Nu, class10225::new);
      this.N(class07107.Nt, class10299::new);
      this.N(class07107.Ni, class04435::new);
      this.N(class07107.NR, class10098::new);
      this.N(class07107.NM, class10391::new);
      this.N(class07107.NB, class10221::new);
      this.N(class07107.NZ, class10341::new);
      this.N(class07107.Nz, class10150::new);
      this.N(class07107.NU, class04413::new);
      this.N(class07107.NX, class06364::new);
      this.N(class07107.NE, class09550::new);
      this.N(class07107.Nm, class10458::new);
      this.N(class07107.NP, class10216::new);
      this.N(class07107.NW, class03972::new);
      this.N(class07107.Ns, class01913::new);
      this.N(class07107.NT, class09541::new);
      this.N(class07107.Nb, class04071::new);
      this.N(class07107.Nw, class03302::new);
      this.N(class07107.Nk, class03318::new);
      this.N(class07107.NY, class03307::new);
      this.N(class07107.NQ, class03319::new);
      this.N(class07107.NO, class03321::new);
      this.N(class07107.No, class09546::new);
      this.N(class07107.Ng, class01497::new);
      this.N(class07107.NI, class01917::new);
      this.N(class07107.NJ, class01915::new);
      this.N(class07107.Nq, class03314::new);
      this.N(class07107.NK, class03294::new);
      this.N(class07107.NV, class03308::new);
      this.N(class07107.Ne, class09466::new);
      this.N(class07107.NH, class05051::new);
      this.N(class07107.Nc, class03518::new);
      this.N(class07107.NF, class10174::new);
      this.N(class07107.NA, class10182::new);
      this.N(class07107.q, class03373::new);
      this.N(class07107.K, class03344::new);
      this.N(class07107.V, class03329::new);
      this.N(class07107.Na, class10176::new);
      this.N(class07107.Np, class10170::new);
      this.N(class07107.x, class01184::new);
      this.N(class07107.D, class00321::new);
      this.N(class07107.Nf, class03988::new);
      this.N(class07107.NC, class05553::new);
      this.N(class07107.NS, class05545::new);
      this.N(class07107.Nx, class05567::new);
      this.N(class07107.ND, class05560::new);
      this.N(class07107.Nh, class05551::new);
      this.N(class07107.Nr, class03973::new);
      this.N(class07107.yN, class10222::new);
      this.N(class07107.yy, class09515::new);
      this.N(class07107.yL, class01776::new);
      this.N(class07107.yu, class01776::new);
      this.N(class07107.yi, class04021::new);
      this.N(class07107.yR, new class03996());
      this.N(class07107.yB, class10307::new);
      this.N(class07107.yZ, class10307::new);
      this.N(class07107.yM, class02637::new);
      this.N(class07107.yz, new class03997());
      this.N(class07107.yU, class11164::new);
      this.y(null);
   }

   public void N(CallbackInfo var1) {
      Int2ObjectMapTracker.register(class04206.z, "ParticleManager.factories", this.y);
   }

   public void N(Runnable var1) {
      this.i = var1;
   }

   private <T extends class07126> void N(class07103<T> var1, class04417<T> var2) {
      this.y.put(class04206.z.N(var1), var2);
   }

   private <T extends class07126> void N(class07103<T> var1, class09425<T> var2) {
      class00975 class00975 = new class00975();
      this.N.put(class04206.z.y(var1), class00975);
      this.y.put(class04206.z.N(var1), var2.create(class00975));
   }

   public Int2ObjectMap<class04417<?>> N() {
      return this.y;
   }

   private Optional<List<class01894>> N(class01894 var1, class01079 var2) {
      if (!this.N.containsKey(var1)) {
         L.debug("Redundant texture list for particle: {}", var1);
         return Optional.empty();
      } else {
         try {
            Optional optional;
            try (BufferedReader bufferedreader = var2.method_43039()) {
               class01314 class01314 = class01314.N(class05001.N(bufferedreader));
               optional = Optional.of(class01314.N());
            }

            return optional;
         } catch (IOException ioexception) {
            throw new IllegalStateException("Failed to load description for particle " + var1, ioexception);
         }
      }
   }

   public class01894 fabric$getId() {
      if (this.R == null) {
         if (this instanceof class08117) {
            this.R = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.R = Client.MODELS;
         } else if (this instanceof class03579) {
            this.R = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.R = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.R = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.R = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.R = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.R = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.R = Client.FONTS;
         } else if (this instanceof class08575) {
            this.R = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.R = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.R = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.R = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.R = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.R = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.R = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.R = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.R = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.R = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.R;
   }

   @Override
   public CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      CompletableFuture completablefuture = CompletableFuture.<Map>supplyAsync(() -> u.N(var0), var2).thenCompose(var2x -> {
         ArrayList arraylist = new ArrayList(var2x.size());
         var2x.forEach((var3x, var4x) -> {
            class01894 class01894 = u.y(var3x);
            arraylist.add(CompletableFuture.supplyAsync(() -> new class00970(class01894, this.N(class01894, var4x)), var2));
         });
         return class07536.L(arraylist);
      });
      CompletableFuture completablefuture1 = var1.N(class08117.N).N(class08589.U);
      return CompletableFuture.allOf(completablefuture, completablefuture1).thenCompose(var3::N).thenAcceptAsync(var3x -> {
         if (this.i != null) {
            this.i.run();
         }

         class04643 class04643 = class08700.N();
         class04643.N("upload");
         class02008 class02008 = (class02008)completablefuture1.join();
         class04643.y("bindSpriteSets");
         HashSet hashset = new HashSet();
         class08388 class08388 = class02008.u();
         ((List)completablefuture.join()).forEach(var4x -> {
            Optional optional = var4x.y();
            if (!optional.isEmpty()) {
               ArrayList arraylist = new ArrayList();

               for (class01894 class01894 : (List)optional.get()) {
                  class08388 class08388x = class02008.N(class01894);
                  if (class08388x == null) {
                     hashset.add(class01894);
                     arraylist.add(class08388);
                  } else {
                     arraylist.add(class08388x);
                  }
               }

               if (arraylist.isEmpty()) {
                  arraylist.add(class08388);
               }

               this.N.get(var4x.N()).N(arraylist);
            }
         });
         if (!hashset.isEmpty()) {
            L.warn("Missing particle sprites: {}", hashset.stream().sorted().map(class01894::toString).collect(Collectors.joining(",")));
         }

         class04643.L();
      }, var4);
   }
}
