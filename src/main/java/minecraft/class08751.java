package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public record class08751(class00647 value) implements class08752 {
   public static final Map<class00654, MapCodec<class08751>> N = class07536.N(() -> {
      EnumMap enummap = new EnumMap<>(class00654.class);

      for (class00654 class00654 : class00654.class.getEnumConstants()) {
         if (class00654.N()) {
            MapCodec mapcodec = class00654.y();
            enummap.put(class00654, mapcodec.xmap(class08751::new, class08751::y));
         }
      }

      return Collections.unmodifiableMap(enummap);
   });

   public class08751(class00647 value) {
      this.value = value;
   }

   public class00647 y() {
      return this.value;
   }

   @Override
   public MapCodec<class08751> N() {
      return N.get(this.value.N());
   }

   @Override
   public Optional<class00647> N(Map<String, class08737> var1) {
      return Optional.of(this.value);
   }
}
