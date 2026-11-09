package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface class02548 {
   Codec<class02548> L = class04206.Nn.T().dispatch(class02548::N, Function.identity());

   static MapCodec<? extends class02548> y(class00751<MapCodec<? extends class02548>> var0) {
      class00751.N(var0, "all_of", class02539.N);
      class00751.N(var0, "apply_mob_effect", class02559.N);
      class00751.N(var0, "attribute", class02541.N);
      class00751.N(var0, "change_item_damage", class02518.N);
      class00751.N(var0, "damage_entity", class02551.N);
      class00751.N(var0, "explode", class02528.N);
      class00751.N(var0, "ignite", class02526.N);
      class00751.N(var0, "apply_impulse", class08148.N);
      class00751.N(var0, "apply_exhaustion", class06825.N);
      class00751.N(var0, "play_sound", class02520.N);
      class00751.N(var0, "replace_block", class02552.N);
      class00751.N(var0, "replace_disk", class02522.N);
      class00751.N(var0, "run_function", class02533.N);
      class00751.N(var0, "set_block_properties", class02542.N);
      class00751.N(var0, "spawn_particles", class02540.N);
      return class00751.N(var0, "summon_entity", class02513.N);
   }

   void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5, boolean var6);

   MapCodec<? extends class02548> N();

   default void N(class02525 var1, class07049 var2, class06889 var3, int var4) {
   }
}
