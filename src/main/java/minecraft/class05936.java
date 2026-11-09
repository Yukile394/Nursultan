package minecraft;

import Nursultan.class10547;
import Nursultan.class10550;
import Nursultan.class10551;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface class05936 {
   Optional<class06244> L = Optional.of(class06244.field_17274);
   class05936 u = new class05933();

   default String getString() {
      StringBuilder stringbuilder = new StringBuilder();
      this.N_8(var1x -> {
         stringbuilder.append(var1x);
         return Optional.empty();
      });
      return stringbuilder.toString();
   }

   static class05936 N(List<? extends class05936> var0) {
      return new class10550(var0);
   }

   <T> Optional<T> N_8(class05977<T> var1);

   <T> Optional<T> N(class05935<T> var1, class00405 var2);

   static class05936 N(String var0, class00405 var1) {
      return new class10547(var0, var1);
   }

   static class05936 N(class05936... var0) {
      return N(ImmutableList.copyOf(var0));
   }

   static class05936 R(String var0) {
      return new class10551(var0);
   }
}
