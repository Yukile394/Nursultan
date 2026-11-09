package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;

public class class05077 extends class01219 {
   public static final MapCodec<class05077> N = MapCodec.unit(() -> class05077.y);
   public static final class05077 y = new class05077();
   private final Map<class00891, class00891> L = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put(class00869.W, class00869.Tb);
      var0.put(class00869.LK, class00869.Tb);
      var0.put(class00869.y, class00869.Tt);
      var0.put(class00869.Rm, class00869.TG);
      var0.put(class00869.RP, class00869.TG);
      var0.put(class00869.uP, class00869.Tj);
      var0.put(class00869.PR, class00869.Tj);
      var0.put(class00869.PB, class00869.TO);
      var0.put(class00869.RA, class00869.Tk);
      var0.put(class00869.Pu, class00869.Tk);
      var0.put(class00869.UY, class00869.Tn);
      var0.put(class00869.Pv, class00869.Tn);
      var0.put(class00869.Ul, class00869.Tg);
      var0.put(class00869.UG, class00869.Tg);
      var0.put(class00869.UO, class00869.Tw);
      var0.put(class00869.Pb, class00869.Tw);
      var0.put(class00869.Po, class00869.TY);
      var0.put(class00869.PI, class00869.TY);
      var0.put(class00869.Mg, class00869.Tv);
      var0.put(class00869.MI, class00869.Tv);
      var0.put(class00869.RT, class00869.Td);
      var0.put(class00869.Rs, class00869.Tl);
      var0.put(class00869.RQ, class00869.Rg);
   });

   private class05077() {
      super();
   }

   @Override
   protected class05235<?> N() {
      return class05235.E;
   }

   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      class00891 class00891 = this.L.get(var5.y().i());
      if (class00891 == null) {
         return var5;
      } else {
         class00500 class00500x = var5.y();
         class00500 class00500x = class00891.W();
         if (class00500x.y(class07746.y)) {
            class00500x = class00500x.y(class07746.y, class00500x.L(class07746.y));
         }

         if (class00500x.y(class07746.L)) {
            class00500x = class00500x.y(class07746.L, class00500x.L(class07746.L));
         }

         if (class00500x.y(class07007.y)) {
            class00500x = class00500x.y(class07007.y, class00500x.L(class07007.y));
         }

         return new class01228(var5.N(), class00500x, var5.L());
      }
   }
}
