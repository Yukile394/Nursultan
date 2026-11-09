package minecraft;

import java.util.List;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.render.frapi.render.SimpleBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import net.caffeinemc.mods.sodium.client.util.DirectionUtil;
import net.caffeinemc.mods.sodium.mixin.frapi.ModelBlockRendererAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class02020 implements ModelBlockRendererAccessor, FabricBlockModelRenderer {
   private static final class07211[] y = class07211.values();
   private final class01587 L;
   private static final int u = 100;
   static final ThreadLocal<class02029> N = ThreadLocal.withInitial(class02029::new);
   private static final ThreadLocal i;
   private static final ThreadLocal R;

   public void L(class07295 var1, List<class08877> var2, class00500 var3, class07209 var4, class01421 var5, class01391 var6, boolean var7, int var8) {
      class02023 class02023 = new class02023();
      int ix = 0;
      int j = 0;

      for (class08877 class08877 : var2) {
         int k = y.length;

         for (int l = 0; l < k; l++) {
            class07211 class07211 = y[l];
            int i1 = 1 << class07211.ordinal();
            boolean flag = (ix & i1) == 1;
            boolean flag1 = (j & i1) == 1;
            if (!flag || flag1) {
               List<class02022> list1 = class08877.N(class07211);
               if (!list1.isEmpty()) {
                  class07218 class07218 = class02023.N.N(var4, class07211);
                  if (!flag) {
                     flag1 = N(var1, var3, var7, class07211, class07218);
                     ix |= i1;
                     if (flag1) {
                        j |= i1;
                     }
                  }

                  if (flag1) {
                     int j1 = class02023.B.N(var3, var1, class07218);
                     this.N(var1, var3, var4, j1, var8, false, var5, var6, list1, class02023);
                  }
               }
            }
         }

         List<class02022> list = class08877.N(null);
         if (!list.isEmpty()) {
            this.N(var1, var3, var4, -1, var8, true, var5, var6, list, class02023);
         }
      }
   }

   public class02020(class01587 var1) {
      super();
      this.L = var1;
   }

   public static void y() {
      N.get().y();
   }

   public void y(class07295 var1, List<class08877> var2, class00500 var3, class07209 var4, class01421 var5, class01391 var6, boolean var7, int var8) {
      class02032 class02032 = new class02032();
      int ix = 0;
      int j = 0;

      for (class08877 class08877 : var2) {
         int k = y.length;

         for (int l = 0; l < k; l++) {
            class07211 class07211 = y[l];
            int i1 = 1 << class07211.ordinal();
            boolean flag = (ix & i1) == 1;
            boolean flag1 = (j & i1) == 1;
            if (!flag || flag1) {
               List<class02022> list1 = class08877.N(class07211);
               if (!list1.isEmpty()) {
                  if (!flag) {
                     flag1 = N(var1, var3, var7, class07211, class02032.N.N(var4, class07211));
                     ix |= i1;
                     if (flag1) {
                        j |= i1;
                     }
                  }

                  if (flag1) {
                     this.N(var1, var3, var4, var5, var6, list1, class02032, var8);
                  }
               }
            }
         }

         List<class02022> list = class08877.N(null);
         if (!list.isEmpty()) {
            this.N(var1, var3, var4, var5, var6, list, class02032, var8);
         }
      }
   }

   private static void N(class01423 var0, VertexBufferWriter var1, int var2, List var3, int var4, int var5) {
      for (int ix = 0; ix < var3.size(); ix++) {
         var class02022 = (class02022 & BakedQuadView)var3.get(ix);
         int j = class02022.hasColor() ? var2 : -1;
         BakedModelEncoder.writeQuadVertices(var1, var0, class02022, j, var4, var5, false);
         if (class02022.getSprite() != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class02022.getSprite());
         }
      }
   }

   private void N(
      class07295 var1, class00500 var2, class07209 var3, class01391 var4, class01423 var5, class02022 var6, Object var7, int var8, CallbackInfo var9
   ) {
      if (var6.E() != null) {
         SpriteUtil.INSTANCE.markSpriteActive(var6.E());
      }
   }

   public static void N(class01423 var0, class01391 var1, class08887 var2, float var3, float var4, float var5, int var6, int var7) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, var2, var3, var4, var5, var6, var7, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         ((SimpleBlockRenderContext)SimpleBlockRenderContext.POOL.get())
            .bufferModel(var0, var1x -> var1, var2, var3, var4, var5, var6, var7, class02730.field_52611, class07209.field_10980, class00869.N.W());
      }
   }

   private static void N(class01423 var0, class01391 var1, class08887 var2, float var3, float var4, float var5, int var6, int var7, CallbackInfo var8) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var1);
      if (vertexbufferwriter != null) {
         var8.cancel();
         class06069 class06069 = (class06069)i.get();
         var3 = class04995.N(var3, 0.0F, 1.0F);
         var4 = class04995.N(var4, 0.0F, 1.0F);
         var5 = class04995.N(var5, 0.0F, 1.0F);
         int ix = ColorABGR.pack(var3, var4, var5, 1.0F);
         class06069.N(42L);
         List list = (List)R.get();
         list.clear();
         var2.method_68513(class06069, list);

         for (class08877 class08877 : list) {
            int j = DirectionUtil.ALL_DIRECTIONS.length;

            for (int k = 0; k < j; k++) {
               class07211 class07211 = DirectionUtil.ALL_DIRECTIONS[k];
               List<class02022> list2 = class08877.N(class07211);
               if (!list2.isEmpty()) {
                  N(var0, vertexbufferwriter, ix, list2, var6, var7);
               }
            }

            List<class02022> list1 = class08877.N(null);
            if (!list1.isEmpty()) {
               N(var0, vertexbufferwriter, ix, list1, var6, var7);
            }
         }
      }
   }

   private void N(class07295 var1, class00500 var2, class07209 var3, class01391 var4, class01423 var5, class02022 var6, class02023 var7, int var8) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, null);
      int ix = var6.z();
      float f;
      float f1;
      float f2;
      if (ix != -1) {
         int j;
         if (var7.R == ix) {
            j = var7.M;
         } else {
            j = this.L.N(var2, var1, var3, ix);
            var7.R = ix;
            var7.M = j;
         }

         f = class02566.m(j);
         f1 = class02566.P(j);
         f2 = class02566.s(j);
      } else {
         f = 1.0F;
         f1 = 1.0F;
         f2 = 1.0F;
      }

      var4.N(var5, var6, var7.u, f, f1, f2, 1.0F, var7.i, var8);
   }

   private void N(class07295 var1, class00500 var2, class07209 var3, class01421 var4, class01391 var5, List<class02022> var6, class02032 var7, int var8) {
      for (class02022 class02022 : var6) {
         N(var1, var2, var3, class02022, var7);
         var7.N(var1, var2, var3, class02022.U(), class02022.W());
         this.N(var1, var2, var3, var5, var4.L(), class02022, var7, var8);
      }
   }

   private static boolean N(class07295 var0, class00500 var1, boolean var2, class07211 var3, class07209 var4) {
      if (!var2) {
         return true;
      } else {
         class00500 class00500 = var0.method_8320(var4);
         return class00891.N(var1, class00500, var3);
      }
   }

   public void N(class07295 var1, List<class08877> var2, class00500 var3, class07209 var4, class01421 var5, class01391 var6, boolean var7, int var8) {
      if (!var2.isEmpty()) {
         boolean flag = class06202.yb() && var3.m() == 0 && ((class08877)var2.getFirst()).y();
         var5.N(var3.N(var4));

         try {
            if (flag) {
               this.y(var1, var2, var3, var4, var5, var6, var7, var8);
            } else {
               this.L(var1, var2, var3, var4, var5, var6, var7, var8);
            }
         } catch (Throwable throwable) {
            class07080 class07080 = class07080.N(throwable, "Tesselating block model");
            class07074 class07074 = class07080.N("Block model being tesselated");
            class07074.N(class07074, var1, var4, var3);
            class07074.N("Using AO", flag);
            throw new class07878(class07080);
         }
      }
   }

   public static void N() {
      N.get().N();
   }

   private static void N(class01423 var0, class01391 var1, float var2, float var3, float var4, List<class02022> var5, int var6, int var7) {
      for (class02022 class02022 : var5) {
         float f;
         float f1;
         float f2;
         if (class02022.N()) {
            f = class04995.N(var2, 0.0F, 1.0F);
            f1 = class04995.N(var3, 0.0F, 1.0F);
            f2 = class04995.N(var4, 0.0F, 1.0F);
         } else {
            f = 1.0F;
            f1 = 1.0F;
            f2 = 1.0F;
         }

         var1.N(var0, class02022, f, f1, f2, 1.0F, var6, var7);
      }
   }

   private void N(
      class07295 var1,
      class00500 var2,
      class07209 var3,
      int var4,
      int var5,
      boolean var6,
      class01421 var7,
      class01391 var8,
      List<class02022> var9,
      class02023 var10
   ) {
      for (class02022 class02022 : var9) {
         if (var6) {
            N(var1, var2, var3, class02022, var10);
            Object object = var10.y ? var10.N.N(var3, class02022.U()) : var3;
            var4 = var10.B.N(var2, var1, (class07209)object);
         }

         float f = var1.method_24852(class02022.U(), class02022.W());
         var10.u[0] = f;
         var10.u[1] = f;
         var10.u[2] = f;
         var10.u[3] = f;
         var10.i[0] = var4;
         var10.i[1] = var4;
         var10.i[2] = var4;
         var10.i[3] = var4;
         this.N(var1, var2, var3, var8, var7.L(), class02022, var10, var5);
      }
   }

   public static void N(class07295 var0, class00500 var1, class07209 var2, class02022 var3, class02023 var4) {
      float f = 32.0F;
      float f1 = 32.0F;
      float f2 = 32.0F;
      float f3 = -32.0F;
      float f4 = -32.0F;
      float f5 = -32.0F;

      for (int ix = 0; ix < 4; ix++) {
         Vector3fc vector3fc = var3.N(ix);
         float f6 = vector3fc.x();
         float f7 = vector3fc.y();
         float f8 = vector3fc.z();
         f = Math.min(f, f6);
         f1 = Math.min(f1, f7);
         f2 = Math.min(f2, f8);
         f3 = Math.max(f3, f6);
         f4 = Math.max(f4, f7);
         f5 = Math.max(f5, f8);
      }

      if (var4 instanceof class02032 class02032) {
         class02032.Z[class02010.field_4215.field_58168] = f;
         class02032.Z[class02010.field_4219.field_58168] = f3;
         class02032.Z[class02010.field_4210.field_58168] = f1;
         class02032.Z[class02010.field_4212.field_58168] = f4;
         class02032.Z[class02010.field_4211.field_58168] = f2;
         class02032.Z[class02010.field_4213.field_58168] = f5;
         class02032.Z[class02010.field_4216.field_58168] = 1.0F - f;
         class02032.Z[class02010.field_4214.field_58168] = 1.0F - f3;
         class02032.Z[class02010.field_4220.field_58168] = 1.0F - f1;
         class02032.Z[class02010.field_4217.field_58168] = 1.0F - f4;
         class02032.Z[class02010.field_4218.field_58168] = 1.0F - f2;
         class02032.Z[class02010.field_4221.field_58168] = 1.0F - f5;
      }

      float f9 = 1.0E-4F;
      float f10 = 0.9999F;

      var4.L = switch (var3.U()) {
         case field_11033, field_11036 -> f >= 1.0E-4F || f2 >= 1.0E-4F || f3 <= 0.9999F || f5 <= 0.9999F;
         case field_11043, field_11035 -> f >= 1.0E-4F || f1 >= 1.0E-4F || f3 <= 0.9999F || f4 <= 0.9999F;
         case field_11039, field_11034 -> f1 >= 1.0E-4F || f2 >= 1.0E-4F || f4 <= 0.9999F || f5 <= 0.9999F;
      };

      var4.y = switch (var3.U()) {
         case field_11033 -> f1 == f4 && (f1 < 1.0E-4F || var1.W(var0, var2));
         case field_11036 -> f1 == f4 && (f4 > 0.9999F || var1.W(var0, var2));
         case field_11043 -> f2 == f5 && (f2 < 1.0E-4F || var1.W(var0, var2));
         case field_11035 -> f2 == f5 && (f5 > 0.9999F || var1.W(var0, var2));
         case field_11039 -> f == f3 && (f < 1.0E-4F || var1.W(var0, var2));
         case field_11034 -> f == f3 && (f3 > 0.9999F || var1.W(var0, var2));
      };
   }
}
