package minecraft;

public interface class07593 {
   class05946<class07587> N = N("day");
   class05946<class07587> y = N("moon");
   class05946<class07587> L = N("villager_schedule");
   class05946<class07587> u = N("early_game");
   float i = 15.0F;
   float R = 4.0F;
   int M = class02566.N(1.0F, 0.48F, 0.48F, 1.0F);
   float B = 0.24F;
   int Z = -16777216;
   int z = class02566.N(1.0F, 0.06F, 0.06F, 0.09F);
   int U = class02566.N(1.0F, 0.1F, 0.1F, 0.15F);

   static void N(class04116<class07587> var0) {
      class07586 class07586 = class07586.N(0.362F, 0.241F);
      short short1 = 12600;
      short short2 = 23401;
      short short3 = 6000;
      var0.N(
         N,
         class07587.N()
            .N(24000)
            .N(class00608.W, var1x -> var1x.N(class07586).N(6000, 360.0F).N(6000, 0.0F))
            .N(class00608.m, var1x -> var1x.N(class07586).N(6000, 540.0F).N(6000, 180.0F))
            .N(class00608.P, var1x -> var1x.N(class07586).N(6000, 360.0F).N(6000, 0.0F))
            .N(class00608.d, class00591.field_63790, var0x -> var0x.N(12600, true).N(23401, false))
            .N(class00608.N, class00589.B, var0x -> var0x.N(133, -1).N(11867, -1).N(13670, z).N(22330, z))
            .N(class00608.Z, class00589.B, var0x -> var0x.N(133, -1).N(11867, -1).N(13670, -16777216).N(22330, -16777216))
            .N(class00608.b, class00589.B, var0x -> var0x.N(730, -1).N(11270, -1).N(13140, M).N(22860, M))
            .N(class00608.j, class00585.B, var0x -> var0x.N(730, 1.0F).N(11270, 1.0F).N(13140, 0.24F).N(22860, 0.24F))
            .N(class00608.w, class00585.B, var0x -> var0x.N(133, 1.0F).N(11867, 1.0F).N(13670, 0.26666668F).N(22330, 0.26666668F))
            .N(
               class00608.z,
               var0x -> var0x.N(71, 1609540403)
                  .N(310, 703969843)
                  .N(565, 117167155)
                  .N(730, 16770355)
                  .N(11270, 16770355)
                  .N(11397, 83679283)
                  .N(11522, 268028723)
                  .N(11690, 703969843)
                  .N(11929, 1609540403)
                  .N(12243, -1310226637)
                  .N(12358, -857440717)
                  .N(12512, -371166669)
                  .N(12613, -153261261)
                  .N(12732, -19242189)
                  .N(12841, -19440589)
                  .N(13035, -321760973)
                  .N(13252, -1043577037)
                  .N(13775, 918435635)
                  .N(13888, 532362547)
                  .N(14039, 163001139)
                  .N(14192, 11744051)
                  .N(21807, 11678515)
                  .N(21961, 163001139)
                  .N(22112, 532362547)
                  .N(22225, 918435635)
                  .N(22748, -1043577037)
                  .N(22965, -321760973)
                  .N(23159, -19440589)
                  .N(23272, -19242189)
                  .N(23488, -371166669)
                  .N(23642, -857440717)
                  .N(23757, -1310226637)
            )
            .N(
               class00608.T,
               class00585.z,
               var0x -> var0x.N(92, 0.037F)
                  .N(627, 0.0F)
                  .N(11373, 0.0F)
                  .N(11732, 0.016F)
                  .N(11959, 0.044F)
                  .N(12399, 0.143F)
                  .N(12729, 0.258F)
                  .N(13228, 0.5F)
                  .N(22772, 0.5F)
                  .N(23032, 0.364F)
                  .N(23356, 0.225F)
                  .N(23758, 0.101F)
            )
            .N(class00608.U, class00589.Z, var0x -> var0x.N(133, -1).N(11867, -1).N(13670, U).N(22330, U))
            .N(class00608.o, var0x -> var0x.N(12600, class02584.field_52394).N(23401, class02584.field_52395))
            .N(class00608.e, class00591.field_63790, var0x -> var0x.N(12600, true).N(23401, false))
            .N(class00608.q, class00585.z, var0x -> var0x.N(class07586.L).N(21062, 1.0F).N(21905, 0.002F))
            .N(class00608.c, class00585.z, var0x -> var0x.N(class07586.L).N(362, 0.0F).N(23667, 0.7F))
            .N(class00608.X, class00591.field_63790, var0x -> var0x.N(12542, true).N(23460, false))
            .N(class00608.a, class00591.field_63790, var0x -> var0x.N(12542, false).N(23460, true))
            .N()
      );
      class07595 class07595 = class07587.N().N(24000 * class08165.field_63433).N(class00608.s, var0x -> {
         for (class08165 class08165 : class08165.values()) {
            var0x.N(class08165.y(), class08165);
         }
      }).N(class00608.H, class00585.z, var0x -> {
         var0x.N(class07586.L);

         for (class08165 class08165 : class08165.values()) {
            var0x.N(class08165.y(), class07376.U[class08165.N()] * 0.5F);
         }
      });
      var0.N(y, class07595.N());
      short short4 = 2000;
      short short5 = 7000;
      var0.N(
         L,
         class07587.N()
            .N(24000)
            .N(class00608.F, var0x -> var0x.N(10, class05359.y).N(2000, class05359.L).N(9000, class05359.R).N(11000, class05359.y).N(12000, class05359.i))
            .N(class00608.A, var0x -> var0x.N(10, class05359.y).N(3000, class05359.u).N(6000, class05359.y).N(10000, class05359.u).N(12000, class05359.i))
            .N()
      );
      var0.N(u, class07587.N().N(class00608.p, class00591.field_63788, var0x -> var0x.N(0, false).N(120000, true)).N());
   }

   private static class05946<class07587> N(String var0) {
      return class05946.N(class04227.yG, class01894.y(var0));
   }
}
