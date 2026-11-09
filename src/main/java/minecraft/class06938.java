package minecraft;

import com.google.common.collect.ImmutableMap.Builder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry.StrippingTransformer;
import net.fabricmc.fabric.impl.content.registry.StrippableBlockRegistryImpl;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06938 extends class06581 implements AxeItemAccessor {
   protected static Map<class00891, class00891> N = new Builder()
      .put(class00869.Nv, class00869.NY)
      .put(class00869.D, class00869.NT)
      .put(class00869.Nw, class00869.No)
      .put(class00869.Nu, class00869.NP)
      .put(class00869.n, class00869.Nq)
      .put(class00869.Ni, class00869.Ns)
      .put(class00869.Nl, class00869.NI)
      .put(class00869.Ny, class00869.NW)
      .put(class00869.Nd, class00869.NJ)
      .put(class00869.NL, class00869.Nm)
      .put(class00869.Nt, class00869.NO)
      .put(class00869.r, class00869.NU)
      .put(class00869.NG, class00869.Ng)
      .put(class00869.NN, class00869.NE)
      .put(class00869.Nn, class00869.NQ)
      .put(class00869.h, class00869.Nz)
      .put(class00869.sB, class00869.sZ)
      .put(class00869.sz, class00869.sU)
      .put(class00869.sT, class00869.sb)
      .put(class00869.sj, class00869.sv)
      .put(class00869.Nk, class00869.NK)
      .put(class00869.NR, class00869.Nb)
      .put(class00869.NZ, class00869.Nj)
      .build();

   private boolean L(class06501 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_5) && y(var1);
   }

   public class06938(class02749 var1, float var2, float var3, class06573 var4) {
      super(var4.y(var1, var2, var3));
   }

   private static boolean y(class06501 var0) {
      class08036 class08036 = var0.method_8036();
      return var0.method_20287().equals(class07050.field_5808) && class08036.method_6079().L(class02484.H) && !class08036.method_21823();
   }

   @Override
   public class07082 N(class06501 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class07299 class07299 = var1.method_8045();
         class07209 class07209 = var1.method_8037();
         class08036 class08036 = var1.method_8036();
         if (this.L(var1)) {
            return class07082.i;
         } else {
            Optional<class00500> optional = this.N(class07299, class07209, class08036, class07299.method_8320(class07209));
            if (optional.isEmpty()) {
               return class07082.i;
            } else {
               class06584 class06584 = var1.method_8041();
               if (class08036 instanceof class04770) {
                  class06912.X.N((class04770)class08036, class07209, class06584);
               }

               class07299.method_8652(class07209, optional.get(), 11);
               class07299.N(class01194.L, class07209, class01164.N(class08036, optional.get()));
               if (class08036 != null) {
                  class06584.N(1, class08036, var1.method_20287().N());
               }

               return class07082.N;
            }
         }
      }
   }

   private void N(class06501 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var2.setReturnValue(class07082.i);
      }
   }

   private static void N(class07299 var0, class07209 var1, @Nullable class08036 var2, class00500 var3, class04891 var4, int var5) {
      var0.method_8396(var2, var1, var4, class04911.field_15245, 1.0F, 1.0F);
      var0.method_8444(var2, var5, var1, 0);
      if (var3.i() instanceof class00860 && var3.L(class00860.i) != class06638.field_12569) {
         class07209 class07209 = class00860.y(var1, var3);
         var0.N(class01194.L, class07209, class01164.N(var2, var0.method_8320(class07209)));
         var0.method_8444(var2, var5, class07209, 0);
      }
   }

   private Optional<class00500> N(class00500 var1) {
      Optional optional = Optional.ofNullable(N.get(var1.i()));
      Function function = var1x -> var1x.W().y(class07004.L, var1.L(class07004.L));
      return optional.map(this.N(function, var1));
   }

   private Optional<class00500> N(class07299 var1, class07209 var2, @Nullable class08036 var3, class00500 var4) {
      Optional<class00500> optional = this.N(var4);
      if (optional.isPresent()) {
         var1.method_8396(var3, var2, class04909.NV, class04911.field_15245, 1.0F, 1.0F);
         return optional;
      } else {
         Optional<class00500> optional1 = class02674.f_(var4);
         if (optional1.isPresent()) {
            N(var1, var2, var3, var4, class04909.Ne, 3005);
            return optional1;
         } else {
            Optional optional2 = Optional.ofNullable((class00891)class02859.y.get().get(var4.i())).map(var1x -> ((class00891)var1x).s(var4));
            if (optional2.isPresent()) {
               N(var1, var2, var3, var4, class04909.NH, 3004);
               return optional2;
            } else {
               return Optional.empty();
            }
         }
      }
   }

   private Function N(Function var1, class00500 var2) {
      StrippingTransformer strippingtransformer = StrippableBlockRegistryImpl.getTransformer(var2.i());
      return strippingtransformer != null ? var2x -> strippingtransformer.getStrippedBlockState(var2x, var2) : var1;
   }
}
