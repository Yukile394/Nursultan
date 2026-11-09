package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public record class01772(String owner, int value, class00392 display, class01762 numberFormatOverride) {
   public String L() {
      return this.owner;
   }

   public class01772(String owner, int value, @Nullable class00392 display, @Nullable class01762 numberFormatOverride) {
      super();
      this.owner = owner;
      this.value = value;
      this.display = display;
      this.numberFormatOverride = numberFormatOverride;
   }

   @Nullable
   public class00392 i() {
      return this.display;
   }

   public int u() {
      return this.value;
   }

   public class00392 y() {
      return (class00392)(this.display != null ? this.display : class00392.y(this.L()));
   }

   public class05216 N(class01762 var1) {
      return Objects.requireNonNullElse(this.numberFormatOverride, var1).N(this.value);
   }

   public boolean N() {
      return this.owner.startsWith("#");
   }

   @Nullable
   public class01762 R() {
      return this.numberFormatOverride;
   }
}
