package minecraft;

import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class01944 {
   public static final class05946<class02246> N = N("blank");
   public static final class05946<class02246> y = N("angler");
   public static final class05946<class02246> L = N("archer");
   public static final class05946<class02246> u = N("arms_up");
   public static final class05946<class02246> i = N("blade");
   public static final class05946<class02246> R = N("brewer");
   public static final class05946<class02246> M = N("burn");
   public static final class05946<class02246> B = N("danger");
   public static final class05946<class02246> Z = N("explorer");
   public static final class05946<class02246> z = N("flow");
   public static final class05946<class02246> U = N("friend");
   public static final class05946<class02246> E = N("guster");
   public static final class05946<class02246> W = N("heart");
   public static final class05946<class02246> m = N("heartbreak");
   public static final class05946<class02246> P = N("howl");
   public static final class05946<class02246> s = N("miner");
   public static final class05946<class02246> T = N("mourner");
   public static final class05946<class02246> b = N("plenty");
   public static final class05946<class02246> j = N("prize");
   public static final class05946<class02246> v = N("scrape");
   public static final class05946<class02246> n = N("sheaf");
   public static final class05946<class02246> t = N("shelter");
   public static final class05946<class02246> G = N("skull");
   public static final class05946<class02246> l = N("snort");
   private static final Map<class06581, class05946<class02246>> d = Map.ofEntries(
      Map.entry(class06570.jl, N),
      Map.entry(class06570.kn, y),
      Map.entry(class06570.kt, L),
      Map.entry(class06570.kG, u),
      Map.entry(class06570.kl, i),
      Map.entry(class06570.kd, R),
      Map.entry(class06570.kw, M),
      Map.entry(class06570.kk, B),
      Map.entry(class06570.kY, Z),
      Map.entry(class06570.kQ, z),
      Map.entry(class06570.kO, U),
      Map.entry(class06570.kg, E),
      Map.entry(class06570.kI, W),
      Map.entry(class06570.kJ, m),
      Map.entry(class06570.ko, P),
      Map.entry(class06570.kq, s),
      Map.entry(class06570.kK, T),
      Map.entry(class06570.kV, b),
      Map.entry(class06570.ke, j),
      Map.entry(class06570.kH, v),
      Map.entry(class06570.kc, n),
      Map.entry(class06570.kX, t),
      Map.entry(class06570.ka, G),
      Map.entry(class06570.kp, l)
   );

   public class01944() {
      super();
   }

   public static class02246 N(class00751<class02246> var0) {
      N(var0, y, "angler_pottery_pattern");
      N(var0, L, "archer_pottery_pattern");
      N(var0, u, "arms_up_pottery_pattern");
      N(var0, i, "blade_pottery_pattern");
      N(var0, R, "brewer_pottery_pattern");
      N(var0, M, "burn_pottery_pattern");
      N(var0, B, "danger_pottery_pattern");
      N(var0, Z, "explorer_pottery_pattern");
      N(var0, z, "flow_pottery_pattern");
      N(var0, U, "friend_pottery_pattern");
      N(var0, E, "guster_pottery_pattern");
      N(var0, W, "heart_pottery_pattern");
      N(var0, m, "heartbreak_pottery_pattern");
      N(var0, P, "howl_pottery_pattern");
      N(var0, s, "miner_pottery_pattern");
      N(var0, T, "mourner_pottery_pattern");
      N(var0, b, "plenty_pottery_pattern");
      N(var0, j, "prize_pottery_pattern");
      N(var0, v, "scrape_pottery_pattern");
      N(var0, n, "sheaf_pottery_pattern");
      N(var0, t, "shelter_pottery_pattern");
      N(var0, G, "skull_pottery_pattern");
      N(var0, l, "snort_pottery_pattern");
      return N(var0, N, "decorated_pot_side");
   }

   private static class02246 N(class00751<class02246> var0, class05946<class02246> var1, String var2) {
      return class00751.N(var0, var1, new class02246(class01894.y(var2)));
   }

   @Nullable
   public static class05946<class02246> N(class06581 var0) {
      return d.get(var0);
   }

   private static class05946<class02246> N(String var0) {
      return class05946.N(class04227.n, class01894.y(var0));
   }
}
