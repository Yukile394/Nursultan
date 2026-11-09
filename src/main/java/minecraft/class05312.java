package minecraft;

import com.mojang.serialization.MapCodec;

public class class05312<P extends class05291> {
   public static final class05312<class05314> N = N("straight_trunk_placer", class05314.N);
   public static final class05312<class05326> y = N("forking_trunk_placer", class05326.N);
   public static final class05312<class05039> L = N("giant_trunk_placer", class05039.N);
   public static final class05312<class05069> u = N("mega_jungle_trunk_placer", class05069.M);
   public static final class05312<class05064> i = N("dark_oak_trunk_placer", class05064.N);
   public static final class05312<class05079> R = N("fancy_trunk_placer", class05079.N);
   public static final class05312<class02773> M = N("bending_trunk_placer", class02773.N);
   public static final class05312<class03640> B = N("upwards_branching_trunk_placer", class03640.N);
   public static final class05312<class01939> Z = N("cherry_trunk_placer", class01939.N);
   private final MapCodec<P> z;

   public class05312(MapCodec<P> var1) {
      super();
      this.z = var1;
   }

   private static <P extends class05291> class05312<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.S, var0, new class05312<>(var1));
   }

   public MapCodec<P> N() {
      return this.z;
   }
}
