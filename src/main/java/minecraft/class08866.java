package minecraft;

import java.util.function.Predicate;

public record class08866<T>(Predicate<class00500> condition, T model) {

   public class08866(Predicate<class00500> condition, T model) {
      this.condition = condition;
      this.model = (T)model;
   }

   public T y() {
      return this.model;
   }

   public Predicate<class00500> N() {
      return this.condition;
   }

   public <S> class08866<S> N(S var1) {
      return (class08866<S>)(new class08866<>(this.condition, var1));
   }
}
