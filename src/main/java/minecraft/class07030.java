package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;

public interface class07030 extends class05033 {
   Map<String, class07030> N = new Object2ObjectArrayMap();
   Codec<class07030> y = Codec.stringResolver(class05033::method_15434, N::get);
}
