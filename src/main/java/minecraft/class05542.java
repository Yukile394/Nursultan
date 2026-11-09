package minecraft;

import java.util.Set;

public record class05542(Set<class07491<?>> notProvided) implements class04480 {
   public class05542(Set<class07491<?>> notProvided) {
      super();
      this.notProvided = notProvided;
   }

   public Set<class07491<?>> y() {
      return this.notProvided;
   }

   @Override
   public String N() {
      return "Parameters " + this.notProvided + " are not provided in this context";
   }
}
