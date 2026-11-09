package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;

public final class class05660 {
   public static final class05946<class05660> N = N("desert");
   public static final class05946<class05660> y = N("jungle");
   public static final class05946<class05660> L = N("plains");
   public static final class05946<class05660> u = N("savanna");
   public static final class05946<class05660> i = N("snow");
   public static final class05946<class05660> R = N("swamp");
   public static final class05946<class05660> M = N("taiga");
   public static final Codec<class03556<class05660>> B = class03539.N(class04227.NH);
   public static final class02362<class04247, class03556<class05660>> Z = class02389.y(class04227.NH);
   public static final Map<class05946<class00780>, class05946<class05660>> z = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put(class00795.Y, N);
      var0.put(class00795.R, N);
      var0.put(class00795.Q, N);
      var0.put(class00795.O, N);
      var0.put(class00795.k, y);
      var0.put(class00795.d, y);
      var0.put(class00795.w, y);
      var0.put(class00795.v, u);
      var0.put(class00795.j, u);
      var0.put(class00795.l, u);
      var0.put(class00795.h, i);
      var0.put(class00795.D, i);
      var0.put(class00795.H, i);
      var0.put(class00795.i, i);
      var0.put(class00795.X, i);
      var0.put(class00795.b, i);
      var0.put(class00795.u, i);
      var0.put(class00795.J, i);
      var0.put(class00795.o, i);
      var0.put(class00795.q, i);
      var0.put(class00795.K, i);
      var0.put(class00795.M, R);
      var0.put(class00795.B, R);
      var0.put(class00795.s, M);
      var0.put(class00795.P, M);
      var0.put(class00795.t, M);
      var0.put(class00795.n, M);
      var0.put(class00795.T, M);
      var0.put(class00795.G, M);
   });

   public class05660() {
      super();
   }

   public static class05660 N(class00751<class05660> var0) {
      N(var0, N);
      N(var0, y);
      N(var0, L);
      N(var0, u);
      N(var0, i);
      N(var0, R);
      return N(var0, M);
   }

   public static class05946<class05660> N(class03556<class00780> var0) {
      return var0.i().map(z::get).orElse(L);
   }

   private static class05946<class05660> N(String var0) {
      return class05946.N(class04227.NH, class01894.y(var0));
   }

   private static class05660 N(class00751<class05660> var0, class05946<class05660> var1) {
      return class00751.N(var0, var1, new class05660());
   }
}
