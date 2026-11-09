package minecraft;

import java.util.Optional;

public record class07248(String text, Optional<class00392> tooltip) {
   public static final class02362<class04247, class07248> N = class02362.N(class02389.s, class07248::N, class03748.i, class07248::y, class07248::new);

   public class07248(String text, Optional<class00392> tooltip) {
      super();
      this.text = text;
      this.tooltip = tooltip;
   }

   public Optional<class00392> y() {
      return this.tooltip;
   }

   public String N() {
      return this.text;
   }
}
