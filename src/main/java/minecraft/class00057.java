package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class class00057 implements class00005 {
   private final Map<Either<UUID, String>, class00037> N = new ConcurrentHashMap<>();

   public void L(class00037 var1) {
      this.N.remove(var1.N());
   }

   public class00057() {
      super();
   }

   public void y(class00037 var1) {
      this.N.get(var1.N()).N(var1);
   }

   public void N(class07049 var1, Consumer<class00037> var2) {
      this.N.values().stream().sorted(Comparator.<class00037>comparingDouble(var1x -> var1x.N(var1)).reversed()).forEachOrdered(var2);
   }

   public boolean N() {
      return !this.N.isEmpty();
   }

   public void N(class00037 var1) {
      this.N.put(var1.N(), var1);
   }
}
