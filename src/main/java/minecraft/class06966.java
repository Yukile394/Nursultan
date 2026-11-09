package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class06966 implements FabricRenderState {
   public final List<class02455> N = new ArrayList<>();
   public final List<class02455> y = new ArrayList<>();
   public float L;
   public int u;
   @Nullable
   private Map i;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.i == null) {
         this.i = new Reference2ObjectOpenHashMap();
      }

      this.i.put(var1, var2);
   }

   public class06966() {
      super();
   }

   private void N(CallbackInfo var1) {
      this.clearExtraData();
   }

   public void N() {
      this.N.clear();
      this.y.clear();
      this.L = 0.0F;
      this.u = 0;
      this.N(null);
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.i == null ? null : this.i.get(var1);
   }

   public void clearExtraData() {
      if (this.i != null) {
         this.i.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.i == null ? var2 : this.i.getOrDefault(var1, var2);
   }
}
