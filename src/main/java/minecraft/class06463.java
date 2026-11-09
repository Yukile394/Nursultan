package minecraft;

import com.google.common.base.Strings;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2LongArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2LongMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics;
import net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics.Percentile;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06463 {
   private static final float N = 0.01F;
   private static final int y = 36;
   private static final int L = 2;
   private static final int u = 2;
   private static final int i = 2;
   private final class06202 R;
   private final class01590 M;
   private final GpuBuffer B;
   private final ShapeIndexBuffer Z;
   @Nullable
   private class07321 z;
   @Nullable
   private class00570 U;
   @Nullable
   private CompletableFuture<class00570> E;
   private boolean W;
   private boolean m;
   private boolean P;
   private final class02270 s;
   private final class02270 T;
   private final class02270 b;
   private final class02270 j;
   private final Map<class02303, class02270> v;
   private final class03755 n;
   private final class03751 t;
   private final class03716 G;
   private final class03718 l;
   private final class02427 d;
   private final List w = new ArrayList();
   private final List k = new ArrayList();
   private long Y = 0L;
   private boolean Q = true;

   public boolean L() {
      return ((class05731)this.R.L_0).u() && this.W;
   }

   public void M() {
      this.m = !((class05731)this.R.L_0).u() || !this.m;
      if (this.m) {
         ((class05731)this.R.L_0).N(true);
         this.P = false;
      }
   }

   @Nullable
   private class07299 P() {
      return (class03448)this.R.T_3 == null
         ? null
         : (class07299)DataFixUtils.orElse(
            Optional.ofNullable(this.R.Na()).flatMap(var1 -> Optional.ofNullable(var1.N(((class03448)this.R.T_3).method_27983()))), (class03448)this.R.T_3
         );
   }

   @Nullable
   private class00570 T() {
      if ((class03448)this.R.T_3 != null && this.z != null) {
         if (this.U == null) {
            this.U = ((class03448)this.R.T_3).method_8497(this.z.B, this.z.Z);
         }

         return this.U;
      } else {
         return null;
      }
   }

   public class06463(class06202 var1) {
      super();
      this.Z = RenderSystem.getSequentialBuffer(DrawMode.LINES);
      this.s = new class02270(1);
      this.T = new class02270(class02869.values().length);
      this.b = new class02270(1);
      this.j = new class02270(1);
      this.v = Map.of(class02303.field_48817, this.T);
      this.R = var1;
      this.M = (class01590)var1.i_3;
      this.n = new class03755(this.M, this.s);
      this.t = new class03751(this.M, this.T, () -> (class03448)var1.T_3 == null ? 0.0F : ((class03448)var1.T_3).method_54719().M());
      this.G = new class03716(this.M, this.b);
      this.l = new class03718(this.M, this.j);
      this.d = new class02427(this.M);

      try (class02579 class02579 = class02579.N(class07835.P.getVertexSize() * 12 * 2)) {
         class07331 class07331 = new class07331(class02579, DrawMode.LINES, class07835.P);
         class07331.method_22912(0.0F, 0.0F, 0.0F).method_39415(-16777216).method_22914(1.0F, 0.0F, 0.0F).method_75298(4.0F);
         class07331.method_22912(1.0F, 0.0F, 0.0F).method_39415(-16777216).method_22914(1.0F, 0.0F, 0.0F).method_75298(4.0F);
         class07331.method_22912(0.0F, 0.0F, 0.0F).method_39415(-16777216).method_22914(0.0F, 1.0F, 0.0F).method_75298(4.0F);
         class07331.method_22912(0.0F, 1.0F, 0.0F).method_39415(-16777216).method_22914(0.0F, 1.0F, 0.0F).method_75298(4.0F);
         class07331.method_22912(0.0F, 0.0F, 0.0F).method_39415(-16777216).method_22914(0.0F, 0.0F, 1.0F).method_75298(4.0F);
         class07331.method_22912(0.0F, 0.0F, 1.0F).method_39415(-16777216).method_22914(0.0F, 0.0F, 1.0F).method_75298(4.0F);
         class07331.method_22912(0.0F, 0.0F, 0.0F).method_39415(-65536).method_22914(1.0F, 0.0F, 0.0F).method_75298(2.0F);
         class07331.method_22912(1.0F, 0.0F, 0.0F).method_39415(-65536).method_22914(1.0F, 0.0F, 0.0F).method_75298(2.0F);
         class07331.method_22912(0.0F, 0.0F, 0.0F).method_39415(-16711936).method_22914(0.0F, 1.0F, 0.0F).method_75298(2.0F);
         class07331.method_22912(0.0F, 1.0F, 0.0F).method_39415(-16711936).method_22914(0.0F, 1.0F, 0.0F).method_75298(2.0F);
         class07331.method_22912(0.0F, 0.0F, 0.0F).method_39415(-8421377).method_22914(0.0F, 0.0F, 1.0F).method_75298(2.0F);
         class07331.method_22912(0.0F, 0.0F, 1.0F).method_39415(-8421377).method_22914(0.0F, 0.0F, 1.0F).method_75298(2.0F);

         try (class02609 class02609 = class07331.y()) {
            this.B = RenderSystem.getDevice().createBuffer(() -> "Crosshair vertex buffer", 32, class02609.N());
         }
      }
   }

   public void B() {
      this.W = !((class05731)this.R.L_0).u() || !this.W;
      if (this.W) {
         ((class05731)this.R.L_0).N(true);
      }
   }

   public class02270 Z() {
      return this.T;
   }

   public boolean i() {
      return ((class05731)this.R.L_0).u() && this.m;
   }

   @Nullable
   private class00570 s() {
      if ((class03448)this.R.T_3 != null && this.z != null) {
         if (this.E == null) {
            class04782 class04782 = this.m();
            if (class04782 == null) {
               return null;
            }

            this.E = class04782.method_14178().y(this.z.B, this.z.Z, class00549.m, false).thenApply(var0 -> (class00570)var0.y(null));
         }

         return this.E.getNow(null);
      } else {
         return null;
      }
   }

   @Nullable
   private class04782 m() {
      if ((class03448)this.R.T_3 == null) {
         return null;
      } else {
         class08337 class08337 = this.R.Na();
         return class08337 != null ? class08337.N(((class03448)this.R.T_3).method_27983()) : null;
      }
   }

   public class02270 U() {
      return this.j;
   }

   public class02270 z() {
      return this.b;
   }

   public boolean u() {
      return ((class05731)this.R.L_0).u() && this.P;
   }

   public boolean y() {
      class05731 class05731 = (class05731)this.R.L_0;
      return (class05731.u() || !class05731.y().isEmpty()) && (!((class05630)this.R.i_7).NG || (class05096)this.R.v_3 != null);
   }

   private static long y(long var0) {
      return var0 > 0L ? Math.round(1.0E9 / var0) : 0L;
   }

   public void y(class06463 var1, class01054 var2, List var3, boolean var4) {
      if (this.Q) {
         this.k.clear();
         this.k.addAll(var3);
      }

      this.N(var2, this.k, var4);
   }

   public class02427 E() {
      return this.d;
   }

   private void N(class01054 var1, CallbackInfo var2, List var3) {
      if (((class05731)class06202.Nq().L_0).y(SodiumClientMod.SODIUM_FPS_PERCENTILES)) {
         Reference2LongArrayMap<Percentile> reference2longarraymap = FrameTimeStatistics.INSTANCE.get();
         if (reference2longarraymap != null && !reference2longarraymap.isEmpty()) {
            int ix = 0;

            for (int jx = 0; jx < var3.size(); jx++) {
               String var8 = (String)var3.get(jx);
               if (var8 != null && var8.contains(" fps T:")) {
                  ix = jx + 1;
                  break;
               }
            }

            StringBuilder stringbuilder = new StringBuilder();
            ObjectIterator<Entry<Percentile>> objectiterator = reference2longarraymap.reference2LongEntrySet().iterator();

            while (objectiterator.hasNext()) {
               Entry entry = (Entry)objectiterator.next();
               if (!stringbuilder.isEmpty()) {
                  stringbuilder.append(' ');
               }

               long kx = entry.getLongValue();
               stringbuilder.append(class06541.field_1080).append(((Percentile)entry.getKey()).name()).append('=').append(class06541.field_1070).append(y(kx));
            }

            stringbuilder.append(class06541.field_1080).append(" fps");
            var3.add(ix, stringbuilder.toString());
         }
      }
   }

   public void N() {
      this.E = null;
      this.U = null;
   }

   private void N(long var1, CallbackInfo var3) {
      FrameTimeStatistics.INSTANCE.logSample(var1);
   }

   public void N(class01054 var1, CallbackInfo var2) {
      if (SodiumExtraClientMod.options().extraSettings.steadyDebugHud) {
         long ix = class07536.L();
         if (ix > this.Y) {
            this.Q = true;
            this.Y = ix + SodiumExtraClientMod.options().extraSettings.steadyDebugHudRefreshInterval * 50L;
         } else {
            this.Q = false;
         }
      } else {
         this.Q = true;
      }
   }

   public void N(class06463 var1, class01054 var2, List var3, boolean var4) {
      if (this.Q) {
         this.w.clear();
         this.w.addAll(var3);
      }

      this.N(var2, this.w, var4);
   }

   public void N(long var1) {
      this.N(var1, null);
      this.s.N(var1);
   }

   private void N(class01054 var1, List<String> var2, boolean var3) {
      byte b0 = 9;

      for (int ix = 0; ix < var2.size(); ix++) {
         String sx = (String)var2.get(ix);
         if (!Strings.isNullOrEmpty(sx)) {
            int jx = this.M.y(sx);
            int kx = var3 ? 2 : var1.N() - 2 - jx;
            int lx = 2 + b0 * ix;
            var1.N(kx - 1, lx - 1, kx + jx + 1, lx + b0 - 1, -1873784752);
         }
      }

      for (int i1 = 0; i1 < var2.size(); i1++) {
         String s1 = (String)var2.get(i1);
         if (!Strings.isNullOrEmpty(s1)) {
            int j1 = this.M.y(s1);
            int k1 = var3 ? 2 : var1.N() - 2 - j1;
            int l1 = 2 + b0 * i1;
            var1.N(this.M, s1, k1, l1, -2039584, false);
         }
      }
   }

   public void N(long[] var1, class02303 var2) {
      class02270 class02270 = this.v.get(var2);
      if (class02270 != null) {
         class02270.N(var1);
      }
   }

   public void N(class01054 var1) {
      this.N(var1, null);
      class05630 class05630 = (class05630)this.R.i_7;
      if (this.R.yu() && (!class05630.NG || (class05096)this.R.v_3 != null)) {
         Collection<class01894> collection = ((class05731)this.R.L_0).y();
         if (!collection.isEmpty()) {
            var1.L();
            class04643 class04643 = class08700.N();
            class04643.N("debug");
            class07321 class07321;
            if (this.R.F() != null && (class03448)this.R.T_3 != null) {
               class07209 class07209 = this.R.F().method_24515();
               class07321 = new class07321(class07209);
            } else {
               class07321 = null;
            }

            if (!Objects.equals(this.z, class07321)) {
               this.z = class07321;
               this.N();
            }

            ArrayList arraylist2 = new ArrayList();
            ArrayList arraylist = new ArrayList();
            LinkedHashMap linkedhashmap = new LinkedHashMap();
            ArrayList arraylist1 = new ArrayList();
            class06473 class06473 = new class06473(this, arraylist2, arraylist, arraylist1, linkedhashmap);
            class07299 class07299 = this.P();

            for (class01894 class01894 : collection) {
               class01285 class01285 = class06134.N(class01894);
               if (class01285 != null) {
                  class01285.method_72751(class06473, class07299, this.T(), this.s());
               }
            }

            if (!arraylist2.isEmpty()) {
               arraylist2.add("");
            }

            if (!arraylist.isEmpty()) {
               arraylist.add("");
            }

            if (!arraylist1.isEmpty()) {
               int ix = (arraylist1.size() + 1) / 2;
               arraylist2.addAll(arraylist1.subList(0, ix));
               arraylist.addAll(arraylist1.subList(ix, arraylist1.size()));
               arraylist2.add("");
               if (ix < arraylist1.size()) {
                  arraylist.add("");
               }
            }

            ArrayList arraylist3 = new ArrayList(linkedhashmap.values());
            if (!arraylist3.isEmpty()) {
               int jx = (arraylist3.size() + 1) / 2;

               for (int i1 = 0; i1 < arraylist3.size(); i1++) {
                  Collection collection1 = (Collection)arraylist3.get(i1);
                  if (!collection1.isEmpty()) {
                     if (i1 < jx) {
                        arraylist2.addAll(collection1);
                        arraylist2.add("");
                     } else {
                        arraylist.addAll(collection1);
                        arraylist.add("");
                     }
                  }
               }
            }

            if (((class05731)this.R.L_0).u()) {
               arraylist2.add("");
               boolean flag1 = this.R.Na() != null;
               class06428 class06428 = class05630.r;
               String s5 = class06428.m().getString();
               String sx = "[" + (class06428.W() ? "" : s5 + "+");
               String s1 = sx + class05630.NT.m().getString() + "]";
               String s2 = sx + class05630.Nb.m().getString() + "]";
               String s3 = sx + class05630.Nj.m().getString() + "]";
               arraylist2.add(
                  "Debug charts: "
                     + s1
                     + " Profiler "
                     + (this.W ? "visible" : "hidden")
                     + "; "
                     + s2
                     + " "
                     + (flag1 ? "FPS + TPS " : "FPS ")
                     + (this.m ? "visible" : "hidden")
                     + "; "
                     + s3
                     + " "
                     + (!this.R.q() ? "Bandwidth + Ping" : "Ping")
                     + (this.P ? " visible" : " hidden")
               );
               String s4 = sx + class05630.Nz.m().getString() + "]";
               arraylist2.add("To edit: press " + s4);
            }

            this.N(var1, null, arraylist2);
            boolean flag = true;
            this.N(this, var1, arraylist2, flag);
            flag = false;
            this.y(this, var1, arraylist, flag);
            var1.L();
            this.d.N(10);
            if (this.i()) {
               int kx = var1.N();
               int j1 = kx / 2;
               this.n.N(var1, 0, this.n.N(j1));
               if (this.T.u() > 0) {
                  int l1 = this.t.N(j1);
                  this.t.N(var1, kx - l1, l1);
               }

               this.d.N(this.t.N());
            }

            if (this.u() && this.R.NE() != null) {
               int lx = var1.N();
               int k1 = lx / 2;
               if (!this.R.q()) {
                  this.l.N(var1, 0, this.l.N(k1));
               }

               int i2 = this.G.N(k1);
               this.G.N(var1, lx - i2, i2);
               this.d.N(this.G.N());
            }

            if (((class05731)this.R.L_0).y(class06134.V)) {
               class08337 class08337 = this.R.Na();
               if (class08337 != null && (class04453)this.R.T_4 != null) {
                  class08771 class08771 = class08337.z(16 + class03469.N);
                  class08771.N(((class04453)this.R.T_4).method_73183().method_27983(), ((class04453)this.R.T_4).method_31476());
                  class05850.N(var1, var1.N() / 2, var1.y() / 2, 4, 1, class08771);
               }
            }

            try (class08694 class08694 = class04643.i("profilerPie")) {
               this.d.N(var1);
            }

            class04643.L();
         }
      }
   }

   public void N(class05363 var1) {
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      matrix4fstack.pushMatrix();
      matrix4fstack.translate(0.0F, 0.0F, -1.0F);
      matrix4fstack.rotateX(var1.i() * (float) (Math.PI / 180.0));
      matrix4fstack.rotateY(var1.R() * (float) (Math.PI / 180.0));
      float f = 0.01F * this.R.Nt().j();
      matrix4fstack.scale(-f, f, -f);
      RenderPipeline renderpipeline = class08394.Nt;
      class08066 class08066 = class06202.Nq().e();
      GpuTextureView gputextureview = class08066.u();
      GpuTextureView gputextureview1 = class08066.R();
      GpuBuffer gpubuffer = this.Z.getIndexBuffer(36);
      GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms().N(matrix4fstack, new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f());
      RenderPass renderpass = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(() -> "3d crosshair", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

      try {
         renderpass.setPipeline(renderpipeline);
         RenderSystem.bindDefaultUniforms(renderpass);
         renderpass.setVertexBuffer(0, this.B);
         renderpass.setIndexBuffer(gpubuffer, this.Z.getIndexType());
         renderpass.setUniform("DynamicTransforms", gpubufferslice);
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

      matrix4fstack.popMatrix();
   }

   public void W() {
      this.T.i();
      this.b.i();
      this.j.i();
   }

   public void R() {
      this.P = !((class05731)this.R.L_0).u() || !this.P;
      if (this.P) {
         ((class05731)this.R.L_0).N(true);
         this.m = false;
      }
   }
}
