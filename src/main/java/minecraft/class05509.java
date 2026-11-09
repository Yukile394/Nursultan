package minecraft;

import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.injection.access.networking.packet_handling.IGameTestBlockHighlightRenderer;
import java.util.Map;
import java.util.Map.Entry;

public class class05509 implements IGameTestBlockHighlightRenderer {
   private static final int N = 10000;
   private static final float y = 0.02F;
   private final Map<class07209, class05535> L = Maps.newHashMap();

   public class05509() {
      super();
   }

   public void y() {
      long i = class07536.L();
      this.L.entrySet().removeIf(var2 -> i > var2.getValue().L());
      this.L.forEach((var1x, var2) -> this.N(var1x, var2));
   }

   private void N(class07209 var1, class05535 var2) {
      class06724.N(var1, 0.02F, class06747.y(var2.N()));
      if (!var2.y().isEmpty()) {
         class06724.N(var2.y(), class06889.N(var1, 0.5, 1.2, 0.5), class06715.N().N(0.16F)).N();
      }
   }

   public void N() {
      this.L.clear();
   }

   public void N(class07209 var1, class07209 var2) {
      String s = var2.method_23854();
      this.L.put(var1, new class05535(1610678016, s, class07536.L() + 10000L));
   }

   public void viaFabricPlus$addMarker(class07209 var1, int var2, String var3, int var4) {
      this.L.put(var1, new class05535(var2, var3, class07536.L() + var4));
   }
}
