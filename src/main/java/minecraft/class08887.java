package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.caffeinemc.mods.sodium.client.render.helper.ListStorage;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext.BlockEmitter;
import net.caffeinemc.mods.sodium.client.services.PlatformModelAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockStateModel;
import net.fabricmc.fabric.mixin.renderer.client.block.model.BlockStateModelMixin;

@Environment(EnvType.CLIENT)
public interface class08887 extends FabricBlockStateModel, BlockStateModelMixin {
   default void emitQuads(QuadEmitter var1, class07295 var2, class07209 var3, class00500 var4, class06069 var5, Predicate var6) {
      List<class08877> list = PlatformModelAccess.getInstance()
         .collectPartsOf(this, var2, var3, var4, var5, var1 instanceof ListStorage liststorage ? liststorage : null);
      int j = list.size();
      if (var1 instanceof BlockEmitter blockemitter) {
         class08743 class08743 = class05885.N(var4);

         for (int i = 0; i < j; i++) {
            if (PlatformModelAccess.getInstance().getPartRenderType(list.get(i), var4, class08743) != class08743) {
               blockemitter.markInvalidToDowngrade();
               break;
            }
         }
      }

      for (int k = 0; k < j; k++) {
         list.get(k).emitQuads(var1, var6);
      }
   }

   void method_68513(class06069 var1, List<class08877> var2);

   default List<class08877> method_68512(class06069 var1) {
      ObjectArrayList objectarraylist = new ObjectArrayList();
      this.method_68513(var1, objectarraylist);
      return objectarraylist;
   }

   class08388 method_68511();
}
