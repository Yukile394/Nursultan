package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class07305 {
   public static final class06839<Boolean> N = N("advance_time", class05086.i, !class07529.Nc);
   public static final class06839<Boolean> y = N("advance_weather", class05086.i, !class07529.Nc);
   public static final class06839<Boolean> L = N("allow_entering_nether_using_portals", class05086.M, true);
   public static final class06839<Boolean> u = N("block_drops", class05086.u, true);
   public static final class06839<Boolean> i = N("block_explosion_drop_decay", class05086.u, true);
   public static final class06839<Boolean> R = N("command_blocks_work", class05086.M, true);
   public static final class06839<Boolean> M = N("command_block_output", class05086.R, true);
   public static final class06839<Boolean> B = N("drowning_damage", class05086.N, true);
   public static final class06839<Boolean> Z = N("elytra_movement_check", class05086.N, true);
   public static final class06839<Boolean> z = N("ender_pearls_vanish_on_death", class05086.N, true);
   public static final class06839<Boolean> U = N("entity_drops", class05086.u, true);
   public static final class06839<Boolean> E = N("fall_damage", class05086.N, true);
   public static final class06839<Boolean> W = N("fire_damage", class05086.N, true);
   public static final class06839<Integer> m = N("fire_spread_radius_around_player", class05086.i, 128, -1);
   public static final class06839<Boolean> P = N("forgive_dead_players", class05086.y, true);
   public static final class06839<Boolean> s = N("freeze_damage", class05086.N, true);
   public static final class06839<Boolean> T = N("global_sound_events", class05086.M, true);
   public static final class06839<Boolean> b = N("immediate_respawn", class05086.N, false);
   public static final class06839<Boolean> j = N("keep_inventory", class05086.N, false);
   public static final class06839<Boolean> v = N("lava_source_conversion", class05086.i, false);
   public static final class06839<Boolean> n = N("limited_crafting", class05086.N, false);
   public static final class06839<Boolean> t = N("locator_bar", class05086.N, true);
   public static final class06839<Boolean> G = N("log_admin_commands", class05086.R, true);
   public static final class06839<Integer> l = N("max_block_modifications", class05086.M, 32768, 1);
   public static final class06839<Integer> d = N("max_command_forks", class05086.M, 65536, 0);
   public static final class06839<Integer> w = N("max_command_sequence_length", class05086.M, 65536, 0);
   public static final class06839<Integer> k = N("max_entity_cramming", class05086.y, 24, 0);
   public static final class06839<Integer> Y = N("max_minecart_speed", class05086.M, 8, 1, 1000, class03767.N(class03794.u));
   public static final class06839<Integer> Q = N("max_snow_accumulation_height", class05086.i, 1, 0, 8);
   public static final class06839<Boolean> O = N("mob_drops", class05086.u, true);
   public static final class06839<Boolean> g = N("mob_explosion_drop_decay", class05086.u, true);
   public static final class06839<Boolean> I = N("mob_griefing", class05086.y, true);
   public static final class06839<Boolean> J = N("natural_health_regeneration", class05086.N, true);
   public static final class06839<Boolean> o = N("player_movement_check", class05086.N, true);
   public static final class06839<Integer> q = N("players_nether_portal_creative_delay", class05086.N, 0, 0);
   public static final class06839<Integer> K = N("players_nether_portal_default_delay", class05086.N, 80, 0);
   public static final class06839<Integer> V = N("players_sleeping_percentage", class05086.N, 100, 0);
   public static final class06839<Boolean> e = N("projectiles_can_break_blocks", class05086.u, true);
   public static final class06839<Boolean> H = N("pvp", class05086.N, true);
   public static final class06839<Boolean> c = N("raids", class05086.y, true);
   public static final class06839<Integer> X = N("random_tick_speed", class05086.i, 3, 0);
   public static final class06839<Boolean> a = N("reduced_debug_info", class05086.M, false);
   public static final class06839<Integer> p = N("respawn_radius", class05086.N, 10, 0);
   public static final class06839<Boolean> F = N("send_command_feedback", class05086.R, true);
   public static final class06839<Boolean> A = N("show_advancement_messages", class05086.R, true);
   public static final class06839<Boolean> f = N("show_death_messages", class05086.R, true);
   public static final class06839<Boolean> C = N("spawner_blocks_work", class05086.M, true);
   public static final class06839<Boolean> S = N("spawn_mobs", class05086.L, true);
   public static final class06839<Boolean> x = N("spawn_monsters", class05086.L, true);
   public static final class06839<Boolean> D = N("spawn_patrols", class05086.L, true);
   public static final class06839<Boolean> h = N("spawn_phantoms", class05086.L, true);
   public static final class06839<Boolean> r = N("spawn_wandering_traders", class05086.L, true);
   public static final class06839<Boolean> NN = N("spawn_wardens", class05086.L, true);
   public static final class06839<Boolean> Ny = N("spectators_generate_chunks", class05086.N, true);
   public static final class06839<Boolean> NL = N("spread_vines", class05086.i, true);
   public static final class06839<Boolean> Nu = N("tnt_explodes", class05086.M, true);
   public static final class06839<Boolean> Ni = N("tnt_explosion_drop_decay", class05086.u, false);
   public static final class06839<Boolean> NR = N("universal_anger", class05086.y, false);
   public static final class06839<Boolean> NM = N("water_source_conversion", class05086.i, true);
   private final class06826 NB;

   public class07305(class03767 var1) {
      super();
      this.NB = class06826.N(class04206.Nm.N(var1).z().map(class03556::N));
   }

   public class07305(class03767 var1, class06826 var2) {
      this(var1);
      this.NB.N(var2, this.NB::N);
   }

   public <T> String y(class06839<T> var1) {
      return var1.N(this.N(var1));
   }

   public class07305 y(class03767 var1) {
      return new class07305(var1, this.NB);
   }

   public static class06839<?> N(class00751<class06839<?>> var0) {
      return N;
   }

   private static <T> class06839<T> N(
      String var0, class05086 var1, class07411 var2, ArgumentType<T> var3, Codec<T> var4, T var5, class03767 var6, class07320<T> var7, ToIntFunction<T> var8
   ) {
      return class00751.N(class04206.Nm, var0, new class06839<>(var1, var2, var3, var7, var4, var8, (T)var5, var6));
   }

   private static class06839<Integer> N(String var0, class05086 var1, int var2, int var3, int var4, class03767 var5) {
      return N(
         var0, var1, class07411.field_62399, IntegerArgumentType.integer(var3, var4), Codec.intRange(var3, var4), var2, var5, class05706::L, var0x -> var0x
      );
   }

   public static Codec<class07305> N(class03767 var0) {
      return class06826.N.xmap(var1 -> new class07305(var0, var1), var0x -> var0x.NB);
   }

   public void N(class06826 var1, @Nullable class02796 var2) {
      var1.y().forEach(var3 -> this.N(var1, (class06839<?>)var3, var2));
   }

   public void N(class07305 var1, @Nullable class02796 var2) {
      this.N(var1.NB, var2);
   }

   public <T> void N(class06839<T> var1, T var2, @Nullable class02796 var3) {
      if (!this.NB.N(var1)) {
         throw new IllegalArgumentException("Tried to set invalid game rule");
      } else {
         this.NB.N(var1, var2);
         if (var3 != null) {
            var3.N(var1, var2);
         }
      }
   }

   public <T> T N(class06839<T> var1) {
      Object object = this.NB.y(var1);
      if (object == null) {
         throw new IllegalArgumentException("Tried to access invalid game rule");
      } else {
         return (T)object;
      }
   }

   public Stream<class06839<?>> N() {
      return this.NB.y().stream();
   }

   private static class06839<Integer> N(String var0, class05086 var1, int var2, int var3, int var4) {
      return N(var0, var1, var2, var3, var4, class03767.N());
   }

   private static class06839<Integer> N(String var0, class05086 var1, int var2, int var3) {
      return N(var0, var1, var2, var3, Integer.MAX_VALUE, class03767.N());
   }

   private static class06839<Boolean> N(String var0, class05086 var1, boolean var2) {
      return N(var0, var1, class07411.field_62400, BoolArgumentType.bool(), Codec.BOOL, var2, class03767.N(), class05706::y, var0x -> var0x ? 1 : 0);
   }

   public void N(class05706 var1) {
      this.NB.y().forEach(var1x -> {
         var1.N((class06839<?>)var1x);
         var1x.N(var1);
      });
   }

   private <T> void N(class06826 var1, class06839<T> var2, @Nullable class02796 var3) {
      this.N(var2, Objects.requireNonNull(var1.y(var2)), var3);
   }
}
