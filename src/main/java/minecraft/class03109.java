package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class class03109 {
   public class03109() {
      super();
   }

   public static void N(class04116<class05281> var0, class03556<class05281> var1, List<class03129> var2) {
      var2.stream()
         .flatMap(class03129::N)
         .map(var0x -> var0x.N().N())
         .forEach(var2x -> class01019.N(var0, var2x, new class05281(var1, List.of(Pair.of(class05248.y(var2x), 1)), class05246.field_16687)));
   }

   public static MapCodec<? extends class03129> N(class00751<MapCodec<? extends class03129>> var0) {
      class00751.N(var0, "random", class03120.N);
      class00751.N(var0, "random_group", class03146.N);
      return class00751.N(var0, "direct", class03141.N);
   }
}
