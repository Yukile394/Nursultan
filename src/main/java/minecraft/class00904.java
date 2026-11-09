package minecraft;

import java.util.Map;
import org.jspecify.annotations.Nullable;

public record class00904(class00500 blockState, Map<class08092<?>, Comparable<?>> properties, class07001 nbt) {
   @Nullable
   public class07001 L() {
      return this.nbt;
   }

   public class00904(class00500 blockState, Map<class08092<?>, Comparable<?>> properties, @Nullable class07001 nbt) {
      this.blockState = blockState;
      this.properties = properties;
      this.nbt = nbt;
   }

   public Map<class08092<?>, Comparable<?>> y() {
      return this.properties;
   }

   public class00500 N() {
      return this.blockState;
   }
}
