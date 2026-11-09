package minecraft;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class08077 implements class00381<class07280> {
   public static final class02362<class04247, class08077> N = class00381.N(class08077::N, class08077::new);
   private final boolean y;
   private final List<class03711> L;
   private final Set<class01894> u;
   private final Map<class01894, class08019> i;
   private final boolean R;

   public Map<class01894, class08019> L() {
      return this.i;
   }

   public boolean M() {
      return this.R;
   }

   public class08077(boolean var1, Collection<class03711> var2, Set<class01894> var3, Map<class01894, class08019> var4, boolean var5) {
      super();
      this.y = var1;
      this.L = List.copyOf(var2);
      this.u = Set.copyOf(var3);
      this.i = Map.copyOf(var4);
      this.R = var5;
   }

   private class08077(class04247 var1) {
      super();
      this.y = var1.readBoolean();
      this.L = class03711.y.decode(var1);
      this.u = var1.N_15(Sets::newLinkedHashSetWithExpectedSize, class00667::T);
      this.i = var1.N_17(class00667::T, class08019::y);
      this.R = var1.readBoolean();
   }

   public boolean u() {
      return this.y;
   }

   public Set<class01894> y() {
      return this.u;
   }

   private void N(class04247 var1) {
      var1.writeBoolean(this.y);
      class03711.y.encode(var1, this.L);
      var1.N_12(this.u, class00667::N);
      var1.N(this.i, class00667::N, (var0, var1x) -> var1x.N(var0));
      var1.writeBoolean(this.R);
   }

   public List<class03711> N() {
      return this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08077> method_65080() {
      return class04248.yU;
   }
}
