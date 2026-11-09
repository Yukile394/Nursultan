package minecraft;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

class class01691 implements class08957 {
   private final Set<class08774> N = new HashSet<>();

   class01691() {
      super();
   }

   @Override
   public void N() {
   }

   @Override
   public void N(class08774 var1) {
      this.N.add(var1);
   }

   @Override
   public Optional<class08774> N(String var1) {
      return this.N.stream().filter(var1x -> var1x.y().equals(var1)).findFirst().or(() -> Optional.of(class08774.N(var1)));
   }

   @Override
   public Optional<class08774> N(UUID var1) {
      return this.N.stream().filter(var1x -> var1x.N().equals(var1)).findFirst();
   }

   @Override
   public void N(boolean var1) {
   }
}
