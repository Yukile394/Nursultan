package minecraft;

import Nursultan.class10985;
import Nursultan.class11806;
import Nursultan.class11938;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRenderEvents.AllowCapeRender;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class02549 extends class06249<class08468, class02721> {
   private final class01188<class08468> N;
   private final class08718 y;
   private static final NamespacedId L = new NamespacedId("minecraft", "player_cape");

   public class02549(class06252<class08468, class02721> var1, class01140 var2, class08718 var3) {
      super(var1);
      this.N = new class02423(var2.N(class04802.LI));
      this.y = var3;
   }

   private void y(class01421 var1, class01237 var2, int var3, class08468 var4, float var5, float var6, CallbackInfo var7) {
      if (var4 instanceof class11806 class11806) {
         class10985 class10985 = class10985.N(class11806.dataManager().N().N());
         class11938.L().L(class10985);
         class01894 class01894 = class10985.N();
         if (class01894 != null) {
            if (var4.v) {
               var7.cancel();
            } else if (this.N(var4.H, class08719.field_54127)) {
               var7.cancel();
            } else {
               var1.N();
               if (this.N(var4.H, class08719.field_54125)) {
                  var1.N(0.0F, -0.053125F, 0.06875F);
               }

               var2.N(this.N, var4, var1, class06851.u(class01894), var3, class01384.u, var4.l, null);
               var1.y();
               var7.cancel();
            }
         }
      }
   }

   private void N(class01421 var1, class01237 var2, int var3, class08468 var4, float var5, float var6, CallbackInfo var7) {
      if (WorldRenderingSettings.INSTANCE.getItemIds() != null) {
         CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(L));
      }
   }

   private void N(CallbackInfo var1) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08468 var4, float var5, float var6, CallbackInfo var7, class08468 var8) {
      if (!((AllowCapeRender)LivingEntityFeatureRenderEvents.ALLOW_CAPE_RENDER.invoker()).allowCapeRender(var8)) {
         var7.cancel();
      }
   }

   private boolean N(class06584 var1, class08719 var2) {
      class08725 class08725 = var1.method_58694(class02484.o);
      return class08725 != null && !class08725.u().isEmpty() ? !this.y.N(class08725.u().get()).N(var2).isEmpty() : false;
   }

   public void N(class01421 var1, class01237 var2, int var3, class08468 var4, float var5, float var6) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, callbackinfo, var4);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.y(var1, var2, var3, var4, var5, var6, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            if (!var4.v && var4.NG) {
               class01631 class01631 = var4.N;
               if (class01631.y() == null) {
                  this.N(null);
               } else if (this.N(var4.H, class08719.field_54127)) {
                  this.N(null);
               } else {
                  this.N(var1, var2, var3, var4, var5, var6, null);
                  var1.N();
                  if (this.N(var4.H, class08719.field_54125)) {
                     var1.N(0.0F, -0.053125F, 0.06875F);
                  }

                  var2.N(this.N, var4, var1, class06851.u(class01631.y().y()), var3, class01384.u, var4.l, null);
                  var1.y();
                  this.N(null);
               }
            } else {
               this.N(null);
            }
         }
      }
   }
}
