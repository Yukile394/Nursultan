package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class06959 implements FabricRenderState {
   public class07209 N = class07209.field_10980;
   public class06889 y = new class06889(0.0, 0.0, 0.0);
   public boolean L;
   public class06889 u = new class06889(0.0, 0.0, 0.0);
   public Quaternionf i = new Quaternionf();
   @Nullable
   private Map R;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.R == null) {
         this.R = new Reference2ObjectOpenHashMap();
      }

      this.R.put(var1, var2);
   }

   public class06959() {
      super();
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.R == null ? null : this.R.get(var1);
   }

   public void clearExtraData() {
      if (this.R != null) {
         this.R.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.R == null ? var2 : this.R.getOrDefault(var1, var2);
   }
}
