package minecraft;

import java.util.Optional;

public record class01725(String text) implements class01751 {
   public class01725(String text) {
      super();
      this.text = text;
   }

   @Override
   public String toString() {
      return "literal{" + this.text + "}";
   }

   @Override
   public String comp_737() {
      return this.text;
   }

   @Override
   public <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      return var1.accept(var2, this.text);
   }

   @Override
   public <T> Optional<T> method_27659(class05977<T> var1) {
      return var1.accept(this.text);
   }
}
