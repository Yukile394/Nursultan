package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface class00225 {
   Codec<class00225> N = class04206.Ng.T().dispatch(class00225::N, var0 -> var0);
   Codec<class03556<class00225>> y = class01281.N(class04227.yn, N);

   default void y(class04782 var1) {
   }

   static MapCodec<? extends class00225> N(class00751<MapCodec<? extends class00225>> var0) {
      class00751.N(var0, "all_of", class00227.L);
      class00751.N(var0, "game_rules", class00206.L);
      class00751.N(var0, "time_of_day", class00215.L);
      class00751.N(var0, "weather", class00193.L);
      return class00751.N(var0, "function", class00196.L);
   }

   MapCodec<? extends class00225> N();

   void N(class04782 var1);
}
