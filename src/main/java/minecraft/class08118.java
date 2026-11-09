package minecraft;

import com.google.common.collect.ImmutableMap.Builder;
import java.util.function.Function;

public record class08118<T>(T head, T chest, T legs, T feet) {
   public T L() {
      return this.legs;
   }

   public class08118(T head, T chest, T legs, T feet) {
      super();
      this.head = (T)head;
      this.chest = (T)chest;
      this.legs = (T)legs;
      this.feet = (T)feet;
   }

   public T u() {
      return this.feet;
   }

   public T y() {
      return this.chest;
   }

   public T N(class07085 var1) {
      return (T)(switch (var1) {
         case field_6169 -> (Object)this.head;
         case field_6174 -> (Object)this.chest;
         case field_6172 -> (Object)this.legs;
         case field_6166 -> (Object)this.feet;
         default -> throw new IllegalStateException("No model for slot: " + var1);
      });
   }

   public static <M extends class01188<?>> class08118<M> N(class08118<class01134> var0, class01140 var1, Function<class01686, M> var2) {
      return var0.N(var2x -> (M)var2.apply(var1.N(var2x)));
   }

   public T N() {
      return this.head;
   }

   public <U> class08118<U> N(Function<? super T, ? extends U> var1) {
      return (class08118<U>)(new class08118<>(var1.apply(this.head), var1.apply(this.chest), var1.apply(this.legs), var1.apply(this.feet)));
   }

   public void N(class08118<class04806> var1, Builder<T, class04806> var2) {
      var2.put(this.head, (class04806)var1.head);
      var2.put(this.chest, (class04806)var1.chest);
      var2.put(this.legs, (class04806)var1.legs);
      var2.put(this.feet, (class04806)var1.feet);
   }
}
