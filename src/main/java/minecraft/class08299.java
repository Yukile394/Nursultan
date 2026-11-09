package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import net.fabricmc.fabric.api.serialization.v1.view.FabricReadView;
import net.fabricmc.fabric.mixin.serialization.ValueInputMixin;

public interface class08299 extends FabricReadView, ValueInputMixin {
   Optional<class08319> L(String var1);

   <T> class08310<T> L(String var1, Codec<T> var2);

   Optional<String> M(String var1);

   Optional<int[]> B(String var1);

   Optional<Integer> i(String var1);

   class08319 u(String var1);

   <T> Optional<class08310<T>> y(String var1, Codec<T> var2);

   class08299 y(String var1);

   float N(String var1, float var2);

   long N(String var1, long var2);

   double N(String var1, double var2);

   @Deprecated
   class01929 N();

   String N(String var1, String var2);

   boolean N(String var1, boolean var2);

   Optional<class08299> N(String var1);

   @Deprecated
   <T> Optional<T> N(MapCodec<T> var1);

   <T> Optional<T> N(String var1, Codec<T> var2);

   int N(String var1, int var2);

   int N(String var1, short var2);

   byte N(String var1, byte var2);

   Optional<Long> R(String var1);
}
