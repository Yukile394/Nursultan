package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public interface class00608 {
   class00607<Integer> N = N("visual/fog_color", class00607.N(class00588.i).N(0).L().N());
   class00607<Float> y = N("visual/fog_start_distance", class00607.N(class00588.L).N(0.0F).L().N());
   class00607<Float> L = N("visual/fog_end_distance", class00607.N(class00588.L).N(1024.0F).N(class06756.y).L().N());
   class00607<Float> u = N("visual/sky_fog_end_distance", class00607.N(class00588.L).N(512.0F).N(class06756.y).L().N());
   class00607<Float> i = N("visual/cloud_fog_end_distance", class00607.N(class00588.L).N(2048.0F).N(class06756.y).L().N());
   class00607<Integer> R = N("visual/water_fog_color", class00607.N(class00588.i).N(-16448205).L().N());
   class00607<Float> M = N("visual/water_fog_start_distance", class00607.N(class00588.L).N(-8.0F).L().N());
   class00607<Float> B = N("visual/water_fog_end_distance", class00607.N(class00588.L).N(96.0F).N(class06756.y).L().N());
   class00607<Integer> Z = N("visual/sky_color", class00607.N(class00588.i).N(0).L().N());
   class00607<Integer> z = N("visual/sunrise_sunset_color", class00607.N(class00588.R).N(0).L().N());
   class00607<Integer> U = N("visual/cloud_color", class00607.N(class00588.R).N(0).L().N());
   class00607<Float> E = N("visual/cloud_height", class00607.N(class00588.L).N(192.33F).L().N());
   class00607<Float> W = N("visual/sun_angle", class00607.N(class00588.u).N(0.0F).L().N());
   class00607<Float> m = N("visual/moon_angle", class00607.N(class00588.u).N(0.0F).L().N());
   class00607<Float> P = N("visual/star_angle", class00607.N(class00588.u).N(0.0F).L().N());
   class00607<class08165> s = N("visual/moon_phase", class00607.N(class00588.M).N(class08165.field_63425).N());
   class00607<Float> T = N("visual/star_brightness", class00607.N(class00588.L).N(0.0F).N(class06756.N).L().N());
   class00607<Integer> b = N("visual/sky_light_color", class00607.N(class00588.i).N(-1).L().N());
   class00607<Float> j = N("visual/sky_light_factor", class00607.N(class00588.L).N(1.0F).N(class06756.N).L().N());
   class00607<class07126> v = N("visual/default_dripstone_particle", class00607.N(class00588.z).N(class07107.NF).N());
   class00607<List<class06024>> n = N("visual/ambient_particles", class00607.N(class00588.U).N(List.of()).N());
   class00607<class00621> t = N("audio/background_music", class00607.N(class00588.E).N(class00621.N).N());
   class00607<Float> G = N("audio/music_volume", class00607.N(class00588.L).N(1.0F).N(class06756.N).N());
   class00607<class06731> l = N("audio/ambient_sounds", class00607.N(class00588.W).N(class06731.N).N());
   class00607<Boolean> d = N("audio/firefly_bush_sounds", class00607.N(class00588.N).N(false).N());
   class00607<Float> w = N("gameplay/sky_light_level", class00607.N(class00588.L).N(15.0F).N(class06756.N(0.0F, 15.0F)).y().N());
   class00607<Boolean> k = N("gameplay/can_start_raid", class00607.N(class00588.N).N(true));
   class00607<Boolean> Y = N("gameplay/water_evaporates", class00607.N(class00588.N).N(false).N());
   class00607<class00586> Q = N("gameplay/bed_rule", class00607.N(class00588.Z).N(class00586.N));
   class00607<Boolean> O = N("gameplay/respawn_anchor_works", class00607.N(class00588.N).N(false));
   class00607<Boolean> g = N("gameplay/nether_portal_spawns_piglin", class00607.N(class00588.N).N(false));
   class00607<Boolean> I = N("gameplay/fast_lava", class00607.N(class00588.N).N(false).y().N());
   class00607<Boolean> J = N("gameplay/increased_fire_burnout", class00607.N(class00588.N).N(false));
   class00607<class02584> o = N("gameplay/eyeblossom_open", class00607.N(class00588.y).N(class02584.field_52396));
   class00607<Float> q = N("gameplay/turtle_egg_hatch_chance", class00607.N(class00588.L).N(0.0F).N(class06756.N));
   class00607<Boolean> K = N("gameplay/piglins_zombify", class00607.N(class00588.N).N(true).N());
   class00607<Boolean> V = N("gameplay/snow_golem_melts", class00607.N(class00588.N).N(false));
   class00607<Boolean> e = N("gameplay/creaking_active", class00607.N(class00588.N).N(false).N());
   class00607<Float> H = N("gameplay/surface_slime_spawn_chance", class00607.N(class00588.L).N(0.0F).N(class06756.N));
   class00607<Float> c = N("gameplay/cat_waking_up_gift_chance", class00607.N(class00588.L).N(0.0F).N(class06756.N));
   class00607<Boolean> X = N("gameplay/bees_stay_in_hive", class00607.N(class00588.N).N(false));
   class00607<Boolean> a = N("gameplay/monsters_burn", class00607.N(class00588.N).N(false));
   class00607<Boolean> p = N("gameplay/can_pillager_patrol_spawn", class00607.N(class00588.N).N(true));
   class00607<class05359> F = N("gameplay/villager_activity", class00607.N(class00588.B).N(class05359.y));
   class00607<class05359> A = N("gameplay/baby_villager_activity", class00607.N(class00588.B).N(class05359.y));
   Codec<class00607<?>> f = class04206.Nc.T();

   private static <Value> class00607<Value> N(String var0, class00592<Value> var1) {
      class00607 class00607 = var1.u();
      class00751.N(class04206.Nc, class01894.y(var0), class00607);
      return class00607;
   }

   static class00607<?> N(class00751<class00607<?>> var0) {
      return O;
   }
}
