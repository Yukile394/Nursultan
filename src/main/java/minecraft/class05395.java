package minecraft;

import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class class05395 {
   private final class00891 N;

   public class05395(class00891 var1) {
      super();
      this.N = var1;
   }

   public class05427 N(class05415<class03264> var1) {
      Set<class08092<?>> set = class05427.N(Set.of(), this.N, var1);
      List list = var1.N().entrySet().stream().map(var0 -> new class05406((class05390)var0.getKey(), (class03264)var0.getValue())).toList();
      return new class05427(this.N, list, set);
   }
}
