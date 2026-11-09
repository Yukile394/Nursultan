package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public interface class02674 extends class01108<class02774> {
   Supplier<BiMap<class00891, class00891>> k_ = Suppliers.memoize(
      () -> {
         ImmutableBiMap immutablebimap;
         ImmutableBiMap immutablebimap1 = immutablebimap = ImmutableBiMap.builder()
            .put(class00869.bx, class00869.bD)
            .put(class00869.bD, class00869.bh)
            .put(class00869.bh, class00869.br)
            .put(class00869.jR, class00869.ji)
            .put(class00869.ji, class00869.ju)
            .put(class00869.ju, class00869.jL)
            .put(class00869.jz, class00869.jZ)
            .put(class00869.jZ, class00869.jB)
            .put(class00869.jB, class00869.jM)
            .put(class00869.jt, class00869.jn)
            .put(class00869.jn, class00869.jv)
            .put(class00869.jv, class00869.jj)
            .put(class00869.jb, class00869.jT)
            .put(class00869.jT, class00869.js)
            .put(class00869.js, class00869.jP)
            .put(class00869.jH, class00869.jc)
            .put(class00869.jc, class00869.ja)
            .put(class00869.ja, class00869.jX)
            .put(class00869.jC, class00869.jS)
            .put(class00869.jS, class00869.jD)
            .put(class00869.jD, class00869.jx)
            .putAll(class00869.RO.N())
            .put(class00869.vL, class00869.vu)
            .put(class00869.vu, class00869.vi)
            .put(class00869.vi, class00869.vR)
            .put(class00869.vU, class00869.vE)
            .put(class00869.vE, class00869.vW)
            .put(class00869.vW, class00869.vm)
            .putAll(class00869.su.N())
            .put(class00869.vj, class00869.vv)
            .put(class00869.vv, class00869.vn)
            .put(class00869.vn, class00869.vt)
            .put(class00869.vk, class00869.vY)
            .put(class00869.vY, class00869.vQ)
            .put(class00869.vQ, class00869.vO)
            .put(class00869.vq, class00869.vK)
            .put(class00869.vK, class00869.vV)
            .put(class00869.vV, class00869.ve)
            .putAll(class00869.RI.N())
            .build();
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, immutablebimap);
         N(callbackinforeturnable);
         return (BiMap)(callbackinforeturnable.isCancelled() ? (BiMap)callbackinforeturnable.getReturnValue() : immutablebimap1);
      }
   );
   Supplier<BiMap<class00891, class00891>> l_ = Suppliers.memoize(() -> k_.get().inverse());

   static Optional<class00891> L(class00891 var0) {
      return Optional.ofNullable((class00891)k_.get().get(var0));
   }

   static class00891 y(class00891 var0) {
      class00891 class00891x = var0;

      for (class00891 class00891x = (class00891)l_.get().get(var0); class00891x != null; class00891x = (class00891)l_.get().get(class00891x)) {
         class00891x = class00891x;
      }

      return class00891x;
   }

   private static void N(CallbackInfoReturnable var0) {
      var0.setReturnValue(HashBiMap.create((Map)var0.getReturnValue()));
   }

   static Optional<class00891> N(class00891 var0) {
      return Optional.ofNullable((class00891)l_.get().get(var0));
   }

   static class00500 g_(class00500 var0) {
      return y(var0.i()).s(var0);
   }

   static Optional<class00500> f_(class00500 var0) {
      return N(var0.i()).map(var1 -> var1.s(var0));
   }

   @Override
   default float J_() {
      return this.i() == class02774.field_28704 ? 0.75F : 1.0F;
   }

   @Override
   default Optional<class00500> h_(class00500 var1) {
      return L(var1.i()).map(var1x -> var1x.s(var1));
   }
}
