package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public record class06068(String raw, class03055 mask) {
   public static final class06068 N = N("");

   public boolean L() {
      return !this.mask.N();
   }

   public class06068(String raw, class03055 mask) {
      super();
      this.raw = raw;
      this.mask = mask;
   }

   public class03055 i() {
      return this.mask;
   }

   public String u() {
      return this.raw;
   }

   public static class06068 y(String var0) {
      return new class06068(var0, class03055.y);
   }

   public String y() {
      return Objects.requireNonNullElse(this.N(), "");
   }

   @Nullable
   public String N() {
      return this.mask.N(this.raw);
   }

   public static class06068 N(String var0) {
      return new class06068(var0, class03055.L);
   }
}
