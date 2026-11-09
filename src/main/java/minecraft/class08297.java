package minecraft;

import com.mojang.serialization.DataResult.Error;

public record class08297(String name, Object value, Error<?> error) implements class04480 {
   public Object L() {
      return this.value;
   }

   public class08297(String name, Object value, Error<?> error) {
      super();
      this.name = name;
      this.value = value;
      this.error = error;
   }

   public Error<?> u() {
      return this.error;
   }

   public String y() {
      return this.name;
   }

   @Override
   public String N() {
      return "Failed to append value '" + this.value + "' to list '" + this.name + "': " + this.error.message();
   }
}
