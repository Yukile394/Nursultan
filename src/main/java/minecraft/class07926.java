package minecraft;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricRenderCommandQueue;
import net.fabricmc.fabric.mixin.renderer.client.block.render.OrderedSubmitNodeCollectorMixin;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public interface class07926 extends FabricRenderCommandQueue, OrderedSubmitNodeCollectorMixin {
   void N(class01421 var1, class07942 var2);

   void N(class01421 var1, class00500 var2, int var3, int var4, int var5);

   void N(
      class01686 var1,
      class01421 var2,
      class07311 var3,
      int var4,
      int var5,
      @Nullable class08388 var6,
      boolean var7,
      boolean var8,
      int var9,
      @Nullable class08141 var10,
      int var11
   );

   default void N(class01686 var1, class01421 var2, class07311 var3, int var4, int var5, @Nullable class08388 var6, boolean var7, boolean var8) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, -1, null, 0);
   }

   default void N(class01686 var1, class01421 var2, class07311 var3, int var4, int var5, @Nullable class08388 var6, int var7, @Nullable class08141 var8) {
      this.N(var1, var2, var3, var4, var5, var6, false, false, var7, var8, 0);
   }

   void N(class05436 var1);

   void N(class01421 var1, class07311 var2, class00999 var3);

   void N(class01421 var1, class03662 var2, int var3, int var4, int var5, int[] var6, List<class02022> var7, class07311 var8, class08915 var9);

   void N(class01421 var1, class07311 var2, class08887 var3, float var4, float var5, float var6, int var7, int var8, int var9);

   void N(class01421 var1, class08800 var2, Quaternionf var3);

   void N(class01421 var1, float var2, float var3, class01028 var4, boolean var5, class01583 var6, int var7, int var8, int var9, int var10);

   void N(class01421 var1, @Nullable class06889 var2, int var3, class00392 var4, boolean var5, int var6, double var7, class06959 var9);

   void N(class01421 var1, float var2, List<class08453> var3);

   default void N(class01686 var1, class01421 var2, class07311 var3, int var4, int var5, @Nullable class08388 var6) {
      this.N(var1, var2, var3, var4, var5, var6, false, false, -1, null, 0);
   }

   default <S> void N(class06271<? super S> var1, S var2, class01421 var3, class07311 var4, int var5, int var6, int var7, @Nullable class08141 var8) {
      this.N(var1, var2, var3, var4, var5, var6, -1, null, var7, var8);
   }

   <S> void N(
      class06271<? super S> var1,
      S var2,
      class01421 var3,
      class07311 var4,
      int var5,
      int var6,
      int var7,
      @Nullable class08388 var8,
      int var9,
      @Nullable class08141 var10
   );

   void N(class01421 var1, class08804 var2);
}
