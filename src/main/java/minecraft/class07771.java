package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

public record class07771(int start, int end, class06794 selector) {
   public class06794 L() {
      return this.selector;
   }

   public class07771(int start, int end, class06794 selector) {
      this.start = start;
      this.end = end;
      this.selector = selector;
   }

   public int y() {
      return this.end;
   }

   public int N() {
      return this.start;
   }

   public class00392 N(class07701 var1) throws CommandSyntaxException {
      return class06794.N(this.selector.y(var1));
   }
}
