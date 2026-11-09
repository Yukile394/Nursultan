package minecraft;

import java.util.Set;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.render.immediate.model.EntityRenderer;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ModelCuboid;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01687 {
   public final class01706[] N;
   public float y;
   public final float L;
   public final float u;
   public final float i;
   public final float R;
   public final float M;
   private ModelCuboid B;

   public class01687(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      float var13,
      float var14,
      Set<class07211> var15
   ) {
      super();
      this.N(this, var3, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
      this.L = var4;
      this.u = var5;
      this.i = var3 + var6;
      this.R = var4 + var7;
      this.M = var5 + var8;
      this.N = new class01706[var15.size()];
      float f = var3 + var6;
      float f1 = var4 + var7;
      float f2 = var5 + var8;
      var3 -= var9;
      var4 -= var10;
      var5 -= var11;
      f += var9;
      f1 += var10;
      f2 += var11;
      if (var12) {
         float f3 = f;
         f = var3;
         var3 = f3;
      }

      class01699 class01699xxx = new class01699(var3, var4, var5, 0.0F, 0.0F);
      class01699 class01699x = new class01699(f, var4, var5, 0.0F, 8.0F);
      class01699 class01699xx = new class01699(f, f1, var5, 8.0F, 8.0F);
      class01699 class01699xxx = new class01699(var3, f1, var5, 8.0F, 0.0F);
      class01699 class01699xxxx = new class01699(var3, var4, f2, 0.0F, 0.0F);
      class01699 class01699xxxxx = new class01699(f, var4, f2, 0.0F, 8.0F);
      class01699 class01699xxxxxx = new class01699(f, f1, f2, 8.0F, 8.0F);
      class01699 class01699xxxxxxx = new class01699(var3, f1, f2, 8.0F, 0.0F);
      float f4 = var1;
      float f5 = var1 + var8;
      float f6 = var1 + var8 + var6;
      float f7 = var1 + var8 + var6 + var6;
      float f8 = var1 + var8 + var6 + var8;
      float f9 = var1 + var8 + var6 + var8 + var6;
      float f10 = var2;
      float f11 = var2 + var8;
      float f12 = var2 + var8 + var7;
      int ix = 0;
      if (var15.contains(class07211.field_11033)) {
         this.N[ix++] = new class01706(
            new class01699[]{class01699xxxxx, class01699xxxx, class01699xxx, class01699x}, f5, f10, f6, f11, var13, var14, var12, class07211.field_11033
         );
      }

      if (var15.contains(class07211.field_11036)) {
         this.N[ix++] = new class01706(
            new class01699[]{class01699xx, class01699xxx, class01699xxxxxxx, class01699xxxxxx}, f6, f11, f7, f10, var13, var14, var12, class07211.field_11036
         );
      }

      if (var15.contains(class07211.field_11039)) {
         this.N[ix++] = new class01706(
            new class01699[]{class01699xxx, class01699xxxx, class01699xxxxxxx, class01699xxx}, f4, f11, f5, f12, var13, var14, var12, class07211.field_11039
         );
      }

      if (var15.contains(class07211.field_11043)) {
         this.N[ix++] = new class01706(
            new class01699[]{class01699x, class01699xxx, class01699xxx, class01699xx}, f5, f11, f6, f12, var13, var14, var12, class07211.field_11043
         );
      }

      if (var15.contains(class07211.field_11034)) {
         this.N[ix++] = new class01706(
            new class01699[]{class01699xxxxx, class01699x, class01699xx, class01699xxxxxx}, f6, f11, f8, f12, var13, var14, var12, class07211.field_11034
         );
      }

      if (var15.contains(class07211.field_11035)) {
         this.N[ix] = new class01706(
            new class01699[]{class01699xxxx, class01699xxxxx, class01699xxxxxx, class01699xxxxxxx},
            f8,
            f11,
            f9,
            f12,
            var13,
            var14,
            var12,
            class07211.field_11035
         );
      }
   }

   private void N(class01423 var1, class01391 var2, int var3, int var4, int var5, CallbackInfo var6) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var2);
      if (vertexbufferwriter != null) {
         var6.cancel();
         EntityRenderer.renderCuboid(var1, vertexbufferwriter, this.B, var3, var4, ColorARGB.toABGR(var5));
      }
   }

   private void N(
      class01687 var1,
      float var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      boolean var14,
      float var15,
      float var16,
      Set var17
   ) {
      this.B = new ModelCuboid(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
      this.y = var2;
   }

   public void N(class01423 var1, class01391 var2, int var3, int var4, int var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         Matrix4f matrix4f = var1.N();
         Vector3f vector3f = new Vector3f();

         for (class01706 class01706 : this.N) {
            Vector3f vector3f1 = var1.N(class01706.y(), vector3f);
            float f = vector3f1.x();
            float f1 = vector3f1.y();
            float f2 = vector3f1.z();

            for (class01699 class01699 : class01706.N()) {
               float f3 = class01699.N();
               float f4 = class01699.y();
               float f5 = class01699.L();
               Vector3f vector3f2 = matrix4f.transformPosition(f3, f4, f5, vector3f);
               var2.N(vector3f2.x(), vector3f2.y(), vector3f2.z(), var5, class01699.M(), class01699.B(), var4, var3, f, f1, f2);
            }
         }
      }
   }
}
