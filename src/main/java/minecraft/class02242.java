package minecraft;

import Nursultan.class10985;
import Nursultan.class11806;
import Nursultan.class11938;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02242<S extends class08467, M extends class06078<S>> extends class06249<S, M> {
   private final class04805 N;
   private final class04805 y;
   private final class08720 L;
   private static final NamespacedId u = new NamespacedId("minecraft", "elytra_with_cape");

   public class02242(class06252<S, M> var1, class01140 var2, class08720 var3) {
      super(var1);
      this.N = new class04805(var2.N(class04802.NC));
      this.y = new class04805(var2.N(class04802.NS));
      this.L = var3;
   }

   private void N(class01421 var1, class01237 var2, int var3, class08467 var4, float var5, float var6, CallbackInfo var7) {
      if (WorldRenderingSettings.INSTANCE.getItemIds() != null) {
         if (var4 instanceof class08468 class08468 && class08468.N.y() != null && class08468.NG) {
            CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(u));
         } else {
            class01894 class01894 = class04206.B.y(class06570.sT);
            CapturedRenderingState.INSTANCE
               .setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(new NamespacedId(class01894.y(), class01894.N())));
         }
      }
   }

   private static void N(class08467 var0, CallbackInfoReturnable var1) {
      if (var0 instanceof class11806) {
         class10985 class10985 = class10985.N(var0.dataManager().N().N());
         class11938.L().L(class10985);
         class01894 class01894 = class10985.N();
         if (class01894 != null) {
            var1.setReturnValue(class01894);
         }
      }
   }

   private void N(CallbackInfo var1) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      class06584 class06584 = var4.H;
      class08725 class08725 = class06584.method_58694(class02484.o);
      if (class08725 != null && !class08725.u().isEmpty()) {
         class01894 class01894 = N(var4);
         class04805 class04805 = var4.NB ? this.y : this.N;
         this.N(var1, var2, var3, var4, var5, var6, null);
         var1.N();
         var1.N(0.0F, 0.0F, 0.125F);
         this.L.N(class08719.field_54127, class08725.u().get(), class04805, var4, class06584, var1, var2, var3, class01894, var4.l, 0);
         var1.y();
         this.N(null);
      } else {
         this.N(null);
      }
   }

   @Nullable
   private static class01894 N(class08467 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class01894)callbackinforeturnable.getReturnValue();
      } else {
         if (var0 instanceof class08468 class08468) {
            class01631 class01631 = class08468.N;
            if (class01631.L() != null) {
               return class01631.L().y();
            }

            if (class01631.y() != null && class08468.NG) {
               return class01631.y().y();
            }
         }

         return null;
      }
   }
}
