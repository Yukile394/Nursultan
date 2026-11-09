package minecraft;

import baritone.utils.accessor.IRenderPipelines;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class08394 implements IRenderPipelines {
   private static final Map<class01894, RenderPipeline> yB = new HashMap<>();
   public static final Snippet N = RenderPipeline.builder(new Snippet[0])
      .withUniform("DynamicTransforms", class08419.field_60031)
      .withUniform("Projection", class08419.field_60031)
      .buildSnippet();
   public static final Snippet y = RenderPipeline.builder(new Snippet[0]).withUniform("Fog", class08419.field_60031).buildSnippet();
   public static final Snippet L = RenderPipeline.builder(new Snippet[0]).withUniform("Globals", class08419.field_60031).buildSnippet();
   public static final Snippet u = RenderPipeline.builder(new Snippet[]{N, y}).buildSnippet();
   public static final Snippet i = RenderPipeline.builder(new Snippet[]{N, y}).withUniform("Lighting", class08419.field_60031).buildSnippet();
   public static final Snippet R = RenderPipeline.builder(new Snippet[]{y})
      .withSampler("Sampler0")
      .withSampler("Sampler2")
      .withVertexFormat(class07835.y, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet M = RenderPipeline.builder(new Snippet[]{R})
      .withUniform("Projection", class08419.field_60031)
      .withUniform("ChunkSection", class08419.field_60031)
      .withVertexShader("core/terrain")
      .withFragmentShader("core/terrain")
      .buildSnippet();
   public static final Snippet B = RenderPipeline.builder(new Snippet[]{R, N}).withVertexShader("core/block").withFragmentShader("core/block").buildSnippet();
   public static final Snippet Z = RenderPipeline.builder(new Snippet[]{i})
      .withVertexShader("core/entity")
      .withFragmentShader("core/entity")
      .withSampler("Sampler0")
      .withSampler("Sampler2")
      .withVertexFormat(class07835.L, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet z = RenderPipeline.builder(new Snippet[]{i})
      .withVertexShader("core/entity")
      .withFragmentShader("core/entity")
      .withSampler("Sampler0")
      .withVertexFormat(class07835.L, DrawMode.QUADS)
      .withShaderDefine("EMISSIVE")
      .buildSnippet();
   public static final Snippet U = RenderPipeline.builder(new Snippet[]{u})
      .withVertexShader("core/rendertype_beacon_beam")
      .withFragmentShader("core/rendertype_beacon_beam")
      .withSampler("Sampler0")
      .withVertexFormat(class07835.y, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet E = RenderPipeline.builder(new Snippet[]{N})
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(class07835.U, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet W = RenderPipeline.builder(new Snippet[]{N, y, L})
      .withVertexShader("core/rendertype_end_portal")
      .withFragmentShader("core/rendertype_end_portal")
      .withSampler("Sampler0")
      .withSampler("Sampler1")
      .withVertexFormat(class07835.i, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet m = RenderPipeline.builder(new Snippet[]{u})
      .withVertexShader("core/rendertype_clouds")
      .withFragmentShader("core/rendertype_clouds")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(class07835.N, DrawMode.QUADS)
      .withUniform("CloudInfo", class08419.field_60031)
      .withUniform("CloudFaces", class08419.field_60032, TextureFormat.RED8I)
      .buildSnippet();
   public static final Snippet P = RenderPipeline.builder(new Snippet[]{u, L})
      .withVertexShader("core/rendertype_lines")
      .withFragmentShader("core/rendertype_lines")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withVertexFormat(class07835.P, DrawMode.LINES)
      .buildSnippet();
   public static final Snippet s = RenderPipeline.builder(new Snippet[]{N})
      .withVertexShader("core/position_color")
      .withFragmentShader("core/position_color")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withVertexFormat(class07835.R, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet T = RenderPipeline.builder(new Snippet[]{u})
      .withVertexShader("core/particle")
      .withFragmentShader("core/particle")
      .withSampler("Sampler0")
      .withSampler("Sampler2")
      .withVertexFormat(class07835.u, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet b = RenderPipeline.builder(new Snippet[]{T}).withBlend(BlendFunction.TRANSLUCENT).withCull(false).buildSnippet();
   public static final Snippet j = RenderPipeline.builder(new Snippet[]{N})
      .withVertexShader("core/gui")
      .withFragmentShader("core/gui")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(class07835.R, DrawMode.QUADS)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .buildSnippet();
   public static final Snippet v = RenderPipeline.builder(new Snippet[]{N})
      .withVertexShader("core/position_tex_color")
      .withFragmentShader("core/position_tex_color")
      .withSampler("Sampler0")
      .withBlend(BlendFunction.TRANSLUCENT)
      .withVertexFormat(class07835.z, DrawMode.QUADS)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .buildSnippet();
   public static final Snippet n = RenderPipeline.builder(new Snippet[]{E}).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).buildSnippet();
   public static final Snippet t = RenderPipeline.builder(new Snippet[]{N})
      .withVertexShader("core/rendertype_outline")
      .withFragmentShader("core/rendertype_outline")
      .withSampler("Sampler0")
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .withVertexFormat(class07835.z, DrawMode.QUADS)
      .buildSnippet();
   public static final Snippet G = RenderPipeline.builder(new Snippet[0])
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .withVertexFormat(class07835.N, DrawMode.TRIANGLES)
      .buildSnippet();
   public static final RenderPipeline l = N(RenderPipeline.builder(new Snippet[]{B}).withLocation("pipeline/solid_block").build());
   public static final RenderPipeline d = N(RenderPipeline.builder(new Snippet[]{M}).withLocation("pipeline/solid_terrain").build());
   public static final RenderPipeline w = N(
      RenderPipeline.builder(new Snippet[]{M}).withLocation("pipeline/wireframe").withPolygonMode(PolygonMode.WIREFRAME).build()
   );
   public static final RenderPipeline k = N(
      RenderPipeline.builder(new Snippet[]{B}).withLocation("pipeline/cutout_block").withShaderDefine("ALPHA_CUTOUT", 0.5F).build()
   );
   public static final RenderPipeline Y = N(
      RenderPipeline.builder(new Snippet[]{M}).withLocation("pipeline/cutout_terrain").withShaderDefine("ALPHA_CUTOUT", 0.5F).build()
   );
   public static final RenderPipeline Q = N(
      RenderPipeline.builder(new Snippet[]{M})
         .withLocation("pipeline/translucent_terrain")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withShaderDefine("ALPHA_CUTOUT", 0.01F)
         .build()
   );
   public static final RenderPipeline O = N(
      RenderPipeline.builder(new Snippet[]{B})
         .withLocation("pipeline/tripwire_block")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   public static final RenderPipeline g = N(
      RenderPipeline.builder(new Snippet[]{M})
         .withLocation("pipeline/tripwire_terrain")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   public static final RenderPipeline I = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/translucent_moving_block")
         .withVertexShader("core/rendertype_translucent_moving_block")
         .withFragmentShader("core/rendertype_translucent_moving_block")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withVertexFormat(class07835.y, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline J = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/armor_cutout_no_cull")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("PER_FACE_LIGHTING")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline o = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/armor_decal_cutout_no_cull")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("PER_FACE_LIGHTING")
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline q = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/armor_translucent")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("PER_FACE_LIGHTING")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .build()
   );
   public static final RenderPipeline K = N(RenderPipeline.builder(new Snippet[]{Z}).withLocation("pipeline/entity_solid").withSampler("Sampler1").build());
   public static final RenderPipeline V = N(
      RenderPipeline.builder(new Snippet[]{Z}).withLocation("pipeline/entity_solid_offset_forward").withSampler("Sampler1").build()
   );
   public static final RenderPipeline e = N(
      RenderPipeline.builder(new Snippet[]{Z}).withLocation("pipeline/entity_cutout").withShaderDefine("ALPHA_CUTOUT", 0.1F).withSampler("Sampler1").build()
   );
   public static final RenderPipeline H = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/entity_cutout_no_cull")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("PER_FACE_LIGHTING")
         .withSampler("Sampler1")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline c = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/entity_cutout_no_cull_z_offset")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("PER_FACE_LIGHTING")
         .withSampler("Sampler1")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline X = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/entity_translucent")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("PER_FACE_LIGHTING")
         .withSampler("Sampler1")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .build()
   );
   public static final RenderPipeline a = N(
      RenderPipeline.builder(new Snippet[]{z})
         .withLocation("pipeline/entity_translucent_emissive")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("PER_FACE_LIGHTING")
         .withSampler("Sampler1")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline p = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/entity_smooth_cutout")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withSampler("Sampler1")
         .withCull(false)
         .build()
   );
   public static final RenderPipeline F = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/entity_no_outline")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("PER_FACE_LIGHTING")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline A = N(
      RenderPipeline.builder(new Snippet[]{Z})
         .withLocation("pipeline/breeze_wind")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("APPLY_TEXTURE_MATRIX")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("NO_CARDINAL_LIGHTING")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .build()
   );
   public static final RenderPipeline f = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/energy_swirl")
         .withVertexShader("core/entity")
         .withFragmentShader("core/entity")
         .withShaderDefine("ALPHA_CUTOUT", 0.1F)
         .withShaderDefine("EMISSIVE")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("NO_CARDINAL_LIGHTING")
         .withShaderDefine("APPLY_TEXTURE_MATRIX")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.ADDITIVE)
         .withCull(false)
         .withVertexFormat(class07835.L, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline C = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/eyes")
         .withVertexShader("core/entity")
         .withFragmentShader("core/entity")
         .withShaderDefine("EMISSIVE")
         .withShaderDefine("NO_OVERLAY")
         .withShaderDefine("NO_CARDINAL_LIGHTING")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(class07835.L, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline S = N(
      RenderPipeline.builder(new Snippet[]{i})
         .withLocation("pipeline/entity_decal")
         .withVertexShader("core/rendertype_entity_decal")
         .withFragmentShader("core/rendertype_entity_decal")
         .withSampler("Sampler0")
         .withSampler("Sampler1")
         .withSampler("Sampler2")
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .withCull(false)
         .withVertexFormat(class07835.L, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline x = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/entity_shadow")
         .withVertexShader("core/rendertype_entity_shadow")
         .withFragmentShader("core/rendertype_entity_shadow")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(class07835.L, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline D = N(
      RenderPipeline.builder(new Snippet[]{i})
         .withLocation("pipeline/item_entity_translucent_cull")
         .withVertexShader("core/rendertype_item_entity_translucent_cull")
         .withFragmentShader("core/rendertype_item_entity_translucent_cull")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withVertexFormat(class07835.L, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline h = N(RenderPipeline.builder(new Snippet[]{U}).withLocation("pipeline/beacon_beam_opaque").build());
   public static final RenderPipeline r = N(
      RenderPipeline.builder(new Snippet[]{U})
         .withLocation("pipeline/beacon_beam_translucent")
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   public static final RenderPipeline NN = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/dragon_explosion_alpha")
         .withVertexShader("core/rendertype_entity_alpha")
         .withFragmentShader("core/rendertype_entity_alpha")
         .withSampler("Sampler0")
         .withCull(false)
         .withVertexFormat(class07835.L, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline Ny = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/leash")
         .withVertexShader("core/rendertype_leash")
         .withFragmentShader("core/rendertype_leash")
         .withSampler("Sampler2")
         .withCull(false)
         .withVertexFormat(class07835.B, DrawMode.TRIANGLE_STRIP)
         .build()
   );
   public static final RenderPipeline NL = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/water_mask")
         .withVertexShader("core/rendertype_water_mask")
         .withFragmentShader("core/rendertype_water_mask")
         .withColorWrite(false)
         .withVertexFormat(class07835.i, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline Nu = N(
      RenderPipeline.builder(new Snippet[]{N, y, L})
         .withLocation("pipeline/glint")
         .withVertexShader("core/glint")
         .withFragmentShader("core/glint")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST)
         .withBlend(BlendFunction.GLINT)
         .withVertexFormat(class07835.Z, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline Ni = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/crumbling")
         .withVertexShader("core/rendertype_crumbling")
         .withFragmentShader("core/rendertype_crumbling")
         .withSampler("Sampler0")
         .withBlend(new BlendFunction(SourceFactor.DST_COLOR, DestFactor.SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO))
         .withDepthWrite(false)
         .withVertexFormat(class07835.y, DrawMode.QUADS)
         .withDepthBias(-1.0F, -10.0F)
         .build()
   );
   public static final RenderPipeline NR = N(
      RenderPipeline.builder(new Snippet[]{E, y})
         .withLocation("pipeline/text")
         .withVertexShader("core/rendertype_text")
         .withFragmentShader("core/rendertype_text")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .build()
   );
   public static final RenderPipeline NM = N(
      RenderPipeline.builder(new Snippet[]{n, y})
         .withLocation("pipeline/gui_text")
         .withVertexShader("core/rendertype_text")
         .withFragmentShader("core/rendertype_text")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline NB = N(
      RenderPipeline.builder(new Snippet[]{E, y})
         .withLocation("pipeline/text_background")
         .withVertexShader("core/rendertype_text_background")
         .withFragmentShader("core/rendertype_text_background")
         .withSampler("Sampler2")
         .withVertexFormat(class07835.B, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline NZ = N(
      RenderPipeline.builder(new Snippet[]{E, y})
         .withLocation("pipeline/text_intensity")
         .withVertexShader("core/rendertype_text_intensity")
         .withFragmentShader("core/rendertype_text_intensity")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withDepthBias(-1.0F, -10.0F)
         .build()
   );
   public static final RenderPipeline Nz = N(
      RenderPipeline.builder(new Snippet[]{n, y})
         .withLocation("pipeline/gui_text_intensity")
         .withVertexShader("core/rendertype_text_intensity")
         .withFragmentShader("core/rendertype_text_intensity")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .build()
   );
   public static final RenderPipeline NU = N(
      RenderPipeline.builder(new Snippet[]{E, y})
         .withLocation("pipeline/text_polygon_offset")
         .withVertexShader("core/rendertype_text")
         .withFragmentShader("core/rendertype_text")
         .withSampler("Sampler0")
         .withSampler("Sampler2")
         .withDepthBias(-1.0F, -10.0F)
         .build()
   );
   public static final RenderPipeline NE = N(
      RenderPipeline.builder(new Snippet[]{E})
         .withLocation("pipeline/text_see_through")
         .withVertexShader("core/rendertype_text_see_through")
         .withFragmentShader("core/rendertype_text_see_through")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline NW = N(
      RenderPipeline.builder(new Snippet[]{E})
         .withLocation("pipeline/text_background_see_through")
         .withVertexShader("core/rendertype_text_background_see_through")
         .withFragmentShader("core/rendertype_text_background_see_through")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withVertexFormat(class07835.B, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline Nm = N(
      RenderPipeline.builder(new Snippet[]{E})
         .withLocation("pipeline/text_intensity_see_through")
         .withVertexShader("core/rendertype_text_intensity_see_through")
         .withFragmentShader("core/rendertype_text_intensity_see_through")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );
   public static final RenderPipeline NP = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/lightning")
         .withVertexShader("core/rendertype_lightning")
         .withFragmentShader("core/rendertype_lightning")
         .withBlend(BlendFunction.LIGHTNING)
         .withVertexFormat(class07835.R, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline Ns = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/dragon_rays")
         .withVertexShader("core/rendertype_lightning")
         .withFragmentShader("core/rendertype_lightning")
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .withVertexFormat(class07835.R, DrawMode.TRIANGLES)
         .build()
   );
   public static final RenderPipeline NT = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/dragon_rays_depth")
         .withVertexShader("core/position")
         .withFragmentShader("core/position")
         .withColorWrite(false)
         .withVertexFormat(class07835.i, DrawMode.TRIANGLES)
         .build()
   );
   public static final RenderPipeline Nb = N(
      RenderPipeline.builder(new Snippet[]{W}).withLocation("pipeline/end_portal").withShaderDefine("PORTAL_LAYERS", 15).build()
   );
   public static final RenderPipeline Nj = N(
      RenderPipeline.builder(new Snippet[]{W}).withLocation("pipeline/end_gateway").withShaderDefine("PORTAL_LAYERS", 16).build()
   );
   public static final RenderPipeline Nv = N(RenderPipeline.builder(new Snippet[]{m}).withLocation("pipeline/flat_clouds").withCull(false).build());
   public static final RenderPipeline Nn = N(RenderPipeline.builder(new Snippet[]{m}).withLocation("pipeline/clouds").build());
   public static final RenderPipeline Nt = N(RenderPipeline.builder(new Snippet[]{P}).withLocation("pipeline/lines").build());
   public static final RenderPipeline NG = N(RenderPipeline.builder(new Snippet[]{P}).withDepthWrite(false).withLocation("pipeline/lines_translucent").build());
   public static final RenderPipeline Nl = N(
      RenderPipeline.builder(new Snippet[]{P})
         .withLocation("pipeline/secondary_block_outline")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline Nd = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/debug_points")
         .withVertexShader("core/debug_point")
         .withFragmentShader("core/position_color")
         .withCull(false)
         .withVertexFormat(class07835.m, DrawMode.POINTS)
         .build()
   );
   public static final RenderPipeline Nw = N(RenderPipeline.builder(new Snippet[]{s}).withLocation("pipeline/debug_filled_box").build());
   public static final RenderPipeline Nk = N(RenderPipeline.builder(new Snippet[]{s}).withLocation("pipeline/debug_quads").withCull(false).build());
   public static final RenderPipeline NY = N(
      RenderPipeline.builder(new Snippet[]{s})
         .withLocation("pipeline/debug_triangle_fan")
         .withCull(false)
         .withVertexFormat(class07835.R, DrawMode.TRIANGLE_FAN)
         .build()
   );
   public static final RenderPipeline NQ = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/world_border")
         .withVertexShader("core/rendertype_world_border")
         .withFragmentShader("core/rendertype_world_border")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.OVERLAY)
         .withCull(false)
         .withVertexFormat(class07835.Z, DrawMode.QUADS)
         .withDepthBias(-3.0F, -3.0F)
         .build()
   );
   public static final RenderPipeline NO = N(RenderPipeline.builder(new Snippet[]{T}).withLocation("pipeline/opaque_particle").build());
   public static final RenderPipeline Ng = N(
      RenderPipeline.builder(new Snippet[]{T}).withLocation("pipeline/translucent_particle").withBlend(BlendFunction.TRANSLUCENT).build()
   );
   public static final RenderPipeline NI = N(RenderPipeline.builder(new Snippet[]{b}).withLocation("pipeline/weather_depth_write").build());
   public static final RenderPipeline NJ = N(
      RenderPipeline.builder(new Snippet[]{b}).withLocation("pipeline/weather_no_depth_write").withDepthWrite(false).build()
   );
   public static final RenderPipeline No = N(
      RenderPipeline.builder(new Snippet[]{u})
         .withLocation("pipeline/sky")
         .withVertexShader("core/sky")
         .withFragmentShader("core/sky")
         .withDepthWrite(false)
         .withVertexFormat(class07835.i, DrawMode.TRIANGLE_FAN)
         .build()
   );
   public static final RenderPipeline Nq = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/end_sky")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(class07835.z, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline NK = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/sunrise_sunset")
         .withVertexShader("core/position_color")
         .withFragmentShader("core/position_color")
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withVertexFormat(class07835.R, DrawMode.TRIANGLE_FAN)
         .build()
   );
   public static final RenderPipeline NV = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/stars")
         .withVertexShader("core/stars")
         .withFragmentShader("core/stars")
         .withBlend(BlendFunction.OVERLAY)
         .withDepthWrite(false)
         .withVertexFormat(class07835.i, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline Ne = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/celestial")
         .withVertexShader("core/position_tex")
         .withFragmentShader("core/position_tex")
         .withSampler("Sampler0")
         .withBlend(BlendFunction.OVERLAY)
         .withDepthWrite(false)
         .withVertexFormat(class07835.Z, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline NH = N(RenderPipeline.builder(new Snippet[]{j}).withLocation("pipeline/gui").build());
   public static final RenderPipeline Nc = N(
      RenderPipeline.builder(new Snippet[]{j}).withLocation("pipeline/gui_invert").withBlend(BlendFunction.INVERT).build()
   );
   public static final RenderPipeline NX = N(
      RenderPipeline.builder(new Snippet[]{j}).withLocation("pipeline/gui_text_highlight").withBlend(BlendFunction.ADDITIVE).build()
   );
   public static final RenderPipeline Na = N(RenderPipeline.builder(new Snippet[]{v}).withLocation("pipeline/gui_textured").build());
   public static final RenderPipeline Np = N(
      RenderPipeline.builder(new Snippet[]{v})
         .withLocation("pipeline/gui_textured_premultiplied_alpha")
         .withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
         .build()
   );
   public static final RenderPipeline NF = N(
      RenderPipeline.builder(new Snippet[]{v})
         .withLocation("pipeline/block_screen_effect")
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline NA = N(
      RenderPipeline.builder(new Snippet[]{v})
         .withLocation("pipeline/fire_screen_effect")
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline Nf = N(
      RenderPipeline.builder(new Snippet[]{v}).withLocation("pipeline/gui_opaque_textured_background").withoutBlend().build()
   );
   public static final RenderPipeline NC = N(
      RenderPipeline.builder(new Snippet[]{v}).withLocation("pipeline/gui_nausea_overlay").withBlend(BlendFunction.ADDITIVE).build()
   );
   public static final RenderPipeline NS = N(
      RenderPipeline.builder(new Snippet[]{v})
         .withLocation("pipeline/vignette")
         .withBlend(new BlendFunction(SourceFactor.ZERO, DestFactor.ONE_MINUS_SRC_COLOR))
         .build()
   );
   public static final RenderPipeline Nx = N(
      RenderPipeline.builder(new Snippet[]{v}).withLocation("pipeline/crosshair").withBlend(BlendFunction.INVERT).build()
   );
   public static final RenderPipeline ND = N(
      RenderPipeline.builder(new Snippet[]{v})
         .withLocation("pipeline/mojang_logo")
         .withBlend(new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE))
         .build()
   );
   public static final RenderPipeline Nh = N(
      RenderPipeline.builder(new Snippet[0])
         .withLocation("pipeline/entity_outline_blit")
         .withVertexShader("core/screenquad")
         .withFragmentShader("core/blit_screen")
         .withSampler("InSampler")
         .withBlend(BlendFunction.ENTITY_OUTLINE_BLIT)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withColorWrite(true, false)
         .withVertexFormat(class07835.N, DrawMode.TRIANGLES)
         .build()
   );
   public static final RenderPipeline Nr = N(
      RenderPipeline.builder(new Snippet[0])
         .withLocation("pipeline/tracy_blit")
         .withVertexShader("core/screenquad")
         .withFragmentShader("core/blit_screen")
         .withSampler("InSampler")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withVertexFormat(class07835.N, DrawMode.TRIANGLES)
         .build()
   );
   public static final RenderPipeline yN = N(
      RenderPipeline.builder(new Snippet[]{N})
         .withLocation("pipeline/panorama")
         .withVertexShader("core/panorama")
         .withFragmentShader("core/panorama")
         .withSampler("Sampler0")
         .withDepthWrite(false)
         .withColorWrite(true, false)
         .withVertexFormat(class07835.i, DrawMode.QUADS)
         .build()
   );
   public static final RenderPipeline yy = N(RenderPipeline.builder(new Snippet[]{t}).withLocation("pipeline/outline_cull").build());
   public static final RenderPipeline yL = N(RenderPipeline.builder(new Snippet[]{t}).withLocation("pipeline/outline_no_cull").withCull(false).build());
   public static final RenderPipeline yu = N(
      RenderPipeline.builder(new Snippet[0])
         .withLocation("pipeline/lightmap")
         .withVertexShader("core/screenquad")
         .withFragmentShader("core/lightmap")
         .withUniform("LightmapInfo", class08419.field_60031)
         .withVertexFormat(class07835.N, DrawMode.TRIANGLES)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .build()
   );
   public static final Snippet yi = RenderPipeline.builder(new Snippet[0])
      .withVertexShader("core/animate_sprite")
      .withUniform("SpriteAnimationInfo", class08419.field_60031)
      .withVertexFormat(class07835.N, DrawMode.TRIANGLES)
      .withDepthWrite(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .buildSnippet();
   public static final RenderPipeline yR = N(
      RenderPipeline.builder(new Snippet[]{yi})
         .withFragmentShader("core/animate_sprite_blit")
         .withLocation("pipeline/animate_sprite_blit")
         .withSampler("Sprite")
         .build()
   );
   public static final RenderPipeline yM = N(
      RenderPipeline.builder(new Snippet[]{yi})
         .withFragmentShader("core/animate_sprite_interpolate")
         .withLocation("pipeline/animate_sprite_interpolate")
         .withSampler("CurrentSprite")
         .withSampler("NextSprite")
         .build()
   );

   public class08394() {
      super();
   }

   public static List<RenderPipeline> N() {
      return yB.values().stream().toList();
   }

   public static RenderPipeline N(RenderPipeline var0) {
      yB.put(var0.getLocation(), var0);
      return var0;
   }

   public Snippet getLinesSnippet() {
      return P;
   }

   public RenderPipeline baritone$registerPipeline(RenderPipeline var1) {
      return N(var1);
   }

   public Snippet getMatricesFogSnippet() {
      return u;
   }
}
