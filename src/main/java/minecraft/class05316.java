package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.IdentityHashMap;
import java.util.Map;
import net.fabricmc.fabric.mixin.object.builder.DefaultAttributesAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05316 implements DefaultAttributesAccessor {
   private static final Logger N = LogUtils.getLogger();
   private static Map<class07078<? extends class07438>, class05308> y = ImmutableMap.builder()
      .put(class07078.i, class03630.M().N())
      .put(class07078.M, class03811.B().N())
      .put(class07078.B, class00681.N().N())
      .put(class07078.z, class05538.n().N())
      .put(class07078.W, class07632.M().N())
      .put(class07078.m, class04626.No().N())
      .put(class07078.T, class07530.M().N())
      .put(class07078.j, class02839.M().N())
      .put(class07078.l, class07617.t().N())
      .put(class07078.t, class02976.ND().N())
      .put(class07078.G, class02976.ND().N())
      .put(class07078.d, class07534.M().N())
      .put(class07078.Q, class07628.B().N())
      .put(class07078.O, class07629.M().N())
      .put(class07078.g, class08982.M().N())
      .put(class07078.J, class08583.B().N())
      .put(class07078.o, class00245.M().N())
      .put(class07078.q, class07550.M().N())
      .put(class07078.e, class07618.W().N())
      .put(class07078.H, class07877.W().N())
      .put(class07078.X, class07541.M().N())
      .put(class07078.p, class07520.M().N())
      .put(class07078.F, class07525.M().N())
      .put(class07078.A, class07560.M().N())
      .put(class07078.f, class00690.B().N())
      .put(class07078.x, class07538.B().N())
      .put(class07078.v, class04508.M().N())
      .put(class07078.Ni, class06165.B().N())
      .put(class07078.NR, class04067.v().N())
      .put(class07078.NB, class07523.Z().N())
      .put(class07078.NZ, class00032.B().N())
      .put(class07078.Nz, class07557.M().N())
      .put(class07078.NE, class05574.B().N())
      .put(class07078.NW, class02148.W().N())
      .put(class07078.Nm, class07549.W().N())
      .put(class07078.NP, class06018.B().N())
      .put(class07078.NT, class07862.NK().N())
      .put(class07078.Nb, class08004.l().N())
      .put(class07078.Nj, class07149.B().N())
      .put(class07078.Nn, class07625.M().N())
      .put(class07078.NQ, class00683.Nr().N())
      .put(class07078.Ng, class07140.M().N())
      .put(class07078.No, class07438.method_26827().N())
      .put(class07078.NV, class08583.B().N())
      .put(class07078.Ne, class07877.W().N())
      .put(class07078.NH, class08157.B().N())
      .put(class07078.Na, class06129.W().N())
      .put(class07078.NC, class07637.w().N())
      .put(class07078.NS, class06824.M().N())
      .put(class07078.Nx, class07654.B().N())
      .put(class07078.ND, class07150.Y().N())
      .put(class07078.Nh, class07627.B().N())
      .put(class07078.Nr, class01489.M().N())
      .put(class07078.yN, class01266.M().N())
      .put(class07078.yy, class07178.B().N())
      .put(class07078.Ly, class08036.method_26956().N())
      .put(class07078.yL, class07869.m().N())
      .put(class07078.yR, class07629.M().N())
      .put(class07078.yM, class07879.W().N())
      .put(class07078.yB, class07153.M().N())
      .put(class07078.yZ, class07629.M().N())
      .put(class07078.yz, class07881.B().N())
      .put(class07078.yU, class07144.M().N())
      .put(class07078.yW, class07147.M().N())
      .put(class07078.ym, class07528.m().N())
      .put(class07078.yP, class00682.W().N())
      .put(class07078.ys, class07150.Y().N())
      .put(class07078.yb, class01964.B().N())
      .put(class07078.yv, class07888.M().N())
      .put(class07078.yG, class07141.B().N())
      .put(class07078.yw, class07883.B().N())
      .put(class07078.yk, class07528.m().N())
      .put(class07078.yY, class01377.m().N())
      .put(class07078.yQ, class04096.v().N())
      .put(class07078.yJ, class00683.Nr().N())
      .put(class07078.yq, class07629.M().N())
      .put(class07078.yK, class07872.m().N())
      .put(class07078.yV, class08042.M().N())
      .put(class07078.ye, class08041.B().N())
      .put(class07078.yH, class08011.B().N())
      .put(class07078.yX, class04003.B().N())
      .put(class07078.yc, class07079.H().N())
      .put(class07078.yp, class08047.B().N())
      .put(class07078.yF, class00680.B().N())
      .put(class07078.yA, class07528.m().N())
      .put(class07078.yC, class07894.v().N())
      .put(class07078.yS, class05292.M().N())
      .put(class07078.yx, class08004.l().N())
      .put(class07078.yD, class00673.W().N())
      .put(class07078.yh, class08187.I().N())
      .put(class07078.yr, class08004.l().N())
      .put(class07078.LN, class07182.v().N())
      .build();

   public class05316() {
      super();
   }

   public static boolean y(class07078<?> var0) {
      return y.containsKey(var0);
   }

   public static void N() {
      class04206.M
         .j()
         .filter(var0 -> var0.i() != class07428.field_17715)
         .filter(var0 -> !y((class07078<?>)var0))
         .map(class04206.M::y)
         .forEach(var0 -> class07536.y("Entity " + var0 + " has no attributes"));
   }

   private static void N(CallbackInfo var0) {
      y = new IdentityHashMap<>(y);
   }

   public static class05308 N(class07078<? extends class07438> var0) {
      return y.get(var0);
   }
}
