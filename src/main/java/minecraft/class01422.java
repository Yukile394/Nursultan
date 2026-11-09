package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSortingExtended;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01422 implements class01407 {
   protected final class02579 L;
   protected final SequencedMap<class07311, class02579> u;
   protected final Map<class07311, class07331> i = new HashMap<>();
   @Nullable
   protected class07311 R;
   private static final int N = 6;

   public void L() {
      if (this.R != null) {
         this.N(this.R);
         this.R = null;
      }
   }

   protected class01422(class02579 var1, SequencedMap<class07311, class02579> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public void u() {
      this.L();

      for (class07311 class07311 : this.u.keySet()) {
         this.N(class07311);
      }
   }

   private void y(class07311 var1, class07331 var2, CallbackInfo var3) {
      if (this.N()) {
         ImmediateState.renderWithExtendedVertexFormat = true;
      }
   }

   private static void y(long var0, int[] var2) {
      for (int ix : var2) {
         MemoryUtil.memPutShort(var0 + 0L, (short)(ix * 4 + 0));
         MemoryUtil.memPutShort(var0 + 2L, (short)(ix * 4 + 1));
         MemoryUtil.memPutShort(var0 + 4L, (short)(ix * 4 + 2));
         MemoryUtil.memPutShort(var0 + 6L, (short)(ix * 4 + 2));
         MemoryUtil.memPutShort(var0 + 8L, (short)(ix * 4 + 3));
         MemoryUtil.memPutShort(var0 + 10L, (short)(ix * 4 + 0));
         var0 += 12L;
      }
   }

   private static void N(long var0, int[] var2) {
      for (int ix : var2) {
         MemoryUtil.memPutInt(var0 + 0L, ix * 4 + 0);
         MemoryUtil.memPutInt(var0 + 4L, ix * 4 + 1);
         MemoryUtil.memPutInt(var0 + 8L, ix * 4 + 2);
         MemoryUtil.memPutInt(var0 + 12L, ix * 4 + 2);
         MemoryUtil.memPutInt(var0 + 16L, ix * 4 + 3);
         MemoryUtil.memPutInt(var0 + 20L, ix * 4 + 0);
         var0 += 24L;
      }
   }

   private static class02613 N(class02609 var0, class02579 var1, int[] var2) {
      IndexType indextype = var0.L().i();
      long ix = var1.y(var2.length * 6 * indextype.size);
      if (indextype == IndexType.SHORT) {
         y(ix, var2);
      } else {
         if (indextype != IndexType.INT) {
            throw new UnsupportedOperationException();
         }

         N(ix, var2);
      }

      return var1.N();
   }

   private static void N(class02609 var0, class02579 var1, VertexSortingExtended var2) {
      class02583 class02583 = var0.L();
      if (class02583.u() == DrawMode.QUADS) {
         int[] aint = VertexSorters.sort(var0.N(), class02583.y(), class02583.N().getVertexSize(), var2);
         class02613 class02613 = N(var0, var1, aint);
         var0.sodium$setIndexBuffer(class02613);
      }
   }

   private boolean N() {
      return !ImmediateState.isRenderingLevel;
   }

   public void N(class07311 var1) {
      class07331 class07331 = this.i.remove(var1);
      if (class07331 != null) {
         this.N(var1, class07331);
      }
   }

   private void N(class07311 var1, class07331 var2) {
      class02609 class02609 = var2.N();
      if (class02609 != null) {
         if (var1.method_60894()) {
            class02579 class02579 = this.u.getOrDefault(var1, this.L);
            class03337 class03337 = RenderSystem.getProjectionType().N();
            this.N(class02609, class02579, class03337, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_9801, net.minecraft.class_9799, net.minecraft.class_8251]");
               return ((class02609)var0[0]).N((class02579)var0[1], (class03337)var0[2]);
            });
         }

         this.N(var1, var2, null);
         var1.method_60895(class02609);
         this.y(var1, var2, null);
      }

      if (var1.equals(this.R)) {
         this.R = null;
      }
   }

   private class07331 N(class02579 var1, DrawMode var2, VertexFormat var3, Operation var4) {
      ImmediateState.skipExtension.set(this.N());
      class07331 class07331 = (class07331)var4.call(new Object[]{var1, var2, var3});
      ImmediateState.skipExtension.set(false);
      return class07331;
   }

   private void N(class07311 var1, class07331 var2, CallbackInfo var3) {
      if (this.N()) {
         ImmediateState.renderWithExtendedVertexFormat = false;
      }
   }

   private class02578 N(class02609 var1, class02579 var2, class03337 var3, Operation var4) {
      if (var3 instanceof VertexSortingExtended vertexsortingextended) {
         N(var1, var2, vertexsortingextended);
         return null;
      } else {
         return (class02578)var4.call(new Object[]{var1, var2, var3});
      }
   }

   @Override
   public class01391 method_73477(class07311 var1) {
      class07331 class07331xx = this.i.get(var1);
      if (class07331xx != null && !var1.method_43332()) {
         this.N(var1, class07331xx);
         class07331xx = null;
      }

      if (class07331xx != null) {
         return class07331xx;
      } else {
         class02579 class02579xx = this.u.get(var1);
         if (class02579xx != null) {
            VertexFormat vertexformat = var1.method_23031();
            DrawMode drawmode = var1.method_23033();
            class07331 class07331x = this.N(
               class02579xx,
               drawmode,
               vertexformat,
               var0 -> {
                  WrapOperationRuntime.checkArgumentCount(
                     var0, 3, "[net.minecraft.class_9799, com.mojang.blaze3d.vertex.VertexFormat$class_5596, com.mojang.blaze3d.vertex.VertexFormat]"
                  );
                  return new class07331((class02579)var0[0], (DrawMode)var0[1], (VertexFormat)var0[2]);
               }
            );
            Object object2 = null;
            Object object1 = null;
            class07331xx = class07331x;
         } else {
            if (this.R != null) {
               this.N(this.R);
            }

            class02579 class02579x = this.L;
            VertexFormat vertexformat1 = var1.method_23031();
            DrawMode drawmode1 = var1.method_23033();
            class02579 class02579xx = class02579x;
            class07331 class07331x = this.N(
               class02579xx,
               drawmode1,
               vertexformat1,
               var0 -> {
                  WrapOperationRuntime.checkArgumentCount(
                     var0, 3, "[net.minecraft.class_9799, com.mojang.blaze3d.vertex.VertexFormat$class_5596, com.mojang.blaze3d.vertex.VertexFormat]"
                  );
                  return new class07331((class02579)var0[0], (DrawMode)var0[1], (VertexFormat)var0[2]);
               }
            );
            class02579x = null;
            Object object = null;
            class07331xx = class07331x;
            this.R = var1;
         }

         this.i.put(var1, class07331xx);
         return class07331xx;
      }
   }
}
