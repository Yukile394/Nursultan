package minecraft;

import com.mojang.serialization.MapCodec;

public class class05930<P extends class01474> {
   public static final class05930<class05892> N = N("trunk_vine", class05892.N);
   public static final class05930<class01464> y = N("leave_vine", class01464.N);
   public static final class05930<class00306> L = N("pale_moss", class00306.N);
   public static final class05930<class00317> u = N("creaking_heart", class00317.N);
   public static final class05930<class01436> i = N("cocoa", class01436.N);
   public static final class05930<class01459> R = N("beehive", class01459.N);
   public static final class05930<class01440> M = N("alter_ground", class01440.N);
   public static final class05930<class03614> B = N("attached_to_leaves", class03614.N);
   public static final class05930<class08631> Z = N("place_on_ground", class08631.N);
   public static final class05930<class08492> z = N("attached_to_logs", class08492.N);
   private final MapCodec<P> U;

   public class05930(MapCodec<P> var1) {
      super();
      this.U = var1;
   }

   private static <P extends class01474> class05930<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.D, var0, new class05930<>(var1));
   }

   public MapCodec<P> N() {
      return this.U;
   }
}
