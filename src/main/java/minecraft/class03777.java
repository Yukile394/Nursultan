package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.function.UnaryOperator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class class03777 extends class03780 {
   public static final float N = 4.5F;
   private static final Vector3f y = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int i = 16;
   private static final int R = 16;
   private final class01894 M;

   public class03777(class07267 var1, boolean var2, boolean var3) {
      super(var1, var2, var3, class00392.L("hanging_sign.edit"));
      String s = "textures/gui/hanging_signs/" + this.u.y() + ".png";
      this.M = this.N(s, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.lang.String]");
         return class01894.y((String)var0[0]);
      });
   }

   @Override
   protected Vector3f y() {
      return y;
   }

   private class01894 N(String var1, Operation var2) {
      return this.u.y().indexOf(58) != -1
         ? class01894.N(this.u.y()).N((UnaryOperator<String>)(var0 -> "textures/gui/hanging_signs/" + var0 + ".png"))
         : (class01894)var2.call(new Object[]{var1});
   }

   @Override
   protected float N() {
      return 125.0F;
   }

   @Override
   protected void N(class01054 var1) {
      var1.i().translate(0.0F, -13.0F);
      var1.i().scale(4.5F, 4.5F);
      var1.N(class08394.Na, this.M, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }
}
