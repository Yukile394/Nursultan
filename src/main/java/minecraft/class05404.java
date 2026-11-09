package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class05404 {
   public final Consumer<class05399> N;
   public final class08833 y;
   public final BiConsumer<class01894, class08819> L;
   static final List<class00891> u = List.of(class00869.Ru, class00869.Rz, class00869.Zp);
   public static final class08503 i = var0 -> var0;
   public static final class08503 R = class08503.i.N(true);
   public static final class08503 M = class08503.N.N(class08511.field_57030);
   public static final class08503 B = class08503.N.N(class08511.field_57031);
   public static final class08503 Z = class08503.N.N(class08511.field_57032);
   public static final class08503 z = class08503.y.N(class08511.field_57030);
   public static final class08503 U = class08503.y.N(class08511.field_57031);
   public static final class08503 E = class08503.y.N(class08511.field_57032);
   private static final Function<class08437, class08437> s = var0 -> var0;
   private static final Function<class08437, class08437> T = var0 -> var0.N(class06665.C, 2, 3, 4);
   private static final Function<class08437, class08437> b = var0 -> var0.N(class06665.C, 3, 4);
   private static final Function<class08437, class08437> j = var0 -> var0.N(class06665.C, 4);
   private static final Function<class08437, class08437> v = var0 -> var0.N(class06665.S, 1);
   private static final Function<class08437, class08437> n = var0 -> var0.N(class06665.S, 2, 3);
   private static final Function<class08437, class08437> t = var0 -> var0.N(class06665.S, 3);
   private static final Function<class08437, class08437> G = var0 -> var0.N(class06665.S, 4);
   static final Map<class00891, class05430> W = Map.of(class00869.y, class05404::N, class00869.nZ, class05404::L, class00869.Rj, class05404::y);
   private static final class05415<class08503> l = class05415.y(class06665.F)
      .N(class07211.field_11033, M)
      .N(class07211.field_11036, Z)
      .N(class07211.field_11043, i)
      .N(class07211.field_11035, U)
      .N(class07211.field_11039, E)
      .N(class07211.field_11034, z);
   private static final class05415<class08503> d = class05415.y(class06665.F)
      .N(class07211.field_11033, B)
      .N(class07211.field_11036, i)
      .N(class07211.field_11043, M)
      .N(class07211.field_11035, M.N(U))
      .N(class07211.field_11039, M.N(E))
      .N(class07211.field_11034, M.N(z));
   private static final class05415<class08503> w = class05415.y(class06665.f)
      .N(class07211.field_11034, i)
      .N(class07211.field_11035, z)
      .N(class07211.field_11039, U)
      .N(class07211.field_11043, E);
   private static final class05415<class08503> k = class05415.y(class06665.f)
      .N(class07211.field_11035, i)
      .N(class07211.field_11039, z)
      .N(class07211.field_11043, U)
      .N(class07211.field_11034, E);
   private static final class05415<class08503> Y = class05415.y(class06665.f)
      .N(class07211.field_11034, z)
      .N(class07211.field_11035, U)
      .N(class07211.field_11039, E)
      .N(class07211.field_11043, i);
   static final Map<class00891, class05428> m = ImmutableMap.builder()
      .put(class00869.yL, class05428.O.get(class00869.yL))
      .put(class00869.UB, class05428.O.get(class00869.UB))
      .put(class00869.Ue, class05428.N(class05388.N(class00869.yL, "_top")))
      .put(class00869.Uc, class05428.N(class05388.N(class00869.UB, "_top")))
      .put(class00869.yi, class05428.u.get(class00869.yL).N(var0 -> var0.N(class05418.Z, class05388.V(class00869.yi))))
      .put(class00869.Uz, class05428.u.get(class00869.UB).N(var0 -> var0.N(class05418.Z, class05388.V(class00869.Uz))))
      .put(class00869.BC, class05428.u.get(class00869.BC))
      .put(class00869.UH, class05428.N(class05388.N(class00869.BC, "_bottom")))
      .put(class00869.Tb, class05428.g.get(class00869.Tb))
      .put(class00869.nZ, class05428.g.get(class00869.nZ))
      .put(class00869.BS, class05428.u.get(class00869.BS).N(var0 -> var0.N(class05418.Z, class05388.V(class00869.BS))))
      .put(class00869.yu, class05428.u.get(class00869.yu).N(var0 -> {
         var0.N(class05418.u, class05388.N(class00869.yL, "_top"));
         var0.N(class05418.Z, class05388.V(class00869.yu));
      }))
      .put(class00869.UZ, class05428.u.get(class00869.UZ).N(var0 -> {
         var0.N(class05418.u, class05388.N(class00869.UB, "_top"));
         var0.N(class05418.Z, class05388.V(class00869.UZ));
      }))
      .put(class00869.bH, class05428.g.get(class00869.bH))
      .put(class00869.bo, class05428.g.get(class00869.bo))
      .build();
   static final Map<class05565, BiConsumer<class05420, class00891>> P = ImmutableMap.builder()
      .put(class05565.field_28533, class05420::N)
      .put(class05565.field_28535, class05420::E)
      .put(class05565.field_28534, class05420::U)
      .put(class05565.field_29503, class05420::U)
      .put(class05565.field_40592, class05420::L)
      .put(class05565.field_28536, class05420::u)
      .put(class05565.field_40593, class05420::i)
      .put(class05565.field_28537, class05420::R)
      .put(class05565.field_28538, class05420::B)
      .put(class05565.field_28539, class05420::Z)
      .put(class05565.field_28540, class05420::z)
      .put(class05565.field_28541, class05420::M)
      .put(class05565.field_28543, class05420::W)
      .put(class05565.field_28544, class05420::y)
      .build();
   private static final Map<class07211, class08503> Q = ImmutableMap.of(
      class07211.field_11043,
      i,
      class07211.field_11034,
      z.N(R),
      class07211.field_11035,
      U.N(R),
      class07211.field_11039,
      E.N(R),
      class07211.field_11036,
      Z.N(R),
      class07211.field_11033,
      M.N(R)
   );
   private static final Map<class05391, class01894> O = new HashMap<>();

   public final void w(class00891 var1) {
      class05388 class05388x = new class05388()
         .N(class05418.R, class05388.N(class00869.uN, "_top"))
         .N(class05418.Z, class05388.N(class00869.uN, "_side"))
         .N(class05418.M, class05388.N(var1, "_front"));
      class05388 class05388x = new class05388().N(class05418.Z, class05388.N(class00869.uN, "_top")).N(class05418.M, class05388.N(var1, "_front_vertical"));
      class03264 class03264x = y(class05433.s.N(var1, class05388x, this.L));
      class03264 class03264x = y(class05433.b.N(var1, class05388x, this.L));
      this.N
         .accept(
            class05427.N(var1)
               .N(
                  class05415.N(class06665.F)
                     .N(class07211.field_11033, class03264x.N(B))
                     .N(class07211.field_11036, class03264x)
                     .N(class07211.field_11043, class03264x)
                     .N(class07211.field_11034, class03264x.N(z))
                     .N(class07211.field_11035, class03264x.N(U))
                     .N(class07211.field_11039, class03264x.N(E))
               )
         );
   }

   private void w() {
      class03264 class03264xxx = y(class05387.N(class00869.na));
      class03264 class03264x = y(class05387.N(class00869.na, "_triggered"));
      class03264 class03264xx = y(class05387.N(class00869.na, "_crafting"));
      class03264 class03264xxx = y(class05387.N(class00869.na, "_crafting_triggered"));
      this.N
         .accept(
            class05427.N(class00869.na)
               .N(
                  class05415.N(class06665.J, class01748.y)
                     .N(false, false, class03264xxx)
                     .N(true, true, class03264xxx)
                     .N(true, false, class03264x)
                     .N(false, true, class03264xx)
               )
               .N(class05415.y(class06665.x).N(class05404::N))
         );
   }

   private void NY() {
      class01894 class01894 = class05387.y("template_skull");
      this.N(class00869.BO, class00869.Bg, class07032.field_11507, class01894);
      this.N(class00869.BY, class00869.BQ, class07032.field_11510, class01894);
      this.N(class00869.Bw, class00869.Bk, class07032.field_11508, class01894);
      this.N(class00869.Bt, class00869.BG, class07032.field_11512, class01894);
      this.N(class00869.Bl, class00869.Bd, class07032.field_11513, class01894);
      this.N(class00869.Bo, class00869.Bq, class07032.field_41313, class01894);
      this.N(class00869.BI, class00869.BJ, class07032.field_11511, class05387.N(class06570.GQ));
   }

   public static class05399 L(class00891 var0, class03674 var1, class05388 var2, BiConsumer<class01894, class08819> var3) {
      class03674 class03674 = N(class05433.E.N(var0, var2, var3));
      return class05427.N(var0, N(var1, class03674)).N(y());
   }

   public final void L(class00891 var1, class00891 var2) {
      this.N.accept(N(var1, y(class05387.N(var2))));
   }

   public static class05399 L(class00891 var0, class03264 var1, class03264 var2, class03264 var3) {
      return class05427.N(var0)
         .N(
            class05415.N(class06665.f, class06665.NZ, class06665.d)
               .N(class07211.field_11043, class08052.field_12617, false, var2)
               .N(class07211.field_11035, class08052.field_12617, false, var2.N(U))
               .N(class07211.field_11034, class08052.field_12617, false, var2.N(z))
               .N(class07211.field_11039, class08052.field_12617, false, var2.N(E))
               .N(class07211.field_11043, class08052.field_12619, false, var1)
               .N(class07211.field_11035, class08052.field_12619, false, var1.N(U))
               .N(class07211.field_11034, class08052.field_12619, false, var1.N(z))
               .N(class07211.field_11039, class08052.field_12619, false, var1.N(E))
               .N(class07211.field_11043, class08052.field_12617, true, var3)
               .N(class07211.field_11035, class08052.field_12617, true, var3.N(U))
               .N(class07211.field_11034, class08052.field_12617, true, var3.N(z))
               .N(class07211.field_11039, class08052.field_12617, true, var3.N(E))
               .N(class07211.field_11043, class08052.field_12619, true, var3.N(B).N(U))
               .N(class07211.field_11035, class08052.field_12619, true, var3.N(B))
               .N(class07211.field_11034, class08052.field_12619, true, var3.N(B).N(E))
               .N(class07211.field_11039, class08052.field_12619, true, var3.N(B).N(z))
         );
   }

   public void L() {
      class05577.N().filter(class05547::L).forEach(var1 -> this.B(var1.N()).N(var1));
      this.B(class00869.jR).N(class05577.l).N(class00869.jR, class00869.jO).N(class00869.jz, class00869.jm).N(class05577.w);
      this.B(class00869.ji).N(class05577.Y).N(class00869.ji, class00869.jQ).N(class00869.jZ, class00869.jW).N(class05577.O);
      this.B(class00869.ju).N(class05577.I).N(class00869.ju, class00869.jY).N(class00869.jB, class00869.jE).N(class05577.o);
      this.B(class00869.jL).N(class05577.K).N(class00869.jL, class00869.jk).N(class00869.jM, class00869.jU).N(class05577.e);
      this.k(class00869.vU);
      this.k(class00869.vE);
      this.k(class00869.vW);
      this.k(class00869.vm);
      this.z(class00869.vU, class00869.vP);
      this.z(class00869.vE, class00869.vs);
      this.z(class00869.vW, class00869.vT);
      this.z(class00869.vm, class00869.vb);
      this.W(class00869.N);
      this.L(class00869.mr, class00869.N);
      this.L(class00869.mh, class00869.N);
      this.W(class00869.MO);
      this.W(class00869.ij);
      this.L(class00869.PN, class00869.K);
      this.W(class00869.Ms);
      this.W(class00869.mN);
      this.W(class00869.MM);
      this.W(class00869.MJ);
      this.y(class06570.GT);
      this.W(class00869.TM);
      this.W(class00869.K);
      this.W(class00869.V);
      this.W(class00869.Zc);
      this.y(class06570.MQ);
      class06570.MO.N().forEach(this::N);
      this.v(class00869.TH, class00869.bu);
      this.v(class00869.Tc, class00869.bi);
      this.v(class00869.TX, class00869.bR);
      this.v(class00869.Ta, class00869.bM);
      this.v(class00869.Tp, class00869.bB);
      this.v(class00869.TF, class00869.bZ);
      this.v(class00869.TA, class00869.bz);
      this.v(class00869.Tf, class00869.bU);
      this.v(class00869.TC, class00869.bE);
      this.v(class00869.TS, class00869.bW);
      this.v(class00869.Tx, class00869.bm);
      this.v(class00869.TD, class00869.bP);
      this.v(class00869.Th, class00869.bs);
      this.v(class00869.Tr, class00869.bT);
      this.v(class00869.bN, class00869.bb);
      this.v(class00869.by, class00869.bj);
      this.v(class00869.Te, class00869.bL);
      this.W(class00869.mD);
      this.W(class00869.BZ);
      this.W(class00869.ba);
      this.W(class00869.vC);
      this.t(class00869.vS);
      this.t(class00869.vx);
      this.G(class00869.no);
      this.G(class00869.nq);
      this.Ni();
      this.B(class00869.ny, class00869.vD);
      this.H(class00869.nC);
      this.c(class00869.nS);
      this.R(class00869.nf);
      this.j(class00869.vh);
      this.j(class00869.vr);
      this.b(class00869.nN);
      this.y(class00869.tN, class05432.field_55176);
      this.y(class06570.uN);
      this.N(class00869.ZX, class06570.Zn);
      this.y(class06570.Zn);
      this.No();
      this.N(class00869.EK, class06570.zC);
      this.y(class06570.zC);
      this.y(class00869.LN, class05388.N(class00869.yq, "_side"));
      this.R(class00869.C);
      this.R(class00869.S);
      this.R(class00869.zv);
      this.R(class00869.LC);
      this.R(class00869.LS);
      this.R(class00869.Lx);
      this.R(class00869.Mv);
      this.R(class00869.Mn);
      this.R(class00869.Md);
      this.R(class00869.p);
      this.R(class00869.x);
      this.R(class00869.F);
      this.R(class00869.Lb);
      this.R(class00869.A);
      this.R(class00869.f);
      this.R(class00869.Lj);
      this.L(class00869.Tz, class05428.u);
      this.R(class00869.TZ);
      this.R(class00869.Nh);
      this.R(class00869.Nr);
      this.R(class00869.yN);
      this.R(class00869.Rx);
      this.R(class00869.BA);
      this.R(class00869.iU);
      this.R(class00869.iE);
      this.R(class00869.BF);
      this.R(class00869.TQ);
      this.R(class00869.mf);
      this.R(class00869.in);
      this.R(class00869.U);
      this.R(class00869.TU);
      this.R(class00869.MP);
      this.R(class00869.io);
      this.R(class00869.X);
      this.R(class00869.TB);
      this.R(class00869.iT);
      this.L(class00869.iG, class05428.M);
      this.L(class00869.TT, class05428.u);
      this.L(class00869.Rq, class05428.u);
      this.W(class00869.NM);
      this.W(class00869.Mp);
      this.R(class00869.EJ);
      this.R(class00869.yR);
      this.R(class00869.zn);
      this.R(class00869.LV);
      this.R(class00869.TV);
      this.R(class00869.zN);
      this.R(class00869.sG);
      this.R(class00869.iw);
      this.R(class00869.ik);
      this.L(class00869.La, class05428.y);
      this.i(class00869.Lp);
      this.R(class00869.NS);
      this.L(class00869.yJ, class05428.k);
      this.y(class06570.uu);
      this.L(class00869.Ln, class05428.R);
      this.L(class00869.Tu, class05428.u);
      this.R(class00869.sm);
      this.R(class00869.Nx);
      this.R(class00869.bv);
      this.R(class00869.bn);
      this.R(class00869.bc);
      this.R(class00869.vF);
      this.R(class00869.ng);
      this.R(class00869.nI);
      this.R(class00869.nJ);
      this.y(class00869.bA);
      this.W(class00869.nA);
      this.Nk();
      this.R(class00869.jN);
      this.R(class00869.jy);
      this.R(class00869.bx);
      this.R(class00869.bD);
      this.R(class00869.bh);
      this.R(class00869.br);
      this.P(class00869.bx, class00869.jG);
      this.P(class00869.bD, class00869.jd);
      this.P(class00869.bh, class00869.jl);
      this.P(class00869.br, class00869.jw);
      this.Z(class00869.jH);
      this.Z(class00869.jc);
      this.Z(class00869.ja);
      this.Z(class00869.jX);
      this.N(class00869.jH, class00869.jp);
      this.N(class00869.jc, class00869.jF);
      this.N(class00869.ja, class00869.jf);
      this.N(class00869.jX, class00869.jA);
      this.U(class00869.jC);
      this.U(class00869.jS);
      this.U(class00869.jD);
      this.U(class00869.jx);
      this.y(class00869.jC, class00869.jh);
      this.y(class00869.jS, class00869.jr);
      this.y(class00869.jD, class00869.vy);
      this.y(class00869.jx, class00869.vN);
      this.R(class00869.vL);
      this.R(class00869.vu);
      this.R(class00869.vi);
      this.R(class00869.vR);
      this.P(class00869.vL, class00869.vM);
      this.P(class00869.vu, class00869.vB);
      this.P(class00869.vi, class00869.vZ);
      this.P(class00869.vR, class00869.vz);
      this.U(class00869.vq, class00869.vH);
      this.U(class00869.vK, class00869.vc);
      this.U(class00869.vV, class00869.vX);
      this.U(class00869.ve, class00869.va);
      this.m(class00869.Bc, class00869.Lb);
      this.m(class00869.BX, class00869.Lj);
      this.b(class00869.Ll, class00869.NW);
      this.b(class00869.Ld, class00869.Nj);
      this.b(class00869.Lw, class00869.NU);
      this.b(class00869.Lk, class00869.Nm);
      this.b(class00869.LY, class00869.sb);
      this.b(class00869.LQ, class00869.NP);
      this.b(class00869.LO, class00869.NE);
      this.b(class00869.Lg, class00869.Nb);
      this.b(class00869.LI, class00869.NT);
      this.b(class00869.LJ, class00869.Ns);
      this.b(class00869.Lo, class00869.Nz);
      this.b(class00869.Lq, class00869.sZ);
      this.O();
      this.P();
      this.Nn();
      this.j();
      this.v();
      this.N(class00869.si, class00869.sR);
      this.n();
      this.l();
      this.d();
      this.Y();
      this.Q();
      this.I();
      this.k();
      this.O(class00869.Es);
      this.J();
      this.o();
      this.q();
      this.e();
      this.H();
      this.c();
      this.X();
      this.m();
      this.a();
      this.q(class00869.RQ);
      class00869.RO.y().forEach(this::s);
      this.p();
      this.F();
      this.f();
      this.C();
      this.S();
      this.x();
      this.D();
      this.Nu();
      this.NM();
      this.NR();
      this.NB();
      this.NZ();
      this.t();
      this.Nz();
      this.NU();
      this.NE();
      this.Nm();
      this.NW();
      this.R(class00869.Ty);
      this.NP();
      this.Ns();
      this.NT();
      this.Nj();
      this.Nb();
      this.u();
      this.V(class00869.RX);
      this.V(class00869.bf);
      this.y(class00869.Ra, class06570.Mq);
      this.Nt();
      this.Nw();
      this.NN();
      this.Ny();
      this.NL();
      this.A();
      this.V();
      this.K();
      this.h();
      this.r();
      this.K(class00869.uW);
      this.N(class00869.uW);
      this.K(class00869.PD);
      this.i();
      this.K(class00869.nu);
      this.T(class00869.Le, class00869.LH);
      this.T(class00869.iO, class00869.ig);
      this.T(class00869.iI, class00869.iJ);
      this.N(class00869.LD, class00869.m, class05388::L);
      this.N(class00869.PS, class00869.s, class05388::u);
      this.Q(class00869.sn);
      this.Q(class00869.sE);
      this.w(class00869.yy);
      this.w(class00869.Br);
      this.w();
      this.o(class00869.sy);
      this.o(class00869.sL);
      class00869.su.y().forEach(this::E);
      this.L(class00869.Rg, y(class05428.w.N(class00869.Rg, this.L)));
      class00869.RI.y().forEach(this::W);
      this.N(class00869.iY, class05428.u);
      this.N(class00869.iQ, class05428.u);
      this.R(class00869.nO);
      this.N(class00869.Eq, class05428.u);
      this.L(class00869.z);
      this.L(class00869.nM);
      this.L(class00869.e);
      this.u(class00869.H);
      this.u(class00869.a);
      this.L(class00869.c);
      this.y(class00869.q);
      this.L(class00869.nc, class05428.R);
      this.N(class00869.zy, class05428.u, class05428.i);
      this.N(class00869.Ev, class05428.Y, class05428.Q);
      this.N(class00869.Bx, class05428.Y, class05428.Q);
      this.N(class00869.nK, class05428.u, class05428.i);
      this.N(class00869.nV, class05428.u, class05428.i);
      this.N(class00869.ne, class05428.u, class05428.i);
      this.y(class00869.Pp, class05428.Z);
      this.G();
      this.N(class00869.Ti, class05388::O);
      this.N(class00869.TR, class05388::I);
      this.N(class00869.Ew, class06665.NG, 0, 1, 2, 3);
      this.N(class00869.Bz, class06665.Nw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.N(class00869.MR, class06665.NG, 0, 1, 1, 2);
      this.N(class00869.BU, class06665.Nw, 0, 0, 1, 1, 2, 2, 2, 3);
      this.N(class00869.Lh, class06665.Nw, 0, 1, 2, 3, 4, 5, 6, 7);
      this.N(class00869.EG, class05432.field_22840, class06665.Nn, 0, 1);
      this.M();
      this.R();
      this.NO();
      this.NJ();
      this.NY();
      this.Ng();
      this.NI();
      this.N(class00869.Ee, null);
      this.N(class00869.EH, class06563.field_7952);
      this.N(class00869.Ec, class06563.field_7946);
      this.N(class00869.EX, class06563.field_7958);
      this.N(class00869.Ea, class06563.field_7951);
      this.N(class00869.Ep, class06563.field_7947);
      this.N(class00869.EF, class06563.field_7961);
      this.N(class00869.EA, class06563.field_7954);
      this.N(class00869.Ef, class06563.field_7944);
      this.N(class00869.EC, class06563.field_7967);
      this.N(class00869.ES, class06563.field_7955);
      this.N(class00869.Ex, class06563.field_7945);
      this.N(class00869.ED, class06563.field_7966);
      this.N(class00869.Eh, class06563.field_7957);
      this.N(class00869.Er, class06563.field_7942);
      this.N(class00869.WN, class06563.field_7964);
      this.N(class00869.Wy, class06563.field_7963);
      this.NQ();
      this.T(class00869.mC);
      this.N(class00869.mC, new class00339());
      this.M(class00869.nX, class00869.zj);
      this.N(class00869.nX, new class00369());
      this.M(class00869.MW, class00869.LV);
      this.M(class00869.EY, class00869.LV);
      this.R(class00869.Nf);
      this.R(class00869.NC);
      this.R(class00869.Wj);
      this.R(class00869.Wv);
      this.R(class00869.Wn);
      this.R(class00869.Wt);
      this.R(class00869.WG);
      this.R(class00869.Wl);
      this.R(class00869.Wd);
      this.R(class00869.Ww);
      this.R(class00869.Wk);
      this.R(class00869.WY);
      this.R(class00869.WQ);
      this.R(class00869.WO);
      this.R(class00869.Wg);
      this.R(class00869.WI);
      this.R(class00869.WJ);
      this.R(class00869.Wo);
      this.N(
         class05428.N,
         class00869.Wq,
         class00869.WK,
         class00869.WV,
         class00869.We,
         class00869.WH,
         class00869.Wc,
         class00869.WX,
         class00869.Wa,
         class00869.Wp,
         class00869.WF,
         class00869.WA,
         class00869.Wf,
         class00869.WC,
         class00869.WS,
         class00869.Wx,
         class00869.WD
      );
      this.R(class00869.zj);
      this.R(class00869.ZN);
      this.R(class00869.Zy);
      this.R(class00869.ZL);
      this.R(class00869.Zu);
      this.R(class00869.Zi);
      this.R(class00869.ZR);
      this.R(class00869.ZM);
      this.R(class00869.ZB);
      this.R(class00869.ZZ);
      this.R(class00869.Zz);
      this.R(class00869.ZU);
      this.R(class00869.ZE);
      this.R(class00869.ZW);
      this.R(class00869.Zm);
      this.R(class00869.ZP);
      this.R(class00869.Zs);
      this.R(class00869.bX);
      this.Z(class00869.ND, class00869.RJ);
      this.Z(class00869.ic, class00869.ZT);
      this.Z(class00869.iX, class00869.Zb);
      this.Z(class00869.ia, class00869.Zj);
      this.Z(class00869.ip, class00869.Zv);
      this.Z(class00869.iF, class00869.Zn);
      this.Z(class00869.iA, class00869.Zt);
      this.Z(class00869.f_if__1, class00869.ZG);
      this.Z(class00869.iC, class00869.Zl);
      this.Z(class00869.iS, class00869.Zd);
      this.Z(class00869.ix, class00869.Zw);
      this.Z(class00869.iD, class00869.Zk);
      this.Z(class00869.ih, class00869.ZY);
      this.Z(class00869.ir, class00869.ZQ);
      this.Z(class00869.RN, class00869.ZO);
      this.Z(class00869.Ry, class00869.Zg);
      this.Z(class00869.RL, class00869.ZI);
      this.y(
         class05428.v,
         class00869.WL,
         class00869.Wu,
         class00869.Wi,
         class00869.WR,
         class00869.WM,
         class00869.WB,
         class00869.WZ,
         class00869.Wz,
         class00869.WU,
         class00869.WE,
         class00869.WW,
         class00869.Wm,
         class00869.WP,
         class00869.Ws,
         class00869.WT,
         class00869.Wb
      );
      this.B(class00869.yV, class00869.zL);
      this.B(class00869.ye, class00869.zu);
      this.B(class00869.yH, class00869.zi);
      this.B(class00869.yc, class00869.zR);
      this.B(class00869.yX, class00869.zM);
      this.B(class00869.ya, class00869.zB);
      this.B(class00869.yp, class00869.zZ);
      this.B(class00869.yF, class00869.zz);
      this.B(class00869.yA, class00869.zU);
      this.B(class00869.yf, class00869.zE);
      this.B(class00869.yC, class00869.zW);
      this.B(class00869.yS, class00869.zm);
      this.B(class00869.yx, class00869.zP);
      this.B(class00869.yD, class00869.zs);
      this.B(class00869.yh, class00869.zT);
      this.B(class00869.yr, class00869.zb);
      this.R(class00869.nB);
      this.R(class00869.Rb);
      this.y(class00869.yY, class00869.MF, class05432.field_22839);
      this.M(class00869.yY);
      this.N(class00869.Ly, class00869.MA, class05432.field_22840);
      this.N(class00869.Lu, class00869.Mf, class05432.field_22840);
      this.N(class00869.nx, class00869.nh, class05432.field_55176);
      this.N(class00869.nD, class00869.nr, class05432.field_22840);
      this.N(class00869.Li, class00869.MC, class05432.field_22840);
      this.N(class00869.LR, class00869.MS, class05432.field_22840);
      this.N(class00869.LM, class00869.Mx, class05432.field_22840);
      this.N(class00869.LB, class00869.MD, class05432.field_22840);
      this.N(class00869.LZ, class00869.Mh, class05432.field_22840);
      this.N(class00869.Lz, class00869.Mr, class05432.field_22840);
      this.N(class00869.LU, class00869.BN, class05432.field_22840);
      this.N(class00869.LE, class00869.By, class05432.field_22840);
      this.N(class00869.LW, class00869.BL, class05432.field_22840);
      this.N(class00869.LP, class00869.Bu, class05432.field_22840);
      this.N(class00869.Lm, class00869.Bi, class05432.field_22840);
      this.N(class00869.LT, class00869.BR, class05432.field_22840);
      this.N(class00869.Ls, class00869.BM, class05432.field_22840);
      this.N(class00869.yQ, class00869.BB, class05432.field_22840);
      this.N(class00869.LL, class00869.Mo, class05432.field_22840);
      this.g();
      this.l(class00869.Rw);
      this.l(class00869.Rk);
      this.l(class00869.RY);
      this.y(class00869.yk, class05432.field_22839);
      this.M(class00869.yk);
      this.N(class00869.yg, class05432.field_22840);
      this.N(class00869.yI, class05432.field_22840);
      this.y(class00869.yO, class05432.field_22839);
      this.M(class00869.yO);
      this.y(class00869.it, class05432.field_22839);
      this.y(class06570.ux);
      this.L(class00869.Wh, class00869.Wr, class05432.field_22840);
      this.y(class06570.uD);
      this.y(class00869.nR, class05432.field_22840);
      this.L(class00869.sl, class00869.sd, class05432.field_22840);
      this.L(class00869.sw, class00869.sk, class05432.field_22840);
      this.N(class00869.sl, "_plant");
      this.N(class00869.sw, "_plant");
      this.N(class00869.mS, class05432.field_22839, class05388.L(class05388.N(class00869.mx, "_stage0")));
      this.U();
      this.N(class00869.iv, class05432.field_22840);
      this.N(class00869.yw, class05432.field_22840);
      this.u(class00869.zG, class05432.field_22840);
      this.u(class00869.zl, class05432.field_22840);
      this.u(class00869.zd, class05432.field_22840);
      this.m(class00869.zw);
      this.m(class00869.zk);
      this.B();
      this.Z();
      this.z();
      this.N(class00869.mv, class00869.mP, class00869.mz, class00869.mi, class00869.mO, class00869.md, class00869.mc, class00869.mq);
      this.N(class00869.mn, class00869.ms, class00869.mU, class00869.mR, class00869.mg, class00869.mw, class00869.mX, class00869.mK);
      this.N(class00869.mt, class00869.mT, class00869.mE, class00869.mM, class00869.mI, class00869.mk, class00869.ma, class00869.mV);
      this.N(class00869.mG, class00869.mb, class00869.mW, class00869.mB, class00869.mJ, class00869.mY, class00869.mp, class00869.me);
      this.N(class00869.ml, class00869.mj, class00869.mm, class00869.mZ, class00869.mo, class00869.mQ, class00869.mF, class00869.mH);
      this.i(class00869.RH, class00869.RV);
      this.i(class00869.Re, class00869.RK);
      this.E(class00869.NR).L(class00869.NR).N(class00869.Nk);
      this.E(class00869.Nb).L(class00869.Nb).N(class00869.NK);
      this.N(class00869.Nb, class00869.uK, class00869.uf);
      this.N(class00869.NA, class05428.G, -7158200);
      this.E(class00869.Ny).L(class00869.Ny).N(class00869.Nl);
      this.E(class00869.NW).L(class00869.NW).N(class00869.NI);
      this.N(class00869.NW, class00869.uQ, class00869.uX);
      this.N(class00869.O, class00869.MH, class05432.field_22840);
      this.N(class00869.NX, class05428.G, -12012264);
      this.E(class00869.NL).u(class00869.NL).N(class00869.Nd);
      this.E(class00869.Nm).u(class00869.Nm).N(class00869.NJ);
      this.N(class00869.Nm, class00869.uO, class00869.ua);
      this.N(class00869.g, class00869.Mc, class05432.field_22840);
      this.L(class00869.Na, class05428.G);
      this.E(class00869.r).L(class00869.r).N(class00869.Nt);
      this.E(class00869.NU).L(class00869.NU).N(class00869.NO);
      this.N(class00869.NU, class00869.uY, class00869.uc);
      this.N(class00869.Y, class00869.MV, class05432.field_22840);
      this.N(class00869.NH, class05428.G, -8345771);
      this.E(class00869.D).L(class00869.D).N(class00869.Nv);
      this.E(class00869.NT).L(class00869.NT).N(class00869.NY);
      this.N(class00869.NT, class00869.uw, class00869.ue);
      this.N(class00869.w, class00869.Mq, class05432.field_22840);
      this.N(class00869.NV, class05428.G, -12012264);
      this.E(class00869.h).L(class00869.h).N(class00869.Nn);
      this.E(class00869.Nz).L(class00869.Nz).N(class00869.NQ);
      this.N(class00869.Nz, class00869.uk, class00869.uH);
      this.N(class00869.k, class00869.MK, class05432.field_22840);
      this.N(class00869.Ne, class05428.G, -10380959);
      this.E(class00869.Nu).L(class00869.Nu).N(class00869.Nw);
      this.E(class00869.NP).L(class00869.NP).N(class00869.No);
      this.N(class00869.NP, class00869.uI, class00869.uF);
      this.N(class00869.I, class00869.MX, class05432.field_22840);
      this.N(class00869.Np, class05428.G, -12012264);
      this.E(class00869.Ni).L(class00869.Ni).N(class00869.n);
      this.E(class00869.Ns).L(class00869.Ns).N(class00869.Nq);
      this.N(class00869.Ns, class00869.uJ, class00869.uA);
      this.N(class00869.J, class00869.Ma, class05432.field_22840);
      this.L(class00869.NF, class05428.G);
      this.E(class00869.NN).L(class00869.NN).N(class00869.NG);
      this.E(class00869.NE).L(class00869.NE).N(class00869.Ng);
      this.N(class00869.NE, class00869.ug, class00869.up);
      this.N(class00869.Q, class00869.Me, class05432.field_22840);
      this.N(class00869.Nc, class05428.G, -12012264);
      this.E(class00869.sT).y(class00869.sT).N(class00869.sj);
      this.E(class00869.sb).y(class00869.sb).N(class00869.sv);
      this.N(class00869.sb, class00869.uo, class00869.uC);
      this.N(class00869.st, class00869.TW, class05432.field_22840);
      this.j(class00869.sY, class00869.TP);
      this.E(class00869.sB).y(class00869.sB).N(class00869.sz);
      this.E(class00869.sZ).y(class00869.sZ).N(class00869.sU);
      this.N(class00869.sZ, class00869.uq, class00869.uS);
      this.N(class00869.sW, class00869.Tm, class05432.field_22840);
      this.j(class00869.sP, class00869.Ts);
      this.E(class00869.NZ).u(class00869.NZ);
      this.E(class00869.Nj).u(class00869.Nj);
      this.N(class00869.l, class00869.uV, class00869.ux);
      this.y(class00869.ss, class05432.field_22840);
      this.y(class06570.uf);
      this.Z(class00869.ur);
      this.U(class00869.Zp);
      this.b();
      this.P(class00869.um);
      this.s(class00869.yG);
      this.s(class00869.yl);
      this.s(class00869.Bh);
      this.T();
      this.v(class00869.MQ);
      this.v(class00869.EQ);
      this.v(class00869.EO);
      this.n(class00869.BK);
      this.n(class00869.BV);
      this.n(class00869.Be);
      this.E();
      this.W();
      this.u(class00869.uN, class05428.B);
      this.u(class00869.Pf, class05428.B);
      this.u(class00869.PA, class05428.Z);
      this.s();
      this.Nd();
      this.Nv();
      this.P(class00869.RT, class00869.Rd);
      this.P(class00869.W, class00869.Rn);
      this.P(class00869.Rs, class00869.Rl);
      this.P(class00869.RP, class00869.RG);
      this.NG();
      this.P(class00869.Rm, class00869.Rt);
      this.Nl();
   }

   public final void L(class00891 var1, class00891 var2, class05432 var3) {
      this.y(var1, var3);
      this.y(var2, var3);
   }

   public final void L(class00891 var1, class05432 var2) {
      class03264 class03264x = y(this.N(var1, "_top", var2.N(), class05388::L));
      class03264 class03264x = y(this.N(var1, "_bottom", var2.N(), class05388::L));
      this.i(var1, class03264x, class03264x);
   }

   public void L(class00891 var1, class01343 var2) {
      this.N.accept(N(var1, y(var2.N(var1, this.L))));
   }

   public static class05399 L(class00891 var0, class03264 var1, class03264 var2) {
      return class05427.N(var0)
         .N(class05415.N(class06665.V).N(class07185.field_11052, var1).N(class07185.field_11051, var2.N(M)).N(class07185.field_11048, var2.N(M).N(z)));
   }

   public final void L(class00891 var1, class03264 var2) {
      this.N.accept(y(var1, var2));
   }

   public final void L(class00891 var1) {
      class03674 class03674 = N(class05428.N.N(var1, this.L));
      this.N.accept(class05427.N(var1, y(class03674)));
   }

   private void Nd() {
      class01894 class01894xx = class05388.N(class00869.TE, "_bottom");
      class01894 class01894x = class05388.N(class00869.TE, "_top_off");
      class01894 class01894xx = class05388.N(class00869.TE, "_top");
      class01894[] aclass01894 = new class01894[5];

      for (int ix = 0; ix < 5; ix++) {
         class05388 class05388 = new class05388()
            .N(class05418.i, class01894xx)
            .N(class05418.R, ix == 0 ? class01894x : class01894xx)
            .N(class05418.Z, class05388.N(class00869.TE, "_side" + ix));
         aclass01894[ix] = class05433.m.N(class00869.TE, "_" + ix, class05388, this.L);
      }

      this.N.accept(class05427.N(class00869.TE).N(class05415.N(class06665.yu).N(var1x -> y(aclass01894[var1x]))));
      this.N(class00869.TE, aclass01894[0]);
   }

   private void Nl() {
      class01894 class01894 = class05387.N(class00869.nZ);
      class03674 class03674x = N(class01894);
      class03674 class03674x = N(class05387.N(class00869.nZ, "_mirrored"));
      this.N.accept(class05427.N(class00869.nQ, N(class03674x, class03674x)).N(y()));
      this.N(class00869.nQ, class01894);
   }

   private void No() {
      class08895 class08895x = class08825.N(this.N(class06570.Zt));
      HashMap hashmap = new HashMap(16);
      class05392 class05392 = class05415.N(class06665.Nf);

      for (int ix = 0; ix <= 15; ix++) {
         String sx = String.format(Locale.ROOT, "_%02d", ix);
         class01894 class01894 = class05388.N(class06570.Zt, sx);
         class05392.N(ix, y(class05433.NN.N(class00869.Za, sx, class05388.B(class01894), this.L)));
         class08895 class08895x = class08825.N(class05433.yD.N(class05387.N(class06570.Zt, sx), class05388.U(class01894), this.L));
         hashmap.put(ix, class08895x);
      }

      this.y.N(class06570.Zt, class08825.N(class04392.L, class08895x, hashmap));
      this.N.accept(class05427.N(class00869.Za).N(class05392));
   }

   private void M() {
      class00891 class00891 = class00869.El;
      this.y(class00891.B());
      this.N.accept(class05427.N(class00891).N(class05415.N(class03587.i, class06665.NB).N((var1x, var2) -> {
         return switch (var2) {
            case field_12609 -> y(class05387.N(class00891, "_top_stage_" + var1x));
            case field_12607 -> y(class05387.N(class00891, "_bottom_stage_" + var1x));
         };
      })));
   }

   public void M(class00891 var1, class00891 var2) {
      this.N.accept(N(var1, this.R(var1, var2)));
   }

   public final void M(class00891 var1) {
      class01894 class01894 = this.N(var1.B(), var1);
      this.N(var1, class01894, new class08832());
   }

   public final void P(class00891 var1, class00891 var2) {
      class03264 class03264 = y(class05387.N(var1));
      this.N.accept(class05427.N(var2, class03264));
      this.y.N(var1.B(), var2.B());
   }

   private void P() {
      class05388 class05388 = class05388.N(class05388.V(class00869.Lt), class05388.V(class00869.m));
      class03264 class03264 = y(class05433.z.N(class00869.Lt, class05388, this.L));
      this.N.accept(N(class00869.Lt, class03264));
   }

   public final void P(class00891 var1) {
      class05388 class05388x = class05388.B(var1);
      class05388 class05388x = class05388.i(class05388.N(var1, "_corner"));
      class03264 class03264xxx = y(class05433.Nn.N(var1, class05388x, this.L));
      class03264 class03264x = y(class05433.Nt.N(var1, class05388x, this.L));
      class03264 class03264xx = y(class05433.NG.N(var1, class05388x, this.L));
      class03264 class03264xxx = y(class05433.Nl.N(var1, class05388x, this.L));
      this.N(var1);
      this.N
         .accept(
            class05427.N(var1)
               .N(
                  class05415.N(class06665.NU)
                     .N(class08080.field_12665, class03264xxx)
                     .N(class08080.field_12674, class03264xxx.N(z))
                     .N(class08080.field_12667, class03264xx.N(z))
                     .N(class08080.field_12666, class03264xxx.N(z))
                     .N(class08080.field_12670, class03264xx)
                     .N(class08080.field_12668, class03264xxx)
                     .N(class08080.field_12664, class03264x)
                     .N(class08080.field_12671, class03264x.N(z))
                     .N(class08080.field_12672, class03264x.N(U))
                     .N(class08080.field_12663, class03264x.N(E))
               )
         );
   }

   private void NP() {
      this.y(class06570.Th);
      this.N
         .accept(
            class05427.N(class00869.Ml)
               .N(
                  class05415.N(class06665.N, class06665.X, class06665.c, class06665.a, class06665.p)
                     .N(false, false, false, false, false, y(class05387.N(class00869.Ml, "_ns")))
                     .N(false, true, false, false, false, y(class05387.N(class00869.Ml, "_n")).N(z))
                     .N(false, false, true, false, false, y(class05387.N(class00869.Ml, "_n")))
                     .N(false, false, false, true, false, y(class05387.N(class00869.Ml, "_n")).N(U))
                     .N(false, false, false, false, true, y(class05387.N(class00869.Ml, "_n")).N(E))
                     .N(false, true, true, false, false, y(class05387.N(class00869.Ml, "_ne")))
                     .N(false, true, false, true, false, y(class05387.N(class00869.Ml, "_ne")).N(z))
                     .N(false, false, false, true, true, y(class05387.N(class00869.Ml, "_ne")).N(U))
                     .N(false, false, true, false, true, y(class05387.N(class00869.Ml, "_ne")).N(E))
                     .N(false, false, true, true, false, y(class05387.N(class00869.Ml, "_ns")))
                     .N(false, true, false, false, true, y(class05387.N(class00869.Ml, "_ns")).N(z))
                     .N(false, true, true, true, false, y(class05387.N(class00869.Ml, "_nse")))
                     .N(false, true, false, true, true, y(class05387.N(class00869.Ml, "_nse")).N(z))
                     .N(false, false, true, true, true, y(class05387.N(class00869.Ml, "_nse")).N(U))
                     .N(false, true, true, false, true, y(class05387.N(class00869.Ml, "_nse")).N(E))
                     .N(false, true, true, true, true, y(class05387.N(class00869.Ml, "_nsew")))
                     .N(true, false, false, false, false, y(class05387.N(class00869.Ml, "_attached_ns")))
                     .N(true, false, true, false, false, y(class05387.N(class00869.Ml, "_attached_n")))
                     .N(true, false, false, true, false, y(class05387.N(class00869.Ml, "_attached_n")).N(U))
                     .N(true, true, false, false, false, y(class05387.N(class00869.Ml, "_attached_n")).N(z))
                     .N(true, false, false, false, true, y(class05387.N(class00869.Ml, "_attached_n")).N(E))
                     .N(true, true, true, false, false, y(class05387.N(class00869.Ml, "_attached_ne")))
                     .N(true, true, false, true, false, y(class05387.N(class00869.Ml, "_attached_ne")).N(z))
                     .N(true, false, false, true, true, y(class05387.N(class00869.Ml, "_attached_ne")).N(U))
                     .N(true, false, true, false, true, y(class05387.N(class00869.Ml, "_attached_ne")).N(E))
                     .N(true, false, true, true, false, y(class05387.N(class00869.Ml, "_attached_ns")))
                     .N(true, true, false, false, true, y(class05387.N(class00869.Ml, "_attached_ns")).N(z))
                     .N(true, true, true, true, false, y(class05387.N(class00869.Ml, "_attached_nse")))
                     .N(true, true, false, true, true, y(class05387.N(class00869.Ml, "_attached_nse")).N(z))
                     .N(true, false, true, true, true, y(class05387.N(class00869.Ml, "_attached_nse")).N(U))
                     .N(true, true, true, false, true, y(class05387.N(class00869.Ml, "_attached_nse")).N(E))
                     .N(true, true, true, true, true, y(class05387.N(class00869.Ml, "_attached_nsew")))
               )
         );
   }

   private void X() {
      class03674 class03674 = N(class05387.N(class00869.Ek));
      this.N.accept(class05427.N(class00869.Ek, y(class03674)));
   }

   public final void K(class00891 var1) {
      this.N.accept(class05427.N(var1, y(class05387.N(var1))).N(Y));
   }

   private void K() {
      class05388 class05388 = class05388.N(class05388.N(class00869.NB, "_side"), class05388.N(class00869.NB, "_top"));
      class03264 class03264 = y(class05433.z.N(class00869.NB, class05388, this.L));
      this.N.accept(y(class00869.NB, class03264));
   }

   public final void T(class00891 var1, class00891 var2) {
      class05388 class05388 = class05388.Y(var1);
      this.N.accept(N(var1, y(class05433.yk.N(var1, class05388, this.L))));
      this.N.accept(class05427.N(var2, y(class05433.yQ.N(var2, class05388, this.L))).N(w));
      this.N(var1);
   }

   public final void T(class00891 var1) {
      this.M(var1, var1);
   }

   private void T() {
      this.y(class06570.WI);
      this.N
         .accept(
            class05427.N(class00869.Ba)
               .N(
                  class05415.N(class06665.yZ, class06665.k)
                     .N(class06677.field_12576, false, y(class05387.N(class00869.Ba)))
                     .N(class06677.field_12576, true, y(class05387.N(class00869.Ba, "_on")))
                     .N(class06677.field_12578, false, y(class05387.N(class00869.Ba, "_subtract")))
                     .N(class06677.field_12578, true, y(class05387.N(class00869.Ba, "_on_subtract")))
               )
               .N(k)
         );
   }

   private void Q() {
      this.N
         .accept(
            class05394.N(class00869.TL)
               .N(y(class05388.V(class00869.TL)))
               .N(N().N(class06665.Na, 1), y(class05388.N(class00869.TL, "_contents1")))
               .N(N().N(class06665.Na, 2), y(class05388.N(class00869.TL, "_contents2")))
               .N(N().N(class06665.Na, 3), y(class05388.N(class00869.TL, "_contents3")))
               .N(N().N(class06665.Na, 4), y(class05388.N(class00869.TL, "_contents4")))
               .N(N().N(class06665.Na, 5), y(class05388.N(class00869.TL, "_contents5")))
               .N(N().N(class06665.Na, 6), y(class05388.N(class00869.TL, "_contents6")))
               .N(N().N(class06665.Na, 7), y(class05388.N(class00869.TL, "_contents7")))
               .N(N().N(class06665.Na, 8), y(class05388.N(class00869.TL, "_contents_ready")))
         );
   }

   public final void Q(class00891 var1) {
      class05388 class05388 = new class05388()
         .N(class05418.i, class05388.V(class00869.id))
         .N(class05418.R, class05388.V(var1))
         .N(class05418.Z, class05388.N(var1, "_side"));
      this.N.accept(N(var1, y(class05433.m.N(var1, class05388, this.L))));
   }

   public class05404(Consumer<class05399> var1, class08833 var2, BiConsumer<class01894, class08819> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public final class05420 B(class00891 var1) {
      class05428 class05428 = m.getOrDefault(var1, class05428.N.get(var1));
      return new class05420(this, class05428.y()).N(var1, class05428.N());
   }

   public final void B(class00891 var1, class00891 var2) {
      this.R(var1);
      class03264 class03264 = y(class05428.z.get(var1).N(var2, this.L));
      this.N.accept(N(var2, class03264));
   }

   private void B() {
      this.N(class00869.zt, "_front");
      class03264 class03264x = y(class05387.N(class00869.zt, "_top"));
      class03264 class03264x = y(this.N(class00869.zt, "_bottom", class05432.field_22840.N(), class05388::L));
      this.i(class00869.zt, class03264x, class03264x);
   }

   private void C() {
      class03674 class03674 = N(class05428.N.N(class00869.id, this.L));
      this.N
         .accept(
            class05427.N(
               class00869.id,
               N(
                  class03674,
                  class03674.N(M),
                  class03674.N(B),
                  class03674.N(Z),
                  class03674.N(z),
                  class03674.N(z.N(M)),
                  class03674.N(z.N(B)),
                  class03674.N(z.N(Z)),
                  class03674.N(U),
                  class03674.N(U.N(M)),
                  class03674.N(U.N(B)),
                  class03674.N(U.N(Z)),
                  class03674.N(E),
                  class03674.N(E.N(M)),
                  class03674.N(E.N(B)),
                  class03674.N(E.N(Z))
               )
            )
         );
   }

   private void D() {
      class05388 class05388xx = new class05388().N(class05418.J, class05388.N(class00869.yq, "_top")).N(class05418.Z, class05388.N(class00869.yq, "_side"));
      class05388 class05388x = class05388xx.L(class05418.I, class05388.N(class00869.yq, "_top_sticky"));
      class05388 class05388xx = class05388xx.L(class05418.I, class05388.N(class00869.yq, "_top"));
      this.N
         .accept(
            class05427.N(class00869.yK)
               .N(
                  class05415.N(class06665.Y, class06665.yE)
                     .N(false, class08083.field_12637, y(class05433.yo.N(class00869.yq, "_head", class05388xx, this.L)))
                     .N(false, class08083.field_12634, y(class05433.yo.N(class00869.yq, "_head_sticky", class05388x, this.L)))
                     .N(true, class08083.field_12637, y(class05433.yq.N(class00869.yq, "_head_short", class05388xx, this.L)))
                     .N(true, class08083.field_12634, y(class05433.yq.N(class00869.yq, "_head_short_sticky", class05388x, this.L)))
               )
               .N(l)
         );
   }

   private void F() {
      class01894 class01894 = this.N(class06570.Mf, class00869.RS);
      this.N(class00869.RS, class01894, class08825.N(-9321636));
      class03674 class03674 = N(class05387.N(class00869.RS));
      this.N.accept(class05427.N(class00869.RS, y(class03674)));
   }

   public final class03264 I(class00891 var1) {
      return N(
         N(class05433.yW.N(class05387.N(var1, "_side0"), class05388.d(var1), this.L)),
         N(class05433.yW.N(class05387.N(var1, "_side1"), class05388.w(var1), this.L)),
         N(class05433.ym.N(class05387.N(var1, "_side_alt0"), class05388.d(var1), this.L)),
         N(class05433.ym.N(class05387.N(var1, "_side_alt1"), class05388.w(var1), this.L))
      );
   }

   private void I() {
      class01894 class01894 = class05388.N(class00869.Bp, "_side");
      class05388 class05388x = new class05388().N(class05418.R, class05388.N(class00869.Bp, "_top")).N(class05418.Z, class01894);
      class05388 class05388x = new class05388().N(class05418.R, class05388.N(class00869.Bp, "_inverted_top")).N(class05418.Z, class01894);
      this.N
         .accept(
            class05427.N(class00869.Bp)
               .N(
                  class05415.N(class06665.j)
                     .N(false, y(class05433.NH.N(class00869.Bp, class05388x, this.L)))
                     .N(true, y(class05433.NH.N(class05387.N(class00869.Bp, "_inverted"), class05388x, this.L)))
               )
         );
   }

   public final class03264 J(class00891 var1) {
      return N(
         N(class05433.yP.N(class05387.N(var1, "_up0"), class05388.d(var1), this.L)),
         N(class05433.yP.N(class05387.N(var1, "_up1"), class05388.w(var1), this.L)),
         N(class05433.ys.N(class05387.N(var1, "_up_alt0"), class05388.d(var1), this.L)),
         N(class05433.ys.N(class05387.N(var1, "_up_alt1"), class05388.w(var1), this.L))
      );
   }

   private void J() {
      class05388 class05388x = new class05388().N(class05418.Q, class05388.V(class00869.z)).N(class05418.R, class05388.V(class00869.Lr));
      class05388 class05388x = new class05388().N(class05418.Q, class05388.V(class00869.z)).N(class05418.R, class05388.N(class00869.Lr, "_moist"));
      class03264 class03264x = y(class05433.yU.N(class00869.Lr, class05388x, this.L));
      class03264 class03264x = y(class05433.yU.N(class05388.N(class00869.Lr, "_moist"), class05388x, this.L));
      this.N.accept(class05427.N(class00869.Lr).N(N(class06665.NC, 7, class03264x, class03264x)));
   }

   private void S() {
      class03264 class03264x = y(class05387.N(class00869.EV));
      class03264 class03264x = y(class05387.N(class00869.EV, "_on"));
      this.N.accept(class05427.N(class00869.EV).N(N(class06665.k, class03264x, class03264x)).N(l));
   }

   private void Z() {
      class03264 class03264x = y(this.N(class00869.yo, "_top", class05433.yK, class05388::N));
      class03264 class03264x = y(this.N(class00869.yo, "_bottom", class05433.yK, class05388::N));
      this.i(class00869.yo, class03264x, class03264x);
   }

   public final void Z(class00891 var1, class00891 var2) {
      this.R(var1);
      class05388 class05388 = class05388.y(var1, var2);
      class03264 class03264xxxx = y(class05433.Na.N(var2, class05388, this.L));
      class03264 class03264x = y(class05433.Np.N(var2, class05388, this.L));
      class03264 class03264xx = y(class05433.NF.N(var2, class05388, this.L));
      class03264 class03264xxx = y(class05433.Nc.N(var2, class05388, this.L));
      class03264 class03264xxxx = y(class05433.NX.N(var2, class05388, this.L));
      class06581 class06581 = var2.B();
      this.N(class06581, this.N(class06581, var1));
      this.N
         .accept(
            class05394.N(var2)
               .N(class03264xxxx)
               .N(N().N(class06665.c, true), class03264x)
               .N(N().N(class06665.X, true), class03264x.N(z))
               .N(N().N(class06665.a, true), class03264xx)
               .N(N().N(class06665.p, true), class03264xx.N(z))
               .N(N().N(class06665.c, false), class03264xxx)
               .N(N().N(class06665.X, false), class03264xxxx)
               .N(N().N(class06665.a, false), class03264xxxx.N(z))
               .N(N().N(class06665.p, false), class03264xxx.N(E))
         );
   }

   public void Z(class00891 var1) {
      class05388 class05388 = class05388.G(var1);
      class03264 class03264xxxxxxx = y(class05433.t.N(var1, class05388, this.L));
      class03264 class03264x = y(class05433.G.N(var1, class05388, this.L));
      class03264 class03264xx = y(class05433.l.N(var1, class05388, this.L));
      class03264 class03264xxx = y(class05433.d.N(var1, class05388, this.L));
      class03264 class03264xxxx = y(class05433.w.N(var1, class05388, this.L));
      class03264 class03264xxxxx = y(class05433.k.N(var1, class05388, this.L));
      class03264 class03264xxxxxx = y(class05433.Y.N(var1, class05388, this.L));
      class03264 class03264xxxxxxx = y(class05433.Q.N(var1, class05388, this.L));
      this.y(var1.B());
      this.N.accept(N(var1, class03264xxxxxxx, class03264x, class03264xx, class03264xxx, class03264xxxx, class03264xxxxx, class03264xxxxxx, class03264xxxxxxx));
   }

   private void V() {
      this.y(class06570.NR);
      class00891 class00891 = class00869.o;
      class03264 class03264 = y(class05387.N(class00891));
      this.N
         .accept(
            class05427.N(class00869.o)
               .N(class05415.N(class04091.M, class04091.i).N((var2x, var3) -> var2x ? y(class05387.N(class00891, "_hanging_" + var3)) : class03264))
         );
   }

   public final void V(class00891 var1) {
      this.N(var1);
      this.e(var1);
   }

   public final void e(class00891 var1) {
      Map map = N(var1.W(), class05543::y);
      class08437 class08437 = N();
      map.forEach((var1x, var2x) -> class08437.N((class08092<Boolean>)var1x, false));
      class03264 class03264 = y(class05387.N(var1));
      class05394 class05394 = class05394.N(var1);
      map.forEach((var3x, var4x) -> {
         class05394.N(N().N((class08092<Boolean>)var3x, true), class03264.N(var4x));
         class05394.N(class08437, class03264.N(var4x));
      });
      this.N.accept(class05394);
   }

   private void e() {
      this.N
         .accept(
            class05427.N(class00869.Eg)
               .N(
                  class05415.N(class06665.NG)
                     .N(0, y(this.N(class00869.Eg, "_0", class05433.L, class05388::y)))
                     .N(1, y(this.N(class00869.Eg, "_1", class05433.L, class05388::y)))
                     .N(2, y(this.N(class00869.Eg, "_2", class05433.L, class05388::y)))
                     .N(3, y(this.N(class00869.Eg, "_3", class05433.L, class05388::y)))
               )
         );
   }

   public static class05399 i(class00891 var0, class03264 var1, class03264 var2, class03264 var3) {
      return class05427.N(var0).N(class05415.N(class06665.yW).N(class08054.field_12681, var1).N(class08054.field_12679, var2).N(class08054.field_12682, var3));
   }

   private void i() {
      class03264 class03264xx = y(class05387.N(class00869.nL));
      class03264 class03264x = y(class05387.N(class00869.nL, "_partial_tilt"));
      class03264 class03264xx = y(class05387.N(class00869.nL, "_full_tilt"));
      this.N
         .accept(
            class05427.N(class00869.nL)
               .N(
                  class05415.N(class06665.yT)
                     .N(class06082.field_28718, class03264xx)
                     .N(class06082.field_28719, class03264xx)
                     .N(class06082.field_28720, class03264x)
                     .N(class06082.field_28721, class03264xx)
               )
               .N(Y)
         );
   }

   public final void i(class00891 var1, class00891 var2) {
      this.y(var1.B());
      class05388 class05388x = class05388.U(var1);
      class05388 class05388x = class05388.N(var1, var2);
      class03264 class03264 = y(class05433.yZ.N(var2, class05388x, this.L));
      this.N
         .accept(
            class05427.N(var2, class03264)
               .N(
                  class05415.y(class06665.f)
                     .N(class07211.field_11039, i)
                     .N(class07211.field_11035, E)
                     .N(class07211.field_11043, z)
                     .N(class07211.field_11034, U)
               )
         );
      this.N.accept(class05427.N(var1).N(class05415.N(class06665.Nw).N(var3x -> y(class05433.yB[var3x].N(var1, class05388x, this.L)))));
   }

   public final void i(class00891 var1, class03264 var2, class03264 var3) {
      this.N.accept(class05427.N(var1).N(class05415.N(class06665.NB).N(class08059.field_12607, var3).N(class08059.field_12609, var2)));
   }

   public final void i(class00891 var1) {
      class03264 class03264xxxxx = y(class05428.Y.N(var1, this.L));
      class03264 class03264x = y(class05428.Q.N(var1, this.L));
      class03264 class03264xx = y(this.N(class05428.Y, var1, "_awake"));
      class03264 class03264xxx = y(this.N(class05428.Q, var1, "_awake"));
      class03264 class03264xxxx = y(this.N(class05428.Y, var1, "_dormant"));
      class03264 class03264xxxxx = y(this.N(class05428.Q, var1, "_dormant"));
      this.N
         .accept(
            class05427.N(var1)
               .N(
                  class05415.N(class06665.V, class00325.L)
                     .N(class07185.field_11052, class08630.field_55831, class03264xxxxx)
                     .N(class07185.field_11051, class08630.field_55831, class03264x.N(M))
                     .N(class07185.field_11048, class08630.field_55831, class03264x.N(M).N(z))
                     .N(class07185.field_11052, class08630.field_55832, class03264xxxx)
                     .N(class07185.field_11051, class08630.field_55832, class03264xxxxx.N(M))
                     .N(class07185.field_11048, class08630.field_55832, class03264xxxxx.N(M).N(z))
                     .N(class07185.field_11052, class08630.field_55833, class03264xx)
                     .N(class07185.field_11051, class08630.field_55833, class03264xxx.N(M))
                     .N(class07185.field_11048, class08630.field_55833, class03264xxx.N(M).N(z))
               )
         );
   }

   public final void b(class00891 var1) {
      class03264 class03264xxx = y(class05428.s.N(var1, this.L));
      class03264 class03264x = y(class05428.T.N(var1, this.L));
      class03264 class03264xx = y(class05428.b.N(var1, this.L));
      class03264 class03264xxx = y(class05428.j.N(var1, this.L));
      this.y(var1.B());
      this.N(var1, class03264xxx, v, class03264x, n, class03264xx, t, class03264xxx, G);
   }

   private void b() {
      class05388 class05388x = class05388.N(class00869.UV);
      class05388 class05388x = class05388.N(class05388.N(class00869.Ul, "_side"), class05388x.N(class05418.R));
      class03264 class03264xx = y(class05433.Ny.N(class00869.Ul, class05388x, this.L));
      class03264 class03264x = y(class05433.NL.N(class00869.Ul, class05388x, this.L));
      class03264 class03264xx = y(class05433.z.y(class00869.Ul, "_double", class05388x, this.L));
      this.N.accept(i(class00869.Ul, class03264xx, class03264x, class03264xx));
      this.N.accept(N(class00869.UV, y(class05433.L.N(class00869.UV, class05388x, this.L))));
   }

   public final void b(class00891 var1, class00891 var2) {
      class05388 class05388 = new class05388().N(class05418.N, class05388.V(var1)).N(class05418.L, class05388.V(var2));
      class05394 class05394 = class05394.N(var1);
      this.N(var1, class05388, class05394, class05433.Nr, null, null);
      this.N(var1, class05388, class05394, class05433.yy, false, null);
      this.N(var1, class05388, class05394, class05433.yL, true, class08972.field_61446);
      this.N(var1, class05388, class05394, class05433.yu, true, class08972.field_61449);
      this.N(var1, class05388, class05394, class05433.yi, true, class08972.field_61448);
      this.N(var1, class05388, class05394, class05433.yR, true, class08972.field_61447);
      this.N.accept(class05394);
      this.N(var1, class05433.yN.N(var1, class05388, this.L));
   }

   private void x() {
      class05388 class05388xx = new class05388().N(class05418.i, class05388.N(class00869.yq, "_bottom")).N(class05418.Z, class05388.N(class00869.yq, "_side"));
      class01894 class01894xxx = class05388.N(class00869.yq, "_top_sticky");
      class01894 class01894x = class05388.N(class00869.yq, "_top");
      class05388 class05388x = class05388xx.L(class05418.I, class01894xxx);
      class05388 class05388xx = class05388xx.L(class05418.I, class01894x);
      class03264 class03264 = y(class05387.N(class00869.yq, "_base"));
      this.N(class00869.yq, class03264, class05388xx);
      this.N(class00869.yd, class03264, class05388x);
      class01894 class01894xx = class05433.m.N(class00869.yq, "_inventory", class05388xx.L(class05418.R, class01894x), this.L);
      class01894 class01894xxx = class05433.m.N(class00869.yd, "_inventory", class05388xx.L(class05418.R, class01894xxx), this.L);
      this.N(class00869.yq, class01894xx);
      this.N(class00869.yd, class01894xxx);
   }

   public final void s(class00891 var1, class00891 var2) {
      class05388 class05388 = class05388.q(var1);
      class01894 class01894xxxxx = class05433.yl.N(var1, class05388, this.L);
      class01894 class01894x = class05433.yG.N(var1, class05388, this.L);
      class01894 class01894xx = class05433.yn.N(var1, class05388, this.L);
      class01894 class01894xxx = class05433.yt.N(var1, class05388, this.L);
      class01894 class01894xxxx = class05433.yd.N(var1, class05388, this.L);
      class01894 class01894xxxxx = class05433.yw.N(var1, class05388, this.L);
      this.N(var1, class01894xxxxx, class01894x, class01894xx, class01894xxx, class01894xxxx, class01894xxxxx);
      this.N(var2, class01894xxxxx, class01894x, class01894xx, class01894xxx, class01894xxxx, class01894xxxxx);
      this.N(var1);
      this.y.N(var1.B(), var2.B());
   }

   private void s() {
      this.y(class06570.WY);
      this.N
         .accept(
            class05394.N(class00869.Lf)
               .N(
                  N(
                     N()
                        .N(class06665.Ni, class08075.field_12687)
                        .N(class06665.Nu, class08075.field_12687)
                        .N(class06665.NR, class08075.field_12687)
                        .N(class06665.NM, class08075.field_12687),
                     N().N(class06665.Ni, class08075.field_12689, class08075.field_12686).N(class06665.Nu, class08075.field_12689, class08075.field_12686),
                     N().N(class06665.Nu, class08075.field_12689, class08075.field_12686).N(class06665.NR, class08075.field_12689, class08075.field_12686),
                     N().N(class06665.NR, class08075.field_12689, class08075.field_12686).N(class06665.NM, class08075.field_12689, class08075.field_12686),
                     N().N(class06665.NM, class08075.field_12689, class08075.field_12686).N(class06665.Ni, class08075.field_12689, class08075.field_12686)
                  ),
                  y(class05387.N("redstone_dust_dot"))
               )
               .N(N().N(class06665.Ni, class08075.field_12689, class08075.field_12686), y(class05387.N("redstone_dust_side0")))
               .N(N().N(class06665.NR, class08075.field_12689, class08075.field_12686), y(class05387.N("redstone_dust_side_alt0")))
               .N(N().N(class06665.Nu, class08075.field_12689, class08075.field_12686), y(class05387.N("redstone_dust_side_alt1")).N(E))
               .N(N().N(class06665.NM, class08075.field_12689, class08075.field_12686), y(class05387.N("redstone_dust_side1")).N(E))
               .N(N().N(class06665.Ni, class08075.field_12686), y(class05387.N("redstone_dust_up")))
               .N(N().N(class06665.Nu, class08075.field_12686), y(class05387.N("redstone_dust_up")).N(z))
               .N(N().N(class06665.NR, class08075.field_12686), y(class05387.N("redstone_dust_up")).N(U))
               .N(N().N(class06665.NM, class08075.field_12686), y(class05387.N("redstone_dust_up")).N(E))
         );
   }

   public final void s(class00891 var1) {
      class03264 class03264xxxxx = y(this.N(var1, "", class05433.Nn, class05388::i));
      class03264 class03264x = y(this.N(var1, "", class05433.NG, class05388::i));
      class03264 class03264xx = y(this.N(var1, "", class05433.Nl, class05388::i));
      class03264 class03264xxx = y(this.N(var1, "_on", class05433.Nn, class05388::i));
      class03264 class03264xxxx = y(this.N(var1, "_on", class05433.NG, class05388::i));
      class03264 class03264xxxxx = y(this.N(var1, "_on", class05433.Nl, class05388::i));
      this.N(var1);
      this.N.accept(class05427.N(var1).N(class05415.N(class06665.k, class06665.NE).N((var6x, var7x) -> {
         return switch (var7x) {
            case field_12665 -> var6x ? class03264xx : class03264xxxxx;
            case field_12674 -> (var6x ? class03264xx : class03264xxxxx).N(z);
            case field_12667 -> (var6x ? class03264x : class03264xxxx).N(z);
            case field_12666 -> (var6x ? class03264 : class03264xxx).N(z);
            case field_12670 -> var6x ? class03264x : class03264xxxx;
            case field_12668 -> var6x ? class03264 : class03264xxx;
            default -> throw new UnsupportedOperationException("Fix you generator!");
         };
      })));
   }

   public final void c(class00891 var1) {
      this.N(var1);
      this.N.accept(class05427.N(var1).N(class05415.N(class00288.y).N(var2 -> {
         String sx = var2 ? "_tip" : "";
         class05388 class05388 = class05388.L(class05388.N(var1, sx));
         return y(class05432.field_22840.N().N(var1, sx, class05388, this.L));
      })));
   }

   private void c() {
      this.y(class06570.vE);
      this.N
         .accept(
            class05427.N(class00869.Mb)
               .N(
                  class05415.N(class06665.Nt)
                     .N(0, y(class05387.N(class00869.Mb, "_stage0")))
                     .N(1, y(class05387.N(class00869.Mb, "_stage1")))
                     .N(2, y(class05387.N(class00869.Mb, "_stage2")))
               )
               .N(k)
         );
   }

   private void n() {
      class05388 class05388 = new class05388()
         .N(class05418.L, class05388.N(class00869.PC, "_side3"))
         .N(class05418.P, class05388.V(class00869.v))
         .N(class05418.m, class05388.N(class00869.PC, "_top"))
         .N(class05418.z, class05388.N(class00869.PC, "_side3"))
         .N(class05418.E, class05388.N(class00869.PC, "_side3"))
         .N(class05418.U, class05388.N(class00869.PC, "_side1"))
         .N(class05418.W, class05388.N(class00869.PC, "_side2"));
      this.N.accept(N(class00869.PC, y(class05433.N.N(class00869.PC, class05388, this.L))));
   }

   public final void n(class00891 var1) {
      class03264 class03264 = y(class05428.t.N(var1, this.L));
      this.N.accept(N(var1, class03264).N(k));
   }

   private void h() {
      class00891 class00891 = class00869.np;
      class05388 class05388xxxxx = class05388.N(class00891, "_side_inactive", "_top_inactive");
      class05388 class05388x = class05388.N(class00891, "_side_active", "_top_active");
      class05388 class05388xx = class05388.N(class00891, "_side_active", "_top_ejecting_reward");
      class05388 class05388xxx = class05388.N(class00891, "_side_inactive_ominous", "_top_inactive_ominous");
      class05388 class05388xxxx = class05388.N(class00891, "_side_active_ominous", "_top_active_ominous");
      class05388 class05388xxxxx = class05388.N(class00891, "_side_active_ominous", "_top_ejecting_reward_ominous");
      class01894 class01894 = class05433.P.N(class00891, class05388xxxxx, this.L);
      class03264 class03264xxxxx = y(class01894);
      class03264 class03264x = y(class05433.P.N(class00891, "_active", class05388x, this.L));
      class03264 class03264xx = y(class05433.P.N(class00891, "_ejecting_reward", class05388xx, this.L));
      class03264 class03264xxx = y(class05433.P.N(class00891, "_inactive_ominous", class05388xxx, this.L));
      class03264 class03264xxxx = y(class05433.P.N(class00891, "_active_ominous", class05388xxxx, this.L));
      class03264 class03264xxxxx = y(class05433.P.N(class00891, "_ejecting_reward_ominous", class05388xxxxx, this.L));
      this.N(class00891, class01894);
      this.N.accept(class05427.N(class00891).N(class05415.N(class06665.yO, class06665.yJ).N((var6x, var7x) -> {
         return switch (var6x) {
            case field_47383, field_47388 -> var7x ? class03264xx : class03264xxxxx;
            case field_47384, field_47385, field_47386 -> var7x ? class03264x : class03264xxxx;
            case field_47387 -> var7x ? class03264 : class03264xxx;
         };
      })));
   }

   private void f() {
      this.N
         .accept(
            class05427.N(class00869.iq)
               .N(
                  class05415.N(class06665.K)
                     .N(class07185.field_11048, y(class05387.N(class00869.iq, "_ns")))
                     .N(class07185.field_11051, y(class05387.N(class00869.iq, "_ew")))
               )
         );
   }

   private void l() {
      this.y(class06570.nt);
      this.W(class00869.MZ);
      this.N.accept(N(class00869.MU, y(class05433.yA.N(class00869.MU, class05388.z(class05388.N(class00869.V, "_still")), this.L))));
      this.N
         .accept(
            class05427.N(class00869.Mz)
               .N(
                  class05415.N(class01096.M)
                     .N(1, y(class05433.yp.N(class00869.Mz, "_level1", class05388.z(class05388.N(class00869.K, "_still")), this.L)))
                     .N(2, y(class05433.yF.N(class00869.Mz, "_level2", class05388.z(class05388.N(class00869.K, "_still")), this.L)))
                     .N(3, y(class05433.yA.N(class00869.Mz, "_full", class05388.z(class05388.N(class00869.K, "_still")), this.L)))
               )
         );
      this.N
         .accept(
            class05427.N(class00869.ME)
               .N(
                  class05415.N(class01096.M)
                     .N(1, y(class05433.yp.N(class00869.ME, "_level1", class05388.z(class05388.V(class00869.ba)), this.L)))
                     .N(2, y(class05433.yF.N(class00869.ME, "_level2", class05388.z(class05388.V(class00869.ba)), this.L)))
                     .N(3, y(class05433.yA.N(class00869.ME, "_full", class05388.z(class05388.V(class00869.ba)), this.L)))
               )
         );
   }

   public final void l(class00891 var1) {
      class03264 class03264x = y(class05433.ya.N(var1, class05388.y(var1), this.L));
      class03264 class03264x = y(class05387.N("mushroom_block_inside"));
      this.N
         .accept(
            class05394.N(var1)
               .N(N().N(class06665.c, true), class03264x)
               .N(N().N(class06665.X, true), class03264x.N(z).N(R))
               .N(N().N(class06665.a, true), class03264x.N(U).N(R))
               .N(N().N(class06665.p, true), class03264x.N(E).N(R))
               .N(N().N(class06665.e, true), class03264x.N(Z).N(R))
               .N(N().N(class06665.H, true), class03264x.N(M).N(R))
               .N(N().N(class06665.c, false), class03264x)
               .N(N().N(class06665.X, false), class03264x.N(z))
               .N(N().N(class06665.a, false), class03264x.N(U))
               .N(N().N(class06665.p, false), class03264x.N(E))
               .N(N().N(class06665.e, false), class03264x.N(Z))
               .N(N().N(class06665.H, false), class03264x.N(M))
         );
      this.N(var1, class05428.N.N(var1, "_inventory", this.L));
   }

   public void d(class00891 var1) {
      class05388 class05388 = new class05388()
         .N(class05418.L, class05388.N(var1, "_particle"))
         .N(class05418.P, class05388.N(var1, "_down"))
         .N(class05418.m, class05388.N(var1, "_up"))
         .N(class05418.z, class05388.N(var1, "_north"))
         .N(class05418.U, class05388.N(var1, "_south"))
         .N(class05418.E, class05388.N(var1, "_east"))
         .N(class05418.W, class05388.N(var1, "_west"));
      this.N.accept(N(var1, y(class05433.N.N(var1, class05388, this.L))));
   }

   private void d() {
      class05388 class05388 = class05388.y(class00869.Eb);
      class03264 class03264x = y(class05433.Ne.N(class00869.Eb, class05388, this.L));
      class03264 class03264x = y(this.N(class00869.Eb, "_dead", class05433.Ne, var1x -> class05388.L(class05418.y, var1x)));
      this.N.accept(class05427.N(class00869.Eb).N(N(class06665.Nd, 5, class03264x, class03264x)));
   }

   private void a() {
      class03264 class03264x = y(class05387.N(class00869.Bf));
      class03264 class03264x = y(class05387.N(class00869.Bf, "_side"));
      this.y(class06570.We);
      this.N
         .accept(
            class05427.N(class00869.Bf)
               .N(
                  class05415.N(class06665.A)
                     .N(class07211.field_11033, class03264x)
                     .N(class07211.field_11043, class03264x)
                     .N(class07211.field_11034, class03264x.N(z))
                     .N(class07211.field_11035, class03264x.N(U))
                     .N(class07211.field_11039, class03264x.N(E))
               )
         );
   }

   public final void m(class00891 var1, class00891 var2) {
      class05388 class05388 = class05388.y(var2);
      class03264 class03264x = y(class05433.h.N(var1, class05388, this.L));
      class03264 class03264x = y(class05433.r.N(var1, class05388, this.L));
      this.N.accept(class05427.N(var1).N(N(class06665.ND, 1, class03264x, class03264x)));
   }

   private void m() {
      this.N
         .accept(
            class05427.N(class00869.Px, y(class05387.N(class00869.Px)))
               .N(
                  class05415.y(class06665.D, class06665.f)
                     .N(class06657.field_12475, class07211.field_11043, i)
                     .N(class06657.field_12475, class07211.field_11034, z)
                     .N(class06657.field_12475, class07211.field_11035, U)
                     .N(class06657.field_12475, class07211.field_11039, E)
                     .N(class06657.field_12471, class07211.field_11043, M)
                     .N(class06657.field_12471, class07211.field_11034, M.N(z))
                     .N(class06657.field_12471, class07211.field_11035, M.N(U))
                     .N(class06657.field_12471, class07211.field_11039, M.N(E))
                     .N(class06657.field_12473, class07211.field_11035, B)
                     .N(class06657.field_12473, class07211.field_11039, B.N(z))
                     .N(class06657.field_12473, class07211.field_11043, B.N(U))
                     .N(class06657.field_12473, class07211.field_11034, B.N(E))
               )
         );
   }

   public final void m(class00891 var1) {
      class01894 class01894 = this.N(var1.B(), var1, "_top");
      this.N(var1, class01894, new class08832());
      this.L(var1, class05432.field_22839);
   }

   private void o() {
      class08437 class08437 = N().N(class06665.c, false).N(class06665.X, false).N(class06665.a, false).N(class06665.p, false).N(class06665.e, false);
      class03264 class03264xx = this.g(class00869.Lc);
      class03264 class03264x = this.I(class00869.Lc);
      class03264 class03264xx = this.J(class00869.Lc);
      this.N
         .accept(
            class05394.N(class00869.Lc)
               .N(class08437, class03264xx)
               .N(N(N().N(class06665.c, true), class08437), class03264x)
               .N(N(N().N(class06665.X, true), class08437), class03264x.N(z))
               .N(N(N().N(class06665.a, true), class08437), class03264x.N(U))
               .N(N(N().N(class06665.p, true), class08437), class03264x.N(E))
               .N(N().N(class06665.e, true), class03264xx)
         );
   }

   public final void o(class00891 var1) {
      class03264 class03264x = y(class05428.l.N(var1, this.L));
      class03264 class03264x = y(class05428.d.N(var1, this.L));
      this.y(var1.B());
      this.N.accept(class05427.N(var1).N(N(class06665.W, class03264x, class03264x)));
   }

   private void p() {
      class03264 class03264x = y(class05387.N(class00869.uD));
      class03264 class03264x = y(class05387.N(class00869.uD, "_on"));
      this.N(class00869.uD);
      this.N
         .accept(
            class05427.N(class00869.uD)
               .N(N(class06665.k, class03264x, class03264x))
               .N(
                  class05415.y(class06665.D, class06665.f)
                     .N(class06657.field_12473, class07211.field_11043, B.N(U))
                     .N(class06657.field_12473, class07211.field_11034, B.N(E))
                     .N(class06657.field_12473, class07211.field_11035, B)
                     .N(class06657.field_12473, class07211.field_11039, B.N(z))
                     .N(class06657.field_12475, class07211.field_11043, i)
                     .N(class06657.field_12475, class07211.field_11034, z)
                     .N(class06657.field_12475, class07211.field_11035, U)
                     .N(class06657.field_12475, class07211.field_11039, E)
                     .N(class06657.field_12471, class07211.field_11043, M)
                     .N(class06657.field_12471, class07211.field_11034, M.N(z))
                     .N(class06657.field_12471, class07211.field_11035, M.N(U))
                     .N(class06657.field_12471, class07211.field_11039, M.N(E))
               )
         );
   }

   private void k() {
      class03264 class03264x = y(class05387.N(class00869.Mm));
      class03264 class03264x = y(class05387.N(class00869.Mm, "_filled"));
      this.N.accept(class05427.N(class00869.Mm).N(class05415.N(class06665.U).N(false, class03264x).N(true, class03264x)).N(k));
   }

   public final void k(class00891 var1) {
      class03264 class03264xxx = y(class05433.L.N(var1, class05388.N(var1), this.L));
      class03264 class03264x = y(this.N(var1, "_powered", class05433.L, class05388::y));
      class03264 class03264xx = y(this.N(var1, "_lit", class05433.L, class05388::y));
      class03264 class03264xxx = y(this.N(var1, "_lit_powered", class05433.L, class05388::y));
      this.N.accept(N(var1, class03264xxx, class03264xx, class03264x, class03264xxx));
   }

   private void t() {
      class05388 class05388 = new class05388()
         .N(class05418.L, class05388.N(class00869.Ph, "_front"))
         .N(class05418.P, class05388.N(class00869.Ph, "_bottom"))
         .N(class05418.m, class05388.N(class00869.Ph, "_top"))
         .N(class05418.z, class05388.N(class00869.Ph, "_front"))
         .N(class05418.U, class05388.N(class00869.Ph, "_front"))
         .N(class05418.E, class05388.N(class00869.Ph, "_side"))
         .N(class05418.W, class05388.N(class00869.Ph, "_side"));
      this.N.accept(N(class00869.Ph, y(class05433.N.N(class00869.Ph, class05388, this.L))));
   }

   public final void t(class00891 var1) {
      class03264 class03264 = y(class05433.yf.N(var1, class05388.P(var1), this.L));
      this.N.accept(N(var1, class03264));
   }

   private void g() {
      class05413 class05413 = class05415.N(class06665.yb, class06665.yj);

      for (class06337 class06337 : class06337.values()) {
         class05413.N(class07211.field_11036, class06337, this.N(class07211.field_11036, class06337));
      }

      for (class06337 class06337x : class06337.values()) {
         class05413.N(class07211.field_11033, class06337x, this.N(class07211.field_11033, class06337x));
      }

      this.N.accept(class05427.N(class00869.vp).N(class05413));
   }

   public final class03264 g(class00891 var1) {
      return N(
         N(class05433.yE.N(class05387.N(var1, "_floor0"), class05388.d(var1), this.L)),
         N(class05433.yE.N(class05387.N(var1, "_floor1"), class05388.w(var1), this.L))
      );
   }

   public final void v(class00891 var1, class00891 var2) {
      this.y(var1.B());
      class05388 class05388x = class05388.y(class05388.V(var1));
      class05388 class05388x = class05388.y(class05388.N(var1, "_lit"));
      class03264 class03264xxxxxxxxx = y(class05433.LE.N(var1, "_one_candle", class05388x, this.L));
      class03264 class03264x = y(class05433.LW.N(var1, "_two_candles", class05388x, this.L));
      class03264 class03264xx = y(class05433.Lm.N(var1, "_three_candles", class05388x, this.L));
      class03264 class03264xxx = y(class05433.LP.N(var1, "_four_candles", class05388x, this.L));
      class03264 class03264xxxx = y(class05433.LE.N(var1, "_one_candle_lit", class05388x, this.L));
      class03264 class03264xxxxx = y(class05433.LW.N(var1, "_two_candles_lit", class05388x, this.L));
      class03264 class03264xxxxxx = y(class05433.Lm.N(var1, "_three_candles_lit", class05388x, this.L));
      class03264 class03264xxxxxxx = y(class05433.LP.N(var1, "_four_candles_lit", class05388x, this.L));
      this.N
         .accept(
            class05427.N(var1)
               .N(
                  class05415.N(class06665.NO, class06665.n)
                     .N(1, false, class03264xxxxxxxxx)
                     .N(2, false, class03264x)
                     .N(3, false, class03264xx)
                     .N(4, false, class03264xxx)
                     .N(1, true, class03264xxxx)
                     .N(2, true, class03264xxxxx)
                     .N(3, true, class03264xxxxxx)
                     .N(4, true, class03264xxxxxxx)
               )
         );
      class03264 class03264xxxxxxxx = y(class05433.Ls.N(var2, class05388.N(var1, false), this.L));
      class03264 class03264xxxxxxxxx = y(class05433.Ls.N(var2, "_lit", class05388.N(var1, true), this.L));
      this.N.accept(class05427.N(var2).N(N(class06665.n, class03264xxxxxxxxx, class03264xxxxxxxx)));
   }

   private void v() {
      this.y(class06570.vI);
      this.N
         .accept(
            class05427.N(class00869.ie)
               .N(
                  class05415.N(class06665.NQ)
                     .N(0, y(class05387.N(class00869.ie)))
                     .N(1, y(class05387.N(class00869.ie, "_slice1")))
                     .N(2, y(class05387.N(class00869.ie, "_slice2")))
                     .N(3, y(class05387.N(class00869.ie, "_slice3")))
                     .N(4, y(class05387.N(class00869.ie, "_slice4")))
                     .N(5, y(class05387.N(class00869.ie, "_slice5")))
                     .N(6, y(class05387.N(class00869.ie, "_slice6")))
               )
         );
   }

   public final void v(class00891 var1) {
      class05388 class05388 = class05388.Q(var1);
      class03264 class03264x = y(class05433.NA.N(var1, class05388, this.L));
      class03264 class03264x = y(this.N(var1, "_conditional", class05433.NA, var1x -> class05388.L(class05418.Z, var1x)));
      this.N.accept(class05427.N(var1).N(N(class06665.R, class03264x, class03264x)).N(l));
   }

   public final void j(class00891 var1, class00891 var2) {
      this.N(var1, class05432.field_22840);
      class05388 class05388 = class05388.u(class05388.N(var1, "_pot"));
      class03264 class03264 = y(class05432.field_22840.y().N(var2, class05388, this.L));
      this.N.accept(N(var2, class03264));
   }

   private void j() {
      this.y(class06570.nn);
      this.N
         .accept(
            class05394.N(class00869.MB)
               .N(y(class05388.V(class00869.MB)))
               .N(N().N(class06665.m, true), y(class05388.N(class00869.MB, "_bottle0")))
               .N(N().N(class06665.P, true), y(class05388.N(class00869.MB, "_bottle1")))
               .N(N().N(class06665.s, true), y(class05388.N(class00869.MB, "_bottle2")))
               .N(N().N(class06665.m, false), y(class05388.N(class00869.MB, "_empty0")))
               .N(N().N(class06665.P, false), y(class05388.N(class00869.MB, "_empty1")))
               .N(N().N(class06665.s, false), y(class05388.N(class00869.MB, "_empty2")))
         );
   }

   public final void j(class00891 var1) {
      class03264 class03264xxx = y(class05428.E.N(var1, this.L));
      class03264 class03264x = y(class05428.W.N(var1, this.L));
      class03264 class03264xx = y(class05428.m.N(var1, this.L));
      class03264 class03264xxx = y(class05428.P.N(var1, this.L));
      this.y(var1.B());
      this.N(var1, class03264xxx, s, class03264x, T, class03264xx, b, class03264xxx, j);
   }

   private void q() {
      class03264 class03264x = this.g(class00869.LX);
      class03264 class03264x = this.I(class00869.LX);
      this.N.accept(class05394.N(class00869.LX).N(class03264x).N(class03264x).N(class03264x.N(z)).N(class03264x.N(U)).N(class03264x.N(E)));
   }

   public final void q(class00891 var1) {
      class05388 class05388 = class05388.q(var1);
      this.N(
         var1,
         class05433.yl.N(var1, class05388, this.L),
         class05433.yG.N(var1, class05388, this.L),
         class05433.yn.N(var1, class05388, this.L),
         class05433.yt.N(var1, class05388, this.L),
         class05433.yd.N(var1, class05388, this.L),
         class05433.yw.N(var1, class05388, this.L)
      );
      this.N(var1);
   }

   public void U(class00891 var1) {
      class05388 class05388 = class05388.y(var1);
      class03264 class03264x = y(class05433.NB.N(var1, class05388, this.L));
      class01894 class01894 = class05433.NZ.N(var1, class05388, this.L);
      class03264 class03264x = y(class05433.Nz.N(var1, class05388, this.L));
      this.N.accept(u(var1, class03264x, y(class01894), class03264x));
      this.N(var1, class01894);
   }

   private void U() {
      this.N
         .accept(
            class05394.N(class00869.mx)
               .N(N().N(class06665.Nn, 0), N(0))
               .N(N().N(class06665.Nn, 1), N(1))
               .N(N().N(class06665.ys, class06662.field_12466), y(class05387.N(class00869.mx, "_small_leaves")))
               .N(N().N(class06665.ys, class06662.field_12468), y(class05387.N(class00869.mx, "_large_leaves")))
         );
   }

   public final void U(class00891 var1, class00891 var2) {
      class03264 class03264x = y(class05387.N(class00869.vq, "_on"));
      class03264 class03264x = y(class05433.Lv.N(var1, class05388.y(var1), this.L));
      this.N.accept(class05427.N(var1).N(N(class06665.k, class03264x, class03264x)).N(d));
      this.N.accept(class05427.N(var2).N(N(class06665.k, class03264x, class03264x)).N(d));
      this.y.N(var1.B(), var2.B());
   }

   public void z(class00891 var1) {
      class05388 class05388 = class05388.y(var1);
      class03264 class03264x = y(class05433.NU.N(var1, class05388, this.L));
      class01894 class01894 = class05433.NE.N(var1, class05388, this.L);
      class03264 class03264x = y(class05433.NW.N(var1, class05388, this.L));
      this.N.accept(L(var1, class03264x, y(class01894), class03264x));
      this.N(var1, class01894);
   }

   public final void z(class00891 var1, class00891 var2) {
      class03264 class03264xxx = y(class05387.N(var1));
      class03264 class03264x = y(class05387.N(var1, "_powered"));
      class03264 class03264xx = y(class05387.N(var1, "_lit"));
      class03264 class03264xxx = y(class05387.N(var1, "_lit_powered"));
      this.y.N(var1.B(), var2.B());
      this.N.accept(N(var2, class03264xxx, class03264xx, class03264x, class03264xxx));
   }

   private void z() {
      class03264 class03264x = y(class05387.N(class00869.ni, "_top"));
      class03264 class03264x = y(class05387.N(class00869.ni, "_bottom"));
      this.N
         .accept(class05427.N(class00869.ni).N(class05415.N(class06665.NB).N(class08059.field_12607, class03264x).N(class08059.field_12609, class03264x)).N(Y));
   }

   public static class05399 u(class00891 var0, class03264 var1, class03264 var2, class03264 var3) {
      return class05427.N(var0)
         .N(
            class05415.N(class06665.f, class06665.NZ, class06665.d)
               .N(class07211.field_11043, class08052.field_12617, false, var2)
               .N(class07211.field_11035, class08052.field_12617, false, var2)
               .N(class07211.field_11034, class08052.field_12617, false, var2)
               .N(class07211.field_11039, class08052.field_12617, false, var2)
               .N(class07211.field_11043, class08052.field_12619, false, var1)
               .N(class07211.field_11035, class08052.field_12619, false, var1)
               .N(class07211.field_11034, class08052.field_12619, false, var1)
               .N(class07211.field_11039, class08052.field_12619, false, var1)
               .N(class07211.field_11043, class08052.field_12617, true, var3)
               .N(class07211.field_11035, class08052.field_12617, true, var3.N(U))
               .N(class07211.field_11034, class08052.field_12617, true, var3.N(z))
               .N(class07211.field_11039, class08052.field_12617, true, var3.N(E))
               .N(class07211.field_11043, class08052.field_12619, true, var3)
               .N(class07211.field_11035, class08052.field_12619, true, var3.N(U))
               .N(class07211.field_11034, class08052.field_12619, true, var3.N(z))
               .N(class07211.field_11039, class08052.field_12619, true, var3.N(E))
         );
   }

   public static class05399 u(class00891 var0, class03264 var1, class03264 var2) {
      return class05427.N(var0).N(N(class06665.k, var2, var1));
   }

   public final void u(class00891 var1, class00891 var2) {
      class05428 class05428 = class05428.n.get(var1);
      class03264 class03264x = y(class05428.N(var1, this.L));
      this.N.accept(N(var1, class03264x));
      class03264 class03264x = y(class05433.NK.N(var2, class05428.y(), this.L));
      this.N.accept(class05427.N(var2, class03264x).N(Y));
      this.N(var1);
   }

   public final void u(class00891 var1, class05432 var2) {
      this.N(var1, "_top");
      this.L(var1, var2);
   }

   private void u() {
      this.e(class00869.Rc);
      class01894 class01894 = this.N(class06570.MJ, class00869.Rc);
      this.N(class00869.Rc, class01894, class08825.N(-12012264));
   }

   public final void u(class00891 var1, class01343 var2) {
      class03264 class03264x = y(var2.N(var1, this.L));
      class01894 class01894 = class05388.N(var1, "_front_on");
      class03264 class03264x = y(var2.get(var1).N(var1x -> var1x.N(class05418.M, class01894)).N(var1, "_on", this.L));
      this.N.accept(class05427.N(var1).N(N(class06665.n, class03264x, class03264x)).N(Y));
   }

   public final void u(class00891 var1) {
      this.N.accept(class05427.N(var1).N(class05415.N(class06665.yk).N(var2 -> {
         String sx = "_" + var2;
         class01894 class01894 = class05388.N(var1, sx);
         return y(class05433.L.N(var1, sx, new class05388().N(class05418.N, class01894), this.L));
      })));
      this.N(var1, class05387.N(var1, "_0"));
   }

   private void r() {
      class00891 class00891 = class00869.nF;
      class05388 class05388xxxxxxx = class05388.N(class00891, "_front_off", "_side_off", "_top", "_bottom");
      class05388 class05388x = class05388.N(class00891, "_front_on", "_side_on", "_top", "_bottom");
      class05388 class05388xx = class05388.N(class00891, "_front_ejecting", "_side_on", "_top", "_bottom");
      class05388 class05388xxx = class05388.N(class00891, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      class01894 class01894 = class05433.Lb.N(class00891, class05388xxxxxxx, this.L);
      class03264 class03264xxxxxxx = y(class01894);
      class03264 class03264x = y(class05433.Lb.N(class00891, "_active", class05388x, this.L));
      class03264 class03264xx = y(class05433.Lb.N(class00891, "_unlocking", class05388xx, this.L));
      class03264 class03264xxx = y(class05433.Lb.N(class00891, "_ejecting_reward", class05388xxx, this.L));
      class05388 class05388xxxx = class05388.N(class00891, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      class05388 class05388xxxxx = class05388.N(class00891, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      class05388 class05388xxxxxx = class05388.N(class00891, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      class05388 class05388xxxxxxx = class05388.N(class00891, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      class03264 class03264xxxx = y(class05433.Lb.N(class00891, "_ominous", class05388xxxx, this.L));
      class03264 class03264xxxxx = y(class05433.Lb.N(class00891, "_active_ominous", class05388xxxxx, this.L));
      class03264 class03264xxxxxx = y(class05433.Lb.N(class00891, "_unlocking_ominous", class05388xxxxxx, this.L));
      class03264 class03264xxxxxxx = y(class05433.Lb.N(class00891, "_ejecting_reward_ominous", class05388xxxxxxx, this.L));
      this.N(class00891, class01894);
      this.N.accept(class05427.N(class00891).N(class05415.N(class02271.y, class02271.u).N((var8x, var9x) -> {
         return switch (var8x) {
            case field_48899 -> var9x ? class03264xxx : class03264xxxxxxx;
            case field_48900 -> var9x ? class03264xx : class03264xxxxxx;
            case field_48901 -> var9x ? class03264x : class03264xxxxx;
            case field_48902 -> var9x ? class03264 : class03264xxxx;
         };
      })).N(Y));
   }

   public class01894 y(class06581 var1, class00891 var2, String var3) {
      class01894 class01894x = class05388.V(var2);
      class01894 class01894x = class05388.N(var2, var3);
      return class05433.Ly.N(class05387.N(var1), class05388.L(class01894x, class01894x), this.L);
   }

   public static class05399 y(class00891 var0, class03674 var1, class05388 var2, BiConsumer<class01894, class08819> var3) {
      class03264 class03264 = y(class05433.R.N(var0, var2, var3));
      return N(var0, class03264);
   }

   public static class01975 y(class08437... var0) {
      return new class08525(class08509.field_22850, Stream.of(var0).map(class08437::N).toList());
   }

   public final void y(class00891 var1, class00891 var2, class06563 var3) {
      class03264 class03264 = y(class05387.N("bed"));
      this.N.accept(N(var1, class03264));
      class06581 class06581 = var1.B();
      class01894 class01894 = class05433.Li.N(class05387.N(class06581), class05388.l(var2), this.L);
      this.y.N(class06581, class08825.N(class01894, new class00346(var3)));
   }

   public final void y(class00891 var1, String var2) {
      class06581 class06581 = var1.B();
      if (class06581 != class06570.N) {
         class01894 class01894 = this.y(class06581, var1, var2);
         this.N(class06581, class01894);
      }
   }

   public static class03264 y(class03674 var0) {
      return N(var0, var0.N(z), var0.N(U), var0.N(E));
   }

   public static class05399 y(class00891 var0, class03264 var1, class03264 var2, class03264 var3) {
      return class05427.N(var0)
         .N(
            class05415.N(class06665.f, class06665.NZ, class06665.ym)
               .N(class07211.field_11034, class08052.field_12617, class08061.field_12710, var2)
               .N(class07211.field_11039, class08052.field_12617, class08061.field_12710, var2.N(U).N(R))
               .N(class07211.field_11035, class08052.field_12617, class08061.field_12710, var2.N(z).N(R))
               .N(class07211.field_11043, class08052.field_12617, class08061.field_12710, var2.N(E).N(R))
               .N(class07211.field_11034, class08052.field_12617, class08061.field_12709, var3)
               .N(class07211.field_11039, class08052.field_12617, class08061.field_12709, var3.N(U).N(R))
               .N(class07211.field_11035, class08052.field_12617, class08061.field_12709, var3.N(z).N(R))
               .N(class07211.field_11043, class08052.field_12617, class08061.field_12709, var3.N(E).N(R))
               .N(class07211.field_11034, class08052.field_12617, class08061.field_12708, var3.N(E).N(R))
               .N(class07211.field_11039, class08052.field_12617, class08061.field_12708, var3.N(z).N(R))
               .N(class07211.field_11035, class08052.field_12617, class08061.field_12708, var3)
               .N(class07211.field_11043, class08052.field_12617, class08061.field_12708, var3.N(U).N(R))
               .N(class07211.field_11034, class08052.field_12617, class08061.field_12713, var1)
               .N(class07211.field_11039, class08052.field_12617, class08061.field_12713, var1.N(U).N(R))
               .N(class07211.field_11035, class08052.field_12617, class08061.field_12713, var1.N(z).N(R))
               .N(class07211.field_11043, class08052.field_12617, class08061.field_12713, var1.N(E).N(R))
               .N(class07211.field_11034, class08052.field_12617, class08061.field_12712, var1.N(E).N(R))
               .N(class07211.field_11039, class08052.field_12617, class08061.field_12712, var1.N(z).N(R))
               .N(class07211.field_11035, class08052.field_12617, class08061.field_12712, var1)
               .N(class07211.field_11043, class08052.field_12617, class08061.field_12712, var1.N(U).N(R))
               .N(class07211.field_11034, class08052.field_12619, class08061.field_12710, var2.N(B).N(R))
               .N(class07211.field_11039, class08052.field_12619, class08061.field_12710, var2.N(B).N(U).N(R))
               .N(class07211.field_11035, class08052.field_12619, class08061.field_12710, var2.N(B).N(z).N(R))
               .N(class07211.field_11043, class08052.field_12619, class08061.field_12710, var2.N(B).N(E).N(R))
               .N(class07211.field_11034, class08052.field_12619, class08061.field_12709, var3.N(B).N(z).N(R))
               .N(class07211.field_11039, class08052.field_12619, class08061.field_12709, var3.N(B).N(E).N(R))
               .N(class07211.field_11035, class08052.field_12619, class08061.field_12709, var3.N(B).N(U).N(R))
               .N(class07211.field_11043, class08052.field_12619, class08061.field_12709, var3.N(B).N(R))
               .N(class07211.field_11034, class08052.field_12619, class08061.field_12708, var3.N(B).N(R))
               .N(class07211.field_11039, class08052.field_12619, class08061.field_12708, var3.N(B).N(U).N(R))
               .N(class07211.field_11035, class08052.field_12619, class08061.field_12708, var3.N(B).N(z).N(R))
               .N(class07211.field_11043, class08052.field_12619, class08061.field_12708, var3.N(B).N(E).N(R))
               .N(class07211.field_11034, class08052.field_12619, class08061.field_12713, var1.N(B).N(z).N(R))
               .N(class07211.field_11039, class08052.field_12619, class08061.field_12713, var1.N(B).N(E).N(R))
               .N(class07211.field_11035, class08052.field_12619, class08061.field_12713, var1.N(B).N(U).N(R))
               .N(class07211.field_11043, class08052.field_12619, class08061.field_12713, var1.N(B).N(R))
               .N(class07211.field_11034, class08052.field_12619, class08061.field_12712, var1.N(B).N(R))
               .N(class07211.field_11039, class08052.field_12619, class08061.field_12712, var1.N(B).N(U).N(R))
               .N(class07211.field_11035, class08052.field_12619, class08061.field_12712, var1.N(B).N(z).N(R))
               .N(class07211.field_11043, class08052.field_12619, class08061.field_12712, var1.N(B).N(E).N(R))
         );
   }

   public static class05415<class08503> y() {
      return class05415.y(class06665.V).N(class07185.field_11052, i).N(class07185.field_11051, M).N(class07185.field_11048, M.N(z));
   }

   public final void y(class00891 var1, class06581 var2) {
      this.y(var2);
      this.e(var1);
   }

   public void y(class06581 var1) {
      this.N(var1, this.N(var1));
   }

   public static class05399 y(class00891 var0, class03264 var1, class03264 var2) {
      return class05394.N(var0)
         .N(var1)
         .N(N().N(class06665.c, true), var2.N(R))
         .N(N().N(class06665.X, true), var2.N(z).N(R))
         .N(N().N(class06665.a, true), var2.N(U).N(R))
         .N(N().N(class06665.p, true), var2.N(E).N(R));
   }

   public final void y(class00891 var1) {
      class03674 class03674x = N(class05428.N.N(var1, this.L));
      class03674 class03674x = N(class05428.L.N(var1, this.L));
      this.N.accept(class05427.N(var1, N(class03674x, class03674x)));
   }

   public final void y(class00891 var1, class01343 var2) {
      class03264 class03264 = y(var2.N(var1, this.L));
      this.N.accept(class05427.N(var1, class03264).N(Y));
   }

   public static class05399 y(class00891 var0, class03264 var1) {
      return class05427.N(var0, var1).N(y());
   }

   public final void y(class00891 var1, class05432 var2, class05388 var3) {
      class03264 class03264 = y(var2.N().N(var1, var3, this.L));
      this.N.accept(N(var1, class03264));
   }

   public final void y(class00891 var1, class01894 var2) {
      class03264 class03264 = y(class05433.NN.N(var1, class05388.B(var2), this.L));
      this.N.accept(N(var1, class03264));
   }

   public static class03264 y(class01894 var0) {
      return N(N(var0));
   }

   public final void y(class00891 var1, class00891 var2) {
      class03264 class03264xx = y(class05433.NB.N(var1));
      class03264 class03264x = y(class05433.NZ.N(var1));
      class03264 class03264xx = y(class05433.Nz.N(var1));
      this.y.N(var1.B(), var2.B());
      this.N.accept(u(var2, class03264xx, class03264x, class03264xx));
   }

   public final void y(class00891 var1, class05432 var2) {
      class05388 class05388 = var2.N(var1);
      this.y(var1, var2, class05388);
   }

   public final void y(class00891 var1, class00891 var2, class05432 var3) {
      this.y(var1, var3);
      class05388 class05388 = var3.y(var1);
      class03264 class03264 = y(var3.y().N(var2, class05388, this.L));
      this.N.accept(N(var2, class03264));
   }

   public final void y(class01343 var1, class00891... var2) {
      for (class00891 class00891 : var2) {
         class03264 class03264 = y(var1.N(class00891, this.L));
         this.N.accept(class05427.N(class00891, class03264).N(k));
      }
   }

   public final void E(class00891 var1, class00891 var2) {
      class01894 class01894x = class05428.l.N(var1, this.L);
      class01894 class01894x = class05428.d.N(var1, this.L);
      this.y(var1.B());
      this.y.N(var1.B(), var2.B());
      this.N.accept(class05427.N(var1).N(N(class06665.W, y(class01894x), y(class01894x))));
      this.N.accept(class05427.N(var2).N(N(class06665.W, y(class01894x), y(class01894x))));
   }

   public final class05424 E(class00891 var1) {
      return new class05424(this, class05388.T(var1));
   }

   private void E() {
      class01894 class01894 = class05388.N(class00869.PF, "_top_open");
      class03264 class03264x = y(class05428.R.N(class00869.PF, this.L));
      class03264 class03264x = y(class05428.R.get(class00869.PF).N(var1x -> var1x.N(class05418.R, class01894)).N(class00869.PF, "_open", this.L));
      this.N.accept(class05427.N(class00869.PF).N(class05415.N(class06665.d).N(false, class03264x).N(true, class03264x)).N(d));
   }

   private void A() {
      this.N(class00869.nH);
      this.N.accept(N(class00869.nH, y(class05387.N(class00869.nH))));
   }

   public static class08437 N() {
      return new class08437();
   }

   public final void N(class00891 var1, @Nullable class06563 var2) {
      this.T(var1);
      class06581 class06581 = var1.B();
      class01894 class01894 = class05433.Lu.N(class06581, class05388.l(var1), this.L);
      class08895 class08895 = var2 != null ? class08825.N(class01894, new class00357(var2)) : class08825.N(class01894, new class00357());
      this.y.N(class06581, class08895);
   }

   public static class08503 N(class05288 var0) {
      return switch (var0) {
         case field_23382 -> M;
         case field_23383 -> M.N(U);
         case field_23384 -> M.N(E);
         case field_23381 -> M.N(z);
         case field_23386 -> Z.N(U);
         case field_23387 -> Z;
         case field_23388 -> Z.N(z);
         case field_23385 -> Z.N(E);
         case field_23391 -> i;
         case field_23392 -> U;
         case field_23389 -> E;
         case field_23390 -> z;
      };
   }

   public final void N(class00891 var1, class00891 var2, class07030 var3, class01894 var4) {
      class03264 class03264 = y(class05387.N("skull"));
      this.N.accept(N(var1, class03264));
      this.N.accept(N(var2, class03264));
      if (var3 == class07032.field_11510) {
         this.y.N(var1.B(), class08825.N(var4, new class08767()));
      } else {
         this.y.N(var1.B(), class08825.N(var4, new class00355(var3)));
      }
   }

   public static class03264 N(class03674 var0) {
      return new class03264(class04540.N(var0));
   }

   public final void N(class00891 var1, class01894 var2, class08843 var3) {
      this.y.N(var1.B(), class08825.N(var2, var3));
   }

   public final class01894 N(class06581 var1, class00891 var2, String var3) {
      return class05433.yD.N(class05387.N(var1), class05388.U(class05388.N(var2, var3)), this.L);
   }

   public class01894 N(class06581 var1, class00891 var2) {
      return class05433.yD.N(class05387.N(var1), class05388.K(var2), this.L);
   }

   public static class03674 N(class01894 var0) {
      return new class03674(var0);
   }

   public final class01894 N(class06581 var1) {
      return class05433.yD.N(class05387.N(var1), class05388.y(var1), this.L);
   }

   public final void N(class00891 var1, class00335 var2) {
      class06581 class06581 = var1.B();
      class01894 class01894 = class05387.N(class06581);
      this.y.N(class06581, class08825.N(class01894, var2));
   }

   public void N(class00891 var1, class01894 var2) {
      this.y.N(var1.B(), class08825.N(var2));
   }

   public final void N(class06581 var1, class01894 var2) {
      this.y.N(var1, class08825.N(var2));
   }

   public final void N(class06581 var1, class06581 var2) {
      class01894 class01894 = this.N(var1);
      this.N(var1, class01894);
      this.N(var2, class01894);
   }

   public final void N(class00891 var1, class00891 var2, class02774 var3) {
      class03264 class03264 = y(class05433.NN.N(var1, class05388.B(class05388.V(var2)), this.L));
      class01894 class01894 = class05387.y("template_copper_golem_statue");
      this.N.accept(N(var1, class03264));
      this.y
         .N(
            var1.B(),
            class08825.N(
               class08981.L,
               class08825.N(class01894, new class08106(var3, class08973.field_61414)),
               Map.of(
                  class08973.field_61415,
                  class08825.N(class01894, new class08106(var3, class08973.field_61415)),
                  class08973.field_61417,
                  class08825.N(class01894, new class08106(var3, class08973.field_61417)),
                  class08973.field_61416,
                  class08825.N(class01894, new class08106(var3, class08973.field_61416))
               )
            )
         );
   }

   public final void N(class00891 var1, class00891 var2, class06563 var3) {
      class03264 class03264 = y(class05387.N("banner"));
      class01894 class01894 = class05387.y("template_banner");
      this.N.accept(N(var1, class03264));
      this.N.accept(N(var2, class03264));
      class06581 class06581 = var1.B();
      this.y.N(class06581, class08825.N(class01894, new class00364(var3)));
   }

   public static class03264 N(class03674... var0) {
      return new class03264(class04540.N(Arrays.stream(var0).map(var0x -> new class04523<>(var0x, 1)).toList()));
   }

   public final void N(class00891 var1, class00891 var2, class01894 var3, boolean var4) {
      this.M(var1, var2);
      class06581 class06581 = var1.B();
      class01894 class01894 = class05433.LR.N(class06581, class05388.l(var2), this.L);
      class08895 class08895x = class08825.N(class01894, new class00360(var3));
      if (var4) {
         class08895 class08895x = class08825.N(class01894, new class00360(class00344.N));
         this.y.N(class06581, class08825.y(class08895x, class08895x));
      } else {
         this.y.N(class06581, class08895x);
      }
   }

   public static class08437 N(class06667 var0, boolean var1) {
      return N().N(var0, var1);
   }

   public static class01975 N(class08437... var0) {
      return new class08525(class08509.field_22851, Stream.of(var0).map(class08437::N).toList());
   }

   @SafeVarargs
   public static <T extends Enum<T> & class05033> class08437 N(class08064<T> var0, T var1, T... var2) {
      return N().N(var0, (T)var1, (T[])var2);
   }

   public static class05399 N(class00891 var0, class03674 var1, class05388 var2, BiConsumer<class01894, class08819> var3) {
      class03674 class03674 = N(class05433.i.N(var0, var2, var3));
      return class05427.N(var0, N(var1, class03674));
   }

   public final void N(class00891 var1, class01343 var2, class01343 var3) {
      class03264 class03264x = y(var2.N(var1, this.L));
      class03264 class03264x = y(var3.N(var1, this.L));
      this.N.accept(L(var1, class03264x, class03264x));
   }

   public void N(class00891 var1, class01343 var2) {
      class03264 class03264 = y(var2.N(var1, this.L));
      this.N.accept(y(var1, class03264));
   }

   public static class05399 N(class00891 var0, class05388 var1, BiConsumer<class01894, class08819> var2) {
      class03264 class03264xx = y(class05433.M.N(var0, var1, var2));
      class03264 class03264x = y(class05433.B.N(var0, var1, var2));
      class03264 class03264xx = y(class05433.Z.N(var0, var1, var2));
      return class05427.N(var0)
         .N(class05415.N(class06665.V).N(class07185.field_11048, class03264xx).N(class07185.field_11052, class03264x).N(class07185.field_11051, class03264xx));
   }

   public static class05427 N(class00891 var0, class03264 var1) {
      return class05427.N(var0, var1);
   }

   public static class05399 N(class00891 var0, class03264 var1, class03264 var2, class03264 var3, class03264 var4, boolean var5) {
      return class05427.N(var0)
         .N(class05415.N(class06665.v, class06665.d).N(false, false, var2).N(true, false, var4).N(false, true, var1).N(true, true, var3))
         .N(var5 ? R : i)
         .N(k);
   }

   public final class03264 N(class07211 var1, class06337 var2) {
      String sx = "_" + var1.method_15434() + "_" + var2.method_15434();
      class05388 class05388 = class05388.L(class05388.N(class00869.vp, sx));
      return y(class05433.Nm.N(class00869.vp, sx, class05388, this.L));
   }

   public void N(class00891 var1, class01343 var2, int var3) {
      class01894 class01894 = var2.N(var1, this.L);
      this.N.accept(N(var1, y(class01894)));
      this.N(var1, class01894, class08825.N(var3));
   }

   public final class01894 N(class00891 var1, String var2, class05403 var3, Function<class01894, class05388> var4) {
      return var3.N(var1, var2, (class05388)var4.apply(class05388.N(var1, var2)), this.L);
   }

   public final class01894 N(class01343 var1, class00891 var2, String var3) {
      return var1.N(var2x -> var2x.N(class05418.Z, class05388.N(var2, var3)).N(class05418.u, class05388.N(var2, "_top" + var3))).N(var2, var3, this.L);
   }

   public static class05399 N(class00891 var0, class03264 var1, class03264 var2) {
      return class05427.N(var0)
         .N(class05415.N(class06665.k).N(false, var1).N(true, var2))
         .N(
            class05415.y(class06665.D, class06665.f)
               .N(class06657.field_12475, class07211.field_11034, z)
               .N(class06657.field_12475, class07211.field_11039, E)
               .N(class06657.field_12475, class07211.field_11035, U)
               .N(class06657.field_12475, class07211.field_11043, i)
               .N(class06657.field_12471, class07211.field_11034, z.N(M).N(R))
               .N(class06657.field_12471, class07211.field_11039, E.N(M).N(R))
               .N(class06657.field_12471, class07211.field_11035, U.N(M).N(R))
               .N(class06657.field_12471, class07211.field_11043, M.N(R))
               .N(class06657.field_12473, class07211.field_11034, E.N(B))
               .N(class06657.field_12473, class07211.field_11039, z.N(B))
               .N(class06657.field_12473, class07211.field_11035, B)
               .N(class06657.field_12473, class07211.field_11043, U.N(B))
         );
   }

   public final void N(class00891 var1, class03264 var2, class05388 var3) {
      class03264 class03264 = y(class05433.yJ.N(var1, var3, this.L));
      this.N.accept(class05427.N(var1).N(N(class06665.z, var2, class03264)).N(l));
   }

   public static class05415<class03264> N(class06667 var0, class03264 var1, class03264 var2) {
      return class05415.N(var0).N(true, var1).N(false, var2);
   }

   public static class03264 N(class03674 var0, class03674 var1) {
      return N(var0, var1, var0.N(U), var1.N(U));
   }

   public static class05399 N(class00891 var0, class03264 var1, class03264 var2, class03264 var3) {
      return class05394.N(var0)
         .N(N().N(class06665.e, true), var1)
         .N(N().N(class06665.NN, class06008.field_22179), var2.N(R))
         .N(N().N(class06665.r, class06008.field_22179), var2.N(z).N(R))
         .N(N().N(class06665.Ny, class06008.field_22179), var2.N(U).N(R))
         .N(N().N(class06665.NL, class06008.field_22179), var2.N(E).N(R))
         .N(N().N(class06665.NN, class06008.field_22180), var3.N(R))
         .N(N().N(class06665.r, class06008.field_22180), var3.N(z).N(R))
         .N(N().N(class06665.Ny, class06008.field_22180), var3.N(U).N(R))
         .N(N().N(class06665.NL, class06008.field_22180), var3.N(E).N(R));
   }

   public final void N(class00891 var1, class01894 var2, class01894 var3, class01894 var4, class01894 var5, class01894 var6, class01894 var7) {
      class03264 class03264xxxxx = y(var2);
      class03264 class03264x = y(var3);
      class03264 class03264xx = y(var4);
      class03264 class03264xxx = y(var5);
      class03264 class03264xxxx = y(var6);
      class03264 class03264xxxxx = y(var7);
      this.N
         .accept(
            class05394.N(var1)
               .N(class03264xxxxx)
               .N(N().N(class06665.c, false).N(class06665.X, false).N(class06665.a, false).N(class06665.p, false), class03264x)
               .N(N().N(class06665.c, true).N(class06665.X, false).N(class06665.a, false).N(class06665.p, false), class03264xx)
               .N(N().N(class06665.c, false).N(class06665.X, true).N(class06665.a, false).N(class06665.p, false), class03264xx.N(z))
               .N(N().N(class06665.c, false).N(class06665.X, false).N(class06665.a, true).N(class06665.p, false), class03264xxx)
               .N(N().N(class06665.c, false).N(class06665.X, false).N(class06665.a, false).N(class06665.p, true), class03264xxx.N(z))
               .N(N().N(class06665.c, true), class03264xxxx)
               .N(N().N(class06665.X, true), class03264xxxx.N(z))
               .N(N().N(class06665.a, true), class03264xxxxx)
               .N(N().N(class06665.p, true), class03264xxxxx.N(z))
         );
   }

   public final void N(class00891 var1, class06581 var2) {
      class03264 class03264 = y(class05433.NN.N(var1, class05388.N(var2), this.L));
      this.N.accept(N(var1, class03264));
   }

   public static class05399 N(
      class00891 var0, class03264 var1, class03264 var2, class03264 var3, class03264 var4, class03264 var5, class03264 var6, class03264 var7, class03264 var8
   ) {
      return class05427.N(var0)
         .N(
            class05415.N(class06665.f, class06665.NB, class06665.yz, class06665.d)
               .N(class07211.field_11034, class08059.field_12607, class08058.field_12588, false, var1)
               .N(class07211.field_11035, class08059.field_12607, class08058.field_12588, false, var1.N(z))
               .N(class07211.field_11039, class08059.field_12607, class08058.field_12588, false, var1.N(U))
               .N(class07211.field_11043, class08059.field_12607, class08058.field_12588, false, var1.N(E))
               .N(class07211.field_11034, class08059.field_12607, class08058.field_12586, false, var3)
               .N(class07211.field_11035, class08059.field_12607, class08058.field_12586, false, var3.N(z))
               .N(class07211.field_11039, class08059.field_12607, class08058.field_12586, false, var3.N(U))
               .N(class07211.field_11043, class08059.field_12607, class08058.field_12586, false, var3.N(E))
               .N(class07211.field_11034, class08059.field_12607, class08058.field_12588, true, var2.N(z))
               .N(class07211.field_11035, class08059.field_12607, class08058.field_12588, true, var2.N(U))
               .N(class07211.field_11039, class08059.field_12607, class08058.field_12588, true, var2.N(E))
               .N(class07211.field_11043, class08059.field_12607, class08058.field_12588, true, var2)
               .N(class07211.field_11034, class08059.field_12607, class08058.field_12586, true, var4.N(E))
               .N(class07211.field_11035, class08059.field_12607, class08058.field_12586, true, var4)
               .N(class07211.field_11039, class08059.field_12607, class08058.field_12586, true, var4.N(z))
               .N(class07211.field_11043, class08059.field_12607, class08058.field_12586, true, var4.N(U))
               .N(class07211.field_11034, class08059.field_12609, class08058.field_12588, false, var5)
               .N(class07211.field_11035, class08059.field_12609, class08058.field_12588, false, var5.N(z))
               .N(class07211.field_11039, class08059.field_12609, class08058.field_12588, false, var5.N(U))
               .N(class07211.field_11043, class08059.field_12609, class08058.field_12588, false, var5.N(E))
               .N(class07211.field_11034, class08059.field_12609, class08058.field_12586, false, var7)
               .N(class07211.field_11035, class08059.field_12609, class08058.field_12586, false, var7.N(z))
               .N(class07211.field_11039, class08059.field_12609, class08058.field_12586, false, var7.N(U))
               .N(class07211.field_11043, class08059.field_12609, class08058.field_12586, false, var7.N(E))
               .N(class07211.field_11034, class08059.field_12609, class08058.field_12588, true, var6.N(z))
               .N(class07211.field_11035, class08059.field_12609, class08058.field_12588, true, var6.N(U))
               .N(class07211.field_11039, class08059.field_12609, class08058.field_12588, true, var6.N(E))
               .N(class07211.field_11043, class08059.field_12609, class08058.field_12588, true, var6)
               .N(class07211.field_11034, class08059.field_12609, class08058.field_12586, true, var8.N(E))
               .N(class07211.field_11035, class08059.field_12609, class08058.field_12586, true, var8)
               .N(class07211.field_11039, class08059.field_12609, class08058.field_12586, true, var8.N(z))
               .N(class07211.field_11043, class08059.field_12609, class08058.field_12586, true, var8.N(U))
         );
   }

   public static class03264 N(int var0) {
      String sx = "_age" + var0;
      return new class03264(
         class04540.N(IntStream.range(1, 5).mapToObj(var1x -> new class04523<>(N(class05387.N(class00869.mx, var1x + sx)), 1)).collect(Collectors.toList()))
      );
   }

   public static <T extends Comparable<T>> class05415<class03264> N(class08092<T> var0, T var1, class03264 var2, class03264 var3) {
      return class05415.N(var0).N(var3x -> var3x.compareTo(var1) >= 0 ? var2 : var3);
   }

   public final void N(class00891 var1, Function<class00891, class05388> var2) {
      class05388 class05388x = ((class05388)var2.apply(var1)).y(class05418.Z, class05418.L);
      class05388 class05388x = class05388x.L(class05418.M, class05388.N(var1, "_front_honey"));
      class01894 class01894x = class05433.T.N(var1, "_empty", class05388x, this.L);
      class01894 class01894x = class05433.T.N(var1, "_honey", class05388x, this.L);
      this.y.N(var1.B(), class08825.N(class04593.L, class08825.N(class01894x), Map.of(5, class08825.N(class01894x))));
      this.N.accept(class05427.N(var1).N(N(class04593.L, 5, y(class01894x), y(class01894x))).N(Y));
   }

   public final void N(class00891 var1, class08092<Integer> var2, int... var3) {
      this.y(var1.B());
      if (var2.N().size() != var3.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();
         this.N.accept(class05427.N(var1).N(class05415.<Integer>N(var2).N(var4x -> {
            int ix = var3[var4x];
            return y((class01894)int2objectopenhashmap.computeIfAbsent(ix, var2xx -> this.N(var1, "_stage" + var2xx, class05433.yz, class05388::M)));
         })));
      }
   }

   public final void N(class00891 var1, class05432 var2, class08092<Integer> var3, int... var4) {
      if (var3.N().size() != var4.length) {
         throw new IllegalArgumentException("missing values for property: " + var3);
      } else {
         this.y(var1.B());
         this.N.accept(class05427.N(var1).N(class05415.<Integer>N(var3).N(var4x -> {
            String sx = "_stage" + var4[var4x];
            class05388 class05388 = class05388.L(class05388.N(var1, sx));
            return y(var2.N().N(var1, sx, class05388, this.L));
         })));
      }
   }

   public final void N(class00891 var1, class00891 var2, class00891 var3, class00891 var4, class00891 var5, class00891 var6, class00891 var7, class00891 var8) {
      this.N(var1, class05432.field_22840);
      this.N(var2, class05432.field_22840);
      this.R(var3);
      this.R(var4);
      this.u(var5, var7);
      this.u(var6, var8);
   }

   public final void N(
      class00891 var1,
      class03264 var2,
      Function<class08437, class08437> var3,
      class03264 var4,
      Function<class08437, class08437> var5,
      class03264 var6,
      Function<class08437, class08437> var7,
      class03264 var8,
      Function<class08437, class08437> var9
   ) {
      this.N
         .accept(
            class05394.N(var1)
               .N((class08437)var3.apply(N().N(class06665.f, class07211.field_11043)), var2)
               .N((class08437)var3.apply(N().N(class06665.f, class07211.field_11034)), var2.N(z))
               .N((class08437)var3.apply(N().N(class06665.f, class07211.field_11035)), var2.N(U))
               .N((class08437)var3.apply(N().N(class06665.f, class07211.field_11039)), var2.N(E))
               .N((class08437)var5.apply(N().N(class06665.f, class07211.field_11043)), var4)
               .N((class08437)var5.apply(N().N(class06665.f, class07211.field_11034)), var4.N(z))
               .N((class08437)var5.apply(N().N(class06665.f, class07211.field_11035)), var4.N(U))
               .N((class08437)var5.apply(N().N(class06665.f, class07211.field_11039)), var4.N(E))
               .N((class08437)var7.apply(N().N(class06665.f, class07211.field_11043)), var6)
               .N((class08437)var7.apply(N().N(class06665.f, class07211.field_11034)), var6.N(z))
               .N((class08437)var7.apply(N().N(class06665.f, class07211.field_11035)), var6.N(U))
               .N((class08437)var7.apply(N().N(class06665.f, class07211.field_11039)), var6.N(E))
               .N((class08437)var9.apply(N().N(class06665.f, class07211.field_11043)), var8)
               .N((class08437)var9.apply(N().N(class06665.f, class07211.field_11034)), var8.N(z))
               .N((class08437)var9.apply(N().N(class06665.f, class07211.field_11035)), var8.N(U))
               .N((class08437)var9.apply(N().N(class06665.f, class07211.field_11039)), var8.N(E))
         );
   }

   public final void N(class01343 var1, class00891... var2) {
      for (class00891 class00891 : var2) {
         class03674 class03674 = N(var1.N(class00891, this.L));
         this.N.accept(class05427.N(class00891, y(class03674)));
      }
   }

   public final void N(class00891 var1, class00891 var2, class05432 var3) {
      this.N(var1.B(), var3.N(this, var1));
      this.y(var1, var2, var3);
   }

   public final void N(class00891 var1, class05388 var2) {
      class03264 class03264 = y(class05433.s.N(var1, var2.L(class05418.M, class05388.V(var1)), this.L));
      this.N.accept(class05427.N(var1, class03264).N(Y));
   }

   public final void N(class00891 var1, class00891 var2) {
      class03264 class03264xxxxxxx = y(class05433.t.N(var1));
      class03264 class03264x = y(class05433.G.N(var1));
      class03264 class03264xx = y(class05433.l.N(var1));
      class03264 class03264xxx = y(class05433.d.N(var1));
      class03264 class03264xxxx = y(class05433.w.N(var1));
      class03264 class03264xxxxx = y(class05433.k.N(var1));
      class03264 class03264xxxxxx = y(class05433.Y.N(var1));
      class03264 class03264xxxxxxx = y(class05433.Q.N(var1));
      this.y.N(var1.B(), var2.B());
      this.N.accept(N(var2, class03264xxxxxxx, class03264x, class03264xx, class03264xxx, class03264xxxx, class03264xxxxx, class03264xxxxxx, class03264xxxxxxx));
   }

   public void N(class00891 var1, class00891 var2, class00891 var3) {
      class03264 class03264 = this.R(var2, var1);
      this.N.accept(N(var2, class03264));
      this.N.accept(N(var3, class03264));
      this.y(var2.B());
   }

   public static class05399 N(class00891 var0, class03264 var1, class03264 var2, class03264 var3, class03264 var4) {
      return class05427.N(var0).N(class05415.N(class06665.n, class06665.k).N((var4x, var5) -> {
         if (var4x) {
            return var5 ? var4 : var2;
         } else {
            return var5 ? var3 : var1;
         }
      }));
   }

   public final void N(class00891... var1) {
      class03264 class03264x = y(class05387.N("campfire_off"));

      for (class00891 class00891 : var1) {
         class03264 class03264x = y(class05433.yT.N(class00891, class05388.o(class00891), this.L));
         this.y(class00891.B());
         this.N.accept(class05427.N(class00891).N(N(class06665.n, class03264x, class03264x)).N(k));
      }
   }

   public final void N(class00891 var1, class05432 var2, class05388 var3) {
      this.N(var1);
      this.y(var1, var2, var3);
   }

   public final void N(class00891 var1, class05432 var2) {
      this.N(var1.B(), var2.N(this, var1));
      this.y(var1, var2);
   }

   public final void N(class00891 var1, class00891 var2, BiFunction<class00891, class00891, class05388> var3) {
      class05388 class05388 = (class05388)var3.apply(var1, var2);
      this.N.accept(N(var1, y(class05433.N.N(var1, class05388, this.L))));
   }

   public final void N(class00891 var1, class05388 var2, class05394 var3, class05403 var4, @Nullable Boolean var5, @Nullable class08972 var6) {
      class03264 class03264 = y(var4.N(var1, var2, this.L));
      N((var4x, var5x) -> var3.N(N(var4x, var5, var6), class03264.N(var5x)));
   }

   public static void N(BiConsumer<class07211, class08503> var0) {
      List.of(Pair.of(class07211.field_11043, i), Pair.of(class07211.field_11034, z), Pair.of(class07211.field_11035, U), Pair.of(class07211.field_11039, E))
         .forEach(var1 -> {
            class07211 class07211 = (class07211)var1.getFirst();
            class08503 class08503 = (class08503)var1.getSecond();
            var0.accept(class07211, class08503);
         });
   }

   public static class01975 N(class07211 var0, @Nullable Boolean var1, @Nullable class08972 var2) {
      class08437 class08437x = N(class06665.f, var0);
      if (var1 == null) {
         return class08437x.N();
      } else {
         class08437 class08437x = N(class06665.k, var1.booleanValue());
         return var2 != null ? y(class08437x, class08437x, N(class06665.Nz, var2)) : y(class08437x, class08437x);
      }
   }

   public final void N(class05394 var1, class01975 var2, class08503 var3) {
      List.of(
            Pair.of(class03769.L, class05433.Nf),
            Pair.of(class03769.u, class05433.NC),
            Pair.of(class03769.i, class05433.NS),
            Pair.of(class03769.R, class05433.Nx),
            Pair.of(class03769.M, class05433.ND),
            Pair.of(class03769.B, class05433.Nh)
         )
         .forEach(var4 -> {
            class06667 class06667 = (class06667)var4.getFirst();
            class05403 class05403 = (class05403)var4.getSecond();
            this.N(var1, var2, var3, class06667, class05403, true);
            this.N(var1, var2, var3, class06667, class05403, false);
         });
   }

   public static <T extends class08092<?>> Map<T, class08503> N(class00522<?, ?> var0, Function<class07211, T> var1) {
      Builder builder = ImmutableMap.builderWithExpectedSize(Q.size());
      Q.forEach((var3, var4) -> {
         class08092 class08092 = (class08092)var1.apply(var3);
         if (var0.y(class08092)) {
            builder.put(class08092, var4);
         }
      });
      return builder.build();
   }

   public final void N(class00891 var1) {
      class06581 class06581 = var1.B();
      if (class06581 != class06570.N) {
         this.N(class06581, this.N(class06581, var1));
      }
   }

   public final class03674 N(int var1, int var2) {
      return switch (var2) {
         case 0 -> this.N(var1, "", class05388.y(class05388.V(class00869.my)));
         case 1 -> this.N(var1, "slightly_cracked_", class05388.y(class05388.N(class00869.my, "_slightly_cracked")));
         case 2 -> this.N(var1, "very_cracked_", class05388.y(class05388.N(class00869.my, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   public final void N(class00891 var1, String var2) {
      class06581 class06581 = var1.B();
      if (class06581 != class06570.N) {
         this.N(class06581, this.N(class06581, var1, var2));
      }
   }

   public final void N(class05394 var1, class01975 var2, class08503 var3, class06667 var4, class05403 var5, boolean var6) {
      String sx = var6 ? "_occupied" : "_empty";
      class05388 class05388 = new class05388().N(class05418.y, class05388.N(class00869.LG, sx));
      class05391 class05391 = new class05391(var5, sx);
      class03264 class03264 = y(O.computeIfAbsent(class05391, var4x -> var5.N(class00869.LG, sx, class05388, this.L)));
      var1.N(new class08525(class08509.field_22850, List.of(var2, N().N(var4, var6).N())), class03264.N(var3));
   }

   public final class03674 N(int var1, String var2, class05388 var3) {
      return switch (var1) {
         case 1 -> N(class05433.yV.N(class05387.N(var2 + "turtle_egg"), var3, this.L));
         case 2 -> N(class05433.yH.N(class05387.N("two_" + var2 + "turtle_eggs"), var3, this.L));
         case 3 -> N(class05433.yc.N(class05387.N("three_" + var2 + "turtle_eggs"), var3, this.L));
         case 4 -> N(class05433.yX.N(class05387.N("four_" + var2 + "turtle_eggs"), var3, this.L));
         default -> throw new UnsupportedOperationException();
      };
   }

   public static class05399 N(class00891 var0, class03264 var1, class03264 var2, class03264 var3, class03264 var4, class03264 var5) {
      return class05394.N(var0)
         .N(var1)
         .N(N().N(class06665.c, true), var2)
         .N(N().N(class06665.X, true), var3)
         .N(N().N(class06665.a, true), var4)
         .N(N().N(class06665.p, true), var5);
   }

   private void W() {
      class03264 class03264xxx = y(class05387.N(class00869.sN, "_floor"));
      class03264 class03264x = y(class05387.N(class00869.sN, "_ceiling"));
      class03264 class03264xx = y(class05387.N(class00869.sN, "_wall"));
      class03264 class03264xxx = y(class05387.N(class00869.sN, "_between_walls"));
      this.y(class06570.dx);
      this.N
         .accept(
            class05427.N(class00869.sN)
               .N(
                  class05415.N(class06665.f, class06665.h)
                     .N(class07211.field_11043, class05648.field_17098, class03264xxx)
                     .N(class07211.field_11035, class05648.field_17098, class03264xxx.N(U))
                     .N(class07211.field_11034, class05648.field_17098, class03264xxx.N(z))
                     .N(class07211.field_11039, class05648.field_17098, class03264xxx.N(E))
                     .N(class07211.field_11043, class05648.field_17099, class03264x)
                     .N(class07211.field_11035, class05648.field_17099, class03264x.N(U))
                     .N(class07211.field_11034, class05648.field_17099, class03264x.N(z))
                     .N(class07211.field_11039, class05648.field_17099, class03264x.N(E))
                     .N(class07211.field_11043, class05648.field_17100, class03264xx.N(E))
                     .N(class07211.field_11035, class05648.field_17100, class03264xx.N(z))
                     .N(class07211.field_11034, class05648.field_17100, class03264xx)
                     .N(class07211.field_11039, class05648.field_17100, class03264xx.N(U))
                     .N(class07211.field_11035, class05648.field_17101, class03264xxx.N(z))
                     .N(class07211.field_11043, class05648.field_17101, class03264xxx.N(E))
                     .N(class07211.field_11034, class05648.field_17101, class03264xxx)
                     .N(class07211.field_11039, class05648.field_17101, class03264xxx.N(U))
               )
         );
   }

   public final void W(class00891 var1) {
      this.L(var1, var1);
   }

   public final void W(class00891 var1, class00891 var2) {
      class03264 class03264 = y(class05428.w.N(var1, this.L));
      this.L(var1, class03264);
      this.L(var2, class03264);
   }

   public final void R(class00891 var1, class03264 var2, class03264 var3) {
      this.N.accept(class05427.N(var1).N(class05415.N(class06665.g).N(true, var3).N(false, var2)));
   }

   public void R(class00891 var1) {
      this.L(var1, class05428.N);
   }

   private void R() {
      class00891 class00891 = class00869.Ed;
      this.y(class00891.B());
      class03264 class03264x = y(class05387.N(class00891, "_top"));
      class03264 class03264x = y(class05387.N(class00891, "_bottom"));
      this.i(class00891, class03264x, class03264x);
   }

   public final class03264 R(class00891 var1, class00891 var2) {
      return y(class05433.NN.N(var1, class05388.l(var2), this.L));
   }

   private void NT() {
      this.y(class06570.EZ);
      this.N.accept(class05427.N(class00869.my).N(class05415.N(class06665.No, class06665.Nq).N((var1, var2) -> y(this.N(var1.intValue(), var2.intValue())))));
   }

   private void Ni() {
      class03264 class03264xxx = y(this.N(class00869.vA, "", class05433.NP, class05388::L));
      class03264 class03264x = y(this.N(class00869.vA, "_lit", class05433.NP, class05388::L));
      this.N.accept(class05427.N(class00869.vA).N(N(class06665.y, class03264x, class03264xxx)));
      class03264 class03264xx = y(this.N(class00869.vf, "", class05433.NP, class05388::L));
      class03264 class03264xxx = y(this.N(class00869.vf, "_lit", class05433.NP, class05388::L));
      this.N.accept(class05427.N(class00869.vf).N(N(class06665.y, class03264xxx, class03264xx)));
   }

   public final void O(class00891 var1) {
      this.N.accept(class05427.N(var1, y(class05387.N(var1))).N(d));
   }

   private void O() {
      this.Y(class00869.bd);
      this.Y(class00869.bl);
      this.Y(class00869.bG);
      this.Y(class00869.bt);
   }

   private void Nu() {
      class01894 class01894 = class05387.N(class00869.Pa, "_stable");
      class03264 class03264x = y(class01894);
      class03264 class03264x = y(class05387.N(class00869.Pa, "_unstable"));
      this.N(class00869.Pa, class01894);
      this.N.accept(class05427.N(class00869.Pa).N(N(class06665.u, class03264x, class03264x)));
   }

   private void H() {
      class01894 class01894x = class05388.V(class00869.z);
      class05388 class05388 = new class05388()
         .N(class05418.i, class01894x)
         .y(class05418.i, class05418.L)
         .N(class05418.R, class05388.N(class00869.Z, "_top"))
         .N(class05418.Z, class05388.N(class00869.Z, "_snow"));
      class03264 class03264xx = y(class05433.m.N(class00869.Z, "_snow", class05388, this.L));
      class01894 class01894x = class05387.N(class00869.Z);
      this.R(class00869.Z, y(N(class01894x)), class03264xx);
      this.N(class00869.Z, class01894x, new class08832());
      class03264 class03264x = y(N(class05428.R.get(class00869.RC).N(var1x -> var1x.N(class05418.i, class01894x)).N(class00869.RC, this.L)));
      this.R(class00869.RC, class03264x, class03264xx);
      class03264 class03264xx = y(N(class05428.R.get(class00869.E).N(var1x -> var1x.N(class05418.i, class01894x)).N(class00869.E, this.L)));
      this.R(class00869.E, class03264xx, class03264xx);
   }

   public final void H(class00891 var1) {
      Map map = N(var1.W(), class00318::N);
      class08437 class08437 = N().N(class00318.y, false);
      map.forEach((var1x, var2x) -> class08437.N((class08092<class06008>)var1x, class06008.field_22178));
      class03264 class03264xx = y(class05428.z.N(var1, this.L));
      class03264 class03264x = y(class05428.U.get(var1).N(var1x -> var1x.N(class05418.Z, class05388.N(var1, "_side_tall"))).N(var1, "_side_tall", this.L));
      class03264 class03264xx = y(class05428.U.get(var1).N(var1x -> var1x.N(class05418.Z, class05388.N(var1, "_side_small"))).N(var1, "_side_small", this.L));
      class05394 class05394 = class05394.N(var1);
      class05394.N(N().N(class00318.y, true), class03264xx);
      class05394.N(class08437, class03264xx);
      map.forEach((var4x, var5x) -> {
         class05394.N(N().N((class08092<class06008>)var4x, class06008.field_22180), class03264x.N(var5x));
         class05394.N(N().N((class08092<class06008>)var4x, class06008.field_22179), class03264.N(var5x));
         class05394.N(class08437, class03264x.N(var5x));
      });
      this.N.accept(class05394);
   }

   private void Nz() {
      class05388 class05388 = class05388.N(class00869.is);
      class03264 class03264 = y(class05433.L.N(class00869.ib, class05388, this.L));
      this.N
         .accept(
            class05427.N(class00869.is)
               .N(class05415.N(class06665.NK).N(var1x -> var1x < 8 ? y(class05387.N(class00869.is, "_height" + var1x * 2)) : class03264))
         );
      this.N(class00869.is, class05387.N(class00869.is, "_height2"));
      this.N.accept(N(class00869.ib, class03264));
   }

   private void G() {
      class05388 class05388 = class05388.m(class00869.Ro);
      this.N.accept(N(class00869.Ro, y(class05387.N(class00869.Ro))));
      this.N(class00869.iK, class05388);
      this.N(class00869.iV, class05388);
   }

   public final void G(class00891 var1) {
      class03264 class03264;
      if (var1 == class00869.nq) {
         class03264 = y(class05433.yS.N(var1, class05388.s(var1), this.L));
      } else {
         class03264 = y(class05433.yC.N(var1, class05388.s(var1), this.L));
      }

      this.N.accept(N(var1, class03264));
   }

   private void Nm() {
      this.y(class06570.wN);
      this.N
         .accept(class05427.N(class00869.sM).N(class05415.N(class06665.NG).N(var1 -> y(this.N(class00869.sM, "_stage" + var1, class05433.NP, class05388::L)))));
   }

   private void NZ() {
      this.y(class06570.ui);
      this.N
         .accept(
            class05427.N(class00869.mA)
               .N(
                  class05415.N(class06665.Nx, class06665.q)
                     .N(1, false, y(N(class05387.N("dead_sea_pickle"))))
                     .N(2, false, y(N(class05387.N("two_dead_sea_pickles"))))
                     .N(3, false, y(N(class05387.N("three_dead_sea_pickles"))))
                     .N(4, false, y(N(class05387.N("four_dead_sea_pickles"))))
                     .N(1, true, y(N(class05387.N("sea_pickle"))))
                     .N(2, true, y(N(class05387.N("two_sea_pickles"))))
                     .N(3, true, y(N(class05387.N("three_sea_pickles"))))
                     .N(4, true, y(N(class05387.N("four_sea_pickles"))))
               )
         );
   }

   private void NR() {
      class03264 class03264x = y(class05428.N.N(class00869.MT, this.L));
      class03264 class03264x = y(this.N(class00869.MT, "_on", class05433.L, class05388::y));
      this.N.accept(class05427.N(class00869.MT).N(N(class06665.n, class03264x, class03264x)));
   }

   public final void Y(class00891 var1) {
      class03264 class03264 = y(class05433.NP.N(var1, class05388.L(var1), this.L));
      this.N.accept(class05427.N(var1, class03264).N(d));
   }

   private void Y() {
      class03264 class03264 = y(class05387.N(class00869.ET, "_side"));
      class03674 class03674xxxxxxx = N(class05387.N(class00869.ET, "_noside"));
      class03674 class03674x = N(class05387.N(class00869.ET, "_noside1"));
      class03674 class03674xx = N(class05387.N(class00869.ET, "_noside2"));
      class03674 class03674xxx = N(class05387.N(class00869.ET, "_noside3"));
      class03674 class03674xxxx = class03674xxxxxxx.N(R);
      class03674 class03674xxxxx = class03674x.N(R);
      class03674 class03674xxxxxx = class03674xx.N(R);
      class03674 class03674xxxxxxx = class03674xxx.N(R);
      this.N
         .accept(
            class05394.N(class00869.ET)
               .N(N().N(class06665.c, true), class03264)
               .N(N().N(class06665.X, true), class03264.N(z).N(R))
               .N(N().N(class06665.a, true), class03264.N(U).N(R))
               .N(N().N(class06665.p, true), class03264.N(E).N(R))
               .N(N().N(class06665.e, true), class03264.N(Z).N(R))
               .N(N().N(class06665.H, true), class03264.N(M).N(R))
               .N(
                  N().N(class06665.c, false),
                  new class03264(
                     class04540.N(
                        new class04523<>(class03674xxxxxxx, 2),
                        new class04523<>(class03674x, 1),
                        new class04523<>(class03674xx, 1),
                        new class04523<>(class03674xxx, 1)
                     )
                  )
               )
               .N(
                  N().N(class06665.X, false),
                  new class03264(
                     class04540.N(
                        new class04523<>(class03674xxxxx.N(z), 1),
                        new class04523<>(class03674xxxxxx.N(z), 1),
                        new class04523<>(class03674xxxxxxx.N(z), 1),
                        new class04523<>(class03674xxxx.N(z), 2)
                     )
                  )
               )
               .N(
                  N().N(class06665.a, false),
                  new class03264(
                     class04540.N(
                        new class04523<>(class03674xxxxxx.N(U), 1),
                        new class04523<>(class03674xxxxxxx.N(U), 1),
                        new class04523<>(class03674xxxx.N(U), 2),
                        new class04523<>(class03674xxxxx.N(U), 1)
                     )
                  )
               )
               .N(
                  N().N(class06665.p, false),
                  new class03264(
                     class04540.N(
                        new class04523<>(class03674xxxxxxx.N(E), 1),
                        new class04523<>(class03674xxxx.N(E), 2),
                        new class04523<>(class03674xxxxx.N(E), 1),
                        new class04523<>(class03674xxxxxx.N(E), 1)
                     )
                  )
               )
               .N(
                  N().N(class06665.e, false),
                  new class03264(
                     class04540.N(
                        new class04523<>(class03674xxxx.N(Z), 2),
                        new class04523<>(class03674xxxxxxx.N(Z), 1),
                        new class04523<>(class03674xxxxx.N(Z), 1),
                        new class04523<>(class03674xxxxxx.N(Z), 1)
                     )
                  )
               )
               .N(
                  N().N(class06665.H, false),
                  new class03264(
                     class04540.N(
                        new class04523<>(class03674xxxxxxx.N(M), 1),
                        new class04523<>(class03674xxxxxx.N(M), 1),
                        new class04523<>(class03674xxxxx.N(M), 1),
                        new class04523<>(class03674xxxx.N(M), 2)
                     )
                  )
               )
         );
   }

   private void NB() {
      this.y(class06570.Wg);
      this.N.accept(class05427.N(class00869.iH).N(class05415.N(class06665.Ng, class06665.t, class06665.k).N((var0, var1, var2) -> {
         StringBuilder stringbuilder = new StringBuilder();
         stringbuilder.append('_').append(var0).append("tick");
         if (var2) {
            stringbuilder.append("_on");
         }

         if (var1) {
            stringbuilder.append("_locked");
         }

         return y(class05388.N(class00869.iH, stringbuilder.toString()));
      })).N(k));
   }

   private void NO() {
      this.N(class00869.zY, class00869.zF, class06563.field_7952);
      this.N(class00869.zQ, class00869.zA, class06563.field_7946);
      this.N(class00869.zO, class00869.zf, class06563.field_7958);
      this.N(class00869.zg, class00869.zC, class06563.field_7951);
      this.N(class00869.zI, class00869.zS, class06563.field_7947);
      this.N(class00869.zJ, class00869.zx, class06563.field_7961);
      this.N(class00869.zo, class00869.zD, class06563.field_7954);
      this.N(class00869.zq, class00869.zh, class06563.field_7944);
      this.N(class00869.zK, class00869.zr, class06563.field_7967);
      this.N(class00869.zV, class00869.UN, class06563.field_7955);
      this.N(class00869.ze, class00869.Uy, class06563.field_7945);
      this.N(class00869.zH, class00869.UL, class06563.field_7966);
      this.N(class00869.zc, class00869.Uu, class06563.field_7957);
      this.N(class00869.zX, class00869.Ui, class06563.field_7942);
      this.N(class00869.za, class00869.UR, class06563.field_7964);
      this.N(class00869.zp, class00869.UM, class06563.field_7963);
   }

   private void NL() {
      class01894 class01894 = class05433.LT.N(class00869.bS, class05388.N(false), this.L);
      class03264 class03264x = y(class01894);
      class03264 class03264x = y(class05433.LT.N(class00869.bS, "_can_summon", class05388.N(true), this.L));
      this.N(class00869.bS, class01894);
      this.N.accept(class05427.N(class00869.bS).N(N(class06665.i, class03264x, class03264x)));
   }

   private void NN() {
      class01894 class01894 = class05387.N(class00869.bp, "_inactive");
      class03264 class03264x = y(class01894);
      class03264 class03264x = y(class05387.N(class00869.bp, "_active"));
      this.N(class00869.bp, class01894);
      this.N
         .accept(
            class05427.N(class00869.bp)
               .N(class05415.N(class06665.yv).N(var2x -> var2x != class01193.field_28122 && var2x != class01193.field_44631 ? class03264x : class03264))
         );
   }

   private void NM() {
      class05388 class05388x = class05388.Y(class00869.iW);
      class05388 class05388x = class05388.Z(class05388.N(class00869.iW, "_off"));
      class03264 class03264xxx = y(class05433.yg.N(class00869.iW, class05388x, this.L));
      class03264 class03264x = y(class05433.yY.N(class00869.iW, "_off", class05388x, this.L));
      this.N.accept(class05427.N(class00869.iW).N(N(class06665.n, class03264xxx, class03264x)));
      class03264 class03264xx = y(class05433.yI.N(class00869.im, class05388x, this.L));
      class03264 class03264xxx = y(class05433.yO.N(class00869.im, "_off", class05388x, this.L));
      this.N.accept(class05427.N(class00869.im).N(N(class06665.n, class03264xx, class03264xxx)).N(w));
      this.N(class00869.iW);
   }

   private void Nb() {
      class01894 class01894 = class05387.N(class00869.mu, "_hydration_0");
      this.N(class00869.mu, class01894);
      Function function = var1x -> {
         String sx = switch (var1x) {
            case 1 -> "_hydration_1";
            case 2 -> "_hydration_2";
            case 3 -> "_hydration_3";
            default -> "_hydration_0";
         };
         class05388 class05388 = class05388.y(sx);
         return class05433.ye.N(class00869.mu, sx, class05388, this.L);
      };
      this.N.accept(class05427.N(class00869.mu).N(class05415.N(class00009.L).N(var1x -> y((class01894)function.apply(var1x)))).N(Y));
   }

   private void NQ() {
      this.N(class00869.vk, class00869.bx, class02774.field_28704);
      this.N(class00869.vY, class00869.bD, class02774.field_28705);
      this.N(class00869.vQ, class00869.bh, class02774.field_28706);
      this.N(class00869.vO, class00869.br, class02774.field_28707);
      this.P(class00869.vk, class00869.vg);
      this.P(class00869.vY, class00869.vI);
      this.P(class00869.vQ, class00869.vJ);
      this.P(class00869.vO, class00869.vo);
   }

   private void NG() {
      class01894 class01894 = class05387.N(class00869.y);
      class03674 class03674x = N(class01894);
      class03674 class03674x = N(class05387.N(class00869.y, "_mirrored"));
      this.N.accept(class05427.N(class00869.Rv, N(class03674x, class03674x)));
      this.N(class00869.Rv, class01894);
   }

   private void Nt() {
      class03264 class03264 = y(class05433.L.N(class00869.EI, class05388.y(class05387.N("magma")), this.L));
      this.N.accept(N(class00869.EI, class03264));
   }

   private void NE() {
      class01894 class01894 = class05428.N.N(class00869.sh, this.L);
      this.N(class00869.sh, class01894);
      this.N
         .accept(
            class05427.N(class00869.sh)
               .N(class05415.N(class06665.yP).N(var1x -> y(this.N(class00869.sh, "_" + var1x.method_15434(), class05433.L, class05388::y))))
         );
   }

   private void Nv() {
      class01894 class01894x = class05388.N(class00869.bC, "_bottom");
      class05388 class05388x = new class05388()
         .N(class05418.i, class01894x)
         .N(class05418.R, class05388.N(class00869.bC, "_top"))
         .N(class05418.Z, class05388.N(class00869.bC, "_side"));
      class05388 class05388x = new class05388()
         .N(class05418.i, class01894x)
         .N(class05418.R, class05388.N(class00869.bC, "_top_bloom"))
         .N(class05418.Z, class05388.N(class00869.bC, "_side_bloom"));
      class01894 class01894x = class05433.m.N(class00869.bC, class05388x, this.L);
      class03264 class03264x = y(class01894x);
      class03264 class03264x = y(class05433.m.N(class00869.bC, "_bloom", class05388x, this.L));
      this.N.accept(class05427.N(class00869.bC).N(class05415.N(class06665.L).N(var2x -> var2x ? class03264 : class03264x)));
      this.N(class00869.bC, class01894x);
   }

   private void Nk() {
      class00891 class00891x = class00869.m;
      class03264 class03264xx = y(class05387.N(class00891x));
      class05388 class05388 = class05388.N(class00891x);
      class00891 class00891x = class00869.Uk;
      class03264 class03264x = y(class05433.Ny.N(class00891x, class05388, this.L));
      class03264 class03264xx = y(class05433.NL.N(class00891x, class05388, this.L));
      this.N.accept(i(class00891x, class03264x, class03264xx, class03264xx));
   }

   private void Ns() {
      this.N(class00869.MG);
      this.N
         .accept(
            class05427.N(class00869.MG)
               .N(class05415.N(class06665.N, class06665.k).N((var0, var1) -> y(class05387.N(class00869.MG, (var0 ? "_attached" : "") + (var1 ? "_on" : "")))))
               .N(Y)
         );
   }

   private void NU() {
      this.N.accept(class05427.N(class00869.Pr, y(class05387.N(class00869.Pr))).N(Y));
   }

   private void NW() {
      HashMap hashmap = new HashMap();

      for (class00235 class00235 : class00235.values()) {
         hashmap.put(class00235, this.N(class00869.TN, "_" + class00235.method_15434(), class05433.L, class05388::y));
      }

      this.N.accept(class05427.N(class00869.TN).N(class05415.N(class06665.yo).N(var1x -> y((class01894)hashmap.get(var1x)))));
      this.y
         .N(
            class06570.sc,
            class08825.N(
               class08620.y,
               class08825.N((class01894)hashmap.get(class00235.field_56024)),
               Map.of(
                  class00235.field_56026,
                  class08825.N((class01894)hashmap.get(class00235.field_56026)),
                  class00235.field_56025,
                  class08825.N((class01894)hashmap.get(class00235.field_56025)),
                  class00235.field_56027,
                  class08825.N((class01894)hashmap.get(class00235.field_56027))
               )
            )
         );
   }

   private void Nn() {
      class00891 class00891 = class00869.LG;
      class03264 class03264 = y(class05387.N(class00891));
      class05394 class05394 = class05394.N(class00891);
      N((var3x, var4) -> {
         class01975 class01975 = N().N(class06665.f, var3x).N();
         class05394.N(class01975, class03264.N(var4).N(R));
         this.N(class05394, class01975, var4);
      });
      this.N.accept(class05394);
      this.N(class00891, class05387.N(class00891, "_inventory"));
      O.clear();
   }

   private void Nw() {
      class01894 class01894xxx = class05388.N(class00869.sr, "_top");
      class01894 class01894x = class05388.N(class00869.sr, "_bottom");
      class01894 class01894xx = class05388.N(class00869.sr, "_side");
      class01894 class01894xxx = class05388.N(class00869.sr, "_lock");
      class05388 class05388 = new class05388()
         .N(class05418.P, class01894xx)
         .N(class05418.W, class01894xx)
         .N(class05418.E, class01894xx)
         .N(class05418.L, class01894xxx)
         .N(class05418.z, class01894xxx)
         .N(class05418.U, class01894x)
         .N(class05418.m, class01894xxx);
      this.N.accept(class05427.N(class00869.sr, y(class05433.y.N(class00869.sr, class05388, this.L))).N(class05415.y(class06665.x).N(class05404::N)));
   }

   private void Ny() {
      class01894 class01894 = class05387.N(class00869.bF, "_inactive");
      class03264 class03264x = y(class01894);
      class03264 class03264x = y(class05387.N(class00869.bF, "_active"));
      this.N(class00869.bF, class01894);
      this.N
         .accept(
            class05427.N(class00869.bF)
               .N(class05415.N(class06665.yv).N(var2x -> var2x != class01193.field_28122 && var2x != class01193.field_44631 ? class03264x : class03264))
               .N(Y)
         );
   }

   private void Nj() {
      this.y(class06570.Ez);
      this.N.accept(class05427.N(class00869.mL).N(class05415.N(class03561.L).N(var1 -> {
         String sx = switch (var1) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         class05388 class05388 = class05388.N(sx);
         return y(class05433.yx.N(class00869.mL, sx, class05388, this.L));
      })));
   }

   private void Ng() {
      this.N(class00869.LA, class00869.m, class00344.y, true);
      this.N(class00869.BH, class00869.m, class00344.L, true);
      this.N(class00869.Mt, class00869.LV, class00344.u, false);
   }

   private void NJ() {
      this.y(class00869.yM, class00869.yV, class06563.field_7952);
      this.y(class00869.yB, class00869.ye, class06563.field_7946);
      this.y(class00869.yZ, class00869.yH, class06563.field_7958);
      this.y(class00869.yz, class00869.yc, class06563.field_7951);
      this.y(class00869.yU, class00869.yX, class06563.field_7947);
      this.y(class00869.yE, class00869.ya, class06563.field_7961);
      this.y(class00869.yW, class00869.yp, class06563.field_7954);
      this.y(class00869.ym, class00869.yF, class06563.field_7944);
      this.y(class00869.yP, class00869.yA, class06563.field_7967);
      this.y(class00869.ys, class00869.yf, class06563.field_7955);
      this.y(class00869.yT, class00869.yC, class06563.field_7945);
      this.y(class00869.yb, class00869.yS, class06563.field_7966);
      this.y(class00869.yj, class00869.yx, class06563.field_7957);
      this.y(class00869.yv, class00869.yD, class06563.field_7942);
      this.y(class00869.yn, class00869.yh, class06563.field_7964);
      this.y(class00869.yt, class00869.yr, class06563.field_7963);
   }

   private void NI() {
      this.N(class00869.vj, class00869.bx, class00344.i, false);
      this.N(class00869.vv, class00869.bD, class00344.R, false);
      this.N(class00869.vn, class00869.bh, class00344.M, false);
      this.N(class00869.vt, class00869.br, class00344.B, false);
      this.P(class00869.vj, class00869.vG);
      this.P(class00869.vv, class00869.vl);
      this.P(class00869.vn, class00869.vd);
      this.P(class00869.vt, class00869.vw);
   }
}
