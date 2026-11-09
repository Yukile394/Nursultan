package minecraft;

import com.mojang.authlib.properties.Property;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class08550(UUID profileId, Property packedTextures) {

   public class08550(UUID profileId, @Nullable Property packedTextures) {
      super();
      this.profileId = profileId;
      this.packedTextures = packedTextures;
   }

   @Nullable
   public Property y() {
      return this.packedTextures;
   }

   public UUID N() {
      return this.profileId;
   }
}
