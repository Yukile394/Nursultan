package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Queue;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.fantastic.ParticleRenderingPhase;
import net.irisshaders.iris.fantastic.PhasedParticleEngine;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00992 implements AutoCloseable, PhasedParticleEngine {
   private final Queue<class00438> N;
   private final List<class00438> y;
   private WorldRenderingPhase L = WorldRenderingPhase.NONE;
   private ParticleRenderingPhase u = ParticleRenderingPhase.EVERYTHING;

   public class00992() {
      super();
      this.N = new ArrayDeque<>();
      this.y = new ArrayList<>();
   }

   @Override
   public void close() {
      this.N.forEach(class00438::close);
   }

   private void y(class07937 var1, CallbackInfo var2) {
      Iris.getPipelineManager().getPipeline().ifPresent(var1x -> var1x.setPhase(this.L));
   }

   private void N(RenderPass var1, CallbackInfo var2) {
      GpuBuffer gpubuffer = RenderSystem.getGlobalSettingsUniform();
      if (gpubuffer != null) {
         var1.setUniform("Globals", gpubuffer);
      }

      GpuBufferSlice gpubufferslice = RenderSystem.getShaderLights();
      if (gpubufferslice != null) {
         var1.setUniform("Lighting", gpubufferslice);
      }
   }

   public void N(class07937 var1) {
      this.N(var1, null);
      if (var1.U().isEmpty()) {
         this.y(var1, null);
      } else {
         GpuDevice gpudevice = RenderSystem.getDevice();
         class06202 class06202 = class06202.Nq();
         class08627 class08627 = class06202.NO();
         class08066 class08066x = class06202.e();
         class03063 class03063 = (class03063)class06202.B_2;
         class08066 class08066x = this.N(class03063, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_761]");
            return ((class03063)var0[0]).T();
         });

         for (class05436 class05436 : var1.U()) {
            class00438 class00438 = this.N.poll();
            if (class00438 == null) {
               class00438 = new class00438();
            }

            this.y.add(class00438);
            class00977 class00977 = this.N(class05436, class00438, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_11659$class_11947, net.minecraft.class_11977$class_12051]");
               return ((class05436)var0[0]).N((class00438)var0[1]);
            });
            if (class00977 != null) {
               RenderPass renderpass = gpudevice.createCommandEncoder()
                  .createRenderPass(() -> "Particles - Main", class08066x.u(), OptionalInt.empty(), class08066x.R(), OptionalDouble.empty());

               try {
                  this.N(renderpass);
                  class05436.N(class00977, class00438, renderpass, class08627, false);
                  if (class08066x == null) {
                     class05436.N(class00977, class00438, renderpass, class08627, true);
                  }
               } catch (Throwable throwable3) {
                  if (renderpass != null) {
                     try {
                        renderpass.close();
                     } catch (Throwable throwable1) {
                        throwable3.addSuppressed(throwable1);
                     }
                  }

                  throw throwable3;
               }

               if (renderpass != null) {
                  renderpass.close();
               }

               if (class08066x != null) {
                  renderpass = gpudevice.createCommandEncoder()
                     .createRenderPass(() -> "Particles - Transparent", class08066x.u(), OptionalInt.empty(), class08066x.R(), OptionalDouble.empty());

                  try {
                     this.N(renderpass);
                     class05436.N(class00977, class00438, renderpass, class08627, true);
                  } catch (Throwable throwable2) {
                     if (renderpass != null) {
                        try {
                           renderpass.close();
                        } catch (Throwable throwable) {
                           throwable2.addSuppressed(throwable);
                        }
                     }

                     throw throwable2;
                  }

                  if (renderpass != null) {
                     renderpass.close();
                  }
               }
            }
         }

         this.y(var1, null);
      }
   }

   public void N() {
      Iterator<class00438> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().y();
      }

      this.N.addAll(this.y);
      this.y.clear();
   }

   private void N(RenderPass var1) {
      this.N(var1, null);
      var1.setUniform("Projection", RenderSystem.getProjectionMatrixBuffer());
      var1.setUniform("Fog", RenderSystem.getShaderFog());
      var1.bindTexture("Sampler2", ((class03386)class06202.Nq().i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
   }

   private void N(class07937 var1, CallbackInfo var2) {
      Iris.getPipelineManager().getPipeline().ifPresent(var1x -> {
         this.L = var1x.getPhase();
         var1x.setPhase(WorldRenderingPhase.PARTICLES);
      });
   }

   private class08066 N(class03063 var1, Operation var2) {
      return this.u == ParticleRenderingPhase.OPAQUE ? null : (class08066)var2.call(new Object[]{var1});
   }

   private class00977 N(class05436 var1, class00438 var2, Operation var3) {
      class06202 class06202 = class06202.Nq();
      class08627 class08627 = class06202.NO();
      class08066 class08066x = class06202.e();
      class08066 class08066x = this.u == ParticleRenderingPhase.OPAQUE ? null : ((class03063)class06202.B_2).T();
      GpuDevice gpudevice = RenderSystem.getDevice();
      class00977 class00977 = (class00977)var3.call(new Object[]{var1, var2});
      if (class00977 != null) {
         RenderPass renderpass = gpudevice.createCommandEncoder()
            .createRenderPass(() -> "Particles - Main", class08066x.u(), OptionalInt.empty(), class08066x.R(), OptionalDouble.empty());

         try {
            this.N(renderpass);
            if (this.u == ParticleRenderingPhase.EVERYTHING || this.u == ParticleRenderingPhase.OPAQUE) {
               var1.N(class00977, var2, renderpass, class08627, false);
            }

            if (class08066x == null && (this.u == ParticleRenderingPhase.EVERYTHING || this.u == ParticleRenderingPhase.TRANSLUCENT)) {
               var1.N(class00977, var2, renderpass, class08627, true);
            }
         } catch (Throwable throwable3) {
            if (renderpass != null) {
               try {
                  renderpass.close();
               } catch (Throwable throwable1) {
                  throwable3.addSuppressed(throwable1);
               }
            }

            throw throwable3;
         }

         if (renderpass != null) {
            renderpass.close();
         }

         if (class08066x != null && (this.u == ParticleRenderingPhase.EVERYTHING || this.u == ParticleRenderingPhase.TRANSLUCENT)) {
            renderpass = gpudevice.createCommandEncoder()
               .createRenderPass(() -> "Particles - Transparent", class08066x.u(), OptionalInt.empty(), class08066x.R(), OptionalDouble.empty());

            try {
               this.N(renderpass);
               var1.N(class00977, var2, renderpass, class08627, true);
            } catch (Throwable throwable2) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable) {
                     throwable2.addSuppressed(throwable);
                  }
               }

               throw throwable2;
            }

            if (renderpass != null) {
               renderpass.close();
            }
         }
      }

      return null;
   }

   public void setParticleRenderingPhase(ParticleRenderingPhase var1) {
      this.u = var1;
   }
}
