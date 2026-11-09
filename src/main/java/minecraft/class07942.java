package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class07942 implements class07295, FabricRenderState {
   public class07209 N = class07209.field_10980;
   public class07209 y = class07209.field_10980;
   public class00500 L = class00869.N.W();
   @Nullable
   public class03556<class00780> u;
   public class07295 i = class02730.field_52611;
   @Nullable
   private Map R;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.R == null) {
         this.R = new Reference2ObjectOpenHashMap();
      }

      this.R.put(var1, var2);
   }

   @Override
   public int method_31607() {
      return this.y.method_10264();
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      return var1.equals(this.y) ? this.L : class00869.N.W();
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return this.method_8320(var1).Y();
   }

   public class07942() {
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

   public boolean hasBiomes() {
      return this.u != null;
   }

   @Override
   public float method_24852(class07211 var1, boolean var2) {
      return this.i.method_24852(var1, var2);
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      return null;
   }

   @Override
   public class05795 method_22336() {
      return this.i.method_22336();
   }

   @Override
   public int method_31605() {
      return 1;
   }

   @Override
   public int method_23752(class07209 var1, class03202 var2) {
      return this.u == null ? -1 : var2.getColor(this.u.N(), var1.method_10263(), var1.method_10260());
   }

   public class03556 getBiomeFabric(class07209 var1) {
      return this.u;
   }
}
