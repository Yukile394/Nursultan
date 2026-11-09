package minecraft;

import Nursultan.class11647;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class class05422 {
   private static final class08843 B = class08825.N(-1);
   public static final class01894 N = N("helmet");
   public static final class01894 y = N("chestplate");
   public static final class01894 L = N("leggings");
   public static final class01894 u = N("boots");
   public static final List<class05414> i = List.of(
      new class05414(class08548.u, class03270.N),
      new class05414(class08548.i, class03270.y),
      new class05414(class08548.R, class03270.L),
      new class05414(class08548.M, class03270.u),
      new class05414(class08548.B, class03270.i),
      new class05414(class08548.Z, class03270.R),
      new class05414(class08548.z, class03270.M),
      new class05414(class08548.U, class03270.B),
      new class05414(class08548.E, class03270.Z),
      new class05414(class08548.W, class03270.z),
      new class05414(class08548.m, class03270.U)
   );
   public final class08833 R;
   public final BiConsumer<class01894, class08819> M;

   public final void L(class06581 var1) {
      List<class08912> list = this.y(var1);
      this.R
         .N(
            var1,
            class08825.N(
               class08825.N(class02484.NP),
               class08825.N(new class08916(true, class08934.field_55390), 32.0F, list),
               class08825.N(new class08916(true, class08934.field_55391), 32.0F, list)
            )
         );
   }

   public final void M(class06581 var1) {
      class08895 class08895xxx = class08825.N(class05387.N(var1));
      class08895 class08895x = class08825.N(this.N(var1, "_pulling_0", class05433.LZ));
      class08895 class08895xx = class08825.N(this.N(var1, "_pulling_1", class05433.LZ));
      class08895 class08895xxx = class08825.N(this.N(var1, "_pulling_2", class05433.LZ));
      this.R
         .N(
            var1,
            class08825.N(
               class08825.N(),
               class08825.N(new class00334(false), 0.05F, class08895x, class08825.N(class08895xx, 0.65F), class08825.N(class08895xxx, 0.9F)),
               class08895xxx
            )
         );
   }

   public final void P(class06581 var1) {
      class08895 class08895xxx = class08825.N(this.N(var1, class05433.yD));
      class08895 class08895x = class08825.N(class05387.N(var1, "_in_hand"), new class00376());
      class08895 class08895xx = class08825.N(class05387.N(var1, "_throwing"), new class00376());
      class08895 class08895xxx = class08825.N(class08825.N(), class08895xx, class08895x);
      this.R.N(var1, N(class08895xxx, class08895xxx));
   }

   public final void T(class06581 var1) {
      class01894 class01894 = this.N(var1, class05387.y("potion_overlay"), class05387.N(var1));
      this.N(var1, class01894);
   }

   public class05422(class08833 var1, BiConsumer<class01894, class08819> var2) {
      super();
      this.R = var1;
      this.M = var2;
   }

   public final void B(class06581 var1) {
      class08895 class08895xxxxx = class08825.N(class05387.N(var1));
      class08895 class08895x = class08825.N(this.N(var1, "_pulling_0", class05433.Lz));
      class08895 class08895xx = class08825.N(this.N(var1, "_pulling_1", class05433.Lz));
      class08895 class08895xxx = class08825.N(this.N(var1, "_pulling_2", class05433.Lz));
      class08895 class08895xxxx = class08825.N(this.N(var1, "_arrow", class05433.Lz));
      class08895 class08895xxxxx = class08825.N(this.N(var1, "_firework", class05433.Lz));
      this.R
         .N(
            var1,
            class08825.N(
               new class00345(),
               class08825.N(
                  class08825.N(),
                  class08825.N(new class08897(), class08895x, class08825.N(class08895xx, 0.58F), class08825.N(class08895xxx, 1.0F)),
                  class08895xxxxx
               ),
               class08825.N(class06558.field_55207, class08895xxxx),
               class08825.N(class06558.field_55208, class08895xxxxx)
            )
         );
   }

   public final void Z(class06581 var1) {
      class08895 class08895x = class08825.N(this.N(var1, class05433.yD));
      class08895 class08895x = class08825.N(this.N(var1, "_broken", class05433.yD));
      this.N(var1, new class08941(), class08895x, class08895x);
   }

   public final void i(class06581 var1) {
      ArrayList arraylist = new ArrayList();
      class08895 class08895x = class08825.N(this.N(var1, "_00", class05433.yD));
      arraylist.add(class08825.N(class08895x, 0.0F));

      for (int ix = 1; ix < 64; ix++) {
         class08895 class08895x = class08825.N(this.N(var1, String.format(Locale.ROOT, "_%02d", ix), class05433.yD));
         arraylist.add(class08825.N(class08895x, ix - 0.5F));
      }

      arraylist.add(class08825.N(class08895x, 63.5F));
      this.R
         .N(
            var1,
            class08825.N(
               class08825.N(new class00347(true, class00342.field_55558), 64.0F, arraylist),
               class08825.N(new class00347(true, class00342.field_55557), 64.0F, arraylist)
            )
         );
   }

   public final void b(class06581 var1) {
      class01894 class01894 = this.N(var1, class05387.N(var1, "_head"), class05387.N(var1, "_base"));
      this.N(var1, class01894);
   }

   public final void s(class06581 var1) {
      class08895 class08895x = class08825.N(this.N(var1, class05433.yD));
      class08895 class08895x = class08825.N(class05433.LU.N(var1, class05388.U(class05388.N(var1, "_in_hand")), this.M));
      this.R.N(var1, N(class08895x, class08895x), new class08906(true, false, 1.95F));
   }

   public final void m(class06581 var1) {
      class08895 class08895x = class08825.N(this.N(var1, class05433.yD));
      class08895 class08895x = class08825.N(class05387.N(var1, "_in_hand"));
      this.R.N(var1, N(class08895x, class08895x));
   }

   public final void j(class06581 var1) {
      class01894 class01894xxx = class05388.L(var1);
      class01894 class01894x = class05388.N(var1, "_overlay");
      class01894 class01894xx = class05433.yD.N(var1, class05388.U(class01894xxx), this.M);
      class01894 class01894xxx = class05387.N(var1, "_dyed");
      class05433.Ly.N(class01894xxx, class05388.L(class01894xxx, class01894x), this.M);
      this.R.N(var1, class08825.N(class08825.N(class02484.F), class08825.N(class01894xxx, B, new class08840(0)), class08825.N(class01894xx)));
   }

   public final void U(class06581 var1) {
      class08895 class08895x = class08825.N(this.N(var1, class05433.LN));
      class08895 class08895x = class08825.N(this.N(var1, "_cast", class05433.LN));
      this.N(var1, new class08901(), class08895x, class08895x);
   }

   public final void z(class06581 var1) {
      class08895 class08895xxx = class08825.N(class05387.N(var1));
      class08895 class08895x = class08825.N(class05387.N(var1, "_brushing_0"));
      class08895 class08895xx = class08825.N(class05387.N(var1, "_brushing_1"));
      class08895 class08895xxx = class08825.N(class05387.N(var1, "_brushing_2"));
      this.R
         .N(
            var1,
            class08825.N(
               new class00350(10.0F),
               0.1F,
               class08895xxx,
               class08825.N(class08895x, 0.25F),
               class08825.N(class08895xx, 0.5F),
               class08825.N(class08895xxx, 0.75F)
            )
         );
   }

   public final void u(class06581 var1) {
      this.R.N(var1, class08825.N(new class08916(true, class08934.field_55392), 32.0F, this.y(var1)));
   }

   public final void y(class06581 var1, class06581 var2, class05403 var3) {
      this.R.N(var1, class08825.N(this.N(var1, var2, var3)));
   }

   public final void y(class06581 var1, int var2) {
      class01894 class01894 = this.N(var1, class05433.yD);
      this.R.N(var1, class08825.N(class01894, new class08840(var2)));
   }

   public final void y(class06581 var1, class05403 var2) {
      this.R.N(var1, class08825.N(this.N(var1, var2)));
   }

   public final List<class08912> y(class06581 var1) {
      ArrayList arraylist = new ArrayList();
      class08895 class08895x = class08825.N(this.N(var1, "_16", class05433.yD));
      arraylist.add(class08825.N(class08895x, 0.0F));

      for (int ix = 1; ix < 32; ix++) {
         int j = class04995.L(ix - 16, 32);
         class08895 class08895x = class08825.N(this.N(var1, String.format(Locale.ROOT, "_%02d", j), class05433.yD));
         arraylist.add(class08825.N(class08895x, ix - 0.5F));
      }

      arraylist.add(class08825.N(class08895x, 31.5F));
      return arraylist;
   }

   public final void E(class06581 var1) {
      class08895 class08895x = class08825.N(class05387.N(var1));
      class08895 class08895x = class08825.N(class05387.y("tooting_goat_horn"));
      this.N(var1, class08825.N(), class08895x, class08895x);
   }

   public static class08895 N(class08895 var0, class08895 var1) {
      return class08825.N(
         new class00356(), var1, class08825.N(List.of(class03662.field_4317, class03662.field_4318, class03662.field_4319, class03662.field_61988), var0)
      );
   }

   public static class01894 N(String var0) {
      return class01894.y("trims/items/" + var0 + "_trim");
   }

   public final void N(class06581 var1, class01894 var2) {
      this.R.N(var1, class08825.N(var2, new class08811()));
   }

   public void N() {
      this.y(class06570.sw, class05433.yD);
      this.y(class06570.sY, class05433.yD);
      this.y(class06570.sk, class05433.yD);
      this.y(class06570.sQ, class05433.yD);
      this.y(class06570.Ti, class05433.yD);
      this.y(class06570.sS, class05433.yD);
      this.y(class06570.sF, class05433.yD);
      this.y(class06570.GA, class05433.yD);
      this.y(class06570.sD, class05433.yD);
      this.y(class06570.Gv, class05433.yD);
      this.y(class06570.iz, class05433.yr);
      this.y(class06570.ni, class05433.yD);
      this.y(class06570.lw, class05433.yD);
      this.y(class06570.lY, class05433.yD);
      this.y(class06570.st, class05433.yD);
      this.y(class06570.sG, class05433.yD);
      this.y(class06570.vY, class05433.yD);
      this.y(class06570.nj, class05433.yD);
      this.y(class06570.nU, class05433.yr);
      this.y(class06570.vl, class05433.yD);
      this.y(class06570.vQ, class05433.yD);
      this.y(class06570.de, class05433.yD);
      this.y(class06570.jY, class05433.yD);
      this.y(class06570.sC, class05433.yD);
      this.y(class06570.bu, class05433.yD);
      this.y(class06570.jl, class05433.yD);
      this.y(class06570.GW, class05433.yr);
      this.y(class06570.vd, class05433.yD);
      this.y(class06570.jU, class05433.yD);
      this.y(class06570.sm, class05433.LN);
      this.y(class06570.sP, class05433.LN);
      this.y(class06570.sr, class05433.yD);
      this.y(class06570.sz, class05433.yD);
      this.y(class06570.nM, class05433.yD);
      this.y(class06570.lt, class05433.yD);
      this.y(class06570.jd, class05433.yD);
      this.i(class06570.vN);
      this.y(class06570.sh, class05433.yD);
      this.y(class06570.jv, class05433.yD);
      this.y(class06570.ly, class05433.yD);
      this.L(class06570.jJ);
      this.u(class06570.jo);
      this.y(class06570.nR, class05433.yD);
      this.y(class06570.nB, class05433.yD);
      this.y(class06570.vB, class05433.yD);
      this.y(class06570.lu, class05433.yD);
      this.y(class06570.bq, class05433.yD);
      this.y(class06570.GX, class05433.yD);
      this.y(class06570.vZ, class05433.yD);
      this.y(class06570.vx, class05433.yD);
      this.y(class06570.TB, class05433.yD);
      this.y(class06570.lA, class05433.yD);
      this.y(class06570.TZ, class05433.yD);
      this.y(class06570.Tt, class05433.yr);
      this.y(class06570.TG, class05433.yr);
      this.y(class06570.Tn, class05433.yr);
      this.y(class06570.Tv, class05433.yr);
      this.y(class06570.Tj, class05433.yr);
      this.y(class06570.Gf, class05433.yD);
      this.y(class06570.dl, class05433.yD);
      this.y(class06570.dO, class05433.yD);
      this.y(class06570.vt, class05433.yD);
      this.y(class06570.sO, class05433.yD);
      this.y(class06570.sg, class05433.yD);
      this.y(class06570.TN, class05433.yD);
      this.y(class06570.Ta, class05433.yr);
      this.y(class06570.Tp, class05433.yr);
      this.y(class06570.Gx, class05433.yD);
      this.y(class06570.dt, class05433.yD);
      this.y(class06570.TX, class05433.yr);
      this.y(class06570.Tc, class05433.yr);
      this.y(class06570.TH, class05433.yr);
      this.y(class06570.lQ, class05433.yD);
      this.y(class06570.ny, class05433.yD);
      this.y(class06570.jO, class05433.yD);
      this.y(class06570.jg, class05433.yD);
      this.y(class06570.jI, class05433.yD);
      this.y(class06570.Ty, class05433.yD);
      this.y(class06570.Gq, class05433.yD);
      this.y(class06570.nG, class05433.yD);
      this.y(class06570.nz, class05433.yD);
      this.y(class06570.ln, class05433.yD);
      this.y(class06570.GB, class05433.yD);
      this.y(class06570.nb, class05433.yD);
      this.y(class06570.dV, class05433.yD);
      this.y(class06570.GJ, class05433.yD);
      this.y(class06570.GZ, class05433.yD);
      this.y(class06570.bJ, class05433.yD);
      this.y(class06570.sf, class05433.yD);
      this.y(class06570.dq, class05433.yD);
      this.y(class06570.dQ, class05433.yD);
      this.y(class06570.sU, class05433.yD);
      this.y(class06570.nE, class05433.yD);
      this.y(class06570.nP, class05433.yD);
      this.y(class06570.nl, class05433.yD);
      this.y(class06570.dJ, class05433.yD);
      this.y(class06570.wy, class05433.yD);
      this.y(class06570.vL, class05433.yD);
      this.y(class06570.vU, class05433.yD);
      this.y(class06570.Gs, class05433.yD);
      this.y(class06570.Tz, class05433.yD);
      this.y(class06570.bV, class05433.yD);
      this.y(class06570.TI, class05433.yr);
      this.y(class06570.GG, class05433.yD);
      this.y(class06570.TJ, class05433.yr);
      this.y(class06570.GS, class05433.yD);
      this.y(class06570.dn, class05433.yD);
      this.y(class06570.Tg, class05433.yr);
      this.y(class06570.TO, class05433.yr);
      this.y(class06570.TQ, class05433.yr);
      this.y(class06570.TU, class05433.yD);
      this.y(class06570.nW, class05433.yD);
      this.y(class06570.vv, class05433.yD);
      this.y(class06570.vw, class05433.yD);
      this.y(class06570.bN, class05433.yD);
      this.y(class06570.dK, class05433.yD);
      this.y(class06570.dd, class05433.yD);
      this.y(class06570.wR, class05433.yD);
      this.y(class06570.wZ, class05433.yD);
      this.y(class06570.sW, class05433.yD);
      this.y(class06570.vz, class05433.yD);
      this.y(class06570.TR, class05433.yD);
      this.y(class06570.TV, class05433.yr);
      this.y(class06570.Te, class05433.yr);
      this.y(class06570.GC, class05433.yD);
      this.y(class06570.dv, class05433.yD);
      this.y(class06570.TM, class05433.yD);
      this.y(class06570.lF, class05433.yD);
      this.y(class06570.TK, class05433.yr);
      this.y(class06570.Tq, class05433.yr);
      this.y(class06570.To, class05433.yr);
      this.y(class06570.GP, class05433.yD);
      this.y(class06570.sl, class05433.yD);
      this.y(class06570.sd, class05433.yD);
      this.y(class06570.lf, class05433.yD);
      this.y(class06570.TL, class05433.yD);
      this.y(class06570.jW, class05433.yD);
      this.y(class06570.js, class05433.yD);
      this.y(class06570.vs, class05433.yD);
      this.y(class06570.vn, class05433.yD);
      this.y(class06570.vb, class05433.yD);
      this.y(class06570.vP, class05433.yD);
      this.y(class06570.nv, class05433.yD);
      this.y(class06570.so, class05433.yD);
      this.y(class06570.sq, class05433.yD);
      this.y(class06570.sK, class05433.yD);
      this.y(class06570.sV, class05433.yD);
      this.y(class06570.Gt, class05433.yD);
      this.y(class06570.nN, class05433.yD);
      this.y(class06570.jT, class05433.yD);
      this.y(class06570.sZ, class05433.yD);
      this.y(class06570.dI, class05433.yD);
      this.y(class06570.TD, class05433.yD);
      this.y(class06570.dT, class05433.yD);
      this.y(class06570.dZ, class05433.yh);
      this.y(class06570.lS, class05433.yh);
      this.y(class06570.lD, class05433.yh);
      this.y(class06570.lx, class05433.yh);
      this.y(class06570.lh, class05433.yh);
      this.y(class06570.lr, class05433.yh);
      this.y(class06570.dN, class05433.yh);
      this.y(class06570.dy, class05433.yh);
      this.y(class06570.dL, class05433.yh);
      this.y(class06570.du, class05433.yh);
      this.y(class06570.di, class05433.yh);
      this.y(class06570.dm, class05433.yh);
      this.y(class06570.dP, class05433.yh);
      this.y(class06570.dR, class05433.yh);
      this.y(class06570.dM, class05433.yh);
      this.y(class06570.dz, class05433.yh);
      this.y(class06570.dB, class05433.yh);
      this.y(class06570.dU, class05433.yh);
      this.y(class06570.dE, class05433.yh);
      this.y(class06570.dW, class05433.yh);
      this.y(class06570.ds, class05433.yh);
      this.y(class06570.lL, class05433.yD);
      this.y(class06570.lN, class05433.yD);
      this.y(class06570.dj, class05433.yD);
      this.y(class06570.TC, class05433.yr);
      this.y(class06570.TS, class05433.yr);
      this.y(class06570.TE, class05433.yD);
      this.y(class06570.Tf, class05433.yr);
      this.y(class06570.TW, class05433.yD);
      this.y(class06570.TA, class05433.yr);
      this.y(class06570.TF, class05433.yr);
      this.y(class06570.dG, class05433.yD);
      this.y(class06570.GD, class05433.yD);
      this.y(class06570.GK, class05433.yD);
      this.y(class06570.GV, class05433.yD);
      this.y(class06570.Gg, class05433.yD);
      this.y(class06570.sb, class05433.yD);
      this.y(class06570.sj, class05433.yD);
      this.y(class06570.vm, class05433.yD);
      this.y(class06570.bK, class05433.yD);
      this.y(class06570.sI, class05433.yD);
      this.y(class06570.sJ, class05433.yD);
      this.y(class06570.jk, class05433.yD);
      this.y(class06570.ss, class05433.yD);
      this.y(class06570.f_do__3, class05433.yD);
      this.y(class06570.vj, class05433.yD);
      this.y(class06570.Gn, class05433.yD);
      this.y(class06570.lG, class05433.yD);
      this.y(class06570.bo, class05433.yD);
      this.y(class06570.jm, class05433.yD);
      this.y(class06570.GH, class05433.yD);
      this.y(class06570.Ge, class05433.yD);
      this.y(class06570.vM, class05433.yD);
      this.y(class06570.jb, class05433.yD);
      this.y(class06570.GI, class05433.yD);
      this.y(class06570.vG, class05433.yD);
      this.y(class06570.Tu, class05433.yD);
      this.y(class06570.Gc, class05433.yD);
      this.y(class06570.Gp, class05433.yD);
      this.y(class06570.GF, class05433.yD);
      this.y(class06570.Ga, class05433.yD);
      this.y(class06570.vk, class05433.yD);
      this.y(class06570.nZ, class05433.yD);
      this.y(class06570.PF, class05433.yD);
      this.y(class06570.vi, class05433.yD);
      this.y(class06570.jj, class05433.yD);
      this.y(class06570.sp, class05433.yD);
      this.y(class06570.vr, class05433.yD);
      this.y(class06570.lp, class05433.yD);
      this.y(class06570.dg, class05433.yD);
      this.y(class06570.jQ, class05433.yD);
      this.y(class06570.jP, class05433.yD);
      this.y(class06570.wr, class05433.yD);
      this.y(class06570.lg, class05433.yD);
      this.y(class06570.nT, class05433.yD);
      this.y(class06570.sv, class05433.yD);
      this.y(class06570.sn, class05433.yD);
      this.y(class06570.Tx, class05433.yr);
      this.y(class06570.Tk, class05433.yr);
      this.y(class06570.TY, class05433.yr);
      this.y(class06570.Tw, class05433.yr);
      this.y(class06570.Td, class05433.yr);
      this.y(class06570.Tl, class05433.yr);
      this.y(class06570.vg, class05433.yD);
      this.y(class06570.dk, class05433.yD);
      this.y(class06570.sE, class05433.yD);
      this.y(class06570.la, class05433.yD);
      this.y(class06570.vR, class05433.yD);
      this.y(class06570.jn, class05433.yD);
      this.y(class06570.jt, class05433.yD);
      this.y(class06570.jG, class05433.yD);
      this.y(class06570.jE, class05433.yD);
      this.y(class06570.bL, class05433.yD);
      this.y(class06570.vW, class05433.yD);
      this.y(class06570.Gz, class05433.yD);
      this.y(class06570.Gm, class05433.Lj);
      this.y(class06570.TT, class05433.yr);
      this.y(class06570.Tb, class05433.yr);
      this.y(class06570.Ts, class05433.yr);
      this.y(class06570.TP, class05433.yr);
      this.y(class06570.Tm, class05433.yr);
      this.y(class06570.GU, class05433.yD);
      this.y(class06570.GE, class05433.yD);
      this.y(class06570.vT, class05433.yD);
      this.y(class06570.ky, class05433.yD);
      this.y(class06570.kL, class05433.yD);
      this.y(class06570.ku, class05433.yD);
      this.y(class06570.ki, class05433.yD);
      this.y(class06570.kR, class05433.yD);
      this.y(class06570.kM, class05433.yD);
      this.y(class06570.kB, class05433.yD);
      this.y(class06570.kZ, class05433.yD);
      this.y(class06570.kz, class05433.yD);
      this.y(class06570.kU, class05433.yD);
      this.y(class06570.kE, class05433.yD);
      this.y(class06570.kW, class05433.yD);
      this.y(class06570.km, class05433.yD);
      this.y(class06570.kP, class05433.yD);
      this.y(class06570.ks, class05433.yD);
      this.y(class06570.kT, class05433.yD);
      this.y(class06570.kb, class05433.yD);
      this.y(class06570.kj, class05433.yD);
      this.y(class06570.kv, class05433.yD);
      this.y(class06570.lC, class06570.Tx, class05433.yr);
      this.y(class06570.be, class06570.bV, class05433.yD);
      this.N(class06570.sa, class08699.B, N, false);
      this.N(class06570.bi, class08699.y, N, true);
      this.N(class06570.bR, class08699.y, y, true);
      this.N(class06570.bM, class08699.y, L, true);
      this.N(class06570.bB, class08699.y, u, true);
      this.N(class06570.bZ, class08699.L, N, false);
      this.N(class06570.bz, class08699.L, y, false);
      this.N(class06570.bU, class08699.L, L, false);
      this.N(class06570.bE, class08699.L, u, false);
      this.N(class06570.bW, class08699.u, N, false);
      this.N(class06570.bm, class08699.u, y, false);
      this.N(class06570.bP, class08699.u, L, false);
      this.N(class06570.bs, class08699.u, u, false);
      this.N(class06570.bT, class08699.i, N, false);
      this.N(class06570.bb, class08699.i, y, false);
      this.N(class06570.bj, class08699.i, L, false);
      this.N(class06570.bv, class08699.i, u, false);
      this.N(class06570.bn, class08699.M, N, false);
      this.N(class06570.bt, class08699.M, y, false);
      this.N(class06570.bG, class08699.M, L, false);
      this.N(class06570.bl, class08699.M, u, false);
      this.N(class06570.bd, class08699.R, N, false);
      this.N(class06570.bw, class08699.R, y, false);
      this.N(class06570.bk, class08699.R, L, false);
      this.N(class06570.bY, class08699.R, u, false);
      this.N(class06570.bQ, class08699.Z, N, false);
      this.N(class06570.bO, class08699.Z, y, false);
      this.N(class06570.bg, class08699.Z, L, false);
      this.N(class06570.bI, class08699.Z, u, false);
      this.N(class06570.Gh, -6265536);
      this.y(class06570.kn, class05433.yD);
      this.y(class06570.kt, class05433.yD);
      this.y(class06570.kG, class05433.yD);
      this.y(class06570.kl, class05433.yD);
      this.y(class06570.kd, class05433.yD);
      this.y(class06570.kw, class05433.yD);
      this.y(class06570.kk, class05433.yD);
      this.y(class06570.kY, class05433.yD);
      this.y(class06570.kQ, class05433.yD);
      this.y(class06570.kO, class05433.yD);
      this.y(class06570.kg, class05433.yD);
      this.y(class06570.kI, class05433.yD);
      this.y(class06570.kJ, class05433.yD);
      this.y(class06570.ko, class05433.yD);
      this.y(class06570.kq, class05433.yD);
      this.y(class06570.kK, class05433.yD);
      this.y(class06570.kV, class05433.yD);
      this.y(class06570.ke, class05433.yD);
      this.y(class06570.kH, class05433.yD);
      this.y(class06570.kc, class05433.yD);
      this.y(class06570.kX, class05433.yD);
      this.y(class06570.ka, class05433.yD);
      this.y(class06570.kp, class05433.yD);
      this.y(class06570.Yd, class05433.yD);
      this.y(class06570.Yw, class05433.yD);
      this.y(class06570.YY, class05433.yD);
      this.N(class06570.Go, new class08821());
      this.N(class06570.vh, "_markings", new class08841());
      this.R(class06570.jq);
      this.R(class06570.jh);
      this.R(class06570.jK);
      this.R(class06570.jp);
      this.R(class06570.jF);
      this.R(class06570.jH);
      this.R(class06570.jC);
      this.R(class06570.jA);
      this.R(class06570.jc);
      this.R(class06570.jD);
      this.R(class06570.jf);
      this.R(class06570.je);
      this.R(class06570.ja);
      this.R(class06570.jx);
      this.R(class06570.jX);
      this.R(class06570.jS);
      this.R(class06570.jV);
      this.m(class06570.vy);
      this.P(class06570.db);
      this.j(class06570.sA);
      this.y(class06570.PA, class05433.yD);
      this.y(class06570.Pf, class05433.yD);
      this.y(class06570.PC, class05433.yD);
      this.y(class06570.PS, class05433.yD);
      this.y(class06570.Px, class05433.yD);
      this.y(class06570.PD, class05433.yD);
      this.y(class06570.Ph, class05433.yD);
      this.y(class06570.Pr, class05433.yD);
      this.y(class06570.sN, class05433.yD);
      this.y(class06570.sy, class05433.yD);
      this.y(class06570.sL, class05433.yD);
      this.y(class06570.su, class05433.yD);
      this.y(class06570.si, class05433.yD);
      this.y(class06570.sR, class05433.yD);
      this.y(class06570.sM, class05433.yD);
      this.y(class06570.sB, class05433.yD);
      this.M(class06570.sx);
      this.B(class06570.dw);
      this.Z(class06570.sT);
      this.z(class06570.kN);
      this.U(class06570.jr);
      this.E(class06570.dH);
      this.W(class06570.lo);
      this.s(class06570.lq);
      this.s(class06570.lK);
      this.s(class06570.lV);
      this.s(class06570.lH);
      this.s(class06570.le);
      this.s(class06570.lc);
      this.s(class06570.lX);
      this.b(class06570.lI);
      this.T(class06570.ns);
      this.T(class06570.lO);
      this.T(class06570.lJ);
      this.y(class06570.nd, class05433.yD);
      this.y(class06570.nw, class05433.yD);
      this.y(class06570.nk, class05433.yD);
      this.y(class06570.nY, class05433.yD);
      this.y(class06570.nQ, class05433.yD);
      this.y(class06570.nO, class05433.yD);
      this.y(class06570.ng, class05433.yD);
      this.y(class06570.nI, class05433.yD);
      this.y(class06570.nJ, class05433.yD);
      this.y(class06570.no, class05433.yD);
      this.y(class06570.nq, class05433.yD);
      this.y(class06570.nK, class05433.yD);
      this.y(class06570.nV, class05433.yD);
      this.y(class06570.ne, class05433.yD);
      this.y(class06570.nH, class05433.yD);
      this.y(class06570.nc, class05433.yD);
      this.y(class06570.nX, class05433.yD);
      this.y(class06570.na, class05433.yD);
      this.y(class06570.np, class05433.yD);
      this.y(class06570.nF, class05433.yD);
      this.y(class06570.nA, class05433.yD);
      this.y(class06570.nf, class05433.yD);
      this.y(class06570.nC, class05433.yD);
      this.y(class06570.nS, class05433.yD);
      this.y(class06570.nx, class05433.yD);
      this.y(class06570.nD, class05433.yD);
      this.y(class06570.nh, class05433.yD);
      this.y(class06570.nr, class05433.yD);
      this.y(class06570.tN, class05433.yD);
      this.y(class06570.ty, class05433.yD);
      this.y(class06570.tL, class05433.yD);
      this.y(class06570.tu, class05433.yD);
      this.y(class06570.ti, class05433.yD);
      this.y(class06570.tR, class05433.yD);
      this.y(class06570.tM, class05433.yD);
      this.y(class06570.tB, class05433.yD);
      this.y(class06570.tZ, class05433.yD);
      this.y(class06570.tz, class05433.yD);
      this.y(class06570.tU, class05433.yD);
      this.y(class06570.tE, class05433.yD);
      this.y(class06570.tW, class05433.yD);
      this.y(class06570.tm, class05433.yD);
      this.y(class06570.tP, class05433.yD);
      this.y(class06570.ts, class05433.yD);
      this.y(class06570.tT, class05433.yD);
      this.y(class06570.tb, class05433.yD);
      this.y(class06570.tj, class05433.yD);
      this.y(class06570.tv, class05433.yD);
      this.y(class06570.tn, class05433.yD);
      this.y(class06570.tt, class05433.yD);
      this.y(class06570.tG, class05433.yD);
      this.y(class06570.tl, class05433.yD);
      this.y(class06570.td, class05433.yD);
      this.y(class06570.tw, class05433.yD);
      this.y(class06570.tk, class05433.yD);
      this.y(class06570.tY, class05433.yD);
      this.y(class06570.tQ, class05433.yD);
      this.y(class06570.tO, class05433.yD);
      this.y(class06570.tg, class05433.yD);
      this.y(class06570.tI, class05433.yD);
      this.y(class06570.tJ, class05433.yD);
      this.y(class06570.to, class05433.yD);
      this.y(class06570.tq, class05433.yD);
      this.y(class06570.tK, class05433.yD);
      this.y(class06570.tV, class05433.yD);
      this.y(class06570.te, class05433.yD);
      this.y(class06570.tH, class05433.yD);
      this.y(class06570.tc, class05433.yD);
      this.y(class06570.tX, class05433.yD);
      this.y(class06570.ta, class05433.yD);
      this.y(class06570.tp, class05433.yD);
      this.y(class06570.tA, class05433.yD);
      this.y(class06570.tF, class05433.yD);
      this.y(class06570.tf, class05433.yD);
      this.y(class06570.tC, class05433.yD);
      this.y(class06570.tS, class05433.yD);
      this.y(class06570.tx, class05433.yD);
      this.y(class06570.tD, class05433.yD);
      this.y(class06570.th, class05433.yD);
      this.y(class06570.tr, class05433.yD);
      this.y(class06570.GN, class05433.yD);
      this.y(class06570.Gy, class05433.yD);
      this.y(class06570.GL, class05433.yD);
      this.y(class06570.Gu, class05433.yD);
      this.y(class06570.Gi, class05433.yD);
      this.y(class06570.GR, class05433.yD);
      this.y(class06570.GM, class05433.yD);
      this.N(class06570.N);
      this.N(class06570.wf);
      this.N(class06570.wp);
      this.N(class06570.wF);
      this.N(class06570.wA);
      this.N(class06570.iZ);
      this.N(class06570.iB);
      this.N(class06570.iM);
      this.N(class06570.wC);
      this.N(class06570.vO);
      this.N(class06570.vu);
      this.N(class06570.Tr);
      this.N(class06570.Gr);
   }

   public final void N(class06581 var1, class08843 var2) {
      this.N(var1, "_overlay", var2);
   }

   public final void N(class06581 var1, String var2, class08843 var3) {
      class01894 class01894 = this.N(var1, class05388.L(var1), class05388.N(var1, var2));
      this.R.N(var1, class08825.N(class01894, B, var3));
   }

   public final void N(class06581 var1, int var2) {
      class01894 class01894xx = class05388.L(var1);
      class01894 class01894x = class05388.N(var1, "_overlay");
      class01894 class01894xx = class05387.N(var1);
      class05433.Ly.N(class01894xx, class05388.L(class01894xx, class01894x), this.M);
      this.R.N(var1, class08825.N(class01894xx, new class08840(var2)));
   }

   public final class01894 N(class06581 var1, class01894 var2, class01894 var3) {
      return class05433.Ly.N(var1, class05388.L(var2, var3), this.M);
   }

   public final void N(class06581 var1) {
      this.R.N(var1, class08825.N(class05387.N(var1)));
   }

   public final class01894 N(class06581 var1, class05403 var2) {
      return var2.N(class05387.N(var1), class05388.y(var1), this.M);
   }

   public final class01894 N(class06581 var1, String var2, class05403 var3) {
      return var3.N(class05387.N(var1, var2), class05388.U(class05388.N(var1, var2)), this.M);
   }

   public final class01894 N(class06581 var1, class06581 var2, class05403 var3) {
      return var3.N(class05387.N(var1), class05388.y(var2), this.M);
   }

   public final class01894 N(class06581 var1, class05403 var2, String var3) {
      class01894 class01894 = class05388.N(var1, var3);
      return var2.N(var1, class05388.U(class01894), this.M);
   }

   public final void N(class06581 var1, class08909 var2, class08895 var3, class08895 var4) {
      this.R.N(var1, class08825.N(var2, var3, var4));
   }

   public final void N(class06581 var1, class05946<class11647> var2, class01894 var3, boolean var4) {
      class01894 class01894xxxx = class05387.N(var1);
      class01894 class01894x = class05388.L(var1);
      class01894 class01894xx = class05388.N(var1, "_overlay");
      ArrayList arraylist = new ArrayList(i.size());

      for (class05414 class05414 : i) {
         class01894 class01894xxx = class01894xxxx.M("_" + class05414.N().N().N() + "_trim");
         class01894 class01894xxxx = var3.M("_" + class05414.N().N(var2).N());
         class08895 class08895x;
         if (var4) {
            this.N(class01894xxx, class01894x, class01894xx, class01894xxxx);
            class08895x = class08825.N(class01894xxx, new class08840(-6265536));
         } else {
            this.N(class01894xxx, class01894x, class01894xxxx);
            class08895x = class08825.N(class01894xxx);
         }

         arraylist.add(class08825.N(class05414.y(), class08895x));
      }

      class08895 class08895;
      if (var4) {
         class05433.Ly.N(class01894xxxx, class05388.L(class01894x, class01894xx), this.M);
         class08895 = class08825.N(class01894xxxx, new class08840(-6265536));
      } else {
         class05433.yD.N(class01894xxxx, class05388.U(class01894x), this.M);
         class08895 = class08825.N(class01894xxxx);
      }

      this.R.N(var1, class08825.N(new class00365(), class08895, arraylist));
   }

   public final class01894 N(class01894 var1, class01894 var2, class01894 var3) {
      return class05433.Ly.N(var1, class05388.L(var2, var3), this.M);
   }

   public final void N(class01894 var1, class01894 var2, class01894 var3, class01894 var4) {
      class05433.LL.N(var1, class05388.N(var2, var3, var4), this.M);
   }

   public final void W(class06581 var1) {
      class08895 class08895x = class08825.N(class05387.N(var1), new class00358());
      class08895 class08895x = class08825.N(class05387.N(var1, "_blocking"), new class00358());
      this.N(var1, class08825.N(), class08895x, class08895x);
   }

   public final void R(class06581 var1) {
      class08895 class08895xx = class08825.N(this.N(var1, class05433.yD));
      class01894 class01894x = this.N(var1, class05433.LB, "_open_back");
      class01894 class01894x = this.N(var1, class05433.LM, "_open_front");
      class08895 class08895x = class08825.N(class08825.N(class01894x), new class08830(), class08825.N(class01894x));
      class08895 class08895xx = class08825.N(new class08929(), class08895x, class08895xx);
      this.R.N(var1, class08825.N(new class00356(), class08895xx, class08825.N(class03662.field_4317, class08895xx)));
   }
}
