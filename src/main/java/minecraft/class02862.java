package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import net.caffeinemc.mods.sodium.mixin.frapi.ItemRendererAccessor;

public class class02862 implements ItemRendererAccessor {
   public static final class01894 N = class01894.y("textures/misc/enchanted_glint_armor.png");
   public static final class01894 y = class01894.y("textures/misc/enchanted_glint_item.png");
   public static final float L = 0.5F;
   public static final float u = 0.75F;
   public static final float i = 0.0078125F;
   public static final int R = -1;
   private static final ThreadLocal M;

   public class02862() {
      super();
   }

   private static class01391 y(class01407 var0, class07311 var1, class01423 var2) {
      return class05921.N(new class01390(var0.method_73477(N(var1) ? class06851.M() : class06851.B()), var2, 0.0078125F), var0.method_73477(var1));
   }

   private static void N(class01423 var0, VertexBufferWriter var1, List var2, int[] var3, int var4, int var5) {
      for (int ix = 0; ix < var2.size(); ix++) {
         class02022 class02022 = (class02022)var2.get(ix);
         BakedQuadView bakedquadview = class02022;
         int j = -1;
         if (class02022.N()) {
            j = ColorARGB.toABGR(N(var3, class02022.z()));
         }

         BakedModelEncoder.writeQuadVertices(var1, var0, bakedquadview, j, var4, var5, BakedModelEncoder.shouldMultiplyAlpha());
         if (bakedquadview.getSprite() != null) {
            SpriteUtil.INSTANCE.markSpriteActive(bakedquadview.getSprite());
         }
      }
   }

   private static void N(class01421 var0, class01391 var1, List var2, int[] var3, int var4, int var5, Operation var6) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var1);
      if (vertexbufferwriter == null) {
         var6.call(new Object[]{var0, var1, var2, var3, var4, var5});
      } else {
         if (!var2.isEmpty()) {
            N(var0.L(), vertexbufferwriter, var2, var3, var4, var5);
         }
      }
   }

   public static void N(
      class03662 var0, class01421 var1, class01407 var2, int var3, int var4, int[] var5, List<class02022> var6, class07311 var7, class08915 var8
   ) {
      class01391 class01391;
      if (var8 == class08915.field_55343) {
         class01423 class01423 = var1.L().u();
         if (var0 == class03662.field_4317) {
            class02054.N(class01423.N(), 0.5F);
         } else if (var0.y()) {
            class02054.N(class01423.N(), 0.75F);
         }

         class01391 = y(var2, var7, class01423);
      } else {
         class01391 = N(var2, var7, true, var8 != class08915.field_55341);
      }

      N(var1, class01391, var6, var5, var3, var4, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 6, "[net.minecraft.class_4587, net.minecraft.class_4588, java.util.List, int[], int, int]");
         N((class01421)var0x[0], (class01391)var0x[1], (List<class02022>)var0x[2], (int[])var0x[3], (Integer)var0x[4], (Integer)var0x[5]);
         return (Void)null;
      });
   }

   public static class01391 N(class01407 var0, class07311 var1, boolean var2, boolean var3) {
      if (var3) {
         return N(var1)
            ? class05921.N(var0.method_73477(class06851.M()), var0.method_73477(var1))
            : class05921.N(var0.method_73477(var2 ? class06851.B() : class06851.Z()), var0.method_73477(var1));
      } else {
         return var0.method_73477(var1);
      }
   }

   public static List<class07311> N(class07311 var0, boolean var1, boolean var2) {
      if (var2) {
         return N(var0) ? List.of(var0, class06851.M()) : List.of(var0, var1 ? class06851.B() : class06851.Z());
      } else {
         return List.of(var0);
      }
   }

   private static boolean N(class07311 var0) {
      return class06202.C() && (var0 == class05911.z() || var0 == class05911.U());
   }

   private static int N(int[] var0, int var1) {
      return var1 >= 0 && var1 < var0.length ? var0[var1] : -1;
   }

   private static void N(class01421 var0, class01391 var1, List<class02022> var2, int[] var3, int var4, int var5) {
      class01423 class01423 = var0.L();

      for (class02022 class02022 : var2) {
         float f;
         float f1;
         float f2;
         float f3;
         if (class02022.N()) {
            int ix = N(var3, class02022.z());
            f = class02566.y(ix) / 255.0F;
            f1 = class02566.L(ix) / 255.0F;
            f2 = class02566.u(ix) / 255.0F;
            f3 = class02566.i(ix) / 255.0F;
         } else {
            f = 1.0F;
            f1 = 1.0F;
            f2 = 1.0F;
            f3 = 1.0F;
         }

         var1.N(class01423, class02022, f1, f2, f3, f, var4, var5);
      }
   }
}
