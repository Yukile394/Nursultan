package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Map;
import java.util.Optional;

public class class01403 {
   private class00836 N = class00836.L;
   private class02227 y = class02227.N;
   private final Builder<class01419<?>> L = ImmutableList.builder();
   private final Object2BooleanMap<class05946<class06521<?>>> u = new Object2BooleanOpenHashMap();
   private final Map<class01894, class01385> i = Maps.newHashMap();
   private Optional<class00821> R = Optional.empty();
   private Optional<class08697> M = Optional.empty();

   public class01403() {
      super();
   }

   public class01406 y() {
      return new class01406(this.N, this.y, this.L.build(), this.u, this.i, this.R, this.M);
   }

   public class01403 N(class00810 var1) {
      this.R = Optional.of(var1.y());
      return this;
   }

   public class01403 N(class01894 var1, boolean var2) {
      this.i.put(var1, new class01401(var2));
      return this;
   }

   public class01403 N(class01894 var1, Map<String, Boolean> var2) {
      this.i.put(var1, new class01432(new Object2BooleanOpenHashMap(var2)));
      return this;
   }

   public class01403 N(class08697 var1) {
      this.M = Optional.of(var1);
      return this;
   }

   public class01403 N(class02227 var1) {
      this.y = var1;
      return this;
   }

   public class01403 N(class00836 var1) {
      this.N = var1;
      return this;
   }

   public <T> class01403 N(class04922<T> var1, class03529<T> var2, class00836 var3) {
      this.L.add(new class01419<>(var1, var2, var3));
      return this;
   }

   public class01403 N(class05946<class06521<?>> var1, boolean var2) {
      this.u.put(var1, var2);
      return this;
   }

   public static class01403 N() {
      return new class01403();
   }
}
