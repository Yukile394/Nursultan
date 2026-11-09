package minecraft;

public record class08313(String name, class01424<?> actual) implements class04480 {
   public class01424<?> L() {
      return this.actual;
   }

   public class08313(String name, class01424<?> actual) {
      super();
      this.name = name;
      this.actual = actual;
   }

   public String y() {
      return this.name;
   }

   @Override
   public String N() {
      return "Expected field '" + this.name + "' to contain number, but got " + this.actual.N();
   }
}
