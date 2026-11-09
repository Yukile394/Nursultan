package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class06969 implements FabricRenderState {
   public double N;
   public double y;
   public double L;
   public double u;
   public int i;
   public double R;
   @Nullable
   private Map M;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.M == null) {
         this.M = new Reference2ObjectOpenHashMap();
      }

      this.M.put(var1, var2);
   }

   public class06969() {
      super();
   }

   private void N(CallbackInfo var1) {
      this.clearExtraData();
   }

   public List<class06982> N(double var1, double var3) {
      return Arrays.stream(
            new class06982[]{
               new class06982(class07211.field_11043, var3 - this.L),
               new class06982(class07211.field_11035, this.u - var3),
               new class06982(class07211.field_11039, var1 - this.N),
               new class06982(class07211.field_11034, this.y - var1)
            }
         )
         .sorted(Comparator.comparingDouble(var0 -> var0.y()))
         .toList();
   }

   public void N() {
      this.R = 0.0;
      this.N(null);
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.M == null ? null : this.M.get(var1);
   }

   public void clearExtraData() {
      if (this.M != null) {
         this.M.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.M == null ? var2 : this.M.getOrDefault(var1, var2);
   }
}
