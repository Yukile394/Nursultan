package minecraft;

import com.mojang.serialization.MapCodec;

public class class01448<P extends class01479> {
   public static final class01448<class01460> N = N("blob_foliage_placer", class01460.N);
   public static final class01448<class01442> y = N("spruce_foliage_placer", class01442.N);
   public static final class01448<class01446> L = N("pine_foliage_placer", class01446.N);
   public static final class01448<class01468> u = N("acacia_foliage_placer", class01468.N);
   public static final class01448<class05047> i = N("bush_foliage_placer", class05047.R);
   public static final class01448<class05080> R = N("fancy_foliage_placer", class05080.R);
   public static final class01448<class05048> M = N("jungle_foliage_placer", class05048.N);
   public static final class01448<class05061> B = N("mega_pine_foliage_placer", class05061.N);
   public static final class01448<class05078> Z = N("dark_oak_foliage_placer", class05078.N);
   public static final class01448<class02257> z = N("random_spread_foliage_placer", class02257.N);
   public static final class01448<class01978> U = N("cherry_foliage_placer", class01978.N);
   private final MapCodec<P> E;

   public class01448(MapCodec<P> var1) {
      super();
      this.E = var1;
   }

   private static <P extends class01479> class01448<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.C, var0, new class01448<>(var1));
   }

   public MapCodec<P> N() {
      return this.E;
   }
}
