package minecraft;

import com.mojang.serialization.Codec;

public record class01194(int notificationRadius) {
   public static final class03529<class01194> N = N("block_activate");
   public static final class03529<class01194> y = N("block_attach");
   public static final class03529<class01194> L = N("block_change");
   public static final class03529<class01194> u = N("block_close");
   public static final class03529<class01194> i = N("block_deactivate");
   public static final class03529<class01194> R = N("block_destroy");
   public static final class03529<class01194> M = N("block_detach");
   public static final class03529<class01194> B = N("block_open");
   public static final class03529<class01194> Z = N("block_place");
   public static final class03529<class01194> z = N("container_close");
   public static final class03529<class01194> U = N("container_open");
   public static final class03529<class01194> E = N("drink");
   public static final class03529<class01194> W = N("eat");
   public static final class03529<class01194> m = N("elytra_glide");
   public static final class03529<class01194> P = N("entity_damage");
   public static final class03529<class01194> s = N("entity_die");
   public static final class03529<class01194> T = N("entity_dismount");
   public static final class03529<class01194> b = N("entity_interact");
   public static final class03529<class01194> j = N("entity_mount");
   public static final class03529<class01194> v = N("entity_place");
   public static final class03529<class01194> n = N("entity_action");
   public static final class03529<class01194> t = N("equip");
   public static final class03529<class01194> G = N("explode");
   public static final class03529<class01194> l = N("flap");
   public static final class03529<class01194> d = N("fluid_pickup");
   public static final class03529<class01194> w = N("fluid_place");
   public static final class03529<class01194> k = N("hit_ground");
   public static final class03529<class01194> Y = N("instrument_play");
   public static final class03529<class01194> Q = N("item_interact_finish");
   public static final class03529<class01194> O = N("item_interact_start");
   public static final class03529<class01194> g = N("jukebox_play", 10);
   public static final class03529<class01194> I = N("jukebox_stop_play", 10);
   public static final class03529<class01194> J = N("lightning_strike");
   public static final class03529<class01194> o = N("note_block_play");
   public static final class03529<class01194> q = N("prime_fuse");
   public static final class03529<class01194> K = N("projectile_land");
   public static final class03529<class01194> V = N("projectile_shoot");
   public static final class03529<class01194> e = N("sculk_sensor_tendrils_clicking");
   public static final class03529<class01194> H = N("shear");
   public static final class03529<class01194> c = N("shriek", 32);
   public static final class03529<class01194> X = N("splash");
   public static final class03529<class01194> a = N("step");
   public static final class03529<class01194> p = N("swim");
   public static final class03529<class01194> F = N("teleport");
   public static final class03529<class01194> A = N("unequip");
   public static final class03529<class01194> f = N("resonate_1");
   public static final class03529<class01194> C = N("resonate_2");
   public static final class03529<class01194> S = N("resonate_3");
   public static final class03529<class01194> x = N("resonate_4");
   public static final class03529<class01194> D = N("resonate_5");
   public static final class03529<class01194> h = N("resonate_6");
   public static final class03529<class01194> r = N("resonate_7");
   public static final class03529<class01194> NN = N("resonate_8");
   public static final class03529<class01194> Ny = N("resonate_9");
   public static final class03529<class01194> NL = N("resonate_10");
   public static final class03529<class01194> Nu = N("resonate_11");
   public static final class03529<class01194> Ni = N("resonate_12");
   public static final class03529<class01194> NR = N("resonate_13");
   public static final class03529<class01194> NM = N("resonate_14");
   public static final class03529<class01194> NB = N("resonate_15");
   public static final int NZ = 16;
   public static final Codec<class03556<class01194>> Nz = class03539.N(class04227.c);

   public class01194(int notificationRadius) {
      super();
      this.notificationRadius = notificationRadius;
   }

   private static class03529<class01194> N(String var0, int var1) {
      return class00751.y(class04206.N, class01894.y(var0), new class01194(var1));
   }

   public int N() {
      return this.notificationRadius;
   }

   public static class03556<class01194> N(class00751<class01194> var0) {
      return N;
   }

   private static class03529<class01194> N(String var0) {
      return N(var0, 16);
   }
}
