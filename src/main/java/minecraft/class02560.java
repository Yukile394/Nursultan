package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface class02560 extends class02548 {
   Codec<class02560> y = class04206.Nv.T().dispatch(class02560::N, Function.identity());

   static MapCodec<? extends class02560> N(class00751<MapCodec<? extends class02560>> var0) {
      class00751.N(var0, "all_of", class02531.N);
      class00751.N(var0, "apply_mob_effect", class02559.N);
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

   @Override
   MapCodec<? extends class02560> N();

   @Override
   default void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5, boolean var6) {
      this.N(var1, var2, var3, var4, var5);
   }

   void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5);
}
