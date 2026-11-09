package minecraft;

import java.util.function.Supplier;

public class class05340<U extends class05355<?>> {
   public static final class05340<class05347> N = N("dummy", class05347::new);
   public static final class05340<class01506> y = N("nearest_items", class01506::new);
   public static final class05340<class05360<class07438>> L = N("nearest_living_entities", class05360::new);
   public static final class05340<class05383> u = N("nearest_players", class05383::new);
   public static final class05340<class06277> i = N("nearest_bed", class06277::new);
   public static final class05340<class05337> R = N("hurt_by", class05337::new);
   public static final class05340<class05376> M = N("villager_hostiles", class05376::new);
   public static final class05340<class06306> B = N("villager_babies", class06306::new);
   public static final class05340<class06281> Z = N("secondary_pois", class06281::new);
   public static final class05340<class05708> z = N("golem_detected", class05708::new);
   public static final class05340<class03841<class03811>> U = N(
      "armadillo_scare_detected", () -> new class03841<>(5, class03811::N, class03811::l, class05378.o, 80)
   );
   public static final class05340<class01509> E = N("piglin_specific_sensor", class01509::new);
   public static final class05340<class01242> W = N("piglin_brute_specific_sensor", class01242::new);
   public static final class05340<class01511> m = N("hoglin_specific_sensor", class01511::new);
   public static final class05340<class01252> P = N("nearest_adult", class01252::new);
   public static final class05340<class01252> s = N("nearest_adult_any_type", class00041::new);
   public static final class05340<class02147> T = N("axolotl_attackables", class02147::new);
   public static final class05340<class05554> b = N("food_temptations", class05554::y);
   public static final class05340<class05554> j = N("frog_temptations", () -> new class05554(class04058.N()));
   public static final class05340<class05554> v = N("nautilus_temptations", () -> new class05554(class08185.y()));
   public static final class05340<class04069> n = N("frog_attackables", class04069::new);
   public static final class05340<class04101> t = N("is_in_water", class04101::new);
   public static final class05340<class03983> G = N("warden_entity_sensor", class03983::new);
   public static final class05340<class04501> l = N("breeze_attack_entity_sensor", class04501::new);
   private final Supplier<U> d;

   public class05340(Supplier<U> var1) {
      super();
      this.d = var1;
   }

   public U N() {
      return this.d.get();
   }

   private static <U extends class05355<?>> class05340<U> N(String var0, Supplier<U> var1) {
      return class00751.N(class04206.Y, class01894.y(var0), new class05340<>(var1));
   }
}
