package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02409 implements AutoCloseable {
   private static final class01894 N = class01894.y("sun");
   private static final class01894 y = class01894.y("end_flash");
   private static final class01894 L = class01894.y("textures/environment/end_sky.png");
   private static final float u = 512.0F;
   private static final int i = 10;
   private static final int R = 1500;
   private static final float M = 30.0F;
   private static final float B = 100.0F;
   private static final float Z = 20.0F;
   private static final float z = 100.0F;
   private static final int U = 16;
   private static final int E = 6;
   private static final float W = 100.0F;
   private static final float m = 60.0F;
   private final class08626 P;
   private final GpuBuffer s;
   private final GpuBuffer T;
   private final GpuBuffer b;
   private final GpuBuffer j;
   private final GpuBuffer v;
   private final GpuBuffer n;
   private final GpuBuffer t;
   private final GpuBuffer G;
   private final ShapeIndexBuffer l = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
   private final class08918 d;
   private int w;

   private static GpuBuffer L(class08626 var0) {
      class08165[] aclass08165 = class08165.values();
      VertexFormat vertexformat = class07835.Z;

      GpuBuffer gpubuffer;
      try (class02579 class02579 = class02579.N(aclass08165.length * 4 * vertexformat.getVertexSize())) {
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, vertexformat);

         for (class08165 class08165 : aclass08165) {
            class08388 class08388 = var0.N(class01894.y("moon/" + class08165.method_15434()));
            class07331.method_22912(-1.0F, 0.0F, -1.0F).method_22913(class08388.method_4577(), class08388.method_4575());
            class07331.method_22912(1.0F, 0.0F, -1.0F).method_22913(class08388.method_4594(), class08388.method_4575());
            class07331.method_22912(1.0F, 0.0F, 1.0F).method_22913(class08388.method_4594(), class08388.method_4593());
            class07331.method_22912(-1.0F, 0.0F, 1.0F).method_22913(class08388.method_4577(), class08388.method_4593());
         }

         try (class02609 class02609 = class07331.y()) {
            gpubuffer = RenderSystem.getDevice().createBuffer(() -> "Moon phases", 32, class02609.N());
         }
      }

      return gpubuffer;
   }

   private void L(float var1, class01421 var2, CallbackInfo var3) {
      this.N(WorldRenderingPhase.STARS);
   }

   private GpuBuffer L() {
      byte b0 = 18;
      int ix = class07835.R.getVertexSize();

      GpuBuffer gpubuffer;
      try (class02579 class02579 = class02579.N(18 * ix)) {
         class07331 class07331 = new class07331(class02579, DrawMode.TRIANGLE_FAN, class07835.R);
         int jx = class02566.y(1.0F);
         int k = class02566.y(0.0F);
         class07331.method_22912(0.0F, 100.0F, 0.0F).method_39415(jx);

         for (int lx = 0; lx <= 16; lx++) {
            float f = lx * (float) (Math.PI * 2) / 16.0F;
            float f1 = class04995.m(f);
            float f2 = class04995.P(f);
            class07331.method_22912(f1 * 120.0F, f2 * 120.0F, -f2 * 40.0F).method_39415(k);
         }

         try (class02609 class02609 = class07331.y()) {
            gpubuffer = RenderSystem.getDevice().createBuffer(() -> "Sunrise/Sunset fan", 32, class02609.N());
         }
      }

      return gpubuffer;
   }

   private void L(class08165 var1, float var2, class01421 var3, CallbackInfo var4) {
      if (!SodiumExtraClientMod.options().detailSettings.moon) {
         var4.cancel();
      }
   }

   private void L(class01421 var1, float var2, int var3, CallbackInfo var4) {
      if (!SodiumExtraClientMod.options().detailSettings.sun) {
         var4.cancel();
      }
   }

   public class02409(class08627 var1, class08117 var2) {
      super();
      this.P = var2.N(class08589.P);
      this.s = this.u();
      this.j = i();
      this.d = this.N(var1, L);
      this.G = y(this.P);
      this.v = N(this.P);
      this.n = L(this.P);
      this.t = this.L();

      try (class02579 class02579 = class02579.N(10 * class07835.i.getVertexSize())) {
         class07331 class07331 = new class07331(class02579, DrawMode.TRIANGLE_FAN, class07835.i);
         this.N(class07331, 16.0F);

         try (class02609 class02609x = class07331.y()) {
            this.T = RenderSystem.getDevice().createBuffer(() -> "Top sky vertex buffer", 32, class02609x.N());
         }

         class07331 = new class07331(class02579, DrawMode.TRIANGLE_FAN, class07835.i);
         this.N(class07331, -16.0F);

         try (class02609 class02609 = class07331.y()) {
            this.b = RenderSystem.getDevice().createBuffer(() -> "Bottom sky vertex buffer", 32, class02609.N());
         }
      }
   }

   private static GpuBuffer i() {
      GpuBuffer gpubuffer;
      try (class02579 class02579 = class02579.N(24 * class07835.z.getVertexSize())) {
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, class07835.z);

         for (int ix = 0; ix < 6; ix++) {
            Matrix4f matrix4f = new Matrix4f();
            switch (ix) {
               case 1:
                  matrix4f.rotationX((float) (Math.PI / 2));
                  break;
               case 2:
                  matrix4f.rotationX((float) (-Math.PI / 2));
                  break;
               case 3:
                  matrix4f.rotationX((float) Math.PI);
                  break;
               case 4:
                  matrix4f.rotationZ((float) (Math.PI / 2));
                  break;
               case 5:
                  matrix4f.rotationZ((float) (-Math.PI / 2));
            }

            class07331.N(matrix4f, -100.0F, -100.0F, -100.0F).method_22913(0.0F, 0.0F).method_39415(-14145496);
            class07331.N(matrix4f, -100.0F, -100.0F, 100.0F).method_22913(0.0F, 16.0F).method_39415(-14145496);
            class07331.N(matrix4f, 100.0F, -100.0F, 100.0F).method_22913(16.0F, 16.0F).method_39415(-14145496);
            class07331.N(matrix4f, 100.0F, -100.0F, -100.0F).method_22913(16.0F, 0.0F).method_39415(-14145496);
         }

         try (class02609 class02609 = class07331.y()) {
            gpubuffer = RenderSystem.getDevice().createBuffer(() -> "End sky vertex buffer", 40, class02609.N());
         }
      }

      return gpubuffer;
   }

   private void i(float var1, class01421 var2, CallbackInfo var3) {
      if (!SodiumExtraClientMod.options().detailSettings.stars) {
         var3.cancel();
      }
   }

   private float v() {
      return Iris.getPipelineManager().getPipelineNullable() == null ? 0.0F : Iris.getPipelineManager().getPipelineNullable().getSunPathRotation();
   }

   @Override
   public void close() {
      this.v.close();
      this.n.close();
      this.s.close();
      this.T.close();
      this.b.close();
      this.j.close();
      this.t.close();
      this.G.close();
   }

   private GpuBuffer u() {
      class06069 class06069 = class06069.y(10842L);
      float f = 100.0F;

      GpuBuffer gpubuffer;
      try (class02579 class02579 = class02579.N(class07835.i.getVertexSize() * 1500 * 4)) {
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, class07835.i);

         for (int ix = 0; ix < 1500; ix++) {
            float f1 = class06069.z() * 2.0F - 1.0F;
            float f2 = class06069.z() * 2.0F - 1.0F;
            float f3 = class06069.z() * 2.0F - 1.0F;
            float f4 = 0.15F + class06069.z() * 0.1F;
            float f5 = class04995.U(f1, f2, f3);
            if (!(f5 <= 0.010000001F) && !(f5 >= 1.0F)) {
               Vector3f vector3f = new Vector3f(f1, f2, f3).normalize(100.0F);
               float f6 = (float)(class06069.U() * (float) Math.PI * 2.0);
               Matrix3f matrix3f = new Matrix3f().rotateTowards(new Vector3f(vector3f).negate(), new Vector3f(0.0F, 1.0F, 0.0F)).rotateZ(-f6);
               class07331.N_26(new Vector3f(f4, -f4, 0.0F).mul(matrix3f).add(vector3f));
               class07331.N_26(new Vector3f(f4, f4, 0.0F).mul(matrix3f).add(vector3f));
               class07331.N_26(new Vector3f(-f4, f4, 0.0F).mul(matrix3f).add(vector3f));
               class07331.N_26(new Vector3f(-f4, -f4, 0.0F).mul(matrix3f).add(vector3f));
            }
         }

         try (class02609 class02609 = class07331.y()) {
            this.w = class02609.L().L();
            gpubuffer = RenderSystem.getDevice().createBuffer(() -> "Stars vertex buffer", 40, class02609.N());
         }
      }

      return gpubuffer;
   }

   private void u(float var1, class01421 var2, CallbackInfo var3) {
      if (!SodiumExtraClientMod.options().detailSettings.sun) {
         var3.cancel();
      }
   }

   private static GpuBuffer y(class08626 var0) {
      return N("End flash quad", var0.N(y));
   }

   private void y_5(int var1, CallbackInfo var2) {
      this.N(WorldRenderingPhase.SKY);
   }

   private void y(float var1, class01421 var2) {
      this.L(var1, var2, null);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.i(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
         matrix4fstack.pushMatrix();
         matrix4fstack.mul(var2.L().N());
         RenderPipeline renderpipeline = class08394.NV;
         GpuTextureView gputextureview = class06202.Nq().e().u();
         GpuTextureView gputextureview1 = class06202.Nq().e().R();
         GpuBuffer gpubuffer = this.l.getIndexBuffer(this.w);
         GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
            .N(matrix4fstack, new Vector4f(var1, var1, var1, var1), new Vector3f(), new Matrix4f());
         RenderPass renderpass = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Stars", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

         try {
            renderpass.setPipeline(renderpipeline);
            RenderSystem.bindDefaultUniforms(renderpass);
            renderpass.setUniform("DynamicTransforms", gpubufferslice);
            renderpass.setVertexBuffer(0, this.s);
            renderpass.setIndexBuffer(gpubuffer, this.l.getIndexType());
            renderpass.drawIndexed(0, 0, this.w, 1);
         } catch (Throwable throwable1) {
            if (renderpass != null) {
               try {
                  renderpass.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (renderpass != null) {
            renderpass.close();
         }

         matrix4fstack.popMatrix();
      }
   }

   public void y() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
         GpuBuffer gpubuffer = shapeindexbuffer.getIndexBuffer(36);
         GpuTextureView gputextureview = class06202.Nq().e().u();
         GpuTextureView gputextureview1 = class06202.Nq().e().R();
         GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
            .N(RenderSystem.getModelViewMatrix(), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f());
         RenderPass renderpass = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "End sky", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

         try {
            renderpass.setPipeline(class08394.Nq);
            RenderSystem.bindDefaultUniforms(renderpass);
            renderpass.setUniform("DynamicTransforms", gpubufferslice);
            renderpass.bindTexture("Sampler0", this.d.method_71659(), this.d.method_75484());
            renderpass.setVertexBuffer(0, this.j);
            renderpass.setIndexBuffer(gpubuffer, shapeindexbuffer.getIndexType());
            renderpass.drawIndexed(0, 0, 36, 1);
         } catch (Throwable throwable1) {
            if (renderpass != null) {
               try {
                  renderpass.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (renderpass != null) {
            renderpass.close();
         }
      }
   }

   private void y(class01421 var1, float var2, int var3, CallbackInfo var4) {
      if (((class03063)class06202.Nq().B_2).invokeDoesMobEffectBlockSky(((class03386)class06202.Nq().i_5).s())) {
         var4.cancel();
      }

      if (((class03386)class06202.Nq().i_5).s().W() != class04798.field_27888) {
         var4.cancel();
      }
   }

   private void y(float var1, class01421 var2, CallbackInfo var3) {
      this.N(WorldRenderingPhase.SUN);
   }

   private void y(class08165 var1, float var2, class01421 var3, CallbackInfo var4) {
      this.N(WorldRenderingPhase.MOON);
   }

   private void y(CallbackInfo var1) {
      this.N(WorldRenderingPhase.VOID);
   }

   public void N(int var1, CallbackInfo var2) {
      if (!SodiumExtraClientMod.options().detailSettings.sky) {
         var2.cancel();
      }
   }

   public void N(class01421 var1, float var2, float var3, float var4) {
      var1.N(class02058.u.N(180.0F - var4));
      var1.N(class02058.y.N(-90.0F - var3));
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      matrix4fstack.pushMatrix();
      matrix4fstack.mul(var1.L().N());
      matrix4fstack.translate(0.0F, 100.0F, 0.0F);
      matrix4fstack.scale(60.0F, 1.0F, 60.0F);
      GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms().N(matrix4fstack, new Vector4f(var2, var2, var2, var2), new Vector3f(), new Matrix4f());
      GpuTextureView gputextureview = class06202.Nq().e().u();
      GpuTextureView gputextureview1 = class06202.Nq().e().R();
      GpuBuffer gpubuffer = this.l.getIndexBuffer(6);
      RenderPass renderpass = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(() -> "End flash", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

      try {
         renderpass.setPipeline(class08394.Ne);
         RenderSystem.bindDefaultUniforms(renderpass);
         renderpass.setUniform("DynamicTransforms", gpubufferslice);
         renderpass.bindTexture("Sampler0", this.P.method_71659(), this.P.method_75484());
         renderpass.setVertexBuffer(0, this.G);
         renderpass.setIndexBuffer(gpubuffer, this.l.getIndexType());
         renderpass.drawIndexed(0, 0, 6, 1);
      } catch (Throwable throwable1) {
         if (renderpass != null) {
            try {
               renderpass.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (renderpass != null) {
         renderpass.close();
      }

      matrix4fstack.popMatrix();
   }

   public void N(WorldRenderingPhase var1) {
      if (Iris.getPipelineManager().getPipelineNullable() != null) {
         Iris.getPipelineManager().getPipelineNullable().setPhase(var1);
      }
   }

   private void N(class01421 var1, float var2, float var3, float var4, class08165 var5, float var6, float var7, CallbackInfo var8) {
      var1.N(class02058.R.N(this.v()));
   }

   private void N(class01391 var1, float var2) {
      float f = Math.signum(var2) * 512.0F;
      var1.method_22912(0.0F, var2, 0.0F);

      for (short short1 = -180; short1 <= 180; short1 += 45) {
         var1.method_22912(f * class04995.P(short1 * (float) (Math.PI / 180.0)), var2, 512.0F * class04995.m(short1 * (float) (Math.PI / 180.0)));
      }
   }

   private static GpuBuffer N(class08626 var0) {
      return N("Sun quad", var0.N(N));
   }

   private void N(class08165 var1, float var2, class01421 var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.y(var1, var2, var3, null);
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.L(var1, var2, var3, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            int ix = var1.N() * 4;
            Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
            matrix4fstack.pushMatrix();
            matrix4fstack.mul(var3.L().N());
            matrix4fstack.translate(0.0F, 100.0F, 0.0F);
            matrix4fstack.scale(20.0F, 1.0F, 20.0F);
            GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
               .N(matrix4fstack, new Vector4f(1.0F, 1.0F, 1.0F, var2), new Vector3f(), new Matrix4f());
            GpuTextureView gputextureview = class06202.Nq().e().u();
            GpuTextureView gputextureview1 = class06202.Nq().e().R();
            GpuBuffer gpubuffer = this.l.getIndexBuffer(6);
            RenderPass renderpass = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Sky moon", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

            try {
               renderpass.setPipeline(class08394.Ne);
               RenderSystem.bindDefaultUniforms(renderpass);
               renderpass.setUniform("DynamicTransforms", gpubufferslice);
               renderpass.bindTexture("Sampler0", this.P.method_71659(), this.P.method_75484());
               renderpass.setVertexBuffer(0, this.n);
               renderpass.setIndexBuffer(gpubuffer, this.l.getIndexType());
               renderpass.drawIndexed(ix, 0, 6, 1);
            } catch (Throwable throwable1) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (renderpass != null) {
               renderpass.close();
            }

            matrix4fstack.popMatrix();
         }
      }
   }

   public void N(int var1) {
      this.y_5(var1, null);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
            .N(RenderSystem.getModelViewMatrix(), class02566.E(var1), new Vector3f(), new Matrix4f());
         GpuTextureView gputextureview = class06202.Nq().e().u();
         GpuTextureView gputextureview1 = class06202.Nq().e().R();
         RenderPass renderpass = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Sky disc", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

         try {
            renderpass.setPipeline(class08394.No);
            RenderSystem.bindDefaultUniforms(renderpass);
            renderpass.setUniform("DynamicTransforms", gpubufferslice);
            renderpass.setVertexBuffer(0, this.T);
            renderpass.draw(0, 10);
         } catch (Throwable throwable1) {
            if (renderpass != null) {
               try {
                  renderpass.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (renderpass != null) {
            renderpass.close();
         }
      }
   }

   private class08918 N(class08627 var1, class01894 var2) {
      return var1.y(var2);
   }

   public void N(class01421 var1, float var2, int var3) {
      this.N(var1, var2, var3, null);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.L(var1, var2, var3, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            float f = class02566.W(var3);
            if (!(f <= 0.001F)) {
               var1.N();
               var1.N(class02058.y.N(90.0F));
               float f1 = class04995.m(var2) < 0.0F ? 180.0F : 0.0F;
               var1.N(class02058.R.N(f1 + 90.0F));
               Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
               matrix4fstack.pushMatrix();
               matrix4fstack.mul(var1.L().N());
               matrix4fstack.scale(1.0F, 1.0F, f);
               GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms().N(matrix4fstack, class02566.E(var3), new Vector3f(), new Matrix4f());
               GpuTextureView gputextureview = class06202.Nq().e().u();
               GpuTextureView gputextureview1 = class06202.Nq().e().R();
               RenderPass renderpass = RenderSystem.getDevice()
                  .createCommandEncoder()
                  .createRenderPass(() -> "Sunrise sunset", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

               try {
                  renderpass.setPipeline(class08394.NK);
                  RenderSystem.bindDefaultUniforms(renderpass);
                  renderpass.setUniform("DynamicTransforms", gpubufferslice);
                  renderpass.setVertexBuffer(0, this.t);
                  renderpass.draw(0, 18);
               } catch (Throwable throwable1) {
                  if (renderpass != null) {
                     try {
                        renderpass.close();
                     } catch (Throwable throwable) {
                        throwable1.addSuppressed(throwable);
                     }
                  }

                  throw throwable1;
               }

               if (renderpass != null) {
                  renderpass.close();
               }

               matrix4fstack.popMatrix();
               var1.y();
            }
         }
      }
   }

   public void N(CallbackInfo var1) {
      if (!SodiumExtraClientMod.options().detailSettings.sky) {
         var1.cancel();
      }
   }

   private void N(float var1, class01421 var2, CallbackInfo var3) {
      if (!Iris.getPipelineManager().getPipeline().<Boolean>map(WorldRenderingPipeline::shouldRenderSun).orElse(true)) {
         var3.cancel();
      }
   }

   public void N(class03448 var1, float var2, class05363 var3, class06971 var4) {
      var4.N = var1.method_8597().m();
      if (var4.N != class07360.field_64385) {
         if (var4.N == class07360.field_64387) {
            class00917 class00917 = var1.R();
            if (class00917 != null) {
               var4.U = class00917.N(var2);
               var4.E = class00917.N();
               var4.W = class00917.y();
            }
         } else {
            class00579 class00579 = var3.U();
            var4.L = class00579.N(class00608.W, var2) * (float) (Math.PI / 180.0);
            var4.u = class00579.N(class00608.m, var2) * (float) (Math.PI / 180.0);
            var4.i = class00579.N(class00608.P, var2) * (float) (Math.PI / 180.0);
            var4.R = 1.0F - var1.method_8430(var2);
            var4.M = class00579.N(class00608.T, var2);
            var4.B = var3.U().N(class00608.z, var2);
            var4.Z = class00579.N(class00608.s, var2);
            var4.z = class00579.N(class00608.Z, var2);
            var4.y = this.N(var2, var1);
         }
      }
   }

   private static GpuBuffer N(String var0, class08388 var1) {
      VertexFormat vertexformat = class07835.Z;

      GpuBuffer gpubuffer;
      try (class02579 class02579 = class02579.N(4 * vertexformat.getVertexSize())) {
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, vertexformat);
         class07331.method_22912(-1.0F, 0.0F, -1.0F).method_22913(var1.method_4594(), var1.method_4593());
         class07331.method_22912(1.0F, 0.0F, -1.0F).method_22913(var1.method_4577(), var1.method_4593());
         class07331.method_22912(1.0F, 0.0F, 1.0F).method_22913(var1.method_4577(), var1.method_4575());
         class07331.method_22912(-1.0F, 0.0F, 1.0F).method_22913(var1.method_4594(), var1.method_4575());

         try (class02609 class02609 = class07331.y()) {
            gpubuffer = RenderSystem.getDevice().createBuffer(() -> var0, 32, class02609.N());
         }
      }

      return gpubuffer;
   }

   private boolean N(float var1, class03448 var2) {
      return ((class04453)class06202.Nq().T_4).method_5836(var1).B - var2.method_8401().N(var2) < 0.0;
   }

   public void N() {
      this.y(null);
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      matrix4fstack.pushMatrix();
      matrix4fstack.translate(0.0F, 12.0F, 0.0F);
      GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms().N(matrix4fstack, new Vector4f(0.0F, 0.0F, 0.0F, 1.0F), new Vector3f(), new Matrix4f());
      GpuTextureView gputextureview = class06202.Nq().e().u();
      GpuTextureView gputextureview1 = class06202.Nq().e().R();
      RenderPass renderpass = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(() -> "Sky dark", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

      try {
         renderpass.setPipeline(class08394.No);
         RenderSystem.bindDefaultUniforms(renderpass);
         renderpass.setUniform("DynamicTransforms", gpubufferslice);
         renderpass.setVertexBuffer(0, this.b);
         renderpass.draw(0, 10);
      } catch (Throwable throwable1) {
         if (renderpass != null) {
            try {
               renderpass.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (renderpass != null) {
         renderpass.close();
      }

      matrix4fstack.popMatrix();
   }

   private void N(class01421 var1, float var2, int var3, CallbackInfo var4) {
      this.N(WorldRenderingPhase.SUNSET);
   }

   private void N(float var1, class01421 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.y(var1, var2, null);
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.u(var1, var2, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
            matrix4fstack.pushMatrix();
            matrix4fstack.mul(var2.L().N());
            matrix4fstack.translate(0.0F, 100.0F, 0.0F);
            matrix4fstack.scale(30.0F, 1.0F, 30.0F);
            GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
               .N(matrix4fstack, new Vector4f(1.0F, 1.0F, 1.0F, var1), new Vector3f(), new Matrix4f());
            GpuTextureView gputextureview = class06202.Nq().e().u();
            GpuTextureView gputextureview1 = class06202.Nq().e().R();
            GpuBuffer gpubuffer = this.l.getIndexBuffer(6);
            RenderPass renderpass = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Sky sun", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

            try {
               renderpass.setPipeline(class08394.Ne);
               RenderSystem.bindDefaultUniforms(renderpass);
               renderpass.setUniform("DynamicTransforms", gpubufferslice);
               renderpass.bindTexture("Sampler0", this.P.method_71659(), this.P.method_75484());
               renderpass.setVertexBuffer(0, this.v);
               renderpass.setIndexBuffer(gpubuffer, this.l.getIndexType());
               renderpass.drawIndexed(0, 0, 6, 1);
            } catch (Throwable throwable1) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (renderpass != null) {
               renderpass.close();
            }

            matrix4fstack.popMatrix();
         }
      }
   }

   public void N(class01421 var1, float var2, float var3, float var4, class08165 var5, float var6, float var7) {
      var1.N();
      var1.N(class02058.u.N(-90.0F));
      this.N(var1, var2, var3, var4, var5, var6, var7, null);
      var1.N();
      var1.N(class02058.y.rotation(var2));
      this.N(var6, var1);
      var1.y();
      var1.N();
      var1.N(class02058.y.rotation(var3));
      this.N(var5, var6, var1);
      var1.y();
      if (var7 > 0.0F) {
         var1.N();
         var1.N(class02058.y.rotation(var4));
         this.y(var7, var1);
         var1.y();
      }

      var1.y();
   }

   private void N(class08165 var1, float var2, class01421 var3, CallbackInfo var4) {
      if (!Iris.getPipelineManager().getPipeline().<Boolean>map(WorldRenderingPipeline::shouldRenderMoon).orElse(true)) {
         var4.cancel();
      }
   }
}
