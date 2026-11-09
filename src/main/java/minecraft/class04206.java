package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.fabric.impl.item.DefaultItemComponentImpl;
import net.fabricmc.fabric.mixin.registry.sync.BuiltInRegistriesAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04206 implements BuiltInRegistriesAccessor {
   private static final Logger NA = LogUtils.getLogger();
   private static final Map<class01894, Supplier<?>> Nf = Maps.newLinkedHashMap();
   private static final class07099<class07099<?>> NC = new class00731<>(class05946.N(class04227.N), Lifecycle.stable());
   public static final class04241<class01194> N = N(class04227.c, "step", class01194::N);
   public static final class00751<class04891> y = N(class04227.NG, var0 -> class04909.sJ);
   public static final class04241<class04651> L = y(class04227.e, "empty", var0 -> class04684.N);
   public static final class00751<class07084> u = N(class04227.Ni, class07047::N);
   public static final class04241<class00891> i = y(class04227.Z, "air", var0 -> class00869.N);
   public static final class00751<class00455<?>> R = N(class04227.v, class00429::N);
   public static final class04241<class07078<?>> M = y(class04227.I, "pig", var0 -> class07078.Nh);
   public static final class04241<class06581> B = y(class04227.F, "air", var0 -> class06570.N);
   public static final class00751<class06525> Z = N(class04227.NW, class06506::N);
   public static final class00751<class07103<?>> z = N(class04227.NM, var0 -> class07107.y);
   public static final class00751<class00404<?>> U = y(class04227.i, var0 -> class00404.field_11903);
   public static final class00751<class01894> E = N(class04227.s, var0 -> class01235.J);
   public static final class04241<class00549> W = N(class04227.E, "empty", var0 -> class00549.L);
   public static final class00751<class05240<?>> m = N(class04227.Nv, var0 -> class05240.N);
   public static final class00751<class03368<?>> P = N(class04227.Nj, var0 -> class03368.y);
   public static final class00751<class05301<?>> s = N(class04227.NE, var0 -> class05301.N);
   public static final class00751<class05851<?>> T = N(class04227.Nu, var0 -> class05851.field_17329);
   public static final class00751<class05838<?>> b = N(class04227.NT, var0 -> class05838.N);
   public static final class00751<class06514<?>> j = N(class04227.Ns, var0 -> class06514.L);
   public static final class00751<class07468> v = N(class04227.L, class05298::N);
   public static final class00751<class01182<?>> n = N(class04227.NU, var0 -> class01182.N);
   public static final class00751<class06799<?, ?>> t = N(class04227.W, class06789::N);
   public static final class00751<class04922<?>> G = N(class04227.Nd, var0 -> class01235.L);
   public static final class04241<class05660> l = N(class04227.NH, "plains", class05660::N);
   public static final class04241<class05672> d = N(class04227.Ne, "none", class05672::N);
   public static final class00751<class05369> w = N(class04227.NZ, class03927::N);
   public static final class04241<class05378<?>> k = N(class04227.NL, "dummy", var0 -> class05378.N);
   public static final class04241<class05340<?>> Y = N(class04227.Nn, "dummy", var0 -> class05340.N);
   public static final class00751<class05359> Q = N(class04227.y, var0 -> class05359.y);
   public static final class00751<class05950> O = N(class04227.D, var0 -> class03942.y);
   public static final class00751<class05959<?>> g = N(class04227.C, var0 -> class07439.i);
   public static final class00751<class05955> I = N(class04227.f, var0 -> class07693.N);
   public static final class00751<class06341> J = N(class04227.x, var0 -> class06339.y);
   public static final class00751<class04837> o = N(class04227.S, var0 -> class04821.L);
   public static final class00751<class06353> q = N(class04227.h, var0 -> class06332.L);
   public static final class00751<class06061<?>> K = N(class04227.V, var0 -> class06061.N);
   public static final class00751<class02139<?>> V = N(class04227.p, var0 -> class02139.N);
   public static final class00751<class03862<?>> e = N(class04227.X, var0 -> class03862.N);
   public static final class00751<class04054<?>> H = N(class04227.R, var0 -> class04054.U);
   public static final class00751<class02158<?>> c = N(class04227.z, var0 -> class02158.N);
   public static final class00751<class06391<?>> X = N(class04227.K, var0 -> class06391.I);
   public static final class00751<class03549<?>> a = N(class04227.Nk, var0 -> class03549.N);
   public static final class00751<class04878> p = N(class04227.Nw, var0 -> class04878.L);
   public static final class00751<class04367<?>> F = N(class04227.NO, var0 -> class04367.R);
   public static final class00751<class04323<?>> A = N(class04227.NB, var0 -> class04323.R);
   public static final class00751<class01473<?>> f = N(class04227.M, var0 -> class01473.N);
   public static final class00751<class01448<?>> C = N(class04227.H, var0 -> class01448.N);
   public static final class00751<class05312<?>> S = N(class04227.NV, var0 -> class05312.N);
   public static final class00751<class03619<?>> x = N(class04227.Nb, var0 -> class03619.N);
   public static final class00751<class05930<?>> D = N(class04227.NK, var0 -> class05930.y);
   public static final class00751<class05052<?>> h = N(class04227.q, var0 -> class05052.N);
   public static final class00751<MapCodec<? extends class00765>> r = N(class04227.u, class03939::N);
   public static final class00751<MapCodec<? extends class08088>> NN = N(class04227.U, class03924::N);
   public static final class00751<MapCodec<? extends class04017>> Ny = N(class04227.NN, class04017::N);
   public static final class00751<MapCodec<? extends class03028>> NL = N(class04227.Ny, class03028::N);
   public static final class00751<MapCodec<? extends class03877>> Nu = N(class04227.t, class03865::N);
   public static final class00751<MapCodec<? extends class00891>> Ni = N(class04227.B, class03705::N);
   public static final class00751<class05235<?>> NR = N(class04227.NQ, var0 -> class05235.i);
   public static final class00751<class05267<?>> NM = N(class04227.NY, var0 -> class05267.u);
   public static final class00751<MapCodec<? extends class03129>> NB = N(class04227.Nz, class03109::N);
   public static final class00751<class02246> NZ = N(class04227.n, class01944::N);
   public static final class00751<class06911> Nz = N(class04227.P, class03771::N);
   public static final class00751<class06583<?>> NU = N(class04227.yd, class06912::N);
   public static final class00751<class01757<?>> NE = N(class04227.NR, class01787::N);
   public static final class00751<class02477<?>> NW = N(class04227.b, class02484::N);
   public static final class00751<class06839<?>> Nm = N(class04227.j, class07305::N);
   public static final class00751<MapCodec<? extends class03622>> NP = N(class04227.g, class03631::N);
   public static final class00751<class02487<?>> Ns = N(class04227.T, class02482::N);
   public static final class00751<class02195> NT = N(class04227.r, class00831::N);
   public static final class00751<class02477<?>> Nb = N(class04227.d, class02523::N);
   public static final class00751<MapCodec<? extends class02546>> Nj = N(class04227.k, class02546::N);
   public static final class00751<MapCodec<? extends class02560>> Nv = N(class04227.w, class02560::N);
   public static final class00751<MapCodec<? extends class02548>> Nn = N(class04227.Y, class02548::y);
   public static final class00751<MapCodec<? extends class02536>> Nt = N(class04227.O, class02536::N);
   public static final class00751<MapCodec<? extends class02530>> NG = N(class04227.Q, class02561::N);
   public static final class00751<class08217<?>> Nl = N(class04227.m, var0 -> class08217.N);
   public static final class00751<class00273<?>> Nd = N(class04227.NP, class00293::N);
   public static final class00751<class00319<?>> Nw = N(class04227.Nt, class00301::N);
   public static final class00751<class00305> Nk = N(class04227.Nm, class06222::N);
   public static final class00751<class01624> NY = N(class04227.Nq, var0 -> class01624.P);
   public static final class00751<class07945<?, ?>> NQ = N(class04227.Nc, class07925::N);
   public static final class00751<class07940<?, ?>> NO = N(class04227.NX, var0 -> class07908.N);
   public static final class00751<MapCodec<? extends class00225>> Ng = N(class04227.NI, class00225::N);
   public static final class00751<MapCodec<? extends class00201>> NI = N(class04227.No, class00201::N);
   public static final class00751<MapCodec<? extends class08568>> NJ = N(class04227.Nl, class08587::N);
   public static final class00751<MapCodec<? extends class09037>> No = N(class04227.l, class09028::N);
   public static final class00751<MapCodec<? extends class08752>> Nq = N(class04227.Ng, class08747::N);
   public static final class00751<MapCodec<? extends class09015>> NK = N(class04227.a, class09018::N);
   public static final class00751<MapCodec<? extends class09034>> NV = N(class04227.G, class09003::N);
   public static final class00751<MapCodec<? extends class08159>> Ne = N(class04227.Na, class08183::N);
   public static final class00751<MapCodec<? extends class08164>> NH = N(class04227.Np, class08171::N);
   public static final class00751<class00607<?>> Nc = N(class04227.J, class00608::N);
   public static final class00751<class06750<?>> NX = N(class04227.o, class00588::N);
   public static final class00751<MapCodec<? extends class06834>> Na = N(class04227.A, class06848::N);
   public static final class00751<Consumer<class05523>> Np = N(class04227.NJ, class00229::N);
   public static final class00751<? extends class00751<?>> NF = NC;
   private static boolean NS;

   private static void L(class00751<?> var0) {
      ((class00731)var0).P();
   }

   public class04206() {
      super();
   }

   private static void u() {
      N(null);
      NF.W();

      for (class00751 class00751 : NF) {
         L(class00751);
         class00751.W();
      }
   }

   private static void y(CallbackInfo var0) {
      if (NS) {
         var0.cancel();
      }

      NS = true;
   }

   private static <T> class00751<T> y(class05946<? extends class00751<T>> var0, class04238<T> var1) {
      return N(var0, new class00731<>(var0, Lifecycle.stable(), true), var1);
   }

   private static <T extends class00751<?>> void y(class00751<T> var0) {
      var0.forEach(var1 -> {
         if (var1.M().isEmpty()) {
            class07536.y("Registry '" + var0.y(var1) + "' was empty after loading");
         }

         if (var1 instanceof class04241) {
            class01894 class01894 = ((class04241)var1).y();
            Objects.requireNonNull(var1.N(class01894), "Missing default of DefaultedMappedRegistry: " + class01894);
         }
      });
   }

   public static void y() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      y(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         Nf.forEach((var0x, var1) -> {
            if (var1.get() == null) {
               NA.error("Unable to bootstrap registry '{}'", var0x);
            }
         });
      }
   }

   private static <T> class04241<T> y(class05946<? extends class00751<T>> var0, String var1, class04238<T> var2) {
      return N(var0, new class07219<>(var1, var0, Lifecycle.stable(), true), var2);
   }

   public static void N() {
      y();
      u();
      y(NF);
   }

   public static <T> class02055<T> N(class00751<T> var0) {
      return ((class07099)var0).s();
   }

   private static <T> class04241<T> N(class05946<? extends class00751<T>> var0, String var1, class04238<T> var2) {
      return N(var0, new class07219<>(var1, var0, Lifecycle.stable(), false), var2);
   }

   private static void N(CallbackInfo var0) {
      DefaultItemComponentImpl.modifyItemComponents();
   }

   private static <T, R extends class07099<T>> R N(class05946<? extends class00751<T>> var0, R var1, class04238<T> var2) {
      class03914.N(() -> "registry " + var0.N());
      class01894 class01894 = var0.N();
      Nf.put(class01894, () -> var2.run(var1));
      NC.N(var0, var1, class02819.N);
      return (R)var1;
   }

   private static <T> class00751<T> N(class05946<? extends class00751<T>> var0, class04238<T> var1) {
      return N(var0, new class00731<>(var0, Lifecycle.stable(), false), var1);
   }
}
