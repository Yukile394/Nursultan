package minecraft;

import org.jspecify.annotations.Nullable;

public record class01268(String worldId) implements class01276 {
   public class01268(@Nullable String worldId) {
      this.worldId = worldId;
   }

   @Nullable
   public String y() {
      return this.worldId;
   }

   @Override
   public boolean N() {
      return true;
   }
}
