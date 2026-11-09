package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import org.jspecify.annotations.Nullable;

public record class08679(GpuTextureView texure0, GpuTextureView texure1, GpuTextureView texure2, class08188 sampler0, class08188 sampler1, class08188 sampler2) {
   private static final class08679 M = new class08679(null, null, null, null, null, null);
   private static int B;

   public static void L() {
      B = Math.round(100000.0F * (float)Math.random());
   }

   @Nullable
   public class08188 M() {
      return this.sampler0;
   }

   public class08679(
      @Nullable GpuTextureView texure0,
      @Nullable GpuTextureView texure1,
      @Nullable GpuTextureView texure2,
      @Nullable class08188 sampler0,
      @Nullable class08188 sampler1,
      @Nullable class08188 sampler2
   ) {
      super();
      this.texure0 = texure0;
      this.texure1 = texure1;
      this.texure2 = texure2;
      this.sampler0 = sampler0;
      this.sampler1 = sampler1;
      this.sampler2 = sampler2;
   }

   @Nullable
   public class08188 B() {
      return this.sampler1;
   }

   @Nullable
   public class08188 Z() {
      return this.sampler2;
   }

   @Nullable
   public GpuTextureView i() {
      return this.texure1;
   }

   @Nullable
   public GpuTextureView u() {
      return this.texure0;
   }

   public int y() {
      return class07529.l ? this.hashCode() * (B + 1) : this.hashCode();
   }

   public static class08679 y(GpuTextureView var0, class08188 var1) {
      return new class08679(var0, null, ((class03386)class06202.Nq().i_5).T().N(), var1, null, RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
   }

   public static class08679 N() {
      return M;
   }

   public static class08679 N(GpuTextureView var0, class08188 var1, GpuTextureView var2, class08188 var3) {
      return new class08679(var0, var2, null, var1, var3, null);
   }

   public static class08679 N(GpuTextureView var0, class08188 var1) {
      return new class08679(var0, null, null, var1, null, null);
   }

   @Nullable
   public GpuTextureView R() {
      return this.texure2;
   }
}
