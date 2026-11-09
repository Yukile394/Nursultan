package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import org.joml.Matrix4fStack;
import org.jspecify.annotations.Nullable;

public class class06833 {
   private final String u;
   @Nullable
   private final Consumer<Matrix4fStack> i;
   public static final class06833 N = new class06833("no_layering", null);
   public static final class06833 y = new class06833("view_offset_z_layering", var0 -> RenderSystem.getProjectionType().N(var0, 1.0F));
   public static final class06833 L = new class06833("view_offset_z_layering_forward", var0 -> RenderSystem.getProjectionType().N(var0, -1.0F));

   public class06833(String var1, @Nullable Consumer<Matrix4fStack> var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   @Override
   public String toString() {
      return "LayeringTransform[" + this.u + "]";
   }

   @Nullable
   public Consumer<Matrix4fStack> N() {
      return this.i;
   }
}
