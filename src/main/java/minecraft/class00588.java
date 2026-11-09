package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public interface class00588 {
   class06750<Boolean> N = N("boolean", class06750.N(Codec.BOOL, class00619.N));
   class06750<class02584> y = N("tri_state", class06750.N(class02584.field_64315));
   class06750<Float> L = N("float", class06750.N(Codec.FLOAT, class00619.y, class00610.N()));
   class06750<Float> u = N("angle_degrees", class06750.N(Codec.FLOAT, class00619.y, class00610.N(), class00610.N(90.0F)));
   class06750<Integer> i = N("rgb_color", class06750.N(class06338.m, class00619.L, class00610.L()));
   class06750<Integer> R = N("argb_color", class06750.N(class06338.P, class00619.u, class00610.L()));
   class06750<class08165> M = N("moon_phase", class06750.N(class08165.field_64378));
   class06750<class05359> B = N("activity", class06750.N(class04206.Q.T()));
   class06750<class00586> Z = N("bed_rule", class06750.N(class00586.L));
   class06750<class07126> z = N("particle", class06750.N(class07107.yE));
   class06750<List<class06024>> U = N("ambient_particles", class06750.N(class06024.N.listOf()));
   class06750<class00621> E = N("background_music", class06750.N(class00621.L));
   class06750<class06731> W = N("ambient_sounds", class06750.N(class06731.L));
   Codec<class06750<?>> m = class04206.NX.T();

   static <Value> class06750<Value> N(String var0, class06750<Value> var1) {
      class00751.N(class04206.NX, class01894.y(var0), var1);
      return var1;
   }

   static class06750<?> N(class00751<class06750<?>> var0) {
      return N;
   }
}
