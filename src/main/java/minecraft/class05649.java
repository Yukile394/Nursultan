package minecraft;

import Nursultan.class10534;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;

public class class05649 {
   private static final int u = 12;
   private static final int i = 16;
   private static final int R = 3;
   private static final int M = 1;
   private static final int B = 2;
   private static final int Z = 5;
   private static final int z = 10;
   private static final int U = 10;
   private static final int E = 20;
   private static final int W = 15;
   private static final int m = 30;
   private static final int P = 30;
   private static final float s = 0.05F;
   private static final float T = 0.2F;
   public static final Map<class05946<class05672>, Int2ObjectMap<class05663[]>> N = class07536.N(
      Maps.newHashMap(),
      var0 -> {
         var0.put(
            class05672.M,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.bL, 20, 16, 2),
                     new class05673(class06570.Gj, 26, 16, 2),
                     new class05673(class06570.Gb, 22, 16, 2),
                     new class05673(class06570.lw, 15, 16, 2),
                     new class05675(class06570.bu, 1, 6, 16, 1)
                  },
                  2,
                  new class05663[]{
                     new class05673(class00869.Ro, 6, 12, 10), new class05675(class06570.GI, 1, 4, 5), new class05675(class06570.sS, 1, 4, 16, 5)
                  },
                  3,
                  new class05663[]{new class05675(class06570.vx, 3, 18, 10), new class05673(class00869.Rq, 4, 12, 20)},
                  4,
                  new class05663[]{
                     new class05675(class00869.ie, 1, 1, 12, 15),
                     new class05664(class07047.s, 100, 15),
                     new class05664(class07047.B, 160, 15),
                     new class05664(class07047.b, 140, 15),
                     new class05664(class07047.P, 120, 15),
                     new class05664(class07047.j, 280, 15),
                     new class05664(class07047.G, 7, 15)
                  },
                  5,
                  new class05663[]{new class05675(class06570.GG, 3, 3, 30), new class05675(class06570.nl, 4, 3, 30)}
               )
            )
         );
         var0.put(
            class05672.B,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.Th, 20, 16, 2),
                     new class05673(class06570.sh, 10, 16, 2),
                     new class05657(class06570.vu, 6, 1, class06570.vB, 6, 16, 1, 0.05F),
                     new class05675(class06570.jv, 3, 1, 16, 1)
                  },
                  2,
                  new class05663[]{
                     new class05673(class06570.vu, 15, 16, 10),
                     new class05657(class06570.vi, 6, 1, class06570.vZ, 6, 16, 5, 0.05F),
                     new class05675(class06570.wL, 2, 1, 5)
                  },
                  3,
                  new class05663[]{new class05673(class06570.vi, 13, 16, 20), new class05665(class06570.jr, 3, 3, 10, 0.2F)},
                  4,
                  new class05663[]{new class05673(class06570.vR, 6, 12, 30)},
                  5,
                  new class05663[]{
                     new class05673(class06570.vM, 4, 12, 30),
                     new class05637(
                        1,
                        12,
                        30,
                        ImmutableMap.builder()
                           .put(class05660.L, class06570.sb)
                           .put(class05660.M, class06570.sv)
                           .put(class05660.i, class06570.sv)
                           .put(class05660.N, class06570.sl)
                           .put(class05660.y, class06570.sl)
                           .put(class05660.u, class06570.sw)
                           .put(class05660.R, class06570.sO)
                           .build()
                     )
                  }
               )
            )
         );
         var0.put(
            class05672.m,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class00869.yV, 18, 16, 2),
                     new class05673(class00869.yx, 18, 16, 2),
                     new class05673(class00869.yr, 18, 16, 2),
                     new class05673(class00869.yF, 18, 16, 2),
                     new class05675(class06570.vr, 2, 1, 1)
                  },
                  2,
                  new class05663[]{
                     new class05673(class06570.vW, 12, 16, 10),
                     new class05673(class06570.vv, 12, 16, 10),
                     new class05673(class06570.vY, 12, 16, 10),
                     new class05673(class06570.vs, 12, 16, 10),
                     new class05673(class06570.vb, 12, 16, 10),
                     new class05675(class00869.yV, 1, 1, 16, 5),
                     new class05675(class00869.ye, 1, 1, 16, 5),
                     new class05675(class00869.yH, 1, 1, 16, 5),
                     new class05675(class00869.yc, 1, 1, 16, 5),
                     new class05675(class00869.yX, 1, 1, 16, 5),
                     new class05675(class00869.ya, 1, 1, 16, 5),
                     new class05675(class00869.yp, 1, 1, 16, 5),
                     new class05675(class00869.yF, 1, 1, 16, 5),
                     new class05675(class00869.yA, 1, 1, 16, 5),
                     new class05675(class00869.yf, 1, 1, 16, 5),
                     new class05675(class00869.yC, 1, 1, 16, 5),
                     new class05675(class00869.yS, 1, 1, 16, 5),
                     new class05675(class00869.yx, 1, 1, 16, 5),
                     new class05675(class00869.yD, 1, 1, 16, 5),
                     new class05675(class00869.yh, 1, 1, 16, 5),
                     new class05675(class00869.yr, 1, 1, 16, 5),
                     new class05675(class00869.zL, 1, 4, 16, 5),
                     new class05675(class00869.zu, 1, 4, 16, 5),
                     new class05675(class00869.zi, 1, 4, 16, 5),
                     new class05675(class00869.zR, 1, 4, 16, 5),
                     new class05675(class00869.zM, 1, 4, 16, 5),
                     new class05675(class00869.zB, 1, 4, 16, 5),
                     new class05675(class00869.zZ, 1, 4, 16, 5),
                     new class05675(class00869.zz, 1, 4, 16, 5),
                     new class05675(class00869.zU, 1, 4, 16, 5),
                     new class05675(class00869.zE, 1, 4, 16, 5),
                     new class05675(class00869.zW, 1, 4, 16, 5),
                     new class05675(class00869.zm, 1, 4, 16, 5),
                     new class05675(class00869.zP, 1, 4, 16, 5),
                     new class05675(class00869.zs, 1, 4, 16, 5),
                     new class05675(class00869.zT, 1, 4, 16, 5),
                     new class05675(class00869.zb, 1, 4, 16, 5)
                  },
                  3,
                  new class05663[]{
                     new class05673(class06570.vT, 12, 16, 20),
                     new class05673(class06570.vn, 12, 16, 20),
                     new class05673(class06570.vm, 12, 16, 20),
                     new class05673(class06570.vk, 12, 16, 20),
                     new class05673(class06570.vj, 12, 16, 20),
                     new class05675(class00869.yM, 3, 1, 12, 10),
                     new class05675(class00869.yU, 3, 1, 12, 10),
                     new class05675(class00869.yn, 3, 1, 12, 10),
                     new class05675(class00869.yt, 3, 1, 12, 10),
                     new class05675(class00869.yb, 3, 1, 12, 10),
                     new class05675(class00869.yj, 3, 1, 12, 10),
                     new class05675(class00869.ys, 3, 1, 12, 10),
                     new class05675(class00869.ym, 3, 1, 12, 10),
                     new class05675(class00869.yv, 3, 1, 12, 10),
                     new class05675(class00869.yz, 3, 1, 12, 10),
                     new class05675(class00869.yP, 3, 1, 12, 10),
                     new class05675(class00869.yE, 3, 1, 12, 10),
                     new class05675(class00869.yZ, 3, 1, 12, 10),
                     new class05675(class00869.yB, 3, 1, 12, 10),
                     new class05675(class00869.yW, 3, 1, 12, 10),
                     new class05675(class00869.yT, 3, 1, 12, 10)
                  },
                  4,
                  new class05663[]{
                     new class05673(class06570.vd, 12, 16, 30),
                     new class05673(class06570.vG, 12, 16, 30),
                     new class05673(class06570.vl, 12, 16, 30),
                     new class05673(class06570.vw, 12, 16, 30),
                     new class05673(class06570.vP, 12, 16, 30),
                     new class05673(class06570.vt, 12, 16, 30),
                     new class05675(class06570.li, 3, 1, 12, 15),
                     new class05675(class06570.ls, 3, 1, 12, 15),
                     new class05675(class06570.lB, 3, 1, 12, 15),
                     new class05675(class06570.lj, 3, 1, 12, 15),
                     new class05675(class06570.lU, 3, 1, 12, 15),
                     new class05675(class06570.lb, 3, 1, 12, 15),
                     new class05675(class06570.lz, 3, 1, 12, 15),
                     new class05675(class06570.lE, 3, 1, 12, 15),
                     new class05675(class06570.lv, 3, 1, 12, 15),
                     new class05675(class06570.lP, 3, 1, 12, 15),
                     new class05675(class06570.lM, 3, 1, 12, 15),
                     new class05675(class06570.lm, 3, 1, 12, 15),
                     new class05675(class06570.lT, 3, 1, 12, 15),
                     new class05675(class06570.lZ, 3, 1, 12, 15),
                     new class05675(class06570.lR, 3, 1, 12, 15),
                     new class05675(class06570.lW, 3, 1, 12, 15)
                  },
                  5,
                  new class05663[]{new class05675(class06570.bK, 2, 3, 30)}
               )
            )
         );
         var0.put(
            class05672.Z,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.Tx, 32, 16, 2),
                     new class05675(class06570.sD, 1, 16, 1),
                     new class05657(class00869.X, 10, 1, class06570.bJ, 10, 12, 1, 0.05F)
                  },
                  2,
                  new class05663[]{new class05673(class06570.bJ, 26, 12, 10), new class05675(class06570.sx, 2, 1, 5)},
                  3,
                  new class05663[]{new class05673(class06570.Th, 14, 16, 20), new class05675(class06570.dw, 3, 1, 10)},
                  4,
                  new class05663[]{new class05673(class06570.Tr, 24, 16, 30), new class05665(class06570.sx, 2, 3, 15)},
                  5,
                  new class05663[]{
                     new class05673(class06570.mL, 8, 12, 30),
                     new class05665(class06570.dw, 3, 3, 15),
                     new class05652(class06570.sD, 5, class06570.lI, 5, 2, 12, 30)
                  }
               )
            )
         );
         var0.put(
            class05672.U,
            N(
               ImmutableMap.builder()
                  .put(
                     1, new class05663[]{new class05673(class06570.jk, 24, 16, 2), new class05655(1, class02625.Z), new class05675(class00869.Lt, 9, 1, 12, 1)}
                  )
                  .put(2, new class05663[]{new class05673(class06570.jY, 4, 12, 10), new class05655(5, class02625.Z), new class05675(class06570.dD, 1, 1, 5)})
                  .put(3, new class05663[]{new class05673(class06570.vz, 5, 12, 20), new class05655(10, class02625.Z), new class05675(class06570.Lc, 1, 4, 10)})
                  .put(
                     4,
                     new class05663[]{
                        new class05673(class06570.GU, 2, 12, 30),
                        new class05655(15, class02625.Z),
                        new class05675(class06570.vN, 5, 1, 15),
                        new class05675(class06570.jJ, 4, 1, 15)
                     }
                  )
                  .put(5, new class05663[]{new class05675(class06570.lN, 20, 1, 30)})
                  .build()
            )
         );
         var0.put(
            class05672.i,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{new class05673(class06570.jk, 24, 12, 2), new class05675(class06570.Gt, 7, 1, 12, 1, 0.05F)},
                  2,
                  new class05663[]{
                     new class05673(class06570.Mg, 11, 12, 10),
                     class05646.N(new class10534(8, class04398.B, "filled_map.village_taiga", class00831.I, 12, 5), class05660.R, class05660.i, class05660.L),
                     class05646.N(new class10534(8, class04398.U, "filled_map.explorer_swamp", class00831.o, 12, 5), class05660.M, class05660.i, class05660.y),
                     class05646.N(new class10534(8, class04398.Z, "filled_map.village_snowy", class00831.g, 12, 5), class05660.M, class05660.R),
                     class05646.N(new class10534(8, class04398.i, "filled_map.village_savanna", class00831.O, 12, 5), class05660.L, class05660.y, class05660.N),
                     class05646.N(
                        new class10534(8, class04398.M, "filled_map.village_plains", class00831.Q, 12, 5),
                        class05660.M,
                        class05660.i,
                        class05660.u,
                        class05660.N
                     ),
                     class05646.N(new class10534(8, class04398.z, "filled_map.explorer_jungle", class00831.J, 12, 5), class05660.R, class05660.u, class05660.N),
                     class05646.N(new class10534(8, class04398.R, "filled_map.village_desert", class00831.Y, 12, 5), class05660.u, class05660.y)
                  },
                  3,
                  new class05663[]{
                     new class05673(class06570.jJ, 1, 12, 20),
                     new class10534(13, class04398.u, "filled_map.monument", class00831.z, 12, 10),
                     new class10534(12, class04398.W, "filled_map.trial_chambers", class00831.q, 12, 10)
                  },
                  4,
                  new class05663[]{
                     new class05675(class06570.GP, 7, 1, 12, 15, 0.05F),
                     class05646.N(new class05675(class06570.ls, 2, 1, 12, 15, 0.05F), class05660.i, class05660.M),
                     class05646.N(new class05675(class06570.li, 2, 1, 12, 15, 0.05F), class05660.i, class05660.L),
                     class05646.N(new class05675(class06570.lj, 2, 1, 12, 15, 0.05F), class05660.i, class05660.u),
                     class05646.N(new class05675(class06570.lb, 2, 1, 12, 15, 0.05F), class05660.N, class05660.u, class05660.y),
                     class05646.N(new class05675(class06570.lz, 2, 1, 12, 15, 0.05F), class05660.N, class05660.M),
                     class05646.N(new class05675(class06570.lP, 2, 1, 12, 15, 0.05F), class05660.M, class05660.R),
                     class05646.N(new class05675(class06570.lm, 2, 1, 12, 15, 0.05F), class05660.N, class05660.i),
                     class05646.N(new class05675(class06570.lZ, 2, 1, 12, 15, 0.05F), class05660.L, class05660.y),
                     class05646.N(new class05675(class06570.lR, 2, 1, 12, 15, 0.05F), class05660.u, class05660.N),
                     class05646.N(new class05675(class06570.lT, 2, 1, 12, 15, 0.05F), class05660.L, class05660.y),
                     class05646.N(new class05675(class06570.lM, 2, 1, 12, 15, 0.05F), class05660.u),
                     class05646.N(new class05675(class06570.lB, 2, 1, 12, 15, 0.05F), class05660.i, class05660.R),
                     class05646.N(new class05675(class06570.lU, 2, 1, 12, 15, 0.05F), class05660.M, class05660.L),
                     class05646.N(new class05675(class06570.lE, 2, 1, 12, 15, 0.05F), class05660.N),
                     class05646.N(new class05675(class06570.lv, 2, 1, 12, 15, 0.05F), class05660.R)
                  },
                  5,
                  new class05663[]{
                     new class05675(class06570.dJ, 8, 1, 12, 30, 0.05F), new class10534(14, class04398.L, "filled_map.mansion", class00831.Z, 12, 30)
                  }
               )
            )
         );
         var0.put(
            class05672.R,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{new class05673(class06570.nZ, 32, 16, 2), new class05675(class06570.WY, 1, 2, 1)},
                  2,
                  new class05663[]{new class05673(class06570.TU, 3, 12, 10), new class05675(class06570.TL, 1, 1, 5)},
                  3,
                  new class05663[]{new class05673(class06570.Gp, 2, 12, 20), new class05675(class00869.io, 4, 1, 12, 10)},
                  4,
                  new class05663[]{new class05673(class06570.sp, 4, 12, 30), new class05673(class06570.nP, 9, 12, 30), new class05675(class06570.nz, 5, 1, 15)},
                  5,
                  new class05663[]{new class05673(class06570.nm, 22, 12, 30), new class05675(class06570.GB, 3, 1, 30)}
               )
            )
         );
         var0.put(
            class05672.L,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.sh, 15, 16, 2),
                     new class05675(new class06584(class06570.bj), 7, 1, 12, 1, 0.2F),
                     new class05675(new class06584(class06570.bv), 4, 1, 12, 1, 0.2F),
                     new class05675(new class06584(class06570.bT), 5, 1, 12, 1, 0.2F),
                     new class05675(new class06584(class06570.bb), 9, 1, 12, 1, 0.2F)
                  },
                  2,
                  new class05663[]{
                     new class05673(class06570.TM, 4, 12, 10),
                     new class05675(new class06584(class06570.dx), 36, 1, 12, 5, 0.2F),
                     new class05675(new class06584(class06570.bs), 1, 1, 12, 5, 0.2F),
                     new class05675(new class06584(class06570.bP), 3, 1, 12, 5, 0.2F)
                  },
                  3,
                  new class05663[]{
                     new class05673(class06570.jW, 1, 12, 20),
                     new class05673(class06570.TN, 1, 12, 20),
                     new class05675(new class06584(class06570.bW), 1, 1, 12, 10, 0.2F),
                     new class05675(new class06584(class06570.bm), 4, 1, 12, 10, 0.2F),
                     new class05675(new class06584(class06570.lo), 5, 1, 12, 10, 0.2F)
                  },
                  4,
                  new class05663[]{new class05665(class06570.bG, 14, 3, 15, 0.2F), new class05665(class06570.bl, 8, 3, 15, 0.2F)},
                  5,
                  new class05663[]{new class05665(class06570.bn, 8, 3, 30, 0.2F), new class05665(class06570.bt, 16, 3, 30, 0.2F)}
               )
            )
         );
         var0.put(
            class05672.s,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.sh, 15, 16, 2),
                     new class05675(new class06584(class06570.TV), 3, 1, 12, 1, 0.2F),
                     new class05665(class06570.To, 2, 3, 1)
                  },
                  2,
                  new class05663[]{new class05673(class06570.TM, 4, 12, 10), new class05675(new class06584(class06570.dx), 36, 1, 12, 5, 0.2F)},
                  3,
                  new class05663[]{new class05673(class06570.bJ, 24, 12, 20)},
                  4,
                  new class05663[]{new class05673(class06570.TN, 1, 12, 30), new class05665(class06570.Ta, 12, 3, 15, 0.2F)},
                  5,
                  new class05663[]{new class05665(class06570.TH, 8, 3, 30, 0.2F)}
               )
            )
         );
         var0.put(
            class05672.P,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.sh, 15, 16, 2),
                     new class05675(new class06584(class06570.Tk), 1, 1, 12, 1, 0.2F),
                     new class05675(new class06584(class06570.Td), 1, 1, 12, 1, 0.2F),
                     new class05675(new class06584(class06570.Tw), 1, 1, 12, 1, 0.2F),
                     new class05675(new class06584(class06570.TY), 1, 1, 12, 1, 0.2F)
                  },
                  2,
                  new class05663[]{new class05673(class06570.TM, 4, 12, 10), new class05675(new class06584(class06570.dx), 36, 1, 12, 5, 0.2F)},
                  3,
                  new class05663[]{
                     new class05673(class06570.bJ, 30, 12, 20),
                     new class05665(class06570.TV, 1, 3, 10, 0.2F),
                     new class05665(class06570.Tq, 2, 3, 10, 0.2F),
                     new class05665(class06570.TK, 3, 3, 10, 0.2F),
                     new class05675(new class06584(class06570.Tp), 4, 1, 3, 10, 0.2F)
                  },
                  4,
                  new class05663[]{
                     new class05673(class06570.TN, 1, 12, 30), new class05665(class06570.Ta, 12, 3, 15, 0.2F), new class05665(class06570.Tc, 5, 3, 15, 0.2F)
                  },
                  5,
                  new class05663[]{new class05665(class06570.TX, 13, 3, 30, 0.2F)}
               )
            )
         );
         var0.put(
            class05672.u,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{
                     new class05673(class06570.nM, 14, 16, 2),
                     new class05673(class06570.bo, 7, 16, 2),
                     new class05673(class06570.Gc, 4, 16, 2),
                     new class05675(class06570.Ga, 1, 1, 1)
                  },
                  2,
                  new class05663[]{
                     new class05673(class06570.sh, 15, 16, 2), new class05675(class06570.bq, 1, 5, 16, 5), new class05675(class06570.nB, 1, 8, 16, 5)
                  },
                  3,
                  new class05663[]{new class05673(class06570.lL, 7, 16, 20), new class05673(class06570.ni, 10, 16, 20)},
                  4,
                  new class05663[]{new class05673(class06570.jw, 10, 12, 30)},
                  5,
                  new class05663[]{new class05673(class06570.wN, 10, 12, 30)}
               )
            )
         );
         var0.put(
            class05672.z,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{new class05673(class06570.js, 6, 16, 2), new class05667(class06570.bM, 3), new class05667(class06570.bR, 7)},
                  2,
                  new class05663[]{new class05673(class06570.bJ, 26, 12, 10), new class05667(class06570.bi, 5, 12, 5), new class05667(class06570.bB, 4, 12, 5)},
                  3,
                  new class05663[]{new class05673(class06570.GF, 9, 12, 20), new class05667(class06570.bR, 7)},
                  4,
                  new class05663[]{new class05673(class06570.sp, 4, 12, 30), new class05667(class06570.Gh, 6, 12, 15)},
                  5,
                  new class05663[]{new class05675(new class06584(class06570.PF), 6, 1, 12, 30, 0.2F), new class05667(class06570.bi, 5, 12, 30)}
               )
            )
         );
         var0.put(
            class05672.E,
            N(
               ImmutableMap.of(
                  1,
                  new class05663[]{new class05673(class06570.jd, 10, 16, 2), new class05675(class06570.jl, 1, 10, 16, 1)},
                  2,
                  new class05663[]{new class05673(class00869.y, 20, 16, 10), new class05675(class00869.RT, 1, 4, 16, 5)},
                  3,
                  new class05663[]{
                     new class05673(class00869.L, 16, 16, 20),
                     new class05673(class00869.M, 16, 16, 20),
                     new class05673(class00869.i, 16, 16, 20),
                     new class05675(class00869.vF, 1, 4, 16, 10),
                     new class05675(class00869.B, 1, 4, 16, 10),
                     new class05675(class00869.R, 1, 4, 16, 10),
                     new class05675(class00869.u, 1, 4, 16, 10)
                  },
                  4,
                  new class05663[]{
                     new class05673(class06570.Tu, 12, 12, 30),
                     new class05675(class00869.Zy, 1, 1, 12, 15),
                     new class05675(class00869.ZN, 1, 1, 12, 15),
                     new class05675(class00869.ZE, 1, 1, 12, 15),
                     new class05675(class00869.Zu, 1, 1, 12, 15),
                     new class05675(class00869.ZB, 1, 1, 12, 15),
                     new class05675(class00869.ZZ, 1, 1, 12, 15),
                     new class05675(class00869.Zs, 1, 1, 12, 15),
                     new class05675(class00869.ZP, 1, 1, 12, 15),
                     new class05675(class00869.ZM, 1, 1, 12, 15),
                     new class05675(class00869.ZL, 1, 1, 12, 15),
                     new class05675(class00869.ZR, 1, 1, 12, 15),
                     new class05675(class00869.Zm, 1, 1, 12, 15),
                     new class05675(class00869.Zz, 1, 1, 12, 15),
                     new class05675(class00869.ZU, 1, 1, 12, 15),
                     new class05675(class00869.Zi, 1, 1, 12, 15),
                     new class05675(class00869.ZW, 1, 1, 12, 15),
                     new class05675(class00869.Wu, 1, 1, 12, 15),
                     new class05675(class00869.WL, 1, 1, 12, 15),
                     new class05675(class00869.Wm, 1, 1, 12, 15),
                     new class05675(class00869.WR, 1, 1, 12, 15),
                     new class05675(class00869.Wz, 1, 1, 12, 15),
                     new class05675(class00869.WU, 1, 1, 12, 15),
                     new class05675(class00869.Wb, 1, 1, 12, 15),
                     new class05675(class00869.WT, 1, 1, 12, 15),
                     new class05675(class00869.WZ, 1, 1, 12, 15),
                     new class05675(class00869.Wi, 1, 1, 12, 15),
                     new class05675(class00869.WB, 1, 1, 12, 15),
                     new class05675(class00869.Ws, 1, 1, 12, 15),
                     new class05675(class00869.WE, 1, 1, 12, 15),
                     new class05675(class00869.WW, 1, 1, 12, 15),
                     new class05675(class00869.WM, 1, 1, 12, 15),
                     new class05675(class00869.WP, 1, 1, 12, 15)
                  },
                  5,
                  new class05663[]{new class05675(class00869.Bx, 1, 1, 12, 30), new class05675(class00869.BC, 1, 1, 12, 30)}
               )
            )
         );
      }
   );
   public static List<Pair<class05663[], Integer>> y = ImmutableList.builder()
      .add(
         Pair.of(
            new class05663[]{
               new class05673(N(class06506.N), 2, 1, 1),
               new class05673(class06570.jE, 1, 2, 1, 2),
               new class05673(class06570.jT, 1, 2, 1, 2),
               new class05673(class06570.nb, 1, 2, 1, 3),
               new class05673(class06570.Gv, 4, 2, 1),
               new class05673(class06570.ZG, 1, 2, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new class05663[]{
               new class05675(class06570.ZX, 1, 1, 6, 1),
               new class05675(class06570.Ea, 6, 1, 6, 1),
               new class05675(class06570.bN, 1, 4, 2, 1),
               new class05675(class06570.g, 3, 3, 6, 1),
               new class05675(class00869.Ny, 1, 8, 4, 1),
               new class05675(class00869.r, 1, 8, 4, 1),
               new class05675(class00869.Nu, 1, 8, 4, 1),
               new class05675(class00869.NN, 1, 8, 4, 1),
               new class05675(class00869.D, 1, 8, 4, 1),
               new class05675(class00869.h, 1, 8, 4, 1),
               new class05675(class00869.NL, 1, 8, 4, 1),
               new class05675(class00869.NR, 1, 8, 4, 1),
               new class05675(class00869.Ni, 1, 8, 4, 1),
               new class05665(class06570.TK, 1, 1, 1, 0.2F),
               new class05675(y(class06506.B), 5, 1, 1, 1)
            },
            2
         )
      )
      .add(
         Pair.of(
            new class05663[]{
               new class05675(class06570.jn, 3, 1, 4, 1),
               new class05675(class06570.jb, 3, 1, 4, 1),
               new class05675(class06570.ui, 2, 1, 5, 1),
               new class05675(class06570.jQ, 4, 1, 5, 1),
               new class05675(class06570.Mu, 2, 1, 5, 1),
               new class05675(class06570.dj, 5, 1, 5, 1),
               new class05675(class06570.LS, 1, 1, 12, 1),
               new class05675(class06570.ux, 1, 1, 8, 1),
               new class05675(class06570.RA, 1, 1, 4, 1),
               new class05675(class06570.uD, 3, 1, 12, 1),
               new class05675(class06570.RQ, 3, 1, 8, 1),
               new class05675(class06570.ut, 1, 1, 12, 1),
               new class05675(class06570.ud, 1, 1, 12, 1),
               new class05675(class06570.uw, 1, 1, 8, 1),
               new class05675(class06570.uk, 1, 1, 12, 1),
               new class05675(class06570.uY, 1, 1, 12, 1),
               new class05675(class06570.uQ, 1, 1, 12, 1),
               new class05675(class06570.uO, 1, 1, 12, 1),
               new class05675(class06570.ug, 1, 1, 12, 1),
               new class05675(class06570.uI, 1, 1, 12, 1),
               new class05675(class06570.uJ, 1, 1, 12, 1),
               new class05675(class06570.uo, 1, 1, 12, 1),
               new class05675(class06570.uq, 1, 1, 7, 1),
               new class05675(class06570.uG, 1, 1, 7, 1),
               new class05675(class06570.by, 1, 1, 12, 1),
               new class05675(class06570.lk, 1, 1, 12, 1),
               new class05675(class06570.nL, 1, 1, 12, 1),
               new class05675(class06570.nu, 1, 1, 12, 1),
               new class05675(class06570.Ny, 5, 1, 8, 1),
               new class05675(class06570.r, 5, 1, 8, 1),
               new class05675(class06570.Nu, 5, 1, 8, 1),
               new class05675(class06570.NN, 5, 1, 8, 1),
               new class05675(class06570.D, 5, 1, 8, 1),
               new class05675(class06570.h, 5, 1, 8, 1),
               new class05675(class06570.NL, 5, 1, 8, 1),
               new class05675(class06570.Ni, 5, 1, 8, 1),
               new class05675(class06570.NR, 5, 1, 8, 1),
               new class05675(class06570.vk, 1, 3, 12, 1),
               new class05675(class06570.vW, 1, 3, 12, 1),
               new class05675(class06570.vl, 1, 3, 12, 1),
               new class05675(class06570.vj, 1, 3, 12, 1),
               new class05675(class06570.vY, 1, 3, 12, 1),
               new class05675(class06570.vw, 1, 3, 12, 1),
               new class05675(class06570.vn, 1, 3, 12, 1),
               new class05675(class06570.vP, 1, 3, 12, 1),
               new class05675(class06570.vT, 1, 3, 12, 1),
               new class05675(class06570.vv, 1, 3, 12, 1),
               new class05675(class06570.vG, 1, 3, 12, 1),
               new class05675(class06570.vs, 1, 3, 12, 1),
               new class05675(class06570.vb, 1, 3, 12, 1),
               new class05675(class06570.vm, 1, 3, 12, 1),
               new class05675(class06570.vd, 1, 3, 12, 1),
               new class05675(class06570.vt, 1, 3, 12, 1),
               new class05675(class06570.Eb, 3, 1, 8, 1),
               new class05675(class06570.Ej, 3, 1, 8, 1),
               new class05675(class06570.Ev, 3, 1, 8, 1),
               new class05675(class06570.En, 3, 1, 8, 1),
               new class05675(class06570.ET, 3, 1, 8, 1),
               new class05675(class06570.MJ, 1, 3, 4, 1),
               new class05675(class06570.ii, 1, 3, 4, 1),
               new class05675(class06570.uc, 1, 3, 4, 1),
               new class05675(class06570.uX, 1, 3, 4, 1),
               new class05675(class06570.Mf, 1, 5, 2, 1),
               new class05675(class06570.iZ, 1, 2, 5, 1),
               new class05675(class06570.NB, 1, 8, 8, 1),
               new class05675(class06570.NU, 1, 4, 6, 1),
               new class05675(class06570.wC, 1, 2, 5, 1),
               new class05675(class06570.I, 1, 2, 5, 1),
               new class05675(class06570.iL, 1, 2, 5, 1),
               new class05675(class06570.iR, 1, 2, 5, 1),
               new class05675(class06570.ur, 1, 1, 12, 1),
               new class05675(class06570.uL, 1, 1, 12, 1),
               new class05675(class06570.uN, 3, 1, 12, 1)
            },
            5
         )
      )
      .build();
   public static Map<class05946<class05672>, Int2ObjectMap<class05663[]>> L = Map.of(
      class05672.U,
      N(
         ImmutableMap.builder()
            .put(1, new class05663[]{new class05673(class06570.jk, 24, 16, 2), N(1), new class05675(class00869.Lt, 9, 1, 12, 1)})
            .put(2, new class05663[]{new class05673(class06570.jY, 4, 12, 10), N(5), new class05675(class06570.dD, 1, 1, 5)})
            .put(3, new class05663[]{new class05673(class06570.vz, 5, 12, 20), N(10), new class05675(class06570.Lc, 1, 4, 10)})
            .put(
               4, new class05663[]{new class05673(class06570.GU, 2, 12, 30), new class05675(class06570.vN, 5, 1, 15), new class05675(class06570.jJ, 4, 1, 15)}
            )
            .put(5, new class05663[]{N(), new class05675(class06570.lN, 20, 1, 30)})
            .build()
      ),
      class05672.L,
      N(
         ImmutableMap.builder()
            .put(1, new class05663[]{new class05673(class06570.sh, 15, 12, 2), new class05673(class06570.TM, 5, 12, 2)})
            .put(
               2,
               new class05663[]{
                  class05646.N(new class05675(class06570.bv, 4, 1, 12, 5, 0.05F), class05660.N, class05660.L, class05660.u, class05660.i, class05660.M),
                  class05646.N(new class05675(class06570.bs, 4, 1, 12, 5, 0.05F), class05660.y, class05660.R),
                  class05646.N(new class05675(class06570.bT, 5, 1, 12, 5, 0.05F), class05660.N, class05660.L, class05660.u, class05660.i, class05660.M),
                  class05646.N(new class05675(class06570.bW, 5, 1, 12, 5, 0.05F), class05660.y, class05660.R),
                  class05646.N(new class05675(class06570.bj, 7, 1, 12, 5, 0.05F), class05660.N, class05660.L, class05660.u, class05660.i, class05660.M),
                  class05646.N(new class05675(class06570.bP, 7, 1, 12, 5, 0.05F), class05660.y, class05660.R),
                  class05646.N(new class05675(class06570.bb, 9, 1, 12, 5, 0.05F), class05660.N, class05660.L, class05660.u, class05660.i, class05660.M),
                  class05646.N(new class05675(class06570.bm, 9, 1, 12, 5, 0.05F), class05660.y, class05660.R)
               }
            )
            .put(
               3,
               new class05663[]{
                  new class05673(class06570.jW, 1, 12, 20),
                  new class05675(class06570.lo, 5, 1, 12, 10, 0.05F),
                  new class05675(class06570.dx, 36, 1, 12, 10, 0.2F)
               }
            )
            .put(
               4,
               new class05663[]{
                  class05646.N(new class05675(class06570.bv, 8, 1, 3, 15, 0.05F, class02215.N), class05660.N),
                  class05646.N(new class05675(class06570.bT, 9, 1, 3, 15, 0.05F, class02215.u), class05660.N),
                  class05646.N(new class05675(class06570.bj, 11, 1, 3, 15, 0.05F, class02215.y), class05660.N),
                  class05646.N(new class05675(class06570.bb, 13, 1, 3, 15, 0.05F, class02215.L), class05660.N),
                  class05646.N(new class05675(class06570.bv, 8, 1, 3, 15, 0.05F, class02215.M), class05660.L),
                  class05646.N(new class05675(class06570.bT, 9, 1, 3, 15, 0.05F, class02215.z), class05660.L),
                  class05646.N(new class05675(class06570.bj, 11, 1, 3, 15, 0.05F, class02215.B), class05660.L),
                  class05646.N(new class05675(class06570.bb, 13, 1, 3, 15, 0.05F, class02215.Z), class05660.L),
                  class05646.N(new class05675(class06570.bv, 2, 1, 3, 15, 0.05F, class02215.W), class05660.u),
                  class05646.N(new class05675(class06570.bT, 3, 1, 3, 15, 0.05F, class02215.s), class05660.u),
                  class05646.N(new class05675(class06570.bj, 5, 1, 3, 15, 0.05F, class02215.m), class05660.u),
                  class05646.N(new class05675(class06570.bb, 7, 1, 3, 15, 0.05F, class02215.P), class05660.u),
                  class05646.N(new class05675(class06570.bv, 8, 1, 3, 15, 0.05F, class02215.j), class05660.i),
                  class05646.N(new class05675(class06570.bT, 9, 1, 3, 15, 0.05F, class02215.v), class05660.i),
                  class05646.N(new class05675(class06570.bs, 8, 1, 3, 15, 0.05F, class02215.G), class05660.y),
                  class05646.N(new class05675(class06570.bW, 9, 1, 3, 15, 0.05F, class02215.w), class05660.y),
                  class05646.N(new class05675(class06570.bP, 11, 1, 3, 15, 0.05F, class02215.l), class05660.y),
                  class05646.N(new class05675(class06570.bm, 13, 1, 3, 15, 0.05F, class02215.d), class05660.y),
                  class05646.N(new class05675(class06570.bs, 8, 1, 3, 15, 0.05F, class02215.Q), class05660.R),
                  class05646.N(new class05675(class06570.bW, 9, 1, 3, 15, 0.05F, class02215.I), class05660.R),
                  class05646.N(new class05675(class06570.bP, 11, 1, 3, 15, 0.05F, class02215.O), class05660.R),
                  class05646.N(new class05675(class06570.bm, 13, 1, 3, 15, 0.05F, class02215.g), class05660.R),
                  class05646.N(new class05657(class06570.bl, 1, 4, class06570.bG, 1, 3, 15, 0.05F), class05660.M),
                  class05646.N(new class05657(class06570.bG, 1, 4, class06570.bt, 1, 3, 15, 0.05F), class05660.M),
                  class05646.N(new class05657(class06570.bn, 1, 4, class06570.bl, 1, 3, 15, 0.05F), class05660.M),
                  class05646.N(new class05657(class06570.bt, 1, 2, class06570.bn, 1, 3, 15, 0.05F), class05660.M)
               }
            )
            .put(
               5,
               new class05663[]{
                  class05646.N(new class05657(class06570.TN, 4, 16, class06570.bt, 1, 3, 30, 0.05F, class02215.R), class05660.N),
                  class05646.N(new class05657(class06570.TN, 3, 16, class06570.bG, 1, 3, 30, 0.05F, class02215.i), class05660.N),
                  class05646.N(new class05657(class06570.TN, 3, 16, class06570.bG, 1, 3, 30, 0.05F, class02215.E), class05660.L),
                  class05646.N(new class05657(class06570.TN, 2, 12, class06570.bl, 1, 3, 30, 0.05F, class02215.U), class05660.L),
                  class05646.N(new class05657(class06570.TN, 2, 6, class06570.bn, 1, 3, 30, 0.05F, class02215.b), class05660.u),
                  class05646.N(new class05657(class06570.TN, 3, 8, class06570.bt, 1, 3, 30, 0.05F, class02215.T), class05660.u),
                  class05646.N(new class05657(class06570.TN, 2, 12, class06570.bl, 1, 3, 30, 0.05F, class02215.n), class05660.i),
                  class05646.N(new class05657(class06570.TN, 3, 12, class06570.bn, 1, 3, 30, 0.05F, class02215.t), class05660.i),
                  class05646.N(new class05675(class06570.bW, 9, 1, 3, 30, 0.05F, class02215.Y), class05660.y),
                  class05646.N(new class05675(class06570.bs, 8, 1, 3, 30, 0.05F, class02215.k), class05660.y),
                  class05646.N(new class05675(class06570.bW, 9, 1, 3, 30, 0.05F, class02215.o), class05660.R),
                  class05646.N(new class05675(class06570.bs, 8, 1, 3, 30, 0.05F, class02215.J), class05660.R),
                  class05646.N(new class05657(class06570.TN, 4, 18, class06570.bt, 1, 3, 30, 0.05F, class02215.K), class05660.M),
                  class05646.N(new class05657(class06570.TN, 3, 18, class06570.bG, 1, 3, 30, 0.05F, class02215.q), class05660.M),
                  class05646.N(new class05673(class06570.Na, 1, 12, 30, 42), class05660.M),
                  class05646.N(new class05673(class06570.NH, 1, 12, 30, 4), class05660.N, class05660.y, class05660.L, class05660.u, class05660.i, class05660.R)
               }
            )
            .build()
      )
   );

   public class05649() {
      super();
   }

   private static class06584 y(class03556<class06525> var0) {
      return class06517.N(class06570.ns, var0);
   }

   private static class02680 N(class03556<class06525> var0) {
      return new class02680(class06570.ns).N(var1 -> var1.N(class02484.h, new class06517(var0)));
   }

   private static class05663 N() {
      return new class05646(
         ImmutableMap.builder()
            .put(class05660.N, new class05655(30, 3, 3, class02625.O))
            .put(class05660.y, new class05655(30, 2, 2, class02625.g))
            .put(class05660.L, new class05655(30, 3, 3, class02625.I))
            .put(class05660.u, new class05655(30, 3, 3, class02625.J))
            .put(class05660.i, new class05655(30, class02625.o))
            .put(class05660.R, new class05655(30, class02625.q))
            .put(class05660.M, new class05655(30, 2, 2, class02625.K))
            .build()
      );
   }

   private static class05663 N(int var0) {
      return new class05646(
         ImmutableMap.builder()
            .put(class05660.N, new class05655(var0, class02625.G))
            .put(class05660.y, new class05655(var0, class02625.l))
            .put(class05660.L, new class05655(var0, class02625.d))
            .put(class05660.u, new class05655(var0, class02625.w))
            .put(class05660.i, new class05655(var0, class02625.k))
            .put(class05660.R, new class05655(var0, class02625.Y))
            .put(class05660.M, new class05655(var0, class02625.Q))
            .build()
      );
   }

   private static Int2ObjectMap<class05663[]> N(ImmutableMap<Integer, class05663[]> var0) {
      return new Int2ObjectOpenHashMap(var0);
   }
}
