package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.blockview.client.RenderDataMapConsumer;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class03498 implements class07295, RenderDataMapConsumer {
   public static final int N = 1;
   public static final int y = 3;
   private final int L;
   private final int u;
   private final int i;
   private final class03150[] R;
   private final class07299 M;
   @Nullable
   private Long2ObjectMap B;

   @Override
   public int method_31607() {
      return this.M.method_31607();
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      return this.N(class01296.N(var1.method_10263()), class01296.N(var1.method_10264()), class01296.N(var1.method_10260())).y(var1);
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return this.N(class01296.N(var1.method_10263()), class01296.N(var1.method_10264()), class01296.N(var1.method_10260())).y(var1).Y();
   }

   class03498(class07299 var1, int var2, int var3, int var4, class03150[] var5) {
      super();
      this.M = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
   }

   private class03150 N(int var1, int var2, int var3) {
      return this.R[N(this.L, this.u, this.i, var1, var2, var3)];
   }

   public static int N(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var3 - var0 + (var4 - var1) * 3 + (var5 - var2) * 3 * 3;
   }

   public Object getBlockEntityRenderData(class07209 var1) {
      return this.B == null ? null : this.B.get(var1.method_10063());
   }

   public boolean hasBiomes() {
      return true;
   }

   @Override
   public float method_24852(class07211 var1, boolean var2) {
      return this.M.method_24852(var1, var2);
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      return this.N(class01296.N(var1.method_10263()), class01296.N(var1.method_10264()), class01296.N(var1.method_10260())).N(var1);
   }

   @Override
   public class05795 method_22336() {
      return this.M.method_22336();
   }

   @Override
   public int method_31605() {
      return this.M.method_31605();
   }

   @Override
   public int method_23752(class07209 var1, class03202 var2) {
      return this.M.method_23752(var1, var2);
   }

   public class03556 getBiomeFabric(class07209 var1) {
      return this.M.i(var1);
   }

   public void fabric_acceptRenderDataMap(Long2ObjectMap var1) {
      this.B = var1;
   }
}
