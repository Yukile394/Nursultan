package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class class02016 extends class06903 {
   private static final ImmutableList<class07310> L = ImmutableList.of(class06570.NW, class06570.Nm);
   private static final ImmutableList<class07310> u = ImmutableList.of(class06570.NP, class06570.Ns, class06570.TR);
   private static final ImmutableList<class07310> i = ImmutableList.of(class06570.NT, class06570.Nb, class06570.TB);
   private static final ImmutableList<class07310> R = ImmutableList.of(class06570.Nj, class06570.Nv, class06570.NQ, class06570.Tz);
   private static final ImmutableList<class07310> M = ImmutableList.of(class06570.Nk, class06570.NY);
   private static final ImmutableList<class07310> B = ImmutableList.of(class06570.Nd, class06570.Nw);
   private static final ImmutableList<class07310> Z = ImmutableList.of(class06570.Nn, class06570.Nt);
   private static final ImmutableList<class07310> z = ImmutableList.of(class06570.NG, class06570.Nl);

   private void L() {
      class06510 class06510 = this.y(class01226.NB);

      for (class06563 class06563 : class06563.values()) {
         class00258.N(class01990.field_40635, class06510, class06510.method_8101(class06559.N(class06563)), class07027.N(class06563).B())
            .y("shulker_box_dye")
            .y("has_shulker_box", this.N(class01226.NB))
            .N(this.y);
      }
   }

   class02016(class01929 var1, class03719 var2) {
      super(var1, var2);
   }

   private void u() {
      class06510 class06510 = this.y(class01226.LE);

      for (class06563 class06563 : class06563.values()) {
         class06559 class06559 = class06559.N(class06563);
         class00258.N(class01990.field_40638, class06510, class06510.method_8101(class06559), class05462.N(class06563))
            .y("bundle_dye")
            .y(L(class06559), this.y(class06559))
            .N(this.y);
      }
   }

   public static Stream<class02005> y() {
      return Stream.of(
            Pair.of(class06570.kv, class03247.b),
            Pair.of(class06570.ki, class03247.L),
            Pair.of(class06570.ku, class03247.y),
            Pair.of(class06570.kB, class03247.R),
            Pair.of(class06570.kj, class03247.T),
            Pair.of(class06570.kb, class03247.s),
            Pair.of(class06570.kT, class03247.P),
            Pair.of(class06570.kE, class03247.z),
            Pair.of(class06570.kL, class03247.N),
            Pair.of(class06570.kP, class03247.W),
            Pair.of(class06570.ks, class03247.m),
            Pair.of(class06570.kU, class03247.Z),
            Pair.of(class06570.kW, class03247.U),
            Pair.of(class06570.kz, class03247.B),
            Pair.of(class06570.kZ, class03247.M),
            Pair.of(class06570.kM, class03247.i),
            Pair.of(class06570.km, class03247.E),
            Pair.of(class06570.kR, class03247.u)
         )
         .map(var0 -> {
            class06581 class06581 = (class06581)var0.getFirst();
            class05946 class05946x = (class05946)var0.getSecond();
            class05946 class05946x = class05946.N(class04227.yV, class01894.y(u(class06581) + "_smithing_trim"));
            return new class02005(class06581, class05946x, class05946x);
         });
   }

   @Override
   public void N() {
      this.y.method_62738();
      this.N(class03767.N(class03794.N));
      this.N(class00869.b, class01226.t, 4);
      this.y(class00869.s, class01226.n, 4);
      this.y(class00869.sQ, class01226.k, 4);
      this.N(class00869.v, class01226.j, 4);
      this.N(class00869.t, class01226.v, 4);
      this.y(class00869.T, class01226.d, 4);
      this.y(class00869.m, class01226.b, 4);
      this.y(class00869.P, class01226.G, 4);
      this.y(class00869.sO, class01226.Y, 4);
      this.y(class00869.G, class01226.l, 4);
      this.N((class07310)class00869.Nl, (class07310)class00869.Ny);
      this.N((class07310)class00869.Nt, (class07310)class00869.r);
      this.N((class07310)class00869.Nw, (class07310)class00869.Nu);
      this.N((class07310)class00869.n, (class07310)class00869.Ni);
      this.N((class07310)class00869.NG, (class07310)class00869.NN);
      this.N((class07310)class00869.Nv, (class07310)class00869.D);
      this.N((class07310)class00869.Nn, (class07310)class00869.h);
      this.N((class07310)class00869.sj, (class07310)class00869.sT);
      this.N((class07310)class00869.sz, (class07310)class00869.sB);
      this.N((class07310)class00869.Nk, (class07310)class00869.NR);
      this.N((class07310)class00869.NI, (class07310)class00869.NW);
      this.N((class07310)class00869.NO, (class07310)class00869.NU);
      this.N((class07310)class00869.No, (class07310)class00869.NP);
      this.N((class07310)class00869.Nq, (class07310)class00869.Ns);
      this.N((class07310)class00869.Ng, (class07310)class00869.NE);
      this.N((class07310)class00869.NY, (class07310)class00869.NT);
      this.N((class07310)class00869.NQ, (class07310)class00869.Nz);
      this.N((class07310)class00869.sv, (class07310)class00869.sb);
      this.N((class07310)class00869.sU, (class07310)class00869.sZ);
      this.N((class07310)class00869.NK, (class07310)class00869.Nb);
      this.y(class06570.sw, class00869.b);
      this.y(class06570.st, class00869.s);
      this.y(class06570.sO, class00869.v);
      this.y(class06570.sI, class00869.t);
      this.y(class06570.sl, class00869.T);
      this.y(class06570.sb, class00869.m);
      this.y(class06570.sv, class00869.P);
      this.y(class06570.so, class00869.G);
      this.i(class00869.Ll, class06570.yx);
      this.i(class00869.Ld, class06570.LP);
      this.i(class00869.Lw, class06570.yC);
      this.i(class00869.Lk, class06570.yD);
      this.i(class00869.LY, class06570.Ly);
      this.i(class00869.LQ, class06570.yh);
      this.i(class00869.LO, class06570.yS);
      this.i(class00869.Lg, class06570.LN);
      this.i(class00869.LI, class06570.yA);
      this.i(class00869.LJ, class06570.yr);
      this.i(class00869.Lo, class06570.yf);
      this.i(class00869.Lq, class06570.LL);
      List list = List.of(
         class06570.vY,
         class06570.vl,
         class06570.vd,
         class06570.vt,
         class06570.vv,
         class06570.vw,
         class06570.vs,
         class06570.vn,
         class06570.vb,
         class06570.vP,
         class06570.vm,
         class06570.vj,
         class06570.vG,
         class06570.vk,
         class06570.vT,
         class06570.vW
      );
      List list1 = List.of(
         class06570.un,
         class06570.uT,
         class06570.ub,
         class06570.uP,
         class06570.uW,
         class06570.uj,
         class06570.uZ,
         class06570.um,
         class06570.uU,
         class06570.uB,
         class06570.uM,
         class06570.uE,
         class06570.us,
         class06570.uv,
         class06570.uz,
         class06570.uR
      );
      List list2 = List.of(
         class06570.vS,
         class06570.vF,
         class06570.vA,
         class06570.va,
         class06570.vc,
         class06570.vf,
         class06570.vK,
         class06570.vX,
         class06570.ve,
         class06570.vq,
         class06570.vo,
         class06570.vH,
         class06570.vp,
         class06570.vC,
         class06570.vV,
         class06570.vJ
      );
      List list3 = List.of(
         class06570.ZH,
         class06570.Zq,
         class06570.ZK,
         class06570.ZJ,
         class06570.Zg,
         class06570.ZV,
         class06570.Zk,
         class06570.ZI,
         class06570.ZQ,
         class06570.Zw,
         class06570.Zd,
         class06570.ZO,
         class06570.Zo,
         class06570.Ze,
         class06570.ZY,
         class06570.Zl
      );
      List list4 = List.of(
         class06570.sB,
         class06570.su,
         class06570.si,
         class06570.sy,
         class06570.Pr,
         class06570.sR,
         class06570.PS,
         class06570.sN,
         class06570.PD,
         class06570.PC,
         class06570.Pf,
         class06570.Ph,
         class06570.sL,
         class06570.sM,
         class06570.Px,
         class06570.PA
      );
      this.N(list, list1, "wool", class01990.field_40634);
      this.N(list, list2, "bed_dye", class01990.field_40635);
      this.N(list, list3, "carpet_dye", class01990.field_40635);
      this.N(list, list4, "harness_dye", class01990.field_40639);
      this.M(class00869.zb, class00869.yr);
      this.B(class06570.vS, class00869.yr);
      this.Z(class06570.lv, class00869.yr);
      this.M(class00869.zm, class00869.yS);
      this.B(class06570.vF, class00869.yS);
      this.Z(class06570.ls, class00869.yS);
      this.M(class00869.zP, class00869.yx);
      this.B(class06570.vA, class00869.yx);
      this.Z(class06570.lT, class00869.yx);
      this.M(class00869.zE, class00869.yf);
      this.B(class06570.va, class00869.yf);
      this.Z(class06570.lm, class00869.yf);
      this.M(class00869.zz, class00869.yF);
      this.B(class06570.vc, class00869.yF);
      this.Z(class06570.lE, class00869.yF);
      this.M(class00869.zs, class00869.yD);
      this.B(class06570.vf, class00869.yD);
      this.Z(class06570.lb, class00869.yD);
      this.M(class00869.zR, class00869.yc);
      this.B(class06570.vK, class00869.yc);
      this.Z(class06570.lB, class00869.yc);
      this.M(class00869.zU, class00869.yA);
      this.B(class06570.vX, class00869.yA);
      this.Z(class06570.lW, class00869.yA);
      this.M(class00869.zB, class00869.ya);
      this.B(class06570.ve, class00869.ya);
      this.Z(class06570.lz, class00869.ya);
      this.M(class00869.zi, class00869.yH);
      this.B(class06570.vq, class00869.yH);
      this.Z(class06570.lM, class00869.yH);
      this.M(class00869.zu, class00869.ye);
      this.B(class06570.vo, class00869.ye);
      this.Z(class06570.lR, class00869.ye);
      this.M(class00869.zZ, class00869.yp);
      this.B(class06570.vH, class00869.yp);
      this.Z(class06570.lU, class00869.yp);
      this.M(class00869.zW, class00869.yC);
      this.B(class06570.vp, class00869.yC);
      this.Z(class06570.lP, class00869.yC);
      this.M(class00869.zT, class00869.yh);
      this.B(class06570.vC, class00869.yh);
      this.Z(class06570.lj, class00869.yh);
      this.M(class00869.zL, class00869.yV);
      this.B(class06570.vJ, class00869.yV);
      this.Z(class06570.li, class00869.yV);
      this.M(class00869.zM, class00869.yX);
      this.B(class06570.vV, class00869.yX);
      this.Z(class06570.lZ, class00869.yX);
      this.M(class00869.vD, class00869.ny);
      this.M(class00869.nC, class00869.nf);
      this.U(class06570.PA, class00869.yV);
      this.U(class06570.Pf, class00869.ye);
      this.U(class06570.PC, class00869.yH);
      this.U(class06570.PS, class00869.yc);
      this.U(class06570.Px, class00869.yX);
      this.U(class06570.PD, class00869.ya);
      this.U(class06570.Ph, class00869.yp);
      this.U(class06570.Pr, class00869.yF);
      this.U(class06570.sN, class00869.yA);
      this.U(class06570.sy, class00869.yf);
      this.U(class06570.sL, class00869.yC);
      this.U(class06570.su, class00869.yS);
      this.U(class06570.si, class00869.yx);
      this.U(class06570.sR, class00869.yD);
      this.U(class06570.sM, class00869.yh);
      this.U(class06570.sB, class00869.yr);
      this.z(class00869.RL, class06570.vY);
      this.E(class00869.ZI, class00869.RL);
      this.W(class00869.ZI, class06570.vY);
      this.z(class00869.ih, class06570.vl);
      this.E(class00869.ZY, class00869.ih);
      this.W(class00869.ZY, class06570.vl);
      this.z(class00869.ir, class06570.vd);
      this.E(class00869.ZQ, class00869.ir);
      this.W(class00869.ZQ, class06570.vd);
      this.z(class00869.ix, class06570.vt);
      this.E(class00869.Zw, class00869.ix);
      this.W(class00869.Zw, class06570.vt);
      this.z(class00869.iC, class06570.vv);
      this.E(class00869.Zl, class00869.iC);
      this.W(class00869.Zl, class06570.vv);
      this.z(class00869.RN, class06570.vw);
      this.E(class00869.ZO, class00869.RN);
      this.W(class00869.ZO, class06570.vw);
      this.z(class00869.ip, class06570.vs);
      this.E(class00869.Zv, class00869.ip);
      this.W(class00869.Zv, class06570.vs);
      this.z(class00869.iS, class06570.vn);
      this.E(class00869.Zd, class00869.iS);
      this.W(class00869.Zd, class06570.vn);
      this.z(class00869.iA, class06570.vb);
      this.E(class00869.Zt, class00869.iA);
      this.W(class00869.Zt, class06570.vb);
      this.z(class00869.ia, class06570.vP);
      this.E(class00869.Zj, class00869.ia);
      this.W(class00869.Zj, class06570.vP);
      this.z(class00869.iX, class06570.vm);
      this.E(class00869.Zb, class00869.iX);
      this.W(class00869.Zb, class06570.vm);
      this.z(class00869.f_if__1, class06570.vj);
      this.E(class00869.ZG, class00869.f_if__1);
      this.W(class00869.ZG, class06570.vj);
      this.z(class00869.iD, class06570.vG);
      this.E(class00869.Zk, class00869.iD);
      this.W(class00869.Zk, class06570.vG);
      this.z(class00869.Ry, class06570.vk);
      this.E(class00869.Zg, class00869.Ry);
      this.W(class00869.Zg, class06570.vk);
      this.z(class00869.ic, class06570.vW);
      this.E(class00869.ZT, class00869.ic);
      this.W(class00869.ZT, class06570.vW);
      this.z(class00869.iF, class06570.vT);
      this.E(class00869.Zn, class00869.iF);
      this.W(class00869.Zn, class06570.vT);
      this.m(class00869.Zs, class06570.vY);
      this.m(class00869.ZE, class06570.vl);
      this.m(class00869.ZW, class06570.vd);
      this.m(class00869.Zz, class06570.vt);
      this.m(class00869.ZB, class06570.vv);
      this.m(class00869.Zm, class06570.vw);
      this.m(class00869.Zu, class06570.vs);
      this.m(class00869.ZZ, class06570.vn);
      this.m(class00869.ZR, class06570.vb);
      this.m(class00869.ZL, class06570.vP);
      this.m(class00869.Zy, class06570.vm);
      this.m(class00869.ZM, class06570.vj);
      this.m(class00869.ZU, class06570.vG);
      this.m(class00869.ZP, class06570.vk);
      this.m(class00869.ZN, class06570.vW);
      this.m(class00869.Zi, class06570.vT);
      this.P(class00869.WD, class06570.vY);
      this.P(class00869.Wf, class06570.vl);
      this.P(class00869.WC, class06570.vd);
      this.P(class00869.WF, class06570.vt);
      this.P(class00869.Wa, class06570.vv);
      this.P(class00869.WS, class06570.vw);
      this.P(class00869.We, class06570.vs);
      this.P(class00869.Wp, class06570.vn);
      this.P(class00869.Wc, class06570.vb);
      this.P(class00869.WV, class06570.vP);
      this.P(class00869.WK, class06570.vm);
      this.P(class00869.WX, class06570.vj);
      this.P(class00869.WA, class06570.vG);
      this.P(class00869.Wx, class06570.vk);
      this.P(class00869.Wq, class06570.vW);
      this.P(class00869.WH, class06570.vT);
      this.N(class00869.mu);
      this.N(class01990.field_40635, class06570.ww)
         .N('S', class06570.Th)
         .N('H', class06570.wR)
         .N("S")
         .N("H")
         .y("has_string", this.y(class06570.Th))
         .y("has_honeycomb", this.y(class06570.wR))
         .N(this.y);
      this.s(class00869.by, class06570.vY);
      this.s(class00869.TD, class06570.vl);
      this.s(class00869.Th, class06570.vd);
      this.s(class00869.TS, class06570.vt);
      this.s(class00869.Tf, class06570.vv);
      this.s(class00869.Tr, class06570.vw);
      this.s(class00869.Ta, class06570.vs);
      this.s(class00869.TC, class06570.vn);
      this.s(class00869.TF, class06570.vb);
      this.s(class00869.TX, class06570.vP);
      this.s(class00869.Tc, class06570.vm);
      this.s(class00869.TA, class06570.vj);
      this.s(class00869.Tx, class06570.vG);
      this.s(class00869.bN, class06570.vk);
      this.s(class00869.TH, class06570.vW);
      this.s(class00869.Tp, class06570.vT);
      this.y(class01990.field_40634, class00869.Rb, 1).N(class00869.nB).N(class06570.bL).y("has_mud", this.y(class00869.nB)).N(this.y);
      this.N(class01990.field_40634, class00869.Rj, 4).N('#', class00869.Rb).N("##").N("##").y("has_packed_mud", this.y(class00869.Rb)).N(this.y);
      this.y(class01990.field_40634, class00869.NB, 1).N(class00869.nB).N(class06570.yc).y("has_mangrove_roots", this.y(class00869.NM)).N(this.y);
      this.N(class01990.field_40637, class00869.Bh, 6)
         .N('#', class00869.iW)
         .N('S', class06570.Tx)
         .N('X', class06570.TM)
         .N("XSX")
         .N("X#X")
         .N("XSX")
         .y("has_rail", this.y(class00869.um))
         .N(this.y);
      this.y(class01990.field_40634, class00869.M, 2).N(class00869.i).N(class00869.W).y("has_stone", this.y(class00869.i)).N(this.y);
      this.N(class01990.field_40635, class00869.BK)
         .N('I', class00869.Lj)
         .N('i', class06570.TM)
         .N("III")
         .N(" i ")
         .N("iii")
         .y("has_iron_block", this.y(class00869.Lj))
         .N(this.y);
      this.N(class01990.field_40635, class06570.GA)
         .N('/', class06570.Tx)
         .N('_', class00869.Ul)
         .N("///")
         .N(" / ")
         .N("/_/")
         .y("has_stone_slab", this.y(class00869.Ul))
         .N(this.y);
      this.N(class01990.field_40639, class06570.sD, 4)
         .N('#', class06570.Tx)
         .N('X', class06570.bJ)
         .N('Y', class06570.Tr)
         .N("X")
         .N("#")
         .N("Y")
         .y("has_feather", this.y(class06570.Tr))
         .y("has_flint", this.y(class06570.bJ))
         .N(this.y);
      this.N(class01990.field_40635, class00869.PF, 1)
         .N('P', class01226.y)
         .N('S', class01226.z)
         .N("PSP")
         .N("P P")
         .N("PSP")
         .y("has_planks", this.N(class01226.y))
         .y("has_wood_slab", this.N(class01226.z))
         .N(this.y);
      this.N(class01990.field_40642, class00869.MO)
         .N('S', class06570.Gg)
         .N('G', class00869.ND)
         .N('O', class00869.LV)
         .N("GGG")
         .N("GSG")
         .N("OOO")
         .y("has_nether_star", this.y(class06570.Gg))
         .N(this.y);
      this.N(class01990.field_40635, class00869.TR)
         .N('P', class01226.y)
         .N('H', class06570.wR)
         .N("PPP")
         .N("HHH")
         .N("PPP")
         .y("has_honeycomb", this.y(class06570.wR))
         .N(this.y);
      this.y(class01990.field_40640, class06570.lY).N(class06570.sC).N(class06570.lw, 6).y("has_beetroot", this.y(class06570.lw)).N(this.y);
      this.y(class01990.field_40642, class06570.vY).N(class06570.vz).y("black_dye").y("has_ink_sac", this.y(class06570.vz)).N(this.y);
      this.N(class06570.vY, class00869.Lm, "black_dye");
      this.y(class01990.field_40641, class06570.nj, 2).N(class06570.nU).y("has_blaze_rod", this.y(class06570.nU)).N(this.y);
      this.y(class01990.field_40642, class06570.vl).N(class06570.TL).y("blue_dye").y("has_lapis_lazuli", this.y(class06570.TL)).N(this.y);
      this.N(class06570.vl, class00869.LW, "blue_dye");
      this.y(class01990.field_40634, class00869.mf, class00869.zn);
      this.y(class01990.field_40642, class06570.vQ, 3).N(class06570.vO).y("bonemeal").y("has_bone", this.y(class06570.vO)).N(this.y);
      this.y(class01990.field_40642, class06570.vQ, class01990.field_40634, class06570.zf, "bone_meal_from_bone_block", "bonemeal");
      this.y(class01990.field_40642, class06570.jY).N(class06570.jk, 3).N(class06570.js).y("has_paper", this.y(class06570.jk)).N(this.y);
      this.N(class01990.field_40634, class00869.Lt)
         .N('#', class01226.y)
         .N('X', class06570.jY)
         .N("###")
         .N("XXX")
         .N("###")
         .y("has_book", this.y(class06570.jY))
         .N(this.y);
      this.N(class01990.field_40639, class06570.sx)
         .N('#', class06570.Tx)
         .N('X', class06570.Th)
         .N(" #X")
         .N("# X")
         .N(" #X")
         .y("has_string", this.y(class06570.Th))
         .N(this.y);
      this.N(class01990.field_40642, class06570.sC, 4)
         .N('#', class01226.y)
         .N("# #")
         .N(" # ")
         .y("has_brown_mushroom", this.y(class00869.Ls))
         .y("has_red_mushroom", this.y(class00869.LT))
         .y("has_mushroom_stew", this.y(class06570.TD))
         .N(this.y);
      this.N(class01990.field_40640, class06570.bu).N('#', class06570.bL).N("###").y("has_wheat", this.y(class06570.bL)).N(this.y);
      this.N(class01990.field_40641, class00869.MB)
         .N('B', class06570.nU)
         .N('#', class01226.ye)
         .N(" B ")
         .N("###")
         .y("has_blaze_rod", this.y(class06570.nU))
         .N(this.y);
      this.N(class01990.field_40634, class00869.Lv).N('#', class06570.jl).N("##").N("##").y("has_brick", this.y(class06570.jl)).N(this.y);
      this.y(class01990.field_40642, class06570.vd).N(class06570.vE).y("brown_dye").y("has_cocoa_beans", this.y(class06570.vE)).N(this.y);
      this.N(class01990.field_40642, class06570.jU).N('#', class06570.TM).N("# #").N(" # ").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40640, class00869.ie)
         .N('A', class06570.jT)
         .N('B', class06570.vg)
         .N('C', class06570.bL)
         .N('E', class01226.Nw)
         .N("AAA")
         .N("BEB")
         .N("CCC")
         .y("has_egg", this.N(class01226.Nw))
         .N(this.y);
      this.N(class01990.field_40635, class00869.si)
         .N('L', class01226.g)
         .N('S', class06570.Tx)
         .N('C', class01226.yT)
         .N(" S ")
         .N("SCS")
         .N("LLL")
         .y("has_stick", this.y(class06570.Tx))
         .y("has_coal", this.N(class01226.yT))
         .N(this.y);
      this.N(class01990.field_40637, class06570.sm)
         .N('#', class06570.jr)
         .N('X', class06570.Gb)
         .N("# ")
         .N(" X")
         .y("has_carrot", this.y(class06570.Gb))
         .N(this.y);
      this.N(class01990.field_40637, class06570.sP)
         .N('#', class06570.jr)
         .N('X', class06570.up)
         .N("# ")
         .N(" X")
         .y("has_warped_fungus", this.y(class06570.up))
         .N(this.y);
      this.N(class01990.field_40641, class00869.MZ).N('#', class06570.TM).N("# #").N("# #").N("###").y("has_water_bucket", this.y(class06570.jE)).N(this.y);
      this.N(class01990.field_40635, class00869.TL).N('#', class01226.z).N("# #").N("# #").N("###").y("has_wood_slab", this.N(class01226.z)).N(this.y);
      this.N(class01990.field_40635, class00869.LA)
         .N('#', class01226.y)
         .N("###")
         .N("# #")
         .N("###")
         .y("has_lots_of_items", class06912.R.N(new class00843(Optional.empty(), new class00855(class00836.y(10), class00836.L, class00836.L), List.of())))
         .N(this.y);
      this.N(class01990.field_40635, class00869.vj)
         .N('#', class06570.TZ)
         .N('X', class06570.Rv)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_copper_chest", this.y(class06570.YB))
         .N(this.y);
      this.y(class01990.field_40637, class06570.sz).N(class00869.LA).N(class06570.sZ).y("has_minecart", this.y(class06570.sZ)).N(this.y);
      this.L(class06570.sk, class06570.sw);
      this.L(class06570.sG, class06570.st);
      this.L(class06570.sg, class06570.sO);
      this.L(class06570.sJ, class06570.sI);
      this.L(class06570.sd, class06570.sl);
      this.L(class06570.sj, class06570.sb);
      this.L(class06570.sn, class06570.sv);
      this.L(class06570.sq, class06570.so);
      this.R(class01990.field_40634, class00869.BS, class06510.method_8101(class00869.UJ))
         .y("has_chiseled_quartz_block", this.y(class00869.BS))
         .y("has_quartz_block", this.y(class00869.BC))
         .y("has_quartz_pillar", this.y(class00869.Bx))
         .N(this.y);
      this.R(class01990.field_40634, class00869.RT, class06510.method_8101(class00869.UO)).y("has_tag", this.N(class01226.L)).N(this.y);
      this.N(class01990.field_40634, class00869.in, class06570.jd);
      this.N(class01990.field_40638, class06570.vN)
         .N('#', class06570.TU)
         .N('X', class06570.WY)
         .N(" # ")
         .N("#X#")
         .N(" # ")
         .y("has_redstone", this.y(class06570.WY))
         .N(this.y);
      this.N(class01990.field_40642, class06570.sh, class01990.field_40634, class06570.NI);
      this.N(class01990.field_40634, class00869.U, 4).N('D', class00869.z).N('G', class00869.X).N("DG").N("GD").y("has_gravel", this.y(class00869.X)).N(this.y);
      this.N(class01990.field_40636, class00869.Ba)
         .N('#', class00869.iW)
         .N('X', class06570.Tu)
         .N('I', class00869.y)
         .N(" # ")
         .N("#X#")
         .N("III")
         .y("has_quartz", this.y(class06570.Tu))
         .N(this.y);
      this.N(class01990.field_40638, class06570.jJ)
         .N('#', class06570.TM)
         .N('X', class06570.WY)
         .N(" # ")
         .N("#X#")
         .N(" # ")
         .y("has_redstone", this.y(class06570.WY))
         .N(this.y);
      this.N(class01990.field_40640, class06570.vx, 8).N('#', class06570.bL).N('X', class06570.vE).N("#X#").y("has_cocoa", this.y(class06570.vE)).N(this.y);
      this.N(class01990.field_40635, class00869.LD).N('#', class01226.y).N("##").N("##").y("unlock_right_away", class07682.i()).N(false).N(this.y);
      this.N(class01990.field_40639, class06570.dw)
         .N('~', class06570.Th)
         .N('#', class06570.Tx)
         .N('&', class06570.TM)
         .N('$', class00869.MG)
         .N("#&#")
         .N("~$~")
         .N(" # ")
         .y("has_string", this.y(class06570.Th))
         .y("has_iron_ingot", this.y(class06570.TM))
         .y("has_tripwire_hook", this.y(class00869.MG))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Pp).N('#', class01226.y).N('@', class06570.Th).N("@@").N("##").y("has_string", this.y(class06570.Th)).N(this.y);
      this.R(class01990.field_40634, class00869.UZ, class06510.method_8101(class00869.Uo))
         .y("has_red_sandstone", this.y(class00869.UB))
         .y("has_chiseled_red_sandstone", this.y(class00869.UZ))
         .y("has_cut_red_sandstone", this.y(class00869.Uz))
         .N(this.y);
      this.M(class01990.field_40634, class00869.yu, class00869.Ud);
      this.y(class01990.field_40642, class06570.TZ, class01990.field_40634, class06570.Nc, i(class06570.TZ), u(class06570.TZ));
      this.y(class01990.field_40642, class06570.TZ, 9)
         .N(class00869.jG)
         .y(u(class06570.TZ))
         .y(L(class00869.jG), this.y(class00869.jG))
         .N(this.y, j(class06570.TZ, class00869.jG));
      this.y(class03767.N(class03794.N));
      this.y(class01990.field_40642, class06570.vt, 2)
         .N(class06570.vl)
         .N(class06570.vw)
         .y("cyan_dye")
         .y("has_green_dye", this.y(class06570.vw))
         .y("has_blue_dye", this.y(class06570.vl))
         .N(this.y);
      this.N(class01990.field_40634, class00869.Zf)
         .N('S', class06570.Ge)
         .N('I', class06570.vY)
         .N("SSS")
         .N("SIS")
         .N("SSS")
         .y("has_prismarine_shard", this.y(class06570.Ge))
         .N(this.y);
      this.N(class01990.field_40636, class00869.Bp)
         .N('Q', class06570.Tu)
         .N('G', class00869.ND)
         .N('W', class01226.z)
         .N("GGG")
         .N("QQQ")
         .N("WWW")
         .y("has_quartz", this.y(class06570.Tu))
         .N(this.y);
      this.N(class01990.field_40634, class00869.nt, 4).N('S', class00869.nm).N("SS").N("SS").y("has_polished_deepslate", this.y(class00869.nm)).N(this.y);
      this.N(class01990.field_40634, class00869.nb, 4).N('S', class00869.nt).N("SS").N("SS").y("has_deepslate_bricks", this.y(class00869.nt)).N(this.y);
      this.N(class01990.field_40637, class00869.yl, 6)
         .N('R', class06570.WY)
         .N('#', class00869.uh)
         .N('X', class06570.TM)
         .N("X X")
         .N("X#X")
         .N("XRX")
         .y("has_rail", this.y(class00869.um))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Ta)
         .N('#', class06570.Tx)
         .N('X', class01226.yk)
         .N("XX")
         .N("X#")
         .N(" #")
         .y("has_diamond", this.N(class01226.yk))
         .N(this.y);
      this.N(class01990.field_40642, class06570.TN, class01990.field_40634, class06570.Na);
      this.N(class01990.field_40639, class06570.bl).N('X', class06570.TN).N("X X").N("X X").y("has_diamond", this.y(class06570.TN)).N(this.y);
      this.N(class01990.field_40639, class06570.bt).N('X', class06570.TN).N("X X").N("XXX").N("XXX").y("has_diamond", this.y(class06570.TN)).N(this.y);
      this.N(class01990.field_40639, class06570.bn).N('X', class06570.TN).N("XXX").N("X X").y("has_diamond", this.y(class06570.TN)).N(this.y);
      this.N(class01990.field_40638, class06570.Tp)
         .N('#', class06570.Tx)
         .N('X', class01226.yk)
         .N("XX")
         .N(" #")
         .N(" #")
         .y("has_diamond", this.N(class01226.yk))
         .N(this.y);
      this.N(class01990.field_40639, class06570.bG).N('X', class06570.TN).N("XXX").N("X X").N("X X").y("has_diamond", this.y(class06570.TN)).N(this.y);
      this.N(class01990.field_40638, class06570.TX)
         .N('#', class06570.Tx)
         .N('X', class01226.yk)
         .N("XXX")
         .N(" # ")
         .N(" # ")
         .y("has_diamond", this.N(class01226.yk))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Tc)
         .N('#', class06570.Tx)
         .N('X', class01226.yk)
         .N("X")
         .N("#")
         .N("#")
         .y("has_diamond", this.N(class01226.yk))
         .N(this.y);
      this.N(class01990.field_40639, class06570.TH)
         .N('#', class06570.Tx)
         .N('X', class01226.yk)
         .N("X")
         .N("X")
         .N("#")
         .y("has_diamond", this.N(class01226.yk))
         .N(this.y);
      this.N(class01990.field_40639, class06570.lc)
         .N('#', class06570.Tx)
         .N('X', class01226.yk)
         .N("  X")
         .N(" # ")
         .N("#  ")
         .y("has_diamond", this.N(class01226.yk))
         .N(this.y);
      this.N(class01990.field_40634, class00869.i, 2)
         .N('Q', class06570.Tu)
         .N('C', class00869.W)
         .N("CQ")
         .N("QC")
         .y("has_quartz", this.y(class06570.Tu))
         .N(this.y);
      this.N(class01990.field_40636, class00869.yy)
         .N('R', class06570.WY)
         .N('#', class00869.W)
         .N('X', class06570.sx)
         .N("###")
         .N("#X#")
         .N("#R#")
         .y("has_bow", this.y(class06570.sx))
         .N(this.y);
      this.N(class01990.field_40634, class00869.vF, class06570.wC);
      this.N(class01990.field_40636, class00869.Br)
         .N('R', class06570.WY)
         .N('#', class00869.W)
         .N("###")
         .N("# #")
         .N("#R#")
         .y("has_redstone", this.y(class06570.WY))
         .N(this.y);
      this.N(class01990.field_40642, class06570.Ty, class01990.field_40634, class06570.BU);
      this.N(class01990.field_40635, class00869.MM)
         .N('B', class06570.jY)
         .N('#', class00869.LV)
         .N('D', class06570.TN)
         .N(" B ")
         .N("D#D")
         .N("###")
         .y("has_obsidian", this.y(class00869.LV))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Mt)
         .N('#', class00869.LV)
         .N('E', class06570.nG)
         .N("###")
         .N("#E#")
         .N("###")
         .y("has_ender_eye", this.y(class06570.nG))
         .N(this.y);
      this.y(class01990.field_40642, class06570.nG).N(class06570.nz).N(class06570.nj).y("has_blaze_powder", this.y(class06570.nj)).N(this.y);
      this.N(class01990.field_40634, class00869.Et, 4).N('#', class00869.MP).N("##").N("##").y("has_end_stone", this.y(class00869.MP)).N(this.y);
      this.N(class01990.field_40635, class06570.ln)
         .N('T', class06570.nE)
         .N('E', class06570.nG)
         .N('G', class00869.ND)
         .N("GGG")
         .N("GEG")
         .N("GTG")
         .y("has_ender_eye", this.y(class06570.nG))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Es, 4)
         .N('#', class06570.lG)
         .N('/', class06570.nU)
         .N("/")
         .N("#")
         .y("has_chorus_fruit_popped", this.y(class06570.lG))
         .N(this.y);
      this.y(class01990.field_40641, class06570.nb).N(class06570.nT).N(class00869.Ls).N(class06570.vg).y("has_spider_eye", this.y(class06570.nT)).N(this.y);
      this.y(class01990.field_40642, class06570.GZ, 3)
         .N(class06570.bN)
         .N(class06570.nj)
         .N(class06510.method_8091(class06570.sh, class06570.sr))
         .y("has_blaze_powder", this.y(class06570.nj))
         .N(this.y);
      this.y(class01990.field_40642, class06570.GJ, 3)
         .N(class06570.bN)
         .N(class06570.jk)
         .y("has_gunpowder", this.y(class06570.bN))
         .N(this.y, "firework_rocket_simple");
      this.N(class01990.field_40638, class06570.jr)
         .N('#', class06570.Tx)
         .N('X', class06570.Th)
         .N("  #")
         .N(" #X")
         .N("# X")
         .y("has_string", this.y(class06570.Th))
         .N(this.y);
      this.y(class01990.field_40638, class06570.sf)
         .N(class06570.TM)
         .N(class06570.bJ)
         .y("has_flint", this.y(class06570.bJ))
         .y("has_obsidian", this.y(class00869.LV))
         .N(this.y);
      this.N(class01990.field_40635, class00869.MJ).N('#', class06570.jl).N("# #").N(" # ").y("has_brick", this.y(class06570.jl)).N(this.y);
      this.N(class01990.field_40635, class00869.uN).N('#', class01226.ye).N("###").N("# #").N("###").y("has_cobblestone", this.N(class01226.ye)).N(this.y);
      this.y(class01990.field_40637, class06570.sU).N(class00869.uN).N(class06570.sZ).y("has_minecart", this.y(class06570.sZ)).N(this.y);
      this.N(class01990.field_40641, class06570.nP, 3).N('#', class00869.ND).N("# #").N(" # ").y("has_glass", this.y(class00869.ND)).N(this.y);
      this.N(class01990.field_40635, class00869.RJ, 16).N('#', class00869.ND).N("###").N("###").y("has_glass", this.y(class00869.ND)).N(this.y);
      this.N(class01990.field_40634, class00869.io, class06570.vL);
      this.y(class01990.field_40635, class06570.Gs)
         .N(class06570.GP)
         .N(class06570.vU)
         .y("has_item_frame", this.y(class06570.GP))
         .y("has_glow_ink_sac", this.y(class06570.vU))
         .N(this.y);
      this.N(class01990.field_40640, class06570.bV)
         .N('#', class06570.TU)
         .N('X', class06570.sS)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_gold_ingot", this.y(class06570.TU))
         .N(this.y);
      this.N(class01990.field_40638, class06570.TI)
         .N('#', class06570.Tx)
         .N('X', class01226.yw)
         .N("XX")
         .N("X#")
         .N(" #")
         .y("has_gold_ingot", this.N(class01226.yw))
         .N(this.y);
      this.N(class01990.field_40639, class06570.bY).N('X', class06570.TU).N("X X").N("X X").y("has_gold_ingot", this.y(class06570.TU)).N(this.y);
      this.N(class01990.field_40641, class06570.GG)
         .N('#', class06570.nW)
         .N('X', class06570.Gb)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_gold_nugget", this.y(class06570.nW))
         .N(this.y);
      this.N(class01990.field_40639, class06570.bw).N('X', class06570.TU).N("X X").N("XXX").N("XXX").y("has_gold_ingot", this.y(class06570.TU)).N(this.y);
      this.N(class01990.field_40639, class06570.bd).N('X', class06570.TU).N("XXX").N("X X").y("has_gold_ingot", this.y(class06570.TU)).N(this.y);
      this.N(class01990.field_40638, class06570.TJ)
         .N('#', class06570.Tx)
         .N('X', class01226.yw)
         .N("XX")
         .N(" #")
         .N(" #")
         .y("has_gold_ingot", this.N(class01226.yw))
         .N(this.y);
      this.N(class01990.field_40639, class06570.bk).N('X', class06570.TU).N("XXX").N("X X").N("X X").y("has_gold_ingot", this.y(class06570.TU)).N(this.y);
      this.N(class01990.field_40638, class06570.Tg)
         .N('#', class06570.Tx)
         .N('X', class01226.yw)
         .N("XXX")
         .N(" # ")
         .N(" # ")
         .y("has_gold_ingot", this.N(class01226.yw))
         .N(this.y);
      this.N(class01990.field_40637, class00869.yG, 6)
         .N('R', class06570.WY)
         .N('#', class06570.Tx)
         .N('X', class06570.TU)
         .N("X X")
         .N("X#X")
         .N("XRX")
         .y("has_rail", this.y(class00869.um))
         .N(this.y);
      this.N(class01990.field_40638, class06570.TO)
         .N('#', class06570.Tx)
         .N('X', class01226.yw)
         .N("X")
         .N("#")
         .N("#")
         .y("has_gold_ingot", this.N(class01226.yw))
         .N(this.y);
      this.N(class01990.field_40639, class06570.TQ)
         .N('#', class06570.Tx)
         .N('X', class01226.yw)
         .N("X")
         .N("X")
         .N("#")
         .y("has_gold_ingot", this.N(class01226.yw))
         .N(this.y);
      this.N(class01990.field_40639, class06570.lH)
         .N('#', class06570.Tx)
         .N('X', class01226.yw)
         .N("  X")
         .N(" # ")
         .N("#  ")
         .y("has_gold_ingot", this.N(class01226.yw))
         .N(this.y);
      this.y(class01990.field_40642, class06570.TU, class01990.field_40634, class06570.NX, "gold_ingot_from_gold_block", "gold_ingot");
      this.N(class01990.field_40642, class06570.nW, class01990.field_40642, class06570.TU, "gold_ingot_from_nuggets", "gold_ingot");
      this.y(class01990.field_40634, class00869.L).N(class00869.i).N(class06570.Tu).y("has_quartz", this.y(class06570.Tu)).N(this.y);
      this.y(class01990.field_40642, class06570.vv, 2)
         .N(class06570.vY)
         .N(class06570.vW)
         .y("gray_dye")
         .y("has_white_dye", this.y(class06570.vW))
         .y("has_black_dye", this.y(class06570.vY))
         .N(this.y);
      this.y(class01990.field_40634, class00869.zy, class06570.bL);
      this.u(class00869.BX, class06570.TM);
      this.y(class01990.field_40640, class06570.wZ, 4).N(class06570.WK).N(class06570.nP, 4).y("has_honey_block", this.y(class00869.TM)).N(this.y);
      this.N(class01990.field_40636, class00869.TM, class06570.wZ);
      this.N(class01990.field_40635, class00869.TB, class06570.wR);
      this.N(class01990.field_40636, class00869.Bf)
         .N('C', class00869.LA)
         .N('I', class06570.TM)
         .N("I I")
         .N("ICI")
         .N(" I ")
         .y("has_iron_ingot", this.y(class06570.TM))
         .N(this.y);
      this.y(class01990.field_40637, class06570.sW).N(class00869.Bf).N(class06570.sZ).y("has_minecart", this.y(class06570.sZ)).N(this.y);
      this.N(class01990.field_40638, class06570.TV)
         .N('#', class06570.Tx)
         .N('X', class01226.yd)
         .N("XX")
         .N("X#")
         .N(" #")
         .y("has_iron_ingot", this.N(class01226.yd))
         .N(this.y);
      this.N(class01990.field_40635, class00869.RQ, 16).N('#', class06570.TM).N("###").N("###").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40635, class00869.RO.u(), 16).N('#', class06570.TZ).N("###").N("###").y("has_copper_ingot", this.y(class06570.TZ)).N(this.y);
      this.N(class01990.field_40639, class06570.bv).N('X', class06570.TM).N("X X").N("X X").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40639, class06570.bb).N('X', class06570.TM).N("X X").N("XXX").N("XXX").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.y(class00869.ur, class06510.method_8101(class06570.TM)).y(L(class06570.TM), this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40639, class06570.bT).N('X', class06570.TM).N("XXX").N("X X").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40638, class06570.Te)
         .N('#', class06570.Tx)
         .N('X', class01226.yd)
         .N("XX")
         .N(" #")
         .N(" #")
         .y("has_iron_ingot", this.N(class01226.yd))
         .N(this.y);
      this.y(class01990.field_40642, class06570.TM, class01990.field_40634, class06570.NH, "iron_ingot_from_iron_block", "iron_ingot");
      this.N(class01990.field_40642, class06570.lF, class01990.field_40642, class06570.TM, "iron_ingot_from_nuggets", "iron_ingot");
      this.N(class01990.field_40639, class06570.bj).N('X', class06570.TM).N("XXX").N("X X").N("X X").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40638, class06570.TK)
         .N('#', class06570.Tx)
         .N('X', class01226.yd)
         .N("XXX")
         .N(" # ")
         .N(" # ")
         .y("has_iron_ingot", this.N(class01226.yd))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Tq)
         .N('#', class06570.Tx)
         .N('X', class01226.yd)
         .N("X")
         .N("#")
         .N("#")
         .y("has_iron_ingot", this.N(class01226.yd))
         .N(this.y);
      this.N(class01990.field_40639, class06570.To)
         .N('#', class06570.Tx)
         .N('X', class01226.yd)
         .N("X")
         .N("X")
         .N("#")
         .y("has_iron_ingot", this.N(class01226.yd))
         .N(this.y);
      this.N(class01990.field_40639, class06570.le)
         .N('#', class06570.Tx)
         .N('X', class01226.yd)
         .N("  X")
         .N(" # ")
         .N("#  ")
         .y("has_iron_ingot", this.N(class01226.yd))
         .N(this.y);
      this.N(class01990.field_40636, class00869.Zp, class06570.TM);
      this.N(class01990.field_40635, class06570.GP)
         .N('#', class06570.Tx)
         .N('X', class06570.js)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_leather", this.y(class06570.js))
         .N(this.y);
      this.N(class01990.field_40635, class00869.iG)
         .N('#', class01226.y)
         .N('X', class06570.TN)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_diamond", this.y(class06570.TN))
         .N(this.y);
      this.N(class01990.field_40635, class00869.uW, 3).N('#', class06570.Tx).N("# #").N("###").N("# #").y("has_stick", this.y(class06570.Tx)).N(this.y);
      this.N(class01990.field_40642, class06570.TL, class01990.field_40634, class06570.La);
      this.N(class01990.field_40638, class06570.Gr, 2).N('~', class06570.Th).N("~~ ").N("~~ ").N("  ~").y("has_string", this.y(class06570.Th)).N(this.y);
      this.N(class01990.field_40642, class06570.js, class06570.GF);
      this.N(class01990.field_40639, class06570.bB).N('X', class06570.js).N("X X").N("X X").y("has_leather", this.y(class06570.js)).N(this.y);
      this.N(class01990.field_40639, class06570.bR).N('X', class06570.js).N("X X").N("XXX").N("XXX").y("has_leather", this.y(class06570.js)).N(this.y);
      this.N(class01990.field_40639, class06570.bi).N('X', class06570.js).N("XXX").N("X X").y("has_leather", this.y(class06570.js)).N(this.y);
      this.N(class01990.field_40639, class06570.bM).N('X', class06570.js).N("XXX").N("X X").N("X X").y("has_leather", this.y(class06570.js)).N(this.y);
      this.N(class01990.field_40642, class06570.Gh).N('X', class06570.js).N("X X").N("XXX").N("X X").y("has_leather", this.y(class06570.js)).N(this.y);
      this.N(class01990.field_40639, class06570.PF)
         .N('X', class06570.js)
         .N('#', class06570.TM)
         .N(" X ")
         .N("X#X")
         .y("has_leather", this.y(class06570.js))
         .N(this.y);
      this.N(class01990.field_40642, class06570.lA, class01990.field_40642, class06570.TZ, "copper_ingot_from_nuggets", "copper_ingot");
      this.N(class01990.field_40638, class06570.Tt)
         .N('#', class06570.Tx)
         .N('X', class01226.yl)
         .N("XX")
         .N("X#")
         .N(" #")
         .y("has_copper_ingot", this.N(class01226.yl))
         .N(this.y);
      this.N(class01990.field_40638, class06570.TG)
         .N('#', class06570.Tx)
         .N('X', class01226.yl)
         .N("XX")
         .N(" #")
         .N(" #")
         .y("has_copper_ingot", this.N(class01226.yl))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Tn)
         .N('#', class06570.Tx)
         .N('X', class01226.yl)
         .N("XXX")
         .N(" # ")
         .N(" # ")
         .y("has_copper_ingot", this.N(class01226.yl))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Tv)
         .N('#', class06570.Tx)
         .N('X', class01226.yl)
         .N("X")
         .N("#")
         .N("#")
         .y("has_copper_ingot", this.N(class01226.yl))
         .N(this.y);
      this.N(class01990.field_40639, class06570.Tj)
         .N('#', class06570.Tx)
         .N('X', class01226.yl)
         .N("X")
         .N("X")
         .N("#")
         .y("has_copper_ingot", this.N(class01226.yl))
         .N(this.y);
      this.N(class01990.field_40639, class06570.lV)
         .N('#', class06570.Tx)
         .N('X', class01226.yl)
         .N("  X")
         .N(" # ")
         .N("#  ")
         .y("has_copper_ingot", this.N(class01226.yl))
         .N(this.y);
      this.N(class01990.field_40639, class06570.bE).N('X', class06570.TZ).N("X X").N("X X").y("has_copper_ingot", this.y(class06570.TZ)).N(this.y);
      this.N(class01990.field_40639, class06570.bz).N('X', class06570.TZ).N("X X").N("XXX").N("XXX").y("has_copper_ingot", this.y(class06570.TZ)).N(this.y);
      this.N(class01990.field_40639, class06570.bZ).N('X', class06570.TZ).N("XXX").N("X X").y("has_copper_ingot", this.y(class06570.TZ)).N(this.y);
      this.N(class01990.field_40639, class06570.bU).N('X', class06570.TZ).N("XXX").N("X X").N("X X").y("has_copper_ingot", this.y(class06570.TZ)).N(this.y);
      this.N(class01990.field_40636, class00869.PD)
         .N('S', class01226.z)
         .N('B', class00869.Lt)
         .N("SSS")
         .N(" B ")
         .N(" S ")
         .y("has_book", this.y(class06570.jY))
         .N(this.y);
      this.N(class01990.field_40636, class00869.uD)
         .N('#', class00869.W)
         .N('X', class06570.Tx)
         .N("X")
         .N("#")
         .y("has_cobblestone", this.y(class00869.W))
         .N(this.y);
      this.N(class06570.vs, class00869.Li, "light_blue_dye");
      this.y(class01990.field_40642, class06570.vs, 2)
         .N(class06570.vl)
         .N(class06570.vW)
         .y("light_blue_dye")
         .y("has_blue_dye", this.y(class06570.vl))
         .y("has_white_dye", this.y(class06570.vW))
         .N(this.y, "light_blue_dye_from_blue_white_dye");
      this.N(class06570.vn, class00869.LM, "light_gray_dye");
      this.y(class01990.field_40642, class06570.vn, 2)
         .N(class06570.vv)
         .N(class06570.vW)
         .y("light_gray_dye")
         .y("has_gray_dye", this.y(class06570.vv))
         .y("has_white_dye", this.y(class06570.vW))
         .N(this.y, "light_gray_dye_from_gray_white_dye");
      this.y(class01990.field_40642, class06570.vn, 3)
         .N(class06570.vY)
         .N(class06570.vW, 2)
         .y("light_gray_dye")
         .y("has_white_dye", this.y(class06570.vW))
         .y("has_black_dye", this.y(class06570.vY))
         .N(this.y, "light_gray_dye_from_black_white_dye");
      this.N(class06570.vn, class00869.LE, "light_gray_dye");
      this.N(class06570.vn, class00869.Lz, "light_gray_dye");
      this.u(class00869.Bc, class06570.TU);
      this.N(class01990.field_40636, class00869.vq).N('#', class06570.TZ).N("#").N("#").N("#").y("has_copper_ingot", this.y(class06570.TZ)).N(this.y);
      this.y(class01990.field_40642, class06570.vb, 2)
         .N(class06570.vw)
         .N(class06570.vW)
         .y("has_green_dye", this.y(class06570.vw))
         .y("has_white_dye", this.y(class06570.vW))
         .N(this.y);
      this.N(class01990.field_40634, class00869.iV)
         .N('A', class00869.iK)
         .N('B', class00869.Le)
         .N("A")
         .N("B")
         .y("has_carved_pumpkin", this.y(class00869.iK))
         .N(this.y);
      this.N(class06570.vP, class00869.LR, "magenta_dye");
      this.y(class01990.field_40642, class06570.vP, 4)
         .N(class06570.vl)
         .N(class06570.vk, 2)
         .N(class06570.vW)
         .y("magenta_dye")
         .y("has_blue_dye", this.y(class06570.vl))
         .y("has_rose_red", this.y(class06570.vk))
         .y("has_white_dye", this.y(class06570.vW))
         .N(this.y, "magenta_dye_from_blue_red_white_dye");
      this.y(class01990.field_40642, class06570.vP, 3)
         .N(class06570.vl)
         .N(class06570.vk)
         .N(class06570.vj)
         .y("magenta_dye")
         .y("has_pink_dye", this.y(class06570.vj))
         .y("has_blue_dye", this.y(class06570.vl))
         .y("has_red_dye", this.y(class06570.vk))
         .N(this.y, "magenta_dye_from_blue_red_pink");
      this.N(class06570.vP, class00869.zG, "magenta_dye", 2);
      this.y(class01990.field_40642, class06570.vP, 2)
         .N(class06570.vG)
         .N(class06570.vj)
         .y("magenta_dye")
         .y("has_pink_dye", this.y(class06570.vj))
         .y("has_purple_dye", this.y(class06570.vG))
         .N(this.y, "magenta_dye_from_purple_and_pink");
      this.N(class01990.field_40634, class00869.EI, class06570.nv);
      this.y(class01990.field_40641, class06570.nv).N(class06570.nj).N(class06570.jQ).y("has_blaze_powder", this.y(class06570.nj)).N(this.y);
      this.N(class01990.field_40642, class06570.Gt)
         .N('#', class06570.jk)
         .N('X', class06570.jJ)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_compass", this.y(class06570.jJ))
         .N(this.y);
      this.N(class01990.field_40634, class00869.Rq, class06570.nN, "has_melon");
      this.y(class01990.field_40642, class06570.nu).N(class06570.nN).y("has_melon", this.y(class06570.nN)).N(this.y);
      this.N(class01990.field_40637, class06570.sZ).N('#', class06570.TM).N("# #").N("###").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.y(class01990.field_40634, class00869.LK)
         .N(class00869.W)
         .N(class00869.Rc)
         .y("mossy_cobblestone")
         .y("has_vine", this.y(class00869.Rc))
         .N(this.y, j(class00869.LK, class00869.Rc));
      this.y(class01990.field_40634, class00869.RP)
         .N(class00869.Rm)
         .N(class00869.Rc)
         .y("mossy_stone_bricks")
         .y("has_vine", this.y(class00869.Rc))
         .N(this.y, j(class00869.RP, class00869.Rc));
      this.y(class01990.field_40634, class00869.LK)
         .N(class00869.W)
         .N(class00869.ny)
         .y("mossy_cobblestone")
         .y("has_moss_block", this.y(class00869.ny))
         .N(this.y, j(class00869.LK, class00869.ny));
      this.y(class01990.field_40634, class00869.RP)
         .N(class00869.Rm)
         .N(class00869.ny)
         .y("mossy_stone_bricks")
         .y("has_moss_block", this.y(class00869.ny))
         .N(this.y, j(class00869.RP, class00869.ny));
      this.y(class01990.field_40640, class06570.TD)
         .N(class00869.Ls)
         .N(class00869.LT)
         .N(class06570.sC)
         .y("has_mushroom_stew", this.y(class06570.TD))
         .y("has_bowl", this.y(class06570.sC))
         .y("has_brown_mushroom", this.y(class00869.Ls))
         .y("has_red_mushroom", this.y(class00869.LT))
         .N(this.y);
      class04206.B.j().forEach(var1x -> {
         class04107 class04107 = class04107.N(var1x);
         if (class04107 != null) {
            this.N(var1x, class04107);
         }
      });
      this.N(class01990.field_40634, class00869.ML, class06570.GK);
      this.N(class01990.field_40634, class00869.RD, class06570.GV);
      this.N(class01990.field_40642, class06570.Mq, class01990.field_40634, class06570.MK);
      this.N(class01990.field_40642, class00869.Lp)
         .N('R', class06570.MK)
         .N('L', class00869.Ni)
         .N(" L ")
         .N(" R ")
         .N(" L ")
         .y("has_resin_block", this.y(class06570.MK))
         .N(this.y);
      this.y(class01990.field_40634, class00869.EJ, class06570.nm);
      this.N(class01990.field_40636, class00869.yR)
         .N('#', class01226.y)
         .N('X', class06570.WY)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_redstone", this.y(class06570.WY))
         .N(this.y);
      this.N(class01990.field_40636, class00869.EV)
         .N('Q', class06570.Tu)
         .N('R', class06570.WY)
         .N('#', class00869.W)
         .N("###")
         .N("RRQ")
         .N("###")
         .y("has_quartz", this.y(class06570.Tu))
         .N(this.y);
      this.N(class06570.vm, class00869.LZ, "orange_dye");
      this.y(class01990.field_40642, class06570.vm, 2)
         .N(class06570.vk)
         .N(class06570.vT)
         .y("orange_dye")
         .y("has_red_dye", this.y(class06570.vk))
         .y("has_yellow_dye", this.y(class06570.vT))
         .N(this.y, "orange_dye_from_red_yellow");
      this.N(class01990.field_40635, class06570.bK)
         .N('#', class06570.Tx)
         .N('X', class01226.N)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_wool", this.N(class01226.N))
         .N(this.y);
      this.N(class01990.field_40642, class06570.jk, 3).N('#', class00869.it).N("###").y("has_reeds", this.y(class00869.it)).N(this.y);
      this.N(class01990.field_40634, class00869.Bx, 2)
         .N('#', class00869.BC)
         .N("#")
         .N("#")
         .y("has_chiseled_quartz_block", this.y(class00869.BS))
         .y("has_quartz_block", this.y(class00869.BC))
         .y("has_quartz_pillar", this.y(class00869.Bx))
         .N(this.y);
      this.y(class01990.field_40634, class00869.zn, class00869.iT);
      this.N(class06570.vj, class00869.zd, "pink_dye", 2);
      this.N(class06570.vj, class00869.LU, "pink_dye");
      this.N(class06570.vj, class00869.iv, "pink_dye");
      this.y(class01990.field_40642, class06570.vj, 2)
         .N(class06570.vk)
         .N(class06570.vW)
         .y("pink_dye")
         .y("has_white_dye", this.y(class06570.vW))
         .y("has_red_dye", this.y(class06570.vk))
         .N(this.y, "pink_dye_from_red_white_dye");
      this.N(class01990.field_40636, class00869.yq)
         .N('R', class06570.WY)
         .N('#', class00869.W)
         .N('T', class01226.y)
         .N('X', class06570.TM)
         .N("TTT")
         .N("#X#")
         .N("#R#")
         .y("has_redstone", this.y(class06570.WY))
         .N(this.y);
      this.i(class01990.field_40634, class00869.iQ, class00869.iY);
      this.N(class01990.field_40634, class00869.ZF, class06570.Ge);
      this.y(class01990.field_40634, class00869.ZA, class06570.Ge);
      this.y(class01990.field_40640, class06570.GI)
         .N(class00869.Ro)
         .N(class06570.vg)
         .N(class01226.Nw)
         .y("has_carved_pumpkin", this.y(class00869.iK))
         .y("has_pumpkin", this.y(class00869.Ro))
         .N(this.y);
      this.y(class01990.field_40642, class06570.nL, 4).N(class00869.Ro).y("has_pumpkin", this.y(class00869.Ro)).N(this.y);
      this.y(class01990.field_40642, class06570.vG, 2)
         .N(class06570.vl)
         .N(class06570.vk)
         .y("has_blue_dye", this.y(class06570.vl))
         .y("has_red_dye", this.y(class06570.vk))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Ee)
         .N('#', class00869.LA)
         .N('-', class06570.lp)
         .N("-")
         .N("#")
         .N("-")
         .y("has_shulker_shell", this.y(class06570.lp))
         .N(this.y);
      this.L();
      this.N(class01990.field_40634, class00869.Ej, 4).N('F', class06570.lG).N("FF").N("FF").y("has_chorus_fruit_popped", this.y(class06570.lG)).N(this.y);
      this.N(class01990.field_40634, class00869.Ev).N('#', class00869.UK).N("#").N("#").y("has_purpur_block", this.y(class00869.Ej)).N(this.y);
      this.y(class01990.field_40634, class00869.UK, class06510.method_8091(class00869.Ej, class00869.Ev))
         .y("has_purpur_block", this.y(class00869.Ej))
         .N(this.y);
      this.i(class00869.En, class06510.method_8091(class00869.Ej, class00869.Ev)).y("has_purpur_block", this.y(class00869.Ej)).N(this.y);
      this.N(class01990.field_40634, class00869.BC, class06570.Tu);
      this.N(class01990.field_40634, class00869.TV, 4).N('#', class00869.BC).N("##").N("##").y("has_quartz_block", this.y(class00869.BC)).N(this.y);
      this.y(class01990.field_40634, class00869.UJ, class06510.method_8091(class00869.BS, class00869.BC, class00869.Bx))
         .y("has_chiseled_quartz_block", this.y(class00869.BS))
         .y("has_quartz_block", this.y(class00869.BC))
         .y("has_quartz_pillar", this.y(class00869.Bx))
         .N(this.y);
      this.i(class00869.BD, class06510.method_8091(class00869.BS, class00869.BC, class00869.Bx))
         .y("has_chiseled_quartz_block", this.y(class00869.BS))
         .y("has_quartz_block", this.y(class00869.BC))
         .y("has_quartz_pillar", this.y(class00869.Bx))
         .N(this.y);
      this.y(class01990.field_40640, class06570.Ga)
         .N(class06570.Gv)
         .N(class06570.GX)
         .N(class06570.sC)
         .N(class06570.Gb)
         .N(class00869.Ls)
         .y("rabbit_stew")
         .y("has_cooked_rabbit", this.y(class06570.GX))
         .N(this.y, j(class06570.Ga, class06570.uc));
      this.y(class01990.field_40640, class06570.Ga)
         .N(class06570.Gv)
         .N(class06570.GX)
         .N(class06570.sC)
         .N(class06570.Gb)
         .N(class00869.LT)
         .y("rabbit_stew")
         .y("has_cooked_rabbit", this.y(class06570.GX))
         .N(this.y, j(class06570.Ga, class06570.uX));
      this.N(class01990.field_40637, class00869.um, 16)
         .N('#', class06570.Tx)
         .N('X', class06570.TM)
         .N("X X")
         .N("X#X")
         .N("X X")
         .y("has_minecart", this.y(class06570.sZ))
         .N(this.y);
      this.N(class01990.field_40636, class06570.WY, class01990.field_40636, class06570.WO);
      this.N(class01990.field_40636, class00869.MT)
         .N('R', class06570.WY)
         .N('G', class00869.io)
         .N(" R ")
         .N("RGR")
         .N(" R ")
         .y("has_glowstone", this.y(class00869.io))
         .N(this.y);
      this.N(class01990.field_40636, class00869.iW)
         .N('#', class06570.Tx)
         .N('X', class06570.WY)
         .N("X")
         .N("#")
         .y("has_redstone", this.y(class06570.WY))
         .N(this.y);
      this.N(class06570.vk, class06570.lw, "red_dye");
      this.N(class06570.vk, class00869.Lu, "red_dye");
      this.N(class06570.vk, class00869.zl, "red_dye", 2);
      this.N(class06570.vm, class00869.nx, "orange_dye");
      this.N(class06570.vv, class00869.nD, "gray_dye");
      this.y(class01990.field_40642, class06570.vk).N(class00869.LB).y("red_dye").y("has_red_flower", this.y(class00869.LB)).N(this.y, "red_dye_from_tulip");
      this.N(class01990.field_40634, class00869.Eo)
         .N('W', class06570.nm)
         .N('N', class06570.GK)
         .N("NW")
         .N("WN")
         .y("has_nether_wart", this.y(class06570.nm))
         .N(this.y);
      this.N(class01990.field_40634, class00869.UB).N('#', class00869.c).N("##").N("##").y("has_sand", this.y(class00869.c)).N(this.y);
      this.y(class01990.field_40634, class00869.Uo, class06510.method_8091(class00869.UB, class00869.UZ))
         .y("has_red_sandstone", this.y(class00869.UB))
         .y("has_chiseled_red_sandstone", this.y(class00869.UZ))
         .N(this.y);
      this.i(class00869.UU, class06510.method_8091(class00869.UB, class00869.UZ, class00869.Uz))
         .y("has_red_sandstone", this.y(class00869.UB))
         .y("has_chiseled_red_sandstone", this.y(class00869.UZ))
         .y("has_cut_red_sandstone", this.y(class00869.Uz))
         .N(this.y);
      this.N(class01990.field_40636, class00869.iH)
         .N('#', class00869.iW)
         .N('X', class06570.WY)
         .N('I', class00869.y)
         .N("#X#")
         .N("III")
         .y("has_redstone_torch", this.y(class00869.iW))
         .N(this.y);
      this.N(class01990.field_40634, class00869.yL, class00869.e);
      this.y(class01990.field_40634, class00869.Ud, class06510.method_8091(class00869.yL, class00869.yu))
         .y("has_sandstone", this.y(class00869.yL))
         .y("has_chiseled_sandstone", this.y(class00869.yu))
         .N(this.y);
      this.i(class00869.Mj, class06510.method_8091(class00869.yL, class00869.yu, class00869.yi))
         .y("has_sandstone", this.y(class00869.yL))
         .y("has_chiseled_sandstone", this.y(class00869.yu))
         .y("has_cut_sandstone", this.y(class00869.yi))
         .N(this.y);
      this.N(class01990.field_40634, class00869.zN)
         .N('S', class06570.Ge)
         .N('C', class06570.GH)
         .N("SCS")
         .N("CCC")
         .N("SCS")
         .y("has_prismarine_crystals", this.y(class06570.GH))
         .N(this.y);
      this.N(class01990.field_40638, class06570.vr).N('#', class06570.TM).N(" #").N("# ").y("has_iron_ingot", this.y(class06570.TM)).N(this.y);
      this.N(class01990.field_40639, class06570.lo)
         .N('W', class01226.yt)
         .N('o', class06570.TM)
         .N("WoW")
         .N("WWW")
         .N(" W ")
         .y("has_iron_ingot", this.y(class06570.TM))
         .N(this.y);
      this.N(class01990.field_40642, class06570.jQ, class01990.field_40636, class06570.Wq);
      this.R(class01990.field_40634, class00869.Uz, class00869.UB);
      this.R(class01990.field_40634, class00869.yi, class00869.yL);
      this.N(class01990.field_40634, class00869.ib, class06570.jP);
      this.N(class01990.field_40635, class00869.is, 6).N('#', class00869.ib).N("###").y("has_snowball", this.y(class06570.jP)).N(this.y);
      this.N(class01990.field_40635, class00869.sR)
         .N('L', class01226.g)
         .N('S', class06570.Tx)
         .N('#', class01226.f)
         .N(" S ")
         .N("S#S")
         .N("LLL")
         .y("has_soul_sand", this.N(class01226.f))
         .N(this.y);
      this.N(class01990.field_40641, class06570.nl)
         .N('#', class06570.nW)
         .N('X', class06570.nN)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_melon", this.y(class06570.nN))
         .N(this.y);
      this.N(class01990.field_40639, class06570.lg, 2)
         .N('#', class06570.vL)
         .N('X', class06570.sD)
         .N(" # ")
         .N("#X#")
         .N(" # ")
         .y("has_glowstone_dust", this.y(class06570.vL))
         .N(this.y);
      this.N(class01990.field_40638, class06570.vy)
         .N('#', class06570.Ti)
         .N('X', class06570.TZ)
         .N(" # ")
         .N(" X ")
         .N(" X ")
         .y("has_amethyst_shard", this.y(class06570.Ti))
         .N(this.y);
      this.N(class01990.field_40642, class06570.Tx, 4).N('#', class01226.y).N("#").N("#").y("sticks").y("has_planks", this.N(class01226.y)).N(this.y);
      this.N(class01990.field_40642, class06570.Tx, 1)
         .N('#', class00869.mx)
         .N("#")
         .N("#")
         .y("sticks")
         .y("has_bamboo", this.y(class00869.mx))
         .N(this.y, "stick_from_bamboo_item");
      this.N(class01990.field_40636, class00869.yd)
         .N('P', class00869.yq)
         .N('S', class06570.jQ)
         .N("S")
         .N("P")
         .y("has_slime_ball", this.y(class06570.jQ))
         .N(this.y);
      this.N(class01990.field_40634, class00869.Rm, 4).N('#', class00869.y).N("##").N("##").y("has_stone", this.y(class00869.y)).N(this.y);
      this.N(class01990.field_40638, class06570.Tk)
         .N('#', class06570.Tx)
         .N('X', class01226.yG)
         .N("XX")
         .N("X#")
         .N(" #")
         .y("has_cobblestone", this.N(class01226.yG))
         .N(this.y);
      this.y(class01990.field_40634, class00869.UO, class06510.method_8101(class00869.Rm)).y("has_stone_bricks", this.N(class01226.L)).N(this.y);
      this.i(class00869.RA, class06510.method_8101(class00869.Rm)).y("has_stone_bricks", this.N(class01226.L)).N(this.y);
      this.N(class01990.field_40638, class06570.TY)
         .N('#', class06570.Tx)
         .N('X', class01226.yG)
         .N("XX")
         .N(" #")
         .N(" #")
         .y("has_cobblestone", this.N(class01226.yG))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Tw)
         .N('#', class06570.Tx)
         .N('X', class01226.yG)
         .N("XXX")
         .N(" # ")
         .N(" # ")
         .y("has_cobblestone", this.N(class01226.yG))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Td)
         .N('#', class06570.Tx)
         .N('X', class01226.yG)
         .N("X")
         .N("#")
         .N("#")
         .y("has_cobblestone", this.N(class01226.yG))
         .N(this.y);
      this.L(class01990.field_40634, class00869.Ul, class00869.UV);
      this.N(class01990.field_40639, class06570.Tl)
         .N('#', class06570.Tx)
         .N('X', class01226.yG)
         .N("X")
         .N("X")
         .N("#")
         .y("has_cobblestone", this.N(class01226.yG))
         .N(this.y);
      this.N(class01990.field_40639, class06570.lK)
         .N('#', class06570.Tx)
         .N('X', class01226.yG)
         .N("  X")
         .N(" # ")
         .N("#  ")
         .y("has_cobblestone", this.N(class01226.yG))
         .N(this.y);
      this.N(class01990.field_40634, class00869.yV)
         .N('#', class06570.Th)
         .N("##")
         .N("##")
         .y("has_string", this.y(class06570.Th))
         .N(this.y, j(class00869.yV, class06570.Th));
      this.N(class06570.vg, class00869.it, "sugar");
      this.y(class01990.field_40642, class06570.vg, 3)
         .N(class06570.wZ)
         .y("sugar")
         .y("has_honey_bottle", this.y(class06570.wZ))
         .N(this.y, j(class06570.vg, class06570.wZ));
      this.N(class01990.field_40636, class00869.Tu)
         .N('H', class06570.ZG)
         .N('R', class06570.WY)
         .N(" R ")
         .N("RHR")
         .N(" R ")
         .y("has_redstone", this.y(class06570.WY))
         .y("has_hay_block", this.y(class00869.zy))
         .N(this.y);
      this.N(class01990.field_40636, class00869.Ln)
         .N('#', class06510.method_8091(class00869.e, class00869.c))
         .N('X', class06570.bN)
         .N("X#X")
         .N("#X#")
         .N("X#X")
         .y("has_gunpowder", this.y(class06570.bN))
         .N(this.y);
      this.y(class01990.field_40637, class06570.sE).N(class00869.Ln).N(class06570.sZ).y("has_minecart", this.y(class06570.sZ)).N(this.y);
      this.N(class01990.field_40635, class00869.Le, 4)
         .N('#', class06570.Tx)
         .N('X', class06510.method_8091(class06570.sh, class06570.sr))
         .N("X")
         .N("#")
         .y("has_stone_pickaxe", this.y(class06570.Tw))
         .N(this.y);
      this.N(class01990.field_40635, class00869.iO, 4)
         .N('X', class06510.method_8091(class06570.sh, class06570.sr))
         .N('#', class06570.Tx)
         .N('S', class01226.f)
         .N("X")
         .N("#")
         .N("S")
         .y("has_soul_sand", this.N(class01226.f))
         .N(this.y);
      this.N(class01990.field_40635, class00869.iI, 4)
         .N('X', class06510.method_8091(class06570.sh, class06570.sr))
         .N('#', class06570.Tx)
         .N('C', class06570.lA)
         .N("C")
         .N("X")
         .N("#")
         .y("has_copper_nugget", this.y(class06570.lA))
         .N(this.y);
      this.N(class01990.field_40635, class00869.sy)
         .N('#', class06570.RU)
         .N('X', class06570.lF)
         .N("XXX")
         .N("X#X")
         .N("XXX")
         .y("has_iron_nugget", this.y(class06570.lF))
         .y("has_iron_ingot", this.y(class06570.TM))
         .N(this.y);
      this.N(class01990.field_40635, class00869.sL)
         .N('#', class06570.My)
         .N('X', class06570.lF)
         .N("XXX")
         .N("X#X")
         .N("XXX")
         .y("has_soul_torch", this.y(class06570.My))
         .N(this.y);
      this.N(class01990.field_40635, class00869.su.u())
         .N('#', class06570.ML)
         .N('X', class06570.lA)
         .N("XXX")
         .N("X#X")
         .N("XXX")
         .y("has_copper_torch", this.y(class06570.ML))
         .N(this.y);
      this.y(class01990.field_40636, class00869.BH).N(class00869.LA).N(class00869.MG).y("has_tripwire_hook", this.y(class00869.MG)).N(this.y);
      this.N(class01990.field_40636, class00869.MG, 2)
         .N('#', class01226.y)
         .N('S', class06570.Tx)
         .N('I', class06570.TM)
         .N("I")
         .N("S")
         .N("#")
         .y("has_string", this.y(class06570.Th))
         .N(this.y);
      this.N(class01990.field_40639, class06570.sa).N('X', class06570.sp).N("XXX").N("X X").y("has_turtle_scute", this.y(class06570.sp)).N(this.y);
      this.N(class01990.field_40639, class06570.sA).N('X', class06570.sF).N("X  ").N("XXX").N("X X").y("has_armadillo_scute", this.y(class06570.sF)).N(this.y);
      this.y(class01990.field_40642, class06570.bL, 9).N(class00869.zy).y("has_hay_block", this.y(class00869.zy)).N(this.y);
      this.y(class01990.field_40642, class06570.vW).N(class06570.vQ).y("white_dye").y("has_bone_meal", this.y(class06570.vQ)).N(this.y);
      this.N(class06570.vW, class00869.LP, "white_dye");
      this.N(class01990.field_40638, class06570.TT)
         .N('#', class06570.Tx)
         .N('X', class01226.yt)
         .N("XX")
         .N("X#")
         .N(" #")
         .y("has_stick", this.y(class06570.Tx))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Tb)
         .N('#', class06570.Tx)
         .N('X', class01226.yt)
         .N("XX")
         .N(" #")
         .N(" #")
         .y("has_stick", this.y(class06570.Tx))
         .N(this.y);
      this.N(class01990.field_40638, class06570.Ts)
         .N('#', class06570.Tx)
         .N('X', class01226.yt)
         .N("XXX")
         .N(" # ")
         .N(" # ")
         .y("has_stick", this.y(class06570.Tx))
         .N(this.y);
      this.N(class01990.field_40638, class06570.TP)
         .N('#', class06570.Tx)
         .N('X', class01226.yt)
         .N("X")
         .N("#")
         .N("#")
         .y("has_stick", this.y(class06570.Tx))
         .N(this.y);
      this.N(class01990.field_40639, class06570.Tm)
         .N('#', class06570.Tx)
         .N('X', class01226.yt)
         .N("X")
         .N("X")
         .N("#")
         .y("has_stick", this.y(class06570.Tx))
         .N(this.y);
      this.N(class01990.field_40639, class06570.lq)
         .N('#', class06570.Tx)
         .N('X', class01226.yt)
         .N("  X")
         .N(" # ")
         .N("#  ")
         .y("has_stick", this.y(class06570.Tx))
         .N(this.y);
      this.y(class01990.field_40642, class06570.GU).N(class06570.jY).N(class06570.vz).N(class06570.Tr).y("has_book", this.y(class06570.jY)).N(this.y);
      this.N(class06570.vT, class00869.Ly, "yellow_dye");
      this.N(class06570.vT, class00869.zt, "yellow_dye", 2);
      this.N(class06570.vT, class00869.vr, "yellow_dye");
      this.N(class01990.field_40640, class06570.ny, class01990.field_40634, class06570.jw);
      this.N(class01990.field_40642, class00869.mC)
         .N('#', class06570.dj)
         .N('X', class06570.dd)
         .N("###")
         .N("#X#")
         .N("###")
         .y("has_nautilus_core", this.y(class06570.dd))
         .y("has_nautilus_shell", this.y(class06570.dj))
         .N(this.y);
      this.u(class01990.field_40635, class00869.Pg, class00869.UB);
      this.u(class01990.field_40635, class00869.Po, class00869.Rm);
      this.u(class01990.field_40635, class00869.PH, class00869.yL);
      this.y(class01990.field_40642, class06570.dV).N(class06570.jk).N(class00869.Lv).y("has_bricks", this.y(class00869.Lv)).N(this.y);
      this.y(class01990.field_40642, class06570.de).N(class06570.jk).N(class00869.Rc).y("has_vines", this.y(class00869.Rc)).N(this.y);
      this.y(class01990.field_40642, class06570.dO).N(class06570.jk).N(class06570.GY).y("has_creeper_head", this.y(class06570.GY)).N(this.y);
      this.y(class01990.field_40642, class06570.dg).N(class06570.jk).N(class06570.Gd).y("has_wither_skeleton_skull", this.y(class06570.Gd)).N(this.y);
      this.y(class01990.field_40642, class06570.dQ).N(class06570.jk).N(class00869.LE).y("has_oxeye_daisy", this.y(class00869.LE)).N(this.y);
      this.y(class01990.field_40642, class06570.dI).N(class06570.jk).N(class06570.be).y("has_enchanted_golden_apple", this.y(class06570.be)).N(this.y);
      this.N(class01990.field_40635, class00869.Pa, 6)
         .N('~', class06570.Th)
         .N('I', class00869.mx)
         .N("I~I")
         .N("I I")
         .N("I I")
         .y("has_bamboo", this.y(class00869.mx))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Px)
         .N('I', class06570.Tx)
         .N('-', class00869.UG)
         .N('#', class01226.y)
         .N("I-I")
         .N("# #")
         .y("has_stone_slab", this.y(class00869.UG))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Pf)
         .N('#', class00869.UV)
         .N('X', class00869.uN)
         .N('I', class06570.TM)
         .N("III")
         .N("IXI")
         .N("###")
         .y("has_smooth_stone", this.y(class00869.UV))
         .N(this.y);
      this.N(class01990.field_40635, class00869.PA)
         .N('#', class01226.g)
         .N('X', class00869.uN)
         .N(" # ")
         .N("#X#")
         .N(" # ")
         .y("has_furnace", this.y(class00869.uN))
         .N(this.y);
      this.N(class01990.field_40635, class00869.PC)
         .N('#', class01226.y)
         .N('@', class06570.jk)
         .N("@@")
         .N("##")
         .N("##")
         .y("has_paper", this.y(class06570.jk))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Ph)
         .N('#', class01226.y)
         .N('@', class06570.TM)
         .N("@@")
         .N("##")
         .N("##")
         .y("has_iron_ingot", this.y(class06570.TM))
         .N(this.y);
      this.N(class01990.field_40635, class00869.PS)
         .N('#', class01226.y)
         .N('@', class06570.bJ)
         .N("@@")
         .N("##")
         .N("##")
         .y("has_flint", this.y(class06570.bJ))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Pr).N('I', class06570.TM).N('#', class00869.y).N(" I ").N("###").y("has_stone", this.y(class00869.y)).N(this.y);
      this.N(class01990.field_40635, class00869.TT)
         .N('S', class06570.MP)
         .N('#', class06570.TM)
         .N("SSS")
         .N("S#S")
         .N("SSS")
         .y("has_iron_ingot", this.y(class06570.TM))
         .y("has_lodestone", this.y(class06570.wU))
         .N(this.y);
      this.y(class01990.field_40642, class06570.TE, class01990.field_40634, class06570.Np, "netherite_ingot_from_netherite_block", "netherite_ingot");
      this.y(class01990.field_40642, class06570.TE)
         .N(class06570.TW, 4)
         .N(class06570.TU, 4)
         .y("netherite_ingot")
         .y("has_netherite_scrap", this.y(class06570.TW))
         .N(this.y);
      this.N(class01990.field_40635, class00869.TE)
         .N('O', class00869.TU)
         .N('G', class00869.io)
         .N("OOO")
         .N("GGG")
         .N("OOO")
         .y("has_obsidian", this.y(class00869.TU))
         .N(this.y);
      this.N(class01990.field_40635, class00869.Rg)
         .N('I', class06570.TM)
         .N('N', class06570.lF)
         .N("N")
         .N("I")
         .N("N")
         .y("has_iron_nugget", this.y(class06570.lF))
         .y("has_iron_ingot", this.y(class06570.TM))
         .N(this.y);
      this.N(class01990.field_40635, class00869.RI.u())
         .N('I', class06570.TZ)
         .N('N', class06570.lA)
         .N("N")
         .N("I")
         .N("N")
         .y("has_copper_nugget", this.y(class06570.lA))
         .y("has_copper_ingot", this.y(class06570.TZ))
         .N(this.y);
      this.N(class01990.field_40634, class00869.bX, 2)
         .N('G', class00869.ND)
         .N('S', class06570.Ti)
         .N(" S ")
         .N("SGS")
         .N(" S ")
         .y("has_amethyst_shard", this.y(class06570.Ti))
         .N(this.y);
      this.N(class01990.field_40634, class00869.bv, class06570.Ti);
      this.N(class01990.field_40638, class06570.jo)
         .N('C', class06570.jJ)
         .N('S', class06570.wr)
         .N("SSS")
         .N("SCS")
         .N("SSS")
         .y("has_echo_shard", this.y(class06570.wr))
         .N(this.y);
      this.N(class01990.field_40636, class06570.my)
         .N('#', class06570.Ti)
         .N('X', class06570.mN)
         .N(" # ")
         .N("#X#")
         .y("has_amethyst_shard", this.y(class06570.Ti))
         .N(this.y);
      this.y(class01990.field_40642, class06570.dW, class06570.dT);
      class06863.N(class06496::new).N(this.y, "armor_dye");
      class06863.N(class06498::new).N(this.y, "banner_duplicate");
      class06863.N(class06490::new).N(this.y, "book_cloning");
      class06863.N(class06491::new).N(this.y, "firework_rocket");
      class06863.N(class06503::new).N(this.y, "firework_star");
      class06863.N(class06512::new).N(this.y, "firework_star_fade");
      class06863.N(class06489::new).N(this.y, "map_cloning");
      class06863.N(class06487::new).N(this.y, "map_extending");
      class06863.N(class05721::new).N(this.y, "repair_item");
      class06863.N(class07325::new).N(this.y, "shield_decoration");
      class06863.N(class07283::new).N(this.y, "tipped_arrow");
      class06886.L(class06510.method_8101(class06570.Gj), class01990.field_40640, class06570.Gv, 0.35F, 200).y("has_potato", this.y(class06570.Gj)).N(this.y);
      class06886.L(class06510.method_8101(class06570.jd), class01990.field_40642, class06570.jl, 0.3F, 200).y("has_clay_ball", this.y(class06570.jd)).N(this.y);
      class06886.L(this.y(class01226.O), class01990.field_40642, class06570.sr, 0.15F, 200).y("has_log", this.N(class01226.O)).N(this.y);
      class06886.L(class06510.method_8101(class06570.lt), class01990.field_40642, class06570.lG, 0.1F, 200)
         .y("has_chorus_fruit", this.y(class06570.lt))
         .N(this.y);
      class06886.L(class06510.method_8101(class06570.ni), class01990.field_40640, class06570.nR, 0.35F, 200).y("has_beef", this.y(class06570.ni)).N(this.y);
      class06886.L(class06510.method_8101(class06570.nM), class01990.field_40640, class06570.nB, 0.35F, 200).y("has_chicken", this.y(class06570.nM)).N(this.y);
      class06886.L(class06510.method_8101(class06570.vu), class01990.field_40640, class06570.vB, 0.35F, 200).y("has_cod", this.y(class06570.vu)).N(this.y);
      class06886.L(class06510.method_8101(class00869.Wh), class01990.field_40640, class06570.ny, 0.1F, 200)
         .y("has_kelp", this.y(class00869.Wh))
         .N(this.y, R(class06570.ny));
      class06886.L(class06510.method_8101(class06570.vi), class01990.field_40640, class06570.vZ, 0.35F, 200).y("has_salmon", this.y(class06570.vi)).N(this.y);
      class06886.L(class06510.method_8101(class06570.lL), class01990.field_40640, class06570.lu, 0.35F, 200).y("has_mutton", this.y(class06570.lL)).N(this.y);
      class06886.L(class06510.method_8101(class06570.bo), class01990.field_40640, class06570.bq, 0.35F, 200).y("has_porkchop", this.y(class06570.bo)).N(this.y);
      class06886.L(class06510.method_8101(class06570.Gc), class01990.field_40640, class06570.GX, 0.35F, 200).y("has_rabbit", this.y(class06570.Gc)).N(this.y);
      this.N(L, class01990.field_40642, class06570.sh, 0.1F, 200, "coal");
      this.N(u, class01990.field_40642, class06570.TM, 0.7F, 200, "iron_ingot");
      this.N(i, class01990.field_40642, class06570.TZ, 0.7F, 200, "copper_ingot");
      this.N(R, class01990.field_40642, class06570.TU, 1.0F, 200, "gold_ingot");
      this.N(M, class01990.field_40642, class06570.TN, 1.0F, 200, "diamond");
      this.N(B, class01990.field_40642, class06570.TL, 0.2F, 200, "lapis_lazuli");
      this.N(Z, class01990.field_40636, class06570.WY, 0.7F, 200, "redstone");
      this.N(z, class01990.field_40642, class06570.Ty, 1.0F, 200, "emerald");
      this.N(class01990.field_40642, class06570.TR, class01990.field_40634, class06570.NJ);
      this.N(class01990.field_40642, class06570.TB, class01990.field_40634, class06570.No);
      this.N(class01990.field_40642, class06570.Tz, class01990.field_40634, class06570.Nq);
      class06886.L(this.y(class01226.J), class01990.field_40634, class00869.ND.B(), 0.1F, 200).y("has_smelts_to_glass", this.N(class01226.J)).N(this.y);
      class06886.L(class06510.method_8101(class00869.mA), class01990.field_40642, class06570.vb, 0.1F, 200)
         .y("has_sea_pickle", this.y(class00869.mA))
         .N(this.y, R(class06570.vb));
      class06886.L(class06510.method_8101(class00869.ij.B()), class01990.field_40642, class06570.vw, 1.0F, 200)
         .y("has_cactus", this.y(class00869.ij))
         .N(this.y);
      class06886.L(
            class06510.method_8091(
               class06570.Tg,
               class06570.TO,
               class06570.TI,
               class06570.TJ,
               class06570.TQ,
               class06570.lH,
               class06570.bd,
               class06570.bw,
               class06570.bk,
               class06570.bY,
               class06570.GS,
               class06570.dn
            ),
            class01990.field_40642,
            class06570.nW,
            0.1F,
            200
         )
         .y("has_golden_pickaxe", this.y(class06570.Tg))
         .y("has_golden_shovel", this.y(class06570.TO))
         .y("has_golden_axe", this.y(class06570.TI))
         .y("has_golden_hoe", this.y(class06570.TJ))
         .y("has_golden_sword", this.y(class06570.TQ))
         .y("has_golden_spear", this.y(class06570.lH))
         .y("has_golden_helmet", this.y(class06570.bd))
         .y("has_golden_chestplate", this.y(class06570.bw))
         .y("has_golden_leggings", this.y(class06570.bk))
         .y("has_golden_boots", this.y(class06570.bY))
         .y("has_golden_horse_armor", this.y(class06570.GS))
         .y("has_golden_nautilus_armor", this.y(class06570.dn))
         .N(this.y, R(class06570.nW));
      class06886.L(
            class06510.method_8091(
               class06570.Tn,
               class06570.Tv,
               class06570.Tt,
               class06570.TG,
               class06570.Tj,
               class06570.lV,
               class06570.bZ,
               class06570.bz,
               class06570.bU,
               class06570.bE,
               class06570.Gf,
               class06570.dl
            ),
            class01990.field_40642,
            class06570.lA,
            0.1F,
            200
         )
         .y("has_copper_pickaxe", this.y(class06570.Tn))
         .y("has_copper_shovel", this.y(class06570.Tv))
         .y("has_copper_axe", this.y(class06570.Tt))
         .y("has_copper_hoe", this.y(class06570.TG))
         .y("has_copper_sword", this.y(class06570.Tj))
         .y("has_copper_spear", this.y(class06570.lV))
         .y("has_copper_helmet", this.y(class06570.bZ))
         .y("has_copper_chestplate", this.y(class06570.bz))
         .y("has_copper_leggings", this.y(class06570.bU))
         .y("has_copper_boots", this.y(class06570.bE))
         .y("has_copper_horse_armor", this.y(class06570.Gf))
         .y("has_copper_nautilus_armor", this.y(class06570.dl))
         .N(this.y, R(class06570.lA));
      class06886.L(
            class06510.method_8091(
               class06570.TK,
               class06570.Tq,
               class06570.TV,
               class06570.Te,
               class06570.To,
               class06570.le,
               class06570.bT,
               class06570.bb,
               class06570.bj,
               class06570.bv,
               class06570.GC,
               class06570.bW,
               class06570.bm,
               class06570.bP,
               class06570.bs,
               class06570.dv
            ),
            class01990.field_40642,
            class06570.lF,
            0.1F,
            200
         )
         .y("has_iron_pickaxe", this.y(class06570.TK))
         .y("has_iron_shovel", this.y(class06570.Tq))
         .y("has_iron_axe", this.y(class06570.TV))
         .y("has_iron_hoe", this.y(class06570.Te))
         .y("has_iron_sword", this.y(class06570.To))
         .y("has_iron_spear", this.y(class06570.le))
         .y("has_iron_helmet", this.y(class06570.bT))
         .y("has_iron_chestplate", this.y(class06570.bb))
         .y("has_iron_leggings", this.y(class06570.bj))
         .y("has_iron_boots", this.y(class06570.bv))
         .y("has_iron_horse_armor", this.y(class06570.GC))
         .y("has_chainmail_helmet", this.y(class06570.bW))
         .y("has_chainmail_chestplate", this.y(class06570.bm))
         .y("has_chainmail_leggings", this.y(class06570.bP))
         .y("has_chainmail_boots", this.y(class06570.bs))
         .y("has_iron_nautilus_armor", this.y(class06570.dv))
         .N(this.y, R(class06570.lF));
      class06886.L(class06510.method_8101(class00869.in), class01990.field_40634, class00869.zj.B(), 0.35F, 200)
         .y("has_clay_block", this.y(class00869.in))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.id), class01990.field_40642, class06570.GK, 0.1F, 200)
         .y("has_netherrack", this.y(class00869.id))
         .N(this.y);
      class06886.L(class06510.method_8101(class06570.Mq), class01990.field_40642, class06570.GV, 0.1F, 200)
         .y("has_resin_clump", this.y(class00869.Ra))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.BA), class01990.field_40642, class06570.Tu, 0.2F, 200)
         .y("has_nether_quartz_ore", this.y(class00869.BA))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Nx), class01990.field_40634, class00869.NS.B(), 0.15F, 200)
         .y("has_wet_sponge", this.y(class00869.Nx))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.W), class01990.field_40634, class00869.y.B(), 0.1F, 200)
         .y("has_cobblestone", this.y(class00869.W))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.y), class01990.field_40634, class00869.UV.B(), 0.1F, 200).y("has_stone", this.y(class00869.y)).N(this.y);
      class06886.L(class06510.method_8101(class00869.yL), class01990.field_40634, class00869.Ue.B(), 0.1F, 200)
         .y("has_sandstone", this.y(class00869.yL))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.UB), class01990.field_40634, class00869.Uc.B(), 0.1F, 200)
         .y("has_red_sandstone", this.y(class00869.UB))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.BC), class01990.field_40634, class00869.UH.B(), 0.1F, 200)
         .y("has_quartz_block", this.y(class00869.BC))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Rm), class01990.field_40634, class00869.Rs.B(), 0.1F, 200)
         .y("has_stone_bricks", this.y(class00869.Rm))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Zs), class01990.field_40635, class00869.Wb.B(), 0.1F, 200)
         .y("has_black_terracotta", this.y(class00869.Zs))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZE), class01990.field_40635, class00869.Wm.B(), 0.1F, 200)
         .y("has_blue_terracotta", this.y(class00869.ZE))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZW), class01990.field_40635, class00869.WP.B(), 0.1F, 200)
         .y("has_brown_terracotta", this.y(class00869.ZW))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Zz), class01990.field_40635, class00869.WE.B(), 0.1F, 200)
         .y("has_cyan_terracotta", this.y(class00869.Zz))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZB), class01990.field_40635, class00869.Wz.B(), 0.1F, 200)
         .y("has_gray_terracotta", this.y(class00869.ZB))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Zm), class01990.field_40635, class00869.Ws.B(), 0.1F, 200)
         .y("has_green_terracotta", this.y(class00869.Zm))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Zu), class01990.field_40635, class00869.WR.B(), 0.1F, 200)
         .y("has_light_blue_terracotta", this.y(class00869.Zu))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZZ), class01990.field_40635, class00869.WU.B(), 0.1F, 200)
         .y("has_light_gray_terracotta", this.y(class00869.ZZ))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZR), class01990.field_40635, class00869.WB.B(), 0.1F, 200)
         .y("has_lime_terracotta", this.y(class00869.ZR))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZL), class01990.field_40635, class00869.Wi.B(), 0.1F, 200)
         .y("has_magenta_terracotta", this.y(class00869.ZL))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Zy), class01990.field_40635, class00869.Wu.B(), 0.1F, 200)
         .y("has_orange_terracotta", this.y(class00869.Zy))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZM), class01990.field_40635, class00869.WZ.B(), 0.1F, 200)
         .y("has_pink_terracotta", this.y(class00869.ZM))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZU), class01990.field_40635, class00869.WW.B(), 0.1F, 200)
         .y("has_purple_terracotta", this.y(class00869.ZU))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZP), class01990.field_40635, class00869.WT.B(), 0.1F, 200)
         .y("has_red_terracotta", this.y(class00869.ZP))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.ZN), class01990.field_40635, class00869.WL.B(), 0.1F, 200)
         .y("has_white_terracotta", this.y(class00869.ZN))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Zi), class01990.field_40635, class00869.WM.B(), 0.1F, 200)
         .y("has_yellow_terracotta", this.y(class00869.Zi))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.Tz), class01990.field_40642, class06570.TW, 2.0F, 200)
         .y("has_ancient_debris", this.y(class00869.Tz))
         .N(this.y);
      class06886.L(class06510.method_8101(class00869.iY), class01990.field_40634, class00869.nO, 0.1F, 200).y("has_basalt", this.y(class00869.iY)).N(this.y);
      class06886.L(class06510.method_8101(class00869.nz), class01990.field_40634, class00869.nZ, 0.1F, 200)
         .y("has_cobbled_deepslate", this.y(class00869.nz))
         .N(this.y);
      class06886.L(this.y(class01226.H), class01990.field_40642, class00869.nN, 0.1F, 200).y("has_leaves", this.N(class01226.H)).N(this.y);
      this.y(L, class01990.field_40642, class06570.sh, 0.1F, 100, "coal");
      this.y(u, class01990.field_40642, class06570.TM, 0.7F, 100, "iron_ingot");
      this.y(i, class01990.field_40642, class06570.TZ, 0.7F, 100, "copper_ingot");
      this.y(R, class01990.field_40642, class06570.TU, 1.0F, 100, "gold_ingot");
      this.y(M, class01990.field_40642, class06570.TN, 1.0F, 100, "diamond");
      this.y(B, class01990.field_40642, class06570.TL, 0.2F, 100, "lapis_lazuli");
      this.y(Z, class01990.field_40636, class06570.WY, 0.7F, 100, "redstone");
      this.y(z, class01990.field_40642, class06570.Ty, 1.0F, 100, "emerald");
      class06886.y(class06510.method_8101(class00869.BA), class01990.field_40642, class06570.Tu, 0.2F, 100)
         .y("has_nether_quartz_ore", this.y(class00869.BA))
         .N(this.y, M(class06570.Tu));
      class06886.y(
            class06510.method_8091(
               class06570.Tg,
               class06570.TO,
               class06570.TI,
               class06570.TJ,
               class06570.TQ,
               class06570.lH,
               class06570.bd,
               class06570.bw,
               class06570.bk,
               class06570.bY,
               class06570.GS,
               class06570.dn
            ),
            class01990.field_40642,
            class06570.nW,
            0.1F,
            100
         )
         .y("has_golden_pickaxe", this.y(class06570.Tg))
         .y("has_golden_shovel", this.y(class06570.TO))
         .y("has_golden_axe", this.y(class06570.TI))
         .y("has_golden_hoe", this.y(class06570.TJ))
         .y("has_golden_sword", this.y(class06570.TQ))
         .y("has_golden_spear", this.y(class06570.lH))
         .y("has_golden_helmet", this.y(class06570.bd))
         .y("has_golden_chestplate", this.y(class06570.bw))
         .y("has_golden_leggings", this.y(class06570.bk))
         .y("has_golden_boots", this.y(class06570.bY))
         .y("has_golden_horse_armor", this.y(class06570.GS))
         .y("has_golden_nautilus_armor", this.y(class06570.dn))
         .N(this.y, M(class06570.nW));
      class06886.y(
            class06510.method_8091(
               class06570.Tn,
               class06570.Tv,
               class06570.Tt,
               class06570.TG,
               class06570.Tj,
               class06570.lV,
               class06570.bZ,
               class06570.bz,
               class06570.bU,
               class06570.bE,
               class06570.Gf,
               class06570.dl
            ),
            class01990.field_40642,
            class06570.lA,
            0.1F,
            100
         )
         .y("has_copper_pickaxe", this.y(class06570.Tn))
         .y("has_copper_shovel", this.y(class06570.Tv))
         .y("has_copper_axe", this.y(class06570.Tt))
         .y("has_copper_hoe", this.y(class06570.TG))
         .y("has_copper_sword", this.y(class06570.Tj))
         .y("has_copper_spear", this.y(class06570.lV))
         .y("has_copper_helmet", this.y(class06570.bZ))
         .y("has_copper_chestplate", this.y(class06570.bz))
         .y("has_copper_leggings", this.y(class06570.bU))
         .y("has_copper_boots", this.y(class06570.bE))
         .y("has_copper_horse_armor", this.y(class06570.Gf))
         .y("has_copper_nautilus_armor", this.y(class06570.dl))
         .N(this.y, M(class06570.lA));
      class06886.y(
            class06510.method_8091(
               class06570.TK,
               class06570.Tq,
               class06570.TV,
               class06570.Te,
               class06570.To,
               class06570.le,
               class06570.bT,
               class06570.bb,
               class06570.bj,
               class06570.bv,
               class06570.GC,
               class06570.dv,
               class06570.bW,
               class06570.bm,
               class06570.bP,
               class06570.bs
            ),
            class01990.field_40642,
            class06570.lF,
            0.1F,
            100
         )
         .y("has_iron_pickaxe", this.y(class06570.TK))
         .y("has_iron_shovel", this.y(class06570.Tq))
         .y("has_iron_axe", this.y(class06570.TV))
         .y("has_iron_hoe", this.y(class06570.Te))
         .y("has_iron_sword", this.y(class06570.To))
         .y("has_iron_spear", this.y(class06570.le))
         .y("has_iron_helmet", this.y(class06570.bT))
         .y("has_iron_chestplate", this.y(class06570.bb))
         .y("has_iron_leggings", this.y(class06570.bj))
         .y("has_iron_boots", this.y(class06570.bv))
         .y("has_iron_horse_armor", this.y(class06570.GC))
         .y("has_chainmail_helmet", this.y(class06570.bW))
         .y("has_chainmail_chestplate", this.y(class06570.bm))
         .y("has_chainmail_leggings", this.y(class06570.bP))
         .y("has_chainmail_boots", this.y(class06570.bs))
         .y("has_iron_nautilus_armor", this.y(class06570.dv))
         .N(this.y, M(class06570.lF));
      class06886.y(class06510.method_8101(class00869.Tz), class01990.field_40642, class06570.TW, 2.0F, 100)
         .y("has_ancient_debris", this.y(class00869.Tz))
         .N(this.y, M(class06570.TW));
      this.N("smoking", class06514.b, class05636::new, 100);
      this.N("campfire_cooking", class06514.j, class05869::new, 600);
      this.N(class01990.field_40634, class00869.UG, class00869.y, 2);
      this.Z(class01990.field_40634, class00869.PB, class00869.y);
      this.Z(class01990.field_40634, class00869.Rm, class00869.y);
      this.N(class01990.field_40634, class00869.UO, class00869.y, 2);
      this.Z(class01990.field_40634, class00869.RA, class00869.y);
      class06161.N(class06510.method_8101(class00869.y), class01990.field_40634, class00869.RT)
         .y("has_stone", this.y(class00869.y))
         .N(this.y, "chiseled_stone_bricks_stone_from_stonecutting");
      class06161.N(class06510.method_8101(class00869.y), class01990.field_40635, class00869.Po)
         .y("has_stone", this.y(class00869.y))
         .N(this.y, "stone_brick_walls_from_stone_stonecutting");
      this.Z(class01990.field_40634, class00869.yi, class00869.yL);
      this.N(class01990.field_40634, class00869.Ud, class00869.yL, 2);
      this.N(class01990.field_40634, class00869.Uw, class00869.yL, 2);
      this.N(class01990.field_40634, class00869.Uw, class00869.yi, 2);
      this.Z(class01990.field_40634, class00869.Mj, class00869.yL);
      this.Z(class01990.field_40635, class00869.PH, class00869.yL);
      this.Z(class01990.field_40634, class00869.yu, class00869.yL);
      this.Z(class01990.field_40634, class00869.Uz, class00869.UB);
      this.N(class01990.field_40634, class00869.Uo, class00869.UB, 2);
      this.N(class01990.field_40634, class00869.Uq, class00869.UB, 2);
      this.N(class01990.field_40634, class00869.Uq, class00869.Uz, 2);
      this.Z(class01990.field_40634, class00869.UU, class00869.UB);
      this.Z(class01990.field_40635, class00869.Pg, class00869.UB);
      this.Z(class01990.field_40634, class00869.UZ, class00869.UB);
      class06161.N(class06510.method_8101(class00869.BC), class01990.field_40634, class00869.UJ, 2)
         .y("has_quartz_block", this.y(class00869.BC))
         .N(this.y, "quartz_slab_from_stonecutting");
      this.Z(class01990.field_40634, class00869.BD, class00869.BC);
      this.Z(class01990.field_40634, class00869.Bx, class00869.BC);
      this.Z(class01990.field_40634, class00869.BS, class00869.BC);
      this.Z(class01990.field_40634, class00869.TV, class00869.BC);
      this.Z(class01990.field_40634, class00869.uP, class00869.W);
      this.N(class01990.field_40634, class00869.UY, class00869.W, 2);
      this.Z(class01990.field_40635, class00869.Mg, class00869.W);
      this.N(class01990.field_40634, class00869.UO, class00869.Rm, 2);
      this.Z(class01990.field_40634, class00869.RA, class00869.Rm);
      class06161.N(class06510.method_8101(class00869.Rm), class01990.field_40635, class00869.Po)
         .y("has_stone_bricks", this.y(class00869.Rm))
         .N(this.y, "stone_brick_wall_from_stone_bricks_stonecutting");
      this.Z(class01990.field_40634, class00869.RT, class00869.Rm);
      this.N(class01990.field_40634, class00869.UQ, class00869.Lv, 2);
      this.Z(class01990.field_40634, class00869.RF, class00869.Lv);
      this.Z(class01990.field_40635, class00869.PQ, class00869.Lv);
      this.N(class01990.field_40634, class00869.Ug, class00869.Rj, 2);
      this.Z(class01990.field_40634, class00869.Rf, class00869.Rj);
      this.Z(class01990.field_40635, class00869.Pq, class00869.Rj);
      this.N(class01990.field_40634, class00869.UI, class00869.ML, 2);
      this.Z(class01990.field_40634, class00869.Mi, class00869.ML);
      this.Z(class01990.field_40635, class00869.PK, class00869.ML);
      this.Z(class01990.field_40634, class00869.Tq, class00869.ML);
      this.N(class01990.field_40634, class00869.Rr, class00869.RD, 2);
      this.Z(class01990.field_40634, class00869.Rh, class00869.RD);
      this.Z(class01990.field_40635, class00869.MN, class00869.RD);
      this.Z(class01990.field_40634, class00869.My, class00869.RD);
      this.N(class01990.field_40634, class00869.Pw, class00869.Eo, 2);
      this.Z(class01990.field_40634, class00869.PW, class00869.Eo);
      this.Z(class01990.field_40635, class00869.Pe, class00869.Eo);
      this.N(class01990.field_40634, class00869.UK, class00869.Ej, 2);
      this.Z(class01990.field_40634, class00869.En, class00869.Ej);
      this.Z(class01990.field_40634, class00869.Ev, class00869.Ej);
      this.N(class01990.field_40634, class00869.ZD, class00869.ZF, 2);
      this.Z(class01990.field_40634, class00869.ZC, class00869.ZF);
      this.Z(class01990.field_40635, class00869.PO, class00869.ZF);
      class06161.N(class06510.method_8101(class00869.ZA), class01990.field_40634, class00869.Zh, 2)
         .y("has_prismarine_brick", this.y(class00869.ZA))
         .N(this.y, "prismarine_brick_slab_from_prismarine_stonecutting");
      class06161.N(class06510.method_8101(class00869.ZA), class01990.field_40634, class00869.ZS)
         .y("has_prismarine_brick", this.y(class00869.ZA))
         .N(this.y, "prismarine_brick_stairs_from_prismarine_stonecutting");
      this.N(class01990.field_40634, class00869.Zr, class00869.Zf, 2);
      this.Z(class01990.field_40634, class00869.Zx, class00869.Zf);
      this.N(class01990.field_40634, class00869.Pd, class00869.M, 2);
      this.Z(class01990.field_40634, class00869.PE, class00869.M);
      this.Z(class01990.field_40635, class00869.PV, class00869.M);
      this.Z(class01990.field_40634, class00869.B, class00869.M);
      this.N(class01990.field_40634, class00869.Pk, class00869.M, 2);
      this.Z(class01990.field_40634, class00869.Pm, class00869.M);
      this.N(class01990.field_40634, class00869.Pk, class00869.B, 2);
      this.Z(class01990.field_40634, class00869.Pm, class00869.B);
      this.Z(class01990.field_40634, class00869.iQ, class00869.iY);
      this.N(class01990.field_40634, class00869.Pl, class00869.L, 2);
      this.Z(class01990.field_40634, class00869.PU, class00869.L);
      this.Z(class01990.field_40635, class00869.PJ, class00869.L);
      this.Z(class01990.field_40634, class00869.u, class00869.L);
      this.N(class01990.field_40634, class00869.Ps, class00869.L, 2);
      this.Z(class01990.field_40634, class00869.Py, class00869.L);
      this.N(class01990.field_40634, class00869.Ps, class00869.u, 2);
      this.Z(class01990.field_40634, class00869.Py, class00869.u);
      this.N(class01990.field_40634, class00869.PY, class00869.i, 2);
      this.Z(class01990.field_40634, class00869.PP, class00869.i);
      this.Z(class01990.field_40635, class00869.PX, class00869.i);
      this.Z(class01990.field_40634, class00869.R, class00869.i);
      this.N(class01990.field_40634, class00869.Pj, class00869.i, 2);
      this.Z(class01990.field_40634, class00869.Pi, class00869.i);
      this.N(class01990.field_40634, class00869.Pj, class00869.R, 2);
      this.Z(class01990.field_40634, class00869.Pi, class00869.R);
      class06161.N(class06510.method_8101(class00869.RP), class01990.field_40634, class00869.Pb, 2)
         .y("has_mossy_stone_bricks", this.y(class00869.RP))
         .N(this.y, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      class06161.N(class06510.method_8101(class00869.RP), class01990.field_40634, class00869.Pu)
         .y("has_mossy_stone_bricks", this.y(class00869.RP))
         .N(this.y, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      class06161.N(class06510.method_8101(class00869.RP), class01990.field_40635, class00869.PI)
         .y("has_mossy_stone_bricks", this.y(class00869.RP))
         .N(this.y, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      this.N(class01990.field_40634, class00869.Pv, class00869.LK, 2);
      this.Z(class01990.field_40634, class00869.PR, class00869.LK);
      this.Z(class01990.field_40635, class00869.MI, class00869.LK);
      this.N(class01990.field_40634, class00869.Pt, class00869.Ue, 2);
      this.Z(class01990.field_40634, class00869.PZ, class00869.Ue);
      this.N(class01990.field_40634, class00869.PT, class00869.Uc, 2);
      this.Z(class01990.field_40634, class00869.PL, class00869.Uc);
      this.N(class01990.field_40634, class00869.PG, class00869.UH, 2);
      this.Z(class01990.field_40634, class00869.Pz, class00869.UH);
      class06161.N(class06510.method_8101(class00869.Et), class01990.field_40634, class00869.Pn, 2)
         .y("has_end_stone_brick", this.y(class00869.Et))
         .N(this.y, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      class06161.N(class06510.method_8101(class00869.Et), class01990.field_40634, class00869.PM)
         .y("has_end_stone_brick", this.y(class00869.Et))
         .N(this.y, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      class06161.N(class06510.method_8101(class00869.Et), class01990.field_40635, class00869.Pc)
         .y("has_end_stone_brick", this.y(class00869.Et))
         .N(this.y, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      this.Z(class01990.field_40634, class00869.Et, class00869.MP);
      this.N(class01990.field_40634, class00869.Pn, class00869.MP, 2);
      this.Z(class01990.field_40634, class00869.PM, class00869.MP);
      this.Z(class01990.field_40635, class00869.Pc, class00869.MP);
      this.N(class01990.field_40634, class00869.Ul, class00869.UV, 2);
      this.N(class01990.field_40634, class00869.Tn, class00869.Tb, 2);
      this.Z(class01990.field_40634, class00869.Tj, class00869.Tb);
      this.Z(class01990.field_40635, class00869.Tv, class00869.Tb);
      this.Z(class01990.field_40634, class00869.Tt, class00869.Tb);
      this.Z(class01990.field_40635, class00869.To, class00869.Tb);
      this.N(class01990.field_40634, class00869.Tg, class00869.Tb, 2);
      this.Z(class01990.field_40634, class00869.TO, class00869.Tb);
      this.Z(class01990.field_40634, class00869.Td, class00869.Tb);
      this.Z(class01990.field_40634, class00869.TG, class00869.Tb);
      this.N(class01990.field_40634, class00869.Tw, class00869.Tb, 2);
      this.Z(class01990.field_40634, class00869.Tk, class00869.Tb);
      this.Z(class01990.field_40635, class00869.TY, class00869.Tb);
      this.N(class01990.field_40634, class00869.Tg, class00869.Tt, 2);
      this.Z(class01990.field_40634, class00869.TO, class00869.Tt);
      this.Z(class01990.field_40634, class00869.TG, class00869.Tt);
      this.Z(class01990.field_40635, class00869.To, class00869.Tt);
      this.N(class01990.field_40634, class00869.Tw, class00869.Tt, 2);
      this.Z(class01990.field_40634, class00869.Tk, class00869.Tt);
      this.Z(class01990.field_40635, class00869.TY, class00869.Tt);
      this.Z(class01990.field_40634, class00869.Td, class00869.Tt);
      this.N(class01990.field_40634, class00869.Tw, class00869.TG, 2);
      this.Z(class01990.field_40634, class00869.Tk, class00869.TG);
      this.Z(class01990.field_40635, class00869.TY, class00869.TG);
      this.N(class01990.field_40634, class00869.jt, class00869.jR, 2);
      this.Z(class01990.field_40634, class00869.jb, class00869.jR);
      this.N(class01990.field_40634, class00869.jn, class00869.ji, 2);
      this.Z(class01990.field_40634, class00869.jT, class00869.ji);
      this.N(class01990.field_40634, class00869.jv, class00869.ju, 2);
      this.Z(class01990.field_40634, class00869.js, class00869.ju);
      this.N(class01990.field_40634, class00869.jj, class00869.jL, 2);
      this.Z(class01990.field_40634, class00869.jP, class00869.jL);
      this.N(class01990.field_40634, class00869.je, class00869.jO, 2);
      this.Z(class01990.field_40634, class00869.jo, class00869.jO);
      this.N(class01990.field_40634, class00869.jV, class00869.jQ, 2);
      this.Z(class01990.field_40634, class00869.jJ, class00869.jQ);
      this.N(class01990.field_40634, class00869.jK, class00869.jY, 2);
      this.Z(class01990.field_40634, class00869.jI, class00869.jY);
      this.N(class01990.field_40634, class00869.jq, class00869.jk, 2);
      this.Z(class01990.field_40634, class00869.jg, class00869.jk);
      this.N(class01990.field_40634, class00869.jR, class00869.bx, 4);
      this.N(class01990.field_40634, class00869.jb, class00869.bx, 4);
      this.N(class01990.field_40634, class00869.jt, class00869.bx, 8);
      this.N(class01990.field_40634, class00869.ji, class00869.bD, 4);
      this.N(class01990.field_40634, class00869.jT, class00869.bD, 4);
      this.N(class01990.field_40634, class00869.jn, class00869.bD, 8);
      this.N(class01990.field_40634, class00869.ju, class00869.bh, 4);
      this.N(class01990.field_40634, class00869.js, class00869.bh, 4);
      this.N(class01990.field_40634, class00869.jv, class00869.bh, 8);
      this.N(class01990.field_40634, class00869.jL, class00869.br, 4);
      this.N(class01990.field_40634, class00869.jP, class00869.br, 4);
      this.N(class01990.field_40634, class00869.jj, class00869.br, 8);
      this.N(class01990.field_40634, class00869.jO, class00869.jG, 4);
      this.N(class01990.field_40634, class00869.jo, class00869.jG, 4);
      this.N(class01990.field_40634, class00869.je, class00869.jG, 8);
      this.N(class01990.field_40634, class00869.jQ, class00869.jd, 4);
      this.N(class01990.field_40634, class00869.jJ, class00869.jd, 4);
      this.N(class01990.field_40634, class00869.jV, class00869.jd, 8);
      this.N(class01990.field_40634, class00869.jY, class00869.jl, 4);
      this.N(class01990.field_40634, class00869.jI, class00869.jl, 4);
      this.N(class01990.field_40634, class00869.jK, class00869.jl, 8);
      this.N(class01990.field_40634, class00869.jk, class00869.jw, 4);
      this.N(class01990.field_40634, class00869.jg, class00869.jw, 4);
      this.N(class01990.field_40634, class00869.jq, class00869.jw, 8);
      this.N(class01990.field_40634, class00869.nE, class00869.nz, 2);
      this.Z(class01990.field_40634, class00869.nU, class00869.nz);
      this.Z(class01990.field_40635, class00869.nW, class00869.nz);
      this.Z(class01990.field_40634, class00869.nw, class00869.nz);
      this.Z(class01990.field_40634, class00869.nm, class00869.nz);
      this.N(class01990.field_40634, class00869.ns, class00869.nz, 2);
      this.Z(class01990.field_40634, class00869.nP, class00869.nz);
      this.Z(class01990.field_40635, class00869.nT, class00869.nz);
      this.Z(class01990.field_40634, class00869.nt, class00869.nz);
      this.N(class01990.field_40634, class00869.nl, class00869.nz, 2);
      this.Z(class01990.field_40634, class00869.nG, class00869.nz);
      this.Z(class01990.field_40635, class00869.nd, class00869.nz);
      this.Z(class01990.field_40634, class00869.nb, class00869.nz);
      this.N(class01990.field_40634, class00869.nv, class00869.nz, 2);
      this.Z(class01990.field_40634, class00869.nj, class00869.nz);
      this.Z(class01990.field_40635, class00869.nn, class00869.nz);
      this.N(class01990.field_40634, class00869.ns, class00869.nm, 2);
      this.Z(class01990.field_40634, class00869.nP, class00869.nm);
      this.Z(class01990.field_40635, class00869.nT, class00869.nm);
      this.Z(class01990.field_40634, class00869.nt, class00869.nm);
      this.N(class01990.field_40634, class00869.nl, class00869.nm, 2);
      this.Z(class01990.field_40634, class00869.nG, class00869.nm);
      this.Z(class01990.field_40635, class00869.nd, class00869.nm);
      this.Z(class01990.field_40634, class00869.nb, class00869.nm);
      this.N(class01990.field_40634, class00869.nv, class00869.nm, 2);
      this.Z(class01990.field_40634, class00869.nj, class00869.nm);
      this.Z(class01990.field_40635, class00869.nn, class00869.nm);
      this.N(class01990.field_40634, class00869.nl, class00869.nt, 2);
      this.Z(class01990.field_40634, class00869.nG, class00869.nt);
      this.Z(class01990.field_40635, class00869.nd, class00869.nt);
      this.Z(class01990.field_40634, class00869.nb, class00869.nt);
      this.N(class01990.field_40634, class00869.nv, class00869.nt, 2);
      this.Z(class01990.field_40634, class00869.nj, class00869.nt);
      this.Z(class01990.field_40635, class00869.nn, class00869.nt);
      this.N(class01990.field_40634, class00869.nv, class00869.nb, 2);
      this.Z(class01990.field_40634, class00869.nj, class00869.nb);
      this.Z(class01990.field_40635, class00869.nn, class00869.nb);
      y().forEach(var1x -> this.N(var1x.N(), var1x.y(), var1x.L()));
      this.N(class06570.bt, class01990.field_40639, class06570.bO);
      this.N(class06570.bG, class01990.field_40639, class06570.bg);
      this.N(class06570.bn, class01990.field_40639, class06570.bQ);
      this.N(class06570.bl, class01990.field_40639, class06570.bI);
      this.N(class06570.dt, class01990.field_40639, class06570.dG);
      this.N(class06570.Gx, class01990.field_40639, class06570.GD);
      this.N(class06570.TH, class01990.field_40639, class06570.TF);
      this.N(class06570.lc, class01990.field_40639, class06570.lX);
      this.N(class06570.Ta, class01990.field_40638, class06570.TC);
      this.N(class06570.TX, class01990.field_40638, class06570.Tf);
      this.N(class06570.Tp, class01990.field_40638, class06570.TS);
      this.N(class06570.Tc, class01990.field_40638, class06570.TA);
      this.b(class06570.ky, class06570.RS);
      this.b(class06570.kL, class06570.K);
      this.b(class06570.ku, class06570.Lp);
      this.b(class06570.ki, class06570.K);
      this.b(class06570.kR, class06570.RZ);
      this.b(class06570.kM, class06570.z);
      this.b(class06570.kB, class06570.BR);
      this.b(class06570.kZ, class06570.K);
      this.b(class06570.kz, class06570.zQ);
      this.b(class06570.kU, class06570.wW);
      this.b(class06570.kE, class06570.RS);
      this.b(class06570.kW, class06570.RP);
      this.b(class06570.ks, class06570.z);
      this.b(class06570.km, class06570.Zc);
      this.b(class06570.kP, class06570.Zc);
      this.b(class06570.kT, class06570.Zc);
      this.b(class06570.kb, class06570.Zc);
      this.b(class06570.kj, class06570.GW);
      this.B(class06570.kv, class06510.method_8091(class06570.Nc, class06570.yU));
      this.y(class01990.field_40634, class00869.NZ, class06570.iz);
      this.y(class00869.l, class01226.T, 2);
      this.B(class01990.field_40635, class00869.d, class00869.Un);
      this.y(class06570.sK, class00869.l);
      this.L(class06570.sV, class06570.sK);
      this.R(class06570.bh, class00869.NT);
      this.R(class06570.br, class00869.Nz);
      this.R(class06570.jN, class00869.NU);
      this.R(class06570.jy, class00869.NE);
      this.R(class06570.jL, class00869.NW);
      this.R(class06570.ju, class00869.Nm);
      this.R(class06570.ji, class00869.NP);
      this.R(class06570.jR, class00869.Ns);
      this.R(class06570.jM, class00869.Nb);
      this.R(class06570.jB, class06570.LP);
      this.R(class06570.jZ, class00869.sb);
      this.R(class06570.jz, class00869.sZ);
      this.N(class01990.field_40634, class00869.LG)
         .N('#', class01226.y)
         .N('X', class01226.z)
         .N("###")
         .N("XXX")
         .N("###")
         .y("has_book", this.y(class06570.jY))
         .N(this.y);
      this.N(class06570.vm, class00869.LL, "orange_dye");
      this.N(class06570.vt, class00869.Ed, "cyan_dye", 2);
      this.N(class00869.j, class01226.w, 4);
      this.N((class07310)class00869.Nd, (class07310)class00869.NL);
      this.N((class07310)class00869.NJ, (class07310)class00869.Nm);
      this.y(class06570.sY, class00869.j);
      this.L(class06570.sQ, class06570.sY);
      this.N(class06570.vj, class06570.uh, "pink_dye", 1);
      this.N(class01990.field_40638, class06570.kN)
         .N('X', class06570.Tr)
         .N('#', class06570.TZ)
         .N('I', class06570.Tx)
         .N("X")
         .N("#")
         .N("I")
         .y("has_copper_ingot", this.y(class06570.TZ))
         .N(this.y);
      this.N(class01990.field_40635, class06570.RB)
         .N('#', class06570.jl)
         .N(" # ")
         .N("# #")
         .N(" # ")
         .y("has_brick", this.N(class01226.yr))
         .N(this.y, "decorated_pot_simple");
      class06863.N(class01946::new).N(this.y, "decorated_pot");
      this.N(class01990.field_40636, class00869.na)
         .N('#', class06570.TM)
         .N('C', class06570.Rn)
         .N('R', class06570.WY)
         .N('D', class06570.Wc)
         .N("###")
         .N("#C#")
         .N("RDR")
         .y("has_dropper", this.y(class06570.Wc))
         .N(this.y);
      this.N(class01990.field_40634, class00869.bk, class00869.bw, 2);
      this.Z(class01990.field_40634, class00869.bY, class00869.bw);
      this.Z(class01990.field_40635, class00869.bQ, class00869.bw);
      this.Z(class01990.field_40634, class00869.bo, class00869.bw);
      this.Z(class01990.field_40634, class00869.bO, class00869.bw);
      this.N(class01990.field_40634, class00869.bg, class00869.bw, 2);
      this.Z(class01990.field_40634, class00869.bI, class00869.bw);
      this.Z(class01990.field_40635, class00869.bJ, class00869.bw);
      this.Z(class01990.field_40634, class00869.bq, class00869.bw);
      this.N(class01990.field_40634, class00869.bK, class00869.bw, 2);
      this.Z(class01990.field_40634, class00869.bV, class00869.bw);
      this.Z(class01990.field_40635, class00869.be, class00869.bw);
      this.Z(class01990.field_40634, class00869.bH, class00869.bw);
      this.N(class01990.field_40634, class00869.bg, class00869.bO, 2);
      this.Z(class01990.field_40634, class00869.bI, class00869.bO);
      this.Z(class01990.field_40635, class00869.bJ, class00869.bO);
      this.Z(class01990.field_40634, class00869.bq, class00869.bO);
      this.N(class01990.field_40634, class00869.bK, class00869.bO, 2);
      this.Z(class01990.field_40634, class00869.bV, class00869.bO);
      this.Z(class01990.field_40635, class00869.be, class00869.bO);
      this.Z(class01990.field_40634, class00869.bH, class00869.bO);
      this.N(class01990.field_40634, class00869.bK, class00869.bq, 2);
      this.Z(class01990.field_40634, class00869.bV, class00869.bq);
      this.Z(class01990.field_40635, class00869.be, class00869.bq);
      this.Z(class01990.field_40634, class00869.bH, class00869.bq);
      this.N(class01990.field_40634, class00869.jz, class00869.bx, 4);
      this.N(class01990.field_40634, class00869.jZ, class00869.bD, 4);
      this.N(class01990.field_40634, class00869.jB, class00869.bh, 4);
      this.N(class01990.field_40634, class00869.jM, class00869.br, 4);
      this.N(class01990.field_40634, class00869.jm, class00869.jG, 4);
      this.N(class01990.field_40634, class00869.jW, class00869.jd, 4);
      this.N(class01990.field_40634, class00869.jE, class00869.jl, 4);
      this.N(class01990.field_40634, class00869.jU, class00869.jw, 4);
      this.N(class01990.field_40634, class00869.jz, class00869.jR, 1);
      this.N(class01990.field_40634, class00869.jZ, class00869.ji, 1);
      this.N(class01990.field_40634, class00869.jB, class00869.ju, 1);
      this.N(class01990.field_40634, class00869.jM, class00869.jL, 1);
      this.N(class01990.field_40634, class00869.jm, class00869.jO, 1);
      this.N(class01990.field_40634, class00869.jW, class00869.jQ, 1);
      this.N(class01990.field_40634, class00869.jE, class00869.jY, 1);
      this.N(class01990.field_40634, class00869.jU, class00869.jk, 1);
      this.N(class00869.vL, class00869.bx);
      this.N(class00869.vu, class00869.bD);
      this.N(class00869.vi, class00869.bh);
      this.N(class00869.vR, class00869.br);
      this.N(class00869.vM, class00869.jG);
      this.N(class00869.vB, class00869.jd);
      this.N(class00869.vZ, class00869.jl);
      this.N(class00869.vz, class00869.jw);
      this.y(class00869.vU, class00869.bx);
      this.y(class00869.vE, class00869.bD);
      this.y(class00869.vW, class00869.bh);
      this.y(class00869.vm, class00869.br);
      this.y(class00869.vP, class00869.jG);
      this.y(class00869.vs, class00869.jd);
      this.y(class00869.vT, class00869.jl);
      this.y(class00869.vb, class00869.jw);
      this.L(class00869.jm, class00869.je);
      this.L(class00869.jW, class00869.jV);
      this.L(class00869.jE, class00869.jK);
      this.L(class00869.jU, class00869.jq);
      this.N(class01990.field_40634, class00869.vL, class00869.bx, 4);
      this.N(class01990.field_40634, class00869.vu, class00869.bD, 4);
      this.N(class01990.field_40634, class00869.vi, class00869.bh, 4);
      this.N(class01990.field_40634, class00869.vR, class00869.br, 4);
      this.N(class01990.field_40634, class00869.vM, class00869.jG, 4);
      this.N(class01990.field_40634, class00869.vB, class00869.jd, 4);
      this.N(class01990.field_40634, class00869.vZ, class00869.jl, 4);
      this.N(class01990.field_40634, class00869.vz, class00869.jw, 4);
      this.y(class01990.field_40642, class06570.Gz, 4).N(class06570.GW).y("has_breeze_rod", this.y(class06570.GW)).N(this.y);
      this.N(class01990.field_40639, class06570.Gm, 1)
         .N('I', class06570.GW)
         .N('#', class00869.nA)
         .N(" # ")
         .N(" I ")
         .y("has_breeze_rod", this.y(class06570.GW))
         .y("has_heavy_core", this.y(class00869.nA))
         .N(this.y);
      this.y(class00869.jH, class06510.method_8101(class06570.TZ)).y(L(class06570.TZ), this.y(class06570.TZ)).N(this.y);
      this.N(class01990.field_40636, class00869.jC, class06570.TZ);
      this.N(class01990.field_40638, class06570.jq).N('-', class06570.Th).N('#', class06570.js).N("-").N("#").y("has_string", this.y(class06570.Th)).N(this.y);
      this.u();
   }
}
