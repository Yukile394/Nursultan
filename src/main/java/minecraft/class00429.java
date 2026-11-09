package minecraft;

import java.util.List;

public class class00429<T> {
   public static final class00455<?> N = N("dedicated_server_tick_time");
   public static final class00455<class00433> y = N("bees", class00433.N);
   public static final class00455<class00434> L = N("brains", class00434.N);
   public static final class00455<class00464> u = N("breezes", class00464.N);
   public static final class00455<class00432> i = N("goal_selectors", class00432.N);
   public static final class00455<class00450> R = N("entity_paths", class00450.N);
   public static final class00455<class00466> M = N("entity_block_intersections", class00466.field_62850, 100);
   public static final class00455<class00447> B = N("bee_hives", class00447.N);
   public static final class00455<class00465> Z = N("pois", class00465.N);
   public static final class00455<class02733> z = N("redstone_wire_orientations", class02733.N, 200);
   public static final class00455<class06244> U = N("village_sections", class06244.field_55626);
   public static final class00455<List<class07209>> E = N("raids", class07209.field_48404.N_33(class02389.N()));
   public static final class00455<List<class00431>> W = N("structures", class00431.N.N_33(class02389.N()));
   public static final class00455<class00454> m = N("game_event_listeners", class00454.N);
   public static final class00455<class07209> P = N("neighbor_updates", class07209.field_48404, 200);
   public static final class00455<class00435> s = N("game_events", class00435.N, 60);

   public class00429() {
      super();
   }

   private static <T> class00455<T> N(String var0, class02362<? super class04247, T> var1) {
      return class00751.N(class04206.R, class01894.y(var0), new class00455<>(var1));
   }

   private static <T> class00455<T> N(String var0, class02362<? super class04247, T> var1, int var2) {
      return class00751.N(class04206.R, class01894.y(var0), new class00455<>(var1, var2));
   }

   public static class00455<?> N(class00751<class00455<?>> var0) {
      return N;
   }

   private static class00455<?> N(String var0) {
      return class00751.N(class04206.R, class01894.y(var0), new class00455(null));
   }
}
