package minecraft;

import Nursultan.class10234;
import com.mojang.datafixers.util.Pair;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl;
import net.fabricmc.fabric.mixin.itemgroup.CreativeModeTabAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03771 {
   private static final class01894 s = class06911.N("inventory");
   private static final class01894 T = class06911.N("item_search");
   public static final class05946<class06911> N = N("building_blocks");
   public static final class05946<class06911> y = N("colored_blocks");
   public static final class05946<class06911> L = N("natural_blocks");
   public static final class05946<class06911> u = N("functional_blocks");
   public static final class05946<class06911> i = N("redstone_blocks");
   public static final class05946<class06911> R = N("hotbar");
   public static final class05946<class06911> M = N("search");
   public static final class05946<class06911> B = N("tools_and_utilities");
   public static final class05946<class06911> Z = N("combat");
   public static final class05946<class06911> z = N("food_and_drinks");
   public static final class05946<class06911> U = N("ingredients");
   public static final class05946<class06911> E = N("spawn_eggs");
   public static final class05946<class06911> W = N("op_blocks");
   public static final class05946<class06911> m = N("inventory");
   private static final Comparator<class03556<class00693>> b = Comparator.comparing(
      class03556::N, Comparator.<class00693>comparingInt(class00693::N).thenComparing(class00693::y)
   );
   @Nullable
   public static class06945 P;
   private static final int j = 10;
   private static ProtocolVersion v;
   private static int n;

   public static List<class06911> L() {
      return R().filter(class06911::Z).toList();
   }

   private static void L(class06934 var0, class06908 var1) {
      int ix = class06587.N.length;

      for (int jx = 0; jx < ix; jx++) {
         byte b0 = class06587.N[jx];
         class06584 class06584 = new class06584(class06570.GJ);
         class06584.N(class02484.NT, new class02813(b0, List.of()));
         var0.method_45417(class06584, var1);
      }
   }

   public class03771() {
      super();
   }

   public static class06911 i() {
      return class04206.Nz.B(M);
   }

   public static List<class06911> u() {
      return R().toList();
   }

   private static void y(CallbackInfo var0) {
      List list = List.of(N, y, L, u, i, R, M, B, Z, z, U, E, W, m);
      int ix = 0;
      Comparator comparator = (var0x, var1x) -> {
         int k = Boolean.compare(((class06911)var0x.N()).Z(), ((class06911)var1x.N()).Z());
         return k != 0 ? -k : N(var0x.B().N(), var1x.B().N());
      };

      for (class03529 class03529 : class04206.Nz.z().sorted(comparator).toList()) {
         class06911 var7 = (class06911)class03529.N();
         FabricItemGroupImpl fabricitemgroupimpl = var7;
         if (list.contains(class03529.B())) {
            fabricitemgroupimpl.fabric_setPage(0);
         } else {
            CreativeModeTabAccessor creativemodetabaccessor = var7;
            fabricitemgroupimpl.fabric_setPage(ix / 10 + 1);
            int jx = ix % 10;
            class06909 class06909 = jx < 5 ? class06909.field_41049 : class06909.field_41050;
            creativemodetabaccessor.setRow(class06909);
            creativemodetabaccessor.setColumn(class06909 == class06909.field_41049 ? jx % 10 : (jx - 5) % 10);
            ix++;
         }
      }

      HashMap hashmap = new HashMap();

      for (class05946<class06911> class05946 : class04206.Nz.B()) {
         class06911 class06911 = class04206.Nz.B(class05946);
         FabricItemGroupImpl fabricitemgroupimpl1 = class06911;
         String s1 = class06911.N().getString();
         class10234 class10234 = new class10234(class06911.M(), class06911.R(), fabricitemgroupimpl1.fabric_getPage());
         String sx = hashmap.put(class10234, s1);
         if (sx != null) {
            throw new IllegalArgumentException("Duplicate position: (%s) for item groups %s vs %s".formatted(class10234, s1, sx));
         }
      }
   }

   public static class06911 y() {
      return class04206.Nz.B(N);
   }

   private static void y(class06934 var0, class06908 var1) {
      for (int ix = 0; ix <= 4; ix++) {
         class06584 class06584 = new class06584(class06570.YY);
         class06584.N(class02484.NU, new class08213(ix));
         var0.method_45417(class06584, var1);
      }
   }

   private static void y(class06934 var0, class01905<class07304> var1, class06908 var2) {
      var1.z()
         .flatMap(
            var0x -> IntStream.rangeClosed(((class07304)var0x.N()).u(), ((class07304)var0x.N()).i())
               .mapToObj(var1x -> class07323.N(new class07317(var0x, var1x)))
         )
         .forEach(var2x -> var0.method_45417(var2x, var2));
   }

   private static void N(CallbackInfo var0) {
      var0.cancel();
   }

   private static int N(class01894 var0, class01894 var1) {
      int ix = var0.y().compareTo(var1.y());
      return ix != 0 ? ix : var0.N().compareTo(var1.N());
   }

   private static void N(class03767 var0, boolean var1, class01929 var2, CallbackInfoReturnable var3) {
      if (v != ProtocolTranslator.getTargetVersion() || n != GeneralSettings.INSTANCE.removeNotAvailableItemsFromCreativeTab.getIndex()) {
         v = ProtocolTranslator.getTargetVersion();
         n = GeneralSettings.INSTANCE.removeNotAvailableItemsFromCreativeTab.getIndex();
         P = new class06945(var0, var1, var2);
         N(P);
         var3.setReturnValue(true);
      }
   }

   public static boolean N(class03767 var0, boolean var1, class01929 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else if (P != null && !P.N(var0, var1, var2)) {
         return false;
      } else {
         P = new class06945(var0, var1, var2);
         N(P);
         return true;
      }
   }

   private static void N(class06945 var0) {
      R().filter(var0x -> var0x.U() == class06936.field_41052).forEach(var1 -> var1.N(var0));
      R().filter(var0x -> var0x.U() != class06936.field_41052).forEach(var1 -> var1.N(var0));
      y(null);
   }

   private static void N(class06934 var0, class01929 var1, class01921<class00693> var2, Predicate<class03556<class00693>> var3, class06908 var4) {
      class03519 class03519 = var1.N(class07713.N);
      var2.z().filter(var3).sorted(b).forEach(var2x -> {
         class06584 class06584 = new class06584(class06570.bK);
         class06584.N(class02484.NC, (class03556<class00693>)var2x);
         var0.method_45417(class06584, var4);
      });
   }

   private static void N(class06934 var0, class06908 var1) {
      List<class04107> list = class04107.u();
      Set<class06584> set = class03778.N();

      for (class04107 class04107 : list) {
         class06584 class06584 = new class06584(class06570.dk);
         class06584.N(class02484.NN, class04107.L());
         set.add(class06584);
      }

      var0.N(set, var1);
   }

   private static class05946<class06911> N(String var0) {
      return class05946.N(class04227.P, class01894.y(var0));
   }

   public static class06911 N(class00751<class06911> var0) {
      class00751.N(
         var0,
         N,
         class06911.N(class06909.field_41049, 0)
            .method_47321(class00392.L("itemGroup.buildingBlocks"))
            .method_47320(() -> new class06584(class00869.Lv))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.yg);
               var1.N(class06570.Ls);
               var1.N(class06570.yA);
               var1.N(class06570.Lu);
               var1.N(class06570.V);
               var1.N(class06570.BE);
               var1.N(class06570.iU);
               var1.N(class06570.RJ);
               var1.N(class06570.PY);
               var1.N(class06570.mH);
               var1.N(class06570.PB);
               var1.N(class06570.mw);
               var1.N(class06570.mz);
               var1.N(class06570.yI);
               var1.N(class06570.LT);
               var1.N(class06570.yf);
               var1.N(class06570.Li);
               var1.N(class06570.e);
               var1.N(class06570.BW);
               var1.N(class06570.iE);
               var1.N(class06570.Ro);
               var1.N(class06570.PQ);
               var1.N(class06570.mc);
               var1.N(class06570.PZ);
               var1.N(class06570.mk);
               var1.N(class06570.mU);
               var1.N(class06570.yJ);
               var1.N(class06570.Lb);
               var1.N(class06570.yC);
               var1.N(class06570.LR);
               var1.N(class06570.H);
               var1.N(class06570.Bm);
               var1.N(class06570.iW);
               var1.N(class06570.Rq);
               var1.N(class06570.PO);
               var1.N(class06570.mX);
               var1.N(class06570.Pz);
               var1.N(class06570.mY);
               var1.N(class06570.mE);
               var1.N(class06570.yo);
               var1.N(class06570.Lj);
               var1.N(class06570.yS);
               var1.N(class06570.LM);
               var1.N(class06570.c);
               var1.N(class06570.BP);
               var1.N(class06570.im);
               var1.N(class06570.RK);
               var1.N(class06570.Pg);
               var1.N(class06570.ma);
               var1.N(class06570.PU);
               var1.N(class06570.mQ);
               var1.N(class06570.mW);
               var1.N(class06570.yq);
               var1.N(class06570.Lv);
               var1.N(class06570.yx);
               var1.N(class06570.LB);
               var1.N(class06570.X);
               var1.N(class06570.Bs);
               var1.N(class06570.iP);
               var1.N(class06570.RV);
               var1.N(class06570.PI);
               var1.N(class06570.mp);
               var1.N(class06570.PE);
               var1.N(class06570.mO);
               var1.N(class06570.mm);
               var1.N(class06570.ye);
               var1.N(class06570.LG);
               var1.N(class06570.yh);
               var1.N(class06570.Lz);
               var1.N(class06570.p);
               var1.N(class06570.Bb);
               var1.N(class06570.iT);
               var1.N(class06570.RH);
               var1.N(class06570.Po);
               var1.N(class06570.mA);
               var1.N(class06570.Pm);
               var1.N(class06570.mI);
               var1.N(class06570.ms);
               var1.N(class06570.yH);
               var1.N(class06570.Ll);
               var1.N(class06570.LN);
               var1.N(class06570.LE);
               var1.N(class06570.A);
               var1.N(class06570.Bv);
               var1.N(class06570.ij);
               var1.N(class06570.RX);
               var1.N(class06570.PK);
               var1.N(class06570.mC);
               var1.N(class06570.Ps);
               var1.N(class06570.mo);
               var1.N(class06570.mb);
               var1.N(class06570.yK);
               var1.N(class06570.Ln);
               var1.N(class06570.yD);
               var1.N(class06570.LZ);
               var1.N(class06570.a);
               var1.N(class06570.BT);
               var1.N(class06570.is);
               var1.N(class06570.Re);
               var1.N(class06570.PJ);
               var1.N(class06570.mF);
               var1.N(class06570.PW);
               var1.N(class06570.mg);
               var1.N(class06570.mP);
               var1.N(class06570.yV);
               var1.N(class06570.Lt);
               var1.N(class06570.yr);
               var1.N(class06570.LU);
               var1.N(class06570.F);
               var1.N(class06570.Bj);
               var1.N(class06570.ib);
               var1.N(class06570.Rc);
               var1.N(class06570.Pq);
               var1.N(class06570.mf);
               var1.N(class06570.PP);
               var1.N(class06570.mJ);
               var1.N(class06570.mT);
               var1.N(class06570.yF);
               var1.N(class06570.LP);
               var1.N(class06570.f);
               var1.N(class06570.x);
               var1.N(class06570.Bn);
               var1.N(class06570.Bt);
               var1.N(class06570.iv);
               var1.N(class06570.in);
               var1.N(class06570.Ra);
               var1.N(class06570.PV);
               var1.N(class06570.mS);
               var1.N(class06570.PT);
               var1.N(class06570.mq);
               var1.N(class06570.mj);
               var1.N(class06570.ya);
               var1.N(class06570.Ld);
               var1.N(class06570.Ly);
               var1.N(class06570.LW);
               var1.N(class06570.C);
               var1.N(class06570.BG);
               var1.N(class06570.it);
               var1.N(class06570.Rp);
               var1.N(class06570.Pe);
               var1.N(class06570.mx);
               var1.N(class06570.Pb);
               var1.N(class06570.mK);
               var1.N(class06570.mv);
               var1.N(class06570.yp);
               var1.N(class06570.Lw);
               var1.N(class06570.LL);
               var1.N(class06570.Lm);
               var1.N(class06570.S);
               var1.N(class06570.Bl);
               var1.N(class06570.iG);
               var1.N(class06570.RF);
               var1.N(class06570.PH);
               var1.N(class06570.mD);
               var1.N(class06570.Pj);
               var1.N(class06570.mV);
               var1.N(class06570.mn);
               var1.N(class06570.y);
               var1.N(class06570.ED);
               var1.N(class06570.il);
               var1.N(class06570.mt);
               var1.N(class06570.mB);
               var1.N(class06570.K);
               var1.N(class06570.Rd);
               var1.N(class06570.iQ);
               var1.N(class06570.Bk);
               var1.N(class06570.RZ);
               var1.N(class06570.ES);
               var1.N(class06570.Wm);
               var1.N(class06570.BY);
               var1.N(class06570.iF);
               var1.N(class06570.id);
               var1.N(class06570.ME);
               var1.N(class06570.Mm);
               var1.N(class06570.Mp);
               var1.N(class06570.ig);
               var1.N(class06570.Bo);
               var1.N(class06570.MP);
               var1.N(class06570.MW);
               var1.N(class06570.Ef);
               var1.N(class06570.WE);
               var1.N(class06570.BI);
               var1.N(class06570.L);
               var1.N(class06570.WN);
               var1.N(class06570.Wb);
               var1.N(class06570.BJ);
               var1.N(class06570.u);
               var1.N(class06570.EF);
               var1.N(class06570.Wz);
               var1.N(class06570.i);
               var1.N(class06570.Wi);
               var1.N(class06570.Wt);
               var1.N(class06570.BX);
               var1.N(class06570.R);
               var1.N(class06570.EC);
               var1.N(class06570.WW);
               var1.N(class06570.M);
               var1.N(class06570.Wy);
               var1.N(class06570.Wj);
               var1.N(class06570.BV);
               var1.N(class06570.B);
               var1.N(class06570.Wu);
               var1.N(class06570.Wn);
               var1.N(class06570.Z);
               var1.N(class06570.z);
               var1.N(class06570.WR);
               var1.N(class06570.WG);
               var1.N(class06570.BA);
               var1.N(class06570.Mt);
               var1.N(class06570.U);
               var1.N(class06570.WM);
               var1.N(class06570.Wl);
               var1.N(class06570.Bf);
               var1.N(class06570.Mb);
               var1.N(class06570.Mj);
               var1.N(class06570.WB);
               var1.N(class06570.Wd);
               var1.N(class06570.BC);
               var1.N(class06570.Mv);
               var1.N(class06570.Mn);
               var1.N(class06570.WZ);
               var1.N(class06570.Ww);
               var1.N(class06570.BS);
               var1.N(class06570.MG);
               var1.N(class06570.W);
               var1.N(class06570.P);
               var1.N(class06570.m);
               var1.N(class06570.s);
               var1.N(class06570.T);
               var1.N(class06570.b);
               var1.N(class06570.v);
               var1.N(class06570.j);
               var1.N(class06570.n);
               var1.N(class06570.t);
               var1.N(class06570.l);
               var1.N(class06570.G);
               var1.N(class06570.d);
               var1.N(class06570.w);
               var1.N(class06570.iA);
               var1.N(class06570.Ma);
               var1.N(class06570.iO);
               var1.N(class06570.BQ);
               var1.N(class06570.Ms);
               var1.N(class06570.MT);
               var1.N(class06570.MF);
               var1.N(class06570.iI);
               var1.N(class06570.Bq);
               var1.N(class06570.MV);
               var1.N(class06570.Me);
               var1.N(class06570.MH);
               var1.N(class06570.Mc);
               var1.N(class06570.MX);
               var1.N(class06570.Lp);
               var1.N(class06570.BZ);
               var1.N(class06570.iw);
               var1.N(class06570.BH);
               var1.N(class06570.LF);
               var1.N(class06570.ip);
               var1.N(class06570.Eh);
               var1.N(class06570.Ws);
               var1.N(class06570.LA);
               var1.N(class06570.ik);
               var1.N(class06570.zK);
               var1.N(class06570.zH);
               var1.N(class06570.iq);
               var1.N(class06570.Bg);
               var1.N(class06570.zV);
               var1.N(class06570.ia);
               var1.N(class06570.EA);
               var1.N(class06570.WU);
               var1.N(class06570.ze);
               var1.N(class06570.iK);
               var1.N(class06570.zq);
               var1.N(class06570.zQ);
               var1.N(class06570.zI);
               var1.N(class06570.ie);
               var1.N(class06570.BO);
               var1.N(class06570.zO);
               var1.N(class06570.zJ);
               var1.N(class06570.iH);
               var1.N(class06570.zg);
               var1.N(class06570.zo);
               var1.N(class06570.ic);
               var1.N(class06570.RS);
               var1.N(class06570.MC);
               var1.N(class06570.MS);
               var1.N(class06570.Mh);
               var1.N(class06570.iJ);
               var1.N(class06570.BK);
               var1.N(class06570.MD);
               var1.N(class06570.Mx);
               var1.N(class06570.zA);
               var1.N(class06570.WL);
               var1.N(class06570.Wv);
               var1.N(class06570.Be);
               var1.N(class06570.Rh);
               var1.N(class06570.MN);
               var1.N(class06570.Rr);
               var1.N(class06570.wW);
               var1.N(class06570.ws);
               var1.N(class06570.wP);
               var1.N(class06570.wm);
               var1.N(class06570.Ba);
               var1.N(class06570.wv);
               var1.N(class06570.wT);
               var1.N(class06570.wj);
               var1.N(class06570.wb);
               var1.N(class06570.Bp);
               var1.N(class06570.mG);
               var1.N(class06570.mZ);
               var1.N(class06570.wn);
               var1.N(class06570.wl);
               var1.N(class06570.wG);
               var1.N(class06570.wt);
               var1.N(class06570.BF);
               var1.N(class06570.BR);
               var1.N(class06570.BM);
               var1.N(class06570.Ex);
               var1.N(class06570.WP);
               var1.N(class06570.Bc);
               var1.N(class06570.RP);
               var1.N(class06570.Rs);
               var1.N(class06570.RT);
               var1.N(class06570.iV);
               var1.N(class06570.NI);
               var1.N(class06570.NH);
               var1.N(class06570.Mk);
               var1.N(class06570.me);
               var1.N(class06570.PM);
               var1.N(class06570.md);
               var1.N(class06570.MQ);
               var1.N(class06570.NX);
               var1.N(class06570.ml);
               var1.N(class06570.WO);
               var1.N(class06570.BU);
               var1.N(class06570.La);
               var1.N(class06570.Na);
               var1.N(class06570.Np);
               var1.N(class06570.ZN);
               var1.N(class06570.Zu);
               var1.N(class06570.io);
               var1.N(class06570.Br);
               var1.N(class06570.Zy);
               var1.N(class06570.ZL);
               var1.N(class06570.iX);
               var1.N(class06570.Er);
               var1.N(class06570.WT);
               var1.N(class06570.NV);
               var1.N(class06570.Nc);
               var1.N(class06570.NC);
               var1.N(class06570.kF);
               var1.N(class06570.Nh);
               var1.N(class06570.yL);
               var1.N(class06570.yM);
               var1.N(class06570.MY.y());
               var1.N(class06570.mh);
               var1.N(class06570.Pv);
               var1.N(class06570.kr);
               var1.N(class06570.MO.y());
               var1.N(class06570.NF);
               var1.N(class06570.NS);
               var1.N(class06570.kA);
               var1.N(class06570.Nr);
               var1.N(class06570.yu);
               var1.N(class06570.yB);
               var1.N(class06570.MY.L());
               var1.N(class06570.mr);
               var1.N(class06570.Pn);
               var1.N(class06570.YN);
               var1.N(class06570.MO.L());
               var1.N(class06570.NA);
               var1.N(class06570.Nx);
               var1.N(class06570.kf);
               var1.N(class06570.yN);
               var1.N(class06570.yi);
               var1.N(class06570.yZ);
               var1.N(class06570.MY.u());
               var1.N(class06570.PN);
               var1.N(class06570.Pt);
               var1.N(class06570.Yy);
               var1.N(class06570.MO.u());
               var1.N(class06570.Nf);
               var1.N(class06570.ND);
               var1.N(class06570.kC);
               var1.N(class06570.yy);
               var1.N(class06570.yR);
               var1.N(class06570.yz);
               var1.N(class06570.MY.i());
               var1.N(class06570.Py);
               var1.N(class06570.PG);
               var1.N(class06570.YL);
               var1.N(class06570.MO.i());
               var1.N(class06570.yU);
               var1.N(class06570.yP);
               var1.N(class06570.kS);
               var1.N(class06570.yj);
               var1.N(class06570.yG);
               var1.N(class06570.yk);
               var1.N(class06570.MY.R());
               var1.N(class06570.PL);
               var1.N(class06570.Pl);
               var1.N(class06570.Yu);
               var1.N(class06570.MO.R());
               var1.N(class06570.yE);
               var1.N(class06570.ys);
               var1.N(class06570.kx);
               var1.N(class06570.yv);
               var1.N(class06570.yl);
               var1.N(class06570.yY);
               var1.N(class06570.MY.M());
               var1.N(class06570.Pu);
               var1.N(class06570.Pd);
               var1.N(class06570.Yi);
               var1.N(class06570.MO.M());
               var1.N(class06570.yW);
               var1.N(class06570.yT);
               var1.N(class06570.kD);
               var1.N(class06570.yn);
               var1.N(class06570.yd);
               var1.N(class06570.yQ);
               var1.N(class06570.MY.B());
               var1.N(class06570.Pi);
               var1.N(class06570.Pw);
               var1.N(class06570.YR);
               var1.N(class06570.MO.B());
               var1.N(class06570.ym);
               var1.N(class06570.yb);
               var1.N(class06570.kh);
               var1.N(class06570.yt);
               var1.N(class06570.yw);
               var1.N(class06570.yO);
               var1.N(class06570.MY.Z());
               var1.N(class06570.PR);
               var1.N(class06570.Pk);
               var1.N(class06570.YM);
               var1.N(class06570.MO.Z());
            })
            .method_47324()
      );
      class00751.N(
         var0,
         y,
         class06911.N(class06909.field_41049, 1)
            .method_47321(class00392.L("itemGroup.coloredBlocks"))
            .method_47320(() -> new class06584(class00869.yf))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.uR);
               var1.N(class06570.um);
               var1.N(class06570.uW);
               var1.N(class06570.un);
               var1.N(class06570.ub);
               var1.N(class06570.uv);
               var1.N(class06570.uM);
               var1.N(class06570.uz);
               var1.N(class06570.uU);
               var1.N(class06570.uj);
               var1.N(class06570.uP);
               var1.N(class06570.uZ);
               var1.N(class06570.uT);
               var1.N(class06570.us);
               var1.N(class06570.uB);
               var1.N(class06570.uE);
               var1.N(class06570.Zl);
               var1.N(class06570.ZI);
               var1.N(class06570.Zg);
               var1.N(class06570.ZH);
               var1.N(class06570.ZK);
               var1.N(class06570.Ze);
               var1.N(class06570.Zd);
               var1.N(class06570.ZY);
               var1.N(class06570.ZQ);
               var1.N(class06570.ZV);
               var1.N(class06570.ZJ);
               var1.N(class06570.Zk);
               var1.N(class06570.Zq);
               var1.N(class06570.Zo);
               var1.N(class06570.Zw);
               var1.N(class06570.ZO);
               var1.N(class06570.Zc);
               var1.N(class06570.Zi);
               var1.N(class06570.ZW);
               var1.N(class06570.ZE);
               var1.N(class06570.Zv);
               var1.N(class06570.ZT);
               var1.N(class06570.Zj);
               var1.N(class06570.ZR);
               var1.N(class06570.ZZ);
               var1.N(class06570.Zz);
               var1.N(class06570.Zb);
               var1.N(class06570.Zm);
               var1.N(class06570.ZB);
               var1.N(class06570.Zs);
               var1.N(class06570.ZP);
               var1.N(class06570.ZM);
               var1.N(class06570.ZU);
               var1.N(class06570.UQ);
               var1.N(class06570.UV);
               var1.N(class06570.UK);
               var1.N(class06570.UF);
               var1.N(class06570.UX);
               var1.N(class06570.Up);
               var1.N(class06570.UO);
               var1.N(class06570.UJ);
               var1.N(class06570.Uo);
               var1.N(class06570.Ua);
               var1.N(class06570.Ue);
               var1.N(class06570.UI);
               var1.N(class06570.Uc);
               var1.N(class06570.UH);
               var1.N(class06570.Ug);
               var1.N(class06570.Uq);
               var1.N(class06570.UA);
               var1.N(class06570.EN);
               var1.N(class06570.Ur);
               var1.N(class06570.EB);
               var1.N(class06570.Ei);
               var1.N(class06570.EM);
               var1.N(class06570.Uf);
               var1.N(class06570.Ux);
               var1.N(class06570.UD);
               var1.N(class06570.ER);
               var1.N(class06570.Ey);
               var1.N(class06570.US);
               var1.N(class06570.Eu);
               var1.N(class06570.EL);
               var1.N(class06570.UC);
               var1.N(class06570.Uh);
               var1.N(class06570.UW);
               var1.N(class06570.Un);
               var1.N(class06570.Uv);
               var1.N(class06570.UY);
               var1.N(class06570.Ud);
               var1.N(class06570.Uk);
               var1.N(class06570.Um);
               var1.N(class06570.UT);
               var1.N(class06570.Ub);
               var1.N(class06570.Uw);
               var1.N(class06570.Ut);
               var1.N(class06570.Us);
               var1.N(class06570.Ul);
               var1.N(class06570.UG);
               var1.N(class06570.UP);
               var1.N(class06570.Uj);
               var1.N(class06570.Lc);
               var1.N(class06570.LX);
               var1.N(class06570.Zx);
               var1.N(class06570.zi);
               var1.N(class06570.zu);
               var1.N(class06570.zE);
               var1.N(class06570.zZ);
               var1.N(class06570.zU);
               var1.N(class06570.ZD);
               var1.N(class06570.zN);
               var1.N(class06570.zy);
               var1.N(class06570.zz);
               var1.N(class06570.zR);
               var1.N(class06570.Zr);
               var1.N(class06570.zB);
               var1.N(class06570.zM);
               var1.N(class06570.Zh);
               var1.N(class06570.zL);
               var1.N(class06570.Mg);
               var1.N(class06570.zW);
               var1.N(class06570.zn);
               var1.N(class06570.zv);
               var1.N(class06570.zY);
               var1.N(class06570.zd);
               var1.N(class06570.zk);
               var1.N(class06570.zm);
               var1.N(class06570.zT);
               var1.N(class06570.zb);
               var1.N(class06570.zw);
               var1.N(class06570.zt);
               var1.N(class06570.zs);
               var1.N(class06570.zl);
               var1.N(class06570.zG);
               var1.N(class06570.zP);
               var1.N(class06570.zj);
               var1.N(class06570.zS);
               var1.N(class06570.zx);
               var1.N(class06570.Ui);
               var1.N(class06570.Uu);
               var1.N(class06570.UE);
               var1.N(class06570.UZ);
               var1.N(class06570.UU);
               var1.N(class06570.zD);
               var1.N(class06570.UN);
               var1.N(class06570.Uy);
               var1.N(class06570.Uz);
               var1.N(class06570.UR);
               var1.N(class06570.zr);
               var1.N(class06570.UB);
               var1.N(class06570.UM);
               var1.N(class06570.zh);
               var1.N(class06570.UL);
               var1.N(class06570.vJ);
               var1.N(class06570.vX);
               var1.N(class06570.vc);
               var1.N(class06570.vS);
               var1.N(class06570.vA);
               var1.N(class06570.vC);
               var1.N(class06570.vo);
               var1.N(class06570.vV);
               var1.N(class06570.ve);
               var1.N(class06570.vf);
               var1.N(class06570.va);
               var1.N(class06570.vK);
               var1.N(class06570.vF);
               var1.N(class06570.vp);
               var1.N(class06570.vq);
               var1.N(class06570.vH);
               var1.N(class06570.ww);
               var1.N(class06570.wk);
               var1.N(class06570.wq);
               var1.N(class06570.wo);
               var1.N(class06570.wa);
               var1.N(class06570.wH);
               var1.N(class06570.wX);
               var1.N(class06570.wY);
               var1.N(class06570.wg);
               var1.N(class06570.wI);
               var1.N(class06570.wc);
               var1.N(class06570.wK);
               var1.N(class06570.wO);
               var1.N(class06570.we);
               var1.N(class06570.wV);
               var1.N(class06570.wQ);
               var1.N(class06570.wJ);
               var1.N(class06570.li);
               var1.N(class06570.lW);
               var1.N(class06570.lE);
               var1.N(class06570.lv);
               var1.N(class06570.lT);
               var1.N(class06570.lj);
               var1.N(class06570.lR);
               var1.N(class06570.lZ);
               var1.N(class06570.lz);
               var1.N(class06570.lb);
               var1.N(class06570.lm);
               var1.N(class06570.lB);
               var1.N(class06570.ls);
               var1.N(class06570.lP);
               var1.N(class06570.lM);
               var1.N(class06570.lU);
            })
            .method_47324()
      );
      class00751.N(
         var0,
         L,
         class06911.N(class06909.field_41049, 2)
            .method_47321(class00392.L("itemGroup.natural"))
            .method_47320(() -> new class06584(class00869.Z))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.Y);
               var1.N(class06570.g);
               var1.N(class06570.MA);
               var1.N(class06570.Za);
               var1.N(class06570.Q);
               var1.N(class06570.O);
               var1.N(class06570.I);
               var1.N(class06570.Rt);
               var1.N(class06570.J);
               var1.N(class06570.Rg);
               var1.N(class06570.NE);
               var1.N(class06570.NB);
               var1.N(class06570.Lp);
               var1.N(class06570.NU);
               var1.N(class06570.zK);
               var1.N(class06570.Rk);
               var1.N(class06570.ZX);
               var1.N(class06570.Ea);
               var1.N(class06570.RY);
               var1.N(class06570.Rw);
               var1.N(class06570.iL);
               var1.N(class06570.iy);
               var1.N(class06570.iR);
               var1.N(class06570.iu);
               var1.N(class06570.ii);
               var1.N(class06570.y);
               var1.N(class06570.Z);
               var1.N(class06570.L);
               var1.N(class06570.i);
               var1.N(class06570.M);
               var1.N(class06570.E);
               var1.N(class06570.W);
               var1.N(class06570.k);
               var1.N(class06570.wC);
               var1.N(class06570.zQ);
               var1.N(class06570.za);
               var1.N(class06570.Rz);
               var1.N(class06570.wE);
               var1.N(class06570.RS);
               var1.N(class06570.o);
               var1.N(class06570.q);
               var1.N(class06570.Rx);
               var1.N(class06570.RD);
               var1.N(class06570.zf);
               var1.N(class06570.wW);
               var1.N(class06570.Rh);
               var1.N(class06570.MN);
               var1.N(class06570.BR);
               var1.N(class06570.NW);
               var1.N(class06570.Nm);
               var1.N(class06570.NP);
               var1.N(class06570.Ns);
               var1.N(class06570.NT);
               var1.N(class06570.Nb);
               var1.N(class06570.Nj);
               var1.N(class06570.Nv);
               var1.N(class06570.Nn);
               var1.N(class06570.Nt);
               var1.N(class06570.NG);
               var1.N(class06570.Nl);
               var1.N(class06570.Nd);
               var1.N(class06570.Nw);
               var1.N(class06570.Nk);
               var1.N(class06570.NY);
               var1.N(class06570.NQ);
               var1.N(class06570.NO);
               var1.N(class06570.Ng);
               var1.N(class06570.NJ);
               var1.N(class06570.No);
               var1.N(class06570.Nq);
               var1.N(class06570.Mu);
               var1.N(class06570.NV);
               var1.N(class06570.Ne);
               var1.N(class06570.wp);
               var1.N(class06570.wF);
               var1.N(class06570.wA);
               var1.N(class06570.wf);
               var1.N(class06570.yg);
               var1.N(class06570.yI);
               var1.N(class06570.yJ);
               var1.N(class06570.yo);
               var1.N(class06570.yq);
               var1.N(class06570.ye);
               var1.N(class06570.yH);
               var1.N(class06570.yc);
               var1.N(class06570.yX);
               var1.N(class06570.yK);
               var1.N(class06570.yV);
               var1.N(class06570.Mw);
               var1.N(class06570.ya);
               var1.N(class06570.yp);
               var1.N(class06570.Lk);
               var1.N(class06570.LY);
               var1.N(class06570.LQ);
               var1.N(class06570.LO);
               var1.N(class06570.Lg);
               var1.N(class06570.LJ);
               var1.N(class06570.Lq);
               var1.N(class06570.LI);
               var1.N(class06570.Lo);
               var1.N(class06570.LK);
               var1.N(class06570.LV);
               var1.N(class06570.Ml);
               var1.N(class06570.Md);
               var1.N(class06570.zp);
               var1.N(class06570.zF);
               var1.N(class06570.wi);
               var1.N(class06570.D);
               var1.N(class06570.h);
               var1.N(class06570.r);
               var1.N(class06570.NN);
               var1.N(class06570.Ny);
               var1.N(class06570.Nu);
               var1.N(class06570.NR);
               var1.N(class06570.NL);
               var1.N(class06570.Ni);
               var1.N(class06570.LD);
               var1.N(class06570.Lh);
               var1.N(class06570.uc);
               var1.N(class06570.uX);
               var1.N(class06570.ua);
               var1.N(class06570.up);
               var1.N(class06570.LC);
               var1.N(class06570.LS);
               var1.N(class06570.uy);
               var1.N(class06570.Lx);
               var1.N(class06570.Lr);
               var1.N(class06570.ut);
               var1.N(class06570.ud);
               var1.N(class06570.uw);
               var1.N(class06570.uk);
               var1.N(class06570.uY);
               var1.N(class06570.uQ);
               var1.N(class06570.uO);
               var1.N(class06570.ug);
               var1.N(class06570.uI);
               var1.N(class06570.uJ);
               var1.N(class06570.uo);
               var1.N(class06570.uq);
               var1.N(class06570.uV);
               var1.N(class06570.RO);
               var1.N(class06570.ul);
               var1.N(class06570.uG);
               var1.N(class06570.uK);
               var1.N(class06570.uh);
               var1.N(class06570.ur);
               var1.N(class06570.iN);
               var1.N(class06570.uH);
               var1.N(class06570.uN);
               var1.N(class06570.iz);
               var1.N(class06570.ux);
               var1.N(class06570.RQ);
               var1.N(class06570.uF);
               var1.N(class06570.uA);
               var1.N(class06570.uf);
               var1.N(class06570.uC);
               var1.N(class06570.uS);
               var1.N(class06570.MJ);
               var1.N(class06570.ZC);
               var1.N(class06570.ZS);
               var1.N(class06570.uL);
               var1.N(class06570.Zp);
               var1.N(class06570.ZF);
               var1.N(class06570.ZA);
               var1.N(class06570.Zf);
               var1.N(class06570.ue);
               var1.N(class06570.iB);
               var1.N(class06570.iZ);
               var1.N(class06570.RW);
               var1.N(class06570.Rm);
               var1.N(class06570.Mo);
               var1.N(class06570.iM);
               var1.N(class06570.wh);
               var1.N(class06570.EZ);
               var1.N(class06570.Ez);
               var1.N(class06570.EU);
               var1.N(class06570.by);
               var1.N(class06570.vE);
               var1.N(class06570.nL);
               var1.N(class06570.nu);
               var1.N(class06570.lk);
               var1.N(class06570.ll);
               var1.N(class06570.ld);
               var1.N(class06570.wy);
               var1.N(class06570.wN);
               var1.N(class06570.nm);
               var1.N(class06570.Mf);
               var1.N(class06570.uu);
               var1.N(class06570.ui);
               var1.N(class06570.uD);
               var1.N(class06570.jw);
               var1.N(class06570.ET);
               var1.N(class06570.Eb);
               var1.N(class06570.Ej);
               var1.N(class06570.Ev);
               var1.N(class06570.En);
               var1.N(class06570.EE);
               var1.N(class06570.EW);
               var1.N(class06570.Em);
               var1.N(class06570.EP);
               var1.N(class06570.Es);
               var1.N(class06570.Et);
               var1.N(class06570.EG);
               var1.N(class06570.El);
               var1.N(class06570.Ed);
               var1.N(class06570.Ew);
               var1.N(class06570.Eg);
               var1.N(class06570.Ek);
               var1.N(class06570.EY);
               var1.N(class06570.EQ);
               var1.N(class06570.EO);
               var1.N(class06570.EI);
               var1.N(class06570.EJ);
               var1.N(class06570.Eo);
               var1.N(class06570.Eq);
               var1.N(class06570.EK);
               var1.N(class06570.EV);
               var1.N(class06570.Ee);
               var1.N(class06570.EH);
               var1.N(class06570.Ec);
               var1.N(class06570.EX);
               var1.N(class06570.Le);
               var1.N(class06570.LH);
               var1.N(class06570.MI);
               var1.N(class06570.RA);
               var1.N(class06570.Rf);
               var1.N(class06570.RC);
               var1.N(class06570.ZG);
               var1.N(class06570.wM);
               var1.N(class06570.wz);
               var1.N(class06570.Wq);
               var1.N(class06570.WK);
               var1.N(class06570.MK);
               var1.N(class06570.wS);
               var1.N(class06570.wx);
               var1.N(class06570.wD);
               var1.N(class06570.Mr);
               var1.N(class06570.BN);
               var1.N(class06570.By);
               var1.N(class06570.BL);
               var1.N(class06570.mN);
               var1.N(class06570.Lf);
               var1.N(class06570.NM);
            })
            .method_47324()
      );
      class00751.N(
         var0,
         u,
         class06911.N(class06909.field_41049, 3)
            .method_47321(class00392.L("itemGroup.functional"))
            .method_47320(() -> new class06584(class06570.bH))
            .method_47317(
               (var0x, var1) -> {
                  var1.N(class06570.RU);
                  var1.N(class06570.My);
                  var1.N(class06570.ML);
                  var1.N(class06570.WQ);
                  var1.N(class06570.dD);
                  var1.N(class06570.dh);
                  class06570.dr.N(var1::N);
                  var1.N(class06570.MQ);
                  class06570.MO.N(var1::N);
                  var1.N(class06570.RE);
                  var1.N(class06570.zq);
                  var1.N(class06570.mR);
                  var1.N(class06570.kr);
                  var1.N(class06570.YN);
                  var1.N(class06570.Yy);
                  var1.N(class06570.YL);
                  var1.N(class06570.Yu);
                  var1.N(class06570.Yi);
                  var1.N(class06570.YR);
                  var1.N(class06570.YM);
                  var1.N(class06570.Mu);
                  var1.N(class06570.wi);
                  var1.N(class06570.wS);
                  var1.N(class06570.wx);
                  var1.N(class06570.wD);
                  var1.N(class06570.wE);
                  var1.N(class06570.Mo);
                  var1.N(class06570.za);
                  var1.N(class06570.Rn);
                  var1.N(class06570.dS);
                  var1.N(class06570.dF);
                  var1.N(class06570.dA);
                  var1.N(class06570.dC);
                  var1.N(class06570.df);
                  var1.N(class06570.dY);
                  var1.N(class06570.RG);
                  var1.N(class06570.da);
                  var1.N(class06570.dp);
                  var1.N(class06570.wL);
                  var1.N(class06570.wu);
                  var1.N(class06570.Bx);
                  var1.N(class06570.BD);
                  var1.N(class06570.Bh);
                  var1.N(class06570.dc);
                  var1.N(class06570.mM);
                  var1.N(class06570.RI);
                  var1.N(class06570.Bu);
                  var1.N(class06570.ln);
                  var1.N(class06570.nn);
                  var1.N(class06570.nt);
                  var1.N(class06570.dx);
                  var1.N(class06570.Bw);
                  var1.N(class06570.Ep);
                  var1.N(class06570.wU);
                  var1.N(class06570.Rl);
                  var1.N(class06570.Wk);
                  var1.N(class06570.wM);
                  var1.N(class06570.wB);
                  var1.N(class06570.NZ);
                  var1.N(class06570.Nz);
                  var1.N(class06570.WF);
                  var1.N(class06570.WA);
                  var1.N(class06570.Wf);
                  var1.N(class06570.WC);
                  var1.N(class06570.WS);
                  var1.N(class06570.Wx);
                  var1.N(class06570.WD);
                  var1.N(class06570.Wh);
                  var1.N(class06570.GT);
                  var1.N(class06570.RB);
                  var1.N(class06570.GA);
                  var1.N(class06570.GP);
                  var1.N(class06570.Gs);
                  var1.N(class06570.bK);
                  var0x.L()
                     .method_46759(class04227.ym)
                     .ifPresent(var2 -> N(var1, var0x.L(), (class01921<class00693>)var2, var0xxx -> var0xxx.N(class04446.N), class06908.field_40191));
                  var1.N(class06570.RR);
                  var1.N(class06570.RM);
                  var1.N(class06570.Ry);
                  var1.N(class06570.Ru);
                  var1.N(class06570.iS);
                  var1.N(class06570.ir);
                  var1.N(class06570.f_if__1);
                  var1.N(class06570.ih);
                  var1.N(class06570.RN);
                  var1.N(class06570.ix);
                  var1.N(class06570.RL);
                  var1.N(class06570.iC);
                  var1.N(class06570.iD);
                  var1.N(class06570.Ri);
                  var1.N(class06570.WX);
                  var1.N(class06570.LX);
                  var1.N(class06570.bH);
                  var1.N(class06570.bh);
                  var1.N(class06570.bc);
                  var1.N(class06570.br);
                  var1.N(class06570.bX);
                  var1.N(class06570.jN);
                  var1.N(class06570.ba);
                  var1.N(class06570.jy);
                  var1.N(class06570.bp);
                  var1.N(class06570.jL);
                  var1.N(class06570.bA);
                  var1.N(class06570.ji);
                  var1.N(class06570.bC);
                  var1.N(class06570.jM);
                  var1.N(class06570.bF);
                  var1.N(class06570.ju);
                  var1.N(class06570.bf);
                  var1.N(class06570.jR);
                  var1.N(class06570.bS);
                  var1.N(class06570.jB);
                  var1.N(class06570.bx);
                  var1.N(class06570.jZ);
                  var1.N(class06570.bD);
                  var1.N(class06570.jz);
                  var1.N(class06570.Rv);
                  var1.N(class06570.YB);
                  var1.N(class06570.YZ);
                  var1.N(class06570.Yz);
                  var1.N(class06570.YU);
                  var1.N(class06570.YE);
                  var1.N(class06570.YW);
                  var1.N(class06570.Ym);
                  var1.N(class06570.YP);
                  var1.N(class06570.dX);
                  var1.N(class06570.Bz);
                  var1.N(class06570.zS);
                  var1.N(class06570.zx);
                  var1.N(class06570.Ui);
                  var1.N(class06570.Uu);
                  var1.N(class06570.UE);
                  var1.N(class06570.UZ);
                  var1.N(class06570.UU);
                  var1.N(class06570.zD);
                  var1.N(class06570.UN);
                  var1.N(class06570.Uy);
                  var1.N(class06570.Uz);
                  var1.N(class06570.UR);
                  var1.N(class06570.zr);
                  var1.N(class06570.UB);
                  var1.N(class06570.UM);
                  var1.N(class06570.zh);
                  var1.N(class06570.UL);
                  var1.N(class06570.wd);
                  var1.N(class06570.vJ);
                  var1.N(class06570.vX);
                  var1.N(class06570.vc);
                  var1.N(class06570.vS);
                  var1.N(class06570.vA);
                  var1.N(class06570.vC);
                  var1.N(class06570.vo);
                  var1.N(class06570.vV);
                  var1.N(class06570.ve);
                  var1.N(class06570.vf);
                  var1.N(class06570.va);
                  var1.N(class06570.vK);
                  var1.N(class06570.vF);
                  var1.N(class06570.vp);
                  var1.N(class06570.vq);
                  var1.N(class06570.vH);
                  var1.N(class06570.ww);
                  var1.N(class06570.wk);
                  var1.N(class06570.wq);
                  var1.N(class06570.wo);
                  var1.N(class06570.wa);
                  var1.N(class06570.wH);
                  var1.N(class06570.wX);
                  var1.N(class06570.wY);
                  var1.N(class06570.wg);
                  var1.N(class06570.wI);
                  var1.N(class06570.wc);
                  var1.N(class06570.wK);
                  var1.N(class06570.wO);
                  var1.N(class06570.we);
                  var1.N(class06570.wV);
                  var1.N(class06570.wQ);
                  var1.N(class06570.wJ);
                  var1.N(class06570.li);
                  var1.N(class06570.lW);
                  var1.N(class06570.lE);
                  var1.N(class06570.lv);
                  var1.N(class06570.lT);
                  var1.N(class06570.lj);
                  var1.N(class06570.lR);
                  var1.N(class06570.lZ);
                  var1.N(class06570.lz);
                  var1.N(class06570.lb);
                  var1.N(class06570.lm);
                  var1.N(class06570.lB);
                  var1.N(class06570.ls);
                  var1.N(class06570.lP);
                  var1.N(class06570.lM);
                  var1.N(class06570.lU);
                  var1.N(class04877.N(var0x.L().y(class04227.NF)));
                  var1.N(class06570.Gl);
                  var1.N(class06570.Gd);
                  var1.N(class06570.Gw);
                  var1.N(class06570.Gk);
                  var1.N(class06570.GY);
                  var1.N(class06570.GO);
                  var1.N(class06570.GQ);
                  var1.N(class06570.BB);
                  var1.N(class06570.Bi);
                  var1.N(class06570.Yk);
                  var1.N(class06570.nG);
                  var1.N(class06570.Ys);
                  var1.N(class06570.YT);
                  var1.N(class06570.Yb);
                  var1.N(class06570.Yj);
                  var1.N(class06570.Yv);
                  var1.N(class06570.Yn);
                  var1.N(class06570.Yt);
                  var1.N(class06570.YG);
                  var1.N(class06570.Mi);
                  var1.N(class06570.MR);
                  var1.N(class06570.MM);
                  var1.N(class06570.MB);
                  var1.N(class06570.MZ);
                  var1.N(class06570.Mz);
                  var1.N(class06570.MU);
               }
            )
            .method_47324()
      );
      class00751.N(
         var0,
         i,
         class06911.N(class06909.field_41049, 4)
            .method_47321(class00392.L("itemGroup.redstone"))
            .method_47320(() -> new class06584(class06570.WY))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.WY);
               var1.N(class06570.WQ);
               var1.N(class06570.WO);
               var1.N(class06570.Wg);
               var1.N(class06570.WI);
               var1.N(class06570.Wa);
               var1.N(class06570.Yu);
               var1.N(class06570.Yi);
               var1.N(class06570.YR);
               var1.N(class06570.YM);
               var1.N(class06570.Wp);
               var1.N(class06570.mz);
               var1.N(class06570.mB);
               var1.N(class06570.mw);
               var1.N(class06570.mt);
               var1.N(class06570.ml);
               var1.N(class06570.md);
               var1.N(class06570.mN);
               var1.N(class06570.my);
               var1.N(class06570.BL);
               var1.N(class06570.NV);
               var1.N(class06570.uR);
               var1.N(class06570.mL);
               var1.N(class06570.Th);
               var1.N(class06570.WX);
               var1.N(class06570.Wr);
               var1.N(class06570.WS);
               var1.N(class06570.WJ);
               var1.N(class06570.Wo);
               var1.N(class06570.Wq);
               var1.N(class06570.WK);
               var1.N(class06570.WH);
               var1.N(class06570.Wc);
               var1.N(class06570.vD);
               var1.N(class06570.We);
               var1.N(class06570.Rv);
               var1.N(class06570.YE);
               var1.N(class06570.dX);
               var1.N(class06570.RM);
               var1.N(class06570.Ry);
               var1.N(class06570.RG);
               var1.N(class06570.mu);
               var1.N(class06570.RI);
               var1.N(class06570.RB);
               var1.N(class06570.WV);
               var1.N(class06570.mM);
               var1.N(class06570.dc);
               var1.N(class06570.nt);
               var1.N(class06570.Pa);
               var1.N(class06570.Pc);
               var1.N(class06570.PX);
               var1.N(class06570.Pp);
               var1.N(class06570.sZ);
               var1.N(class06570.sW);
               var1.N(class06570.sz);
               var1.N(class06570.sU);
               var1.N(class06570.sE);
               var1.N(class06570.sj);
               var1.N(class06570.sV);
               var1.N(class06570.mH);
               var1.N(class06570.me);
               var1.N(class06570.PY);
               var1.N(class06570.PB);
               var1.N(class06570.PM);
               var1.N(class06570.mi);
               var1.N(class06570.mR);
               var1.N(class06570.dx);
               var1.N(class06570.iB);
               var1.N(class06570.GA);
               var1.N(class06570.Nn);
            })
            .method_47324()
      );
      class00751.N(
         var0,
         R,
         class06911.N(class06909.field_41049, 5)
            .method_47321(class00392.L("itemGroup.hotbar"))
            .method_47320(() -> new class06584(class00869.Lt))
            .method_47315()
            .method_47318(class06936.field_41054)
            .method_47324()
      );
      class00751.N(
         var0,
         M,
         class06911.N(class06909.field_41049, 6)
            .method_47321(class00392.L("itemGroup.search"))
            .method_47320(() -> new class06584(class06570.jJ))
            .method_47317((var1, var2) -> {
               Set<class06584> set = class03778.N();

               for (class06911 class06911 : var0) {
                  if (class06911.U() != class06936.field_41055) {
                     set.addAll(class06911.W());
                  }
               }

               var2.N(set);
            })
            .method_47319(T)
            .method_47315()
            .method_47318(class06936.field_41055)
            .method_47324()
      );
      class00751.N(
         var0,
         B,
         class06911.N(class06909.field_41050, 0)
            .method_47321(class00392.L("itemGroup.tools"))
            .method_47320(() -> new class06584(class06570.TX))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.TP);
               var1.N(class06570.Ts);
               var1.N(class06570.TT);
               var1.N(class06570.Tb);
               var1.N(class06570.Td);
               var1.N(class06570.Tw);
               var1.N(class06570.Tk);
               var1.N(class06570.TY);
               var1.N(class06570.Tv);
               var1.N(class06570.Tn);
               var1.N(class06570.Tt);
               var1.N(class06570.TG);
               var1.N(class06570.Tq);
               var1.N(class06570.TK);
               var1.N(class06570.TV);
               var1.N(class06570.Te);
               var1.N(class06570.TO);
               var1.N(class06570.Tg);
               var1.N(class06570.TI);
               var1.N(class06570.TJ);
               var1.N(class06570.Tc);
               var1.N(class06570.TX);
               var1.N(class06570.Ta);
               var1.N(class06570.Tp);
               var1.N(class06570.TA);
               var1.N(class06570.Tf);
               var1.N(class06570.TC);
               var1.N(class06570.TS);
               var1.N(class06570.jU);
               var1.N(class06570.jE);
               var1.N(class06570.jv);
               var1.N(class06570.jj);
               var1.N(class06570.jn);
               var1.N(class06570.jb);
               var1.N(class06570.jt);
               var1.N(class06570.jG);
               var1.N(class06570.jW);
               var1.N(class06570.jm);
               var1.N(class06570.jT);
               var1.N(class06570.jr);
               var1.N(class06570.sf);
               var1.N(class06570.GZ);
               var1.N(class06570.vQ);
               var1.N(class06570.vr);
               var1.N(class06570.kN);
               var1.N(class06570.lN);
               var1.N(class06570.Gr);
               var1.N(class06570.jq);
               var1.N(class06570.jK);
               var1.N(class06570.jF);
               var1.N(class06570.jp);
               var1.N(class06570.jh);
               var1.N(class06570.jS);
               var1.N(class06570.jD);
               var1.N(class06570.jV);
               var1.N(class06570.jc);
               var1.N(class06570.jX);
               var1.N(class06570.jx);
               var1.N(class06570.jA);
               var1.N(class06570.jH);
               var1.N(class06570.jC);
               var1.N(class06570.jf);
               var1.N(class06570.je);
               var1.N(class06570.ja);
               var1.N(class06570.jJ);
               var1.N(class06570.jo);
               var1.N(class06570.vN);
               var1.N(class06570.vy);
               var1.N(class06570.Gt);
               var1.N(class06570.GU);
               var1.N(class06570.Gz);
               var1.N(class06570.nz);
               var1.N(class06570.nG);
               var1.N(class06570.sT);
               L(var1, class06908.field_40191);
               var1.N(class06570.PF);
               var1.N(class06570.PA);
               var1.N(class06570.sN);
               var1.N(class06570.Pr);
               var1.N(class06570.sB);
               var1.N(class06570.si);
               var1.N(class06570.sM);
               var1.N(class06570.Pf);
               var1.N(class06570.Px);
               var1.N(class06570.PD);
               var1.N(class06570.sR);
               var1.N(class06570.sy);
               var1.N(class06570.PS);
               var1.N(class06570.su);
               var1.N(class06570.sL);
               var1.N(class06570.PC);
               var1.N(class06570.Ph);
               var1.N(class06570.sm);
               var1.N(class06570.sP);
               var1.N(class06570.sb);
               var1.N(class06570.sj);
               var1.N(class06570.sv);
               var1.N(class06570.sn);
               var1.N(class06570.st);
               var1.N(class06570.sG);
               var1.N(class06570.sl);
               var1.N(class06570.sd);
               var1.N(class06570.sw);
               var1.N(class06570.sk);
               var1.N(class06570.sO);
               var1.N(class06570.sg);
               var1.N(class06570.so);
               var1.N(class06570.sq);
               var1.N(class06570.sY);
               var1.N(class06570.sQ);
               var1.N(class06570.sI);
               var1.N(class06570.sJ);
               var1.N(class06570.sK);
               var1.N(class06570.sV);
               var1.N(class06570.Pa);
               var1.N(class06570.Pc);
               var1.N(class06570.PX);
               var1.N(class06570.Pp);
               var1.N(class06570.sZ);
               var1.N(class06570.sW);
               var1.N(class06570.sz);
               var1.N(class06570.sU);
               var1.N(class06570.sE);
               var0x.L().method_46759(class04227.yZ).ifPresent(var1x -> N(var1, var1x, class06570.dH, class04456.L, class06908.field_40191));
               var1.N(class06570.lS);
               var1.N(class06570.lx);
               var1.N(class06570.lD);
               var1.N(class06570.lh);
               var1.N(class06570.dy);
               var1.N(class06570.du);
               var1.N(class06570.di);
               var1.N(class06570.dR);
               var1.N(class06570.dM);
               var1.N(class06570.dB);
               var1.N(class06570.dZ);
               var1.N(class06570.dN);
               var1.N(class06570.dz);
               var1.N(class06570.lr);
               var1.N(class06570.dP);
               var1.N(class06570.dU);
               var1.N(class06570.dE);
               var1.N(class06570.dW);
               var1.N(class06570.dm);
               var1.N(class06570.ds);
               var1.N(class06570.dL);
            })
            .method_47324()
      );
      class00751.N(
         var0,
         Z,
         class06911.N(class06909.field_41050, 1)
            .method_47321(class00392.L("itemGroup.combat"))
            .method_47320(() -> new class06584(class06570.TF))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.Tm);
               var1.N(class06570.Tl);
               var1.N(class06570.Tj);
               var1.N(class06570.To);
               var1.N(class06570.TQ);
               var1.N(class06570.TH);
               var1.N(class06570.TF);
               var1.N(class06570.lq);
               var1.N(class06570.lK);
               var1.N(class06570.lV);
               var1.N(class06570.le);
               var1.N(class06570.lH);
               var1.N(class06570.lc);
               var1.N(class06570.lX);
               var1.N(class06570.TT);
               var1.N(class06570.Tk);
               var1.N(class06570.Tt);
               var1.N(class06570.TV);
               var1.N(class06570.TI);
               var1.N(class06570.Ta);
               var1.N(class06570.TC);
               var1.N(class06570.db);
               var1.N(class06570.Gm);
               var1.N(class06570.lo);
               var1.N(class06570.bi);
               var1.N(class06570.bR);
               var1.N(class06570.bM);
               var1.N(class06570.bB);
               var1.N(class06570.bZ);
               var1.N(class06570.bz);
               var1.N(class06570.bU);
               var1.N(class06570.bE);
               var1.N(class06570.bW);
               var1.N(class06570.bm);
               var1.N(class06570.bP);
               var1.N(class06570.bs);
               var1.N(class06570.bT);
               var1.N(class06570.bb);
               var1.N(class06570.bj);
               var1.N(class06570.bv);
               var1.N(class06570.bd);
               var1.N(class06570.bw);
               var1.N(class06570.bk);
               var1.N(class06570.bY);
               var1.N(class06570.bn);
               var1.N(class06570.bt);
               var1.N(class06570.bG);
               var1.N(class06570.bl);
               var1.N(class06570.bQ);
               var1.N(class06570.bO);
               var1.N(class06570.bg);
               var1.N(class06570.bI);
               var1.N(class06570.sa);
               var1.N(class06570.Gh);
               var1.N(class06570.Gf);
               var1.N(class06570.GC);
               var1.N(class06570.GS);
               var1.N(class06570.Gx);
               var1.N(class06570.GD);
               var1.N(class06570.sA);
               var1.N(class06570.dl);
               var1.N(class06570.dv);
               var1.N(class06570.dn);
               var1.N(class06570.dt);
               var1.N(class06570.dG);
               var1.N(class06570.la);
               var1.N(class06570.mi);
               var1.N(class06570.ln);
               var1.N(class06570.jP);
               var1.N(class06570.jO);
               var1.N(class06570.jI);
               var1.N(class06570.jg);
               var1.N(class06570.Gz);
               var1.N(class06570.sx);
               var1.N(class06570.dw);
               L(var1, class06908.field_40191);
               var1.N(class06570.sD);
               var1.N(class06570.lg);
               var0x.L().method_46759(class04227.NW).ifPresent(var2 -> N(var1, var2, class06570.lI, class06908.field_40191, var0x.N()));
            })
            .method_47324()
      );
      class00751.N(
         var0,
         z,
         class06911.N(class06909.field_41050, 2)
            .method_47321(class00392.L("itemGroup.foodAndDrink"))
            .method_47320(() -> new class06584(class06570.bV))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.sS);
               var1.N(class06570.bV);
               var1.N(class06570.be);
               var1.N(class06570.nN);
               var1.N(class06570.wN);
               var1.N(class06570.wy);
               var1.N(class06570.lt);
               var1.N(class06570.Gb);
               var1.N(class06570.GG);
               var1.N(class06570.Gj);
               var1.N(class06570.Gv);
               var1.N(class06570.Gn);
               var1.N(class06570.lw);
               var1.N(class06570.ny);
               var1.N(class06570.ni);
               var1.N(class06570.nR);
               var1.N(class06570.bo);
               var1.N(class06570.bq);
               var1.N(class06570.lL);
               var1.N(class06570.lu);
               var1.N(class06570.nM);
               var1.N(class06570.nB);
               var1.N(class06570.Gc);
               var1.N(class06570.GX);
               var1.N(class06570.vu);
               var1.N(class06570.vB);
               var1.N(class06570.vi);
               var1.N(class06570.vZ);
               var1.N(class06570.vR);
               var1.N(class06570.vM);
               var1.N(class06570.bu);
               var1.N(class06570.vx);
               var1.N(class06570.vI);
               var1.N(class06570.GI);
               var1.N(class06570.nZ);
               var1.N(class06570.nT);
               var1.N(class06570.TD);
               var1.N(class06570.lY);
               var1.N(class06570.Ga);
               N(var1, class06908.field_40191);
               var1.N(class06570.jT);
               var1.N(class06570.wZ);
               y(var1, class06908.field_40191);
               var0x.L().method_46759(class04227.NW).ifPresent(var2 -> {
                  N(var1, var2, class06570.ns, class06908.field_40191, var0x.N());
                  N(var1, var2, class06570.lO, class06908.field_40191, var0x.N());
                  N(var1, var2, class06570.lJ, class06908.field_40191, var0x.N());
               });
            })
            .method_47324()
      );
      class00751.N(
         var0,
         U,
         class06911.N(class06909.field_41050, 3)
            .method_47321(class00392.L("itemGroup.ingredients"))
            .method_47320(() -> new class06584(class06570.TM))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.sh);
               var1.N(class06570.sr);
               var1.N(class06570.TB);
               var1.N(class06570.TR);
               var1.N(class06570.Tz);
               var1.N(class06570.Ty);
               var1.N(class06570.TL);
               var1.N(class06570.TN);
               var1.N(class06570.Ng);
               var1.N(class06570.Tu);
               var1.N(class06570.Ti);
               var1.N(class06570.lA);
               var1.N(class06570.lF);
               var1.N(class06570.nW);
               var1.N(class06570.TZ);
               var1.N(class06570.TM);
               var1.N(class06570.TU);
               var1.N(class06570.TW);
               var1.N(class06570.TE);
               var1.N(class06570.Tx);
               var1.N(class06570.bJ);
               var1.N(class06570.bL);
               var1.N(class06570.vO);
               var1.N(class06570.vQ);
               var1.N(class06570.Th);
               var1.N(class06570.Tr);
               var1.N(class06570.jP);
               var1.N(class06570.jO);
               var1.N(class06570.jI);
               var1.N(class06570.jg);
               var1.N(class06570.js);
               var1.N(class06570.GF);
               var1.N(class06570.wR);
               var1.N(class06570.Mq);
               var1.N(class06570.vz);
               var1.N(class06570.vU);
               var1.N(class06570.sp);
               var1.N(class06570.sF);
               var1.N(class06570.jQ);
               var1.N(class06570.jd);
               var1.N(class06570.Ge);
               var1.N(class06570.GH);
               var1.N(class06570.dj);
               var1.N(class06570.dd);
               var1.N(class06570.GZ);
               var1.N(class06570.nU);
               var1.N(class06570.GW);
               var1.N(class06570.NK);
               var1.N(class06570.Gg);
               var1.N(class06570.nz);
               var1.N(class06570.nG);
               var1.N(class06570.lp);
               var1.N(class06570.lG);
               var1.N(class06570.wr);
               var1.N(class06570.dT);
               var1.N(class06570.vW);
               var1.N(class06570.vn);
               var1.N(class06570.vv);
               var1.N(class06570.vY);
               var1.N(class06570.vd);
               var1.N(class06570.vk);
               var1.N(class06570.vm);
               var1.N(class06570.vT);
               var1.N(class06570.vb);
               var1.N(class06570.vw);
               var1.N(class06570.vt);
               var1.N(class06570.vs);
               var1.N(class06570.vl);
               var1.N(class06570.vG);
               var1.N(class06570.vP);
               var1.N(class06570.vj);
               var1.N(class06570.sC);
               var1.N(class06570.jl);
               var1.N(class06570.GK);
               var1.N(class06570.GV);
               var1.N(class06570.jk);
               var1.N(class06570.jY);
               var1.N(class06570.Go);
               var1.N(class06570.nP);
               var1.N(class06570.nm);
               var1.N(class06570.WY);
               var1.N(class06570.vL);
               var1.N(class06570.bN);
               var1.N(class06570.lQ);
               var1.N(class06570.nb);
               var1.N(class06570.nj);
               var1.N(class06570.vg);
               var1.N(class06570.Gp);
               var1.N(class06570.nl);
               var1.N(class06570.nT);
               var1.N(class06570.vM);
               var1.N(class06570.nv);
               var1.N(class06570.GG);
               var1.N(class06570.nE);
               var1.N(class06570.sa);
               var1.N(class06570.ss);
               var1.N(class06570.dV);
               var1.N(class06570.de);
               var1.N(class06570.dQ);
               var1.N(class06570.dO);
               var1.N(class06570.dg);
               var1.N(class06570.dI);
               var1.N(class06570.dJ);
               var1.N(class06570.f_do__3);
               var1.N(class06570.dq);
               var1.N(class06570.dK);
               var1.N(class06570.kn);
               var1.N(class06570.kt);
               var1.N(class06570.kG);
               var1.N(class06570.kl);
               var1.N(class06570.kd);
               var1.N(class06570.kw);
               var1.N(class06570.kk);
               var1.N(class06570.kY);
               var1.N(class06570.kQ);
               var1.N(class06570.kO);
               var1.N(class06570.kg);
               var1.N(class06570.kI);
               var1.N(class06570.kJ);
               var1.N(class06570.ko);
               var1.N(class06570.kq);
               var1.N(class06570.kK);
               var1.N(class06570.kV);
               var1.N(class06570.ke);
               var1.N(class06570.kH);
               var1.N(class06570.kc);
               var1.N(class06570.kX);
               var1.N(class06570.ka);
               var1.N(class06570.kp);
               var1.N(class06570.ky);
               var1.N(class06570.kL);
               var1.N(class06570.kZ);
               var1.N(class06570.kR);
               var1.N(class06570.ki);
               var1.N(class06570.ku);
               var1.N(class06570.km);
               var1.N(class06570.kT);
               var1.N(class06570.kP);
               var1.N(class06570.kb);
               var1.N(class06570.kM);
               var1.N(class06570.ks);
               var1.N(class06570.kz);
               var1.N(class06570.kU);
               var1.N(class06570.kE);
               var1.N(class06570.kB);
               var1.N(class06570.kW);
               var1.N(class06570.kj);
               var1.N(class06570.kv);
               var1.N(class06570.GB);
               var1.N(class06570.Yd);
               var1.N(class06570.Yw);
               var0x.L().method_46759(class04227.yR).ifPresent(var1x -> {
                  N(var1, var1x, class06908.field_40192);
                  y(var1, var1x, class06908.field_40193);
               });
            })
            .method_47324()
      );
      class00751.N(
         var0,
         E,
         class06911.N(class06909.field_41050, 4)
            .method_47321(class00392.L("itemGroup.spawnEggs"))
            .method_47320(() -> new class06584(class06570.tJ))
            .method_47317((var0x, var1) -> {
               var1.N(class06570.Rb);
               var1.N(class06570.Yl);
               var1.N(class06570.Rj);
               var1.N(class06570.nd);
               var1.N(class06570.nw);
               var1.N(class06570.nk);
               var1.N(class06570.nY);
               var1.N(class06570.nQ);
               var1.N(class06570.nO);
               var1.N(class06570.ng);
               var1.N(class06570.nI);
               var1.N(class06570.nJ);
               var1.N(class06570.no);
               var1.N(class06570.nq);
               var1.N(class06570.nK);
               var1.N(class06570.nV);
               var1.N(class06570.ne);
               var1.N(class06570.nH);
               var1.N(class06570.nc);
               var1.N(class06570.nX);
               var1.N(class06570.na);
               var1.N(class06570.np);
               var1.N(class06570.nF);
               var1.N(class06570.nA);
               var1.N(class06570.nf);
               var1.N(class06570.nC);
               var1.N(class06570.nS);
               var1.N(class06570.nx);
               var1.N(class06570.nD);
               var1.N(class06570.nh);
               var1.N(class06570.nr);
               var1.N(class06570.tN);
               var1.N(class06570.ty);
               var1.N(class06570.tL);
               var1.N(class06570.tu);
               var1.N(class06570.ti);
               var1.N(class06570.tR);
               var1.N(class06570.tM);
               var1.N(class06570.tB);
               var1.N(class06570.tZ);
               var1.N(class06570.tz);
               var1.N(class06570.tU);
               var1.N(class06570.tE);
               var1.N(class06570.tW);
               var1.N(class06570.tm);
               var1.N(class06570.tP);
               var1.N(class06570.ts);
               var1.N(class06570.tT);
               var1.N(class06570.tb);
               var1.N(class06570.tj);
               var1.N(class06570.tv);
               var1.N(class06570.tn);
               var1.N(class06570.tt);
               var1.N(class06570.td);
               var1.N(class06570.tw);
               var1.N(class06570.tk);
               var1.N(class06570.tY);
               var1.N(class06570.tQ);
               var1.N(class06570.tO);
               var1.N(class06570.tg);
               var1.N(class06570.tI);
               var1.N(class06570.tJ);
               var1.N(class06570.to);
               var1.N(class06570.tq);
               var1.N(class06570.tK);
               var1.N(class06570.tV);
               var1.N(class06570.te);
               var1.N(class06570.tH);
               var1.N(class06570.tc);
               var1.N(class06570.tX);
               var1.N(class06570.ta);
               var1.N(class06570.tp);
               var1.N(class06570.tA);
               var1.N(class06570.tF);
               var1.N(class06570.tf);
               var1.N(class06570.tC);
               var1.N(class06570.tS);
               var1.N(class06570.tx);
               var1.N(class06570.tD);
               var1.N(class06570.th);
               var1.N(class06570.tr);
               var1.N(class06570.GN);
               var1.N(class06570.tl);
               var1.N(class06570.Gy);
               var1.N(class06570.GL);
               var1.N(class06570.Gi);
               var1.N(class06570.GR);
               var1.N(class06570.GM);
            })
            .method_47324()
      );
      class00751.N(
         var0,
         W,
         class06911.N(class06909.field_41050, 5)
            .method_47321(class00392.L("itemGroup.op"))
            .method_47320(() -> new class06584(class06570.Bd))
            .method_47315()
            .method_47317(
               (var0x, var1) -> {
                  if (var0x.y()) {
                     var1.N(class06570.Bd);
                     var1.N(class06570.zX);
                     var1.N(class06570.zc);
                     var1.N(class06570.ly);
                     var1.N(class06570.sH);
                     var1.N(class06570.se);
                     var1.N(class06570.zC);
                     var1.N(class06570.Zn);
                     var1.N(class06570.lC);
                     var1.N(class06570.sX);

                     for (class00235 class00235 : class00235.values()) {
                        var1.N(class08620.N(new class06584(class06570.sc), class00235));
                     }

                     for (int ix = 15; ix >= 0; ix--) {
                        var1.N(class04392.N(new class06584(class06570.Zt), ix));
                     }

                     var0x.L()
                        .method_46759(class04227.ym)
                        .ifPresent(var2 -> N(var1, var0x.L(), (class01921<class00693>)var2, var0xxx -> !var0xxx.N(class04446.N), class06908.field_40191));
                  }
               }
            )
            .method_47324()
      );
      return class00751.N(
         var0,
         m,
         class06911.N(class06909.field_41050, 6)
            .method_47321(class00392.L("itemGroup.inventory"))
            .method_47320(() -> new class06584(class00869.LA))
            .method_47319(s)
            .method_47322()
            .method_47315()
            .method_47318(class06936.field_41053)
            .method_47323()
            .method_47324()
      );
   }

   public static void N() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         HashMap hashmap = new HashMap();

         for (class05946<class06911> class05946 : class04206.Nz.B()) {
            class06911 class06911 = class04206.Nz.B(class05946);
            String sx = class06911.N().getString();
            String s1 = hashmap.put(Pair.of(class06911.M(), class06911.R()), sx);
            if (s1 != null) {
               throw new IllegalArgumentException("Duplicate position: " + sx + " vs. " + s1);
            }
         }
      }
   }

   private static void N(class06934 var0, class01905<class06525> var1, class06581 var2, class06908 var3, class03767 var4) {
      var1.z().filter(var1x -> ((class06525)var1x.N()).N(var4)).map(var1x -> class06517.N(var2, var1x)).forEach(var2x -> var0.method_45417(var2x, var3));
   }

   private static void N(class06934 var0, class01905<class07304> var1, class06908 var2) {
      var1.z().map(var0x -> class07323.N(new class07317(var0x, ((class07304)var0x.N()).i()))).forEach(var2x -> var0.method_45417(var2x, var2));
   }

   private static void N(class06934 var0, class01905<class04449> var1, class06581 var2, class03530<class04449> var3, class06908 var4) {
      var1.N(var3)
         .ifPresent(var3x -> var3x.N().map(var1xx -> class04473.N(var2, (class03556<class04449>)var1xx)).forEach(var2xx -> var0.method_45417(var2xx, var4)));
   }

   private static Stream<class06911> R() {
      return class04206.Nz.j();
   }
}
