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
public class class05932 implements FabricRenderState {
   public class06959 N = new class06959();
   public final List<class08800> y = new ArrayList<>();
   public final List<class00985> L = new ArrayList<>();
   public boolean u;
   @Nullable
   public class06973 i;
   public final List<class06964> R = new ArrayList<>();
   public final class06966 M = new class06966();
   public final class06969 B = new class06969();
   public final class06971 Z = new class06971();
   public long z;
   @Nullable
   private Map U;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.U == null) {
         this.U = new Reference2ObjectOpenHashMap();
      }

      this.U.put(var1, var2);
   }

   public class05932() {
      super();
   }

   private void N(CallbackInfo var1) {
      this.clearExtraData();
   }

   public void N() {
      this.y.clear();
      this.L.clear();
      this.R.clear();
      this.u = false;
      this.i = null;
      this.M.N();
      this.B.N();
      this.Z.N();
      this.z = 0L;
      this.N(null);
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.U == null ? null : this.U.get(var1);
   }

   public void clearExtraData() {
      if (this.U != null) {
         this.U.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.U == null ? var2 : this.U.getOrDefault(var1, var2);
   }
}
