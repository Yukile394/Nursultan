package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.serialization.v1.view.FabricWriteView;
import net.fabricmc.fabric.mixin.serialization.ValueOutputMixin;
import org.jspecify.annotations.Nullable;

public interface class08329 extends FabricWriteView, ValueOutputMixin {
   void L(String var1);

   class08289 y(String var1);

   <T> void y(String var1, Codec<T> var2, @Nullable T var3);

   void N(String var1, int[] var2);

   void N(String var1, String var2);

   void N(String var1, double var2);

   class08329 N(String var1);

   boolean N();

   <T> class08294<T> N(String var1, Codec<T> var2);

   void N(String var1, byte var2);

   void N(String var1, boolean var2);

   @Deprecated
   <T> void N(MapCodec<T> var1, T var2);

   <T> void N(String var1, Codec<T> var2, T var3);

   void N(String var1, float var2);

   void N(String var1, long var2);

   void N(String var1, int var2);

   void N(String var1, short var2);
}
