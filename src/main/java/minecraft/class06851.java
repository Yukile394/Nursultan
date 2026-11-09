package minecraft;

import Nursultan.class10678;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;

public class class06851 {
   static final BiFunction<class01894, Boolean, class07311> N = class07536.N(
      (var0, var1) -> class07311.method_75940(
         "outline", class06828.N(var1 ? class08394.yy : class08394.yL).N("Sampler0", var0).N(class06856.y).N(class06823.field_21854).i()
      )
   );
   public static final Supplier<class08188> y = () -> RenderSystem.getSamplerCache()
      .N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.NEAREST, true);
   private static final class07311 R = class07311.method_75940(
      "solid_moving_block", class06828.N(class08394.l).N().N("Sampler0", class08626.N, y).L().N(class06823.field_21855).i()
   );
   private static final class07311 M = class07311.method_75940(
      "cutout_moving_block", class06828.N(class08394.k).N().N("Sampler0", class08626.N, y).L().N(class06823.field_21855).i()
   );
   private static final class07311 B = class07311.method_75940(
      "translucent_moving_block", class06828.N(class08394.I).N().N("Sampler0", class08626.N, y).N(class06856.u).u().N(786432).N(class06823.field_21855).i()
   );
   private static final Function<class01894, class07311> Z = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.J).N("Sampler0", var0).N().y().N(class06833.y).L().N(class06823.field_21855).i();
      return class07311.method_75940("armor_cutout_no_cull", class06828);
   });
   private static final Function<class01894, class07311> z = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.q).N("Sampler0", var0).N().y().N(class06833.y).L().u().N(class06823.field_21855).i();
      return class07311.method_75940("armor_translucent", class06828);
   });
   private static final Function<class01894, class07311> U = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.K).N("Sampler0", var0).N().y().L().N(class06823.field_21855).i();
      return class07311.method_75940("entity_solid", class06828);
   });
   private static final Function<class01894, class07311> E = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.V).N("Sampler0", var0).N().y().N(class06833.L).L().N(class06823.field_21855).i();
      return class07311.method_75940("entity_solid_z_offset_forward", class06828);
   });
   private static final Function<class01894, class07311> W = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.e).N("Sampler0", var0).N().y().L().N(class06823.field_21855).i();
      return class07311.method_75940("entity_cutout", class06828);
   });
   private static final BiFunction<class01894, Boolean, class07311> m = class07536.N((var0, var1) -> {
      class06828 class06828 = class06828.N(class08394.H).N("Sampler0", var0).N().y().L().N(var1 ? class06823.field_21855 : class06823.field_21853).i();
      return class07311.method_75940("entity_cutout_no_cull", class06828);
   });
   private static final BiFunction<class01894, Boolean, class07311> P = class07536.N(
      (var0, var1) -> {
         class06828 class06828 = class06828.N(class08394.c)
            .N("Sampler0", var0)
            .N()
            .y()
            .N(class06833.y)
            .L()
            .N(var1 ? class06823.field_21855 : class06823.field_21853)
            .i();
         return class07311.method_75940("entity_cutout_no_cull_z_offset", class06828);
      }
   );
   private static final Function<class01894, class07311> s = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.D).N("Sampler0", var0).N(class06856.u).N().y().L().u().N(class06823.field_21855).i();
      return class07311.method_75940("item_entity_translucent_cull", class06828);
   });
   private static final BiFunction<class01894, Boolean, class07311> T = class07536.N((var0, var1) -> {
      class06828 class06828 = class06828.N(class08394.X).N("Sampler0", var0).N().y().L().u().N(var1 ? class06823.field_21855 : class06823.field_21853).i();
      return class07311.method_75940("entity_translucent", class06828);
   });
   private static final BiFunction<class01894, Boolean, class07311> b = class07536.N((var0, var1) -> {
      class06828 class06828 = class06828.N(class08394.a).N("Sampler0", var0).y().L().u().N(var1 ? class06823.field_21855 : class06823.field_21853).i();
      return class07311.method_75940("entity_translucent_emissive", class06828);
   });
   private static final Function<class01894, class07311> j = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.p).N("Sampler0", var0).N().y().N(class06823.field_21855).i();
      return class07311.method_75940("entity_smooth_cutout", class06828);
   });
   private static final BiFunction<class01894, Boolean, class07311> v = class07536.N((var0, var1) -> {
      class06828 class06828 = class06828.N(var1 ? class08394.r : class08394.h).N("Sampler0", var0).u().i();
      return class07311.method_75940("beacon_beam", class06828);
   });
   private static final Function<class01894, class07311> n = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.S).N("Sampler0", var0).N().y().i();
      return class07311.method_75940("entity_decal", class06828);
   });
   private static final Function<class01894, class07311> t = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.F).N("Sampler0", var0).N().y().u().i();
      return class07311.method_75940("entity_no_outline", class06828);
   });
   private static final Function<class01894, class07311> G = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.x).N("Sampler0", var0).N().y().N(class06833.y).i();
      return class07311.method_75940("entity_shadow", class06828);
   });
   private static final Function<class01894, class07311> l = class07536.y_4(var0 -> {
      class06828 class06828 = class06828.N(class08394.NN).N("Sampler0", var0).N(class06823.field_21855).i();
      return class07311.method_75940("entity_alpha", class06828);
   });
   private static final Function<class01894, class07311> d = class07536.y_4(
      var0 -> class07311.method_75940("eyes", class06828.N(class08394.C).N("Sampler0", var0).u().i())
   );
   private static final class07311 w = class07311.method_75940("leash", class06828.N(class08394.Ny).N().i());
   private static final class07311 k = class07311.method_75940("water_mask", class06828.N(class08394.NL).i());
   private static final class07311 Y = class07311.method_75940(
      "armor_entity_glint", class06828.N(class08394.Nu).N("Sampler0", class02862.N).N(class06835.i).N(class06833.y).i()
   );
   private static final class07311 Q = class07311.method_75940(
      "glint_translucent", class06828.N(class08394.Nu).N("Sampler0", class02862.y).N(class06835.L).N(class06856.u).i()
   );
   private static final class07311 O = class07311.method_75940("glint", class06828.N(class08394.Nu).N("Sampler0", class02862.y).N(class06835.L).i());
   private static final class07311 g = class07311.method_75940("entity_glint", class06828.N(class08394.Nu).N("Sampler0", class02862.y).N(class06835.u).i());
   private static final Function<class01894, class07311> I = class07536.y_4(
      var0 -> class07311.method_75940("crumbling", class06828.N(class08394.Ni).N("Sampler0", var0).u().i())
   );
   private static final Function<class01894, class07311> J = class07536.y_4(
      var0 -> class07311.method_75940("text", class06828.N(class08394.NR).N("Sampler0", var0).N().N(786432).i())
   );
   private static final class07311 o = class07311.method_75940("text_background", class06828.N(class08394.NB).N().u().i());
   private static final Function<class01894, class07311> q = class07536.y_4(
      var0 -> class07311.method_75940("text_intensity", class06828.N(class08394.NZ).N("Sampler0", var0).N().N(786432).i())
   );
   private static final Function<class01894, class07311> K = class07536.y_4(
      var0 -> class07311.method_75940("text_polygon_offset", class06828.N(class08394.NU).N("Sampler0", var0).N().u().i())
   );
   private static final Function<class01894, class07311> V = class07536.y_4(
      var0 -> class07311.method_75940("text_intensity_polygon_offset", class06828.N(class08394.NZ).N("Sampler0", var0).N().u().i())
   );
   private static final Function<class01894, class07311> e = class07536.y_4(
      var0 -> class07311.method_75940("text_see_through", class06828.N(class08394.NE).N("Sampler0", var0).N().i())
   );
   private static final class07311 H = class07311.method_75940("text_background_see_through", class06828.N(class08394.NW).N().u().i());
   private static final Function<class01894, class07311> c = class07536.y_4(
      var0 -> class07311.method_75940("text_intensity_see_through", class06828.N(class08394.Nm).N("Sampler0", var0).N().u().i())
   );
   private static final class07311 X = class07311.method_75940("lightning", class06828.N(class08394.NP).N(class06856.L).u().i());
   private static final class07311 a = class07311.method_75940("dragon_rays", class06828.N(class08394.Ns).i());
   private static final class07311 p = class07311.method_75940("dragon_rays_depth", class06828.N(class08394.NT).i());
   private static final class07311 F = class07311.method_75940(
      "tripwire_moving_block", class06828.N(class08394.O).N().N("Sampler0", class08626.N, y).N(class06856.L).L().u().N(class06823.field_21855).i()
   );
   private static final class07311 A = class07311.method_75940(
      "end_portal", class06828.N(class08394.Nb).N("Sampler0", class03334.N).N("Sampler1", class03334.y).i()
   );
   private static final class07311 f = class07311.method_75940(
      "end_gateway", class06828.N(class08394.Nj).N("Sampler0", class03334.N).N("Sampler1", class03334.y).i()
   );
   public static final class07311 L = class07311.method_75940("lines", class06828.N(class08394.Nt).N(class06833.y).N(class06856.u).i());
   public static final class07311 u = class07311.method_75940("lines_translucent", class06828.N(class08394.NG).N(class06833.y).N(class06856.u).i());
   public static final class07311 i = class07311.method_75940("secondary_block_outline", class06828.N(class08394.Nl).N(class06833.y).N(class06856.u).i());
   private static final class07311 C = class07311.method_75940("debug_filled_box", class06828.N(class08394.Nw).u().N(class06833.y).i());
   private static final class07311 S = class07311.method_75940("debug_point", class06828.N(class08394.Nd).i());
   private static final class07311 x = class07311.method_75940("debug_quads", class06828.N(class08394.Nk).u().i());
   private static final class07311 D = class07311.method_75940("debug_triangle_fan", class06828.N(class08394.NY).u().i());
   private static final Function<class01894, class07311> h = N(class08394.NI);
   private static final Function<class01894, class07311> r = N(class08394.NJ);
   private static final Function<class01894, class07311> NN = class07536.y_4(
      var0 -> class07311.method_75940("block_screen_effect", class06828.N(class08394.NF).N("Sampler0", var0).i())
   );
   private static final Function<class01894, class07311> Ny = class07536.y_4(
      var0 -> class07311.method_75940("fire_screen_effect", class06828.N(class08394.NA).N("Sampler0", var0).i())
   );

   public static class07311 w(class01894 var0) {
      return c.apply(var0);
   }

   public static class07311 L() {
      return B;
   }

   public static class07311 L(class01894 var0, boolean var1) {
      return T.apply(var0, var1);
   }

   public static class07311 L(class01894 var0) {
      return z.apply(var0);
   }

   public static class07311 M() {
      return Q;
   }

   private static class07311 M(class01894 var0, boolean var1) {
      return (var1 ? h : r).apply(var0);
   }

   public static class07311 M(class01894 var0) {
      return N(var0, true);
   }

   public static class07311 P(class01894 var0) {
      return G.apply(var0);
   }

   public static class07311 P() {
      return F;
   }

   public static class07311 T(class01894 var0) {
      return d.apply(var0);
   }

   public static class07311 T() {
      return f;
   }

   public class06851() {
      super();
   }

   public static class07311 B() {
      return O;
   }

   public static class07311 B(class01894 var0) {
      return y(var0, true);
   }

   public static class07311 Z() {
      return g;
   }

   public static class07311 Z(class01894 var0) {
      return s.apply(var0);
   }

   public static class07311 i(class01894 var0) {
      return E.apply(var0);
   }

   public static class07311 i(class01894 var0, boolean var1) {
      return v.apply(var0, var1);
   }

   public static class07311 i() {
      return k;
   }

   public static class07311 b() {
      return L;
   }

   public static class07311 b(class01894 var0) {
      return b.apply(var0, false);
   }

   public static class07311 s() {
      return A;
   }

   public static class07311 s(class01894 var0) {
      return l.apply(var0);
   }

   public static class07311 n(class01894 var0) {
      return J.apply(var0);
   }

   public static class07311 n() {
      return C;
   }

   public static class07311 l(class01894 var0) {
      return V.apply(var0);
   }

   public static class07311 l() {
      return D;
   }

   public static class07311 d(class01894 var0) {
      return e.apply(var0);
   }

   public static class07311 m() {
      return p;
   }

   public static class07311 m(class01894 var0) {
      return t.apply(var0);
   }

   public static class07311 k(class01894 var0) {
      return NN.apply(var0);
   }

   public static class07311 t() {
      return S;
   }

   public static class07311 t(class01894 var0) {
      return q.apply(var0);
   }

   public static class07311 v() {
      return i;
   }

   public static class07311 v(class01894 var0) {
      return I.apply(var0);
   }

   public static class07311 j(class01894 var0) {
      return N.apply(var0, false);
   }

   public static class07311 j() {
      return u;
   }

   public static class07311 U(class01894 var0) {
      return u(var0, true);
   }

   public static class07311 U() {
      return H;
   }

   public static class07311 z(class01894 var0) {
      return L(var0, true);
   }

   public static class07311 z() {
      return o;
   }

   public static class07311 u() {
      return w;
   }

   public static class07311 u(class01894 var0, boolean var1) {
      return b.apply(var0, var1);
   }

   public static class07311 u(class01894 var0) {
      return U.apply(var0);
   }

   public static class07311 y() {
      return M;
   }

   public static class07311 y(class01894 var0, float var1, float var2) {
      return class07311.method_75940("energy_swirl", class06828.N(class08394.f).N("Sampler0", var0).N(new class10678(var1, var2)).N().y().u().i());
   }

   public static class07311 y(class01894 var0, boolean var1) {
      return P.apply(var0, var1);
   }

   public static class07311 y(class01894 var0) {
      class06828 class06828 = class06828.N(class08394.o).N("Sampler0", var0).N().y().N(class06833.y).L().N(class06823.field_21855).i();
      return class07311.method_75940("armor_decal_cutout_no_cull", class06828);
   }

   public static class07311 E() {
      return X;
   }

   public static class07311 E(class01894 var0) {
      return j.apply(var0);
   }

   public static class07311 N() {
      return R;
   }

   private static class07311 N(class01894 var0, boolean var1, Operation var2) {
      return Iris.getPipelineManager().getPipeline().<Boolean>map(WorldRenderingPipeline::shouldWriteRainAndSnowToDepthBuffer).orElse(false)
         ? (class07311)var2.call(new Object[]{var0, true})
         : (class07311)var2.call(new Object[]{var0, var1});
   }

   public static class07311 N(class01894 var0) {
      return Z.apply(var0);
   }

   public static class07311 N(class01894 var0, boolean var1) {
      return m.apply(var0, var1);
   }

   private static Function<class01894, class07311> N(RenderPipeline var0) {
      return class07536.y_4(var1 -> class07311.method_75940("weather", class06828.N(var0).N("Sampler0", var1).N(class06856.L).N().i()));
   }

   public static class07311 N(class01894 var0, float var1, float var2) {
      return class07311.method_75940("breeze_wind", class06828.N(class08394.A).N("Sampler0", var0).N(new class10678(var1, var2)).N().u().i());
   }

   public static class07311 W() {
      return a;
   }

   public static class07311 W(class01894 var0) {
      return n.apply(var0);
   }

   public static class07311 R(class01894 var0, boolean var1) {
      return N(var0, var1, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_2960, boolean]");
         return M((class01894)var0x[0], (Boolean)var0x[1]);
      });
   }

   public static class07311 R(class01894 var0) {
      return W.apply(var0);
   }

   public static class07311 R() {
      return Y;
   }

   public static class07311 G(class01894 var0) {
      return K.apply(var0);
   }

   public static class07311 G() {
      return x;
   }

   public static class07311 Y(class01894 var0) {
      return Ny.apply(var0);
   }
}
