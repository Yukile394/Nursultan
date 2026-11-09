package minecraft;

import net.caffeinemc.mods.sodium.client.render.frapi.render.ItemRenderContext;
import net.caffeinemc.mods.sodium.client.render.frapi.render.MeshItemCommand;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08144 {
   private final class01421 N;
   private final ItemRenderContext y = new ItemRenderContext();

   public class08144() {
      super();
      this.N = new class01421();
   }

   private void y(class07937 var1, class01422 var2, class01434 var3, CallbackInfo var4) {
      for (MeshItemCommand meshitemcommand : var1.sodium_getMeshItemCommands()) {
         this.N.N();
         this.N.L().N(meshitemcommand.positionMatrix());
         this.y
            .renderItem(
               meshitemcommand.displayContext(),
               this.N,
               var2,
               meshitemcommand.lightCoords(),
               meshitemcommand.overlayCoords(),
               meshitemcommand.tintLayers(),
               meshitemcommand.quads(),
               meshitemcommand.mesh(),
               meshitemcommand.renderType(),
               meshitemcommand.glintType(),
               meshitemcommand.renderTypeGetter(),
               false
            );
         if (meshitemcommand.outlineColor() != 0) {
            var3.N(meshitemcommand.outlineColor());
            this.y
               .renderItem(
                  meshitemcommand.displayContext(),
                  this.N,
                  var3,
                  meshitemcommand.lightCoords(),
                  meshitemcommand.overlayCoords(),
                  meshitemcommand.tintLayers(),
                  meshitemcommand.quads(),
                  meshitemcommand.mesh(),
                  meshitemcommand.renderType(),
                  class08915.field_55341,
                  meshitemcommand.renderTypeGetter(),
                  true
               );
         }

         this.N.y();
      }
   }

   public void N(class07937 var1, class01422 var2, class01434 var3) {
      for (class08109 class08109 : var1.z()) {
         class01421 class01421 = this.N;
         this.N(var1, var2, var3, null, class08109);
         class01421.N();
         this.N.L().N(class08109.N());
         class02862.N(class08109.y(), this.N, var2, class08109.L(), class08109.u(), class08109.R(), class08109.M(), class08109.B(), class08109.Z());
         if (class08109.i() != 0) {
            var3.N(class08109.i());
            class02862.N(class08109.y(), this.N, var3, class08109.L(), class08109.u(), class08109.R(), class08109.M(), class08109.B(), class08915.field_55341);
         }

         this.N.y();
      }

      this.N(var1, var2, var3, null);
      this.y(var1, var2, var3, null);
   }

   private void N(class07937 var1, class01422 var2, class01434 var3, CallbackInfo var4) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
   }

   private void N(class07937 var1, class01422 var2, class01434 var3, CallbackInfo var4, class08109 var5) {
      var5.iris$set();
   }
}
