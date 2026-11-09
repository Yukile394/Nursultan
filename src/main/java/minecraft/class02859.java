package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02859 extends class06581 implements class03568 {
   public static final Supplier<BiMap<class00891, class00891>> N = Suppliers.memoize(
      () -> {
         ImmutableBiMap immutablebimap;
         ImmutableBiMap immutablebimap1 = immutablebimap = ImmutableBiMap.builder()
            .put(class00869.bx, class00869.jG)
            .put(class00869.bD, class00869.jd)
            .put(class00869.bh, class00869.jl)
            .put(class00869.br, class00869.jw)
            .put(class00869.jR, class00869.jO)
            .put(class00869.ji, class00869.jQ)
            .put(class00869.ju, class00869.jY)
            .put(class00869.jL, class00869.jk)
            .put(class00869.jt, class00869.je)
            .put(class00869.jn, class00869.jV)
            .put(class00869.jv, class00869.jK)
            .put(class00869.jj, class00869.jq)
            .put(class00869.jb, class00869.jo)
            .put(class00869.jT, class00869.jJ)
            .put(class00869.js, class00869.jI)
            .put(class00869.jP, class00869.jg)
            .put(class00869.jz, class00869.jm)
            .put(class00869.jZ, class00869.jW)
            .put(class00869.jB, class00869.jE)
            .put(class00869.jM, class00869.jU)
            .put(class00869.jH, class00869.jp)
            .put(class00869.jc, class00869.jF)
            .put(class00869.ja, class00869.jf)
            .put(class00869.jX, class00869.jA)
            .put(class00869.jC, class00869.jh)
            .put(class00869.jS, class00869.jr)
            .put(class00869.jD, class00869.vy)
            .put(class00869.jx, class00869.vN)
            .putAll(class00869.RO.y())
            .put(class00869.vL, class00869.vM)
            .put(class00869.vu, class00869.vB)
            .put(class00869.vi, class00869.vZ)
            .put(class00869.vR, class00869.vz)
            .put(class00869.vU, class00869.vP)
            .put(class00869.vE, class00869.vs)
            .put(class00869.vW, class00869.vT)
            .put(class00869.vm, class00869.vb)
            .put(class00869.vj, class00869.vG)
            .put(class00869.vv, class00869.vl)
            .put(class00869.vn, class00869.vd)
            .put(class00869.vt, class00869.vw)
            .put(class00869.vk, class00869.vg)
            .put(class00869.vY, class00869.vI)
            .put(class00869.vQ, class00869.vJ)
            .put(class00869.vO, class00869.vo)
            .put(class00869.vq, class00869.vH)
            .put(class00869.vK, class00869.vc)
            .put(class00869.vV, class00869.vX)
            .put(class00869.ve, class00869.va)
            .putAll(class00869.su.y())
            .putAll(class00869.RI.y())
            .build();
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, immutablebimap);
         N(callbackinforeturnable);
         return (BiMap)(callbackinforeturnable.isCancelled() ? (BiMap)callbackinforeturnable.getReturnValue() : immutablebimap1);
      }
   );
   public static final Supplier<BiMap<class00891, class00891>> y = Suppliers.memoize(() -> N.get().inverse());
   private static final String m = "waxed_copper_door";
   private static final String P = "waxed_copper_trapdoor";
   private static final String s = "waxed_copper_golem_statue";
   private static final String T = "waxed_copper_chest";
   private static final String b = "waxed_lightning_rod";
   private static final String j = "waxed_copper_bar";
   private static final String v = "waxed_copper_chain";
   private static final String n = "waxed_copper_lantern";
   private static final String t = "waxed_copper_block";
   public static final ImmutableMap<class00891, Pair<class01990, String>> L = ImmutableMap.builder()
      .put(class00869.vP, Pair.of(class01990.field_40636, "waxed_copper_bulb"))
      .put(class00869.vT, Pair.of(class01990.field_40636, "waxed_weathered_copper_bulb"))
      .put(class00869.vs, Pair.of(class01990.field_40636, "waxed_exposed_copper_bulb"))
      .put(class00869.vb, Pair.of(class01990.field_40636, "waxed_oxidized_copper_bulb"))
      .put(class00869.jp, Pair.of(class01990.field_40636, "waxed_copper_door"))
      .put(class00869.jf, Pair.of(class01990.field_40636, "waxed_copper_door"))
      .put(class00869.jF, Pair.of(class01990.field_40636, "waxed_copper_door"))
      .put(class00869.jA, Pair.of(class01990.field_40636, "waxed_copper_door"))
      .put(class00869.jh, Pair.of(class01990.field_40636, "waxed_copper_trapdoor"))
      .put(class00869.vy, Pair.of(class01990.field_40636, "waxed_copper_trapdoor"))
      .put(class00869.jr, Pair.of(class01990.field_40636, "waxed_copper_trapdoor"))
      .put(class00869.vN, Pair.of(class01990.field_40636, "waxed_copper_trapdoor"))
      .put(class00869.vg, Pair.of(class01990.field_40634, "waxed_copper_golem_statue"))
      .put(class00869.vJ, Pair.of(class01990.field_40634, "waxed_copper_golem_statue"))
      .put(class00869.vI, Pair.of(class01990.field_40634, "waxed_copper_golem_statue"))
      .put(class00869.vo, Pair.of(class01990.field_40634, "waxed_copper_golem_statue"))
      .put(class00869.vG, Pair.of(class01990.field_40634, "waxed_copper_chest"))
      .put(class00869.vd, Pair.of(class01990.field_40634, "waxed_copper_chest"))
      .put(class00869.vl, Pair.of(class01990.field_40634, "waxed_copper_chest"))
      .put(class00869.vw, Pair.of(class01990.field_40634, "waxed_copper_chest"))
      .put(class00869.vH, Pair.of(class01990.field_40634, "waxed_lightning_rod"))
      .put(class00869.vX, Pair.of(class01990.field_40634, "waxed_lightning_rod"))
      .put(class00869.vc, Pair.of(class01990.field_40634, "waxed_lightning_rod"))
      .put(class00869.va, Pair.of(class01990.field_40634, "waxed_lightning_rod"))
      .put(class00869.RO.B(), Pair.of(class01990.field_40634, "waxed_copper_bar"))
      .put(class00869.RO.z(), Pair.of(class01990.field_40634, "waxed_copper_bar"))
      .put(class00869.RO.Z(), Pair.of(class01990.field_40634, "waxed_copper_bar"))
      .put(class00869.RO.U(), Pair.of(class01990.field_40634, "waxed_copper_bar"))
      .put(class00869.RI.B(), Pair.of(class01990.field_40634, "waxed_copper_chain"))
      .put(class00869.RI.z(), Pair.of(class01990.field_40634, "waxed_copper_chain"))
      .put(class00869.RI.Z(), Pair.of(class01990.field_40634, "waxed_copper_chain"))
      .put(class00869.RI.U(), Pair.of(class01990.field_40634, "waxed_copper_chain"))
      .put(class00869.su.B(), Pair.of(class01990.field_40634, "waxed_copper_lantern"))
      .put(class00869.su.z(), Pair.of(class01990.field_40634, "waxed_copper_lantern"))
      .put(class00869.su.Z(), Pair.of(class01990.field_40634, "waxed_copper_lantern"))
      .put(class00869.su.U(), Pair.of(class01990.field_40634, "waxed_copper_lantern"))
      .put(class00869.jG, Pair.of(class01990.field_40634, "waxed_copper_block"))
      .put(class00869.jl, Pair.of(class01990.field_40634, "waxed_copper_block"))
      .put(class00869.jd, Pair.of(class01990.field_40634, "waxed_copper_block"))
      .put(class00869.jw, Pair.of(class01990.field_40634, "waxed_copper_block"))
      .build();

   public class02859(class06573 var1) {
      super(var1);
   }

   private static void N(CallbackInfoReturnable var0) {
      var0.setReturnValue(HashBiMap.create((Map)var0.getReturnValue()));
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class00500 class00500 = class07299.method_8320(class07209);
      return N(class00500).map(var4x -> {
         class08036 class08036 = var1.method_8036();
         class06584 class06584 = var1.method_8041();
         if (class08036 instanceof class04770 class04770) {
            class06912.X.N(class04770, class07209, class06584);
         }

         class06584.B(1);
         class07299.method_8652(class07209, var4x, 11);
         class07299.N(class01194.L, class07209, class01164.N(class08036, var4x));
         class07299.method_8444(class08036, 3003, class07209, 0);
         if (class00500.i() instanceof class00860 && class00500.L(class00860.i) != class06638.field_12569) {
            class07209 class07209x = class00860.y(class07209, class00500);
            class07299.N(class01194.L, class07209x, class01164.N(class08036, class07299.method_8320(class07209x)));
            class07299.method_8444(class08036, 3003, class07209x, 0);
         }

         return class07082.N;
      }).orElse(class07082.i);
   }

   public static Optional<class00500> N(class00500 var0) {
      return Optional.ofNullable((class00891)N.get().get(var0.i())).map(var1 -> ((class00891)var1).s(var0));
   }

   @Override
   public boolean N(class07299 var1, class07267 var2, boolean var3, class08036 var4) {
      if (var2.y(true)) {
         var1.method_8444(null, 3003, var2.d(), 0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class03610 var1, class08036 var2) {
      return true;
   }
}
