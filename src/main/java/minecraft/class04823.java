package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface class04823 {
   Map<String, class04835> N = new Object2ObjectArrayMap();
   Codec<class04835> y = Codec.stringResolver(class04835::N, N::get);
   class04835 L = N("empty");
   class04835 u = N("water");
   class04835 i = N("lava");
   class04835 R = N("powder_snow");

   private static class07082 L(class00500 var0, class07299 var1, class07209 var2, class08036 var3, class07050 var4, class06584 var5) {
      return (class07082)(N(var1, var2) ? class07082.L : N(var1, var2, var3, var4, var5, class00869.ME.W().y(class01096.M, 3), class04909.uv));
   }

   private static class07082 i(class00500 var0, class07299 var1, class07209 var2, class08036 var3, class07050 var4, class06584 var5) {
      class02708 class02708 = var5.a_(class02484.Nv, class02708.L);
      if (class02708.y().isEmpty()) {
         return class07082.R;
      } else {
         if (!var1.method_8608()) {
            class06584 class06584 = var5.L(1);
            class06584.N(class02484.Nv, class02708.N());
            var3.method_6122(var4, class05970.N(var5, var3, class06584, false));
            var3.method_7281(class01235.NN);
            class01096.L(var0, var1, var2);
         }

         return class07082.N;
      }
   }

   private static class07082 u(class00500 var0, class07299 var1, class07209 var2, class08036 var3, class07050 var4, class06584 var5) {
      if (!(class00891.N(var5.B()) instanceof class07027)) {
         return class07082.R;
      } else {
         if (!var1.method_8608()) {
            class06584 class06584 = var5.N(class00869.Ee, 1);
            var3.method_6122(var4, class05970.N(var5, var3, class06584, false));
            var3.method_7281(class01235.Ny);
            class01096.L(var0, var1, var2);
         }

         return class07082.N;
      }
   }

   private static class07082 y(class00500 var0, class07299 var1, class07209 var2, class08036 var3, class07050 var4, class06584 var5) {
      return (class07082)(N(var1, var2) ? class07082.L : N(var1, var2, var3, var4, var5, class00869.MU.W(), class04909.uj));
   }

   static class04835 N(String var0) {
      Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap();
      object2objectopenhashmap.defaultReturnValue((class04823)(var0x, var1x, var2x, var3, var4, var5) -> class07082.R);
      class04835 class04835 = new class04835(var0, object2objectopenhashmap);
      N.put(var0, class04835);
      return class04835;
   }

   static class07082 N(class07299 var0, class07209 var1, class08036 var2, class07050 var3, class06584 var4, class00500 var5, class04891 var6) {
      if (!var0.method_8608()) {
         class06581 class06581 = var4.B();
         var2.method_6122(var3, class05970.N(var4, var2, new class06584(class06570.jU)));
         var2.method_7281(class01235.D);
         var2.method_7259(class01235.L.y(class06581));
         var0.method_8501(var1, var5);
         var0.method_8396(null, var1, var6, class04911.field_15245, 1.0F, 1.0F);
         var0.N(null, class01194.w, var1);
      }

      return class07082.N;
   }

   static class07082 N(
      class00500 var0,
      class07299 var1,
      class07209 var2,
      class08036 var3,
      class07050 var4,
      class06584 var5,
      class06584 var6,
      Predicate<class00500> var7,
      class04891 var8
   ) {
      if (!var7.test(var0)) {
         return class07082.R;
      } else {
         if (!var1.method_8608()) {
            class06581 class06581 = var5.B();
            var3.method_6122(var4, class05970.N(var5, var3, var6));
            var3.method_7281(class01235.h);
            var3.method_7259(class01235.L.y(class06581));
            var1.method_8501(var2, class00869.MZ.W());
            var1.method_8396(null, var2, var8, class04911.field_15245, 1.0F, 1.0F);
            var1.N(null, class01194.d, var2);
         }

         return class07082.N;
      }
   }

   static void N(Map<class06581, class04823> var0) {
      var0.put(class06570.jW, class04823::y);
      var0.put(class06570.jE, class04823::N);
      var0.put(class06570.jm, class04823::L);
   }

   static void N() {
      Map<class06581, class04823> map = L.y();
      N(map);
      map.put(class06570.ns, (var0x, var1x, var2x, var3x, var4, var5) -> {
         class06517 class06517 = var5.method_58694(class02484.h);
         if (class06517 != null && class06517.N(class06506.N)) {
            if (!var1x.method_8608()) {
               class06581 class06581 = var5.B();
               var3x.method_6122(var4, class05970.N(var5, var3x, new class06584(class06570.nP)));
               var3x.method_7281(class01235.h);
               var3x.method_7259(class01235.L.y(class06581));
               var1x.method_8501(var2x, class00869.Mz.W());
               var1x.method_8396(null, var2x, class04909.Lc, class04911.field_15245, 1.0F, 1.0F);
               var1x.N(null, class01194.w, var2x);
            }

            return class07082.N;
         } else {
            return class07082.R;
         }
      });
      Map<class06581, class04823> map1 = u.y();
      N(map1);
      map1.put(
         class06570.jU,
         (var0x, var1x, var2x, var3x, var4, var5) -> N(
            var0x, var1x, var2x, var3x, var4, var5, new class06584(class06570.jE), var0xx -> var0xx.L(class01096.M) == 3, class04909.ut
         )
      );
      map1.put(class06570.nP, (var0x, var1x, var2x, var3x, var4, var5) -> {
         if (!var1x.method_8608()) {
            class06581 class06581 = var5.B();
            var3x.method_6122(var4, class05970.N(var5, var3x, class06517.N(class06570.ns, class06506.N)));
            var3x.method_7281(class01235.h);
            var3x.method_7259(class01235.L.y(class06581));
            class01096.L(var0x, var1x, var2x);
            var1x.method_8396(null, var2x, class04909.LX, class04911.field_15245, 1.0F, 1.0F);
            var1x.N(null, class01194.d, var2x);
         }

         return class07082.N;
      });
      map1.put(class06570.ns, (var0x, var1x, var2x, var3x, var4, var5) -> {
         if (var0x.L(class01096.M) == 3) {
            return class07082.R;
         } else {
            class06517 class06517 = var5.method_58694(class02484.h);
            if (class06517 != null && class06517.N(class06506.N)) {
               if (!var1x.method_8608()) {
                  var3x.method_6122(var4, class05970.N(var5, var3x, new class06584(class06570.nP)));
                  var3x.method_7281(class01235.h);
                  var3x.method_7259(class01235.L.y(var5.B()));
                  var1x.method_8501(var2x, var0x.N(class01096.M));
                  var1x.method_8396(null, var2x, class04909.Lc, class04911.field_15245, 1.0F, 1.0F);
                  var1x.N(null, class01194.w, var2x);
               }

               return class07082.N;
            } else {
               return class07082.R;
            }
         }
      });
      map1.put(class06570.bB, class04823::R);
      map1.put(class06570.bM, class04823::R);
      map1.put(class06570.bR, class04823::R);
      map1.put(class06570.bi, class04823::R);
      map1.put(class06570.Gh, class04823::R);
      map1.put(class06570.sA, class04823::R);
      map1.put(class06570.li, class04823::i);
      map1.put(class06570.lE, class04823::i);
      map1.put(class06570.lv, class04823::i);
      map1.put(class06570.ls, class04823::i);
      map1.put(class06570.lT, class04823::i);
      map1.put(class06570.lm, class04823::i);
      map1.put(class06570.lb, class04823::i);
      map1.put(class06570.lB, class04823::i);
      map1.put(class06570.lW, class04823::i);
      map1.put(class06570.lz, class04823::i);
      map1.put(class06570.lM, class04823::i);
      map1.put(class06570.lR, class04823::i);
      map1.put(class06570.lU, class04823::i);
      map1.put(class06570.lP, class04823::i);
      map1.put(class06570.lj, class04823::i);
      map1.put(class06570.lZ, class04823::i);
      map1.put(class06570.zx, class04823::u);
      map1.put(class06570.Uu, class04823::u);
      map1.put(class06570.UE, class04823::u);
      map1.put(class06570.UB, class04823::u);
      map1.put(class06570.UZ, class04823::u);
      map1.put(class06570.UR, class04823::u);
      map1.put(class06570.Uz, class04823::u);
      map1.put(class06570.zr, class04823::u);
      map1.put(class06570.Ui, class04823::u);
      map1.put(class06570.Uy, class04823::u);
      map1.put(class06570.zh, class04823::u);
      map1.put(class06570.zD, class04823::u);
      map1.put(class06570.UL, class04823::u);
      map1.put(class06570.UM, class04823::u);
      map1.put(class06570.UU, class04823::u);
      map1.put(class06570.UN, class04823::u);
      Map<class06581, class04823> map2 = i.y();
      map2.put(
         class06570.jU,
         (var0x, var1x, var2x, var3x, var4, var5) -> N(var0x, var1x, var2x, var3x, var4, var5, new class06584(class06570.jW), var0xx -> true, class04909.ud)
      );
      N(map2);
      Map<class06581, class04823> map3 = R.y();
      map3.put(
         class06570.jU,
         (var0x, var1x, var2x, var3x, var4, var5) -> N(
            var0x, var1x, var2x, var3x, var4, var5, new class06584(class06570.jm), var0xx -> var0xx.L(class01096.M) == 3, class04909.uw
         )
      );
      N(map3);
   }

   private static boolean N(class07299 var0, class07209 var1) {
      return var0.method_8316(var1.method_10084()).N(class01231.N);
   }

   private static class07082 N(class00500 var0, class07299 var1, class07209 var2, class08036 var3, class07050 var4, class06584 var5) {
      return N(var1, var2, var3, var4, var5, class00869.Mz.W().y(class01096.M, 3), class04909.us);
   }

   private static class07082 R(class00500 var0, class07299 var1, class07209 var2, class08036 var3, class07050 var4, class06584 var5) {
      if (!var5.N(class01226.Lz)) {
         return class07082.R;
      } else if (!var5.L(class02484.F)) {
         return class07082.R;
      } else {
         if (!var1.method_8608()) {
            var5.y(class02484.F);
            var3.method_7281(class01235.r);
            class01096.L(var0, var1, var2);
         }

         return class07082.N;
      }
   }

   class07082 interact(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class07050 var5, class06584 var6);
}
