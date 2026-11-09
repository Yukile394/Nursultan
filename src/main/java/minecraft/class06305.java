package minecraft;

import Nursultan.class10574;
import Nursultan.class11300;
import Nursultan.class11898;
import Nursultan.class11927;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06305 extends class01323 {
   public static final class01894 N = class01894.y("textures/gui/title/mojangstudios.png");
   private static final int u = class02566.y(255, 239, 50, 61);
   private static final int i = class02566.y(255, 0, 0, 0);
   private static IntSupplier R = () -> ((class05630)class06202.Nq().i_7).N().method_41753() ? i : u;
   private static final int M = 240;
   private static final float B = 60.0F;
   private static final int Z = 60;
   private static final int z = 120;
   private static final float U = 0.0625F;
   private static final float E = 0.95F;
   public static final long y = 1000L;
   public static final long L = 500L;
   private final class06202 W;
   private final class06164 m;
   private final Consumer<Optional<Throwable>> P;
   private final boolean s;
   private float T;
   private long b = -1L;
   private long j = -1L;

   private boolean L() {
      return !this.s || this.j > -1L && class07536.L() - this.j >= 1000L;
   }

   public class06305(class06202 var1, class06164 var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      super();
      this.W = var1;
      this.m = var2;
      this.P = var3;
      this.s = var4;
   }

   private float y(float var1) {
      return 400.0F;
   }

   @Override
   public void y() {
      if (this.b == -1L && this.m.L() && this.L()) {
         try {
            this.m.u();
            this.P.accept(Optional.empty());
         } catch (Throwable throwable) {
            this.P.accept(Optional.of(throwable));
         }

         this.b = class07536.L();
         if ((class05096)this.W.v_3 != null) {
            class08844 class08844 = this.W.Nt();
            ((class05096)this.W.v_3).method_25423(class08844.P(), class08844.s());
         }
      }
   }

   private float N(float var1) {
      return 400.0F;
   }

   private static int N(int var0, int var1) {
      return var0 & 16777215 | var1 << 24;
   }

   public static void N(class08627 var0) {
      var0.N(N, (class08361)(new class10574()));
   }

   private static void N(CallbackInfo var0) {
      R = () -> 1316892;
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5, float var6) {
      int ix = class04995.u((var4 - var2 - 2) * this.T);
      int jx = class02566.y(Math.round(var6 * 255.0F), 255, 255, 255);
      jx = this.N(jx, var1, var2, var3, var4, var5, var6);
      var1.N(var2 + 2, var3 + 2, var2 + ix, var5 - 2, jx);
      jx = this.N(jx);
      var1.N(var2 + 1, var3, var4 - 1, var3 + 1, jx);
      var1.N(var2 + 1, var5, var4 - 1, var5 - 1, jx);
      var1.N(var2, var3, var2 + 1, var5, jx);
      var1.N(var4, var3, var4 - 1, var5, jx);
   }

   @Override
   public boolean N() {
      return true;
   }

   private int N(int var1, class01054 var2, int var3, int var4, int var5, int var6, float var7) {
      int ix = var1 & 0xFF000000;
      var2.N(var3 + 1, var4 + 1, var5 - 1, var6 - 1, 1316892 | ix);
      return 9022463 | ix;
   }

   private int N(int var1) {
      return 3158838 | var1 & 0xFF000000;
   }

   private void N(
      class01054 var1,
      RenderPipeline var2,
      class01894 var3,
      int var4,
      int var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      Operation var15
   ) {
      int ix = class02566.y(var14);
      class11927 class11927 = (var14x, var15x, var16x, var17x) -> {
         if (var15x > 0.0F || var16x > 0.0F || var17x > 0.0F) {
            var15.call(
               new Object[]{
                  var1,
                  var14x,
                  var3,
                  var4,
                  var5,
                  var6,
                  var7,
                  var8,
                  var9,
                  var10,
                  var11,
                  var12,
                  var13,
                  class02566.y(ix, class02566.u(Math.max(var15x, 0.0F)), class02566.u(Math.max(var16x, 0.0F)), class02566.u(Math.max(var17x, 0.0F)))
               }
            );
         }
      };
      float f = 255.0F;
      float f1 = class11300.u(1316892) / f;
      float f2 = class11300.N(1316892) / f;
      float f3 = class11300.i(1316892) / f;
      float f4 = class11300.u(16777215) / f;
      float f5 = class11300.N(16777215) / f;
      float f6 = class11300.i(16777215) / f;
      class11927.call((RenderPipeline)class11898.N_0, f1 - f4, f2 - f5, f3 - f6);
      class11927.call(var2, f4 - f1, f5 - f2, f6 - f3);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      int ix = var1.N();
      int jx = var1.y();
      long k = class07536.L();
      if (this.s && this.j == -1L) {
         this.j = k;
      }

      float f = this.b > -1L ? (float)(k - this.b) / this.y(1000.0F) : -1.0F;
      float f1 = this.j > -1L ? (float)(k - this.j) / this.N(500.0F) : -1.0F;
      float f2;
      if (f >= 1.0F) {
         if ((class05096)this.W.v_3 != null) {
            ((class05096)this.W.v_3).method_47413(var1, 0, 0, var4);
         } else {
            ((class01056)this.W.i_6).y();
         }

         int l = class04995.u((1.0F - class04995.N(f - 1.0F, 0.0F, 1.0F)) * 255.0F);
         var1.L();
         var1.N(0, 0, ix, jx, N(R.getAsInt(), l));
         f2 = 1.0F - class04995.N(f - 1.0F, 0.0F, 1.0F);
      } else if (this.s) {
         if ((class05096)this.W.v_3 != null && f1 < 1.0F) {
            ((class05096)this.W.v_3).method_47413(var1, var2, var3, var4);
         } else {
            ((class01056)this.W.i_6).y();
         }

         int i3 = class04995.L(class04995.N((double)f1, 0.15, 1.0) * 255.0);
         var1.L();
         var1.N(0, 0, ix, jx, N(R.getAsInt(), i3));
         f2 = class04995.N(f1, 0.0F, 1.0F);
      } else {
         int j3 = R.getAsInt();
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.W.e().L(), j3);
         f2 = 1.0F;
      }

      int k3 = (int)(var1.N() * 0.5);
      int i1 = (int)(var1.y() * 0.5);
      double d0 = Math.min(var1.N() * 0.75, (double)var1.y()) * 0.25;
      int j1 = (int)(d0 * 0.5);
      int k1 = (int)(d0 * 4.0 * 0.5);
      int l1 = class02566.y(f2);
      int l3 = k3 - k1;
      int i4 = i1 - j1;
      int j4 = (int)d0;
      byte b3 = 120;
      byte b2 = 120;
      byte b1 = 60;
      byte b0 = 120;
      int l2 = j4;
      float f5 = 0.0F;
      float f4 = -0.0625F;
      int k2 = i4;
      int j2 = l3;
      class01894 class01894 = N;
      RenderPipeline renderpipeline = class08394.ND;
      this.N(
         var1,
         renderpipeline,
         class01894,
         j2,
         k2,
         f4,
         f5,
         k1,
         l2,
         b0,
         b1,
         b2,
         b3,
         l1,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0,
               14,
               "[net.minecraft.class_332, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_2960, int, int, float, float, int, int, int, int, int, int, int]"
            );
            ((class01054)var0[0])
               .N(
                  (RenderPipeline)var0[1],
                  (class01894)var0[2],
                  (Integer)var0[3],
                  (Integer)var0[4],
                  (Float)var0[5],
                  (Float)var0[6],
                  (Integer)var0[7],
                  (Integer)var0[8],
                  (Integer)var0[9],
                  (Integer)var0[10],
                  (Integer)var0[11],
                  (Integer)var0[12],
                  (Integer)var0[13]
               );
            return (Void)null;
         }
      );
      i4 = i1 - j1;
      j4 = (int)d0;
      b3 = 120;
      b2 = 120;
      b1 = 60;
      b0 = 120;
      l2 = j4;
      f5 = 60.0F;
      f4 = 0.0625F;
      k2 = i4;
      class01894 = N;
      renderpipeline = class08394.ND;
      this.N(
         var1,
         renderpipeline,
         class01894,
         k3,
         k2,
         f4,
         f5,
         k1,
         l2,
         b0,
         b1,
         b2,
         b3,
         l1,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0,
               14,
               "[net.minecraft.class_332, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_2960, int, int, float, float, int, int, int, int, int, int, int]"
            );
            ((class01054)var0[0])
               .N(
                  (RenderPipeline)var0[1],
                  (class01894)var0[2],
                  (Integer)var0[3],
                  (Integer)var0[4],
                  (Float)var0[5],
                  (Float)var0[6],
                  (Integer)var0[7],
                  (Integer)var0[8],
                  (Integer)var0[9],
                  (Integer)var0[10],
                  (Integer)var0[11],
                  (Integer)var0[12],
                  (Integer)var0[13]
               );
            return (Void)null;
         }
      );
      int i2 = (int)(var1.y() * 0.8325);
      float f3 = this.m.y();
      this.T = class04995.N(this.T * 0.95F + f3 * 0.050000012F, 0.0F, 1.0F);
      if (f < 1.0F) {
         this.N(var1, ix / 2 - k1, i2 - 5, ix / 2 + k1, i2 + 5, 1.0F - class04995.N(f, 0.0F, 1.0F));
      }

      if (f >= 2.0F) {
         this.W.N(null);
      }
   }
}
