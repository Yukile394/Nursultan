package minecraft;

public class class04105 {
   public static final class02061 N = new class02061()
      .N(class04227.yu, class01920::N)
      .N(class04227.ND, class01010::N)
      .N(class04227.Nh, class03188::N)
      .N(class04227.ys, class03170::N)
      .N(class04227.yj, class01007::N)
      .N(class04227.yb, class04423::N)
      .N(class04227.yT, class01027::N)
      .N(class04227.yv, class01019::N)
      .N(class04227.NA, class05471::N)
      .N(class04227.yU, class03565::N)
      .N(class04227.yW, class03023::N)
      .N(class04227.yy, class03882::N)
      .N(class04227.yE, class05943::N)
      .N(class04227.yO, class05964::N)
      .N(class04227.yM, class04095::N)
      .N(class04227.NC, class00629::N)
      .N(class04227.yk, class03247::N)
      .N(class04227.yw, class03270::N)
      .N(class04227.yl, class08221::N)
      .N(class04227.yY, class02503::N)
      .N(class04227.yQ, class08526::N)
      .N(class04227.ym, class04472::N)
      .N(class04227.yN, class03683::N)
      .N(class04227.NF, class04444::N)
      .N(class04227.yR, class07314::N)
      .N(class04227.yi, class02251::N)
      .N(class04227.yz, class02207::N)
      .N(class04227.yZ, class04460::N)
      .N(class04227.yP, class08638::N)
      .N(class04227.Nr, class08401::N)
      .N(class04227.NS, class08427::N)
      .N(class04227.Nx, class07597::N)
      .N(class04227.yn, class00220::N)
      .N(class04227.yt, class00199::N)
      .N(class04227.yB, class08553::N)
      .N(class04227.Nf, class08574::N)
      .N(class04227.yL, class09016::N)
      .N(class04227.yG, class07593::N);

   public class04105() {
      super();
   }

   public static void N(class02055<class04336> var0, class01905<class00780> var1) {
      var1.z().forEach(var1x -> {
         class01894 class01894 = var1x.B().N();
         ((class00780)var1x.N()).L().L().stream().flatMap(class03543::N).forEach(var3 -> var3.u().ifLeft(var2xx -> {
            if (!N((class04336)var0.y(var2xx).N())) {
               class07536.y("Placed feature " + var2xx.N() + " in biome " + class01894 + " is missing BiomeFilter.biome()");
            }
         }).ifRight(var1xxx -> {
            if (!N(var1xxx)) {
               class07536.y("Placed inline feature in biome " + var1x + " is missing BiomeFilter.biome()");
            }
         }));
      });
   }

   private static boolean N(class04336 var0) {
      return var0.L().contains(class04294.y());
   }

   public static class01929 N() {
      class01022 class01022 = class01042.N(class04206.NF);
      class01929 class01929 = N.N(class01022);
      N(class01929);
      return class01929;
   }

   public static void N(class01929 var0) {
      N(var0.y(class04227.ys), var0.y(class04227.NA));
   }
}
