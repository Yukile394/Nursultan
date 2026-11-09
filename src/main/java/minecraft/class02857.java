package minecraft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface class02857 {
   class02857 L = var0 -> Optional.empty();

   default class01079 L(class01894 var1) throws FileNotFoundException {
      return this.method_14486(var1).orElseThrow(() -> new FileNotFoundException(var1.toString()));
   }

   default BufferedReader i(class01894 var1) throws IOException {
      return this.L(var1).method_43039();
   }

   default InputStream u(class01894 var1) throws IOException {
      return this.L(var1).method_14482();
   }

   static class02857 N(Map<class01894, class01079> var0) {
      return var1 -> Optional.ofNullable((class01079)var0.get(var1));
   }

   Optional<class01079> method_14486(class01894 var1);
}
