package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public record class08525(class08509 operation, List<class01975> terms) implements class01975 {
   public class08525(class08509 operation, List<class01975> terms) {
      super();
      this.operation = operation;
      this.terms = terms;
   }

   public List<class01975> y() {
      return this.terms;
   }

   public class08509 N() {
      return this.operation;
   }

   @Override
   public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> var1) {
      return this.operation.N(Lists.transform(this.terms, var1x -> var1x.N(var1)));
   }
}
