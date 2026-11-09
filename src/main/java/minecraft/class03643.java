package minecraft;

import Nursultan.class10082;
import Nursultan.class10219;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface class03643 {
   class03643 N = new class03634();
   class03652<class03643> y = () -> N;

   default <T> Optional<class10082<T>> y(class02968<T> var1) {
      return this.<T>N(var1).map(var1::N);
   }

   static class03643 N(InputStream var0) throws IOException {
      class10219 class10219;
      try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(var0, StandardCharsets.UTF_8))) {
         JsonObject jsonobject = class05001.N(bufferedreader);
         class10219 = new class10219(jsonobject);
      }

      return class10219;
   }

   default List<class10082<?>> N(Collection<class02968<?>> var1) {
      return var1.stream().map(this::y).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   <T> Optional<T> N(class02968<T> var1);
}
