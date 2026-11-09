package minecraft;

public record class08305(String name, class01424<?> expected, class01424<?> actual) implements class04480 {
   public class01424<?> L() {
      return this.expected;
   }

   public class08305(String name, class01424<?> expected, class01424<?> actual) {
      this.name = name;
      this.expected = expected;
      this.actual = actual;
   }

   public class01424<?> u() {
      return this.actual;
   }

   public String y() {
      return this.name;
   }

   @Override
   public String N() {
      return "Expected field '" + this.name + "' to contain value of type " + this.expected.N() + ", but got " + this.actual.N();
   }
}
