package minecraft;

import org.jspecify.annotations.Nullable;

public record class05037(class06478 widget, class04370<?> optionInstance) {

   public class05037(class06478 var1) {
      this(var1, null);
   }

   public class05037(class06478 widget, @Nullable class04370<?> optionInstance) {
      this.widget = widget;
      this.optionInstance = optionInstance;
   }

   @Nullable
   public class04370<?> y() {
      return this.optionInstance;
   }

   public class06478 N() {
      return this.widget;
   }
}
