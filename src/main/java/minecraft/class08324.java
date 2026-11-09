package minecraft;

public record class08324(String name, int index, class01424<?> expected, class01424<?> actual) implements class04480 {
   public int L() {
      return this.index;
   }

   public class08324(String name, int index, class01424<?> expected, class01424<?> actual) {
      this.name = name;
      this.index = index;
      this.expected = expected;
      this.actual = actual;
   }

   public class01424<?> i() {
      return this.actual;
   }

   public class01424<?> u() {
      return this.expected;
   }

   public String y() {
      return this.name;
   }

   @Override
   public String N() {
      return "Expected list '" + this.name + "' to contain at index " + this.index + " value of type " + this.expected.N() + ", but got " + this.actual.N();
   }
}
