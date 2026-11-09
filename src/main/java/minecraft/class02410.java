package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderPass.RenderObject;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class class02410 {
   public static final class01894 N = class01894.y("textures/misc/forcefield.png");
   private boolean y = true;
   private double L;
   private double u;
   private double i;
   private double R;
   private double M;
   private double B;
   private final GpuBuffer Z = RenderSystem.getDevice().createBuffer(() -> "World border vertex buffer", 40, 16L * class07835.Z.getVertexSize());
   private final ShapeIndexBuffer z = RenderSystem.getSequentialBuffer(DrawMode.QUADS);

   public class02410() {
      super();
   }

   public void N(class06969 var1, class06889 var2, double var3, double var5) {
      if (!(var1.R <= 0.0)) {
         double d0 = var2.M;
         double d1 = var2.Z;
         float f = (float)var5;
         float f1 = class02566.L(var1.i) / 255.0F;
         float f2 = class02566.u(var1.i) / 255.0F;
         float f3 = class02566.i(var1.i) / 255.0F;
         float f4 = (float)(class07536.L() % 3000L) / 3000.0F;
         float f5 = (float)(-class04995.R(var2.B * 0.5));
         float f6 = f5 + f;
         if (this.N(var1)) {
            this.N(var1, var3, d1, d0, f, f6, f5);
         }

         class08918 class08918 = class06202.Nq().NO().y(N);
         RenderPipeline renderpipeline = class08394.NQ;
         class08066 class08066 = class06202.Nq().e();
         class08066 class08066x = ((class03063)class06202.Nq().B_2).b();
         GpuTextureView gputextureview;
         GpuTextureView gputextureview1;
         if (class08066x != null) {
            gputextureview = class08066x.u();
            gputextureview1 = class08066x.R();
         } else {
            gputextureview = class08066.u();
            gputextureview1 = class08066.R();
         }

         GpuBuffer gpubuffer = this.z.getIndexBuffer(6);
         GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
            .N(
               RenderSystem.getModelViewMatrix(),
               new Vector4f(f1, f2, f3, (float)var1.R),
               new Vector3f((float)(this.L - d0), (float)(-var2.B), (float)(this.u - d1)),
               new Matrix4f().translation(f4, f4, 0.0F)
            );
         RenderPass renderpass = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "World border", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

         try {
            renderpass.setPipeline(renderpipeline);
            RenderSystem.bindDefaultUniforms(renderpass);
            renderpass.setUniform("DynamicTransforms", gpubufferslice);
            renderpass.setIndexBuffer(gpubuffer, this.z.getIndexType());
            renderpass.bindTexture("Sampler0", class08918.method_71659(), class08918.method_75484());
            renderpass.setVertexBuffer(0, this.Z);
            ArrayList arraylist = new ArrayList();

            for (class06982 class06982 : var1.N(d0, d1)) {
               if (class06982.y() < var3) {
                  int ix = class06982.N().u();
                  arraylist.add(new RenderObject(0, this.Z, gpubuffer, this.z.getIndexType(), 6 * ix, 6));
               }
            }

            renderpass.drawMultipleIndexed(arraylist, null, null, Collections.emptyList(), this);
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

   private void N(class06969 var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      try (class02579 class02579 = class02579.N(class07835.Z.getVertexSize() * 4 * 4)) {
         double d0 = var1.N;
         double d1 = var1.y;
         double d2 = var1.L;
         double d3 = var1.u;
         double d4 = Math.max((double)class04995.N(var4 - var2), d2);
         double d5 = Math.min((double)class04995.L(var4 + var2), d3);
         float f = (class04995.N(d4) & 1) * 0.5F;
         float f1 = (float)(d5 - d4) / 2.0F;
         double d6 = Math.max((double)class04995.N(var6 - var2), d0);
         double d7 = Math.min((double)class04995.L(var6 + var2), d1);
         float f2 = (class04995.N(d6) & 1) * 0.5F;
         float f3 = (float)(d7 - d6) / 2.0F;
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, class07835.Z);
         class07331.method_22912(0.0F, -var8, (float)(d3 - d4)).method_22913(f2, var9);
         class07331.method_22912((float)(d7 - d6), -var8, (float)(d3 - d4)).method_22913(f3 + f2, var9);
         class07331.method_22912((float)(d7 - d6), var8, (float)(d3 - d4)).method_22913(f3 + f2, var10);
         class07331.method_22912(0.0F, var8, (float)(d3 - d4)).method_22913(f2, var10);
         class07331.method_22912(0.0F, -var8, 0.0F).method_22913(f, var9);
         class07331.method_22912(0.0F, -var8, (float)(d5 - d4)).method_22913(f1 + f, var9);
         class07331.method_22912(0.0F, var8, (float)(d5 - d4)).method_22913(f1 + f, var10);
         class07331.method_22912(0.0F, var8, 0.0F).method_22913(f, var10);
         class07331.method_22912((float)(d7 - d6), -var8, 0.0F).method_22913(f2, var9);
         class07331.method_22912(0.0F, -var8, 0.0F).method_22913(f3 + f2, var9);
         class07331.method_22912(0.0F, var8, 0.0F).method_22913(f3 + f2, var10);
         class07331.method_22912((float)(d7 - d6), var8, 0.0F).method_22913(f2, var10);
         class07331.method_22912((float)(d1 - d6), -var8, (float)(d5 - d4)).method_22913(f, var9);
         class07331.method_22912((float)(d1 - d6), -var8, 0.0F).method_22913(f1 + f, var9);
         class07331.method_22912((float)(d1 - d6), var8, 0.0F).method_22913(f1 + f, var10);
         class07331.method_22912((float)(d1 - d6), var8, (float)(d5 - d4)).method_22913(f, var10);

         try (class02609 class02609 = class07331.y()) {
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.Z.slice(), class02609.N());
         }

         this.i = d0;
         this.R = d1;
         this.M = d2;
         this.B = d3;
         this.L = d6;
         this.u = d4;
         this.y = false;
      }
   }

   public void N() {
      this.y = true;
   }

   private boolean N(class06969 var1) {
      return this.y || var1.N != this.i || var1.L != this.M || var1.y != this.R || var1.u != this.B;
   }

   public void N(class08057 var1, float var2, class06889 var3, double var4, class06969 var6) {
      var6.N = var1.N(var2);
      var6.y = var1.L(var2);
      var6.L = var1.y(var2);
      var6.u = var1.u(var2);
      if ((!(var3.M < var6.y - var4) || !(var3.M > var6.N + var4) || !(var3.Z < var6.u - var4) || !(var3.Z > var6.L + var4))
         && !(var3.M < var6.N - var4)
         && !(var3.M > var6.y + var4)
         && !(var3.Z < var6.L - var4)
         && !(var3.Z > var6.u + var4)) {
         var6.R = 1.0 - var1.y(var3.M, var3.Z) / var4;
         var6.R = Math.pow(var6.R, 4.0);
         var6.R = class04995.N(var6.R, 0.0, 1.0);
         var6.i = var1.y().N();
      } else {
         var6.R = 0.0;
      }
   }
}
