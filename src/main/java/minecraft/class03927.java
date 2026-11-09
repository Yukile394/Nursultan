package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class class03927 {
   public static final class05946<class05369> N = N("armorer");
   public static final class05946<class05369> y = N("butcher");
   public static final class05946<class05369> L = N("cartographer");
   public static final class05946<class05369> u = N("cleric");
   public static final class05946<class05369> i = N("farmer");
   public static final class05946<class05369> R = N("fisherman");
   public static final class05946<class05369> M = N("fletcher");
   public static final class05946<class05369> B = N("leatherworker");
   public static final class05946<class05369> Z = N("librarian");
   public static final class05946<class05369> z = N("mason");
   public static final class05946<class05369> U = N("shepherd");
   public static final class05946<class05369> E = N("toolsmith");
   public static final class05946<class05369> W = N("weaponsmith");
   public static final class05946<class05369> m = N("home");
   public static final class05946<class05369> P = N("meeting");
   public static final class05946<class05369> s = N("beehive");
   public static final class05946<class05369> T = N("bee_nest");
   public static final class05946<class05369> b = N("nether_portal");
   public static final class05946<class05369> j = N("lodestone");
   public static final class05946<class05369> v = N("lightning_rod");
   public static final class05946<class05369> n = N("test_instance");
   private static final Set<class00500> t = ImmutableList.of(
         class00869.yn,
         class00869.yt,
         class00869.yb,
         class00869.yj,
         class00869.ys,
         class00869.ym,
         class00869.yv,
         class00869.yz,
         class00869.yP,
         class00869.yE,
         class00869.yZ,
         class00869.yB,
         new class00891[]{class00869.yW, class00869.yT, class00869.yM, class00869.yU}
      )
      .stream()
      .flatMap(var0 -> var0.E().N().stream())
      .filter(var0 -> var0.L(class07789.y) == class06637.field_12560)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<class00500> G = ImmutableList.of(class00869.MZ, class00869.MU, class00869.Mz, class00869.ME)
      .stream()
      .flatMap(var0 -> var0.E().N().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<class00500> l = ImmutableList.of(
         class00869.vq, class00869.vK, class00869.vV, class00869.ve, class00869.vH, class00869.vc, class00869.vX, class00869.va
      )
      .stream()
      .flatMap(var0 -> var0.E().N().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static Map<class00500, class03556<class05369>> d = Maps.newHashMap();

   public class03927() {
      super();
   }

   public static boolean y(class00500 var0) {
      return d.containsKey(var0);
   }

   public static class05369 N(class00751<class05369> var0) {
      N(var0, N, N(class00869.Pf), 1, 1);
      N(var0, y, N(class00869.PA), 1, 1);
      N(var0, L, N(class00869.PC), 1, 1);
      N(var0, u, N(class00869.MB), 1, 1);
      N(var0, i, N(class00869.TL), 1, 1);
      N(var0, R, N(class00869.PF), 1, 1);
      N(var0, M, N(class00869.PS), 1, 1);
      N(var0, B, G, 1, 1);
      N(var0, Z, N(class00869.PD), 1, 1);
      N(var0, z, N(class00869.Pr), 1, 1);
      N(var0, U, N(class00869.Pp), 1, 1);
      N(var0, E, N(class00869.Ph), 1, 1);
      N(var0, W, N(class00869.Px), 1, 1);
      N(var0, m, t, 1, 1);
      N(var0, P, N(class00869.sN), 32, 6);
      N(var0, s, N(class00869.TR), 0, 1);
      N(var0, T, N(class00869.Ti), 0, 1);
      N(var0, b, N(class00869.iq), 0, 1);
      N(var0, j, N(class00869.TT), 0, 1);
      N(var0, n, N(class00869.Ty), 0, 1);
      return N(var0, v, l, 0, 1);
   }

   private static Set<class00500> N(class00891 var0) {
      return ImmutableSet.copyOf(var0.E().N());
   }

   private static class05946<class05369> N(String var0) {
      return class05946.N(class04227.NZ, class01894.y(var0));
   }

   public static Optional<class03556<class05369>> N(class00500 var0) {
      return Optional.ofNullable(d.get(var0));
   }

   public static class05369 N(class00751<class05369> var0, class05946<class05369> var1, Set<class00500> var2, int var3, int var4) {
      class05369 class05369 = new class05369(var2, var3, var4);
      class00751.N(var0, var1, class05369);
      N(var0.y(var1), var2);
      return class05369;
   }

   private static void N(class03556<class05369> var0, Set<class00500> var1) {
      var1.forEach(var1x -> {
         if ((class03556)d.put(var1x, var0) != null) {
            throw (IllegalStateException)class07536.y(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", var1x)));
         }
      });
   }
}
