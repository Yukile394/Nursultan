package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class class05378<U> {
   public static final class05378<Void> N = N("dummy");
   public static final class05378<class06289> y = N("home", class06289.y);
   public static final class05378<class06289> L = N("job_site", class06289.y);
   public static final class05378<class06289> u = N("potential_job_site", class06289.y);
   public static final class05378<class06289> i = N("meeting_point", class06289.y);
   public static final class05378<List<class06289>> R = N("secondary_job_site");
   public static final class05378<List<class07438>> M = N("mobs");
   public static final class05378<class04051> B = N("visible_mobs");
   public static final class05378<List<class07438>> Z = N("visible_villager_babies");
   public static final class05378<List<class08036>> z = N("nearest_players");
   public static final class05378<class08036> U = N("nearest_visible_player");
   public static final class05378<class08036> E = N("nearest_visible_targetable_player");
   public static final class05378<List<class08036>> W = N("nearest_visible_targetable_players");
   public static final class05378<class05352> m = N("walk_target");
   public static final class05378<class05779> P = N("look_target");
   public static final class05378<class07438> s = N("attack_target");
   public static final class05378<Boolean> T = N("attack_cooling_down");
   public static final class05378<class07438> b = N("interaction_target");
   public static final class05378<class07077> j = N("breed_target");
   public static final class05378<class07049> v = N("ride_target");
   public static final class05378<class00143> n = N("path");
   public static final class05378<List<class06289>> t = N("interactable_doors");
   public static final class05378<Set<class06289>> G = N("doors_to_close");
   public static final class05378<class07209> l = N("nearest_bed");
   public static final class05378<class07072> d = N("hurt_by");
   public static final class05378<class07438> w = N("hurt_by_entity");
   public static final class05378<class07438> k = N("avoid_target");
   public static final class05378<class07438> Y = N("nearest_hostile");
   public static final class05378<class07438> Q = N("nearest_attackable");
   public static final class05378<class06289> O = N("hiding_place");
   public static final class05378<Long> g = N("heard_bell_time");
   public static final class05378<Long> I = N("cant_reach_walk_target_since");
   public static final class05378<Boolean> J = N("golem_detected_recently", Codec.BOOL);
   public static final class05378<Boolean> o = N("danger_detected_recently", Codec.BOOL);
   public static final class05378<Long> q = N("last_slept", Codec.LONG);
   public static final class05378<Long> K = N("last_woken", Codec.LONG);
   public static final class05378<Long> V = N("last_worked_at_poi", Codec.LONG);
   public static final class05378<class07438> e = N("nearest_visible_adult");
   public static final class05378<class00717> H = N("nearest_visible_wanted_item");
   public static final class05378<class07079> c = N("nearest_visible_nemesis");
   public static final class05378<Integer> X = N("play_dead_ticks", Codec.INT);
   public static final class05378<class08036> a = N("tempting_player");
   public static final class05378<Integer> p = N("temptation_cooldown_ticks", Codec.INT);
   public static final class05378<Integer> F = N("gaze_cooldown_ticks", Codec.INT);
   public static final class05378<Boolean> A = N("is_tempted", Codec.BOOL);
   public static final class05378<Integer> f = N("long_jump_cooling_down", Codec.INT);
   public static final class05378<Boolean> C = N("long_jump_mid_jump");
   public static final class05378<Boolean> S = N("has_hunting_cooldown", Codec.BOOL);
   public static final class05378<Integer> x = N("ram_cooldown_ticks", Codec.INT);
   public static final class05378<class06889> D = N("ram_target");
   public static final class05378<class06244> h = N("is_in_water", class06244.field_51563);
   public static final class05378<class06244> r = N("is_pregnant", class06244.field_51563);
   public static final class05378<Boolean> NN = N("is_panicking", Codec.BOOL);
   public static final class05378<List<UUID>> Ny = N("unreachable_tongue_targets");
   public static final class05378<Set<class06289>> NL = N("visited_block_positions", class06289.y.listOf().xmap(Sets::newHashSet, Lists::newArrayList));
   public static final class05378<Set<class06289>> Nu = N(
      "unreachable_transport_block_positions", class06289.y.listOf().xmap(Sets::newHashSet, Lists::newArrayList)
   );
   public static final class05378<Integer> Ni = N("transport_items_cooldown_ticks");
   public static final class05378<Integer> NR = N("charge_cooldown_ticks", Codec.INT);
   public static final class05378<Integer> NM = N("attack_target_cooldown", Codec.INT);
   public static final class05378<Integer> NB = N("spear_fleeing_time");
   public static final class05378<class06889> NZ = N("spear_fleeing_position");
   public static final class05378<class06889> Nz = N("spear_charge_position");
   public static final class05378<Integer> NU = N("spear_engage_time");
   public static final class05378<class06537> NE = N("spear_status");
   public static final class05378<UUID> NW = N("angry_at", class01487.N);
   public static final class05378<Boolean> Nm = N("universal_anger", Codec.BOOL);
   public static final class05378<Boolean> NP = N("admiring_item", Codec.BOOL);
   public static final class05378<Integer> Ns = N("time_trying_to_reach_admire_item");
   public static final class05378<Boolean> NT = N("disable_walk_to_admire_item");
   public static final class05378<Boolean> Nb = N("admiring_disabled", Codec.BOOL);
   public static final class05378<Boolean> Nj = N("hunted_recently", Codec.BOOL);
   public static final class05378<class07209> Nv = N("celebrate_location");
   public static final class05378<Boolean> Nn = N("dancing");
   public static final class05378<class06018> Nt = N("nearest_visible_huntable_hoglin");
   public static final class05378<class06018> NG = N("nearest_visible_baby_hoglin");
   public static final class05378<class08036> Nl = N("nearest_targetable_player_not_wearing_gold");
   public static final class05378<List<class01238>> Nd = N("nearby_adult_piglins");
   public static final class05378<List<class01238>> Nw = N("nearest_visible_adult_piglins");
   public static final class05378<List<class06018>> Nk = N("nearest_visible_adult_hoglins");
   public static final class05378<class01238> NY = N("nearest_visible_adult_piglin");
   public static final class05378<class07438> NQ = N("nearest_visible_zombified");
   public static final class05378<Integer> NO = N("visible_adult_piglin_count");
   public static final class05378<Integer> Ng = N("visible_adult_hoglin_count");
   public static final class05378<class08036> NI = N("nearest_player_holding_wanted_item");
   public static final class05378<Boolean> NJ = N("ate_recently");
   public static final class05378<class07209> No = N("nearest_repellent");
   public static final class05378<Boolean> Nq = N("pacified");
   public static final class05378<class07438> NK = N("roar_target");
   public static final class05378<class07209> NV = N("disturbance_location");
   public static final class05378<class06244> Ne = N("recent_projectile", class06244.field_51563);
   public static final class05378<class06244> NH = N("is_sniffing", class06244.field_51563);
   public static final class05378<class06244> Nc = N("is_emerging", class06244.field_51563);
   public static final class05378<class06244> NX = N("roar_sound_delay", class06244.field_51563);
   public static final class05378<class06244> Na = N("dig_cooldown", class06244.field_51563);
   public static final class05378<class06244> Np = N("roar_sound_cooldown", class06244.field_51563);
   public static final class05378<class06244> NF = N("sniff_cooldown", class06244.field_51563);
   public static final class05378<class06244> NA = N("touch_cooldown", class06244.field_51563);
   public static final class05378<class06244> Nf = N("vibration_cooldown", class06244.field_51563);
   public static final class05378<class06244> NC = N("sonic_boom_cooldown", class06244.field_51563);
   public static final class05378<class06244> NS = N("sonic_boom_sound_cooldown", class06244.field_51563);
   public static final class05378<class06244> Nx = N("sonic_boom_sound_delay", class06244.field_51563);
   public static final class05378<UUID> ND = N("liked_player", class01487.N);
   public static final class05378<class06289> Nh = N("liked_noteblock", class06289.y);
   public static final class05378<Integer> Nr = N("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final class05378<Integer> yN = N("item_pickup_cooldown_ticks", Codec.INT);
   public static final class05378<List<class06289>> yy = N("sniffer_explored_positions", Codec.list(class06289.y));
   public static final class05378<class07209> yL = N("sniffer_sniffing_target");
   public static final class05378<Boolean> yu = N("sniffer_digging");
   public static final class05378<Boolean> yi = N("sniffer_happy");
   public static final class05378<class06244> yR = N("breeze_jump_cooldown", class06244.field_51563);
   public static final class05378<class06244> yM = N("breeze_shoot", class06244.field_51563);
   public static final class05378<class06244> yB = N("breeze_shoot_charging", class06244.field_51563);
   public static final class05378<class06244> yZ = N("breeze_shoot_recover", class06244.field_51563);
   public static final class05378<class06244> yz = N("breeze_shoot_cooldown", class06244.field_51563);
   public static final class05378<class06244> yU = N("breeze_jump_inhaling", class06244.field_51563);
   public static final class05378<class07209> yE = N("breeze_jump_target", class07209.field_25064);
   public static final class05378<class06244> yW = N("breeze_leaving_water", class06244.field_51563);
   private final Optional<Codec<class01491<U>>> ym;

   public class05378(Optional<Codec<U>> var1) {
      super();
      this.ym = var1.map(class01491::N);
   }

   @Override
   public String toString() {
      return class04206.k.y(this).toString();
   }

   private static <U> class05378<U> N(String var0, Codec<U> var1) {
      return class00751.N(class04206.k, class01894.y(var0), new class05378<>(Optional.of(var1)));
   }

   private static <U> class05378<U> N(String var0) {
      return class00751.N(class04206.k, class01894.y(var0), new class05378<>(Optional.empty()));
   }

   public Optional<Codec<class01491<U>>> N() {
      return this.ym;
   }
}
