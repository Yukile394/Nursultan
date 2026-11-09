package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.RegistrationHelperImpl;
import net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class04808 {
   private static Logger N = LoggerFactory.getLogger("minecraft.class04808");
   private static final Map<class07078<?>, class04804<?>> y = new Object2ObjectOpenHashMap();

   public class04808() {
      super();
   }

   static {
      N(class07078.L, var0 -> new class03746(var0, class04802.N));
      N(class07078.u, var0 -> new class03746(var0, class04802.y));
      N(class07078.i, class03637::new);
      N(class07078.R, class01698::new);
      N(class07078.M, class04292::new);
      N(class07078.B, class03720::new);
      N(class07078.Z, class02654::new);
      N(class07078.z, class05570::new);
      N(class07078.U, var0 -> new class00243(var0, class04802.W));
      N(class07078.E, var0 -> new class00243(var0, class04802.m));
      N(class07078.W, class03721::new);
      N(class07078.m, class05504::new);
      N(class07078.P, var0 -> new class03746(var0, class04802.w));
      N(class07078.s, var0 -> new class03746(var0, class04802.k));
      N(class07078.T, class03742::new);
      N(class07078.b, class01983::new);
      N(class07078.j, class02823::new);
      N(class07078.v, class01793::new);
      N(class07078.n, class01771::new);
      N(class07078.t, class02000::new);
      N(class07078.G, class07578::new);
      N(class07078.l, class02838::new);
      N(class07078.d, class03715::new);
      N(class07078.w, var0 -> new class03746(var0, class04802.S));
      N(class07078.k, var0 -> new class03746(var0, class04802.x));
      N(class07078.Y, var0 -> new class02776(var0, class04802.h));
      N(class07078.Q, class03738::new);
      N(class07078.O, class01749::new);
      N(class07078.I, var0 -> new class02776(var0, class04802.NZ));
      N(class07078.g, class08111::new);
      N(class07078.J, class01732::new);
      N(class07078.o, class00322::new);
      N(class07078.q, class01718::new);
      N(class07078.K, var0 -> new class03746(var0, class04802.Nk));
      N(class07078.V, var0 -> new class03746(var0, class04802.NY));
      N(class07078.e, class01710::new);
      N(class07078.H, var0 -> new class02786<>(var0, class02782.field_56095));
      N(class07078.c, class03134::new);
      N(class07078.X, class03122::new);
      N(class07078.a, class02662::new);
      N(class07078.p, class03118::new);
      N(class07078.F, class03100::new);
      N(class07078.A, class04486::new);
      N(class07078.f, class04511::new);
      N(class07078.C, class02662::new);
      N(class07078.S, class03127::new);
      N(class07078.x, class01783::new);
      N(class07078.D, class01792::new);
      N(class07078.h, class02662::new);
      N(class07078.r, class01764::new);
      N(class07078.NN, var0 -> new class02662<>(var0, 1.0F, true));
      N(class07078.Ny, class01791::new);
      N(class07078.NL, var0 -> new class02662<>(var0, 3.0F, true));
      N(class07078.Nu, class03833::new);
      N(class07078.LL, class03817::new);
      N(class07078.Ni, class01327::new);
      N(class07078.NR, class01925::new);
      N(class07078.NM, var0 -> new class02776(var0, class04802.yR));
      N(class07078.NB, class03838::new);
      N(class07078.NZ, class08645::new);
      N(class07078.Nz, var0 -> new class03842(var0, 6.0F));
      N(class07078.NU, class02878::new);
      N(class07078.NE, var0 -> new class05546(var0, new class04388(var0.N(class04802.yz)), new class04388(var0.N(class04802.yU))));
      N(class07078.NW, class02156::new);
      N(class07078.Nm, class03840::new);
      N(class07078.NP, class01495::new);
      N(class07078.Ns, var0 -> new class02776(var0, class04802.yG));
      N(class07078.NT, class04287::new);
      N(class07078.Nb, class04267::new);
      N(class07078.Nj, class02889::new);
      N(class07078.Nv, class01698::new);
      N(class07078.Nn, class04277::new);
      N(class07078.Nt, class02893::new);
      N(class07078.NG, class01971::new);
      N(class07078.Nl, class02878::new);
      N(class07078.Nd, var0 -> new class03746(var0, class04802.yK));
      N(class07078.Nw, var0 -> new class03746(var0, class04802.yV));
      N(class07078.Nk, class02279::new);
      N(class07078.NY, class02307::new);
      N(class07078.yi, class02662::new);
      N(class07078.NQ, var0 -> new class02295(var0, class04802.yH, class04802.yc));
      N(class07078.NO, class02288::new);
      N(class07078.Ng, class02881::new);
      N(class07078.NI, var0 -> new class03746(var0, class04802.yA));
      N(class07078.NJ, var0 -> new class03746(var0, class04802.yf));
      N(class07078.Nq, class01698::new);
      N(class07078.NK, var0 -> new class02776(var0, class04802.yC));
      N(class07078.NV, class02856::new);
      N(class07078.Ne, var0 -> new class02786<>(var0, class02782.field_56096));
      N(class07078.NH, class06746::new);
      N(class07078.Nc, var0 -> new class03746(var0, class04802.LR));
      N(class07078.NX, var0 -> new class03746(var0, class04802.LM));
      N(class07078.Na, class04647::new);
      N(class07078.Np, class02630::new);
      N(class07078.NF, class02814::new);
      N(class07078.NA, var0 -> new class03746(var0, class04802.Lz));
      N(class07078.Nf, var0 -> new class03746(var0, class04802.LU));
      N(class07078.NC, class02707::new);
      N(class07078.NS, class07568::new);
      N(class07078.Nx, class02714::new);
      N(class07078.ND, class02492::new);
      N(class07078.Nh, class02693::new);
      N(class07078.Nr, var0 -> new class01532(var0, class04802.Lv, class04802.Ln, class04802.Lw, class04802.Lt));
      N(class07078.yN, var0 -> new class01532(var0, class04802.LG, class04802.LG, class04802.Ll, class04802.Ll));
      N(class07078.yy, class02475::new);
      N(class07078.yL, class02323::new);
      N(class07078.yR, class02498::new);
      N(class07078.yM, class02354::new);
      N(class07078.yB, class04253::new);
      N(class07078.yZ, class02322::new);
      N(class07078.yz, class02186::new);
      N(class07078.yU, class02189::new);
      N(class07078.yE, class02337::new);
      N(class07078.yW, class02175::new);
      N(class07078.ym, class02628::new);
      N(class07078.yP, var0 -> new class02631(var0, class02629.field_56104));
      N(class07078.ys, class02180::new);
      N(class07078.yT, var0 -> new class02662<>(var0, 0.75F, true));
      N(class07078.yb, class03595::new);
      N(class07078.yj, class02662::new);
      N(class07078.yv, class02653::new);
      N(class07078.yn, var0 -> new class02776(var0, class04802.un));
      N(class07078.yt, class02619::new);
      N(class07078.yG, class02634::new);
      N(class07078.yu, class02662::new);
      N(class07078.yl, var0 -> new class03746(var0, class04802.uG));
      N(class07078.yd, var0 -> new class03746(var0, class04802.ul));
      N(class07078.yw, var0 -> new class02650<>(var0, new class04388(var0.N(class04802.ud)), new class04388(var0.N(class04802.uw))));
      N(class07078.yk, class02642::new);
      N(class07078.yY, class05309::new);
      N(class07078.yQ, class01914::new);
      N(class07078.yO, class01954::new);
      N(class07078.yg, class02622::new);
      N(class07078.yI, class02652::new);
      N(class07078.yJ, var0 -> new class02295(var0, class04802.uK, class04802.uV));
      N(class07078.yo, class02660::new);
      N(class07078.yq, class02663::new);
      N(class07078.yK, class02644::new);
      N(class07078.yV, class02639::new);
      N(class07078.ye, class02624::new);
      N(class07078.yH, class02647::new);
      N(class07078.yc, class06158::new);
      N(class07078.yX, class04013::new);
      N(class07078.ya, class01771::new);
      N(class07078.yp, class02914::new);
      N(class07078.yF, class02618::new);
      N(class07078.yA, class02949::new);
      N(class07078.yf, class02905::new);
      N(class07078.yC, class02942::new);
      N(class07078.yS, class05307::new);
      N(class07078.yx, class06232::new);
      N(class07078.yD, var0 -> new class02631(var0, class02629.field_56105));
      N(class07078.yh, class07572::new);
      N(class07078.yr, class02534::new);
      N(class07078.LN, var0 -> new class02792(var0, class04802.ie, class04802.iH, class04802.iX, class04802.ic));
   }

   public static <T extends class06600 & class06618> Map<class04208, class08287<T>> y(class04832 var0) {
      try {
         class04208 class04208 = class04208.field_41123;
         boolean flag = false;
         class08287 class08287 = N(var0, flag, var0x -> {
            WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_5617$class_5618, boolean]");
            return new class08287((class04832)var0x[0], (Boolean)var0x[1]);
         });
         Object object2 = null;
         Object object1 = null;
         object1 = class04208.field_41122;
         flag = true;
         class08287 class08287x = N(var0, flag, var0x -> {
            WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_5617$class_5618, boolean]");
            return new class08287((class04832)var0x[0], (Boolean)var0x[1]);
         });
         Object object3 = null;
         Object object = null;
         return Map.of(class04208, class08287, (class04208)object1, class08287x);
      } catch (Exception exception) {
         throw new IllegalArgumentException("Failed to create avatar models", exception);
      }
   }

   public static Map<class07078<?>, class04507<?, ?>> N(class04832 var0) {
      Builder builder = ImmutableMap.builder();
      y.forEach((var2, var3) -> {
         try {
            builder.put(var2, N(var3, var0, builder, var0, var2));
         } catch (Exception exception) {
            throw new IllegalArgumentException("Failed to create model for " + class04206.M.y((class07078<?>)var2), exception);
         }
      });
      return builder.build();
   }

   private static class08287 N(class04832 var0, boolean var1, Operation var2) {
      class08287 class08287 = (class08287)var2.call(new Object[]{var0, var1});
      LivingEntityRendererAccessor livingentityrendereraccessor = class08287;
      ((LivingEntityFeatureRendererRegistrationCallback)LivingEntityFeatureRendererRegistrationCallback.EVENT.invoker())
         .registerRenderers(class07078.Ly, class08287, new RegistrationHelperImpl(livingentityrendereraccessor::callAddFeature), var0);
      return class08287;
   }

   public static <T extends class07049> void N(class07078<? extends T> var0, class04804<T> var1) {
      y.put(var0, var1);
   }

   private static void N(CallbackInfo var0) {
      EntityRendererRegistryImpl.setup((var0x, var1) -> y.put(var0x, var1));
   }

   private static class04507 N(class04804 var0, class04832 var1, Builder var2, class04832 var3, class07078 var4) {
      class04507 class04507 = var0.create(var1);
      if (class04507 instanceof class02294) {
         LivingEntityRendererAccessor livingentityrendereraccessor = (LivingEntityRendererAccessor)class04507;
         ((LivingEntityFeatureRendererRegistrationCallback)LivingEntityFeatureRendererRegistrationCallback.EVENT.invoker())
            .registerRenderers(var4, (class02294)class04507, new RegistrationHelperImpl(livingentityrendereraccessor::callAddFeature), var1);
      }

      return class04507;
   }

   public static boolean N() {
      boolean flag = true;

      for (class07078 class07078 : class04206.M) {
         if (class07078 != class07078.Ly && class07078 != class07078.No && !y.containsKey(class07078)) {
            N.warn("No renderer registered for {}", class04206.M.y(class07078));
            flag = false;
         }
      }

      return !flag;
   }
}
