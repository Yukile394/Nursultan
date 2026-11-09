package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class00985 implements FabricRenderState {
   public class07209 R = class07209.field_10980;
   public class00500 M = class00869.N.W();
   public class00404<?> B = class00404.field_55992;
   public int Z;
   @Nullable
   public class08141 z;
   @Nullable
   private Map N;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.N == null) {
         this.N = new Reference2ObjectOpenHashMap();
      }

      this.N.put(var1, var2);
   }

   public class00985() {
      super();
   }

   public static void N(class00394 var0, class00985 var1, @Nullable class08141 var2) {
      var1.R = var0.d();
      var1.M = var0.w();
      var1.B = var0.O();
      var1.Z = var0.G() != null ? class03063.N(var0.G(), var0.d()) : 15728880;
      var1.z = var2;
   }

   public void N(class07074 var1) {
      var1.N("BlockEntityRenderState", this.getClass().getCanonicalName());
      var1.N("Position", this.R);
      var1.N("Block state", this.M::toString);
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.N == null ? null : this.N.get(var1);
   }

   public void clearExtraData() {
      if (this.N != null) {
         this.N.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.N == null ? var2 : this.N.getOrDefault(var1, var2);
   }
}
