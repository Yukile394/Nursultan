package minecraft;

import Nursultan.class10944;
import Nursultan.class10946;
import Nursultan.class10948;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.viaversion.viafabricplus.features.item.negative_item_count.NegativeItemUtil;
import dev.isxander.yacl3.gui.render.GuiRenderStateSink;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.DrawItemStackOverlayCallback;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Quaternionf;
import org.joml.Vector2ic;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import page.langeweile.ok_zoomer.utils.ZoomUtils;

@Environment(EnvType.CLIENT)
public class class01054 implements GuiRenderStateSink {
   private static final int B = 2;
   final class06202 N;
   private final Matrix3x2fStack Z;
   public final class01051 y = new class01051();
   private final class08097 z;
   private final class08626 U;
   public final class08651 L;
   private class06619 E = class06619.N;
   final int u;
   final int i;
   @Nullable
   private Runnable W;
   @Nullable
   class00405 R;
   @Nullable
   class00405 M;

   public void L(int var1, int var2, int var3, int var4) {
      class03255 class03255 = new class03255(var1, var2, var3 - var1, var4 - var2).N(this.Z);
      this.y.N(class03255);
   }

   public void L() {
      this.L.N();
   }

   private void L(class06584 var1, int var2, int var3) {
      if (var1.j()) {
         int ix = var2 + 2;
         int j = var3 + 13;
         this.N(class08394.NH, ix, j, ix + 13, j + 2, -16777216);
         this.N(class08394.NH, ix, j, ix + var1.v(), j + 1, class02566.M(var1.n()));
      }
   }

   public void M() {
      if (this.R != null) {
         this.N((class01590)this.N.i_3, this.R, this.u, this.i);
      }

      if (this.M != null && this.M.Z() != null) {
         this.N(class06608.u);
      }

      if (this.W != null) {
         this.L();
         this.W.run();
         this.W = null;
      }
   }

   public class01054(class06202 var1, class08651 var2, int var3, int var4) {
      this(var1, new Matrix3x2fStack(16), var2, var3, var4);
   }

   private class01054(class06202 var1, Matrix3x2fStack var2, class08651 var3, int var4, int var5) {
      super();
      this.N = var1;
      this.Z = var2;
      this.u = var4;
      this.i = var5;
      class08117 class08117 = var1.yW();
      this.z = class08117;
      this.U = class08117.N(class08589.B);
      this.L = var3;
   }

   public class00580 B() {
      return this.N(class01065.field_63851);
   }

   public Matrix3x2fStack i() {
      return this.Z;
   }

   private void u(class06584 var1, int var2, int var3) {
      class04453 class04453 = (class04453)this.N.T_4;
      float f = class04453 == null ? 0.0F : class04453.method_7357().N(var1, this.N.NK().N(true));
      if (f > 0.0F) {
         int ix = var3 + class04995.y(16.0F * (1.0F - f));
         int j = ix + class04995.u(16.0F * f);
         this.N(class08394.NH, var2, ix, var2 + 16, j, Integer.MAX_VALUE);
      }

      this.N(var1, var2, var3, null);
   }

   private int u(class06584 var1) {
      return NegativeItemUtil.getCount(var1);
   }

   public void u() {
      this.L.y();
   }

   public void y(class06584 var1, int var2, int var3, int var4) {
      this.N(null, (class03448)this.N.T_3, var1, var2, var3, var4);
   }

   public void y(class06584 var1, int var2, int var3) {
      this.y(var1, var2, var3, 0);
   }

   public void y(class01590 var1, class06584 var2, int var3, int var4) {
      this.N(var1, class05096.method_25408(this.N, var2), var2.N(), var3, var4, var2.method_58694(class02484.V));
   }

   public void y(class01590 var1, class01028 var2, int var3, int var4, int var5) {
      this.N(var1, var2, var3, var4, var5, true);
   }

