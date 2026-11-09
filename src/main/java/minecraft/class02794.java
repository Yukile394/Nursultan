package minecraft;

import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class02794(UUID id, String url, String hash, boolean isRequired, class00392 prompt) {
   public String L() {
      return this.hash;
   }

   public class02794(UUID id, String url, String hash, boolean isRequired, @Nullable class00392 prompt) {
      super();
      this.id = id;
      this.url = url;
      this.hash = hash;
      this.isRequired = isRequired;
      this.prompt = prompt;
   }

   @Nullable
   public class00392 i() {
      return this.prompt;
   }

   public boolean u() {
      return this.isRequired;
   }

   public String y() {
      return this.url;
   }

   public UUID N() {
      return this.id;
   }
}
