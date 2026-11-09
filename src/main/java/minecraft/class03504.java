package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.irisshaders.iris.layer.BlockEntityRenderStateShard;
import net.irisshaders.iris.layer.OuterWrappedRenderType;
import net.irisshaders.iris.vertices.ImmediateState;

public record class03504(class07311 normal, class07311 seeThrough, class07311 polygonOffset, RenderPipeline guiPipeline) {
   public class07311 L() {
      return this.polygonOffset;
   }

   public class03504(class07311 normal, class07311 seeThrough, class07311 polygonOffset, RenderPipeline guiPipeline) {
      this.normal = normal;
      this.seeThrough = seeThrough;
      this.polygonOffset = polygonOffset;
      this.guiPipeline = guiPipeline;
   }

   public RenderPipeline u() {
      return this.guiPipeline;
   }

   private class07311 y(class01583 var1) {
      return switch (var1) {
         case field_33993 -> this.normal;
         case field_33994 -> this.seeThrough;
         case field_33995 -> this.polygonOffset;
      };
   }

   public class07311 y() {
      return this.seeThrough;
   }

   public static class03504 y(class01894 var0) {
      return new class03504(class06851.n(var0), class06851.d(var0), class06851.G(var0), class08394.NM);
   }

   private class07311 N(class01583 var1, Operation var2) {
      Object object = (class07311)var2.call(new Object[]{var1});
      if (ImmediateState.isRenderingBEs) {
         object = OuterWrappedRenderType.wrapExactlyOnce("iris:block_entity", (class07311)object, BlockEntityRenderStateShard.INSTANCE);
      }

      return (class07311)object;
   }

   public class07311 N() {
      return this.normal;
   }

   public class07311 N(class01583 var1) {
      return this.N(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[net.minecraft.class_327$class_6415]");
         return this.y((class01583)var1x[0]);
      });
   }

   public static class03504 N(class01894 var0) {
      return new class03504(class06851.t(var0), class06851.w(var0), class06851.l(var0), class08394.Nz);
   }
}
