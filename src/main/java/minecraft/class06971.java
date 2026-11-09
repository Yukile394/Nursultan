package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class06971 implements FabricRenderState {
   public class07360 N = class07360.field_64385;
   public boolean y;
   public float L;
   public float u;
   public float i;
   public float R;
   public float M;
   public int B;
   public class08165 Z = class08165.field_63425;
   public int z;
   public float U;
   public float E;
   public float W;
   @Nullable
   private Map m;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.m == null) {
         this.m = new Reference2ObjectOpenHashMap();
      }

      this.m.put(var1, var2);
   }

   public class06971() {
      super();
   }

   private void N(CallbackInfo var1) {
      this.clearExtraData();
   }

   public void N() {
      this.N = class07360.field_64385;
      this.N(null);
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.m == null ? null : this.m.get(var1);
   }

   public void clearExtraData() {
      if (this.m != null) {
         this.m.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.m == null ? var2 : this.m.getOrDefault(var1, var2);
   }
}
