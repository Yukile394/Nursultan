package minecraft;

import com.mojang.serialization.DataResult.Error;

public record class08298(Object value, Error<?> error) implements class04480 {
   public Error<?> L() {
      return this.error;
   }

   public class08298(Object value, Error<?> error) {
      super();
      this.value = value;
      this.error = error;
   }

   public Object y() {
      return this.value;
   }

   @Override
   public String N() {
      return "Failed to merge value '" + this.value + "' to an object: " + this.error.message();
   }
}
