package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public interface class00949 {
   Codec<class00949> N = class01894.N
      .flatComapMap(
         class00913::new,
         var0 -> var0 instanceof class00913 ? DataResult.success(((class00913)var0).N()) : DataResult.error(() -> "Unsupported font description type: " + var0)
      );
   class00913 y = new class00913(class01894.y("default"));
}
