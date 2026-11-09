package minecraft;

import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

record class03680(class06366<Boolean> button, BooleanSupplier stateSupplier, BooleanSupplier isActiveCondition) {
   public BooleanSupplier L() {
      return this.stateSupplier;
   }

   class03680(class06366<Boolean> button, BooleanSupplier stateSupplier, @Nullable BooleanSupplier isActiveCondition) {
      this.button = button;
      this.stateSupplier = stateSupplier;
      this.isActiveCondition = isActiveCondition;
   }

   @Nullable
   public BooleanSupplier u() {
      return this.isActiveCondition;
   }

   public class06366<Boolean> y() {
      return this.button;
   }

   public void N() {
      this.button.N(Boolean.valueOf(this.stateSupplier.getAsBoolean()));
      if (this.isActiveCondition != null) {
         this.button.field_22763 = this.isActiveCondition.getAsBoolean();
      }
   }
}
