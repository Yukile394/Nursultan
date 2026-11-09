package minecraft;

import Nursultan.class10944;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class08270 implements FabricRenderState {
   @Nullable
   public class01894 N;
   public final List<class10944> y = new ArrayList<>();
   @Nullable
   private Map L;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.L == null) {
         this.L = new Reference2ObjectOpenHashMap();
      }

      this.L.put(var1, var2);
   }

   public class08270() {
      super();
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.L == null ? null : this.L.get(var1);
   }

   public void clearExtraData() {
      if (this.L != null) {
         this.L.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.L == null ? var2 : this.L.getOrDefault(var1, var2);
   }
}
