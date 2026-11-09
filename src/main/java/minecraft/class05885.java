package minecraft;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl;
import net.irisshaders.iris.shaderpack.materialmap.BlockMaterialMapping;
import net.irisshaders.iris.shaderpack.materialmap.BlockRenderType;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class05885 {
   private static Map<class00891, class08743> N = class07536.N(Maps.newHashMap(), var0x -> {
      class08743 class08743xx = class08743.field_60927;
      var0x.put(class00869.Ml, class08743xx);
      class08743 class08743x = class08743.field_60925;
      var0x.put(class00869.Z, class08743x);
      var0x.put(class00869.RQ, class08743x);
      class00869.RO.N(var2x -> var0x.put(var2x, class08743x));
      var0x.put(class00869.MG, class08743x);
      var0x.put(class00869.Bf, class08743x);
      var0x.put(class00869.Rg, class08743x);
      class00869.RI.N(var2x -> var0x.put(var2x, class08743x));
      var0x.put(class00869.Nc, class08743x);
      var0x.put(class00869.NV, class08743x);
      var0x.put(class00869.Ne, class08743x);
      var0x.put(class00869.NX, class08743x);
      var0x.put(class00869.Na, class08743x);
      var0x.put(class00869.NH, class08743x);
      var0x.put(class00869.Np, class08743x);
      var0x.put(class00869.NF, class08743x);
      var0x.put(class00869.Nf, class08743x);
      var0x.put(class00869.NC, class08743x);
      var0x.put(class00869.NM, class08743x);
      var0x.put(class00869.NA, class08743x);
      var0x.put(class00869.w, class08743x);
      var0x.put(class00869.k, class08743x);
      var0x.put(class00869.Y, class08743x);
      var0x.put(class00869.Q, class08743x);
      var0x.put(class00869.O, class08743x);
      var0x.put(class00869.g, class08743x);
      var0x.put(class00869.I, class08743x);
      var0x.put(class00869.J, class08743x);
      var0x.put(class00869.yM, class08743x);
      var0x.put(class00869.yB, class08743x);
      var0x.put(class00869.yZ, class08743x);
      var0x.put(class00869.yz, class08743x);
      var0x.put(class00869.yU, class08743x);
      var0x.put(class00869.yE, class08743x);
      var0x.put(class00869.yW, class08743x);
      var0x.put(class00869.ym, class08743x);
      var0x.put(class00869.yP, class08743x);
      var0x.put(class00869.ys, class08743x);
      var0x.put(class00869.yT, class08743x);
      var0x.put(class00869.yb, class08743x);
      var0x.put(class00869.yj, class08743x);
      var0x.put(class00869.yv, class08743x);
      var0x.put(class00869.yn, class08743x);
      var0x.put(class00869.yt, class08743x);
      var0x.put(class00869.yG, class08743x);
      var0x.put(class00869.yl, class08743x);
      var0x.put(class00869.yw, class08743x);
      var0x.put(class00869.yk, class08743x);
      var0x.put(class00869.yY, class08743x);
      var0x.put(class00869.yO, class08743x);
      var0x.put(class00869.yQ, class08743x);
      var0x.put(class00869.yg, class08743x);
      var0x.put(class00869.yI, class08743x);
      var0x.put(class00869.yJ, class08743x);
      var0x.put(class00869.yo, class08743x);
      var0x.put(class00869.Ly, class08743x);
      var0x.put(class00869.nx, class08743x);
      var0x.put(class00869.nD, class08743x);
      var0x.put(class00869.Lu, class08743x);
      var0x.put(class00869.Li, class08743x);
      var0x.put(class00869.LR, class08743x);
      var0x.put(class00869.LM, class08743x);
      var0x.put(class00869.LB, class08743x);
      var0x.put(class00869.LZ, class08743x);
      var0x.put(class00869.Lz, class08743x);
      var0x.put(class00869.LU, class08743x);
      var0x.put(class00869.LE, class08743x);
      var0x.put(class00869.LW, class08743x);
      var0x.put(class00869.Lm, class08743x);
      var0x.put(class00869.LP, class08743x);
      var0x.put(class00869.Ls, class08743x);
      var0x.put(class00869.LT, class08743x);
      var0x.put(class00869.Le, class08743x);
      var0x.put(class00869.LH, class08743x);
      var0x.put(class00869.iO, class08743x);
      var0x.put(class00869.ig, class08743x);
      var0x.put(class00869.iI, class08743x);
      var0x.put(class00869.iJ, class08743x);
      var0x.put(class00869.Lc, class08743x);
      var0x.put(class00869.LX, class08743x);
      var0x.put(class00869.La, class08743x);
      var0x.put(class00869.np, class08743x);
      var0x.put(class00869.nF, class08743x);
      var0x.put(class00869.Lh, class08743x);
      var0x.put(class00869.uE, class08743x);
      var0x.put(class00869.uW, class08743x);
      var0x.put(class00869.um, class08743x);
      var0x.put(class00869.ur, class08743x);
      var0x.put(class00869.iW, class08743x);
      var0x.put(class00869.im, class08743x);
      var0x.put(class00869.ij, class08743x);
      var0x.put(class00869.it, class08743x);
      var0x.put(class00869.iH, class08743x);
      var0x.put(class00869.Ru, class08743x);
      var0x.put(class00869.Ri, class08743x);
      var0x.put(class00869.RR, class08743x);
      var0x.put(class00869.RM, class08743x);
      var0x.put(class00869.RB, class08743x);
      var0x.put(class00869.RZ, class08743x);
      var0x.put(class00869.Rz, class08743x);
      var0x.put(class00869.RU, class08743x);
      var0x.put(class00869.sV, class08743x);
      var0x.put(class00869.se, class08743x);
      var0x.put(class00869.RE, class08743x);
      var0x.put(class00869.RW, class08743x);
      var0x.put(class00869.jC, class08743x);
      var0x.put(class00869.jS, class08743x);
      var0x.put(class00869.jD, class08743x);
      var0x.put(class00869.jx, class08743x);
      var0x.put(class00869.jh, class08743x);
      var0x.put(class00869.jr, class08743x);
      var0x.put(class00869.vy, class08743x);
      var0x.put(class00869.vN, class08743x);
      var0x.put(class00869.RK, class08743x);
      var0x.put(class00869.RV, class08743x);
      var0x.put(class00869.Re, class08743x);
      var0x.put(class00869.RH, class08743x);
      var0x.put(class00869.Rc, class08743x);
      var0x.put(class00869.nC, class08743x);
      var0x.put(class00869.nS, class08743x);
      var0x.put(class00869.RX, class08743x);
      var0x.put(class00869.Ra, class08743x);
      var0x.put(class00869.RS, class08743x);
      var0x.put(class00869.MR, class08743x);
      var0x.put(class00869.MB, class08743x);
      var0x.put(class00869.Mb, class08743x);
      var0x.put(class00869.MJ, class08743x);
      var0x.put(class00869.Mq, class08743x);
      var0x.put(class00869.MK, class08743x);
      var0x.put(class00869.MV, class08743x);
      var0x.put(class00869.Me, class08743x);
      var0x.put(class00869.MH, class08743x);
      var0x.put(class00869.Mc, class08743x);
      var0x.put(class00869.MX, class08743x);
      var0x.put(class00869.Ma, class08743x);
      var0x.put(class00869.Mp, class08743x);
      var0x.put(class00869.MF, class08743x);
      var0x.put(class00869.MA, class08743x);
      var0x.put(class00869.Mf, class08743x);
      var0x.put(class00869.nh, class08743x);
      var0x.put(class00869.nr, class08743x);
      var0x.put(class00869.MC, class08743x);
      var0x.put(class00869.MS, class08743x);
      var0x.put(class00869.Mx, class08743x);
      var0x.put(class00869.MD, class08743x);
      var0x.put(class00869.Mh, class08743x);
      var0x.put(class00869.Mr, class08743x);
      var0x.put(class00869.BN, class08743x);
      var0x.put(class00869.By, class08743x);
      var0x.put(class00869.BL, class08743x);
      var0x.put(class00869.Bu, class08743x);
      var0x.put(class00869.Bi, class08743x);
      var0x.put(class00869.BR, class08743x);
      var0x.put(class00869.BM, class08743x);
      var0x.put(class00869.BB, class08743x);
      var0x.put(class00869.BZ, class08743x);
      var0x.put(class00869.no, class08743x);
      var0x.put(class00869.nq, class08743x);
      var0x.put(class00869.Mo, class08743x);
      var0x.put(class00869.Bz, class08743x);
      var0x.put(class00869.BU, class08743x);
      var0x.put(class00869.Ba, class08743x);
      var0x.put(class00869.Bh, class08743x);
      var0x.put(class00869.Zp, class08743x);
      var0x.put(class00869.zt, class08743x);
      var0x.put(class00869.zG, class08743x);
      var0x.put(class00869.zl, class08743x);
      var0x.put(class00869.zd, class08743x);
      var0x.put(class00869.zw, class08743x);
      var0x.put(class00869.zk, class08743x);
      var0x.put(class00869.EM, class08743x);
      var0x.put(class00869.EB, class08743x);
      var0x.put(class00869.EZ, class08743x);
      var0x.put(class00869.Ez, class08743x);
      var0x.put(class00869.EU, class08743x);
      var0x.put(class00869.EE, class08743x);
      var0x.put(class00869.EW, class08743x);
      var0x.put(class00869.Em, class08743x);
      var0x.put(class00869.EP, class08743x);
      var0x.put(class00869.jH, class08743x);
      var0x.put(class00869.jc, class08743x);
      var0x.put(class00869.ja, class08743x);
      var0x.put(class00869.jX, class08743x);
      var0x.put(class00869.jp, class08743x);
      var0x.put(class00869.jF, class08743x);
      var0x.put(class00869.jf, class08743x);
      var0x.put(class00869.jA, class08743x);
      var0x.put(class00869.Es, class08743x);
      var0x.put(class00869.ET, class08743x);
      var0x.put(class00869.Eb, class08743x);
      var0x.put(class00869.LL, class08743x);
      var0x.put(class00869.EG, class08743x);
      var0x.put(class00869.Ed, class08743x);
      var0x.put(class00869.El, class08743x);
      var0x.put(class00869.Ew, class08743x);
      var0x.put(class00869.Wh, class08743x);
      var0x.put(class00869.Wr, class08743x);
      var0x.put(class00869.my, class08743x);
      var0x.put(class00869.mP, class08743x);
      var0x.put(class00869.ms, class08743x);
      var0x.put(class00869.mT, class08743x);
      var0x.put(class00869.mb, class08743x);
      var0x.put(class00869.mj, class08743x);
      var0x.put(class00869.mv, class08743x);
      var0x.put(class00869.mn, class08743x);
      var0x.put(class00869.mt, class08743x);
      var0x.put(class00869.mG, class08743x);
      var0x.put(class00869.ml, class08743x);
      var0x.put(class00869.md, class08743x);
      var0x.put(class00869.mw, class08743x);
      var0x.put(class00869.mk, class08743x);
      var0x.put(class00869.mY, class08743x);
      var0x.put(class00869.mQ, class08743x);
      var0x.put(class00869.mO, class08743x);
      var0x.put(class00869.mg, class08743x);
      var0x.put(class00869.mI, class08743x);
      var0x.put(class00869.mJ, class08743x);
      var0x.put(class00869.mo, class08743x);
      var0x.put(class00869.mq, class08743x);
      var0x.put(class00869.mK, class08743x);
      var0x.put(class00869.mV, class08743x);
      var0x.put(class00869.me, class08743x);
      var0x.put(class00869.mH, class08743x);
      var0x.put(class00869.mc, class08743x);
      var0x.put(class00869.mX, class08743x);
      var0x.put(class00869.ma, class08743x);
      var0x.put(class00869.mp, class08743x);
      var0x.put(class00869.mF, class08743x);
      var0x.put(class00869.mA, class08743x);
      var0x.put(class00869.mC, class08743x);
      var0x.put(class00869.mS, class08743x);
      var0x.put(class00869.mx, class08743x);
      var0x.put(class00869.mD, class08743x);
      var0x.put(class00869.Pa, class08743x);
      var0x.put(class00869.Pr, class08743x);
      var0x.put(class00869.sy, class08743x);
      var0x.put(class00869.sL, class08743x);
      class00869.su.N(var2x -> var0x.put(var2x, class08743x));
      var0x.put(class00869.si, class08743x);
      var0x.put(class00869.sR, class08743x);
      var0x.put(class00869.sM, class08743x);
      var0x.put(class00869.sl, class08743x);
      var0x.put(class00869.sd, class08743x);
      var0x.put(class00869.sw, class08743x);
      var0x.put(class00869.sk, class08743x);
      var0x.put(class00869.ss, class08743x);
      var0x.put(class00869.st, class08743x);
      var0x.put(class00869.sW, class08743x);
      var0x.put(class00869.sY, class08743x);
      var0x.put(class00869.sP, class08743x);
      var0x.put(class00869.TW, class08743x);
      var0x.put(class00869.Tm, class08743x);
      var0x.put(class00869.TP, class08743x);
      var0x.put(class00869.Ts, class08743x);
      var0x.put(class00869.sA, class08743x);
      var0x.put(class00869.sf, class08743x);
      var0x.put(class00869.vp, class08743x);
      var0x.put(class00869.bd, class08743x);
      var0x.put(class00869.bl, class08743x);
      var0x.put(class00869.bG, class08743x);
      var0x.put(class00869.bt, class08743x);
      var0x.put(class00869.vA, class08743x);
      var0x.put(class00869.vf, class08743x);
      var0x.put(class00869.vC, class08743x);
      var0x.put(class00869.vx, class08743x);
      var0x.put(class00869.vS, class08743x);
      var0x.put(class00869.vh, class08743x);
      var0x.put(class00869.vr, class08743x);
      var0x.put(class00869.nN, class08743x);
      var0x.put(class00869.nL, class08743x);
      var0x.put(class00869.nu, class08743x);
      var0x.put(class00869.ni, class08743x);
      var0x.put(class00869.nR, class08743x);
      var0x.put(class00869.bp, class08743x);
      var0x.put(class00869.bF, class08743x);
      var0x.put(class00869.bf, class08743x);
      var0x.put(class00869.bS, class08743x);
      var0x.put(class00869.o, class08743x);
      var0x.put(class00869.nH, class08743x);
      var0x.put(class00869.vL, class08743x);
      var0x.put(class00869.vu, class08743x);
      var0x.put(class00869.vi, class08743x);
      var0x.put(class00869.vR, class08743x);
      var0x.put(class00869.vM, class08743x);
      var0x.put(class00869.vB, class08743x);
      var0x.put(class00869.vZ, class08743x);
      var0x.put(class00869.vz, class08743x);
      var0x.put(class00869.tN, class08743x);
      var0x.put(class00869.iv, class08743x);
      var0x.put(class00869.MO, class08743x);
      class08743 class08743xx = class08743.field_60926;
      var0x.put(class00869.iT, class08743xx);
      var0x.put(class00869.iq, class08743xx);
      var0x.put(class00869.ND, class08743xx);
      var0x.put(class00869.RJ, class08743xx);
      var0x.put(class00869.ic, class08743xx);
      var0x.put(class00869.iX, class08743xx);
      var0x.put(class00869.ia, class08743xx);
      var0x.put(class00869.ip, class08743xx);
      var0x.put(class00869.iF, class08743xx);
      var0x.put(class00869.iA, class08743xx);
      var0x.put(class00869.f_if__1, class08743xx);
      var0x.put(class00869.iC, class08743xx);
      var0x.put(class00869.iS, class08743xx);
      var0x.put(class00869.ix, class08743xx);
      var0x.put(class00869.iD, class08743xx);
      var0x.put(class00869.ih, class08743xx);
      var0x.put(class00869.ir, class08743xx);
      var0x.put(class00869.RN, class08743xx);
      var0x.put(class00869.Lf, class08743xx);
      var0x.put(class00869.Ry, class08743xx);
      var0x.put(class00869.RL, class08743xx);
      var0x.put(class00869.ZT, class08743xx);
      var0x.put(class00869.Zb, class08743xx);
      var0x.put(class00869.Zj, class08743xx);
      var0x.put(class00869.Zv, class08743xx);
      var0x.put(class00869.Zn, class08743xx);
      var0x.put(class00869.Zt, class08743xx);
      var0x.put(class00869.ZG, class08743xx);
      var0x.put(class00869.Zl, class08743xx);
      var0x.put(class00869.Zd, class08743xx);
      var0x.put(class00869.Zw, class08743xx);
      var0x.put(class00869.Zk, class08743xx);
      var0x.put(class00869.ZY, class08743xx);
      var0x.put(class00869.ZQ, class08743xx);
      var0x.put(class00869.ZO, class08743xx);
      var0x.put(class00869.Zg, class08743xx);
      var0x.put(class00869.ZI, class08743xx);
      var0x.put(class00869.Zc, class08743xx);
      var0x.put(class00869.TM, class08743xx);
      var0x.put(class00869.Eg, class08743xx);
      var0x.put(class00869.PN, class08743xx);
      var0x.put(class00869.bX, class08743xx);
   });
   private static Map<class04651, class08743> y = class07536.N(Maps.newHashMap(), var0x -> {
      var0x.put(class04684.y, class08743.field_60926);
      var0x.put(class04684.L, class08743.field_60926);
   });
   private static boolean L;
   private static final class08743[] u = new class08743[BlockRenderType.values().length];

   public static class07311 L(class00500 var0) {
      return N(var0) == class08743.field_60926 ? class05911.U() : class05911.Z();
   }

   public class05885() {
      super();
   }

   static {
      for (int i = 0; i < BlockRenderType.values().length; i++) {
         u[i] = BlockMaterialMapping.convertBlockToRenderType(BlockRenderType.values()[i]);
      }

      N = new Reference2ReferenceOpenHashMap(N);
      y = new Reference2ReferenceOpenHashMap(y);
      N(null);
   }

   public static class07311 y(class00500 var0) {
      class00891 class00891 = var0.i();
      if (class00891 instanceof class07131) {
         return L ? class06851.y() : class06851.N();
      } else {
         class08743 class08743 = N.get(class00891);
         if (class08743 != null) {
            return switch (class08743) {
               case field_60923 -> class06851.N();
               case field_60925 -> class06851.y();
               case field_60926 -> class06851.L();
               case field_60927 -> class06851.P();
            };
         } else {
            return class06851.N();
         }
      }
   }

   public static class08743 N(class00500 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class08743)callbackinforeturnable.getReturnValue();
      } else {
         class00891 class00891 = var0.i();
         if (class00891 instanceof class07131) {
            return L ? class08743.field_60925 : class08743.field_60923;
         } else {
            class08743 class08743 = N.get(class00891);
            return class08743 != null ? class08743 : class08743.field_60923;
         }
      }
   }

   private static void N(CallbackInfo var0) {
      BlockRenderLayerMapImpl.setup(N::put, y::put);
   }

   private static void N(class00500 var0, CallbackInfoReturnable var1) {
      BlockRenderType blockrendertype = (BlockRenderType)WorldRenderingSettings.INSTANCE.getBlockTypeIds().get(var0.i());
      if (blockrendertype != null) {
         var1.setReturnValue(u[blockrendertype.ordinal()]);
      }
   }

   public static class08743 N(class04688 var0) {
      class08743 class08743 = y.get(var0.N());
      return class08743 != null ? class08743 : class08743.field_60923;
   }

   public static void N(boolean var0) {
      L = var0;
   }
}
