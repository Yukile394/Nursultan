package minecraft;

import java.util.function.Predicate;

record class06800(class06798 modifier, Predicate<class06790> canUse, class00392 description) {

   public class00392 L() {
      return this.description;
   }

   class06800(class06798 modifier, Predicate<class06790> canUse, class00392 description) {
      super();
      this.modifier = modifier;
      this.canUse = canUse;
      this.description = description;
   }

   public Predicate<class06790> y() {
      return this.canUse;
   }

   public class06798 N() {
      return this.modifier;
   }
}
