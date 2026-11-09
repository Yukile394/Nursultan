package minecraft;

public record class02352<S, T>(class02353<T> name, T value) implements class02315<S> {
   public class02352(class02353<T> name, T value) {
      super();
      this.name = name;
      this.value = (T)value;
   }

   public T y() {
      return this.value;
   }

   public class02353<T> N() {
      return this.name;
   }

   @Override
   public boolean N(class02325<S> var1, class02332 var2, class02328 var3) {
      var2.N(this.name, this.value);
      return true;
   }
}
