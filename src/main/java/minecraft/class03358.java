package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import org.jspecify.annotations.Nullable;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public interface class03358<T extends class00394, S extends class00985> {
   S i();

   default boolean N(T var1, class06889 var2) {
      return class06889.y(var1.d()).N((class00737)var2, (double)this.u_());
   }

   private int N(Operation var1) {
      return !ZoomUtils.canSeeDistantEntities()
         ? (Integer)var1.call(new Object[0])
         : (Integer)var1.call(new Object[0]) * (Zoom.isZooming() ? Math.max(1, class04995.L(Zoom.getZoomDivisor())) : 1);
   }

   private int N() {
      return 64;
   }

   default void N(T var1, S var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class00985.N(var1, var2, var5);
   }

   void N(S var1, class01421 var2, class01237 var3, class06959 var4);

   default int u_() {
      return this.N(var1 -> {
         WrapOperationRuntime.checkArgumentCount(var1, 0, "[]");
         return this.N();
      });
   }

   default boolean t_() {
      return false;
   }
}
