package minecraft;

import Nursultan.class11898;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.UniformDescription;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderPass.RenderObject;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import net.caffeinemc.mods.sodium.mixin.core.GlCommandEncoderAccessor;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ExtendedShader;
import net.irisshaders.iris.pipeline.programs.IrisProgram;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL11C;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.opengl.GL33C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08495 implements CommandEncoder, GlCommandEncoderAccessor {
   private static Logger N = LoggerFactory.getLogger("minecraft.class08495");
   private final class08879 y;
   private final int L;
   private final int u;
   @Nullable
   private RenderPipeline i;
   private boolean R;
   @Nullable
   private class02255 M;
   @Nullable
   private class00613 B;
   private int Z;
   private List z = new ArrayList();
   private static class08858 U;

   private boolean L(class08495 var1) {
      return ImmediateState.temporarilyIgnorePass ? false : this.R;
   }

   public class08495(class08879 var1) {
      super();
      this.y = var1;
      this.L = var1.y().y();
      this.u = var1.y().y();
   }

   protected class08879 y() {
      return this.y;
   }

   private boolean y(class08495 var1) {
      return ImmediateState.temporarilyIgnorePass ? false : this.R;
   }

   private void y(int var1, int var2) {
      if (!ImmediateState.safeToMultiply) {
         GlStateManager._glBindFramebuffer(var1, var2);
      }
   }

   private void y(GpuTexture var1) {
      if (!var1.getFormat().hasDepthAspect()) {
         throw new IllegalStateException("Trying to clear a non-depth texture as depth");
      } else if (var1.isClosed()) {
         throw new IllegalStateException("Depth texture is closed");
      } else if ((var1.usage() & 8) == 0) {
         throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
      } else if (var1.getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
      }
   }

   private void y(class08858 var1, Collection var2, CallbackInfoReturnable var3) {
      if (var1.L.y() instanceof IrisProgram irisprogram && !irisprogram.iris$isSetUp()) {
         class08849 class08849 = var1.B.get("Sampler0");
         if (class08849 != null) {
            WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
            if (worldrenderingpipeline instanceof IrisRenderingPipeline) {
               ((IrisRenderingPipeline)worldrenderingpipeline).onSetAlbedoTex(class08849.N());
            }
         }

         irisprogram.iris$setupState(class08849 == null ? null : class08849.N());
         this.z.add(irisprogram);
      }
   }

   public void N() {
      this.N(null);
      this.R = false;
      byte b0 = 0;
      char c0 = '赀';
      this.y(c0, b0);
      this.y.N().N();
   }

   protected <T> void N(class08858 var1, Collection<RenderObject<T>> var2, @Nullable GpuBuffer var3, @Nullable IndexType var4, Collection<String> var5, T var6) {
      if (this.N(var1, var5)) {
         if (var4 == null) {
            var4 = IndexType.SHORT;
         }

         for (RenderObject renderobject : var2) {
            IndexType indextype = renderobject.indexType() == null ? var4 : renderobject.indexType();
            var1.setIndexBuffer(renderobject.indexBuffer() == null ? var3 : renderobject.indexBuffer(), indextype);
            var1.setVertexBuffer(renderobject.slot(), renderobject.vertexBuffer());
            if (class08858.y) {
               if (var1.i == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if (var1.i.isClosed()) {
                  throw new IllegalStateException("Index buffer has been closed!");
               }

               if (var1.u[0] == null) {
                  throw new IllegalStateException("Missing vertex buffer at slot 0");
               }

               if (var1.u[0].isClosed()) {
                  throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
               }
            }

            BiConsumer biconsumer = renderobject.uniformUploaderConsumer();
            if (biconsumer != null) {
               biconsumer.accept(var6, (var1x, var2x) -> {
                  if (var1.L.y().method_34582(var1x) instanceof class07332 class07332x) {
                     class07332 class07332x = class07332x;

                     try {
                        j = class07332x.N();
                     } catch (Throwable throwable) {
                        throw new MatchException(throwable.toString(), throwable);
                     }

                     int ix = j;
                     GL32.glBindBufferRange(35345, ix, ((class08523)var2x.buffer()).u, var2x.offset(), var2x.length());
                  }
               });
            }

            this.N(var1, 0, renderobject.firstIndex(), renderobject.indexCount(), indextype, var1.L, 1);
         }
      }
   }

   private boolean N(class08858 var1, Collection<String> var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         if (class08858.y) {
            if (var1.L == null) {
               throw new IllegalStateException("Can't draw without a render pipeline");
            }

            if (var1.L.y() == class02255.field_57864) {
               throw new IllegalStateException("Pipeline contains invalid shader program");
            }

            for (UniformDescription uniformdescription : var1.L.N().getUniforms()) {
               GpuBufferSlice gpubufferslice = var1.M.get(uniformdescription.name());
               if (!var2.contains(uniformdescription.name())) {
                  if (gpubufferslice == null) {
                     throw new IllegalStateException("Missing uniform " + uniformdescription.name() + " (should be " + uniformdescription.type() + ")");
                  }

                  if (uniformdescription.type() == class08419.field_60031) {
                     if (gpubufferslice.buffer().isClosed()) {
                        throw new IllegalStateException("Uniform buffer " + uniformdescription.name() + " is already closed");
                     }

                     if ((gpubufferslice.buffer().usage() & 128) == 0) {
                        throw new IllegalStateException("Uniform buffer " + uniformdescription.name() + " must have GpuBuffer.USAGE_UNIFORM");
                     }
                  }

                  if (uniformdescription.type() == class08419.field_60032) {
                     if (gpubufferslice.offset() != 0L || gpubufferslice.length() != gpubufferslice.buffer().size()) {
                        throw new IllegalStateException("Uniform texel buffers do not support a slice of a buffer, must be entire buffer");
                     }

                     if (uniformdescription.textureFormat() == null) {
                        throw new IllegalStateException("Invalid uniform texel buffer " + uniformdescription.name() + " (missing a texture format)");
                     }
                  }
               }
            }

            for (Entry entry : var1.L.y().method_68406().entrySet()) {
               if (entry.getValue() instanceof class07341) {
                  String s1 = (String)entry.getKey();
                  class08849 class08849x = var1.B.get(s1);
                  if (class08849x == null) {
                     throw new IllegalStateException("Missing sampler " + s1);
                  }

                  class09006 class09006x = class08849x.N();
                  if (class09006x.isClosed()) {
                     throw new IllegalStateException("Texture view " + s1 + " (" + class09006x.texture().getLabel() + ") has been closed!");
                  }

                  if ((class09006x.texture().usage() & 4) == 0) {
                     throw new IllegalStateException("Texture view " + s1 + " (" + class09006x.texture().getLabel() + ") must have USAGE_TEXTURE_BINDING!");
                  }

                  if (class08849x.y().B()) {
                     throw new IllegalStateException("Sampler for " + s1 + " (" + class09006x.texture().getLabel() + ") has been closed!");
                  }
               }
            }

            if (var1.L.N().wantsDepthTexture() && !var1.N()) {
               N.warn("Render pipeline {} wants a depth texture but none was provided - this is probably a bug", var1.L.N().getLocation());
            }
         } else if (var1.L == null || var1.L.y() == class02255.field_57864) {
            this.y(var1, var2, null);
            return false;
         }

         RenderPipeline renderpipeline = var1.L.N();
         class02255 class02255 = var1.L.y();
         this.N(renderpipeline);
         boolean flag1 = this.M != class02255;
         if (flag1) {
            GlStateManager._glUseProgram(class02255.method_1270());
            this.M = class02255;
         }

         for (Entry entry1 : class02255.method_68406().entrySet()) {
            String s = (String)entry1.getKey();
            boolean flag = var1.Z.contains(s);
            switch ((class07345)entry1.getValue()) {
               case class07332 class07332:
                  int i2;
                  try {
                     i2 = class07332.N();
                  } catch (Throwable throwable6) {
                     throw new MatchException(throwable6.toString(), throwable6);
                  }

                  int j = i2;
                  if (flag) {
                     GpuBufferSlice gpubufferslice1 = var1.M.get(s);
                     GL32.glBindBufferRange(35345, j, ((class08523)gpubufferslice1.buffer()).u, gpubufferslice1.offset(), gpubufferslice1.length());
                  }
                  break;
               case class07353 class07353x:
                  class07353 class07353x = class07353x;

                  try {
                     j1 = class07353x.N();
                  } catch (Throwable throwable5) {
                     throw new MatchException(throwable5.toString(), throwable5);
                  }

                  int k = j1;
                  class07353x = class07353x;

                  try {
                     k1 = class07353x.y();
                  } catch (Throwable throwable4) {
                     throw new MatchException(throwable4.toString(), throwable4);
                  }

                  k = k1;
                  class07353x = class07353x;

                  try {
                     textureformat1 = class07353x.L();
                  } catch (Throwable throwable3) {
                     throw new MatchException(throwable3.toString(), throwable3);
                  }

                  TextureFormat textureformat = textureformat1;
                  class07353x = class07353x;

                  try {
                     l1 = class07353x.u();
                  } catch (Throwable throwable2) {
                     throw new MatchException(throwable2.toString(), throwable2);
                  }

                  k = l1;
                  if (flag1 || flag) {
                     GlStateManager._glUniform1i(k, k);
                  }

                  GlStateManager._activeTexture(33984 + k);
                  GL11C.glBindTexture(35882, k);
                  if (flag) {
                     GpuBufferSlice gpubufferslice2 = var1.M.get(s);
                     GL31.glTexBuffer(35882, GlConst.toGlInternalId(textureformat), ((class08523)gpubufferslice2.buffer()).u);
                  }
                  break;
               case class07341 class07341x:
                  class07341 class07341x = class07341x;

                  try {
                     l = class07341x.N();
                  } catch (Throwable throwable1) {
                     throw new MatchException(throwable1.toString(), throwable1);
                  }

                  int ix = l;
                  class07341x = class07341x;

                  try {
                     i1 = class07341x.y();
                  } catch (Throwable throwable) {
                     throw new MatchException(throwable.toString(), throwable);
                  }

                  ix = i1;
                  class08849 class08849x = var1.B.get(s);
                  if (class08849x == null) {
                     break;
                  }

                  class09006 class09006x = class08849x.N();
                  if (flag1 || flag) {
                     GlStateManager._glUniform1i(ix, ix);
                  }

                  GlStateManager._activeTexture(33984 + ix);
                  class08893 class08893 = class09006x.texture();
                  char c0;
                  if ((class08893.usage() & 16) != 0) {
                     c0 = '蔓';
                     GL11.glBindTexture(34067, class08893.N);
                  } else {
                     c0 = 3553;
                     GlStateManager._bindTexture(class08893.N);
                  }

                  GL33C.glBindSampler(ix, class08849x.y().N());
                  GlStateManager._texParameter(c0, 33084, class09006x.baseMipLevel());
                  GlStateManager._texParameter(c0, 33085, class09006x.baseMipLevel() + class09006x.mipLevels() - 1);
                  break;
               default:
                  throw new MatchException(null, null);
            }
         }

         var1.Z.clear();
         if (var1.y()) {
            GlStateManager._enableScissorTest();
            GlStateManager._scissorBox(var1.L(), var1.u(), var1.i(), var1.R());
         } else {
            GlStateManager._disableScissorTest();
         }

         this.y(var1, var2, null);
         return true;
      }
   }

   private void N(RenderPipeline var1) {
      this.N(var1, null);
      if (this.i != var1) {
         this.i = var1;
         if (var1.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
            GlStateManager._enableDepthTest();
            GlStateManager._depthFunc(GlConst.toGl(var1.getDepthTestFunction()));
         } else {
            GlStateManager._disableDepthTest();
         }

         if (var1.isCull()) {
            GlStateManager._enableCull();
         } else {
            GlStateManager._disableCull();
         }

         if (var1.getBlendFunction().isPresent()) {
            GlStateManager._enableBlend();
            BlendFunction blendfunction = (BlendFunction)var1.getBlendFunction().get();
            GlStateManager._blendFuncSeparate(
               GlConst.toGl(blendfunction.sourceColor()),
               GlConst.toGl(blendfunction.destColor()),
               GlConst.toGl(blendfunction.sourceAlpha()),
               GlConst.toGl(blendfunction.destAlpha())
            );
         } else {
            GlStateManager._disableBlend();
         }

         GlStateManager._polygonMode(1032, GlConst.toGl(var1.getPolygonMode()));
         GlStateManager._depthMask(var1.isWriteDepth());
         GlStateManager._colorMask(var1.isWriteColor(), var1.isWriteColor(), var1.isWriteColor(), var1.isWriteAlpha());
         if (var1.getDepthBiasConstant() == 0.0F && var1.getDepthBiasScaleFactor() == 0.0F) {
            GlStateManager._disablePolygonOffset();
         } else {
            GlStateManager._polygonOffset(var1.getDepthBiasScaleFactor(), var1.getDepthBiasConstant());
            GlStateManager._enablePolygonOffset();
         }

         switch (var1.getColorLogic()) {
            case NONE:
               GlStateManager._disableColorLogicOp();
               break;
            case OR_REVERSE:
               GlStateManager._enableColorLogicOp();
               GlStateManager._logicOp(5387);
         }
      }
   }

   protected void N(class08858 var1, int var2, int var3, int var4, @Nullable IndexType var5, int var6) {
      if (this.N(var1, Collections.emptyList())) {
         if (class08858.y) {
            if (var5 != null) {
               if (var1.i == null) {
                  throw new IllegalStateException("Missing index buffer");
               }

               if (var1.i.isClosed()) {
                  throw new IllegalStateException("Index buffer has been closed!");
               }

               if ((var1.i.usage() & 64) == 0) {
                  throw new IllegalStateException("Index buffer must have GpuBuffer.USAGE_INDEX!");
               }
            }

            class08870 class08870 = var1.L;
            if (var1.u[0] == null && class08870 != null && !class08870.N().getVertexFormat().getElements().isEmpty()) {
               throw new IllegalStateException("Vertex format contains elements but vertex buffer at slot 0 is null");
            }

            if (var1.u[0] != null && var1.u[0].isClosed()) {
               throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
            }

            if (var1.u[0] != null && (var1.u[0].usage() & 32) == 0) {
               throw new IllegalStateException("Vertex buffer must have GpuBuffer.USAGE_VERTEX!");
            }
         }

         this.N(var1, var2, var3, var4, var5, var1.L, var6);
      }
   }

   private void N(class08858 var1, int var2, int var3, int var4, @Nullable IndexType var5, class08870 var6, int var7) {
      this.y.L().N(var6.N().getVertexFormat(), (class08523)var1.u[0]);
      if (var5 != null) {
         GlStateManager._glBindBuffer(34963, ((class08523)var1.i).u);
         if (var7 > 1) {
            if (var2 > 0) {
               GL32.glDrawElementsInstancedBaseVertex(
                  GlConst.toGl(var6.N().getVertexFormatMode()), var4, GlConst.toGl(var5), (long)var3 * var5.size, var7, var2
               );
            } else {
               GL31.glDrawElementsInstanced(GlConst.toGl(var6.N().getVertexFormatMode()), var4, GlConst.toGl(var5), (long)var3 * var5.size, var7);
            }
         } else if (var2 > 0) {
            GL32.glDrawElementsBaseVertex(GlConst.toGl(var6.N().getVertexFormatMode()), var4, GlConst.toGl(var5), (long)var3 * var5.size, var2);
         } else {
            GlStateManager._drawElements(GlConst.toGl(var6.N().getVertexFormatMode()), var4, GlConst.toGl(var5), (long)var3 * var5.size);
         }
      } else if (var7 > 1) {
         GL31.glDrawArraysInstanced(GlConst.toGl(var6.N().getVertexFormatMode()), var2, var4, var7);
      } else {
         GlStateManager._drawArrays(GlConst.toGl(var6.N().getVertexFormatMode()), var2, var4);
      }
   }

   private boolean N(class08495 var1) {
      return ImmediateState.temporarilyIgnorePass ? false : this.R;
   }

   private void N(class08858 var1, Collection var2, CallbackInfoReturnable var3) {
      DepthColorStorage.unlockDepthColor();
      if (ImmediateState.safeToMultiply && !(var1.L.y() instanceof ExtendedShader)) {
         GlStateManager._glBindFramebuffer(36160, this.Z);
      }

      U = var1;
      if (var1.iris$getCustomPass() != null) {
         this.M = null;
         var3.setReturnValue(true);
         var1.iris$getCustomPass().setupState();
         RenderPipeline renderpipeline = var1.L.N();
         if (var1.y()) {
            GlStateManager._enableScissorTest();
            GlStateManager._scissorBox(var1.L(), var1.u(), var1.i(), var1.R());
         } else {
            GlStateManager._disableScissorTest();
         }

         if (this.i != renderpipeline) {
            this.i = renderpipeline;
            if (renderpipeline.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
               GlStateManager._enableDepthTest();
               GlStateManager._depthFunc(GlConst.toGl(renderpipeline.getDepthTestFunction()));
            } else {
               GlStateManager._disableDepthTest();
            }

            if (renderpipeline.isCull()) {
               GlStateManager._enableCull();
            } else {
               GlStateManager._disableCull();
            }

            GlStateManager._polygonMode(1032, GlConst.toGl(renderpipeline.getPolygonMode()));
            GlStateManager._depthMask(renderpipeline.isWriteDepth());
            GlStateManager._colorMask(
               renderpipeline.isWriteColor(), renderpipeline.isWriteColor(), renderpipeline.isWriteColor(), renderpipeline.isWriteAlpha()
            );
            if (renderpipeline.getDepthBiasConstant() == 0.0F && renderpipeline.getDepthBiasScaleFactor() == 0.0F) {
               GlStateManager._disablePolygonOffset();
            } else {
               GlStateManager._polygonOffset(renderpipeline.getDepthBiasScaleFactor(), renderpipeline.getDepthBiasConstant());
               GlStateManager._enablePolygonOffset();
            }

            switch (renderpipeline.getColorLogic()) {
               case NONE:
                  GlStateManager._disableColorLogicOp();
                  break;
               case OR_REVERSE:
                  GlStateManager._enableColorLogicOp();
                  GlStateManager._logicOp(5387);
            }
         }
      }
   }

   private void N(CallbackInfo var1) {
      this.z.forEach(IrisProgram::iris$clearState);
      this.z.clear();
   }

   public void N(RenderPipeline var1, CallbackInfo var2) {
      if (this.i != var1) {
         if (var1 == (RenderPipeline)class11898.N_0) {
            GL14.glBlendEquation(32779);
         } else if (this.i == (RenderPipeline)class11898.N_0) {
            GL14.glBlendEquation(32774);
         }
      }
   }

   private void N(int var1, int var2) {
      if (!ShadowRenderingState.areShadowsCurrentlyBeingRendered() && !ImmediateState.safeToMultiply) {
         GlStateManager._glBindFramebuffer(var1, var2);
      } else {
         this.Z = var2;
      }
   }

   private void N(int var1, int var2, int var3, int var4) {
      if (!ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
         GlStateManager._viewport(var1, var2, var3, var4);
      }
   }

   private void N(GpuTexture var1, int var2, int var3, int var4, int var5) {
      if (var2 < 0 || var2 >= var1.getWidth(0)) {
         throw new IllegalArgumentException("regionX should not be outside of the texture");
      } else if (var3 < 0 || var3 >= var1.getHeight(0)) {
         throw new IllegalArgumentException("regionY should not be outside of the texture");
      } else if (var4 <= 0) {
         throw new IllegalArgumentException("regionWidth should be greater than 0");
      } else if (var2 + var4 > var1.getWidth(0)) {
         throw new IllegalArgumentException("regionWidth + regionX should be less than the texture width");
      } else if (var5 <= 0) {
         throw new IllegalArgumentException("regionHeight should be greater than 0");
      } else if (var3 + var5 > var1.getHeight(0)) {
         throw new IllegalArgumentException("regionWidth + regionX should be less than the texture height");
      }
   }

   private void N(GpuTexture var1) {
      if (!var1.getFormat().hasColorAspect()) {
         throw new IllegalStateException("Trying to clear a non-color texture as color");
      } else if (var1.isClosed()) {
         throw new IllegalStateException("Color texture is closed");
      } else if ((var1.usage() & 8) == 0) {
         throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
      } else if (var1.getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
      }
   }

   public GpuFence createFence() {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         return new class00060();
      }
   }

   public RenderPass createRenderPass(Supplier<String> var1, GpuTextureView var2, OptionalInt var3, @Nullable GpuTextureView var4, OptionalDouble var5) {
      if (this.L(this)) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         if (var5.isPresent() && var4 == null) {
            N.warn("Depth clear value was provided but no depth texture is being used");
         }

         if (var2.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
         } else if ((var2.texture().usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
         } else if (var2.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
         } else {
            if (var4 != null) {
               if (var4.isClosed()) {
                  throw new IllegalStateException("Depth texture is closed");
               }

               if ((var4.texture().usage() & 8) == 0) {
                  throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
               }

               if (var4.texture().getDepthOrLayers() > 1) {
                  throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
               }
            }

            this.R = true;
            this.y.N().N(var1);
            int ix = ((class09006)var2).N(this.y.y(), var4 == null ? null : var4.texture());
            char c0 = '赀';
            this.N(c0, ix);
            short short1 = 0;
            if (var3.isPresent()) {
               int j = var3.getAsInt();
               GL11.glClearColor(class02566.m(j), class02566.P(j), class02566.s(j), class02566.W(j));
               short1 |= 16384;
            }

            if (var4 != null && var5.isPresent()) {
               GL11.glClearDepth(var5.getAsDouble());
               short1 |= 256;
            }

            if (short1 != 0) {
               GlStateManager._disableScissorTest();
               GlStateManager._depthMask(true);
               GlStateManager._colorMask(true, true, true, true);
               GlStateManager._clear(short1);
            }

            int l = var2.getHeight(0);
            int k = var2.getWidth(0);
            byte b0 = 0;
            byte b1 = 0;
            this.N(b1, b0, k, l);
            this.i = null;
            return new class08858(this, var4 != null);
         }
      }
   }

   public RenderPass createRenderPass(Supplier<String> var1, GpuTextureView var2, OptionalInt var3) {
      return this.createRenderPass(var1, var2, var3, null, OptionalDouble.empty());
   }

   public void writeToBuffer(GpuBufferSlice var1, ByteBuffer var2) {
      if (this.N(this)) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         class08523 class08523 = (class08523)var1.buffer();
         if (class08523.y) {
            throw new IllegalStateException("Buffer already closed");
         } else if ((class08523.usage() & 8) == 0) {
            throw new IllegalStateException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
         } else {
            int ix = var2.remaining();
            if (ix > var1.length()) {
               throw new IllegalArgumentException(
                  "Cannot write more data than the slice allows (attempting to write " + ix + " bytes into a slice of length " + var1.length() + ")"
               );
            } else if (var1.length() + var1.offset() > class08523.size()) {
               throw new IllegalArgumentException(
                  "Cannot write more data than this buffer can hold (attempting to write "
                     + ix
                     + " bytes at offset "
                     + var1.offset()
                     + " to "
                     + class08523.size()
                     + " size buffer)"
               );
            } else {
               this.y.y().N(class08523.u, var1.offset(), var2, class08523.usage());
            }
         }
      }
   }

   public void presentTexture(GpuTextureView var1) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (!var1.texture().getFormat().hasColorAspect()) {
         throw new IllegalStateException("Cannot present a non-color texture!");
      } else if ((var1.texture().usage() & 8) == 0) {
         throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT to presented to the screen");
      } else if (var1.texture().getDepthOrLayers() > 1) {
         throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for presentation");
      } else {
         GlStateManager._disableScissorTest();
         GlStateManager._viewport(0, 0, var1.getWidth(0), var1.getHeight(0));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         this.y.y().N(this.u, ((class08893)var1.texture()).N(), 0, 0, 0);
         this.y.y().N(this.u, 0, 0, 0, var1.getWidth(0), var1.getHeight(0), 0, 0, var1.getWidth(0), var1.getHeight(0), 16384, 9728);
      }
   }

   public void clearColorTexture(GpuTexture var1, int var2) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.N(var1);
         this.y.y().N(this.u, ((class08893)var1).N, 0, 0, 36160);
         GL11.glClearColor(class02566.m(var2), class02566.P(var2), class02566.s(var2), class02566.W(var2));
         GlStateManager._disableScissorTest();
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16384);
         GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   public void writeToTexture(GpuTexture var1, class08280 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (this.y(this)) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (var3 >= 0 && var3 < var1.getMipLevels()) {
         if (var9 + var7 > var2.N() || var10 + var8 > var2.y()) {
            throw new IllegalArgumentException(
               "Copy source ("
                  + var2.N()
                  + "x"
                  + var2.y()
                  + ") is not large enough to read a rectangle of "
                  + var7
                  + "x"
                  + var8
                  + " from "
                  + var9
                  + "x"
                  + var10
            );
         } else if (var5 + var7 > var1.getWidth(var3) || var6 + var8 > var1.getHeight(var3)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + var7
                  + "x"
                  + var8
                  + ") is not large enough to write a rectangle of "
                  + var7
                  + "x"
                  + var8
                  + " at "
                  + var5
                  + "x"
                  + var6
                  + " (at mip level "
                  + var3
                  + ")"
            );
         } else if (var1.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else if ((var1.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
         } else if (var4 >= var1.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + var1.getDepthOrLayers());
         } else {
            int ix;
            if ((var1.usage() & 16) != 0) {
               ix = GlConst.CUBEMAP_TARGETS[var4 % 6];
               GL11.glBindTexture(34067, ((class08893)var1).N);
            } else {
               ix = 3553;
               GlStateManager._bindTexture(((class08893)var1).N);
            }

            GlStateManager._pixelStore(3314, var2.N());
            GlStateManager._pixelStore(3316, var9);
            GlStateManager._pixelStore(3315, var10);
            GlStateManager._pixelStore(3317, var2.L().N());
            GlStateManager._texSubImage2D(ix, var3, var5, var6, var7, var8, GlConst.toGl(var2.L()), 5121, var2.B());
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + var3 + ", must be >= 0 and < " + var1.getMipLevels());
      }
   }

   public void writeToTexture(GpuTexture var1, ByteBuffer var2, class08247 var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (this.y(this)) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (var4 >= 0 && var4 < var1.getMipLevels()) {
         if (var8 * var9 * var3.N() > var2.remaining()) {
            throw new IllegalArgumentException(
               "Copy would overrun the source buffer (remaining length of "
                  + var2.remaining()
                  + ", but copy is "
                  + var8
                  + "x"
                  + var9
                  + " of format "
                  + var3
                  + ")"
            );
         } else if (var6 + var8 > var1.getWidth(var4) || var7 + var9 > var1.getHeight(var4)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + var1.getWidth(var4)
                  + "x"
                  + var1.getHeight(var4)
                  + ") is not large enough to write a rectangle of "
                  + var8
                  + "x"
                  + var9
                  + " at "
                  + var6
                  + "x"
                  + var7
            );
         } else if (var1.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else if ((var1.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
         } else if (var5 >= var1.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + var1.getDepthOrLayers());
         } else {
            int ix;
            if ((var1.usage() & 16) != 0) {
               ix = GlConst.CUBEMAP_TARGETS[var5 % 6];
               GL11.glBindTexture(34067, ((class08893)var1).N);
            } else {
               ix = 3553;
               GlStateManager._bindTexture(((class08893)var1).N);
            }

            GlStateManager._pixelStore(3314, var8);
            GlStateManager._pixelStore(3316, 0);
            GlStateManager._pixelStore(3315, 0);
            GlStateManager._pixelStore(3317, var3.N());
            GlStateManager._texSubImage2D(ix, var4, var6, var7, var8, var9, GlConst.toGl(var3), 5121, var2);
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + var1.getMipLevels());
      }
   }

   public void writeToTexture(GpuTexture var1, class08280 var2) {
      int ix = var1.getWidth(0);
      int j = var1.getHeight(0);
      if (var2.N() != ix || var2.y() != j) {
         throw new IllegalArgumentException("Cannot replace texture of size " + ix + "x" + j + " with image of size " + var2.N() + "x" + var2.y());
      } else if (var1.isClosed()) {
         throw new IllegalStateException("Destination texture is closed");
      } else if ((var1.usage() & 1) == 0) {
         throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
      } else {
         this.writeToTexture(var1, var2, 0, 0, 0, 0, ix, j, 0, 0);
      }
   }

   public void clearDepthTexture(GpuTexture var1, double var2) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.y(var1);
         this.y.y().N(this.u, 0, ((class08893)var1).N, 0, 36160);
         GL11.glDrawBuffer(0);
         GL11.glClearDepth(var2);
         GlStateManager._depthMask(true);
         GlStateManager._disableScissorTest();
         GlStateManager._clear(256);
         GL11.glDrawBuffer(36064);
         GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   public GpuQuery timerQueryBegin() {
      RenderSystem.assertOnRenderThread();
      if (this.B != null) {
         throw new IllegalStateException("A GL_TIME_ELAPSED query is already active");
      } else {
         int ix = GL32C.glGenQueries();
         GL32C.glBeginQuery(35007, ix);
         this.B = new class00613(ix);
         return this.B;
      }
   }

   public void timerQueryEnd(GpuQuery var1) {
      RenderSystem.assertOnRenderThread();
      if (var1 != this.B) {
         throw new IllegalStateException("Mismatched or duplicate GpuQuery when ending timerQuery");
      } else {
         GL32C.glEndQuery(35007);
         this.B = null;
      }
   }

   public void copyToBuffer(GpuBufferSlice var1, GpuBufferSlice var2) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         class08523 class08523x = (class08523)var1.buffer();
         if (class08523x.y) {
            throw new IllegalStateException("Source buffer already closed");
         } else if ((class08523x.usage() & 16) == 0) {
            throw new IllegalStateException("Source buffer needs USAGE_COPY_SRC to be a source for a copy");
         } else {
            class08523 class08523x = (class08523)var2.buffer();
            if (class08523x.y) {
               throw new IllegalStateException("Target buffer already closed");
            } else if ((class08523x.usage() & 8) == 0) {
               throw new IllegalStateException("Target buffer needs USAGE_COPY_DST to be a destination for a copy");
            } else if (var1.length() != var2.length()) {
               throw new IllegalArgumentException(
                  "Cannot copy from slice of size " + var1.length() + " to slice of size " + var2.length() + ", they must be equal"
               );
            } else if (var1.offset() + var1.length() > class08523x.size()) {
               throw new IllegalArgumentException(
                  "Cannot copy more data than the source buffer holds (attempting to copy "
                     + var1.length()
                     + " bytes at offset "
                     + var1.offset()
                     + " from "
                     + class08523x.size()
                     + " size buffer)"
               );
            } else if (var2.offset() + var2.length() > class08523x.size()) {
               throw new IllegalArgumentException(
                  "Cannot copy more data than the target buffer can hold (attempting to copy "
                     + var2.length()
                     + " bytes at offset "
                     + var2.offset()
                     + " to "
                     + class08523x.size()
                     + " size buffer)"
               );
            } else {
               this.y.y().N(class08523x.u, class08523x.u, var1.offset(), var2.offset(), var1.length());
            }
         }
      }
   }

   public void clearColorAndDepthTextures(GpuTexture var1, int var2, GpuTexture var3, double var4, int var6, int var7, int var8, int var9) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.N(var1);
         this.y(var3);
         this.N(var1, var6, var7, var8, var9);
         int ix = ((class08893)var1).N(this.y.y(), var3);
         GlStateManager._glBindFramebuffer(36160, ix);
         GlStateManager._scissorBox(var6, var7, var8, var9);
         GlStateManager._enableScissorTest();
         GL11.glClearDepth(var4);
         GL11.glClearColor(class02566.m(var2), class02566.P(var2), class02566.s(var2), class02566.W(var2));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16640);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   public void clearColorAndDepthTextures(GpuTexture var1, int var2, GpuTexture var3, double var4) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before creating a new one!");
      } else {
         this.N(var1);
         this.y(var3);
         int ix = ((class08893)var1).N(this.y.y(), var3);
         GlStateManager._glBindFramebuffer(36160, ix);
         GlStateManager._disableScissorTest();
         GL11.glClearDepth(var4);
         GL11.glClearColor(class02566.m(var2), class02566.P(var2), class02566.s(var2), class02566.W(var2));
         GlStateManager._depthMask(true);
         GlStateManager._colorMask(true, true, true, true);
         GlStateManager._clear(16640);
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   public void copyTextureToBuffer(GpuTexture var1, GpuBuffer var2, long var3, Runnable var5, int var6, int var7, int var8, int var9, int var10) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (var6 >= 0 && var6 < var1.getMipLevels()) {
         if (var1.getWidth(var6) * var1.getHeight(var6) * var1.getFormat().pixelSize() + var3 > var2.size()) {
            throw new IllegalArgumentException(
               "Buffer of size "
                  + var2.size()
                  + " is not large enough to hold "
                  + var9
                  + "x"
                  + var10
                  + " pixels ("
                  + var1.getFormat().pixelSize()
                  + " bytes each) starting from offset "
                  + var3
            );
         } else if ((var1.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
         } else if ((var2.usage() & 8) == 0) {
            throw new IllegalArgumentException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
         } else if (var7 + var9 > var1.getWidth(var6) || var8 + var10 > var1.getHeight(var6)) {
            throw new IllegalArgumentException(
               "Copy source texture ("
                  + var1.getWidth(var6)
                  + "x"
                  + var1.getHeight(var6)
                  + ") is not large enough to read a rectangle of "
                  + var9
                  + "x"
                  + var10
                  + " from "
                  + var7
                  + ","
                  + var8
            );
         } else if (var1.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
         } else if (var2.isClosed()) {
            throw new IllegalStateException("Destination buffer is closed");
         } else if (var1.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
         } else {
            GlStateManager.clearGlErrors();
            this.y.y().N(this.L, ((class08893)var1).N(), 0, var6, 36008);
            GlStateManager._glBindBuffer(35051, ((class08523)var2).u);
            GlStateManager._pixelStore(3330, var9);
            GlStateManager._readPixels(var7, var8, var9, var10, GlConst.toGlExternalId(var1.getFormat()), GlConst.toGlType(var1.getFormat()), var3);
            RenderSystem.queueFencedTask(var5);
            GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, 0, var6);
            GlStateManager._glBindFramebuffer(36008, 0);
            GlStateManager._glBindBuffer(35051, 0);
            int ix = GlStateManager._getError();
            if (ix != 0) {
               throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + var1.getLabel() + ": GL error " + ix);
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + var6 + ", must be >= 0 and < " + var1.getMipLevels());
      }
   }

   public void copyTextureToBuffer(GpuTexture var1, GpuBuffer var2, long var3, Runnable var5, int var6) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         this.copyTextureToBuffer(var1, var2, var3, var5, var6, 0, 0, var1.getWidth(var6), var1.getHeight(var6));
      }
   }

   public MappedView mapBuffer(GpuBufferSlice var1, boolean var2, boolean var3) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else {
         class08523 class08523 = (class08523)var1.buffer();
         if (class08523.y) {
            throw new IllegalStateException("Buffer already closed");
         } else if (!var2 && !var3) {
            throw new IllegalArgumentException("At least read or write must be true");
         } else if (var2 && (class08523.usage() & 1) == 0) {
            throw new IllegalStateException("Buffer is not readable");
         } else if (var3 && (class08523.usage() & 2) == 0) {
            throw new IllegalStateException("Buffer is not writable");
         } else if (var1.offset() + var1.length() > class08523.size()) {
            throw new IllegalArgumentException(
               "Cannot map more data than this buffer can hold (attempting to map "
                  + var1.length()
                  + " bytes at offset "
                  + var1.offset()
                  + " from "
                  + class08523.size()
                  + " size buffer)"
            );
         } else {
            byte b0 = 0;
            if (var2) {
               b0 |= 1;
            }

            if (var3) {
               b0 |= 34;
            }

            return this.y.u().N(this.y.y(), class08523, var1.offset(), var1.length(), b0);
         }
      }
   }

   public MappedView mapBuffer(GpuBuffer var1, boolean var2, boolean var3) {
      return this.mapBuffer(var1.slice(), var2, var3);
   }

   public void copyTextureToTexture(GpuTexture var1, GpuTexture var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (this.R) {
         throw new IllegalStateException("Close the existing render pass before performing additional commands");
      } else if (var3 >= 0 && var3 < var1.getMipLevels() && var3 < var2.getMipLevels()) {
         if (var4 + var8 > var2.getWidth(var3) || var5 + var9 > var2.getHeight(var3)) {
            throw new IllegalArgumentException(
               "Dest texture ("
                  + var2.getWidth(var3)
                  + "x"
                  + var2.getHeight(var3)
                  + ") is not large enough to write a rectangle of "
                  + var8
                  + "x"
                  + var9
                  + " at "
                  + var4
                  + "x"
                  + var5
            );
         } else if (var6 + var8 > var1.getWidth(var3) || var7 + var9 > var1.getHeight(var3)) {
            throw new IllegalArgumentException(
               "Source texture ("
                  + var1.getWidth(var3)
                  + "x"
                  + var1.getHeight(var3)
                  + ") is not large enough to read a rectangle of "
                  + var8
                  + "x"
                  + var9
                  + " at "
                  + var6
                  + "x"
                  + var7
            );
         } else if (var1.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
         } else if (var2.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
         } else if ((var1.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
         } else if ((var2.usage() & 1) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_DST to be a destination for a copy");
         } else if (var1.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
         } else if (var2.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
         } else {
            GlStateManager.clearGlErrors();
            GlStateManager._disableScissorTest();
            boolean flag = var1.getFormat().hasDepthAspect();
            int ix = ((class08893)var1).N();
            int j = ((class08893)var2).N();
            this.y.y().N(this.L, flag ? 0 : ix, flag ? ix : 0, 0, 0);
            this.y.y().N(this.u, flag ? 0 : j, flag ? j : 0, 0, 0);
            this.y.y().N(this.L, this.u, var6, var7, var8, var9, var4, var5, var8, var9, flag ? 256 : 16384, 9728);
            int k = GlStateManager._getError();
            if (k != 0) {
               throw new IllegalStateException("Couldn't perform copyToTexture for texture " + var1.getLabel() + " to " + var2.getLabel() + ": GL error " + k);
            }
         }
      } else {
         throw new IllegalArgumentException("Invalid mipLevel " + var3 + ", must be >= 0 and < " + var1.getMipLevels() + " and < " + var2.getMipLevels());
      }
   }
}
