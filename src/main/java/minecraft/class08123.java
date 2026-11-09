package minecraft;

import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;
import net.fabricmc.fabric.impl.renderer.DelegatingBlockVertexConsumerProviderImpl;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockStateModelCommand;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08123 {
   private final class01421 N = new class01421();

   public class08123() {
      super();
   }

   private void N(class07937 var1, class01422 var2, class01999 var3, class01434 var4, CallbackInfo var5) {
      DelegatingBlockVertexConsumerProviderImpl delegatingblockvertexconsumerproviderimpl = new DelegatingBlockVertexConsumerProviderImpl();

      for (ExtendedBlockCommand extendedblockcommand : var1.fabric_getExtendedBlockCommands()) {
         this.N.N();
         this.N.L().N(extendedblockcommand.matricesEntry());
         var3.renderBlockAsEntity(
            extendedblockcommand.state(),
            this.N,
            var2,
            extendedblockcommand.lightCoords(),
            extendedblockcommand.overlayCoords(),
            extendedblockcommand.blockView(),
            extendedblockcommand.pos()
         );
         if (extendedblockcommand.outlineColor() != 0) {
            var4.N(extendedblockcommand.outlineColor());
            var3.renderBlockAsEntity(
               extendedblockcommand.state(),
               this.N,
               var4,
               extendedblockcommand.lightCoords(),
               extendedblockcommand.overlayCoords(),
               extendedblockcommand.blockView(),
               extendedblockcommand.pos()
            );
         }

         this.N.y();
      }

      for (ExtendedBlockStateModelCommand extendedblockstatemodelcommand : var1.fabric_getExtendedBlockStateModelCommands()) {
         delegatingblockvertexconsumerproviderimpl.renderLayerFunction = extendedblockstatemodelcommand.renderLayerFunction();
         delegatingblockvertexconsumerproviderimpl.vertexConsumerProvider = var2;
         FabricBlockModelRenderer.render(
            extendedblockstatemodelcommand.matricesEntry(),
            delegatingblockvertexconsumerproviderimpl,
            extendedblockstatemodelcommand.model(),
            extendedblockstatemodelcommand.r(),
            extendedblockstatemodelcommand.g(),
            extendedblockstatemodelcommand.b(),
            extendedblockstatemodelcommand.lightCoords(),
            extendedblockstatemodelcommand.overlayCoords(),
            extendedblockstatemodelcommand.blockView(),
            extendedblockstatemodelcommand.pos(),
            extendedblockstatemodelcommand.state()
         );
         if (extendedblockstatemodelcommand.outlineColor() != 0) {
            var4.N(extendedblockstatemodelcommand.outlineColor());
            delegatingblockvertexconsumerproviderimpl.vertexConsumerProvider = var4;
            FabricBlockModelRenderer.render(
               extendedblockstatemodelcommand.matricesEntry(),
               delegatingblockvertexconsumerproviderimpl,
               extendedblockstatemodelcommand.model(),
               extendedblockstatemodelcommand.r(),
               extendedblockstatemodelcommand.g(),
               extendedblockstatemodelcommand.b(),
               extendedblockstatemodelcommand.lightCoords(),
               extendedblockstatemodelcommand.overlayCoords(),
               extendedblockstatemodelcommand.blockView(),
               extendedblockstatemodelcommand.pos(),
               extendedblockstatemodelcommand.state()
            );
         }
      }
   }

   private void N(class07937 var1, class01422 var2, class01999 var3, class01434 var4, CallbackInfo var5, Iterator var6) {
      while (var6.hasNext()) {
         class08121 class08121 = (class08121)var6.next();
         class07942 class07942 = class08121.y();
         class00500 class00500 = class07942.L;
         class08887 class08887 = var3.N(class00500);
         long i = class00500.y(class07942.N);
         this.N.N();
         this.N.N(class08121.N());
         var3.y().render(class07942, class08887, class00500, class07942.y, this.N, RenderLayerHelper.movingDelegate(var2), false, i, class01384.u);
         this.N.y();
      }
   }

   public void N(class07937 var1, class01422 var2, class01999 var3, class01434 var4) {
      Iterator iterator = var1.M().iterator();

      while (true) {
         this.N(var1, var2, var3, var4, null, iterator);
         if (!iterator.hasNext()) {
            for (class01143 class01143 : var1.R()) {
               this.N.N();
               this.N.L().N(class01143.N());
               var3.N(class01143.y(), this.N, var2, class01143.L(), class01143.u());
               if (class01143.i() != 0) {
                  var4.N(class01143.i());
                  var3.N(class01143.y(), this.N, var4, class01143.L(), class01143.u());
               }

               this.N.y();
            }

            for (class06327 class06327 : var1.B()) {
               class02020.N(
                  class06327.N(),
                  var2.method_73477(class06327.y()),
                  class06327.L(),
                  class06327.u(),
                  class06327.i(),
                  class06327.R(),
                  class06327.M(),
                  class06327.B()
               );
               if (class06327.Z() != 0) {
                  var4.N(class06327.Z());
                  class02020.N(
                     class06327.N(),
                     var4.method_73477(class06327.y()),
                     class06327.L(),
                     class06327.u(),
                     class06327.i(),
                     class06327.R(),
                     class06327.M(),
                     class06327.B()
                  );
               }
            }

            this.N(var1, var2, var3, var4, null);
            return;
         }

         class08121 class08121 = (class08121)iterator.next();
         class07942 class07942 = class08121.y();
         class00500 class00500 = class07942.L;
         List<class08877> list = var3.N(class00500).method_68512(class06069.y(class00500.y(class07942.N)));
         class01421 class01421 = new class01421();
         class01421.N(class08121.N());
         var3.y().N(class07942, list, class00500, class07942.y, class01421, var2.method_73477(class05885.y(class00500)), false, class01384.u);
      }
   }
}
