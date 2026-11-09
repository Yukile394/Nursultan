package minecraft;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricErrorCollectingSpriteGetter;
import net.fabricmc.fabric.mixin.renderer.client.sprite.SpriteGetterMixin;

@Environment(EnvType.CLIENT)
public interface class02601 extends FabricErrorCollectingSpriteGetter, SpriteGetterMixin {
   class08388 N(class05913 var1, class08512 var2);

   class08388 N(String var1, class08512 var2);

   default class08388 N(class08838 var1, String var2, class08512 var3) {
      class05913 class05913 = var1.N(var2);
      return class05913 != null ? this.N(class05913, var3) : this.N(var2, var3);
   }
}
