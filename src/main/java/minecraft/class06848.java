package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public interface class06848 {
   Codec<class06834> N = class04206.Na.T().dispatch(class06834::N, var0 -> var0);
   Codec<class06834> y = Codec.lazyInitialized(() -> Codec.withAlternative(N, class06847.L));

   static MapCodec<? extends class06834> N(class00751<MapCodec<? extends class06834>> var0) {
      class00751.N(var0, "group", class06847.y);
      class00751.N(var0, "filtered", class06817.N);
      class00751.N(var0, "limit_slots", class06849.N);
      class00751.N(var0, "slot_range", class06829.N);
      class00751.N(var0, "contents", class06840.N);
      return class00751.N(var0, "empty", class06816.N);
   }

   static Function<class05908, class06838> N(Collection<? extends class06834> var0) {
      List list = List.copyOf(var0);

      return switch (list.size()) {
         case 0 -> var0x -> class06838.N;
         case 1 -> ((class06834)list.getFirst())::N;
         case 2 -> {
            class06834 class06834x = (class06834)list.get(0);
            class06834 class06834 = (class06834)list.get(1);
            yield var2x -> class06838.N(class06834x.N(var2x), class06834.N(var2x));
         }
         default -> var1x -> {
            ArrayList arraylist = new ArrayList();

            for (class06834 class06834xx : list) {
               arraylist.add(class06834xx.N(var1x));
            }

            return class06838.N_64(arraylist);
         };
      };
   }
}
