package minecraft;

import com.mojang.serialization.DataResult.Error;

public record class08335(String name, class07709 tag, Error<?> error) implements class04480 {
   public class07709 L() {
      return this.tag;
   }

   public class08335(String name, class07709 tag, Error<?> error) {
      this.name = name;
      this.tag = tag;
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
      return "Failed to decode value '" + this.tag + "' from field '" + this.name + "': " + this.error.message();
   }
}
