package minecraft;

import org.jspecify.annotations.Nullable;

public record class01040(String logPath, class01276 variant) {
   public class01276 L() {
      return this.variant;
   }

   public class01040(@Nullable String logPath, class01276 variant) {
      super();
      this.logPath = logPath;
      this.variant = variant;
   }

   @Nullable
   public String y() {
      return this.logPath;
   }

   public boolean N() {
      return this.variant.N();
   }
}
