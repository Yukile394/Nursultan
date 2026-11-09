package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import net.fabricmc.fabric.impl.content.registry.FireBlockHooks;
import net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00756 extends class05989 implements FireBlockHooks {
   public static final MapCodec<class00756> N = y(class00756::new);
   public static final int y = 15;
   public static final class08071 L = class06665.Nk;
   public static final class06667 u = class06901.y;
   public static final class06667 i = class06901.L;
   public static final class06667 R = class06901.u;
   public static final class06667 M = class06901.i;
   public static final class06667 B = class06901.R;
   public static final Map<class07211, class06667> Z = class06901.B
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey() != class07211.field_11033)
      .collect(class07536.N());
   private final Function<class00500, class00494> F;
   private static final int A = 60;
   private static final int f = 30;
   private static final int C = 15;
   private static final int S = 5;
   private static final int x = 100;
   private static final int D = 60;
   private static final int h = 20;
   private static final int r = 5;
   private final Object2IntMap<class00891> NN = new Object2IntOpenHashMap();
   private final Object2IntMap<class00891> Ny = new Object2IntOpenHashMap();
   private FlammableBlockRegistryImpl NL;

   private Function<class00500, class00494> L() {
      Map<class07211, class00494> map = class00389.u(class00891.L(16.0, 0.0, 1.0));
      return this.N(var1x -> {
         class00494 class00494 = class00389.N();

         for (Entry entry : Z.entrySet()) {
            if (var1x.<Boolean>L((class08092<Boolean>)entry.getValue())) {
               class00494 = class00389.N(class00494, map.get(entry.getKey()));
            }
         }

         return class00494.method_1110() ? O : class00494;
      }, new class08092[]{L});
   }

   private int T(class00500 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         return var1.y(class06665.q) && var1.L(class06665.q) ? 0 : this.Ny.getInt(var1.i());
      }
   }

   public class00756(class01362 var1) {
      super(var1, 1.0F);
      this.P(this.Q.y().y(L, 0).y(u, false).y(i, false).y(R, false).y(M, false).y(B, false));
      this.F = this.L();
      this.N(var1, null);
   }

   private int b(class00500 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         return var1.y(class06665.q) && var1.L(class06665.q) ? 0 : this.NN.getInt(var1.i());
      }
   }

   @Override
   public boolean U(class00500 var1) {
      return this.b(var1) > 0;
   }

   private boolean u(class07290 var1, class07209 var2) {
      for (class07211 class07211 : class07211.values()) {
         if (this.U(var1.method_8320(var2.method_10093(class07211)))) {
            return true;
         }
      }

      return false;
   }

   private void y(class00500 var1, CallbackInfoReturnable var2) {
      net.fabricmc.fabric.api.registry.FlammableBlockRegistry.Entry entry = this.NL.getFabric(var1.i());
      if (entry != null) {
         if (var1.y(class06665.q) && var1.L(class06665.q)) {
            var2.setReturnValue(0);
         } else {
            var2.setReturnValue(entry.getSpreadChance());
         }
      }
   }

   public static void y() {
      class00756 class00756 = (class00756)class00869.Lc;
      class00756.N(class00869.m, 5, 20);
      class00756.N(class00869.P, 5, 20);
      class00756.N(class00869.s, 5, 20);
      class00756.N(class00869.T, 5, 20);
      class00756.N(class00869.b, 5, 20);
      class00756.N(class00869.j, 5, 20);
      class00756.N(class00869.v, 5, 20);
      class00756.N(class00869.t, 5, 20);
      class00756.N(class00869.G, 5, 20);
      class00756.N(class00869.l, 5, 20);
      class00756.N(class00869.d, 5, 20);
      class00756.N(class00869.UE, 5, 20);
      class00756.N(class00869.UW, 5, 20);
      class00756.N(class00869.Um, 5, 20);
      class00756.N(class00869.UP, 5, 20);
      class00756.N(class00869.Us, 5, 20);
      class00756.N(class00869.UT, 5, 20);
      class00756.N(class00869.Ub, 5, 20);
      class00756.N(class00869.Uj, 5, 20);
      class00756.N(class00869.Uv, 5, 20);
      class00756.N(class00869.Un, 5, 20);
      class00756.N(class00869.Ut, 5, 20);
      class00756.N(class00869.Rp, 5, 20);
      class00756.N(class00869.UX, 5, 20);
      class00756.N(class00869.Ua, 5, 20);
      class00756.N(class00869.Up, 5, 20);
      class00756.N(class00869.UF, 5, 20);
      class00756.N(class00869.UA, 5, 20);
      class00756.N(class00869.Uf, 5, 20);
      class00756.N(class00869.UC, 5, 20);
      class00756.N(class00869.US, 5, 20);
      class00756.N(class00869.Ux, 5, 20);
      class00756.N(class00869.il, 5, 20);
      class00756.N(class00869.UD, 5, 20);
      class00756.N(class00869.Uh, 5, 20);
      class00756.N(class00869.Ur, 5, 20);
      class00756.N(class00869.EN, 5, 20);
      class00756.N(class00869.Ey, 5, 20);
      class00756.N(class00869.EL, 5, 20);
      class00756.N(class00869.Eu, 5, 20);
      class00756.N(class00869.Ei, 5, 20);
      class00756.N(class00869.ER, 5, 20);
      class00756.N(class00869.LF, 5, 20);
      class00756.N(class00869.Mk, 5, 20);
      class00756.N(class00869.Mw, 5, 20);
      class00756.N(class00869.MY, 5, 20);
      class00756.N(class00869.ZJ, 5, 20);
      class00756.N(class00869.Zo, 5, 20);
      class00756.N(class00869.Zq, 5, 20);
      class00756.N(class00869.ZK, 5, 20);
      class00756.N(class00869.ZV, 5, 20);
      class00756.N(class00869.Ze, 5, 20);
      class00756.N(class00869.ZH, 5, 20);
      class00756.N(class00869.D, 5, 5);
      class00756.N(class00869.h, 5, 5);
      class00756.N(class00869.r, 5, 5);
      class00756.N(class00869.NN, 5, 5);
      class00756.N(class00869.Ny, 5, 5);
      class00756.N(class00869.NL, 5, 5);
      class00756.N(class00869.Ni, 5, 5);
      class00756.N(class00869.Nu, 5, 5);
      class00756.N(class00869.NR, 5, 5);
      class00756.N(class00869.NZ, 5, 5);
      class00756.N(class00869.NT, 5, 5);
      class00756.N(class00869.Nz, 5, 5);
      class00756.N(class00869.NU, 5, 5);
      class00756.N(class00869.NE, 5, 5);
      class00756.N(class00869.NW, 5, 5);
      class00756.N(class00869.Nm, 5, 5);
      class00756.N(class00869.NP, 5, 5);
      class00756.N(class00869.Ns, 5, 5);
      class00756.N(class00869.Nb, 5, 5);
      class00756.N(class00869.Nj, 5, 5);
      class00756.N(class00869.NY, 5, 5);
      class00756.N(class00869.NQ, 5, 5);
      class00756.N(class00869.NO, 5, 5);
      class00756.N(class00869.Ng, 5, 5);
      class00756.N(class00869.NI, 5, 5);
      class00756.N(class00869.NJ, 5, 5);
      class00756.N(class00869.No, 5, 5);
      class00756.N(class00869.Nq, 5, 5);
      class00756.N(class00869.NK, 5, 5);
      class00756.N(class00869.Nv, 5, 5);
      class00756.N(class00869.Nn, 5, 5);
      class00756.N(class00869.Nt, 5, 5);
      class00756.N(class00869.NG, 5, 5);
      class00756.N(class00869.Nl, 5, 5);
      class00756.N(class00869.Nd, 5, 5);
      class00756.N(class00869.n, 5, 5);
      class00756.N(class00869.Nw, 5, 5);
      class00756.N(class00869.Nk, 5, 5);
      class00756.N(class00869.NM, 5, 20);
      class00756.N(class00869.NV, 30, 60);
      class00756.N(class00869.Ne, 30, 60);
      class00756.N(class00869.NH, 30, 60);
      class00756.N(class00869.Nc, 30, 60);
      class00756.N(class00869.NX, 30, 60);
      class00756.N(class00869.Na, 30, 60);
      class00756.N(class00869.Np, 30, 60);
      class00756.N(class00869.NF, 30, 60);
      class00756.N(class00869.NA, 30, 60);
      class00756.N(class00869.Lt, 30, 20);
      class00756.N(class00869.Ln, 15, 100);
      class00756.N(class00869.yk, 60, 100);
      class00756.N(class00869.yY, 60, 100);
      class00756.N(class00869.yQ, 60, 100);
      class00756.N(class00869.yg, 60, 100);
      class00756.N(class00869.yI, 60, 100);
      class00756.N(class00869.zt, 60, 100);
      class00756.N(class00869.zG, 60, 100);
      class00756.N(class00869.zl, 60, 100);
      class00756.N(class00869.zd, 60, 100);
      class00756.N(class00869.zw, 60, 100);
      class00756.N(class00869.zk, 60, 100);
      class00756.N(class00869.Ly, 60, 100);
      class00756.N(class00869.Lu, 60, 100);
      class00756.N(class00869.nx, 60, 100);
      class00756.N(class00869.nD, 60, 100);
      class00756.N(class00869.Li, 60, 100);
      class00756.N(class00869.LR, 60, 100);
      class00756.N(class00869.LM, 60, 100);
      class00756.N(class00869.LB, 60, 100);
      class00756.N(class00869.LZ, 60, 100);
      class00756.N(class00869.Lz, 60, 100);
      class00756.N(class00869.LU, 60, 100);
      class00756.N(class00869.LE, 60, 100);
      class00756.N(class00869.LW, 60, 100);
      class00756.N(class00869.LP, 60, 100);
      class00756.N(class00869.LL, 60, 100);
      class00756.N(class00869.Ed, 60, 100);
      class00756.N(class00869.Lm, 60, 100);
      class00756.N(class00869.vh, 60, 100);
      class00756.N(class00869.vr, 60, 100);
      class00756.N(class00869.nN, 60, 100);
      class00756.N(class00869.iv, 60, 100);
      class00756.N(class00869.yV, 30, 60);
      class00756.N(class00869.ye, 30, 60);
      class00756.N(class00869.yH, 30, 60);
      class00756.N(class00869.yc, 30, 60);
      class00756.N(class00869.yX, 30, 60);
      class00756.N(class00869.ya, 30, 60);
      class00756.N(class00869.yp, 30, 60);
      class00756.N(class00869.yF, 30, 60);
      class00756.N(class00869.yA, 30, 60);
      class00756.N(class00869.yf, 30, 60);
      class00756.N(class00869.yC, 30, 60);
      class00756.N(class00869.yS, 30, 60);
      class00756.N(class00869.yx, 30, 60);
      class00756.N(class00869.yD, 30, 60);
      class00756.N(class00869.yh, 30, 60);
      class00756.N(class00869.yr, 30, 60);
      class00756.N(class00869.Rc, 15, 100);
      class00756.N(class00869.zv, 5, 5);
      class00756.N(class00869.zy, 60, 20);
      class00756.N(class00869.Tu, 15, 20);
      class00756.N(class00869.zL, 60, 20);
      class00756.N(class00869.zu, 60, 20);
      class00756.N(class00869.zi, 60, 20);
      class00756.N(class00869.zR, 60, 20);
      class00756.N(class00869.zM, 60, 20);
      class00756.N(class00869.zB, 60, 20);
      class00756.N(class00869.zZ, 60, 20);
      class00756.N(class00869.zz, 60, 20);
      class00756.N(class00869.zU, 60, 20);
      class00756.N(class00869.zE, 60, 20);
      class00756.N(class00869.zW, 60, 20);
      class00756.N(class00869.zm, 60, 20);
      class00756.N(class00869.zP, 60, 20);
      class00756.N(class00869.zs, 60, 20);
      class00756.N(class00869.zT, 60, 20);
      class00756.N(class00869.zb, 60, 20);
      class00756.N(class00869.nf, 5, 100);
      class00756.N(class00869.nC, 5, 100);
      class00756.N(class00869.nS, 5, 100);
      class00756.N(class00869.mN, 30, 60);
      class00756.N(class00869.mx, 60, 60);
      class00756.N(class00869.Pa, 60, 60);
      class00756.N(class00869.PD, 30, 20);
      class00756.N(class00869.TL, 5, 20);
      class00756.N(class00869.sM, 60, 100);
      class00756.N(class00869.TR, 5, 20);
      class00756.N(class00869.Ti, 30, 20);
      class00756.N(class00869.Nf, 30, 60);
      class00756.N(class00869.NC, 30, 60);
      class00756.N(class00869.vA, 15, 60);
      class00756.N(class00869.vf, 15, 60);
      class00756.N(class00869.vC, 60, 100);
      class00756.N(class00869.vS, 30, 60);
      class00756.N(class00869.vx, 30, 60);
      class00756.N(class00869.nL, 60, 100);
      class00756.N(class00869.nu, 60, 100);
      class00756.N(class00869.ni, 60, 100);
      class00756.N(class00869.nR, 30, 60);
      class00756.N(class00869.RX, 15, 100);
      class00756.N(class00869.tN, 60, 100);
      class00756.N(class00869.yO, 60, 100);
      class00756.N(class00869.Ll, 30, 20);
      class00756.N(class00869.Ld, 30, 20);
      class00756.N(class00869.Lw, 30, 20);
      class00756.N(class00869.Lk, 30, 20);
      class00756.N(class00869.LQ, 30, 20);
      class00756.N(class00869.LO, 30, 20);
      class00756.N(class00869.Lg, 30, 20);
      class00756.N(class00869.LI, 30, 20);
      class00756.N(class00869.LJ, 30, 20);
      class00756.N(class00869.Lo, 30, 20);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      super.N_23(var1, var2, var3, var4, var5);
      var2.N(var3, this, N(var2.field_9229));
   }

   public void N(class00891 var1, int var2, int var3) {
      this.NN.put(var1, var2);
      this.Ny.put(var1, var3);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u, i, R, M, B);
   }

   private static int N(class06069 var0) {
      return 30 + var0.y(10);
   }

   private void N(class00500 var1, CallbackInfoReturnable var2) {
      net.fabricmc.fabric.api.registry.FlammableBlockRegistry.Entry entry = this.NL.getFabric(var1.i());
      if (entry != null) {
         if (var1.y(class06665.q) && var1.L(class06665.q)) {
            var2.setReturnValue(0);
         } else {
            var2.setReturnValue(entry.getBurnChance());
         }
      }
   }

   private void N(class01362 var1, CallbackInfo var2) {
      this.NL = FlammableBlockRegistryImpl.getInstance(this);
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var5.setReturnValue(class00389.N());
      }
   }

   protected class00500 N(class07290 var1, class07209 var2) {
      class07209 class07209 = var2.method_10074();
      class00500 class00500x = var1.method_8320(class07209);
      if (!this.U(class00500x) && !class00500x.L(var1, class07209, class07211.field_11036)) {
         class00500 class00500x = this.W();

         for (class07211 class07211 : class07211.values()) {
            class06667 class06667 = Z.get(class07211);
            if (class06667 != null) {
               class00500x = class00500x.y(class06667, this.U(var1.method_8320(var2.method_10093(class07211))));
            }
         }

         return class00500x;
      } else {
         return this.W();
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.N((class07290)var1.method_8045(), var1.method_8037());
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.F.apply(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return this.a_(var1, var2, var4) ? this.N(var2, var4, var1.L(L)) : class00869.N.W();
   }

   @Override
   public MapCodec<class00756> N() {
      return N;
   }

   private class00500 N(class05487 var1, class07209 var2, int var3) {
      class00500 class00500 = y(var1, var2);
      return class00500.N(class00869.Lc) ? class00500.y(L, var3) : class00500;
   }

   private int N(class05487 var1, class07209 var2) {
      if (!var1.R(var2)) {
         return 0;
      } else {
         int ix = 0;

         for (class07211 class07211 : class07211.values()) {
            class00500 class00500 = var1.method_8320(var2.method_10093(class07211));
            ix = Math.max(this.b(class00500), ix);
         }

         return ix;
      }
   }

   protected boolean N(class07299 var1, class07209 var2) {
      return var1.method_8520(var2)
         || var1.method_8520(var2.method_10067())
         || var1.method_8520(var2.method_10078())
         || var1.method_8520(var2.method_10095())
         || var1.method_8520(var2.method_10072());
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      var2.N(var3, this, N(var2.field_9229));
      if (var2.method_76058(var3)) {
         if (!var1.N(var2, var3)) {
            var2.method_8650(var3, false);
         }

         boolean flag = var2.method_8320(var3.method_10074()).N(var2.method_8597().U());
         int ix = var1.L(L);
         if (!flag && var2.method_8419() && this.N((class07299)var2, var3) && var4.z() < 0.2F + ix * 0.03F) {
            var2.method_8650(var3, false);
         } else {
            int j = Math.min(15, ix + var4.y(3) / 2);
            if (ix != j) {
               var1 = var1.y(L, j);
               var2.method_8652(var3, var1, 260);
            }

            if (!flag) {
               if (!this.u(var2, var3)) {
                  class07209 class07209 = var3.method_10074();
                  if (!var2.method_8320(class07209).L(var2, class07209, class07211.field_11036) || ix > 3) {
                     var2.method_8650(var3, false);
                  }

                  return;
               }

               if (ix == 15 && var4.y(4) == 0 && !this.U(var2.method_8320(var3.method_10074()))) {
                  var2.method_8650(var3, false);
                  return;
               }
            }

            boolean flag1 = var2.method_75728().N(class00608.J, var3);
            int k = flag1 ? -50 : 0;
            this.N(var2, var3.method_10078(), 300 + k, var4, ix);
            this.N(var2, var3.method_10067(), 300 + k, var4, ix);
            this.N(var2, var3.method_10074(), 250 + k, var4, ix);
            this.N(var2, var3.method_10084(), 250 + k, var4, ix);
            this.N(var2, var3.method_10095(), 300 + k, var4, ix);
            this.N(var2, var3.method_10072(), 300 + k, var4, ix);
            class07218 class07218 = new class07218();

            for (int l = -1; l <= 1; l++) {
               for (int i1 = -1; i1 <= 1; i1++) {
                  for (int j1 = -1; j1 <= 4; j1++) {
                     if (l != 0 || j1 != 0 || i1 != 0) {
                        int k1 = 100;
                        if (j1 > 1) {
                           k1 += (j1 - 1) * 100;
                        }

                        class07218.N(var3, l, j1, i1);
                        int l1 = this.N((class05487)var2, class07218);
                        if (l1 > 0) {
                           int i2 = (l1 + 40 + var2.y().N() * 7) / (ix + 30);
                           if (flag1) {
                              i2 /= 2;
                           }

                           if (i2 > 0 && var4.y(k1) <= i2 && (!var2.method_8419() || !this.N((class07299)var2, class07218))) {
                              int j2 = Math.min(15, ix + var4.y(5) / 4);
                              var2.method_8652(class07218, this.N(var2, class07218, j2), 3);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void N(class07299 var1, class07209 var2, int var3, class06069 var4, int var5) {
      int ix = this.T(var1.method_8320(var2));
      if (var4.y(var3) < ix) {
         class00500 class00500 = var1.method_8320(var2);
         if (var4.y(var5 + 10) < 5 && !var1.method_8520(var2)) {
            int j = Math.min(var5 + var4.y(5) / 4, 15);
            var1.method_8652(var2, this.N(var1, var2, j), 3);
         } else {
            var1.method_8650(var2, false);
         }

         class00891 class00891 = class00500.i();
         if (class00891 instanceof class00655) {
            class00655.N(var1, var2);
         }
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return var2.method_8320(class07209).L(var2, class07209, class07211.field_11036) || this.u(var2, var3);
   }

   public net.fabricmc.fabric.api.registry.FlammableBlockRegistry.Entry fabric_getVanillaEntry(class00500 var1) {
      return new net.fabricmc.fabric.api.registry.FlammableBlockRegistry.Entry(this.b(var1), this.T(var1));
   }
}
