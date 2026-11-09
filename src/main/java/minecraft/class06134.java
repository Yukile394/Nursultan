package minecraft;

import com.viaversion.viafabricplus.base.VFPDebugHudEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.caffeinemc.mods.sodium.mixin.features.gui.hooks.debug.DebugScreenEntriesAccessor;
import net.irisshaders.iris.gui.debug.IrisDebugEntry;
import net.irisshaders.iris.gui.debug.IrisTrueDebugEntry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06134 implements DebugScreenEntriesAccessor {
   private static final Map<class01894, class01285> X = new HashMap<>();
   public static final class01894 N = N("game_version", new class05631());
   public static final class01894 y = N("fps", new class08947());
   public static final class01894 L = N("tps", new class05234());
   public static final class01894 u = N("memory", new class04743());
   public static final class01894 i = N("system_specs", new class04840());
   public static final class01894 R = N("looking_at_block", new class01535());
   public static final class01894 M = N("looking_at_fluid", new class05586());
   public static final class01894 B = N("looking_at_entity", new class06185());
   public static final class01894 Z = N("chunk_render_stats", new class08946());
   public static final class01894 z = N("chunk_generation_stats", new class08975());
   public static final class01894 U = N("entity_render_stats", new class08991());
   public static final class01894 E = N("particle_render_stats", new class05140());
   public static final class01894 W = N("chunk_source_stats", new class08962());
   public static final class01894 m = N("player_position", new class06431());
   public static final class01894 P = N("player_section_position", new class04990());
   public static final class01894 s = N("light_levels", new class01629());
   public static final class01894 T = N("heightmap", new class08987());
   public static final class01894 b = N("biome", new class08949());
   public static final class01894 j = N("local_difficulty", new class06380());
   public static final class01894 v = N("entity_spawn_counts", new class06083());
   public static final class01894 n = N("sound_mood", new class04639());
   public static final class01894 t = N("post_effect", new class01195());
   public static final class01894 G = N("entity_hitboxes", new class01045());
   public static final class01894 l = N("chunk_borders", new class01045());
   public static final class01894 d = N("3d_crosshair", new class01045());
   public static final class01894 w = N("chunk_section_paths", new class01045());
   public static final class01894 k = N("gpu_utilization", new class08977());
   public static final class01894 Y = N("simple_performance_impactors", new class05783());
   public static final class01894 Q = N("chunk_section_octree", new class01045());
   public static final class01894 O = N("visualize_water_levels", new class01045());
   public static final class01894 g = N("visualize_heightmap", new class01045());
   public static final class01894 I = N("visualize_collision_boxes", new class01045());
   public static final class01894 J = N("visualize_entity_supporting_blocks", new class01045());
   public static final class01894 o = N("visualize_block_light_levels", new class01045());
   public static final class01894 q = N("visualize_sky_light_levels", new class01045());
   public static final class01894 K = N("visualize_solid_faces", new class01045());
   public static final class01894 V = N("visualize_chunks_on_server", new class01045());
   public static final class01894 e = N("visualize_sky_light_sections", new class01045());
   public static final class01894 H = N("chunk_section_visibility", new class01045());
   public static Map<class05679, Map<class01894, class06276>> c;

   public class06134() {
      super();
   }

   static {
      Map<class01894, class06276> map = Map.of(
         d,
         class06276.field_61594,
         N,
         class06276.field_61594,
         L,
         class06276.field_61594,
         y,
         class06276.field_61594,
         u,
         class06276.field_61594,
         i,
         class06276.field_61594,
         m,
         class06276.field_61594,
         P,
         class06276.field_61594,
         Y,
         class06276.field_61594
      );
      Map<class01894, class06276> map1 = Map.of(
         L, class06276.field_61594, y, class06276.field_61593, k, class06276.field_61594, u, class06276.field_61594, Y, class06276.field_61594
      );
      c = Map.of(class05679.field_61599, map, class05679.field_61600, map1);
   }

   private static void y(CallbackInfo var0) {
      class01894 class01894 = N(VFPDebugHudEntry.ID, new VFPDebugHudEntry());
      HashMap hashmap = new HashMap();

      for (Entry entry : c.entrySet()) {
         HashMap hashmap1 = new HashMap((Map)entry.getValue());
         if (entry.getKey() == class05679.field_61599) {
            hashmap1.put(class01894, class06276.field_61594);
         }

         hashmap.put((class05679)entry.getKey(), hashmap1);
      }

      c = hashmap;
   }

   @Nullable
   public static class01285 N(class01894 var0) {
      return X.get(var0);
   }

   private static class01894 N(String var0, class01285 var1) {
      return N(class01894.y(var0), var1);
   }

   private static void N(CallbackInfo var0) {
      N(class01894.N("iris", "iris"), new IrisDebugEntry());
      N(class01894.N("iris", "debug"), new IrisTrueDebugEntry());
   }

   public static class01894 N(class01894 var0, class01285 var1) {
      X.put(var0, var1);
      return var0;
   }

   public static Map<class01894, class01285> N() {
      return Map.copyOf(X);
   }
}
