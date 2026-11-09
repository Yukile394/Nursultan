package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Optional;
import java.util.Set;

public class class05561 {
   private final class04490 N;
   private final class06929 y;
   private final Optional<class02063> L;
   private final Set<class05946<?>> u;

   public class04490 L() {
      return this.N;
   }

   private class05561(class04490 var1, class06929 var2, Optional<class02063> var3, Set<class05946<?>> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class05561(class04490 var1, class06929 var2) {
      this(var1, var2, Optional.empty(), Set.of());
   }

   public class05561(class04490 var1, class06929 var2, class02063 var3) {
      this(var1, var2, Optional.of(var3), Set.of());
   }

   public boolean y() {
      return this.L.isPresent();
   }

   public boolean N(class05946<?> var1) {
      return this.u.contains(var1);
   }

   public class05561 N(class06929 var1) {
      return new class05561(this.N, var1, this.L, this.u);
   }

   public class05561 N(class04489 var1) {
      return new class05561(this.N.N_46(var1), this.y, this.L, this.u);
   }

   public void N(class04480 var1) {
      this.N.N_47(var1);
   }

   public class02063 N() {
      return this.L.orElseThrow(() -> new UnsupportedOperationException("References not allowed"));
   }

   public void N(class01381 var1) {
      SetView<class07491<?>> setview = Sets.difference(var1.y(), this.y.y());
      if (!setview.isEmpty()) {
         this.N.N_47(new class05542(setview));
      }
   }

   public class05561 N(class04489 var1, class05946<?> var2) {
      ImmutableSet immutableset = ImmutableSet.builder().addAll(this.u).add(var2).build();
      return new class05561(this.N.N_46(var1), this.y, this.L, immutableset);
   }
}
