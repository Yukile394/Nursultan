package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor;

@Environment(EnvType.CLIENT)
class class02892 implements ClientRegistriesDynamicRegistriesAccessor {
   final Map<class05946<? extends class00751<?>>, List<class02017>> N = new HashMap<>();

   class02892() {
      super();
   }

   public void N(class05946<? extends class00751<?>> var1, List<class02017> var2) {
      this.N.computeIfAbsent(var1, var0 -> new ArrayList<>()).addAll(var2);
   }
}
