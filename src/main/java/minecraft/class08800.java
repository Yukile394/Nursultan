package minecraft;

import Nursultan.class11806;
import Nursultan.class11816;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class08800 implements class11806, FabricRenderState {
   public static final int z = 0;
   public class07078<?> U;
   public double E;
   public double W;
   public double m;
   public float P;
   public float s;
   public float T;
   public float b;
   public double j;
   public boolean v;
   public boolean n;
   public boolean t;
   public int G;
   public int l;
   @Nullable
   public class06889 d;
   @Nullable
   public class00392 w;
   @Nullable
   public class06889 k;
   @Nullable
   public List<class08804> Y;
   public float Q;
   public final List<class08453> O;
   @Nullable
   private Map N;
   private final class11816 y = new class11816();

   public class11816 dataManager() {
      return this.y;
   }

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.N == null) {
         this.N = new Reference2ObjectOpenHashMap();
      }

      this.N.put(var1, var2);
   }

   public class08800() {
      super();
      this.G = 15728880;
      this.l = 0;
      this.O = new ArrayList<>();
   }

   public boolean y() {
      return this.l != 0;
   }

   public void N(class07074 var1) {
      var1.N("EntityRenderState", this.getClass().getCanonicalName());
      var1.N("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.E, this.W, this.m));
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
