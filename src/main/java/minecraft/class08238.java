package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;

public class class08238 implements AutoCloseable {
   private static final int y = -1;
   public static final class08238 N = new class08238(-1, class01894.y("invalid"), ShaderType.VERTEX);
   private final class01894 L;
   private int u;
   private final ShaderType i;

   public String L() {
      return this.i.idConverter().N(this.L).toString();
   }

   public class08238(int var1, class01894 var2, ShaderType var3) {
      super();
      this.L = var2;
      this.u = var1;
      this.i = var3;
   }

   @Override
   public void close() {
      if (this.u == -1) {
         throw new IllegalStateException("Already closed");
      } else {
         RenderSystem.assertOnRenderThread();
         GlStateManager.glDeleteShader(this.u);
         this.u = -1;
      }
   }

   public int y() {
      return this.u;
   }

   public class01894 N() {
      return this.L;
   }
}
