package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public record class05390(List<class08084<?>> values) {
   public static final class05390 N = new class05390(List.of());
   private static final Comparator<class08084<?>> L = Comparator.comparing(var0 -> var0.N().R());

   public class05390(List<class08084<?>> values) {
      this.values = values;
   }

   @Override
   public String toString() {
      return this.N();
   }

   public List<class08084<?>> y() {
      return this.values;
   }

   public class05390 N(class05390 var1) {
      return new class05390(ImmutableList.builder().addAll(this.values).addAll(var1.values).build());
   }

   public class05390 N(class08084<?> var1) {
      return new class05390(class07536.N(this.values, var1));
   }

   public static class05390 N(class08084<?>... var0) {
      return new class05390(List.of(var0));
   }

   public String N() {
      return this.values.stream().sorted(L).map(class08084::toString).collect(Collectors.joining(","));
   }
}