   public void y(int var1, int var2, int var3, int var4, int var5) {
      this.N(var1, var2, var1 + var3, var2 + 1, var5);
      this.N(var1, var2 + var4 - 1, var1 + var3, var2 + var4, var5);
      this.N(var1, var2 + 1, var1 + 1, var2 + var4 - 1, var5);
      this.N(var1 + var3 - 1, var2 + 1, var1 + var3, var2 + var4 - 1, var5);
   }

   public void y(class01590 var1, class00392 var2, int var3, int var4, int var5) {
      this.N(var1, var2, var3, var4, var5, true);
   }

   private void y(class01590 var1, class06584 var2, int var3, int var4, @Nullable String var5) {
      if (this.u(var2) != 1 || var5 != null) {
         String s1;
         if (var5 == null) {
            int ix = this.u(var2);
            s1 = this.N(ix);
         } else {
            s1 = var5;
         }

         String s = s1;
         this.N(var1, s, var3 + 19 - 2 - var1.y(s), var4 + 6 + 3, -1, true);
      }
   }

   private void y(
      RenderPipeline var1,
      GpuTextureView var2,
      class08188 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12
   ) {
      this.L
         .N(
            (class08669)(new class08661(
               var1, class08679.N(var2, var3), new Matrix3x2f(this.Z), var4, var5, var6, var7, var8, var9, var10, var11, var12, this.y.y()
            ))
         );
   }

   public void y(class01590 var1, List<? extends class01028> var2, int var3, int var4, @Nullable class01894 var5) {
      this.N(var1, var2.stream().map(class06357::N).collect(Collectors.toList()), var3, var4, class02128.N, var5, false);
   }

   public void y(class01590 var1, List<? extends class01028> var2, int var3, int var4) {
      this.y(var1, var2, var3, var4, null);
   }

   public void y(int var1, int var2, int var3, int var4) {
      if (var3 < var2) {
         int ix = var2;
         var2 = var3;
         var3 = ix;
      }

      this.N(var1, var2 + 1, var1 + 1, var3, var4);
   }

   public void y(class01590 var1, @Nullable String var2, int var3, int var4, int var5) {
      this.N(var1, var2, var3, var4, var5, true);
   }

   public int y() {
      return this.N.Nt().s();
   }

   public void N(class01590 var1, @Nullable class00405 var2, int var3, int var4) {
      if (var2 != null) {
         if (var2.z() != null) {
            switch (var2.z()) {
               case class00380 class00380: {
                  class06584 class06584;
                  try {
                     class06584 = class00380.y();
                  } catch (Throwable throwable2) {
                     throw new MatchException(throwable2.toString(), throwable2);
                  }

                  class06584 class06584x = class06584;
                  this.y(var1, class06584x, var3, var4);
                  break;
               }
               case class00391 class00391x:
                  class00391 class00391x = class00391x;

                  try {
                     class00398 = class00391x.y();
                  } catch (Throwable throwable1) {
                     throw new MatchException(throwable1.toString(), throwable1);
                  }

                  class00398 class00398x = class00398;
                  if (((class05630)this.N.i_7).W) {
                     this.N(var1, class00398x.N(), var3, var4);
                  }
                  break;
               case class00401 class00401x:
                  class00401 class00401x = class00401x;

                  try {
                     class00392 = class00401x.y();
                  } catch (Throwable throwable) {
                     throw new MatchException(throwable.toString(), throwable);
                  }

                  class00392 class00392x = class00392;
                  this.y(var1, var1.L(class00392x, Math.max(this.N() / 2, 200)), var3, var4);
                  return;
               default:
            }
         }
      }
   }

   public void N(class08800 var1, float var2, Vector3f var3, Quaternionf var4, @Nullable Quaternionf var5, int var6, int var7, int var8, int var9) {
      this.L.N(new class08665(var1, var3, var4, var5, var6, var7, var8, var9, var2, this.y.y()));
   }

