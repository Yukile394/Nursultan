package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredient;
import net.fabricmc.fabric.api.recipe.v1.ingredient.CustomIngredientSerializer;
import net.fabricmc.fabric.api.recipe.v1.ingredient.FabricIngredient;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientImpl;
import net.fabricmc.fabric.impl.recipe.ingredient.CustomIngredientPacketCodec;
import net.fabricmc.fabric.impl.recipe.ingredient.OptionalCustomIngredientPacketCodec;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06510 implements class08022<class03556<class06581>>, Predicate<class06584>, FabricIngredient {
   public static final class02362<class04247, class06510> field_48355 = class02389.L(class04227.F).N_10(class06510::new, var0 -> var0.field_9019);
   public static final class02362<class04247, Optional<class06510>> field_52595 = class02389.L(class04227.F)
      .N_10(var0 -> var0.y() == 0 ? Optional.empty() : Optional.of(new class06510((class03543<class06581>)var0)), var0 -> var0.<class03543>map(var0x -> {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         m_handler$zlj000$fabric_recipe_api_v1$onGetEntries_62(var0x, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? (class03543)callbackinforeturnable.getReturnValue() : var0x.field_9019;
      }).orElse(class03543.N()));
   public static final Codec<class03543<class06581>> field_52596 = class03521.N(class04227.F, class06581.u, false);
   public static Codec<class06510> field_46095 = class06338.L(field_52596).xmap(class06510::new, var0 -> var0.field_9019);
   private final class03543<class06581> field_9019;

   public class06510(class03543<class06581> var1) {
      super();
      var1.u().ifRight(var0 -> {
         if (var0.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if (var0.contains(class06570.N.i())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.field_9019 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.m_handler$zlj000$fabric_recipe_api_v1$onHeadEquals_63(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         return var1 instanceof class06510 class06510 ? Objects.equals(this.field_9019, class06510.field_9019) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.field_9019.hashCode();
   }

   private static class02362 m_modifyExpressionValue$zlj000$fabric_recipe_api_v1$useCustomIngredientPacketCodec_58(class02362 var0) {
      return new CustomIngredientPacketCodec(var0);
   }

   public class00299 method_64673() {
      return (class00299)this.field_9019.u().map(class00304::new, var0 -> new class00283(var0.stream().map(class06510::method_64981).toList()));
   }

   public static boolean method_61676(Optional<class06510> var0, class06584 var1) {
      return var0.<Boolean>map(var1x -> var1x.method_8093(var1)).orElseGet(var1::R);
   }

   @Deprecated
   public Stream<class03556<class06581>> method_8105() {
      return this.field_9019.N();
   }

   public boolean method_8093(class06584 var1) {
      return var1.N(this.field_9019);
   }

   public boolean method_65798(class03556<class06581> var1) {
      return this.field_9019.N(var1);
   }

   public boolean method_65799() {
      return this.field_9019.y() == 0;
   }

   public static class06510 method_8106(class03543<class06581> var0) {
      return new class06510(var0);
   }

   public static class00299 method_64980(Optional<class06510> var0) {
      return var0.map(class06510::method_64673).orElse(class00307.L);
   }

   public static class06510 method_8091(class07310... var0) {
      return method_26964(Arrays.stream(var0));
   }

   public static class00299 method_64981(class03556<class06581> var0) {
      class00330 class00330 = new class00330((class03556<class06581>)var0);
      class06584 class06584 = var0.N().Z();
      if (!class06584.R()) {
         class00302 class00302 = new class00302(class06584);
         return new class00324(class00330, class00302);
      } else {
         return class00330;
      }
   }

   public static class06510 method_26964(Stream<? extends class07310> var0) {
      return new class06510(class03543.N(var0.map(var0x -> var0x.B().i()).toList()));
   }

   public static class06510 method_8101(class07310 var0) {
      return new class06510(class03543.N(var0.B().i()));
   }

   private static void m_handler$zlj000$fabric_recipe_api_v1$onGetEntries_62(class06510 var0, CallbackInfoReturnable var1) {
      if (var0 instanceof CustomIngredientImpl customingredientimpl) {
         var1.setReturnValue(class03543.N(customingredientimpl.getCustomMatchingItems()));
      }
   }

   private void m_handler$zlj000$fabric_recipe_api_v1$onHeadEquals_63(Object var1, CallbackInfoReturnable var2) {
      if (var1 instanceof CustomIngredientImpl) {
         var2.setReturnValue(false);
      }
   }

   private static void m_handler$zlj000$fabric_recipe_api_v1$injectCodec_64(CallbackInfo var0) {
      field_46095 = Codec.either(
            CustomIngredientImpl.CODEC.dispatch("fabric:type", CustomIngredient::getSerializer, CustomIngredientSerializer::getCodec), field_46095
         )
         .xmap(var0x -> (class06510)var0x.map(CustomIngredient::toVanilla, var0xx -> var0xx), var0x -> {
            CustomIngredient customingredient = var0x.getCustomIngredient();
            return customingredient == null ? Either.right(var0x) : Either.left(customingredient);
         });
   }

   private static class02362 m_modifyExpressionValue$zlj000$fabric_recipe_api_v1$useOptionalCustomIngredientPacketCodec_65(class02362 var0) {
      return new OptionalCustomIngredientPacketCodec(var0);
   }
}
