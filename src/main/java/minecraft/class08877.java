package minecraft;

import java.util.List;
import java.util.function.Predicate;
import net.caffeinemc.mods.sodium.client.render.frapi.SodiumRenderer;
import net.caffeinemc.mods.sodium.client.render.frapi.wrapper.MutableQuadViewWrapper;
import net.caffeinemc.mods.sodium.client.render.model.MutableQuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext.BlockEmitter;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModelPart;
import net.fabricmc.fabric.mixin.renderer.client.block.model.BlockModelPartMixin;
import net.irisshaders.iris.compat.general.IrisModelPart;
import net.irisshaders.iris.mixin.MixinBlockModelPart;
import net.irisshaders.iris.mixin.MixinBlockState;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public interface class08877 extends FabricBlockModelPart, BlockModelPartMixin, IrisModelPart, MixinBlockModelPart, MixinBlockState {
   class08388 L();

   boolean y();

   List<class02022> N(@Nullable class07211 var1);

   default void emitQuads(QuadEmitter var1, Predicate var2) {
      if (var1 instanceof MutableQuadViewWrapper) {
         MutableQuadViewImpl mutablequadviewimpl = ((MutableQuadViewWrapper)var1).getOriginal();
         if (mutablequadviewimpl instanceof BlockEmitter) {
            ((BlockEmitter)mutablequadviewimpl).emitPart(this, var2, SodiumRenderer.BUFFERER);
            return;
         }
      }

      super.emitQuads(var1, var2);
   }
}
