package minecraft;

import com.mojang.serialization.DataResult.Error;

public record class08333(Error<?> error) implements class04480 {
   public class08333(Error<?> error) {
      this.error = error;
   }

   public Error<?> y() {
      return this.error;
   }

   @Override
   public String N() {
      return "Failed to decode from map: " + this.error.message();
   }
}
