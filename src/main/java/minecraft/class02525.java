package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public record class02525(class06584 itemStack, class07085 inSlot, class07438 owner, Consumer<class06581> onBreak) {
   @Nullable
   public class07438 L() {
      return this.owner;
   }

   public class02525(class06584 var1, class07085 var2, class07438 var3) {
      this(var1, var2, var3, var2x -> var3.method_20235(var2x, var2));
   }

   public class02525(class06584 itemStack, @Nullable class07085 inSlot, @Nullable class07438 owner, Consumer<class06581> onBreak) {
      this.itemStack = itemStack;
      this.inSlot = inSlot;
      this.owner = owner;
      this.onBreak = onBreak;
   }

   public Consumer<class06581> u() {
      return this.onBreak;
   }

   @Nullable
   public class07085 y() {
      return this.inSlot;
   }

   public class06584 N() {
      return this.itemStack;
   }
}
