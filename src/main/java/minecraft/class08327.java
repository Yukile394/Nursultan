package minecraft;

import com.mojang.serialization.DataResult.Error;

public record class08327(String name, int index, class07709 tag, Error<?> error) implements class04480 {
   public int L() {
      return this.index;
   }

   public class08327(String name, int index, class07709 tag, Error<?> error) {
      this.name = name;
      this.index = index;
      this.tag = tag;
      this.error = error;
   }

   public Error<?> i() {
      return this.error;
   }

   public class07709 u() {
      return this.tag;
   }

   public String y() {
      return this.name;
   }

   @Override
   public String N() {
      return "Failed to decode value '" + this.tag + "' from field '" + this.name + "' at index " + this.index + "': " + this.error.message();
   }
}
