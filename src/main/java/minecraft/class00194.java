package minecraft;

import java.util.Map;
import java.util.function.Consumer;

public record class00194(Map<class01894, class00195<class05946<class00225>>> tests, class05946<Consumer<class05523>> functionKey, Consumer<class05523> function) {
   public Consumer<class05523> L() {
      return this.function;
   }

   public class00194(Map<class01894, class00195<class05946<class00225>>> var1, class01894 var2, Consumer<class05523> var3) {
      this(var1, class05946.N(class04227.NJ, var2), var3);
   }

   public class00194(Map<class01894, class00195<class05946<class00225>>> tests, class05946<Consumer<class05523>> functionKey, Consumer<class05523> function) {
      super();
      this.tests = tests;
      this.functionKey = functionKey;
      this.function = function;
   }

   public class00194(class01894 var1, class00195<class05946<class00225>> var2, Consumer<class05523> var3) {
      this(Map.of(var1, var2), var1, var3);
   }

   public class05946<Consumer<class05523>> y() {
      return this.functionKey;
   }

   public Map<class01894, class00195<class05946<class00225>>> N() {
      return this.tests;
   }
}