   public void N(class08270 var1) {
      class06202 class06202 = class06202.Nq();
      class08627 class08627 = class06202.NO();
      class08918 class08918x = class08627.y(var1.N);
      this.N(class08394.Na, class08918x.method_71659(), class08918x.method_75484(), 0, 0, 128, 128, 0.0F, 1.0F, 0.0F, 1.0F, -1);

      for (class10944 class10944 : var1.y) {
         if (class10944.i) {
            this.Z.pushMatrix();
            this.Z.translate(class10944.y / 2.0F + 64.0F, class10944.L / 2.0F + 64.0F);
            this.Z.rotate((float) (Math.PI / 180.0) * class10944.u * 360.0F / 16.0F);
            this.Z.scale(4.0F, 4.0F);
            this.Z.translate(-0.125F, 0.125F);
            class08388 class08388 = class10944.N;
            if (class08388 != null) {
               class08918 class08918x = class08627.y(class08388.method_45852());
               this.N(
                  class08394.Na,
                  class08918x.method_71659(),
                  class08918x.method_75484(),
                  -1,
                  -1,
                  1,
                  1,
                  class08388.method_4594(),
                  class08388.method_4577(),
                  class08388.method_4575(),
                  class08388.method_4593(),
                  -1
               );
            }

            this.Z.popMatrix();
            if (class10944.R != null) {
               class01590 class01590 = (class01590)class06202.i_3;
               float f = class01590.N(class10944.R);
               float f1 = class04995.N(25.0F / f, 0.0F, 6.0F / 9.0F);
               this.Z.pushMatrix();
               this.Z.translate(class10944.y / 2.0F + 64.0F - f * f1 / 2.0F, class10944.L / 2.0F + 64.0F + 4.0F);
               this.Z.scale(f1, f1);
               this.L.N(new class08652(class01590, class10944.R.method_30937(), new Matrix3x2f(this.Z), 0, 0, -1, Integer.MIN_VALUE, false, false, this.y.y()));
               this.Z.popMatrix();
            }
         }
      }
   }

   public boolean N(int var1, int var2) {
      return this.y.N(var1, var2);
   }

   public void N(List<class05005> var1, int var2, int var3, int var4, int var5) {
      this.L.N(new class08660(var1, var2, var3, var4, var5, this.y.y()));
   }

   public void N(class06260 var1, float var2, class05904 var3, int var4, int var5, int var6, int var7) {
      this.L.N(new class08663(var1, var3, var4, var5, var6, var7, var2, this.y.y()));
   }

   public void N(class08842 var1, class06563 var2, class02708 var3, int var4, int var5, int var6, int var7) {
      this.L.N(new class08667(var1, var2, var3, var4, var5, var6, var7, this.y.y()));
   }

   public void N(class01127 var1, class01894 var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      this.L.N(new class08649(var1, var2, var4, var5, var6, var7, var8, var9, var3, this.y.y()));
   }

   public void N(class02721 var1, class01894 var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      this.L.N(new class08676(var1, var2, var4, var5, var6, var7, var8, var9, var10, var3, this.y.y()));
   }

   public void N(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.N(class08394.NH, class08679.N(), var1, var2, var3, var4, var5, var6);
   }

   public void N(RenderPipeline var1, class08679 var2, int var3, int var4, int var5, int var6) {
      this.N(var1, var2, var3, var4, var5, var6, -1, null);
   }

   public void N(class01590 var1, List<class00392> var2, int var3, int var4, @Nullable class01894 var5) {
      this.N(var1, var2.stream().map(class00392::method_30937).map(class06357::N).toList(), var3, var4, class02128.N, var5, false);
   }

   public void N(class01590 var1, List<class00392> var2, int var3, int var4) {
      this.N(var1, var2, var3, var4, null);
   }

   public void N(class01590 var1, class00392 var2, int var3, int var4, @Nullable class01894 var5) {
      this.y(var1, List.of(var2.method_30937()), var3, var4, var5);
   }

   public void N(class01590 var1, class00392 var2, int var3, int var4) {
      this.N(var1, var2, var3, var4, null);
   }

   public void N(int var1, int var2, int var3, int var4, int var5) {
      this.N(class08394.NH, var1, var2, var3, var4, var5);
   }

   public void N(RenderPipeline var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 < var4) {
         int ix = var2;
         var2 = var4;
         var4 = ix;
      }

      if (var3 < var5) {
         int j = var3;
         var3 = var5;
         var5 = j;
      }

      this.N(var1, class08679.N(), var2, var3, var4, var5, var6, null);
   }

   public void N(class01590 var1, List<class06357> var2, int var3, int var4, class02112 var5, @Nullable class01894 var6) {
      int ix = 0;
      int j = var2.size() == 1 ? -2 : 0;

      for (class06357 class06357xx : var2) {
         int k = class06357xx.method_32664(var1);
         if (k > ix) {
            ix = k;
         }

         j += class06357xx.method_32661(var1);
      }

      int l1 = ix;
      int i2 = j;
      Vector2ic vector2ic = var5.method_47944(this.N(), this.y(), var3, var4, ix, j);
      int l = vector2ic.x();
      int i1 = vector2ic.y();
      this.Z.pushMatrix();
      class02118.N(this, l, i1, ix, j, var6);
      int j1 = i1;

      for (int k1 = 0; k1 < var2.size(); k1++) {
         class06357 class06357x = (class06357)var2.get(k1);
         class06357x.method_32665(this, var1, l, j1);
         j1 += class06357x.method_32661(var1) + (k1 == 0 ? 2 : 0);
      }

      j1 = i1;

      for (int j2 = 0; j2 < var2.size(); j2++) {
         class06357 class06357 = (class06357)var2.get(j2);
         class06357.method_32666(var1, l, j1, l1, i2, this);
         j1 += class06357.method_32661(var1) + (j2 == 0 ? 2 : 0);
      }

      this.Z.popMatrix();
   }

   private void N(class01590 var1, List<class06357> var2, int var3, int var4, class02112 var5, @Nullable class01894 var6, boolean var7) {
      if (!var2.isEmpty()) {
         if (this.W == null || var7) {
            this.W = () -> this.N(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public void N(class01590 var1, List<class01028> var2, class02112 var3, int var4, int var5, boolean var6) {
      this.N(var1, var2.stream().map(class06357::N).collect(Collectors.toList()), var4, var5, var3, null, var6);
   }

   private void N(RenderPipeline var1, class08388 var2, int var3, int var4, int var5, int var6, int var7, CallbackInfo var8) {
      SpriteUtil.INSTANCE.markSpriteActive(var2);
   }

   private void N(
      RenderPipeline var1,
      GpuTextureView var2,
      class08188 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      Operation var13
   ) {
      if (ZoomUtils.getFadeModifier() != null) {
         float f = ZoomUtils.getFadeModifier();
         if (var1.getBlendFunction().isPresent() && ((BlendFunction)var1.getBlendFunction().get()).destAlpha() == DestFactor.ZERO) {
            var13.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, class02566.y(var12, f)});
         } else {
            var13.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, class02566.N(f, var12)});
         }
      } else {
         var13.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12});
      }
   }

   private void N(class06584 var1, int var2, int var3, CallbackInfo var4) {
      class10946 class10946 = class10946.N(this, var1, var2, var3);
      class11938.L().L(class10946);
   }

   private void N(class07438 var1, class07299 var2, class06584 var3, int var4, int var5, int var6, CallbackInfo var7) {
      class10948 class10948 = class10948.N(this, var3, var4, var5);
      class11938.L().L(class10948);
   }

   public void N(class01590 var1, class06584 var2, int var3, int var4, @Nullable String var5, CallbackInfo var6) {
      if (!var2.R()) {
         ((DrawItemStackOverlayCallback)DrawItemStackOverlayCallback.EVENT.invoker()).onDrawItemStackOverlay(this, var1, var2, var3, var4);
      }
   }

   public void N(class06619 var1) {
      this.E = var1;
   }

   private String N(int var1) {
      return var1 <= 0 ? class06541.field_1061.toString() + var1 : String.valueOf(var1);
   }

   public void N(class08844 var1) {
      var1.N(this.E);
   }

   private void N(
      RenderPipeline var1, class08388 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, CallbackInfo var12
   ) {
      SpriteUtil.INSTANCE.markSpriteActive(var2);
   }

   private class00577 N(float var1) {
      return new class00577(new Matrix3x2f(this.Z), var1, this.y.y());
   }

   public class00580 N(class01065 var1, @Nullable Consumer<class00405> var2) {
      return new class01074(this, this.N(1.0F), var1, var2);
   }

   public class00580 N(class01065 var1) {
      return this.N(var1, null);
   }

   public class00580 N(class06478 var1, class01065 var2) {
      return new class01074(this, this.N(var1.method_75798()), var2, null);
   }

   public class08388 N(class05913 var1) {
      return this.z.N(var1);
   }

   public int N() {
      return this.N.Nt().P();
   }

   public void N(int var1, int var2, int var3, int var4) {
      if (var2 < var1) {
         int ix = var1;
         var1 = var2;
         var2 = ix;
      }

      this.N(var1, var3, var2 + 1, var3 + 1, var4);
   }

   public void N(RenderPipeline var1, class08388 var2, int var3, int var4, int var5, int var6, int var7) {
      this.N(var1, var2, var3, var4, var5, var6, var7, null);
      if (var5 != 0 && var6 != 0) {
         this.N(
            var1,
            var2.method_45852(),
            var3,
            var3 + var5,
            var4,
            var4 + var6,
            var2.method_4594(),
            var2.method_4577(),
            var2.method_4593(),
            var2.method_4575(),
            var7
         );
      }
   }

   public void N(RenderPipeline var1, class08388 var2, int var3, int var4, int var5, int var6) {
      this.N(var1, var2, var3, var4, var5, var6, -1);
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      class08388 class08388 = this.U.N(var2);
      if (N(class08388) instanceof class01670) {
         this.N(var1, class08388, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         this.L(var7, var8, var7 + var9, var8 + var10);
         this.N(var1, var2, var7 - var5, var8 - var6, var3, var4, var11);
         this.R();
      }
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, -1);
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, int var5, int var6, int var7) {
      class08388 class08388 = this.U.N(var2);
      switch (N(class08388)) {
         case class01670 class01670:
            this.N(var1, class08388, var3, var4, var5, var6, var7);
            break;
         case class01647 class01647:
            this.N(var1, class08388, var3, var4, var5, var6, 0, 0, class01647.y(), class01647.L(), class01647.y(), class01647.L(), var7);
            break;
         case class01664 class01664:
            this.N(var1, class08388, class01664, var3, var4, var5, var6, var7);
            break;
         default:
      }
   }

   private static class01650 N(class08388 var0) {
      return var0.method_45851().method_73021(class01677.L).orElse(class01677.N).N();
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var7, var8, var9, var10, var11);
   }

   private void N(
      RenderPipeline var1, class08388 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13
   ) {
      if (var5 > 0 && var6 > 0) {
         if (var9 > 0 && var10 > 0) {
            class08918 class08918 = this.N.NO().y(var2.method_45852());
            GpuTextureView gputextureview = class08918.method_71659();
            this.N(
               var1,
               gputextureview,
               class08918.method_75484(),
               var9,
               var10,
               var3,
               var4,
               var3 + var5,
               var4 + var6,
               var2.method_4580((float)var7 / var11),
               var2.method_4580((float)(var7 + var9) / var11),
               var2.method_4570((float)var8 / var12),
               var2.method_4570((float)(var8 + var10) / var12),
               var13
            );
         } else {
            throw new IllegalArgumentException("Tile size must be positive, got " + var9 + "x" + var10);
         }
      }
   }

   private void N(
      RenderPipeline var1,
      class01664 var2,
      class08388 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14
   ) {
      if (var6 > 0 && var7 > 0) {
         if (var2.i()) {
            this.N(
               var1,
               var3.method_45852(),
               var4,
               var4 + var6,
               var5,
               var5 + var7,
               var3.method_4580((float)var8 / var12),
               var3.method_4580((float)(var8 + var10) / var12),
               var3.method_4570((float)var9 / var13),
               var3.method_4570((float)(var9 + var11) / var13),
               var14
            );
         } else {
            this.N(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         }
      }
   }

   private void N(RenderPipeline var1, class08388 var2, class01664 var3, int var4, int var5, int var6, int var7, int var8) {
      class01643 class01643 = var3.u();
      int ix = Math.min(class01643.N(), var6 / 2);
      int j = Math.min(class01643.L(), var6 / 2);
      int k = Math.min(class01643.y(), var7 / 2);
      int l = Math.min(class01643.u(), var7 / 2);
      if (var6 == var3.y() && var7 == var3.L()) {
         this.N(var1, var2, var3.y(), var3.L(), 0, 0, var4, var5, var6, var7, var8);
      } else if (var7 == var3.L()) {
         this.N(var1, var2, var3.y(), var3.L(), 0, 0, var4, var5, ix, var7, var8);
         this.N(var1, var3, var2, var4 + ix, var5, var6 - j - ix, var7, ix, 0, var3.y() - j - ix, var3.L(), var3.y(), var3.L(), var8);
         this.N(var1, var2, var3.y(), var3.L(), var3.y() - j, 0, var4 + var6 - j, var5, j, var7, var8);
      } else if (var6 == var3.y()) {
         this.N(var1, var2, var3.y(), var3.L(), 0, 0, var4, var5, var6, k, var8);
         this.N(var1, var3, var2, var4, var5 + k, var6, var7 - l - k, 0, k, var3.y(), var3.L() - l - k, var3.y(), var3.L(), var8);
         this.N(var1, var2, var3.y(), var3.L(), 0, var3.L() - l, var4, var5 + var7 - l, var6, l, var8);
      } else {
         this.N(var1, var2, var3.y(), var3.L(), 0, 0, var4, var5, ix, k, var8);
         this.N(var1, var3, var2, var4 + ix, var5, var6 - j - ix, k, ix, 0, var3.y() - j - ix, k, var3.y(), var3.L(), var8);
         this.N(var1, var2, var3.y(), var3.L(), var3.y() - j, 0, var4 + var6 - j, var5, j, k, var8);
         this.N(var1, var2, var3.y(), var3.L(), 0, var3.L() - l, var4, var5 + var7 - l, ix, l, var8);
         this.N(var1, var3, var2, var4 + ix, var5 + var7 - l, var6 - j - ix, l, ix, var3.L() - l, var3.y() - j - ix, l, var3.y(), var3.L(), var8);
         this.N(var1, var2, var3.y(), var3.L(), var3.y() - j, var3.L() - l, var4 + var6 - j, var5 + var7 - l, j, l, var8);
         this.N(var1, var3, var2, var4, var5 + k, ix, var7 - l - k, 0, k, ix, var3.L() - l - k, var3.y(), var3.L(), var8);
         this.N(var1, var3, var2, var4 + ix, var5 + k, var6 - j - ix, var7 - l - k, ix, k, var3.y() - j - ix, var3.L() - l - k, var3.y(), var3.L(), var8);
         this.N(var1, var3, var2, var4 + var6 - j, var5 + k, j, var7 - l - k, var3.y() - j, k, j, var3.L() - l - k, var3.y(), var3.L(), var8);
      }
   }

   private void N(RenderPipeline var1, class08388 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, null);
      if (var9 != 0 && var10 != 0) {
         this.N(
            var1,
            var2.method_45852(),
            var7,
            var7 + var9,
            var8,
            var8 + var10,
            var2.method_4580((float)var5 / var3),
            var2.method_4580((float)(var5 + var9) / var3),
            var2.method_4570((float)var6 / var4),
            var2.method_4570((float)(var6 + var10) / var4),
            var11
         );
      }
   }

   public void N(class01590 var1, class05936 var2, int var3, int var4, int var5, int var6) {
      this.N(var1, var2, var3, var4, var5, var6, true);
   }

   public void N(class01590 var1, class00392 var2, int var3, int var4, int var5, boolean var6) {
      this.N(var1, var2.method_30937(), var3, var4, var5, var6);
   }

   public void N(class01590 var1, class01028 var2, int var3, int var4, int var5) {
      this.y(var1, var2, var3 - var1.N(var2) / 2, var4, var5);
   }

   public void N(class01590 var1, class01028 var2, int var3, int var4, int var5, boolean var6) {
      if (class02566.y(var5) != 0) {
         this.L.N(new class08652(var1, var2, new Matrix3x2f(this.Z), var3, var4, var5, 0, var6, false, this.y.y()));
      }
   }

   public void N(class01590 var1, @Nullable String var2, int var3, int var4, int var5, boolean var6) {
      if (var2 != null) {
         this.N(var1, class07018.y().N(class05936.R(var2)), var3, var4, var5, var6);
      }
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, int var5, int var6, float var7) {
      this.N(var1, var2, var3, var4, var5, var6, class02566.y(var7));
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, int var5, int var6) {
      this.N(var1, var2, var3, var4, var5, var6, -1);
   }

   public void N(class01590 var1, class00392 var2, int var3, int var4, int var5) {
      class01028 class01028 = var2.method_30937();
      this.y(var1, class01028, var3 - var1.N(class01028) / 2, var4, var5);
   }

   public void N(class01590 var1, class00392 var2, int var3, int var4, int var5, int var6) {
      int ix = ((class05630)this.N.i_7).y(0.0F);
      if (ix != 0) {
         byte b0 = 2;
         this.N(var3 - 2, var4 - 2, var3 + var5 + 2, var4 + 9 + 2, class02566.N(ix, var6));
      }

      this.N(var1, var2, var3, var4, var6, true);
   }

   public void N(class01590 var1, class05936 var2, int var3, int var4, int var5, int var6, boolean var7) {
      for (class01028 class01028 : var1.L(var2, var5)) {
         this.N(var1, class01028, var3, var4, var6, var7);
         var4 += 9;
      }
   }

   public void N(class01590 var1, class06584 var2, int var3, int var4, @Nullable String var5) {
      if (var2.R()) {
         this.N(var1, var2, var3, var4, var5, null);
      } else {
         this.Z.pushMatrix();
         this.L(var2, var3, var4);
         this.u(var2, var3, var4);
         this.y(var1, var2, var3, var4, var5);
         this.Z.popMatrix();
         this.N(var1, var2, var3, var4, var5, null);
      }
   }

   public void N(class01590 var1, class06584 var2, int var3, int var4) {
      this.N(var1, var2, var3, var4, null);
   }

   private void N(@Nullable class07438 var1, @Nullable class07299 var2, class06584 var3, int var4, int var5, int var6) {
      if (var3.R()) {
         this.N(var1, var2, var3, var4, var5, var6, null);
      } else {
         class08763 class08763 = new class08763();
         this.N.NM().N(class08763, var3, class03662.field_4317, var2, var1, var6);

         try {
            this.L.N(new class08650(var3.B().U().toString(), new Matrix3x2f(this.Z), class08763, var4, var5, this.y.y()));
         } catch (Throwable throwable) {
            class07080 class07080 = class07080.N(throwable, "Rendering item");
            class07074 class07074 = class07080.N("Item being rendered");
            class07074.N("Item Type", () -> String.valueOf(var3.B()));
            class07074.N("Item Components", () -> String.valueOf(var3.y()));
            class07074.N("Item Foil", () -> String.valueOf(var3.Q()));
            throw new class07878(class07080);
         }

         this.N(var1, var2, var3, var4, var5, var6, null);
      }
   }

   public void N(class07438 var1, class06584 var2, int var3, int var4, int var5) {
      this.N(var1, var1.method_73183(), var2, var3, var4, var5);
   }

   public void N(int var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.N(class08394.Nc, var1, var2, var3, var4, -1);
      }

      this.N(class08394.NX, var1, var2, var3, var4, -16776961);
   }

   public void N(class01590 var1, String var2, int var3, int var4, int var5) {
      this.y(var1, var2, var3 - var1.y(var2) / 2, var4, var5);
   }

   public void N(class01590 var1, List<class00392> var2, Optional<class04830> var3, int var4, int var5, @Nullable class01894 var6) {
      List list = var2.stream().map(class00392::method_30937).map(class06357::N).collect(class07536.y());
      var3.ifPresent(var1x -> list.add(list.isEmpty() ? 0 : 1, class06357.N(var1x)));
      this.N(var1, list, var4, var5, class02128.N, var6, false);
   }

   public void N(class01590 var1, List<class00392> var2, Optional<class04830> var3, int var4, int var5) {
      this.N(var1, var2, var3, var4, var5, null);
   }

   private void N(RenderPipeline var1, class08679 var2, int var3, int var4, int var5, int var6, int var7, @Nullable Integer var8) {
      this.L.N(new class08656(var1, var2, new Matrix3x2f(this.Z), var3, var4, var5, var6, var7, var8 != null ? var8 : var7, this.y.y()));
   }

   public void N(List<class01028> var1, int var2, int var3) {
      this.N((class01590)this.N.i_3, var1, class02128.N, var2, var3, false);
   }

   public void N(class00392 var1, int var2, int var3) {
      this.N(List.of(var1.method_30937()), var2, var3);
   }

   private void N(RenderPipeline var1, class01894 var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, int var11) {
      class08918 class08918 = this.N.NO().y(var2);
      this.N(var1, class08918.method_71659(), class08918.method_75484(), var3, var5, var4, var6, var7, var8, var9, var10, var11);
   }

   public void N(class01894 var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      this.N(class08394.Na, var1, var2, var4, var3, var5, var6, var7, var8, var9, -1);
   }

   public void N(
      RenderPipeline var1,
      class01894 var2,
      int var3,
      int var4,
      float var5,
      float var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13
   ) {
      this.N(
         var1, var2, var3, var3 + var7, var4, var4 + var8, (var5 + 0.0F) / var11, (var5 + var9) / var11, (var6 + 0.0F) / var12, (var6 + var10) / var12, var13
      );
   }

   public void N(
      RenderPipeline var1, class01894 var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, -1);
   }

   public void N(RenderPipeline var1, class01894 var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var7, var8, var9, var10);
   }

   public void N(class06584 var1, int var2, int var3, int var4) {
      this.N((class04453)this.N.T_4, (class03448)this.N.T_3, var1, var2, var3, var4);
   }

   public void N(class06584 var1, int var2, int var3) {
      this.N((class04453)this.N.T_4, (class03448)this.N.T_3, var1, var2, var3, 0);
   }

   private void N(
      RenderPipeline var1,
      GpuTextureView var2,
      class08188 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14
   ) {
      this.L
         .N(
            new class06985(
               var1, class08679.N(var2, var3), new Matrix3x2f(this.Z), var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, this.y.y()
            )
         );
   }

   private void N(
      RenderPipeline var1,
      GpuTextureView var2,
      class08188 var3,
      int var4,
      int var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12
   ) {
      this.N(
         var1,
         var2,
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
         var1x -> {
            WrapOperationRuntime.checkArgumentCount(
               var1x,
               12,
               "[com.mojang.blaze3d.pipeline.RenderPipeline, com.mojang.blaze3d.textures.GpuTextureView, net.minecraft.class_12137, int, int, int, int, float, float, float, float, int]"
            );
            this.y(
               (RenderPipeline)var1x[0],
               (GpuTextureView)var1x[1],
               (class08188)var1x[2],
               (Integer)var1x[3],
               (Integer)var1x[4],
               (Integer)var1x[5],
               (Integer)var1x[6],
               (Float)var1x[7],
               (Float)var1x[8],
               (Float)var1x[9],
               (Float)var1x[10],
               (Integer)var1x[11]
            );
            return (Void)null;
         }
      );
   }

   public void yacl$submit(class08669 var1) {
      this.L.N(var1);
   }

   public void R() {
      this.y.N();
   }

   public class03255 yacl$peekScissorStack() {
      return this.y.y();
   }
}
